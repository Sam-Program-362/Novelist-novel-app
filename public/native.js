/**
 * Android bridge shim.
 *
 * On the web this file does nothing. Inside the APK, `NovelistNative` is a
 * JavascriptInterface, and this module routes the server API the app already
 * calls to on-device storage, computes exports with the shared model, and
 * hands downloads to the system save dialog.
 */
import {
  compileEpub,
  compileHtml,
  compileMarkdown,
  compileOdt,
  compileText,
  createProject,
  currentRevision,
  normalizeProject,
  projectStats,
  toNovFile,
  wordCount,
} from '/shared/nov-model.js';

const bridge = typeof window !== 'undefined' ? window.NovelistNative : null;
const active = Boolean(bridge) && typeof bridge.isNative === 'function' && bridge.isNative() === true;

if (active) install(bridge);

function install(native) {
  const json = (data, status = 200) =>
    new Response(JSON.stringify(data), { status, headers: { 'content-type': 'application/json' } });

  const listCodes = () => {
    try {
      return JSON.parse(native.listCodes() || '[]');
    } catch {
      return [];
    }
  };

  const readProject = (code) => {
    const raw = native.readProject(code);
    return raw ? normalizeProject(JSON.parse(raw)) : null;
  };

  const writeProject = (project) => native.writeProject(project.code, JSON.stringify(project));

  const summary = (project) => {
    const revision = currentRevision(project);
    const stats = projectStats(project);
    return {
      code: project.code,
      title: project.title,
      description: project.description,
      cover: project.cover,
      coverColor: project.cover ? null : (revision?.categories?.[0]?.color ?? null),
      words: stats.words,
      scenes: stats.scenes,
      sections: stats.sections,
      items: stats.items,
      updated: project.last_update_date,
      archived: false,
    };
  };

  const uniqueCode = () => {
    const existing = new Set(listCodes());
    for (let i = 0; i < 50; i += 1) {
      const code = createProject({ title: 'x' }).code;
      if (!existing.has(code)) return code;
    }
    return `${Date.now().toString(16).slice(-8)}`;
  };

  const exportPayload = (project, format) => {
    switch (format) {
      case 'nov':
        return { bytes: new TextEncoder().encode(toNovFile(project)), mime: 'application/json' };
      case 'md':
      case 'markdown':
        return { bytes: new TextEncoder().encode(compileMarkdown(project)), mime: 'text/markdown' };
      case 'html':
        return { bytes: new TextEncoder().encode(compileHtml(project)), mime: 'text/html' };
      case 'txt':
        return { bytes: new TextEncoder().encode(compileText(project)), mime: 'text/plain' };
      case 'epub':
        return { bytes: compileEpub(project), mime: 'application/epub+zip' };
      case 'odt':
        return { bytes: compileOdt(project), mime: 'application/vnd.oasis.opendocument.text' };
      default:
        return null;
    }
  };

  const slug = (title) =>
    String(title ?? '')
      .toLowerCase()
      .replace(/[^a-z0-9]+/g, '-')
      .replace(/^-|-$/g, '')
      .slice(0, 60) || 'novelist-project';

  const handle = (url, init) => {
    const method = (init?.method ?? 'GET').toUpperCase();
    const path = url.pathname;
    let body = null;
    if (init?.body) {
      try {
        body = JSON.parse(init.body);
      } catch {
        return json({ error: 'Invalid JSON body' }, 400);
      }
    }

    if (path === '/api/health') {
      return json({ ok: true, ai: false, native: true, projects: listCodes().length });
    }

    if (path === '/api/ai') {
      return json({
        ok: false,
        skipped: true,
        reason: 'The writing assistant needs the desktop/server build',
        hint: 'The Android build runs fully offline and has no gateway key. Use the web app with RESPAN_API_KEY set to use the assistant.',
      });
    }

    if (path === '/api/projects' && method === 'GET') {
      const projects = listCodes()
        .map((code) => {
          try {
            return summary(readProject(code));
          } catch {
            return null;
          }
        })
        .filter(Boolean)
        .sort((a, b) => (b.updated ?? 0) - (a.updated ?? 0));
      return json({ projects });
    }

    if (path === '/api/projects' && method === 'POST') {
      const project = createProject({
        title: String(body?.title ?? '').trim() || 'Untitled project',
        description: String(body?.description ?? ''),
        template: body?.template === 'empty' ? 'empty' : 'standard',
      });
      writeProject(project);
      return json({ project }, 201);
    }

    if (path === '/api/import' && method === 'POST') {
      const project = normalizeProject(body?.project ?? body);
      if (listCodes().includes(project.code)) project.code = uniqueCode();
      project.last_update_date = Date.now();
      writeProject(project);
      return json({ project }, 201);
    }

    const match = /^\/api\/projects\/([0-9a-f]{4,32})(\/[a-z]+)?$/.exec(path);
    if (!match) return json({ error: 'Unknown API route' }, 404);

    const [, code, action = ''] = match;
    const project = readProject(code);
    if (!project && action !== '') return json({ error: `Project ${code} not found` }, 404);

    if (!action && method === 'GET') {
      if (!project) return json({ error: `Project ${code} not found` }, 404);
      return json({ project });
    }

    if (!action && method === 'PUT') {
      const next = normalizeProject(body?.project ?? body);
      next.code = code;
      next.last_update_date = Date.now();
      writeProject(next);
      return json({ ok: true, last_update_date: next.last_update_date, stats: projectStats(next) });
    }

    if (!action && method === 'DELETE') {
      native.deleteProject(code);
      return json({ ok: true });
    }

    if (action === '/duplicate' && method === 'POST') {
      const copy = normalizeProject(project);
      copy.code = uniqueCode();
      copy.title = `${project.title} (copy)`;
      copy.last_update_date = Date.now();
      writeProject(copy);
      return json({ project: copy }, 201);
    }

    if (action === '/export' && method === 'GET') {
      const format = (url.searchParams.get('format') ?? 'nov').toLowerCase();
      const payload = exportPayload(project, format);
      if (!payload) return json({ error: `Unknown export format "${format}"` }, 400);
      return new Response(payload.bytes, {
        status: 200,
        headers: {
          'content-type': `${payload.mime}; charset=utf-8`,
          'content-disposition': `attachment; filename="${slug(project.title)}.${format === 'markdown' ? 'md' : format}"`,
        },
      });
    }

    return json({ error: 'Unknown API route' }, 404);
  };

  const originalFetch = window.fetch.bind(window);
  window.fetch = (input, init) => {
    const raw = typeof input === 'string' ? input : input?.url;
    let url;
    try {
      url = new URL(raw, window.location.href);
    } catch {
      return originalFetch(input, init);
    }
    // Same-origin API calls stay on the device; anything else (none in this
    // build) goes to the network as usual.
    if (url.origin === window.location.origin && url.pathname.startsWith('/api/')) {
      try {
        return Promise.resolve(handle(url, init ?? {}));
      } catch (error) {
        return Promise.resolve(json({ error: String(error?.message ?? error) }, 500));
      }
    }
    return originalFetch(input, init);
  };

  const toBase64 = (bytes) => {
    let binary = '';
    const chunk = 0x8000;
    for (let i = 0; i < bytes.length; i += chunk) {
      binary += String.fromCharCode.apply(null, bytes.subarray(i, i + chunk));
    }
    return window.btoa(binary);
  };

  // `download()` builds an <a href> and clicks it. Intercept that click so the
  // archive is produced locally and written through the system save dialog.
  document.addEventListener(
    'click',
    (event) => {
      const anchor = event.target?.closest?.('a[href*="/export?format="]');
      if (!anchor) return;
      event.preventDefault();
      event.stopPropagation();
      const rel = new URL(anchor.getAttribute('href'), window.location.href);
      const format = (rel.searchParams.get('format') ?? 'nov').toLowerCase();
      const code = /\/api\/projects\/([0-9a-f]{4,32})\//.exec(rel.pathname)?.[1];
      if (!code) return;
      const project = readProject(code);
      if (!project) return;
      const payload = exportPayload(project, format);
      if (!payload) return;
      const name = `${slug(project.title)}.${format === 'markdown' ? 'md' : format}`;
      native.saveExport(name, payload.mime, toBase64(payload.bytes));
    },
    true,
  );

  window.__novelistNative = { version: '1.0', active: true, wordCount };
}
