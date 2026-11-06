/**
 * Novelist RE - browser client.
 *
 * A dependency-free SPA. It talks to server.mjs, which persists projects as
 * `.nov` v4 documents. Model helpers are shared with the server through
 * /shared/nov-model.js so import/export logic cannot drift.
 */

import {
  currentRevision,
  deepClone,
  hexFromArgb,
  itemByCode,
  newCode,
  newItem,
  newScene,
  newSection,
  orderedScenes,
  projectStats,
  recordProgress,
  sceneByCode,
  searchProject,
  sectionByCode,
  statusByCode,
  wordCount,
} from '../shared/nov-model.js';

/* ------------------------------------------------------------------ */
/* micro-DOM                                                          */
/* ------------------------------------------------------------------ */

const app = document.getElementById('app');
const modalRoot = document.getElementById('modal-root');
const toastEl = document.getElementById('toast');

function el(tag, props = {}, ...children) {
  const node = document.createElement(tag);
  for (const [key, value] of Object.entries(props ?? {})) {
    if (value == null || value === false) continue;
    if (key === 'class') node.className = value;
    else if (key === 'dataset') Object.assign(node.dataset, value);
    else if (key === 'style' && typeof value === 'object') Object.assign(node.style, value);
    else if (key.startsWith('on') && typeof value === 'function') node.addEventListener(key.slice(2), value);
    else if (key === 'value') node.value = value;
    else if (key === 'checked' || key === 'disabled' || key === 'selected') node[key] = Boolean(value);
    else if (key === 'html') node.innerHTML = value;
    else node.setAttribute(key, value);
  }
  for (const child of children.flat()) {
    if (child == null || child === false) continue;
    node.append(child.nodeType ? child : document.createTextNode(String(child)));
  }
  return node;
}

function clear(node) {
  while (node.firstChild) node.removeChild(node.firstChild);
}

let toastTimer = null;
function toast(message, kind = 'info') {
  toastEl.textContent = message;
  toastEl.className = `toast show${kind === 'error' ? ' error' : ''}`;
  clearTimeout(toastTimer);
  toastTimer = setTimeout(() => toastEl.classList.remove('show'), 3200);
}

/* ------------------------------------------------------------------ */
/* api                                                                */
/* ------------------------------------------------------------------ */

async function request(method, url, body) {
  const res = await fetch(url, {
    method,
    headers: body ? { 'content-type': 'application/json' } : undefined,
    body: body ? JSON.stringify(body) : undefined,
  });
  const text = await res.text();
  let data = null;
  try {
    data = text ? JSON.parse(text) : null;
  } catch {
    data = null;
  }
  if (!res.ok) throw new Error(data?.error ?? `${method} ${url} failed (${res.status})`);
  return data;
}

const api = {
  health: () => request('GET', '/api/health'),
  list: () => request('GET', '/api/projects').then((r) => r.projects ?? []),
  get: (code) => request('GET', `/api/projects/${code}`).then((r) => r.project),
  create: (body) => request('POST', '/api/projects', body).then((r) => r.project),
  save: (project) => request('PUT', `/api/projects/${project.code}`, { project }),
  remove: (code) => request('DELETE', `/api/projects/${code}`),
  duplicate: (code) => request('POST', `/api/projects/${code}/duplicate`).then((r) => r.project),
  importProject: (project) => request('POST', '/api/import', { project }).then((r) => r.project),
  ai: (body) => request('POST', '/api/ai', body),
  exportUrl: (code, format) => `/api/projects/${code}/export?format=${encodeURIComponent(format)}`,
};

/* ------------------------------------------------------------------ */
/* state                                                              */
/* ------------------------------------------------------------------ */

const state = {
  route: { name: 'library' },
  projects: [],
  project: null,
  tab: 'write',
  sceneCode: null,
  categoryCode: null,
  site: null,
  saveStatus: 'idle',
  aiOpen: false,
  aiTask: 'continue',
  aiResult: '',
  aiBusy: false,
  aiNotice: '',
  revisionNumber: null,
};

let saveTimer = null;

/* ------------------------------------------------------------------ */
/* routing                                                            */
/* ------------------------------------------------------------------ */

function parseRoute() {
  const hash = location.hash.replace(/^#\/?/, '');
  if (!hash) return { name: 'library' };
  const parts = hash.split('/');
  if (parts[0] === 'p' && parts[1]) {
    return {
      name: 'project',
      code: parts[1],
      tab: ['write', 'plot', 'plan', 'stats', 'settings'].includes(parts[2]) ? parts[2] : 'write',
      scene: parts[3] ?? null,
    };
  }
  return { name: 'library' };
}

async function onRouteChange() {
  closeModal();
  const route = parseRoute();
  state.route = route;
  if (route.name === 'library') {
    state.project = null;
    await loadLibrary();
    return;
  }
  if (route.tab) state.tab = route.tab;
  if (!state.project || state.project.code !== route.code) {
    try {
      state.project = await api.get(route.code);
      state.sceneCode = null;
    } catch (error) {
      toast(error.message, 'error');
      location.hash = '#/';
      return;
    }
  }
  if (route.scene) state.sceneCode = route.scene;
  render();
}

function navigate(to) {
  if (location.hash === to) onRouteChange();
  else location.hash = to;
}

/* ------------------------------------------------------------------ */
/* persistence helpers                                                */
/* ------------------------------------------------------------------ */

function revision() {
  return currentRevision(state.project, state.revisionNumber);
}

function markDirty() {
  if (!state.project) return;
  state.saveStatus = 'saving';
  updateSaveIndicator();
  clearTimeout(saveTimer);
  saveTimer = setTimeout(saveNow, 700);
}

async function saveNow() {
  if (!state.project) return;
  clearTimeout(saveTimer);
  try {
    state.project.last_update_date = Date.now();
    await api.save(state.project);
    state.saveStatus = 'saved';
  } catch (error) {
    state.saveStatus = 'error';
    toast(`Save failed: ${error.message}`, 'error');
  }
  updateSaveIndicator();
}

function updateSaveIndicator() {
  const node = document.querySelector('[data-save-status]');
  if (!node) return;
  const map = {
    idle: '',
    saving: 'Saving…',
    saved: 'Saved',
    error: 'Not saved',
  };
  node.textContent = map[state.saveStatus] ?? '';
  node.className = `status-pill ${state.saveStatus === 'saving' || state.saveStatus === 'saved' ? 'saving' : ''} ${
    state.saveStatus === 'error' ? 'error' : ''
  }`;
}

function touchScene(scene) {
  markDirty();
  if (scene) state.sceneCode = scene.code;
}

/* ------------------------------------------------------------------ */
/* render root                                                        */
/* ------------------------------------------------------------------ */

function render() {
  clear(app);
  if (state.route.name === 'library') {
    app.append(renderRail(null), renderLibrary());
  } else if (state.project) {
    app.append(renderRail(state.project), renderProject());
  }
  updateSaveIndicator();
}

function renderRail(project) {
  const rev = project ? revision() : null;
  const stats = project ? projectStats(project, state.revisionNumber) : null;
  return el(
    'aside',
    { class: 'rail' },
    el('div', { class: 'brand' }, el('span', { class: 'dot' }), 'Novelist'),
    project
      ? el(
          'nav',
          { class: 'nav' },
          navButton('Write', 'write', `#/p/${project.code}/write`),
          navButton('Plot', 'plot', `#/p/${project.code}/plot`, rev?.categories?.length),
          navButton('Plan', 'plan', `#/p/${project.code}/plan`),
          navButton('Stats', 'stats', `#/p/${project.code}/stats`),
          navButton('Settings', 'settings', `#/p/${project.code}/settings`),
        )
      : el('nav', { class: 'nav' }, navButton('Bookshelf', 'library', '#/', state.projects.length)),
    project ? el('div', { class: 'hint' }, `${(stats?.words ?? 0).toLocaleString()} words · ${stats?.scenes ?? 0} scenes`) : el('div', { class: 'hint' }, 'Offline-first. Everything is stored as .nov files on this machine.'),
    el('div', { class: 'spacer' }),
    project
      ? el(
          'div',
          { class: 'nav' },
          el('button', { class: 'ghost', onclick: () => openAiDrawer() }, '✨ Writing assistant'),
          el('button', { class: 'ghost', onclick: () => openFind() }, 'Find in project'),
        )
      : null,
    el('div', { class: 'hint' }, 'Reimplemented from Novelist.apks · .nov v4'),
  );
}

function navButton(label, key, href, count) {
  return el(
    'button',
    {
      class: state.route.name === 'library' ? (key === 'library' ? 'active' : '') : state.tab === key ? 'active' : '',
      onclick: () => navigate(href),
    },
    label,
    count != null ? el('span', { class: 'count' }, String(count)) : null,
  );
}

/* ------------------------------------------------------------------ */
/* library                                                            */
/* ------------------------------------------------------------------ */

async function loadLibrary() {
  try {
    state.projects = await api.list();
  } catch (error) {
    toast(`Could not load bookshelf: ${error.message}`, 'error');
    state.projects = [];
  }
  render();
}

function renderLibrary() {
  const main = el('main', { class: 'main' });
  main.append(
    el(
      'div',
      { class: 'topbar' },
      el('h1', {}, 'Bookshelf'),
      el('span', { class: 'grow' }),
      el('button', { class: 'primary', onclick: openNewProject }, '+ New project'),
      el('button', { onclick: openImport }, 'Import .nov'),
    ),
  );

  const content = el('div', { class: 'content' });
  if (!state.projects.length) {
    content.append(
      el(
        'div',
        { class: 'empty' },
        el('h3', {}, 'No projects yet'),
        el('p', {}, 'Start from the standard novel template or an empty manuscript, then import an existing .nov backup at any time.'),
        el(
          'div',
          { class: 'row' },
          el('button', { class: 'primary', onclick: openNewProject }, 'Create a project'),
          el('button', { onclick: openImport }, 'Import a .nov file'),
        ),
      ),
    );
  } else {
    const grid = el('div', { class: 'grid' });
    for (const project of state.projects) {
      grid.append(
        el(
          'article',
          { class: 'card' },
          el(
            'div',
            { class: 'cover' },
            project.cover
              ? el('img', { src: `data:image/jpeg;base64,${project.cover}`, alt: '' })
              : el('span', { class: 'initial' }, (project.title || '?').slice(0, 1).toUpperCase()),
          ),
          el(
            'div',
            { class: 'body' },
            el('h3', {}, project.title || 'Untitled'),
            el('p', {}, (project.description || 'No description').slice(0, 140)),
            el(
              'div',
              { class: 'stats' },
              el('span', {}, `${project.words.toLocaleString()} words`),
              el('span', {}, `${project.sections} ch`),
              el('span', {}, `${project.items} plot`),
            ),
          ),
          el(
            'div',
            { class: 'actions' },
            el('button', { class: 'primary small', onclick: () => navigate(`#/p/${project.code}/write`) }, 'Open'),
            el('button', { class: 'small ghost', onclick: () => duplicateProject(project) }, 'Duplicate'),
            el('button', { class: 'small ghost', onclick: () => download(project.code, 'nov') }, 'Export'),
            el('button', { class: 'small danger', onclick: () => deleteProject(project) }, 'Delete'),
          ),
        ),
      );
    }
    content.append(grid);
  }
  main.append(content);
  return main;
}

function openNewProject() {
  const title = el('input', { placeholder: 'e.g. The Lighthouse Code', autofocus: 'true' });
  const description = el('textarea', { rows: 3, placeholder: 'One or two sentences about the story' });
  const template = el(
    'select',
    {},
    el('option', { value: 'standard' }, 'Standard novel (themes, events, characters, locations, props, extras)'),
    el('option', { value: 'empty' }, 'Empty manuscript (one status, no plot categories)'),
  );

  openModal({
    title: 'New project',
    body: el(
      'div',
      { class: 'field' },
      field('Title', title),
      field('Description', description),
      field('Template', template),
      el('p', { class: 'tiny muted' }, 'Chapter 1 and Scene 1 are created automatically so you can start writing immediately.'),
    ),
    footer: [
      el('button', { onclick: closeModal }, 'Cancel'),
      el(
        'button',
        {
          class: 'primary',
          onclick: async () => {
            try {
              const project = await api.create({
                title: title.value.trim() || 'Untitled project',
                description: description.value,
                template: template.value,
              });
              closeModal();
              state.projects = await api.list();
              navigate(`#/p/${project.code}/write`);
            } catch (error) {
              toast(error.message, 'error');
            }
          },
        },
        'Create project',
      ),
    ],
  });
}

function openImport() {
  const input = el('input', { type: 'file', accept: '.nov,application/json' });
  input.addEventListener('change', async () => {
    const file = input.files?.[0];
    if (!file) return;
    try {
      const text = await file.text();
      const project = await api.importProject(JSON.parse(text));
      toast(`Imported “${project.title}”`);
      state.projects = await api.list();
      navigate(`#/p/${project.code}/write`);
    } catch (error) {
      toast(`Import failed: ${error.message}`, 'error');
    }
  });
  input.click();
}

async function duplicateProject(project) {
  try {
    const copy = await api.duplicate(project.code);
    toast(`Duplicated as “${copy.title}”`);
    state.projects = await api.list();
    render();
  } catch (error) {
    toast(error.message, 'error');
  }
}

async function deleteProject(project) {
  const ok = await confirmDialog(`Delete “${project.title || 'Untitled'}”?`, 'The .nov file is removed from this machine. Export it first if you want a copy.');
  if (!ok) return;
  try {
    await api.remove(project.code);
    toast('Project deleted');
    state.projects = await api.list();
    if (state.project?.code === project.code) navigate('#/');
    else render();
  } catch (error) {
    toast(error.message, 'error');
  }
}

function download(code, format) {
  const a = el('a', { href: api.exportUrl(code, format) });
  document.body.append(a);
  a.click();
  a.remove();
}

/* ------------------------------------------------------------------ */
/* project shell                                                      */
/* ------------------------------------------------------------------ */

function renderProject() {
  const project = state.project;
  const viewingSnapshot = state.revisionNumber != null;
  const stats = projectStats(project, state.revisionNumber);
  const main = el('main', { class: 'main' });

  const titleInput = el('input', {
    value: project.title,
    class: 'scene-title',
    disabled: viewingSnapshot,
    style: { fontFamily: 'var(--serif)', fontSize: '1.1rem', border: 'none', background: 'transparent', maxWidth: '420px' },
    oninput: () => {
      project.title = titleInput.value;
      markDirty();
    },
  });

  main.append(
    el(
      'div',
      { class: 'topbar' },
      el('button', { class: 'ghost small', onclick: () => navigate('#/') }, '← Library'),
      titleInput,
      el('span', { class: 'status-pill', dataset: { saveStatus: '1' } }, ''),
      el('span', { class: 'grow' }),
      el('span', { class: 'meta' }, `${stats.words.toLocaleString()} words`),
      el('button', { class: 'ghost small', onclick: () => openFind() }, 'Find'),
      el('button', { class: 'ghost small', onclick: () => openExportMenu() }, 'Export'),
      el('button', { class: 'primary small', onclick: () => openAiDrawer() }, '✨ Assist'),
    ),
  );

  if (viewingSnapshot) {
    main.append(
      el(
        'div',
        { class: 'banner' },
        el('span', {}, `Viewing snapshot #${state.revisionNumber} — read-only. Restore it from Settings to make it the draft.`),
        el('span', { class: 'grow' }),
        el('button', { class: 'small', onclick: () => { state.revisionNumber = null; render(); } }, 'Back to latest draft'),
      ),
    );
  }

  const content = el('div', { class: 'content' });
  if (viewingSnapshot) {
    // A historical revision must never be mutated through the editor.
    content.setAttribute('inert', '');
    content.style.opacity = '0.82';
  }
  if (state.tab === 'write') content.append(renderWrite());
  else if (state.tab === 'plot') content.append(renderPlot());
  else if (state.tab === 'plan') content.append(renderPlan());
  else if (state.tab === 'stats') content.append(renderStats());
  else content.append(renderSettings());
  main.append(content);

  if (state.aiOpen) main.append(renderAiDrawer());
  return main;
}

/* ------------------------------------------------------------------ */
/* write tab                                                          */
/* ------------------------------------------------------------------ */

function ensureSceneSelection() {
  const rev = revision();
  if (!rev) return null;
  if (state.sceneCode) {
    const found = sceneByCode(rev, state.sceneCode);
    if (found) return found;
  }
  const first = orderedScenes(rev)[0]?.scene ?? rev.scenes[0] ?? null;
  state.sceneCode = first?.code ?? null;
  return first;
}

function renderWrite() {
  const rev = revision();
  const scene = ensureSceneSelection();
  const container = el('div', { class: 'workspace' });

  /* chapters panel */
  const chapters = el('div', { class: 'panel' });
  chapters.append(
    el(
      'header',
      {},
      el('span', {}, 'Manuscript'),
      el('span', { class: 'grow' }),
      el('button', { class: 'small ghost', onclick: addChapter }, '+ Chapter'),
    ),
  );
  const list = el('div', { class: 'inner chapters' });
  const sections = [...(rev.sections ?? [])].sort((a, b) => a.ranking - b.ranking);
  for (const section of sections) {
    const chapter = el('div', { class: 'chapter' });
    const head = el(
      'div',
      { class: 'chapter-head', onclick: () => toggleChapter(section.code) },
      el('span', { class: 'title' }, section.title || 'Untitled chapter'),
      el(
        'button',
        {
          class: 'small ghost',
          title: 'Add scene to this chapter',
          onclick: (event) => {
            event.stopPropagation();
            addScene(section.code);
          },
        },
        '+',
      ),
    );
    chapter.append(head);

    if (state.expandedSections !== false) {
      const scenes = el('div', { class: 'scenes' });
      const entries = [...(section.section_scenes ?? [])].sort((a, b) => a.ranking - b.ranking);
      for (const entry of entries) {
        const sc = sceneByCode(rev, entry.code);
        if (!sc) continue;
        const st = statusByCode(rev, sc.status);
        const link = el(
          'div',
          {
            class: `scene-link${sc.code === scene?.code ? ' active' : ''}`,
            onclick: () => selectScene(sc.code),
          },
          el('span', { class: 'swatch', style: { background: st ? hexFromArgb(st.color) : '#4a5762' } }),
          el('span', { style: { overflow: 'hidden', textOverflow: 'ellipsis', whiteSpace: 'nowrap' } }, sc.title || 'Untitled scene'),
          el('span', { class: 'words' }, String(wordCount(sc.text))),
        );
        scenes.append(link);
      }
      if (!entries.length) scenes.append(el('p', { class: 'tiny muted' }, 'No scenes yet.'));
      chapter.append(scenes);
    }
    list.append(chapter);
  }

  const loose = (rev.scenes ?? []).filter(
    (sc) => !sections.some((se) => (se.section_scenes ?? []).some((e) => e.code === sc.code)),
  );
  if (loose.length) {
    list.append(el('p', { class: 'tiny muted' }, 'Unassigned scenes'));
    for (const sc of loose) {
      list.append(
        el(
          'div',
          {
            class: `scene-link${sc.code === scene?.code ? ' active' : ''}`,
            onclick: () => selectScene(sc.code),
          },
          el('span', {}, sc.title),
          el('span', { class: 'words' }, String(wordCount(sc.text))),
        ),
      );
    }
  }
  chapters.append(list);
  container.append(chapters);

  /* editor */
  const editor = el('div', { class: 'panel editor' });
  if (!scene) {
    editor.append(
      el('div', { class: 'inner' }, el('div', { class: 'empty' }, el('h3', {}, 'No scene selected'), el('p', {}, 'Add a chapter and a scene to start writing.'), el('button', { class: 'primary', onclick: () => addChapter() }, 'Add chapter'))),
    );
  } else {
    const st = statusByCode(rev, scene.status);
    editor.append(
      el(
        'header',
        {},
        el('span', {}, st ? st.title : 'No status'),
        el('span', { class: 'grow' }),
        el('button', { class: 'small ghost', onclick: () => moveScene(scene.code, -1) }, '↑'),
        el('button', { class: 'small ghost', onclick: () => moveScene(scene.code, 1) }, '↓'),
        el('button', { class: 'small ghost', onclick: () => openSceneMeta(scene) }, 'Scene details'),
      ),
    );

    const titleInput = el('input', {
      class: 'scene-title',
      value: scene.title,
      placeholder: 'Scene title',
      oninput: () => {
        scene.title = titleInput.value;
        markDirty();
        refreshChapterList();
      },
    });
    const synopsisInput = el('input', {
      class: 'scene-synopsis',
      value: scene.synopsis,
      placeholder: 'One-line synopsis (only you see this)',
      oninput: () => {
        scene.synopsis = synopsisInput.value;
        markDirty();
      },
    });
    const textarea = el('textarea', {
      class: 'manuscript',
      spellcheck: 'true',
      placeholder: 'Begin writing…',
    });
    textarea.value = scene.text ?? '';
    const counter = el('span', {}, `${wordCount(scene.text)} words`);

    textarea.addEventListener('input', () => {
      scene.text = textarea.value;
      counter.textContent = `${wordCount(scene.text)} words`;
      markDirty();
    });
    textarea.addEventListener('blur', () => refreshSaveLabel());

    const statusSelect = el(
      'select',
      {
        style: { width: 'auto' },
        onchange: () => {
          scene.status = statusSelect.value;
          markDirty();
          render();
        },
      },
      ...(rev.statuses ?? []).map((s) =>
        el('option', { value: s.code, selected: s.code === scene.status }, s.title),
      ),
    );

    editor.append(
      el(
        'div',
        { class: 'inner' },
        titleInput,
        synopsisInput,
        textarea,
        el(
          'footer',
          {},
          counter,
          el('span', {}, '·'),
          statusSelect,
          el('span', { class: 'grow' }),
          el('button', { class: 'small ghost', onclick: () => openAiDrawer('continue') }, '✨ Continue'),
          el('span', { class: 'tiny muted' }, 'Ctrl/⌘+S to save'),
        ),
      ),
    );
  }
  container.append(editor);
  container.append(renderSceneAside(scene));
  return container;
}

function refreshChapterList() {
  const rev = revision();
  const links = document.querySelectorAll('.scene-link.active span:nth-child(2)');
  const scene = rev ? sceneByCode(rev, state.sceneCode) : null;
  if (links[0] && scene) links[0].textContent = scene.title || 'Untitled scene';
}

function refreshSaveLabel() {
  updateSaveIndicator();
}

function selectScene(code) {
  state.sceneCode = code;
  navigate(`#/p/${state.project.code}/write/${code}`);
}

function toggleChapter() {
  state.expandedSections = state.expandedSections === false;
  render();
}

function renderSceneAside(scene) {
  const project = state.project;
  const rev = revision();
  if (!scene) return el('div');
  const aside = el('div', {});

  const info = el('div', { class: 'panel' });
  info.append(el('header', {}, 'Scene details', el('span', { class: 'grow' })));
  const body = el('div', { class: 'inner detail-list' });

  /* subplots */
  body.append(el('div', { class: 'tiny muted' }, 'Subplots'));
  const subWrap = el('div', { class: 'detail-list' });
  for (const link of scene.scene_subplots ?? []) {
    const sp = (rev.subplots ?? []).find((s) => s.code === link.subplot);
    subWrap.append(
      el(
        'div',
        { class: 'row' },
        el('span', { class: 'chip' }, sp?.title ?? 'Unknown subplot'),
        el('span', { class: 'grow' }),
        el(
          'button',
          {
            class: 'small ghost',
            onclick: () => {
              scene.scene_subplots = scene.scene_subplots.filter((x) => x !== link);
              markDirty();
              render();
            },
          },
          '×',
        ),
      ),
    );
    if (link.synopsis) subWrap.append(el('p', { class: 'tiny muted', style: { margin: '0 0 .3rem' } }, link.synopsis));
  }
  const addSubplot = el(
    'select',
    {
      onchange: () => {
        if (!addSubplot.value) return;
        scene.scene_subplots = [...(scene.scene_subplots ?? []), { subplot: addSubplot.value, synopsis: '' }];
        markDirty();
        render();
      },
    },
    el('option', { value: '' }, '+ add subplot'),
    ...(rev.subplots ?? []).map((s) => el('option', { value: s.code }, s.title)),
  );
  subWrap.append(addSubplot);
  body.append(subWrap);

  /* linked plot items */
  body.append(el('div', { class: 'tiny muted', style: { marginTop: '.4rem' } }, 'Plot items in scene'));
  const itemWrap = el('div', { class: 'chips' });
  for (const link of scene.scene_items ?? []) {
    const hit = itemByCode(rev, link.code);
    itemWrap.append(
      el(
        'span',
        { class: 'chip' },
        hit?.item?.title ?? 'Removed item',
        el(
          'button',
          {
            onclick: () => {
              scene.scene_items = scene.scene_items.filter((x) => x.code !== link.code);
              markDirty();
              render();
            },
          },
          '×',
        ),
      ),
    );
  }
  if (!scene.scene_items?.length) itemWrap.append(el('span', { class: 'tiny muted' }, 'None linked'));
  body.append(itemWrap);

  const addItem = el(
    'select',
    {
      onchange: () => {
        if (!addItem.value) return;
        scene.scene_items = [...(scene.scene_items ?? []), { code: addItem.value }];
        markDirty();
        render();
      },
    },
    el('option', { value: '' }, '+ link plot item'),
    ...(rev.categories ?? []).flatMap((cat) =>
      (cat.items ?? []).map((item) => el('option', { value: item.code }, `${cat.title}: ${item.title}`)),
    ),
  );
  body.append(addItem);

  /* notes */
  body.append(el('div', { class: 'tiny muted', style: { marginTop: '.4rem' } }, 'Notes'));
  for (const [index, note] of (scene.scene_notes ?? []).entries()) {
    const input = el('input', { value: note.text, placeholder: 'Note' });
    input.addEventListener('input', () => {
      note.text = input.value;
      markDirty();
    });
    body.append(
      el(
        'div',
        { class: 'row' },
        input,
        el(
          'button',
          {
            class: 'small ghost',
            onclick: () => {
              scene.scene_notes.splice(index, 1);
              markDirty();
              render();
            },
          },
          '×',
        ),
      ),
    );
  }
  body.append(
    el(
      'button',
      {
        class: 'small ghost',
        onclick: () => {
          scene.scene_notes = [...(scene.scene_notes ?? []), { text: '', ranking: (scene.scene_notes?.length ?? 0) + 1 }];
          markDirty();
          render();
        },
      },
      '+ Note',
    ),
  );

  body.append(
    el('div', { style: { marginTop: '1rem', display: 'flex', gap: '.4rem', flexWrap: 'wrap' } },
      el('button', { class: 'small ghost', onclick: () => openSceneMeta(scene) }, 'Edit fields'),
      el(
        'button',
        {
          class: 'small danger',
          onclick: async () => {
            if (!(await confirmDialog('Delete this scene?', 'This removes the scene from the manuscript.'))) return;
            deleteScene(scene.code);
          },
        },
        'Delete scene',
      ),
    ),
  );

  info.append(body);
  aside.append(info);
  return aside;
}

function addChapter() {
  const rev = revision();
  const ranking = (rev.sections?.length ?? 0) + 1;
  const section = newSection({ title: `Chapter ${ranking}`, ranking });
  rev.sections.push(section);
  markDirty();
  render();
}

function addScene(sectionCode) {
  const rev = revision();
  const section = sectionByCode(rev, sectionCode);
  const scene = newScene({
    title: `Scene ${(section?.section_scenes?.length ?? 0) + 1}`,
    status: rev.statuses?.[0]?.code ?? '',
    ranking: (section?.section_scenes?.length ?? 0) + 1,
  });
  rev.scenes.push(scene);
  if (section) section.section_scenes.push({ code: scene.code, ranking: section.section_scenes.length + 1 });
  state.sceneCode = scene.code;
  markDirty();
  navigate(`#/p/${state.project.code}/write/${scene.code}`);
}

function deleteScene(code) {
  const rev = revision();
  rev.scenes = rev.scenes.filter((s) => s.code !== code);
  for (const section of rev.sections) {
    section.section_scenes = section.section_scenes.filter((e) => e.code !== code);
  }
  if (state.sceneCode === code) state.sceneCode = null;
  markDirty();
  render();
}

function moveScene(code, delta) {
  const rev = revision();
  const section = rev.sections.find((se) => (se.section_scenes ?? []).some((e) => e.code === code));
  if (!section) return;
  const entries = [...section.section_scenes].sort((a, b) => a.ranking - b.ranking);
  const index = entries.findIndex((e) => e.code === code);
  const target = index + delta;
  if (target < 0 || target >= entries.length) return;
  [entries[index], entries[target]] = [entries[target], entries[index]];
  entries.forEach((entry, i) => {
    entry.ranking = i + 1;
  });
  section.section_scenes = entries;
  markDirty();
  render();
}

function openSceneMeta(scene) {
  const rev = revision();
  const title = el('input', { value: scene.title });
  const synopsis = el('textarea', { rows: 4 });
  synopsis.value = scene.synopsis ?? '';
  const status = el(
    'select',
    {},
    el('option', { value: '' }, 'No status'),
    ...(rev.statuses ?? []).map((s) => el('option', { value: s.code, selected: s.code === scene.status }, s.title)),
  );

  const text = el('textarea', { rows: 10 });
  text.value = scene.text ?? '';

  openModal({
    title: 'Scene details',
    body: el('div', { style: { display: 'flex', flexDirection: 'column', gap: '.8rem' } },
      field('Title', title),
      field('Synopsis', synopsis),
      field('Status', status),
      field('Manuscript', text),
    ),
    footer: [
      el('button', { onclick: closeModal }, 'Cancel'),
      el(
        'button',
        {
          class: 'primary',
          onclick: () => {
            scene.title = title.value;
            scene.synopsis = synopsis.value;
            scene.status = status.value;
            scene.text = text.value;
            markDirty();
            closeModal();
            render();
          },
        },
        'Apply',
      ),
    ],
  });
}

/* ------------------------------------------------------------------ */
/* plot tab                                                           */
/* ------------------------------------------------------------------ */

function renderPlot() {
  const rev = revision();
  const wrap = el('div', {});
  const categories = [...(rev.categories ?? [])].sort((a, b) => a.ranking - b.ranking);
  if (!state.categoryCode || !categories.some((c) => c.code === state.categoryCode)) {
    state.categoryCode = categories[0]?.code ?? null;
  }
  const active = categories.find((c) => c.code === state.categoryCode) ?? null;

  wrap.append(
    el(
      'div',
      { class: 'page-head' },
      el('h2', {}, 'Plot'),
      el('span', { class: 'grow' }),
      el('button', { class: 'small', onclick: addCategory }, '+ Category'),
      active ? el('button', { class: 'primary small', onclick: () => editItem(null, active.code) }, '+ Item') : null,
    ),
  );

  const tabs = el('div', { class: 'cat-tabs' });
  for (const cat of categories) {
    tabs.append(
      el(
        'button',
        {
          class: cat.code === active?.code ? 'active' : '',
          onclick: () => {
            state.categoryCode = cat.code;
            render();
          },
        },
        cat.title,
        el('span', { class: 'count', style: { marginLeft: '.4rem' } }, String(cat.items?.length ?? 0)),
      ),
    );
  }
  wrap.append(tabs);

  if (!active) {
    wrap.append(
      el('div', { class: 'empty' }, el('h3', {}, 'No plot categories'), el('p', {}, 'Categories group characters, locations, props, themes and events for this project.'), el('button', { class: 'primary', onclick: addCategory }, 'Add category')),
    );
    return wrap;
  }

  const grid = el('div', { class: 'item-grid' });
  const items = [...(active.items ?? [])].sort((a, b) => a.ranking - b.ranking);
  for (const item of items) {
    const st = statusByCode(rev, item.status);
    grid.append(
      el(
        'button',
        { class: 'item-card', style: { borderLeftColor: hexFromArgb(active.color) }, onclick: () => editItem(item, active.code) },
        el('h4', {}, item.title),
        el('p', {}, (item.synopsis || 'No synopsis').slice(0, 120)),
        el(
          'div',
          { class: 'meta' },
          st ? el('span', {}, st.title) : null,
          item.item_metadatas?.length ? el('span', {}, `${item.item_metadatas.length} fields`) : null,
          item.item_relationships?.length ? el('span', {}, `${item.item_relationships.length} relations`) : null,
        ),
      ),
    );
  }
  if (!items.length) {
    grid.append(el('div', { class: 'empty', style: { gridColumn: '1 / -1' } }, el('p', {}, `No ${active.title.toLowerCase()} yet.`), el('button', { class: 'primary', onclick: () => editItem(null, active.code) }, `Add ${active.title.toLowerCase().replace(/s$/, '')}`)));
  }
  wrap.append(grid);

  const meta = el('div', { class: 'panel', style: { marginTop: '1rem' } });
  meta.append(el('header', {}, 'Metadata fields'));
  const inner = el('div', { class: 'inner chips' });
  for (const group of active.metadata_groups ?? []) {
    for (const element of group.metadata_elements ?? []) {
      inner.append(el('span', { class: 'chip' }, `${group.title}: ${element.title}`));
    }
  }
  if (!inner.childNodes.length) inner.append(el('span', { class: 'tiny muted' }, 'No metadata fields in this category.'));
  inner.append(
    el(
      'button',
      {
        class: 'small ghost',
        onclick: () => openMetadataEditor(active),
      },
      'Edit fields',
    ),
  );
  meta.append(inner);
  wrap.append(meta);
  return wrap;
}

function addCategory() {
  const rev = revision();
  const name = prompt('Category name (e.g. Characters)');
  if (!name) return;
  const cat = {
    code: newCode(),
    title: name,
    color: 0xff8168c8,
    ranking: (rev.categories?.length ?? 0) + 1,
    metadata_groups: [],
    items: [],
  };
  rev.categories = [...(rev.categories ?? []), cat];
  state.categoryCode = cat.code;
  markDirty();
  render();
}

function openMetadataEditor(category) {
  const groupsWrap = el('div', { style: { display: 'flex', flexDirection: 'column', gap: '.6rem' } });

  const draw = () => {
    clear(groupsWrap);
    for (const group of category.metadata_groups ?? []) {
      const fieldList = el('div', { class: 'chips' });
      for (const element of group.metadata_elements ?? []) {
        fieldList.append(
          el(
            'span',
            { class: 'chip' },
            element.title,
            el(
              'button',
              {
                onclick: () => {
                  group.metadata_elements = group.metadata_elements.filter((e) => e !== element);
                  markDirty();
                  draw();
                },
              },
              '×',
            ),
          ),
        );
      }
      const newField = el('input', { placeholder: 'New field name', style: { maxWidth: '220px' } });
      fieldList.append(
        newField,
        el(
          'button',
          {
            class: 'small',
            onclick: () => {
              if (!newField.value.trim()) return;
              group.metadata_elements = [
                ...(group.metadata_elements ?? []),
                { code: newCode(), title: newField.value.trim(), ranking: (group.metadata_elements?.length ?? 0) + 1, is_relevant: true },
              ];
              markDirty();
              draw();
            },
          },
          'Add field',
        ),
      );
      groupsWrap.append(el('div', { class: 'field' }, el('label', {}, group.title), fieldList));
    }
  };
  draw();

  const newGroup = el('input', { placeholder: 'New group name' });
  openModal({
    title: `Metadata · ${category.title}`,
    body: el('div', { style: { display: 'flex', flexDirection: 'column', gap: '.8rem' } },
      groupsWrap,
      el('div', { class: 'field' }, el('label', {}, 'Add group'), el('div', { class: 'row' }, newGroup,
        el('button', { class: 'small', onclick: () => {
          if (!newGroup.value.trim()) return;
          category.metadata_groups = [...(category.metadata_groups ?? []), { code: newCode(), title: newGroup.value.trim(), ranking: (category.metadata_groups?.length ?? 0) + 1, metadata_elements: [] }];
          markDirty();
          newGroup.value = '';
          draw();
        } }, 'Add group'))),
    ),
    footer: [el('button', { class: 'primary', onclick: () => { closeModal(); render(); } }, 'Done')],
  });
}

function editItem(item, categoryCode) {
  const rev = revision();
  const category = rev.categories.find((c) => c.code === categoryCode);
  if (!category) return;
  const isNew = !item;
  const draft = item ? deepClone(item) : newItem({ status: rev.statuses?.[0]?.code ?? '' });

  const title = el('input', { value: draft.title });
  const synopsis = el('textarea', { rows: 4 });
  synopsis.value = draft.synopsis ?? '';
  const status = el(
    'select',
    {},
    el('option', { value: '' }, 'No status'),
    ...(rev.statuses ?? []).map((s) => el('option', { value: s.code, selected: s.code === draft.status }, s.title)),
  );

  /* names */
  const namesWrap = el('div', { class: 'chips' });
  const drawNames = () => {
    clear(namesWrap);
    (draft.item_names ?? []).forEach((name, index) => {
      const input = el('input', { value: name.name, style: { maxWidth: '160px' } });
      input.addEventListener('input', () => {
        name.name = input.value;
      });
      namesWrap.append(
        el('span', { class: 'row' }, input, el('button', { class: 'small ghost', onclick: () => { draft.item_names.splice(index, 1); drawNames(); } }, '×')),
      );
    });
    namesWrap.append(
      el('button', { class: 'small ghost', onclick: () => { draft.item_names = [...(draft.item_names ?? []), { code: newCode(), name: '', ranking: (draft.item_names?.length ?? 0) + 1 }]; drawNames(); } }, '+ Name'),
    );
  };
  drawNames();

  /* metadata */
  const metaWrap = el('div', { style: { display: 'flex', flexDirection: 'column', gap: '.35rem' } });
  const elements = (category.metadata_groups ?? []).flatMap((g) =>
    (g.metadata_elements ?? []).map((e) => ({ ...e, group: g.title })),
  );
  for (const element of elements) {
    const existing = (draft.item_metadatas ?? []).find((m) => m.metadata_element === element.code);
    const input = el('input', { value: existing?.value ?? '', placeholder: element.title });
    input.addEventListener('input', () => {
      draft.item_metadatas = (draft.item_metadatas ?? []).filter((m) => m.metadata_element !== element.code);
      if (input.value.trim()) draft.item_metadatas.push({ metadata_element: element.code, value: input.value });
    });
    metaWrap.append(field(`${element.group} · ${element.title}`, input));
  }
  if (!elements.length) metaWrap.append(el('p', { class: 'tiny muted' }, 'This category has no metadata fields.'));

  /* relationships */
  const relWrap = el('div', { style: { display: 'flex', flexDirection: 'column', gap: '.4rem' } });
  const allItems = (rev.categories ?? []).flatMap((cat) =>
    (cat.items ?? []).filter((i) => i.code !== draft.code).map((i) => ({ code: i.code, label: `${cat.title}: ${i.title}` })),
  );
  const drawRelations = () => {
    clear(relWrap);
    (draft.item_relationships ?? []).forEach((rel, index) => {
      const target = el(
        'select',
        {},
        el('option', { value: '' }, 'Choose item'),
        ...allItems.map((i) => el('option', { value: i.code, selected: i.code === rel.other_item }, i.label)),
      );
      target.addEventListener('change', () => {
        rel.other_item = target.value;
      });
      const desc = el('input', { value: rel.description, placeholder: 'e.g. Brother to' });
      desc.addEventListener('input', () => {
        rel.description = desc.value;
      });
      relWrap.append(
        el('div', { class: 'row' }, target, desc, el('button', { class: 'small ghost', onclick: () => { draft.item_relationships.splice(index, 1); drawRelations(); } }, '×')),
      );
    });
    relWrap.append(
      el('button', { class: 'small ghost', onclick: () => { draft.item_relationships = [...(draft.item_relationships ?? []), { other_item: '', description: '', ranking: (draft.item_relationships?.length ?? 0) + 1, is_relevant: true }]; drawRelations(); } }, '+ Relationship'),
    );
  };
  drawRelations();

  /* notes */
  const notesWrap = el('div', { style: { display: 'flex', flexDirection: 'column', gap: '.3rem' } });
  const drawNotes = () => {
    clear(notesWrap);
    (draft.item_notes ?? []).forEach((note, index) => {
      const input = el('input', { value: note.text, placeholder: 'Note' });
      input.addEventListener('input', () => {
        note.text = input.value;
      });
      notesWrap.append(el('div', { class: 'row' }, input, el('button', { class: 'small ghost', onclick: () => { draft.item_notes.splice(index, 1); drawNotes(); } }, '×')));
    });
    notesWrap.append(el('button', { class: 'small ghost', onclick: () => { draft.item_notes = [...(draft.item_notes ?? []), { text: '', ranking: (draft.item_notes?.length ?? 0) + 1 }]; drawNotes(); } }, '+ Note'));
  };
  drawNotes();

  openModal({
    title: isNew ? `New ${category.title.replace(/s$/, '')}` : draft.title,
    body: el(
      'div',
      { style: { display: 'flex', flexDirection: 'column', gap: '.9rem' } },
      field('Title', title),
      field('Synopsis', synopsis),
      field('Status', status),
      field('Also known as', namesWrap),
      el('fieldset', {}, el('legend', {}, 'Metadata'), metaWrap),
      el('fieldset', {}, el('legend', {}, 'Relationships'), relWrap),
      el('fieldset', {}, el('legend', {}, 'Notes'), notesWrap),
    ),
    footer: [
      !isNew ? el('button', { class: 'danger', onclick: () => {
        category.items = category.items.filter((i) => i.code !== draft.code);
        for (const sc of rev.scenes) sc.scene_items = (sc.scene_items ?? []).filter((x) => x.code !== draft.code);
        markDirty();
        closeModal();
        render();
      } }, 'Delete') : el('span'),
      el('span', { class: 'grow' }),
      el('button', { onclick: closeModal }, 'Cancel'),
      el(
        'button',
        {
          class: 'primary',
          onclick: () => {
            draft.title = title.value.trim() || 'Untitled item';
            draft.synopsis = synopsis.value;
            draft.status = status.value;
            if (isNew) category.items = [...(category.items ?? []), draft];
            else Object.assign(item, draft);
            markDirty();
            closeModal();
            render();
          },
        },
        isNew ? 'Create' : 'Save',
      ),
    ],
  });
}

/* ------------------------------------------------------------------ */
/* plan tab                                                           */
/* ------------------------------------------------------------------ */

function renderPlan() {
  const rev = revision();
  const wrap = el('div', {});
  wrap.append(
    el('div', { class: 'page-head' }, el('h2', {}, 'Plan'), el('span', { class: 'grow' }),
      el('button', { class: 'small', onclick: () => download(state.project.code, 'md') }, 'Export outline (Markdown)')),
  );

  const table = el('table', { class: 'grid-table' });
  table.append(
    el('thead', {}, el('tr', {},
      el('th', {}, 'Chapter'), el('th', {}, 'Scene'), el('th', {}, 'Status'), el('th', {}, 'Words'), el('th', {}, 'Synopsis'))),
  );
  const tbody = el('tbody', {});
  let lastSection = null;
  for (const { scene, section } of orderedScenes(rev)) {
    const st = statusByCode(rev, scene.status);
    const synopsis = el('input', { value: scene.synopsis ?? '', placeholder: '—' });
    synopsis.addEventListener('input', () => {
      scene.synopsis = synopsis.value;
      markDirty();
    });
    tbody.append(
      el('tr', {},
        el('td', { class: 'muted' }, section && section.code !== lastSection ? section.title : ''),
        el('td', {}, el('button', { class: 'ghost small', onclick: () => selectScene(scene.code) }, scene.title || 'Untitled scene')),
        el('td', {}, st ? st.title : '—'),
        el('td', {}, String(wordCount(scene.text))),
        el('td', {}, synopsis),
      ),
    );
    lastSection = section?.code ?? null;
  }
  if (!tbody.childNodes.length) {
    tbody.append(el('tr', {}, el('td', { colspan: 5, class: 'muted' }, 'No scenes yet.')));
  }
  table.append(tbody);
  wrap.append(table);
  return wrap;
}

/* ------------------------------------------------------------------ */
/* stats tab                                                          */
/* ------------------------------------------------------------------ */

function renderStats() {
  const project = state.project;
  const stats = projectStats(project, state.revisionNumber);
  const wrap = el('div', {});
  wrap.append(el('div', { class: 'page-head' }, el('h2', {}, 'Statistics'), el('span', { class: 'grow' }),
    el('button', { class: 'small ghost', onclick: () => { recordProgress(project); markDirty(); render(); } }, 'Record today')));

  wrap.append(
    el('div', { class: 'stat-cards' },
      statCard(stats.words.toLocaleString(), 'Words'),
      statCard(String(stats.scenes), 'Scenes'),
      statCard(String(stats.sections), 'Chapters'),
      statCard(String(stats.items), 'Plot items'),
      statCard(String(stats.words ? Math.round(stats.words / 250) : 0), 'Pages (250 w)'),
    ),
  );

  const statusPanel = el('div', { class: 'panel' });
  statusPanel.append(el('header', {}, 'Scenes by status'));
  const statusBody = el('div', { class: 'inner' });
  const maxStatus = Math.max(1, ...stats.statuses.map((s) => s.count));
  for (const st of stats.statuses) {
    statusBody.append(
      el('div', { class: 'bar' },
        el('span', { class: 'label' }, st.title),
        el('span', { class: 'track' }, el('span', { class: 'fill', style: { width: `${(st.count / maxStatus) * 100}%`, background: hexFromArgb(st.color) } })),
        el('span', { class: 'n' }, String(st.count)),
      ),
    );
  }
  if (!stats.statuses.length) statusBody.append(el('p', { class: 'tiny muted' }, 'No statuses defined.'));
  statusPanel.append(statusBody);
  wrap.append(statusPanel);

  const sectionPanel = el('div', { class: 'panel' });
  sectionPanel.append(el('header', {}, 'Words per chapter'));
  const sectionBody = el('div', { class: 'inner' });
  const maxSection = Math.max(1, ...stats.perSection.map((s) => s.words));
  for (const s of stats.perSection) {
    sectionBody.append(
      el('div', { class: 'bar' },
        el('span', { class: 'label' }, s.title),
        el('span', { class: 'track' }, el('span', { class: 'fill', style: { width: `${(s.words / maxSection) * 100}%` } })),
        el('span', { class: 'n' }, String(s.words)),
      ),
    );
  }
  if (!stats.perSection.length) sectionBody.append(el('p', { class: 'tiny muted' }, 'No chapters yet.'));
  sectionPanel.append(sectionBody);
  wrap.append(sectionPanel);

  if (stats.progress.length > 1) {
    const panel = el('div', { class: 'panel' });
    panel.append(el('header', {}, 'Daily word count'));
    const values = stats.progress.map((p) => p.word_count);
    const width = 640;
    const height = 140;
    const max = Math.max(...values, 1);
    const points = values
      .map((v, i) => `${(i / (values.length - 1)) * width},${height - (v / max) * (height - 12) - 6}`)
      .join(' ');
    panel.append(
      el('div', { class: 'inner' },
        el('div', { html: `<svg viewBox="0 0 ${width} ${height}" width="100%" height="${height}" preserveAspectRatio="none"><polyline fill="none" stroke="#c9a227" stroke-width="2" points="${points}"/></svg>` }),
        el('p', { class: 'tiny muted' }, `${stats.progress.length} recorded days · peak ${max.toLocaleString()} words`),
      ),
    );
    wrap.append(panel);
  }
  return wrap;
}

function statCard(value, label) {
  return el('div', { class: 'stat' }, el('div', { class: 'value' }, value), el('div', { class: 'label' }, label));
}

/* ------------------------------------------------------------------ */
/* settings tab                                                       */
/* ------------------------------------------------------------------ */

function renderSettings() {
  const project = state.project;
  const rev = revision();
  const wrap = el('div', {});
  wrap.append(el('div', { class: 'page-head' }, el('h2', {}, 'Settings')));

  /* book metadata */
  const title = el('input', { value: project.title });
  const description = el('textarea', { rows: 4 });
  description.value = project.description ?? '';
  const toc = el('input', { type: 'checkbox', style: { width: 'auto' }, checked: project.show_table_of_contents });
  const indent = el('input', { type: 'checkbox', style: { width: 'auto' }, checked: project.apply_automatic_indentation });

  const book = el('div', { class: 'panel' });
  book.append(el('header', {}, 'Book'));
  book.append(
    el('div', { class: 'inner', style: { display: 'flex', flexDirection: 'column', gap: '.7rem' } },
      el('div', { class: 'field-row' }, field('Title', title), field('Description', description)),
      el('label', { class: 'row tiny' }, toc, ' Show table of contents in compiled output'),
      el('label', { class: 'row tiny' }, indent, ' Automatic paragraph indentation'),
      el('div', { class: 'row' },
        el('button', { class: 'small primary', onclick: () => {
          project.title = title.value.trim() || 'Untitled project';
          project.description = description.value;
          project.show_table_of_contents = toc.checked;
          project.apply_automatic_indentation = indent.checked;
          markDirty();
          toast('Book settings saved');
          render();
        } }, 'Save settings'),
        el('span', { class: 'grow' }),
        projCoverControls(project),
      ),
    ),
  );
  wrap.append(book);

  /* statuses */
  const statusPanel = el('div', { class: 'panel' });
  statusPanel.append(el('header', {}, 'Statuses', el('span', { class: 'grow' }),
    el('button', { class: 'small ghost', onclick: () => {
      rev.statuses = [...(rev.statuses ?? []), { code: newCode(), title: 'New status', color: 0xff888888, ranking: (rev.statuses?.length ?? 0) + 1 }];
      markDirty();
      render();
    } }, '+ Status')));
  const statusBody = el('div', { class: 'inner', style: { display: 'flex', flexDirection: 'column', gap: '.4rem' } });
  for (const [index, st] of (rev.statuses ?? []).entries()) {
    const name = el('input', { value: st.title, style: { maxWidth: '240px' } });
    name.addEventListener('input', () => {
      st.title = name.value;
      markDirty();
    });
    const color = el('input', { type: 'color', value: hexFromArgb(st.color), style: { width: '44px', padding: '0', height: '32px' } });
    color.addEventListener('input', () => {
      st.color = (0xff000000 | parseInt(color.value.slice(1), 16)) >>> 0;
      markDirty();
    });
    statusBody.append(
      el('div', { class: 'row' }, name, color,
        el('button', { class: 'small ghost', onclick: () => {
          const replacement = rev.statuses[index + 1]?.code ?? rev.statuses[index - 1]?.code ?? '';
          for (const sc of rev.scenes) if (sc.status === st.code) sc.status = replacement;
          for (const cat of rev.categories ?? []) for (const item of cat.items ?? []) if (item.status === st.code) item.status = replacement;
          rev.statuses = rev.statuses.filter((s) => s !== st);
          markDirty();
          render();
        } }, 'Delete')),
    );
  }
  statusPanel.append(statusBody);
  wrap.append(statusPanel);

  /* subplots */
  const subPanel = el('div', { class: 'panel' });
  subPanel.append(el('header', {}, 'Subplots', el('span', { class: 'grow' }),
    el('button', { class: 'small ghost', onclick: () => {
      rev.subplots = [...(rev.subplots ?? []), { code: newCode(), title: 'New subplot', color: 0xff888888, ranking: (rev.subplots?.length ?? 0) + 1 }];
      markDirty();
      render();
    } }, '+ Subplot')));
  const subBody = el('div', { class: 'inner', style: { display: 'flex', flexDirection: 'column', gap: '.4rem' } });
  for (const sp of rev.subplots ?? []) {
    const name = el('input', { value: sp.title, style: { maxWidth: '300px' } });
    name.addEventListener('input', () => {
      sp.title = name.value;
      markDirty();
    });
    const color = el('input', { type: 'color', value: hexFromArgb(sp.color), style: { width: '44px', padding: '0', height: '32px' } });
    color.addEventListener('input', () => {
      sp.color = (0xff000000 | parseInt(color.value.slice(1), 16)) >>> 0;
      markDirty();
    });
    subBody.append(el('div', { class: 'row' }, name, color,
      el('button', { class: 'small ghost', onclick: () => {
        rev.subplots = rev.subplots.filter((s) => s !== sp);
        for (const sc of rev.scenes) sc.scene_subplots = (sc.scene_subplots ?? []).filter((l) => l.subplot !== sp.code);
        markDirty();
        render();
      } }, 'Delete')));
  }
  if (!subBody.childNodes.length) subBody.append(el('p', { class: 'tiny muted' }, 'No subplots yet.'));
  subPanel.append(subBody);
  wrap.append(subPanel);

  /* history */
  const history = el('div', { class: 'panel' });
  history.append(el('header', {}, 'History', el('span', { class: 'grow' }),
    el('button', { class: 'small ghost', onclick: () => {
      const snapshot = deepClone(rev);
      snapshot.number = Math.max(...project.revisions.map((r) => r.number)) + 1;
      snapshot.date = Date.now();
      project.revisions.push(snapshot);
      state.revisionNumber = null;
      markDirty();
      toast(`Snapshot ${snapshot.number} created`);
      render();
    } }, 'Create snapshot')));
  const historyBody = el('div', { class: 'inner', style: { display: 'flex', flexDirection: 'column', gap: '.35rem' } });
  for (const revItem of [...project.revisions].reverse()) {
    historyBody.append(
      el('div', { class: 'row' },
        el('span', {}, `#${revItem.number}`),
        el('span', { class: 'tiny muted' }, new Date(revItem.date).toLocaleString()),
        el('span', { class: 'grow' }),
        el('span', { class: 'tiny muted' }, `${revItem.scenes?.length ?? 0} scenes`),
        el('button', { class: 'small ghost', onclick: () => {
          state.revisionNumber = revItem.number;
          toast(`Viewing snapshot #${revItem.number} (read-only)`);
          render();
        } }, 'View'),
      ),
    );
  }
  if (state.revisionNumber != null) {
    historyBody.append(
      el('div', { class: 'row' },
        el('span', { class: 'tiny' }, `Read-only snapshot #${state.revisionNumber}. Restoring replaces the current draft.`),
        el('span', { class: 'grow' }),
        el('button', { class: 'small', onclick: () => { state.revisionNumber = null; render(); } }, 'Back to latest'),
        el('button', { class: 'small primary', onclick: async () => {
          const snapshot = project.revisions.find((r) => r.number === state.revisionNumber);
          if (!snapshot) return;
          if (!(await confirmDialog('Restore this snapshot?', 'The current draft is replaced. Create a snapshot first if you want to keep it.'))) return;
          const index = project.revisions.indexOf(snapshot);
          const restored = deepClone(snapshot);
          restored.number = Math.max(...project.revisions.map((r) => r.number)) + 1;
          restored.date = Date.now();
          project.revisions.splice(index + 1, 0, restored);
          state.revisionNumber = null;
          markDirty();
          render();
        } }, 'Restore'),
      ),
    );
  }
  history.append(historyBody);
  wrap.append(history);

  /* danger zone */
  const danger = el('div', { class: 'panel' });
  danger.append(el('header', {}, 'Project'));
  danger.append(
    el('div', { class: 'inner', style: { display: 'flex', gap: '.5rem', flexWrap: 'wrap' } },
      el('button', { onclick: () => download(project.code, 'nov') }, 'Export .nov'),
      el('button', { onclick: () => download(project.code, 'epub') }, 'Export EPUB'),
      el('button', { onclick: () => download(project.code, 'odt') }, 'Export ODT'),
      el('button', { onclick: () => download(project.code, 'html') }, 'Export HTML'),
      el('button', { onclick: () => download(project.code, 'md') }, 'Export Markdown'),
      el('button', { onclick: () => download(project.code, 'txt') }, 'Export plain text'),
      el('span', { class: 'grow' }),
      el('button', { class: 'danger', onclick: () => deleteProject({ code: project.code, title: project.title }) }, 'Delete project'),
    ),
  );
  wrap.append(danger);
  return wrap;
}

function projCoverControls(project) {
  const input = el('input', { type: 'file', accept: 'image/jpeg,image/png', class: 'sr' });
  input.addEventListener('change', async () => {
    const file = input.files?.[0];
    if (!file) return;
    const buffer = await file.arrayBuffer();
    // Store JPEG/PNG as base64 like the original `cover` field.
    const bytes = new Uint8Array(buffer);
    let binary = '';
    for (const byte of bytes) binary += String.fromCharCode(byte);
    project.cover = btoa(binary);
    markDirty();
    toast('Cover updated');
    render();
  });
  return el('div', { class: 'row' },
    el('button', { class: 'small', onclick: () => input.click() }, project.cover ? 'Change cover' : 'Upload cover'),
    project.cover ? el('button', { class: 'small ghost', onclick: () => { project.cover = null; markDirty(); render(); } }, 'Remove') : null,
    input,
  );
}

/* ------------------------------------------------------------------ */
/* export menu / find                                                */
/* ------------------------------------------------------------------ */

function openExportMenu() {
  const code = state.project.code;
  openModal({
    title: 'Export',
    body: el('div', { style: { display: 'flex', flexDirection: 'column', gap: '.5rem' } },
      el('p', { class: 'tiny muted' }, 'The .nov file is the format the Android app imports. HTML/Markdown/plain text are for reading, sharing and submission.'),
      el('button', { onclick: () => download(code, 'nov') }, '.nov project backup'),
      el('button', { onclick: () => download(code, 'epub') }, 'EPUB (e-readers)'),
      el('button', { onclick: () => download(code, 'odt') }, 'ODT (LibreOffice / Word)'),
      el('button', { onclick: () => download(code, 'html') }, 'HTML manuscript (print-ready)'),
      el('button', { onclick: () => download(code, 'md') }, 'Markdown manuscript'),
      el('button', { onclick: () => download(code, 'txt') }, 'Plain text manuscript'),
    ),
    footer: [el('button', { onclick: closeModal }, 'Close')],
  });
}

function openFind() {
  const input = el('input', { placeholder: 'Search scenes and plot items…', autofocus: 'true' });
  const results = el('div', { style: { display: 'flex', flexDirection: 'column', gap: '.35rem' } });
  const run = () => {
    const { scenes, items } = searchProject(state.project, input.value);
    clear(results);
    if (!input.value.trim()) {
      results.append(el('p', { class: 'tiny muted' }, 'Type to search titles, synopses and manuscript text.'));
      return;
    }
    for (const s of scenes) {
      results.append(el('button', { class: 'ghost', style: { textAlign: 'left' }, onclick: () => { closeModal(); selectScene(s.code); } },
        el('strong', {}, s.title), el('div', { class: 'tiny muted' }, s.excerpt.slice(0, 160))));
    }
    for (const i of items) {
      results.append(el('button', { class: 'ghost', style: { textAlign: 'left' }, onclick: () => { closeModal(); navigate(`#/p/${state.project.code}/plot`); } },
        el('strong', {}, `${i.category}: ${i.title}`), el('div', { class: 'tiny muted' }, i.synopsis.slice(0, 160))));
    }
    if (!scenes.length && !items.length) results.append(el('p', { class: 'tiny muted' }, 'No matches.'));
  };
  input.addEventListener('input', run);
  run();
  openModal({ title: 'Find', body: el('div', { style: { display: 'flex', flexDirection: 'column', gap: '.6rem' } }, input, results), footer: [el('button', { onclick: closeModal }, 'Close')] });
}

/* ------------------------------------------------------------------ */
/* AI drawer                                                          */
/* ------------------------------------------------------------------ */

const AI_TASKS = {
  continue: 'Continue the scene',
  rewrite: 'Rewrite the passage',
  describe: 'Describe an element',
  brainstorm: 'Brainstorm ideas',
  outline: 'Outline a synopsis',
};

function openAiDrawer(task = null) {
  if (task) state.aiTask = task;
  state.aiOpen = true;
  render();
}

function closeAiDrawer() {
  state.aiOpen = false;
  render();
}

function aiContext() {
  const project = state.project;
  const rev = revision();
  const scene = rev && state.sceneCode ? sceneByCode(rev, state.sceneCode) : null;
  const textarea = document.querySelector('textarea.manuscript');
  const selected = textarea && textarea.selectionStart !== textarea.selectionEnd
    ? textarea.value.slice(textarea.selectionStart, textarea.selectionEnd)
    : null;

  const plot = (rev?.categories ?? [])
    .flatMap((cat) => (cat.items ?? []).map((item) => `- ${cat.title}: ${item.title}${item.synopsis ? ` — ${item.synopsis}` : ''}`))
    .slice(0, 40)
    .join('\n');

  return {
    title: project.title,
    sceneTitle: scene?.title ?? '',
    text: selected ?? scene?.text ?? '',
    plot,
    subject: scene?.title ?? '',
  };
}

async function runAi() {
  state.aiBusy = true;
  state.aiResult = '';
  state.aiNotice = '';
  renderAiResult();
  try {
    const result = await api.ai({ task: state.aiTask, ...aiContext() });
    if (result.ok) {
      state.aiResult = result.content;
    } else if (result.skipped) {
      state.aiNotice = `${result.reason}. ${result.hint ?? ''}`;
    } else {
      state.aiNotice = `Gateway error${result.status ? ` (${result.status})` : ''}: ${result.reason ?? 'unknown error'}`;
    }
  } catch (error) {
    state.aiNotice = error.message;
  } finally {
    state.aiBusy = false;
    renderAiResult();
  }
}

function renderAiResult() {
  const resultNode = document.querySelector('[data-ai-result]');
  if (!resultNode) return;
  resultNode.textContent = state.aiBusy ? 'Thinking…' : state.aiNotice || state.aiResult || 'Nothing yet. Choose a task and run the assistant.';
  const insert = document.querySelector('[data-ai-insert]');
  if (insert) insert.disabled = !state.aiResult;
  const copy = document.querySelector('[data-ai-copy]');
  if (copy) copy.disabled = !state.aiResult;
}

function renderAiDrawer() {
  const drawer = el('div', { class: `drawer${state.aiOpen ? ' open' : ''}` });
  drawer.append(
    el('header', {},
      el('strong', {}, 'Writing assistant'),
      el('span', { class: 'grow' }),
      el('button', { class: 'ghost small', onclick: closeAiDrawer }, 'Close'),
    ),
  );
  const body = el('div', { class: 'body' });
  body.append(
    el('div', { class: 'field' },
      el('label', {}, 'Task'),
      el('select', { onchange: (e) => { state.aiTask = e.target.value; } },
        ...Object.entries(AI_TASKS).map(([key, label]) => el('option', { value: key, selected: key === state.aiTask }, label))),
    ),
    el('p', { class: 'tiny muted' }, 'Runs through the Respan gateway configured on the server. If no key is set, the assistant reports that it is unconfigured instead of failing.'),
    el('div', { class: 'result', dataset: { aiResult: '1' } }, state.aiBusy ? 'Thinking…' : state.aiNotice || state.aiResult || 'Nothing yet. Choose a task and run the assistant.'),
  );
  drawer.append(body);
  drawer.append(
    el('footer', {},
      el('button', { class: 'primary', disabled: state.aiBusy, onclick: runAi }, state.aiBusy ? 'Running…' : 'Run'),
      el('button', { dataset: { aiInsert: '1' }, disabled: !state.aiResult, onclick: insertAiResult }, 'Insert into scene'),
      el('button', { dataset: { aiCopy: '1' }, disabled: !state.aiResult, onclick: () => { navigator.clipboard?.writeText(state.aiResult); toast('Copied'); } }, 'Copy'),
    ),
  );
  return drawer;
}

function insertAiResult() {
  const rev = revision();
  const scene = rev && state.sceneCode ? sceneByCode(rev, state.sceneCode) : null;
  if (!scene) {
    toast('Select a scene first', 'error');
    return;
  }
  scene.text = `${scene.text ?? ''}${scene.text ? '\n\n' : ''}${state.aiResult}`;
  markDirty();
  state.aiOpen = false;
  render();
  toast('Inserted into scene');
}

/* ------------------------------------------------------------------ */
/* modal + confirm                                                    */
/* ------------------------------------------------------------------ */

function openModal({ title, body, footer = [] }) {
  closeModal(false);
  const backdrop = el('div', { class: 'modal-backdrop', onclick: (e) => { if (e.target === backdrop) closeModal(); } });
  const modal = el('div', { class: 'modal' });
  modal.append(el('header', {}, el('h3', {}, title), el('button', { class: 'ghost small', onclick: closeModal }, '✕')));
  modal.append(el('div', { class: 'body' }, body));
  if (footer.length) modal.append(el('footer', {}, ...footer));
  backdrop.append(modal);
  modalRoot.append(backdrop);
  setTimeout(() => modalRoot.querySelector('input, textarea, select')?.focus(), 30);
}

function closeModal(rerender = false) {
  clear(modalRoot);
  if (rerender) render();
}

function confirmDialog(title, text) {
  return new Promise((resolve) => {
    openModal({
      title,
      body: el('p', {}, text),
      footer: [
        el('button', { onclick: () => { closeModal(); resolve(false); } }, 'Cancel'),
        el('button', { class: 'danger', onclick: () => { closeModal(); resolve(true); } }, 'Confirm'),
      ],
    });
  });
}

function field(label, input) {
  return el('div', { class: 'field' }, el('label', {}, label), input);
}

/* ------------------------------------------------------------------ */
/* boot                                                               */
/* ------------------------------------------------------------------ */

window.addEventListener('hashchange', onRouteChange);
window.addEventListener('beforeunload', (event) => {
  if (state.saveStatus === 'saving') {
    event.preventDefault();
    event.returnValue = '';
  }
});
document.addEventListener('keydown', (event) => {
  const mod = event.metaKey || event.ctrlKey;
  if (mod && event.key.toLowerCase() === 's') {
    event.preventDefault();
    saveNow().then(() => toast('Saved'));
  }
  if (mod && event.key.toLowerCase() === 'k') {
    event.preventDefault();
    if (state.project) openFind();
  }
  if (event.key === 'Escape') {
    if (modalRoot.childNodes.length) closeModal();
    else if (state.aiOpen) closeAiDrawer();
  }
});

(async function boot() {
  try {
    await api.health();
  } catch (error) {
    app.append(el('div', { class: 'content' }, el('div', { class: 'empty' }, el('h3', {}, 'Server unavailable'), el('p', {}, error.message))));
    return;
  }
  if (!location.hash) location.hash = '#/';
  await onRouteChange();
})();
