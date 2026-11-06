/**
 * Novelist data model.
 *
 * Reconstructed from the `.nov` v4 JSON export shipped inside Novelist.apks
 * (`assets/flutter_assets/assets/sample.nov`) and from the SQLite DDL embedded
 * in the Flutter AOT snapshot (`libapp.so`).
 *
 * This module is environment-neutral: it is imported by the Node server and by
 * the browser SPA, so it must not touch `document`, `window` or Node-only APIs.
 */

import { createZip } from './zip.js';

export const NOV_VERSION = 4;

/* ------------------------------------------------------------------ */
/* primitives                                                          */
/* ------------------------------------------------------------------ */

/** 8 hex chars, matching the code format used by the original app. */
export function newCode() {
  const bytes = new Uint8Array(4);
  if (globalThis.crypto?.getRandomValues) {
    globalThis.crypto.getRandomValues(bytes);
  } else {
    for (let i = 0; i < 4; i += 1) bytes[i] = Math.floor(Math.random() * 256);
  }
  return Array.from(bytes, (b) => b.toString(16).padStart(2, '0')).join('');
}

export function now() {
  return Date.now();
}

export function deepClone(value) {
  return JSON.parse(JSON.stringify(value));
}

/** The original app stores colours as unsigned ARGB integers. */
export function argb(hex) {
  const m = /^#?([0-9a-f]{6})$/i.exec(String(hex));
  if (!m) return 0xff888888;
  return (0xff000000 | parseInt(m[1], 16)) >>> 0;
}

/** ARGB integer -> `#rrggbb` for CSS. Accepts the signed longs the app also writes. */
export function hexFromArgb(value) {
  const n = Number(value) >>> 0;
  return `#${(n & 0xffffff).toString(16).padStart(6, '0')}`;
}

/** Word count compatible with the original app's progress counters. */
export function wordCount(text) {
  if (!text) return 0;
  const cleaned = String(text)
    .replace(/<[^>]*>/g, ' ')
    .replace(/[\u200b-\u200d\ufeff]/g, '');
  // Count CJK characters individually, then latin-ish whitespace tokens.
  const cjk = cleaned.match(/[\u3040-\u30ff\u3400-\u4dbf\u4e00-\u9fff\uf900-\ufaff]/g)?.length ?? 0;
  const latin = cleaned
    .replace(/[\u3040-\u30ff\u3400-\u4dbf\u4e00-\u9fff\uf900-\ufaff]/g, ' ')
    .split(/\s+/)
    .filter((token) => /[\p{L}\p{N}]/u.test(token)).length;
  return cjk + latin;
}

/* ------------------------------------------------------------------ */
/* built-in templates                                                  */
/* ------------------------------------------------------------------ */

function status(code, title, hex, ranking) {
  return { code, title, color: argb(hex), ranking };
}

function element(code, title, ranking, isRelevant = true) {
  return { code, title, ranking, ...(isRelevant ? { is_relevant: true } : {}) };
}

function group(code, title, ranking, elements) {
  return {
    code,
    title,
    ranking,
    metadata_elements: elements.map(([c, t], i) => element(`${code}_${c}`, t, i + 1)),
  };
}

function category(code, title, hex, ranking, groups, items = []) {
  return {
    code,
    title,
    color: argb(hex),
    ranking,
    metadata_groups: groups.map(([c, t, els], i) => group(`${code}_${c}`, t, i + 1, els)),
    items,
  };
}

/**
 * "Standard novel" template.
 *
 * The APK ships the same template with `§template_standard_novel_*_title§`
 * markers that the Flutter app resolves through its compiled l10n tables. Those
 * tables are not recoverable as a key/value map from the AOT snapshot, so the
 * English labels below are a faithful reconstruction: category and status names
 * come from `sample.nov`, element names come from UI strings present in
 * `libapp.so` ("Positive personality traits", "Introvert or extrovert",
 * "Hobbies / pastimes", "Attitude towards school", ...).
 */
export function standardTemplate() {
  return {
    statuses: [
      status('1', 'To do', '#d7e6f5', 1),
      status('2', 'Draft', '#cfe3d4', 2),
      status('3', 'Revised', '#f6e6c3', 3),
      status('4', 'Done', '#c9d8f0', 4),
      status('5', 'Final', '#e6c9d8', 5),
    ],
    categories: [
      category('1', 'Themes', '#8168c8', 1, [
        ['GENERAL', 'General', [
          ['EFFECTS', 'Effects'],
          ['RESULTS', 'Results'],
          ['INNER_MEANING', 'Inner meaning'],
          ['DRIVE', 'Drive'],
          ['GAIN', 'Gain'],
          ['FIGHT', 'Fight'],
          ['SEARCH', 'Search'],
          ['LOSS', 'Loss'],
          ['STRUGGLE', 'Struggle'],
        ]],
      ]),
      category('2', 'Events', '#4f8fb3', 2, [
        ['GENERAL', 'General', [
          ['DATE', 'Date'],
          ['TIME', 'Time'],
          ['PLACE', 'Place'],
          ['PARTICIPANTS', 'Participants'],
          ['CONSEQUENCES', 'Consequences'],
        ]],
      ]),
      category('3', 'Characters', '#b3564f', 3, [
        ['GENERAL', 'General', [
          ['AGE', 'Age'],
          ['GENDER', 'Gender'],
          ['ROLE', 'Role'],
          ['OCCUPATION', 'Occupation'],
          ['APPEARANCE', 'Appearance'],
          ['BACKGROUND', 'Background'],
        ]],
        ['PERSONALITY', 'Personality', [
          ['POSITIVE', 'Positive personality traits'],
          ['NEGATIVE', 'Negative personality traits'],
          ['INTROVERT', 'Introvert or extrovert'],
          ['HOBBIES', 'Hobbies / pastimes'],
          ['SCHOOL', 'Attitude towards school'],
          ['GOALS', 'Life goals'],
        ]],
        ['RELATIONSHIPS', 'Relationships', [
          ['FAMILY', 'Family'],
          ['FRIENDS', 'Friends'],
          ['ROMANTIC', 'Past romantic relationships'],
          ['INTIMATE', 'Other intimate relationships'],
          ['INFLUENTIAL', 'Influential people'],
        ]],
      ]),
      category('4', 'Locations', '#4f9b6e', 4, [
        ['GENERAL', 'General', [
          ['TYPE', 'Type'],
          ['REGION', 'Region'],
          ['DESCRIPTION', 'Home description and decor'],
          ['SIGNIFICANCE', 'Significance'],
          ['INHABITANTS', 'Inhabitants'],
        ]],
      ]),
      category('5', 'Props', '#c08a3e', 5, [
        ['GENERAL', 'General', [
          ['TYPE', 'Type'],
          ['OWNER', 'Owner'],
          ['DESCRIPTION', 'Description'],
          ['SIGNIFICANCE', 'Significance'],
        ]],
      ]),
      category('6', 'Extras', '#7a8b99', 6, [
        ['GENERAL', 'General', [
          ['NOTES', 'Notes'],
          ['RESEARCH', 'Research'],
          ['INSPIRATION', 'Inspiration'],
        ]],
      ]),
    ],
  };
}

/** Minimal template: one status, no plot structure. */
export function emptyTemplate() {
  return {
    statuses: [status('1', 'To do', '#d7e6f5', 1)],
    categories: [],
  };
}

/** Rewrite every author-supplied code so two projects never collide. */
export function freshenTemplate(template) {
  const clone = deepClone(template);
  for (const st of clone.statuses ?? []) st.code = newCode();
  const statusByOldCode = new Map();
  (template.statuses ?? []).forEach((old, i) => statusByOldCode.set(old.code, clone.statuses[i].code));
  const remapStatus = (code) => statusByOldCode.get(code) ?? code;
  for (const cat of clone.categories ?? []) {
    cat.code = newCode();
    for (const g of cat.metadata_groups ?? []) {
      g.code = newCode();
      for (const el of g.metadata_elements ?? []) el.code = newCode();
    }
    for (const item of cat.items ?? []) {
      item.code = newCode();
      if (item.status) item.status = remapStatus(item.status);
      for (const n of item.item_names ?? []) n.code = newCode();
    }
  }
  for (const sp of clone.subplots ?? []) sp.code = newCode();
  for (const sc of clone.scenes ?? []) sc.code = newCode();
  for (const se of clone.sections ?? []) se.code = newCode();
  return clone;
}

/* ------------------------------------------------------------------ */
/* project construction                                                */
/* ------------------------------------------------------------------ */

export function createProject({ title = 'Untitled project', description = '', template = 'standard' } = {}) {
  const base = template === 'empty' ? emptyTemplate() : standardTemplate();
  const t = freshenTemplate(base);
  const revision = {
    number: 1,
    date: now(),
    book_progresses: [],
    categories: t.categories,
    statuses: t.statuses,
    subplots: [],
    scenes: [],
    sections: [],
  };

  // A brand-new manuscript with zero chapters is awkward to edit, so
  // scaffold chapter one and scene one for both templates.
  const firstStatus = t.statuses[0]?.code ?? '';
  const scene = newScene({ title: 'Scene 1', status: firstStatus });
  revision.scenes.push(scene);
  revision.sections.push(newSection({ title: 'Chapter 1', sceneCodes: [scene.code] }));

  return {
    version: NOV_VERSION,
    code: newCode(),
    title,
    description,
    show_table_of_contents: true,
    apply_automatic_indentation: true,
    last_update_date: now(),
    last_cloud_sync_date: null,
    last_backup_date: null,
    cover: null,
    revisions: [revision],
  };
}

export function newScene({ title = 'Untitled scene', status = null, ranking = null } = {}) {
  return {
    code: newCode(),
    title,
    synopsis: '',
    text: '',
    ranking: ranking ?? 1,
    status: status ?? '',
    scene_items: [],
    scene_subplots: [],
    scene_notes: [],
    scene_pictures: [],
  };
}

export function newSection({ title = 'Untitled chapter', ranking = null, sceneCodes = [] } = {}) {
  return {
    code: newCode(),
    title,
    synopsis: '',
    ranking: ranking ?? 1,
    section_scenes: sceneCodes.map((code, i) => ({ code, ranking: i + 1 })),
  };
}

export function newItem({ category = null, title = 'Untitled item', status = '' } = {}) {
  return {
    code: newCode(),
    title,
    synopsis: '',
    ranking: 1,
    status,
    item_tags: [],
    item_names: [],
    item_metadatas: [],
    item_relationships: [],
    item_notes: [],
    item_pictures: [],
  };
}

/* ------------------------------------------------------------------ */
/* accessors                                                           */
/* ------------------------------------------------------------------ */

export function currentRevision(project, number = null) {
  const revs = project?.revisions ?? [];
  if (!revs.length) return null;
  if (number == null) return revs[revs.length - 1];
  return revs.find((r) => r.number === number) ?? revs[revs.length - 1];
}

export function sceneByCode(revision, code) {
  return revision?.scenes?.find((s) => s.code === code) ?? null;
}

export function sectionByCode(revision, code) {
  return revision?.sections?.find((s) => s.code === code) ?? null;
}

export function itemByCode(revision, code) {
  for (const cat of revision?.categories ?? []) {
    const hit = (cat.items ?? []).find((i) => i.code === code);
    if (hit) return { category: cat, item: hit };
  }
  return null;
}

export function statusByCode(revision, code) {
  return revision?.statuses?.find((s) => s.code === code) ?? null;
}

/** Scenes in reading order, following section membership then free scenes. */
export function orderedScenes(revision) {
  const seen = new Set();
  const out = [];
  const sections = [...(revision?.sections ?? [])].sort((a, b) => a.ranking - b.ranking);
  for (const section of sections) {
    const entries = [...(section.section_scenes ?? [])].sort((a, b) => a.ranking - b.ranking);
    for (const entry of entries) {
      const scene = sceneByCode(revision, entry.code);
      if (scene && !seen.has(scene.code)) {
        seen.add(scene.code);
        out.push({ scene, section });
      }
    }
  }
  for (const scene of [...(revision?.scenes ?? [])].sort((a, b) => a.ranking - b.ranking)) {
    if (!seen.has(scene.code)) out.push({ scene, section: null });
  }
  return out;
}

/* ------------------------------------------------------------------ */
/* statistics                                                          */
/* ------------------------------------------------------------------ */

export function projectStats(project, revisionNumber = null) {
  const revision = currentRevision(project, revisionNumber);
  const scenes = revision?.scenes ?? [];
  const words = scenes.reduce((sum, s) => sum + wordCount(s.text), 0);
  const byStatus = new Map();
  for (const s of scenes) {
    const key = s.status || 'none';
    byStatus.set(key, (byStatus.get(key) ?? 0) + 1);
  }
  const statuses = (revision?.statuses ?? []).map((st) => ({
    ...st,
    count: byStatus.get(st.code) ?? 0,
  }));
  const perSection = (revision?.sections ?? []).map((section) => {
    const sc = (section.section_scenes ?? [])
      .map((e) => sceneByCode(revision, e.code))
      .filter(Boolean);
    return {
      code: section.code,
      title: section.title,
      scenes: sc.length,
      words: sc.reduce((sum, s) => sum + wordCount(s.text), 0),
    };
  });
  const items = (revision?.categories ?? []).reduce((n, c) => n + (c.items?.length ?? 0), 0);
  return {
    words,
    scenes: scenes.length,
    sections: revision?.sections?.length ?? 0,
    items,
    statuses,
    perSection,
    progress: [...(revision?.book_progresses ?? [])].sort((a, b) =>
      `${a.year}-${a.month}-${a.day}`.localeCompare(`${b.year}-${b.month}-${b.day}`),
    ),
  };
}

/** Record today's word count once per day, mirroring `book_progress`. */
export function recordProgress(project, date = new Date()) {
  const revision = currentRevision(project);
  if (!revision) return;
  const words = revision.scenes.reduce((sum, s) => sum + wordCount(s.text), 0);
  const entry = {
    year: date.getFullYear(),
    month: date.getMonth() + 1,
    day: date.getDate(),
    word_count: words,
  };
  revision.book_progresses = revision.book_progresses ?? [];
  const existing = revision.book_progresses.find(
    (p) => p.year === entry.year && p.month === entry.month && p.day === entry.day,
  );
  if (existing) existing.word_count = words;
  else revision.book_progresses.push(entry);
}

/* ------------------------------------------------------------------ */
/* validation                                                          */
/* ------------------------------------------------------------------ */

const asArray = (v) => (Array.isArray(v) ? v : []);
const asString = (v, fallback = '') => (typeof v === 'string' ? v : fallback);
const asNumber = (v, fallback = 0) => (Number.isFinite(Number(v)) ? Number(v) : fallback);

/**
 * Normalise an imported `.nov` object in place-safe fashion.
 * Throws on data this implementation cannot represent.
 */
export function normalizeProject(input) {
  if (!input || typeof input !== 'object') throw new Error('Project file is not a JSON object');
  const version = asNumber(input.version, 0);
  if (version > NOV_VERSION) {
    throw new Error(`Unsupported .nov version ${version} (this build understands up to ${NOV_VERSION})`);
  }
  if (!Array.isArray(input.revisions) || input.revisions.length === 0) {
    throw new Error('Project file has no revisions');
  }

  const project = {
    version: NOV_VERSION,
    code: asString(input.code) || newCode(),
    title: asString(input.title, 'Untitled project'),
    description: asString(input.description),
    show_table_of_contents: input.show_table_of_contents !== false,
    apply_automatic_indentation: input.apply_automatic_indentation !== false,
    last_update_date: asNumber(input.last_update_date, now()),
    last_cloud_sync_date: input.last_cloud_sync_date ?? null,
    last_backup_date: input.last_backup_date ?? null,
    cover: typeof input.cover === 'string' ? input.cover : null,
    revisions: asArray(input.revisions).map((rev, index) => ({
      number: asNumber(rev.number, index + 1),
      date: asNumber(rev.date, now()),
      book_progresses: asArray(rev.book_progresses).map((p) => ({
        year: asNumber(p.year),
        month: asNumber(p.month),
        day: asNumber(p.day),
        word_count: asNumber(p.word_count),
      })),
      statuses: asArray(rev.statuses).map((st) => ({
        code: asString(st.code) || newCode(),
        title: asString(st.title, 'Status'),
        color: asNumber(st.color, argb('#888888')),
        ranking: asNumber(st.ranking, 1),
      })),
      subplots: asArray(rev.subplots).map((sp) => ({
        code: asString(sp.code) || newCode(),
        title: asString(sp.title, 'Subplot'),
        color: asNumber(sp.color, argb('#888888')),
        ranking: asNumber(sp.ranking, 1),
      })),
      scenes: asArray(rev.scenes).map((sc) => ({
        code: asString(sc.code) || newCode(),
        title: asString(sc.title, 'Untitled scene'),
        synopsis: asString(sc.synopsis),
        text: asString(sc.text),
        ranking: asNumber(sc.ranking, 1),
        status: asString(sc.status),
        scene_items: asArray(sc.scene_items).map((x) => ({ code: asString(x?.code) })),
        scene_subplots: asArray(sc.scene_subplots).map((x) => ({
          subplot: asString(x?.subplot),
          synopsis: asString(x?.synopsis),
        })),
        scene_notes: asArray(sc.scene_notes).map((x, i) => ({
          text: asString(x?.text),
          ranking: asNumber(x?.ranking, i + 1),
        })),
        scene_pictures: asArray(sc.scene_pictures).map((x) => ({
          picture: asString(x?.picture),
          ranking: asNumber(x?.ranking, 1),
        })),
      })),
      sections: asArray(rev.sections).map((se) => ({
        code: asString(se.code) || newCode(),
        title: asString(se.title, 'Untitled chapter'),
        synopsis: asString(se.synopsis),
        ranking: asNumber(se.ranking, 1),
        section_scenes: asArray(se.section_scenes).map((x, i) => ({
          code: asString(x?.code),
          ranking: asNumber(x?.ranking, i + 1),
        })),
      })),
      categories: asArray(rev.categories).map((cat) => ({
        code: asString(cat.code) || newCode(),
        title: asString(cat.title, 'Category'),
        color: asNumber(cat.color, argb('#888888')),
        ranking: asNumber(cat.ranking, 1),
        metadata_groups: asArray(cat.metadata_groups).map((g) => ({
          code: asString(g.code) || newCode(),
          title: asString(g.title, 'Group'),
          ranking: asNumber(g.ranking, 1),
          metadata_elements: asArray(g.metadata_elements).map((el) => ({
            code: asString(el.code) || newCode(),
            title: asString(el.title, 'Metadata'),
            ranking: asNumber(el.ranking, 1),
            is_relevant: el.is_relevant !== false,
          })),
        })),
        items: asArray(cat.items).map((it) => ({
          code: asString(it.code) || newCode(),
          title: asString(it.title, 'Untitled item'),
          synopsis: asString(it.synopsis),
          ranking: asNumber(it.ranking, 1),
          status: asString(it.status),
          item_tags: asArray(it.item_tags).map((x) => ({ tag: asString(x?.tag) })),
          item_names: asArray(it.item_names).map((x, i) => ({
            code: asString(x?.code) || newCode(),
            name: asString(x?.name),
            ranking: asNumber(x?.ranking, i + 1),
          })),
          item_metadatas: asArray(it.item_metadatas).map((x) => ({
            metadata_element: asString(x?.metadata_element),
            value: asString(x?.value),
          })),
          item_relationships: asArray(it.item_relationships).map((x, i) => ({
            other_item: asString(x?.other_item),
            description: asString(x?.description),
            ranking: asNumber(x?.ranking, i + 1),
            is_relevant: x?.is_relevant !== false,
          })),
          item_notes: asArray(it.item_notes).map((x, i) => ({
            text: asString(x?.text),
            ranking: asNumber(x?.ranking, i + 1),
          })),
          item_pictures: asArray(it.item_pictures).map((x) => ({
            picture: asString(x?.picture),
            ranking: asNumber(x?.ranking, 1),
          })),
        })),
      })),
    })),
  };

  // Drop dangling references rather than failing an otherwise usable import.
  for (const rev of project.revisions) {
    const sceneCodes = new Set(rev.scenes.map((s) => s.code));
    for (const se of rev.sections) {
      se.section_scenes = se.section_scenes.filter((x) => sceneCodes.has(x.code));
    }
    const itemCodes = new Set(rev.categories.flatMap((c) => c.items.map((i) => i.code)));
    for (const sc of rev.scenes) {
      sc.scene_items = sc.scene_items.filter((x) => itemCodes.has(x.code));
    }
  }

  return project;
}

/* ------------------------------------------------------------------ */
/* compilation                                                         */
/* ------------------------------------------------------------------ */

export function compileUnits(project) {
  const revision = currentRevision(project);
  const units = [];
  for (const { scene, section } of orderedScenes(revision)) {
    units.push({ section, scene });
  }
  return units;
}

function paragraphs(text) {
  return String(text ?? '')
    .replace(/\r\n/g, '\n')
    .split(/\n{2,}/)
    .map((p) => p.trim())
    .filter(Boolean);
}

export function compileMarkdown(project) {
  const revision = currentRevision(project);
  const lines = [`# ${project.title || 'Untitled'}`, ''];
  if (project.description) lines.push(`> ${project.description.replace(/\n/g, ' ')}`, '');
  let currentSection = null;
  for (const { scene, section } of orderedScenes(revision)) {
    if (section && section.code !== currentSection) {
      currentSection = section.code;
      lines.push('', `## ${section.title}`, '');
      if (section.synopsis) lines.push(`_${section.synopsis}_`, '');
    }
    if (scene.title) lines.push(`### ${scene.title}`, '');
    for (const p of paragraphs(scene.text)) lines.push(p, '');
  }
  return lines.join('\n').replace(/\n{3,}/g, '\n\n').trim() + '\n';
}

export function compileText(project, { includeSceneTitles = true, includeSectionTitles = true } = {}) {
  const revision = currentRevision(project);
  const out = [project.title || 'Untitled', ''];
  let currentSection = null;
  for (const { scene, section } of orderedScenes(revision)) {
    if (section && section.code !== currentSection) {
      currentSection = section.code;
      if (includeSectionTitles) out.push('', section.title.toUpperCase(), '');
    }
    if (includeSceneTitles && scene.title) out.push(scene.title, '');
    for (const p of paragraphs(scene.text)) out.push(p, '');
  }
  return out.join('\n').replace(/\n{3,}/g, '\n\n').trim() + '\n';
}

const escapeHtml = (s) =>
  String(s ?? '')
    .replace(/&/g, '&amp;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;')
    .replace(/"/g, '&quot;');

export function compileHtml(project, { toc = project.show_table_of_contents } = {}) {
  const revision = currentRevision(project);
  const indent = project.apply_automatic_indentation;
  const body = [];
  if (project.cover) body.push(`<p class="cover"><img src="data:image/jpeg;base64,${project.cover}" alt=""></p>`);
  body.push(`<h1>${escapeHtml(project.title)}</h1>`);
  if (project.description) body.push(`<p class="description">${escapeHtml(project.description)}</p>`);

  const ordered = orderedScenes(revision);
  if (toc && ordered.length) {
    const bySection = new Map();
    for (const { section } of ordered) {
      const key = section?.code ?? '__loose';
      if (!bySection.has(key)) bySection.set(key, section?.title ?? null);
    }
    body.push('<nav class="toc"><h2>Table of contents</h2><ol>');
    for (const [, title] of bySection) {
      body.push(`<li>${escapeHtml(title ?? 'Scenes')}</li>`);
    }
    body.push('</ol></nav>');
  }

  let currentSection = null;
  for (const { scene, section } of ordered) {
    if (section && section.code !== currentSection) {
      currentSection = section.code;
      body.push(`<h2>${escapeHtml(section.title)}</h2>`);
      if (section.synopsis) body.push(`<p class="scene-synopsis">${escapeHtml(section.synopsis)}</p>`);
    }
    body.push(`<article class="scene">`);
    body.push(`<h3>${escapeHtml(scene.title)}</h3>`);
    for (const p of paragraphs(scene.text)) body.push(`<p>${escapeHtml(p)}</p>`);
    body.push('</article>');
  }

  const css = `
    body{font-family:Georgia,'Times New Roman',serif;max-width:42rem;margin:3rem auto;padding:0 1.25rem;line-height:1.65;color:#1b1b1f;background:#fff}
    h1{font-size:2.2rem;margin-bottom:.25rem}
    h2{margin-top:2.5rem;border-bottom:1px solid #ddd;padding-bottom:.25rem}
    h3{font-size:1.05rem;font-weight:600;margin-top:1.75rem;color:#333}
    .description{color:#555;font-style:italic}
    .scene-synopsis{color:#777;font-style:italic}
    nav.toc ol{columns:2;font-size:.95rem}
    ${indent ? 'article p{text-indent:1.5em;margin:.25rem 0}' : 'article p{margin:.75rem 0}'}
    .cover img{max-width:16rem;display:block;margin:0 auto 2rem}
    @media print{body{margin:0;max-width:none} nav.toc{page-break-after:always}}
  `;

  return `<!doctype html>
<html lang="en"><head><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1">
<title>${escapeHtml(project.title)}</title><style>${css}</style></head>
<body>${body.join('\n')}</body></html>`;
}

/* ------------------------------------------------------------------ */
/* packaging: EPUB 3 and ODT                                           */
/* ------------------------------------------------------------------ */

const xhtml = (title, body) => `<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:epub="http://www.idpf.org/2007/ops" xml:lang="en" lang="en">
<head><meta charset="utf-8"/><title>${escapeHtml(title)}</title><link rel="stylesheet" type="text/css" href="style.css"/></head>
<body>${body}</body>
</html>`;

function base64ToBytes(value) {
  const clean = String(value ?? '').replace(/^data:[^,]*,/, '').replace(/\s+/g, '');
  if (!clean) return new Uint8Array();
  if (typeof atob === 'function') {
    const binary = atob(clean);
    const out = new Uint8Array(binary.length);
    for (let i = 0; i < binary.length; i += 1) out[i] = binary.charCodeAt(i);
    return out;
  }
  return Uint8Array.from(Buffer.from(clean, 'base64'));
}

function uuidFor(code) {
  const hex = String(code).replace(/[^0-9a-f]/gi, '').toLowerCase().padEnd(8, '0').slice(0, 8);
  return `${hex}-0000-4000-8000-${(hex + hex).slice(0, 12)}`;
}

/** Group scenes by chapter, preserving reading order. */
function chapterUnits(project) {
  const chapters = [];
  let current = null;
  for (const { scene, section } of orderedScenes(currentRevision(project))) {
    if (!current || current.code !== (section?.code ?? '__loose')) {
      current = { code: section?.code ?? '__loose', title: section?.title ?? 'Scenes', synopsis: section?.synopsis ?? '', scenes: [] };
      chapters.push(current);
    }
    current.scenes.push(scene);
  }
  return chapters;
}

/** EPUB 3 package (stored ZIP, no external dependencies). */
export function compileEpub(project) {
  const chapters = chapterUnits(project);
  const uuid = uuidFor(project.code);
  const modified = new Date(now()).toISOString().replace(/\.\d{3}Z$/, 'Z');
  const files = [];

  files.push({ name: 'mimetype', data: 'application/epub+zip' });
  files.push({
    name: 'META-INF/container.xml',
    data: `<?xml version="1.0" encoding="UTF-8"?>
<container version="1.0" xmlns="urn:oasis:names:tc:opendocument:xmlns:container">
  <rootfiles><rootfile full-path="OEBPS/content.opf" media-type="application/oebps-package+xml"/></rootfiles>
</container>`,
  });

  const manifest = [
    '    <item id="nav" href="nav.xhtml" media-type="application/xhtml+xml" properties="nav"/>',
    '    <item id="css" href="style.css" media-type="text/css"/>',
  ];
  const spine = [];
  const navItems = [];

  chapters.forEach((chapter, index) => {
    const id = `chapter-${index + 1}`;
    const href = `${id}.xhtml`;
    const heading = chapter.title ? `<h2>${escapeHtml(chapter.title)}</h2>` : '';
    const synopsis = chapter.synopsis ? `<p class="synopsis">${escapeHtml(chapter.synopsis)}</p>` : '';
    const scenes = chapter.scenes
      .map((scene) => {
        const title = scene.title ? `<h3>${escapeHtml(scene.title)}</h3>` : '';
        const body = paragraphs(scene.text)
          .map((p) => `<p>${escapeHtml(p)}</p>`)
          .join('\n');
        return `<section class="scene">${title}\n${body}</section>`;
      })
      .join('\n');
    files.push({ name: `OEBPS/${href}`, data: xhtml(`${project.title} — ${chapter.title}`, `${heading}${synopsis}${scenes}`) });
    manifest.push(`    <item id="${id}" href="${href}" media-type="application/xhtml+xml"/>`);
    spine.push(`    <itemref idref="${id}"/>`);
    navItems.push(`      <li><a href="${href}">${escapeHtml(chapter.title || 'Scenes')}</a></li>`);
  });

  if (!chapters.length) {
    files.push({ name: 'OEBPS/chapter-1.xhtml', data: xhtml(project.title, `<h1>${escapeHtml(project.title)}</h1><p>This manuscript has no scenes yet.</p>`) });
    manifest.push('    <item id="chapter-1" href="chapter-1.xhtml" media-type="application/xhtml+xml"/>');
    spine.push('    <itemref idref="chapter-1"/>');
    navItems.push('      <li><a href="chapter-1.xhtml">Manuscript</a></li>');
  }

  let coverManifest = '';
  let coverMeta = '';
  if (project.cover) {
    files.push({ name: 'OEBPS/cover.jpg', data: base64ToBytes(project.cover) });
    coverManifest = '    <item id="cover-image" href="cover.jpg" media-type="image/jpeg" properties="cover-image"/>\n';
    coverMeta = '    <meta name="cover" content="cover-image"/>\n';
  }

  files.push({
    name: 'OEBPS/content.opf',
    data: `<?xml version="1.0" encoding="UTF-8"?>
<package xmlns="http://www.idpf.org/2007/opf" version="3.0" unique-identifier="bookid" xml:lang="en">
  <metadata xmlns:dc="http://purl.org/dc/elements/1.1/">
    <dc:identifier id="bookid">urn:uuid:${uuid}</dc:identifier>
    <dc:title>${escapeHtml(project.title || 'Untitled')}</dc:title>
    <dc:language>en</dc:language>
    ${project.description ? `<dc:description>${escapeHtml(project.description)}</dc:description>` : ''}
${coverMeta}    <meta property="dcterms:modified">${modified}</meta>
  </metadata>
  <manifest>
${coverManifest}${manifest.join('\n')}
  </manifest>
  <spine>
${spine.join('\n')}
  </spine>
</package>`,
  });

  files.push({
    name: 'OEBPS/nav.xhtml',
    data: xhtml(
      'Contents',
      `<nav epub:type="toc" id="toc"><h1>Contents</h1><ol>\n${navItems.join('\n')}\n    </ol></nav>`,
    ),
  });

  files.push({
    name: 'OEBPS/style.css',
    data: `body{font-family:Georgia,'Times New Roman',serif;line-height:1.6;margin:1.5em}
h1{font-size:1.8em;margin:0 0 .6em}
h2{font-size:1.35em;margin:1.6em 0 .5em;border-bottom:1px solid #ccc;padding-bottom:.2em}
h3{font-size:1.05em;margin:1.4em 0 .4em;color:#333}
p{margin:0 0 .55em;${project.apply_automatic_indentation ? 'text-indent:1.4em;' : ''}}
.synopsis{font-style:italic;color:#666;text-indent:0}
`,
  });

  return createZip(files);
}

/** OpenDocument Text package (stored ZIP, ODF 1.3). */
export function compileOdt(project) {
  const units = orderedScenes(currentRevision(project));
  const indent = project.apply_automatic_indentation;
  const body = [];
  body.push(`<text:h text:outline-level="1">${escapeHtml(project.title || 'Untitled')}</text:h>`);
  if (project.description) body.push(`<text:p text:style-name="PBody">${escapeHtml(project.description)}</text:p>`);

  let currentSection = null;
  for (const { scene, section } of units) {
    if (section && section.code !== currentSection) {
      currentSection = section.code;
      body.push(`<text:h text:outline-level="2">${escapeHtml(section.title)}</text:h>`);
    }
    if (scene.title) body.push(`<text:h text:outline-level="3">${escapeHtml(scene.title)}</text:h>`);
    for (const p of paragraphs(scene.text)) {
      body.push(`<text:p text:style-name="${indent ? 'PIndent' : 'PBody'}">${escapeHtml(p)}</text:p>`);
    }
  }

  const content = `<?xml version="1.0" encoding="UTF-8"?>
<office:document-content
  xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"
  xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0"
  xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0"
  xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0"
  office:mimetype="application/vnd.oasis.opendocument.text" office:version="1.3">
  <office:automatic-styles>
    <style:style style:name="PIndent" style:family="paragraph">
      <style:paragraph-properties fo:text-indent="1cm" fo:margin-top="0cm" fo:margin-bottom="0cm"/>
    </style:style>
    <style:style style:name="PBody" style:family="paragraph">
      <style:paragraph-properties fo:margin-top="0cm" fo:margin-bottom="0.2cm"/>
    </style:style>
  </office:automatic-styles>
  <office:body>
    <office:text>
${body.map((line) => `      ${line}`).join('\n')}
    </office:text>
  </office:body>
</office:document-content>`;

  const styles = `<?xml version="1.0" encoding="UTF-8"?>
<office:document-styles
  xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"
  xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0"
  xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0"
  office:version="1.3">
  <office:styles>
    <style:default-style style:family="paragraph">
      <style:paragraph-properties fo:orphans="2" fo:widows="2"/>
    </style:default-style>
    <style:style style:name="Standard" style:family="paragraph" style:class="text"/>
  </office:styles>
</office:document-styles>`;

  const meta = `<?xml version="1.0" encoding="UTF-8"?>
<office:document-meta
  xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"
  xmlns:meta="urn:oasis:names:tc:opendocument:xmlns:meta:1.0"
  xmlns:dc="http://purl.org/dc/elements/1.1/"
  office:version="1.3">
  <office:meta>
    <dc:title>${escapeHtml(project.title || 'Untitled')}</dc:title>
    <meta:generator>Novelist RE</meta:generator>
  </office:meta>
</office:document-meta>`;

  const manifest = `<?xml version="1.0" encoding="UTF-8"?>
<manifest:manifest xmlns:manifest="urn:oasis:names:tc:opendocument:xmlns:manifest:1.0" manifest:version="1.3">
  <manifest:file-entry manifest:full-path="/" manifest:media-type="application/vnd.oasis.opendocument.text"/>
  <manifest:file-entry manifest:full-path="content.xml" manifest:media-type="text/xml"/>
  <manifest:file-entry manifest:full-path="styles.xml" manifest:media-type="text/xml"/>
  <manifest:file-entry manifest:full-path="meta.xml" manifest:media-type="text/xml"/>
  <manifest:file-entry manifest:full-path="mimetype" manifest:media-type="text/plain"/>
</manifest:manifest>`;

  return createZip([
    { name: 'mimetype', data: 'application/vnd.oasis.opendocument.text' },
    { name: 'content.xml', data: content },
    { name: 'styles.xml', data: styles },
    { name: 'meta.xml', data: meta },
    { name: 'META-INF/manifest.xml', data: manifest },
  ]);
}

/* ------------------------------------------------------------------ */
/* search                                                              */
/* ------------------------------------------------------------------ */

export function searchProject(project, query) {
  const q = String(query ?? '').trim().toLowerCase();
  if (!q) return { scenes: [], items: [] };
  const revision = currentRevision(project);
  const scenes = (revision?.scenes ?? [])
    .filter((s) => `${s.title}\n${s.synopsis}\n${s.text}`.toLowerCase().includes(q))
    .map((s) => {
      const text = String(s.text ?? '');
      const idx = text.toLowerCase().indexOf(q);
      const excerpt = idx >= 0 ? text.slice(Math.max(0, idx - 60), idx + q.length + 60) : s.synopsis;
      return { code: s.code, title: s.title, excerpt: excerpt ?? '' };
    });
  const items = [];
  for (const cat of revision?.categories ?? []) {
    for (const item of cat.items ?? []) {
      if (`${item.title}\n${item.synopsis}`.toLowerCase().includes(q)) {
        items.push({ code: item.code, title: item.title, category: cat.title, synopsis: item.synopsis ?? '' });
      }
    }
  }
  return { scenes, items };
}

/* ------------------------------------------------------------------ */
/* export                                                              */
/* ------------------------------------------------------------------ */

/**
 * Strip empty optional values.
 *
 * `sample.nov` omits empty arrays, empty strings and nulls, and the Android
 * reader treats a missing key the same as a null one. Matching that shape
 * keeps exports byte-comparable with files produced by the real app.
 */
function pruneEmpty(value) {
  if (Array.isArray(value)) return value.map(pruneEmpty);
  if (!value || typeof value !== 'object') return value;
  const out = {};
  for (const [key, child] of Object.entries(value)) {
    if (child == null) continue;
    if (Array.isArray(child) && child.length === 0) continue;
    if (child === '') continue;
    out[key] = pruneEmpty(child);
  }
  return out;
}

/** Serialise back to the exact `.nov` v4 shape the Android app imports. */
export function toNovFile(project) {
  const copy = deepClone(project);
  copy.version = NOV_VERSION;
  copy.last_update_date = now();
  copy.last_backup_date = now();
  return JSON.stringify(pruneEmpty(copy));
}
