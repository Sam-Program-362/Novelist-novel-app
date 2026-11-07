import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../models/entities.dart';
import '../../state/project_controller.dart';
import '../../core/utils/iterable_x.dart';
import '../export/export_sheet.dart';
import '../preview/preview_screen.dart';
import '../widgets/common.dart';
import '../write/scene_editor_screen.dart';

/// Organize: the manuscript tree of one book (acts → parts → chapters → attached scenes).
///
/// Scenes come from the project-wide Write pool and are *attached* here; removing a scene from a
/// section never deletes it from the pool, and a scene that is never attached never reaches the
/// manuscript, preview or export.
class OrganizeScreen extends StatelessWidget {
  final int bookId;

  const OrganizeScreen({super.key, required this.bookId});

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final book = controller.books.where((b) => b.id == bookId).firstOrNull;
    if (book == null) {
      return const Scaffold(body: Center(child: Text(S.anErrorOccurred)));
    }

    final sections = controller.sectionsDao.forBook(bookId);
    final childrenOf = <int?, List<Section>>{};
    for (final section in sections) {
      childrenOf.putIfAbsent(section.parentId, () => []).add(section);
    }
    for (final list in childrenOf.values) {
      list.sort((a, b) => a.ranking.compareTo(b.ranking));
    }

    return Scaffold(
      appBar: AppBar(
        title: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(book.title, maxLines: 1, overflow: TextOverflow.ellipsis),
            Text(S.organize, style: Theme.of(context).textTheme.labelSmall),
          ],
        ),
        actions: [
          IconButton(
            tooltip: S.preview,
            icon: const Icon(Icons.visibility_outlined),
            onPressed: () => Navigator.of(context).push(MaterialPageRoute<void>(
              builder: (_) => PreviewScreen(bookId: bookId),
            )),
          ),
          IconButton(
            tooltip: S.exportAndShare,
            icon: const Icon(Icons.ios_share),
            onPressed: () => showExportSheet(context, bookId),
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton.extended(
        onPressed: () => _addSection(context, controller, parent: null),
        icon: const Icon(Icons.add),
        label: const Text(S.addSection),
      ),
      body: sections.isEmpty
          ? EmptyState(
              icon: Icons.account_tree_outlined,
              title: S.noSectionsToDisplay,
              subtitle: 'Add acts, parts or chapters, then attach scenes from the Write pool.',
              action: FilledButton.icon(
                onPressed: () => _addSection(context, controller, parent: null),
                icon: const Icon(Icons.add),
                label: const Text(S.addSection),
              ),
            )
          : ListView(
              padding: const EdgeInsets.only(bottom: 120),
              children: [
                for (final section in childrenOf[null] ?? <Section>[])
                  ..._buildSection(context, controller, section, childrenOf, depth: 0),
              ],
            ),
    );
  }

  List<Widget> _buildSection(
    BuildContext context,
    ProjectController controller,
    Section section,
    Map<int?, List<Section>> childrenOf, {
    required int depth,
  }) {
    final theme = Theme.of(context);
    final sceneIds = controller.sectionsDao.sceneIds(section.id);
    final words = controller.scenesDao.wordCountForSections(sceneIds);
    final children = childrenOf[section.id] ?? <Section>[];
    final widgets = <Widget>[];

    widgets.add(
      Material(
        color: theme.colorScheme.surfaceContainerLow,
        child: InkWell(
          onTap: () => controller.sectionsDao.toggleExpanded(section.id, !section.isExpanded).let(
                (_) => controller.reload(),
              ),
          child: Padding(
            padding: EdgeInsets.fromLTRB(8.0 + depth * 16, 6, 8, 6),
            child: Row(
              children: [
                Icon(
                  section.isExpanded ? Icons.expand_more : Icons.chevron_right,
                  size: 20,
                  color: theme.colorScheme.onSurfaceVariant,
                ),
                const SizedBox(width: 4),
                Expanded(
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(
                        section.title,
                        style: theme.textTheme.titleSmall?.copyWith(
                          fontWeight: depth == 0 ? FontWeight.w600 : FontWeight.w500,
                        ),
                        maxLines: 2,
                        overflow: TextOverflow.ellipsis,
                      ),
                      Text(
                        '${sceneIds.length} ${S.scenes.toLowerCase()} · $words ${S.words}'
                        '${section.isCompiled ? '' : ' · excluded'}',
                        style: theme.textTheme.bodySmall,
                      ),
                    ],
                  ),
                ),
                IconButton(
                  visualDensity: VisualDensity.compact,
                  icon: const Icon(Icons.playlist_add),
                  tooltip: S.attachScenes,
                  onPressed: () => _attachScenes(context, controller, section),
                ),
                PopupMenuButton<String>(
                  onSelected: (value) => _sectionAction(
                    context,
                    controller,
                    section,
                    value,
                    childrenOf[section.parentId] ?? <Section>[],
                  ),
                  itemBuilder: (_) => const [
                    PopupMenuItem(value: 'edit', child: Text(S.editSection)),
                    PopupMenuItem(value: 'subsection', child: Text(S.addSubsection)),
                    PopupMenuItem(value: 'compile', child: Text(S.includeInCompile)),
                    PopupMenuItem(value: 'up', child: Text(S.reorderUp)),
                    PopupMenuItem(value: 'down', child: Text(S.reorderDown)),
                    PopupMenuItem(value: 'delete', child: Text(S.delete)),
                  ],
                ),
              ],
            ),
          ),
        ),
      ),
    );

    if (section.isExpanded) {
      for (var i = 0; i < sceneIds.length; i++) {
        final scene = controller.sceneById(sceneIds[i]);
        if (scene == null) continue;
        widgets.add(
          ListTile(
            contentPadding: EdgeInsets.only(left: 40.0 + depth * 16, right: 8),
            dense: true,
            leading: const Icon(Icons.article_outlined, size: 18),
            title: Text(scene.title, maxLines: 1, overflow: TextOverflow.ellipsis),
            subtitle: Text('${controller.scenesDao.wordCount(scene.id)} ${S.words}'),
            onTap: () => Navigator.of(context).push(MaterialPageRoute<void>(
              builder: (_) => SceneEditorScreen(sceneId: scene.id),
            )),
            trailing: PopupMenuButton<String>(
              onSelected: (value) => _sceneAction(
                context,
                controller,
                section,
                scene,
                value,
                i,
                sceneIds.length,
              ),
              itemBuilder: (_) => const [
                PopupMenuItem(value: 'open', child: Text(S.editScene)),
                PopupMenuItem(value: 'up', child: Text(S.reorderUp)),
                PopupMenuItem(value: 'down', child: Text(S.reorderDown)),
                PopupMenuItem(value: 'remove', child: Text(S.removeFromSection)),
              ],
            ),
          ),
        );
      }
      for (final child in children) {
        widgets.addAll(_buildSection(context, controller, child, childrenOf, depth: depth + 1));
      }
    }
    return widgets;
  }

  Future<void> _sceneAction(
    BuildContext context,
    ProjectController controller,
    Section section,
    Scene scene,
    String action,
    int index,
    int length,
  ) async {
    final ordered = controller.sectionsDao.sceneIds(section.id);
    switch (action) {
      case 'open':
        Navigator.of(context).push(MaterialPageRoute<void>(
          builder: (_) => SceneEditorScreen(sceneId: scene.id),
        ));
        break;
      case 'up':
        if (index == 0) return;
        final ids = [...ordered];
        ids.removeAt(index);
        ids.insert(index - 1, scene.id);
        controller.sectionsDao.reorderScenes(section.id, ids);
        controller.reload();
        break;
      case 'down':
        if (index >= length - 1) return;
        final ids = [...ordered];
        ids.removeAt(index);
        ids.insert(index + 1, scene.id);
        controller.sectionsDao.reorderScenes(section.id, ids);
        controller.reload();
        break;
      case 'remove':
        controller.sectionsDao.detachScene(section.id, scene.id);
        controller.reload();
        break;
    }
  }

  Future<void> _sectionAction(
    BuildContext context,
    ProjectController controller,
    Section section,
    String action,
    List<Section> siblings,
  ) async {
    switch (action) {
      case 'edit':
        final title = await promptForText(
          context,
          title: S.editSection,
          initial: section.title,
        );
        if (title != null && title.isNotEmpty) {
          controller.sectionsDao.update(section.id, title: title);
          controller.reload();
        }
        break;
      case 'subsection':
        await _addSection(context, controller, parent: section);
        break;
      case 'compile':
        controller.sectionsDao.toggleCompiled(section.id, !section.isCompiled);
        controller.reload();
        break;
      case 'up':
      case 'down':
        final ordered = siblings.map((s) => s.id).toList();
        final index = ordered.indexOf(section.id);
        if (index < 0) return;
        final target = action == 'up' ? index - 1 : index + 1;
        if (target < 0 || target >= ordered.length) return;
        ordered.removeAt(index);
        ordered.insert(target, section.id);
        controller.sectionsDao.reorder(ordered);
        controller.reload();
        break;
      case 'delete':
        final confirmed = await confirmAction(
          context,
          title: S.delete,
          message: 'The section and its subsections are removed from the book. '
              'Scenes stay in the Write pool.',
        );
        if (confirmed) {
          controller.sectionsDao.delete(section.id);
          controller.reload();
        }
        break;
    }
  }

  Future<void> _addSection(
    BuildContext context,
    ProjectController controller, {
    Section? parent,
  }) async {
    final title = await promptForText(
      context,
      title: parent == null ? S.addSection : S.addSubsection,
      hint: 'Chapter title',
    );
    if (title == null || title.isEmpty) return;
    controller.sectionsDao.create(
      bookId: bookId,
      parentId: parent?.id,
      title: title,
    );
    controller.reload();
  }

  Future<void> _attachScenes(
    BuildContext context,
    ProjectController controller,
    Section section,
  ) async {
    final alreadyAttached = controller.sectionsDao.sceneIds(section.id).toSet();
    final selected = <int>{...alreadyAttached};
    final result = await showModalBottomSheet<bool>(
      context: context,
      isScrollControlled: true,
      builder: (sheetContext) {
        return StatefulBuilder(
          builder: (context, setState) {
            return DraggableScrollableSheet(
              expand: false,
              initialChildSize: 0.75,
              maxChildSize: 0.95,
              builder: (context, scrollController) {
                return Column(
                  children: [
                    Padding(
                      padding: const EdgeInsets.all(16),
                      child: Row(
                        children: [
                          Expanded(
                            child: Text(
                              S.attachScenes,
                              style: Theme.of(context).textTheme.titleMedium,
                            ),
                          ),
                          TextButton(
                            onPressed: () => Navigator.of(sheetContext).pop(false),
                            child: const Text(S.cancel),
                          ),
                          const SizedBox(width: 8),
                          FilledButton(
                            onPressed: () => Navigator.of(sheetContext).pop(true),
                            child: const Text(S.done),
                          ),
                        ],
                      ),
                    ),
                    const Divider(height: 1),
                    Expanded(
                      child: controller.scenes.isEmpty
                          ? const EmptyState(
                              icon: Icons.article_outlined,
                              title: S.noScenesToDisplay,
                            )
                          : ListView.builder(
                              controller: scrollController,
                              itemCount: controller.scenes.length,
                              itemBuilder: (context, index) {
                                final scene = controller.scenes[index];
                                final checked = selected.contains(scene.id);
                                return CheckboxListTile(
                                  value: checked,
                                  title: Text(scene.title),
                                  subtitle: Text(
                                    controller.statusById(scene.statusId)?.title ?? '',
                                  ),
                                  onChanged: (value) => setState(() {
                                    if (value == true) {
                                      selected.add(scene.id);
                                    } else {
                                      selected.remove(scene.id);
                                    }
                                  }),
                                );
                              },
                            ),
                    ),
                  ],
                );
              },
            );
          },
        );
      },
    );

    if (result == true) {
      controller.sectionsDao.attachScenes(section.id, selected);
      final removed = alreadyAttached.difference(selected);
      for (final sceneId in removed) {
        controller.sectionsDao.detachScene(section.id, sceneId);
      }
      controller.reload();
    }
  }
}

extension _Let<T> on T {
  R let<R>(R Function(T) action) => action(this);
}
