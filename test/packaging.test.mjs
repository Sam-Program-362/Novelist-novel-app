import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

import { compileEpub, compileOdt, normalizeProject } from '../shared/nov-model.js';
import { crc32 } from '../shared/zip.js';

const here = path.dirname(fileURLToPath(import.meta.url));
const sample = JSON.parse(fs.readFileSync(path.join(here, 'fixtures', 'sample.nov'), 'utf8'));

/** Read a ZIP by walking the central directory; returns entry payloads in order. */
function readZip(buffer) {
  let eocd = -1;
  for (let i = buffer.length - 22; i >= 0; i -= 1) {
    if (buffer.readUInt32LE(i) === 0x06054b50) {
      eocd = i;
      break;
    }
  }
  assert.notEqual(eocd, -1, 'end of central directory not found');
  const count = buffer.readUInt16LE(eocd + 10);
  let pointer = buffer.readUInt32LE(eocd + 16);
  const entries = [];
  for (let i = 0; i < count; i += 1) {
    assert.equal(buffer.readUInt32LE(pointer), 0x02014b50, 'bad central directory signature');
    const method = buffer.readUInt16LE(pointer + 10);
    const crc = buffer.readUInt32LE(pointer + 16);
    const size = buffer.readUInt32LE(pointer + 20);
    const nameLength = buffer.readUInt16LE(pointer + 28);
    const extraLength = buffer.readUInt16LE(pointer + 30);
    const commentLength = buffer.readUInt16LE(pointer + 32);
    const localOffset = buffer.readUInt32LE(pointer + 42);
    const name = buffer.subarray(pointer + 46, pointer + 46 + nameLength).toString('utf8');
    const localNameLength = buffer.readUInt16LE(localOffset + 26);
    const localExtraLength = buffer.readUInt16LE(localOffset + 28);
    const start = localOffset + 30 + localNameLength + localExtraLength;
    const data = buffer.subarray(start, start + size);
    entries.push({ name, method, data, crc, size });
    pointer += 46 + nameLength + extraLength + commentLength;
  }
  return entries;
}

test('EPUB is a valid stored ZIP with the required OCF entries', () => {
  const bytes = compileEpub(normalizeProject(sample));
  const entries = readZip(Buffer.from(bytes));
  assert.equal(entries[0].name, 'mimetype');
  assert.equal(entries[0].method, 0, 'mimetype must be uncompressed');
  assert.equal(entries[0].data.toString(), 'application/epub+zip');
  assert.equal(entries[0].crc, crc32(entries[0].data));

  const names = entries.map((e) => e.name);
  for (const required of ['META-INF/container.xml', 'OEBPS/content.opf', 'OEBPS/nav.xhtml', 'OEBPS/style.css']) {
    assert.ok(names.includes(required), `${required} missing`);
  }
  assert.ok(entries.every((e) => e.crc === crc32(e.data)), 'every CRC must match');

  const opf = entries.find((e) => e.name === 'OEBPS/content.opf').data.toString();
  assert.match(opf, /<dc:title>The Lighthouse Code<\/dc:title>/);
  assert.match(opf, /version="3.0"/);

  const chapter = entries.find((e) => e.name === 'OEBPS/chapter-1.xhtml').data.toString();
  assert.match(chapter, /<html xmlns="http:\/\/www.w3.org\/1999\/xhtml"/);
  assert.ok(chapter.includes(firstSceneWord()), 'scene prose should reach the EPUB chapter');

  assert.ok(!names.some((name) => name.startsWith('/')), 'no absolute entry names');
});

test('ODT is a valid ODF package beginning with the mimetype', () => {
  const bytes = compileOdt(normalizeProject(sample));
  const entries = readZip(Buffer.from(bytes));
  assert.equal(entries[0].name, 'mimetype');
  assert.equal(entries[0].method, 0);
  assert.equal(entries[0].data.toString(), 'application/vnd.oasis.opendocument.text');

  const content = entries.find((e) => e.name === 'content.xml').data.toString();
  assert.match(content, /office:mimetype="application\/vnd\.oasis\.opendocument\.text"/);
  assert.match(content, /<office:body>/);
  assert.match(content, /text:outline-level="1">The Lighthouse Code</);

  const manifest = entries.find((e) => e.name === 'META-INF/manifest.xml').data.toString();
  assert.match(manifest, /manifest:full-path="\/" manifest:media-type="application\/vnd\.oasis\.opendocument\.text"/);
  assert.match(manifest, /manifest:full-path="content\.xml"/);
});

test('EPUB and ODT escape markup from scene text and titles', () => {
  const project = normalizeProject({
    version: 4,
    code: 'aaaabbbb',
    title: 'A & B <script>',
    revisions: [
      {
        number: 1,
        date: 1700000000000,
        scenes: [{ code: 'ccccdddd', title: 'Scene & <b>', text: 'x < y & "quotes"', ranking: 1 }],
      },
    ],
  });
  const epub = readZip(Buffer.from(compileEpub(project))).find((e) => e.name === 'OEBPS/chapter-1.xhtml').data.toString();
  assert.match(epub, /A &amp; B &lt;script&gt;/);
  assert.match(epub, /x &lt; y &amp;/);
  assert.ok(!epub.includes('<script>'));
  const odt = readZip(Buffer.from(compileOdt(project))).find((e) => e.name === 'content.xml').data.toString();
  assert.match(odt, /A &amp; B &lt;script&gt;/);
});

function firstSceneWord() {
  const scene = sample.revisions[0].scenes.find((s) => s.text && /[A-Za-z]{8,}/.test(s.text));
  return scene.text.match(/[A-Za-z]{8,}/)[0];
}
