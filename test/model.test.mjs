import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

import {
  compileHtml,
  compileMarkdown,
  compileText,
  createProject,
  currentRevision,
  normalizeProject,
  orderedScenes,
  projectStats,
  searchProject,
  toNovFile,
  wordCount,
} from '../shared/nov-model.js';

const here = path.dirname(fileURLToPath(import.meta.url));
const sample = JSON.parse(fs.readFileSync(path.join(here, 'fixtures', 'sample.nov'), 'utf8'));

test('wordCount handles prose, markup and CJK', () => {
  assert.equal(wordCount(''), 0);
  assert.equal(wordCount('one two three'), 3);
  assert.equal(wordCount('<p>one</p> <b>two</b>'), 2);
  assert.equal(wordCount('海辺の町'), 4);
  assert.equal(wordCount('ひらがな and words'), 4 + 2);
});

test('createProject scaffolds a writable chapter and scene', () => {
  const project = createProject({ title: 'Test', template: 'standard' });
  const rev = currentRevision(project);
  assert.equal(project.version, 4);
  assert.equal(rev.sections.length, 1);
  assert.equal(rev.scenes.length, 1);
  assert.equal(rev.sections[0].section_scenes[0].code, rev.scenes[0].code);
  assert.ok(rev.statuses.length >= 5);
  assert.equal(rev.categories.length, 6);
  assert.ok(rev.scenes[0].status, 'scene inherits the first status');
  assert.match(project.code, /^[0-9a-f]{8}$/);
});

test('empty template still yields a usable manuscript', () => {
  const project = createProject({ title: 'Empty', template: 'empty' });
  const rev = currentRevision(project);
  assert.equal(rev.categories.length, 0);
  assert.equal(rev.statuses.length, 1);
  assert.equal(rev.scenes.length, 1);
});

test('sample.nov imports with its structure intact', () => {
  const project = normalizeProject(sample);
  const rev = currentRevision(project);
  assert.equal(rev.scenes.length, 15);
  assert.equal(rev.sections.length, 5);
  assert.equal(rev.categories.length, 5);
  assert.equal(rev.subplots.length, 3);
  assert.equal(rev.statuses.length, 3);
  assert.equal(project.title, 'The Lighthouse Code');
  assert.equal(orderedScenes(rev).length, 15);

  // Every section reference resolves, and the ordering follows rankings.
  const ordered = orderedScenes(rev);
  assert.equal(ordered[0].scene.title, 'A Boring Summer... or So He Thought');
  assert.equal(ordered[0].section.title, 'Chapter 1: Arrival in Santa Marea');
});

test('import drops dangling scene references instead of failing', () => {
  const broken = JSON.parse(JSON.stringify(sample));
  broken.revisions[0].sections[0].section_scenes.push({ code: 'deadbeef', ranking: 99 });
  broken.revisions[0].scenes[0].scene_items.push({ code: 'deadbeef' });
  const project = normalizeProject(broken);
  const rev = currentRevision(project);
  assert.ok(!rev.sections[0].section_scenes.some((s) => s.code === 'deadbeef'));
  assert.ok(!rev.scenes[0].scene_items.some((s) => s.code === 'deadbeef'));
});

test('toNovFile round-trips through the importer', () => {
  const project = normalizeProject(sample);
  const round = normalizeProject(JSON.parse(toNovFile(project)));
  const a = currentRevision(project);
  const b = currentRevision(round);
  assert.equal(b.scenes.length, a.scenes.length);
  assert.equal(b.sections.length, a.sections.length);
  assert.equal(b.categories.length, a.categories.length);
  assert.deepEqual(
    b.scenes.map((s) => [s.code, s.title, s.text]),
    a.scenes.map((s) => [s.code, s.title, s.text]),
  );
  assert.deepEqual(
    b.sections.map((s) => s.section_scenes),
    a.sections.map((s) => s.section_scenes),
  );
});

test('exported .nov omits empty optional fields like the original writer', () => {
  const project = createProject({ title: 'Empty fields' });
  const file = JSON.parse(toNovFile(project));
  const scene = file.revisions[0].scenes[0];
  assert.equal(scene.synopsis, undefined);
  assert.equal(scene.text, undefined);
  assert.equal(scene.scene_subplots, undefined);
  assert.ok(scene.title);
});

test('stats count words across the imported manuscript', () => {
  const project = normalizeProject(sample);
  const stats = projectStats(project);
  assert.equal(stats.scenes, 15);
  assert.equal(stats.sections, 5);
  assert.ok(stats.words > 1000, `expected a real word count, got ${stats.words}`);
  assert.equal(
    stats.statuses.reduce((n, s) => n + s.count, 0),
    stats.scenes,
  );
  assert.equal(stats.progress.length, 1);
});

test('compilation emits the manuscript in every format', () => {
  const project = normalizeProject(sample);
  const md = compileMarkdown(project);
  const txt = compileText(project);
  const html = compileHtml(project);
  const firstScene = currentRevision(project).scenes[0];
  const firstLine = firstScene.text.split('\n')[0].slice(0, 40);

  assert.match(md, /^# The Lighthouse Code/);
  assert.ok(md.includes('## Chapter 1: Arrival in Santa Marea'));
  assert.ok(txt.includes(firstLine));
  assert.ok(html.includes('<h1>The Lighthouse Code</h1>'));
  assert.ok(html.includes('Table of contents'));
  assert.ok(html.includes('data:image/jpeg;base64,'));
});

test('search finds text and plot items', () => {
  const project = normalizeProject(sample);
  const hits = searchProject(project, 'lighthouse');
  assert.ok(hits.scenes.length > 0);
  assert.ok(hits.items.length > 0);
  assert.deepEqual(searchProject(project, '   '), { scenes: [], items: [] });
});
