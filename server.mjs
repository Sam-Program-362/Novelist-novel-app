#!/usr/bin/env node
/**
 * Novelist RE - local server.
 *
 * Serves the browser app and a small JSON API. Projects are stored as `.nov`
 * v4 documents under `data/projects/`, which is the same format the Android
 * release imports, so files round-trip between the two implementations.
 *
 * No runtime dependencies: only Node's standard library.
 */

import http from 'node:http';
import fs from 'node:fs/promises';
import fsSync from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

import {
  createProject,
  currentRevision,
  normalizeProject,
  projectStats,
  recordProgress,
  toNovFile,
  wordCount,
  compileEpub,
  compileHtml,
  compileMarkdown,
  compileOdt,
  compileText,
} from './shared/nov-model.js';
import { chatCompletion, isGatewayConfigured } from './respan-gateway.mjs';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const PUBLIC_DIR = path.join(__dirname, 'public');
const SHARED_DIR = path.join(__dirname, 'shared');
const DATA_DIR = process.env.NOVELIST_DATA_DIR
  ? path.resolve(process.env.NOVELIST_DATA_DIR)
  : path.join(__dirname, 'data', 'projects');
const PORT = Number(process.env.PORT || 3000);
const HOST = process.env.HOST || '0.0.0.0';
const MAX_BODY = 32 * 1024 * 1024; // 32 MiB, covers base64 covers
const STARTED_AT = Date.now();

fsSync.mkdirSync(DATA_DIR, { recursive: true });

/* ------------------------------------------------------------------ */
/* storage                                                             */
/* ------------------------------------------------------------------ */

const locks = new Map();

/** Serialise read-modify-write per project file. */
async function withLock(key, fn) {
  const previous = locks.get(key) ?? Promise.resolve();
  const run = previous.then(fn, fn);
  locks.set(key, run.catch(() => {}));
  try {
    return await run;
  } finally {
    if (locks.get(key) === run.catch(() => {})) locks.delete(key);
  }
}

/** Load .env.local / .env without pulling in a dependency. */
function loadEnvFiles() {
  for (const name of ['.env.local', '.env']) {
    const file = path.join(__dirname, name);
    if (!fsSync.existsSync(file)) continue;
    try {
      if (typeof process.loadEnvFile === 'function') process.loadEnvFile(file);
    } catch (error) {
      console.warn(`[novelist] could not read ${name}: ${error.message}`);
    }
  }
}

loadEnvFiles();

function projectPath(code) {
  if (!/^[0-9a-f]{4,32}$/i.test(code)) throw new HttpError(400, 'Invalid project code');
  return path.join(DATA_DIR, `${code}.json`);
}

async function readProject(code) {
  let raw;
  try {
    raw = await fs.readFile(projectPath(code), 'utf8');
  } catch (error) {
    if (error.code === 'ENOENT') throw new HttpError(404, 'Project not found');
    throw error;
  }
  return normalizeProject(JSON.parse(raw));
}

async function writeProject(project) {
  const file = projectPath(project.code);
  const tmp = `${file}.${process.pid}.${Date.now()}.tmp`;
  await fs.writeFile(tmp, JSON.stringify(project, null, 2), 'utf8');
  await fs.rename(tmp, file);
  return project;
}

async function listProjects() {
  const entries = await fs.readdir(DATA_DIR).catch(() => []);
  const out = [];
  for (const name of entries) {
    if (!name.endsWith('.json')) continue;
    try {
      const raw = await fs.readFile(path.join(DATA_DIR, name), 'utf8');
      const project = normalizeProject(JSON.parse(raw));
      const revision = currentRevision(project);
      const words = (revision?.scenes ?? []).reduce((sum, s) => sum + wordCount(s.text), 0);
      out.push({
        code: project.code,
        title: project.title,
        description: project.description,
        cover: project.cover,
        coverColor: project.cover ? null : (revision?.categories?.[0]?.color ?? null),
        words,
        scenes: revision?.scenes?.length ?? 0,
        sections: revision?.sections?.length ?? 0,
        items: (revision?.categories ?? []).reduce((n, c) => n + (c.items?.length ?? 0), 0),
        updated: project.last_update_date,
        archived: Boolean(project.archived),
      });
    } catch {
      // A corrupt file must not take down the bookshelf.
    }
  }
  return out.sort((a, b) => b.updated - a.updated);
}

/* ------------------------------------------------------------------ */
/* helpers                                                             */
/* ------------------------------------------------------------------ */

class HttpError extends Error {
  constructor(status, message) {
    super(message);
    this.status = status;
  }
}

function sendJson(res, status, body) {
  const payload = JSON.stringify(body);
  res.writeHead(status, {
    'content-type': 'application/json; charset=utf-8',
    'cache-control': 'no-store',
    'content-length': Buffer.byteLength(payload),
  });
  res.end(payload);
}

function sendText(res, status, body, type = 'text/plain; charset=utf-8') {
  res.writeHead(status, { 'content-type': type, 'cache-control': 'no-store' });
  res.end(body);
}

function sendBytes(res, status, bytes, type) {
  res.writeHead(status, {
    'content-type': type,
    'cache-control': 'no-store',
    'content-length': bytes.length,
  });
  res.end(Buffer.from(bytes));
}

async function readBody(req) {
  const chunks = [];
  let size = 0;
  for await (const chunk of req) {
    size += chunk.length;
    if (size > MAX_BODY) throw new HttpError(413, 'Request body too large');
    chunks.push(chunk);
  }
  if (!chunks.length) return {};
  const text = Buffer.concat(chunks).toString('utf8');
  try {
    return JSON.parse(text);
  } catch {
    throw new HttpError(400, 'Request body must be JSON');
  }
}

const MIME = {
  '.html': 'text/html; charset=utf-8',
  '.css': 'text/css; charset=utf-8',
  '.js': 'text/javascript; charset=utf-8',
  '.mjs': 'text/javascript; charset=utf-8',
  '.json': 'application/json; charset=utf-8',
  '.svg': 'image/svg+xml',
  '.png': 'image/png',
  '.jpg': 'image/jpeg',
  '.jpeg': 'image/jpeg',
  '.webp': 'image/webp',
  '.ico': 'image/x-icon',
  '.woff2': 'font/woff2',
  '.txt': 'text/plain; charset=utf-8',
  '.nov': 'application/json',
  '.md': 'text/markdown; charset=utf-8',
};

async function serveStatic(res, pathname) {
  const roots = { '/shared/': SHARED_DIR, '/': PUBLIC_DIR };
  const prefix = pathname.startsWith('/shared/') ? '/shared/' : '/';
  const root = roots[prefix];
  const rel = pathname.slice(prefix.length) || 'index.html';
  const resolved = path.resolve(root, rel);
  if (!resolved.startsWith(root + path.sep) && resolved !== root) {
    throw new HttpError(403, 'Forbidden');
  }
  let stat;
  try {
    stat = await fs.stat(resolved);
  } catch {
    throw new HttpError(404, 'Not found');
  }
  if (stat.isDirectory()) {
    return serveStatic(res, `${pathname.replace(/\/?$/, '')}/index.html`);
  }
  const stream = fsSync.createReadStream(resolved);
  res.writeHead(200, {
    'content-type': MIME[path.extname(resolved).toLowerCase()] ?? 'application/octet-stream',
    'cache-control': resolved.endsWith('index.html') ? 'no-store' : 'public, max-age=60',
    'content-length': stat.size,
  });
  stream.pipe(res);
}

/* ------------------------------------------------------------------ */
/* AI                                                                  */
/* ------------------------------------------------------------------ */

const TASKS = {
  continue: (ctx) =>
    `Continue the scene below in the author's voice. Keep continuity with the plot notes and return only prose (2-4 paragraphs), no headings.\n\nPROJECT: ${ctx.title}\n${ctx.plot ? `PLOT NOTES:\n${ctx.plot}\n` : ''}SCENE: ${ctx.sceneTitle ?? ''}\n---\n${ctx.text}`,
  rewrite: (ctx) =>
    `Rewrite the passage below so it reads better while preserving meaning and point of view. Return only the rewritten prose.\n\n---\n${ctx.text}`,
  describe: (ctx) =>
    `Write a vivid description for this story element, as a novelist's notebook entry (80-120 words).\n\nPROJECT: ${ctx.title}\nELEMENT: ${ctx.subject ?? ''}\n${ctx.plot ? `CONTEXT:\n${ctx.plot}` : ''}`,
  brainstorm: (ctx) =>
    `Brainstorm five concrete story ideas that would raise the stakes. Use a short numbered list, one sentence each.\n\nPROJECT: ${ctx.title}\n${ctx.plot ? `PLOT NOTES:\n${ctx.plot}\n` : ''}CURRENT PASSAGE:\n${ctx.text}`,
  outline: (ctx) =>
    `Turn the synopsis below into a scene-by-scene outline of 3 to 6 beats. Use a numbered list.\n\nPROJECT: ${ctx.title}\n${ctx.plot ? `PLOT NOTES:\n${ctx.plot}\n` : ''}SYNOPSIS:\n${ctx.text}`,
};

async function handleAi(req, res) {
  const body = await readBody(req);
  const task = String(body.task ?? 'continue');
  if (!TASKS[task]) throw new HttpError(400, `Unknown task "${task}"`);
  if (!isGatewayConfigured()) {
    return sendJson(res, 200, {
      ok: false,
      skipped: true,
      reason: 'RESPAN_API_KEY is not set',
      hint: 'Create a key for the Respan gateway and put it in .env.local as RESPAN_API_KEY (see .env.example), then restart the server.',
    });
  }
  const context = {
    title: String(body.title ?? 'Untitled'),
    text: String(body.text ?? '').slice(0, 12000),
    plot: String(body.plot ?? '').slice(0, 6000),
    sceneTitle: String(body.sceneTitle ?? '').slice(0, 200),
    subject: String(body.subject ?? '').slice(0, 200),
  };
  const prompt = TASKS[task](context);
  const result = await chatCompletion(
    [
      {
        role: 'system',
        content:
          'You are Novelist, a focused fiction-writing assistant. You write clean prose, respect established continuity, and never mention being an AI.',
      },
      { role: 'user', content: prompt },
    ],
    { metadata: { workflow: `novelist-${task}` } },
  );
  if (!result.ok) {
    return sendJson(res, 200, {
      ok: false,
      status: result.status,
      reason: result.error,
    });
  }
  return sendJson(res, 200, { ok: true, content: result.content, model: result.model, usage: result.usage });
}

/* ------------------------------------------------------------------ */
/* router                                                              */
/* ------------------------------------------------------------------ */

async function route(req, res, url) {
  const { pathname, searchParams } = url;
  const method = req.method ?? 'GET';

  if (pathname === '/api/health') {
    return sendJson(res, 200, {
      ok: true,
      uptimeMs: Date.now() - STARTED_AT,
      ai: isGatewayConfigured(),
      projects: (await listProjects()).length,
    });
  }

  if (pathname === '/api/projects' && method === 'GET') {
    return sendJson(res, 200, { projects: await listProjects() });
  }

  if (pathname === '/api/projects' && method === 'POST') {
    const body = await readBody(req);
    const project = createProject({
      title: String(body.title ?? '').trim() || 'Untitled project',
      description: String(body.description ?? ''),
      template: body.template === 'empty' ? 'empty' : 'standard',
    });
    recordProgress(project);
    await withLock(project.code, () => writeProject(project));
    return sendJson(res, 201, { project });
  }

  if (pathname === '/api/import' && method === 'POST') {
    const body = await readBody(req);
    const project = normalizeProject(body.project ?? body);
    // Importing the same file twice creates a distinct copy, like the app does.
    if (fsSync.existsSync(path.join(DATA_DIR, `${project.code}.json`))) {
      project.code = createProject({ title: project.title }).code;
    }
    project.last_update_date = Date.now();
    await withLock(project.code, () => writeProject(project));
    return sendJson(res, 201, { project });
  }

  if (pathname === '/api/ai' && method === 'POST') return handleAi(req, res);

  const match = /^\/api\/projects\/([0-9a-f]{4,32})(\/[a-z]+)?$/.exec(pathname);
  if (match) {
    const [, code, action = ''] = match;

    if (!action && method === 'GET') {
      return sendJson(res, 200, { project: await readProject(code) });
    }

    if (!action && method === 'PUT') {
      const body = await readBody(req);
      const project = normalizeProject(body.project ?? body);
      project.code = code;
      project.last_update_date = Date.now();
      recordProgress(project);
      await withLock(code, () => writeProject(project));
      return sendJson(res, 200, {
        ok: true,
        last_update_date: project.last_update_date,
        stats: projectStats(project),
      });
    }

    if (!action && method === 'DELETE') {
      await withLock(code, () =>
        fs.unlink(projectPath(code)).catch((error) => {
          if (error.code !== 'ENOENT') throw error;
        }),
      );
      return sendJson(res, 200, { ok: true });
    }

    if (action === '/duplicate' && method === 'POST') {
      const source = await readProject(code);
      const copy = normalizeProject(source);
      copy.code = createProject({ title: `${source.title} (copy)` }).code;
      copy.title = `${source.title} (copy)`;
      copy.last_update_date = Date.now();
      await withLock(copy.code, () => writeProject(copy));
      return sendJson(res, 201, { project: copy });
    }

    if (action === '/export' && method === 'GET') {
      const project = await readProject(code);
      const format = (searchParams.get('format') ?? 'nov').toLowerCase();
      const slug =
        project.title
          .toLowerCase()
          .replace(/[^a-z0-9]+/g, '-')
          .replace(/^-|-$/g, '')
          .slice(0, 60) || 'novelist-project';
      const filename = `${slug}.${format === 'markdown' ? 'md' : format}`;
      res.setHeader('content-disposition', `attachment; filename="${filename}"`);
      if (format === 'nov') return sendText(res, 200, toNovFile(project), 'application/json; charset=utf-8');
      if (format === 'md' || format === 'markdown') return sendText(res, 200, compileMarkdown(project), 'text/markdown; charset=utf-8');
      if (format === 'html') return sendText(res, 200, compileHtml(project), 'text/html; charset=utf-8');
      if (format === 'txt') return sendText(res, 200, compileText(project));
      if (format === 'epub') return sendBytes(res, 200, compileEpub(project), 'application/epub+zip');
      if (format === 'odt') return sendBytes(res, 200, compileOdt(project), 'application/vnd.oasis.opendocument.text');
      throw new HttpError(400, `Unknown export format "${format}"`);
    }
  }

  if (pathname.startsWith('/api/')) throw new HttpError(404, 'Unknown API route');
  return serveStatic(res, pathname === '/' ? '/index.html' : pathname);
}

const server = http.createServer(async (req, res) => {
  const url = new URL(req.url ?? '/', `http://${req.headers.host ?? 'localhost'}`);
  try {
    await route(req, res, url);
  } catch (error) {
    if (res.headersSent) {
      res.destroy(error);
      return;
    }
    const status = error instanceof HttpError ? error.status : 500;
    if (status === 500) console.error('[novelist]', error);
    sendJson(res, status, { error: error.message ?? 'Internal error' });
  }
});

server.listen(PORT, HOST, () => {
  console.log(`Novelist RE listening on http://${HOST}:${PORT}`);
  console.log(`AI gateway: ${isGatewayConfigured() ? 'configured' : 'not configured (set RESPAN_API_KEY in .env.local)'}`);
});

export { server };
