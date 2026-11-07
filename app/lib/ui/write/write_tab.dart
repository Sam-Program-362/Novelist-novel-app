import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../core/utils/text_doc.dart';
import '../../state/project_controller.dart';
import '../widgets/common.dart';
import 'scene_editor_screen.dart';

/// Write module: the project-wide scene pool shared by every book.
class WriteTab extends StatelessWidget {
  const WriteTab({super.key});

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final scenes = controller.scenes;

    return Scaffold(
      floatingActionButton: FloatingActionButton.extended(
        heroTag: 'write-fab',
        onPressed: () => _addScene(context, controller),
        icon: const Icon(Icons.add),
        label: const Text(S.addScene),
      ),
      body: scenes.isEmpty
          ? EmptyState(
              icon: Icons.edit_note_outlined,
              title: S.noScenesToDisplay,
              subtitle: 'Scenes are drafted here and attached to books later.',
              action: FilledButton.icon(
                onPressed: () => _addScene(context, controller),
                icon: const Icon(Icons.add),
                label: const Text(S.addScene),
              ),
            )
          : ListView.separated(
              padding: const EdgeInsets.only(bottom: 96),
              itemCount: scenes.length,
              separatorBuilder: (_, __) => const Divider(indent: 64, height: 1),
              itemBuilder: (context, index) {
                final scene = scenes[index];
                final status = controller.statusById(scene.statusId);
                final words = TextDoc.fromJsonString(scene.text).wordCount;
                return ListTile(
                  leading: GestureDetector(
                    onTap: () => _changeStatus(context, controller, scene.id, scene.statusId),
                    onLongPress: () => _deleteScene(context, controller, scene.id, scene.title),
                    child: StatusDot(colour: status?.colour ?? 0xFF9E9E9E),
                  ),
                  title: Text(scene.title, maxLines: 1, overflow: TextOverflow.ellipsis),
                  subtitle: Text(
                    scene.synopsis?.isNotEmpty == true ? scene.synopsis! : (status?.title ?? ''),
                    maxLines: 2,
                    overflow: TextOverflow.ellipsis,
                  ),
                  trailing: Row(
                    mainAxisSize: MainAxisSize.min,
                    children: [
                      Text('$words', style: Theme.of(context).textTheme.labelSmall),
                      PopupMenuButton<String>(
                        onSelected: (value) async {
                          switch (value) {
                            case 'edit':
                              _openEditor(context, scene.id);
                              break;
                            case 'up':
                            case 'down':
                              final ids = scenes.map((s) => s.id).toList();
                              final target = value == 'up' ? index - 1 : index + 1;
                              if (target < 0 || target >= ids.length) return;
                              final moved = ids.removeAt(index);
                              ids.insert(target, moved);
                              controller.reorderScenes(ids);
                              break;
                            case 'delete':
                              await _deleteScene(context, controller, scene.id, scene.title);
                              break;
                          }
                        },
                        itemBuilder: (_) => const [
                          PopupMenuItem(value: 'edit', child: Text(S.editScene)),
                          PopupMenuItem(value: 'up', child: Text(S.reorderUp)),
                          PopupMenuItem(value: 'down', child: Text(S.reorderDown)),
                          PopupMenuItem(value: 'delete', child: Text(S.delete)),
                        ],
                      ),
                    ],
                  ),
                  onTap: () => _openEditor(context, scene.id),
                );
              },
            ),
    );
  }

  void _openEditor(BuildContext context, int sceneId) {
    Navigator.of(context).push(MaterialPageRoute<void>(
      builder: (_) => SceneEditorScreen(sceneId: sceneId),
    ));
  }

  Future<void> _addScene(BuildContext context, ProjectController controller) async {
    final title = await promptForText(context, title: S.addScene, hint: S.sceneTitle);
    if (title == null || title.isEmpty) {
      if (context.mounted && title != null) showMessage(context, S.pleaseEnterATitle);
      return;
    }
    final scene = controller.createScene(title: title);
    if (context.mounted) _openEditor(context, scene.id);
  }

  Future<void> _changeStatus(
    BuildContext context,
    ProjectController controller,
    int sceneId,
    int currentStatusId,
  ) async {
    final selected = await showModalBottomSheet<int>(
      context: context,
      builder: (sheetContext) => SafeArea(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            for (final status in controller.statuses)
              ListTile(
                leading: StatusDot(colour: status.colour),
                title: Text(status.title),
                selected: status.id == currentStatusId,
                onTap: () => Navigator.of(sheetContext).pop(status.id),
              ),
          ],
        ),
      ),
    );
    if (selected != null) controller.updateScene(sceneId, statusId: selected);
  }

  Future<void> _deleteScene(
    BuildContext context,
    ProjectController controller,
    int sceneId,
    String title,
  ) async {
    final confirmed = await confirmAction(
      context,
      title: S.delete,
      message: '“$title” will be removed from the project and from every book it is attached to.',
    );
    if (confirmed) controller.deleteScene(sceneId);
  }
}
