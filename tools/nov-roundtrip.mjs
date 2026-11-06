#!/usr/bin/env node
/**
 * Validate and round-trip a `.nov` file through the reconstructed model.
 *
 *   node tools/nov-roundtrip.mjs [path/to/project.nov] [--write out.nov]
 *
 * Exits non-zero when the file cannot be imported or when a round trip loses
 * scenes, sections, categories or scene text.
 */

import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

import {
  currentRevision,
  normalizeProject,
  orderedScenes,
  projectStats,
  toNovFile,
  wordCount,
} from '../shared/nov-model.js';

const here = path.dirname(fileURLToPath(import.meta.url));
const args = process.argv.slice(2);
const writeIndex = args.indexOf('--write');
const writeTo = writeIndex >= 0 ? args[writeIndex + 1] : null;
const input = args.find((a, i) => !a.startsWith('--') && i !== writeIndex + 1) ?? path.join(here, '..', 'test', 'fixtures', 'sample.nov');

function fail(message) {
  console.error(`✖ ${message}`);
  process.exitCode = 1;
}

let raw;
try {
  raw = JSON.parse(fs.readFileSync(input, 'utf8'));
} catch (error) {
  fail(`cannot read ${input}: ${error.message}`);
  process.exit();
}

console.log(`Reading ${input}`);
console.log(`  format version : ${raw.version ?? '(missing)'}`);
console.log(`  title          : ${raw.title ?? '(untitled)'}`);
console.log(`  revisions      : ${Array.isArray(raw.revisions) ? raw.revisions.length : 0}`);

let project;
try {
  project = normalizeProject(raw);
} catch (error) {
  fail(`import failed: ${error.message}`);
  process.exit();
}

const rev = currentRevision(project);
const stats = projectStats(project);
console.log('\nImported structure');
console.log(`  scenes         : ${rev.scenes.length}`);
console.log(`  sections       : ${rev.sections.length}`);
console.log(`  categories     : ${rev.categories.length}`);
console.log(`  items          : ${stats.items}`);
console.log(`  statuses       : ${rev.statuses.length}`);
console.log(`  subplots       : ${rev.subplots.length}`);
console.log(`  words          : ${stats.words}`);
console.log(`  progress days  : ${rev.book_progresses.length}`);

const ordered = orderedScenes(rev);
console.log(`  ordered scenes : ${ordered.length}`);

let problems = 0;
const seen = new Set();
for (const { scene } of ordered) {
  if (seen.has(scene.code)) {
    fail(`scene ${scene.code} appears more than once in reading order`);
    problems += 1;
  }
  seen.add(scene.code);
}
if (ordered.length !== rev.scenes.length) {
  fail(`${rev.scenes.length - ordered.length} scene(s) are unreachable from any section`);
  problems += 1;
}

const sectionCodes = new Set(rev.sections.map((s) => s.code));
const sceneCodes = new Set(rev.scenes.map((s) => s.code));
const itemCodes = new Set(rev.categories.flatMap((c) => c.items.map((i) => i.code)));
for (const section of rev.sections) {
  for (const link of section.section_scenes) {
    if (!sceneCodes.has(link.code)) {
      fail(`section ${section.code} references unknown scene ${link.code}`);
      problems += 1;
    }
  }
}
for (const scene of rev.scenes) {
  for (const link of scene.scene_items) {
    if (!itemCodes.has(link.code)) {
      fail(`scene ${scene.code} references unknown item ${link.code}`);
      problems += 1;
    }
  }
  for (const link of scene.scene_subplots) {
    if (!(rev.subplots ?? []).some((s) => s.code === link.subplot)) {
      fail(`scene ${scene.code} references unknown subplot ${link.subplot}`);
      problems += 1;
    }
  }
}
void sectionCodes;

const serialized = toNovFile(project);
const reparsed = normalizeProject(JSON.parse(serialized));

const before = currentRevision(project);
const after = currentRevision(reparsed);
const sameScenes =
  before.scenes.length === after.scenes.length &&
  before.scenes.every((scene, i) => {
    const other = after.scenes[i];
    return scene.code === other.code && scene.title === other.title && wordCount(scene.text) === wordCount(other.text);
  });
const sameSections =
  before.sections.length === after.sections.length &&
  before.sections.every((section, i) => {
    const other = after.sections[i];
    return (
      section.code === other.code &&
      section.section_scenes.length === other.section_scenes.length &&
      section.section_scenes.every((link, j) => link.code === other.section_scenes[j].code)
    );
  });
const sameCategories =
  before.categories.length === after.categories.length &&
  before.categories.every((category, i) => {
    const other = after.categories[i];
    return (
      category.code === other.code &&
      category.items.length === other.items.length &&
      category.items.every((item, j) => item.code === other.items[j].code)
    );
  });

console.log('\nRound trip (.nov -> model -> .nov -> model)');
console.log(`  scenes         : ${sameScenes ? 'ok' : 'MISMATCH'}`);
console.log(`  sections       : ${sameSections ? 'ok' : 'MISMATCH'}`);
console.log(`  categories     : ${sameCategories ? 'ok' : 'MISMATCH'}`);
console.log(`  output size    : ${(serialized.length / 1024).toFixed(1)} KiB (input ${(fs.statSync(input).size / 1024).toFixed(1)} KiB)`);
if (!sameScenes) fail('scene data changed across a round trip');
if (!sameSections) fail('section data changed across a round trip');
if (!sameCategories) fail('category data changed across a round trip');

if (writeTo) {
  fs.writeFileSync(writeTo, serialized);
  console.log(`\nWrote ${writeTo}`);
}

if (!problems && sameScenes && sameSections && sameCategories) {
  console.log('\n✔ File is structurally valid and round-trips without data loss.');
} else {
  console.log(`\n✖ ${problems} structural problem(s) found.`);
}
