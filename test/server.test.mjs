import test from 'node:test';
import assert from 'node:assert/strict';
import { spawn } from 'node:child_process';
import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const here = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(here, '..');
const PORT = 34000 + Math.floor(Math.random() * 2000);
const BASE = `http://127.0.0.1:${PORT}`;

const dataDir = fs.mkdtempSync(path.join(os.tmpdir(), 'novelist-test-'));
let child;

async function waitForHealth(timeoutMs = 15000) {
  const started = Date.now();
  while (Date.now() - started < timeoutMs) {
    try {
      const res = await fetch(`${BASE}/api/health`);
      if (res.ok) return;
    } catch {
      // server not up yet
    }
    await new Promise((resolve) => setTimeout(resolve, 120));
  }
  throw new Error('server did not become healthy');
}

const json = async (method, url, body) => {
  const res = await fetch(`${BASE}${url}`, {
    method,
    headers: body ? { 'content-type': 'application/json' } : undefined,
    body: body ? JSON.stringify(body) : undefined,
  });
  const text = await res.text();
  return { status: res.status, body: text ? JSON.parse(text) : null, headers: res.headers };
};

test.before(async () => {
  child = spawn(process.execPath, ['server.mjs'], {
    cwd: root,
    env: { ...process.env, PORT: String(PORT), HOST: '127.0.0.1', NOVELIST_DATA_DIR: dataDir },
    stdio: ['ignore', 'pipe', 'pipe'],
  });
  child.stderr.on('data', (chunk) => process.stderr.write(`[server] ${chunk}`));
  await waitForHealth();
});

test.after(async () => {
  if (child) {
    child.kill('SIGTERM');
    await new Promise((resolve) => child.once('exit', resolve));
  }
  fs.rmSync(dataDir, { recursive: true, force: true });
});

test('health reports an AI gateway state', async () => {
  const { status, body } = await json('GET', '/api/health');
  assert.equal(status, 200);
  assert.equal(body.ok, true);
  assert.equal(typeof body.ai, 'boolean');
});

test('project lifecycle: create, list, read, save, export, delete', async () => {
  const created = await json('POST', '/api/projects', { title: 'Lifecycle', template: 'standard' });
  assert.equal(created.status, 201);
  const code = created.body.project.code;
  assert.match(code, /^[0-9a-f]{8}$/);

  const list = await json('GET', '/api/projects');
  assert.ok(list.body.projects.some((p) => p.code === code));

  const read = await json('GET', `/api/projects/${code}`);
  assert.equal(read.body.project.title, 'Lifecycle');

  const project = read.body.project;
  const rev = project.revisions.at(-1);
  rev.scenes[0].text = 'The lighthouse blinked twice, then darkness swallowed the bay entirely.';
  project.title = 'Lifecycle Renamed';
  const saved = await json('PUT', `/api/projects/${code}`, { project });
  assert.equal(saved.status, 200);
  assert.equal(saved.body.stats.scenes, 1);
  assert.ok(saved.body.stats.words >= 10, `expected words to be saved, got ${saved.body.stats.words}`);

  const exported = await fetch(`${BASE}/api/projects/${code}/export?format=nov`);
  assert.equal(exported.status, 200);
  assert.match(exported.headers.get('content-disposition'), /attachment/);
  const nov = JSON.parse(await exported.text());
  assert.equal(nov.version, 4);
  assert.equal(nov.revisions.at(-1).scenes[0].text, 'The lighthouse blinked twice, then darkness swallowed the bay entirely.');

  const md = await fetch(`${BASE}/api/projects/${code}/export?format=md`);
  assert.match(await md.text(), /lighthouse blinked twice/);

  const html = await fetch(`${BASE}/api/projects/${code}/export?format=html`);
  assert.match(html.headers.get('content-type'), /text\/html/);

  const deleted = await json('DELETE', `/api/projects/${code}`);
  assert.equal(deleted.status, 200);
  const missing = await json('GET', `/api/projects/${code}`);
  assert.equal(missing.status, 404);
});

test('importing sample.nov creates a browsable project', async () => {
  const sample = JSON.parse(fs.readFileSync(path.join(here, 'fixtures', 'sample.nov'), 'utf8'));
  const imported = await json('POST', '/api/import', { project: sample });
  assert.equal(imported.status, 201);
  const code = imported.body.project.code;

  const read = await json('GET', `/api/projects/${code}`);
  assert.equal(read.body.project.title, 'The Lighthouse Code');
  assert.equal(read.body.project.revisions.at(-1).scenes.length, 15);

  // Importing the same code again must not overwrite the existing project.
  const again = await json('POST', '/api/import', { project: sample });
  assert.equal(again.status, 201);
  assert.notEqual(again.body.project.code, code);
});

test('duplicate copies a project under a new code', async () => {
  const created = await json('POST', '/api/projects', { title: 'Original' });
  const copy = await json('POST', `/api/projects/${created.body.project.code}/duplicate`);
  assert.equal(copy.status, 201);
  assert.notEqual(copy.body.project.code, created.body.project.code);
  assert.match(copy.body.project.title, /\(copy\)$/);
});

test('rejects path traversal and unknown routes', async () => {
  const traversal = await fetch(`${BASE}/shared/../server.mjs`);
  assert.ok([403, 404].includes(traversal.status));
  const unknown = await json('GET', '/api/nope');
  assert.equal(unknown.status, 404);
});

test('AI endpoint reports an unconfigured gateway without throwing', async () => {
  const res = await json('POST', '/api/ai', { task: 'continue', title: 'X', text: 'Hello' });
  assert.equal(res.status, 200);
  if (res.body.ok === false) {
    assert.equal(res.body.skipped, true);
    assert.match(res.body.reason, /RESPAN_API_KEY/);
  }
});

test('exports EPUB and ODT as downloadable ZIP archives', async () => {
  const created = await json('POST', '/api/projects', {});
  const code = created.body.project.code;

  const epub = await fetch(`${BASE}/api/projects/${code}/export?format=epub`);
  assert.equal(epub.status, 200);
  assert.equal(epub.headers.get('content-type'), 'application/epub+zip');
  assert.match(epub.headers.get('content-disposition'), /\.epub"$/);
  const epubBytes = Buffer.from(await epub.arrayBuffer());
  assert.equal(epubBytes.readUInt32LE(0), 0x04034b50);
  // local header (30 bytes) + 8-byte name "mimetype", then the payload
  assert.match(epubBytes.subarray(38, 60).toString(), /^application\/epub\+zip/);

  const odt = await fetch(`${BASE}/api/projects/${code}/export?format=odt`);
  assert.equal(odt.status, 200);
  assert.equal(odt.headers.get('content-type'), 'application/vnd.oasis.opendocument.text');
  const odtBytes = Buffer.from(await odt.arrayBuffer());
  assert.match(odtBytes.subarray(38, 80).toString(), /^application\/vnd\.oasis\.opendocument\.text/);

  const unknown = await fetch(`${BASE}/api/projects/${code}/export?format=pdf`);
  assert.equal(unknown.status, 400);

  const removed = await fetch(`${BASE}/api/projects/${code}`, { method: 'DELETE' });
  assert.equal(removed.status, 200);
});
