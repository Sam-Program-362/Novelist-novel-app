import 'dart:io';

import 'package:file_picker/file_picker.dart';
import 'package:flutter/material.dart';
import 'package:path_provider/path_provider.dart';
import 'package:provider/provider.dart';
import 'package:share_plus/share_plus.dart';

import '../../core/l10n/strings.dart';
import '../../data/dao/projects_dao.dart';
import '../../models/entities.dart';
import '../../state/library_controller.dart';
import '../../state/open_project.dart';
import '../settings/settings_screen.dart';
import '../shell/project_screen.dart';
import '../widgets/common.dart';

class LibraryScreen extends StatelessWidget {
  const LibraryScreen({super.key});

  Future<void> _createProject(BuildContext context) async {
    final controller = context.read<LibraryController>();
    final titleController = TextEditingController();
    final descriptionController = TextEditingController();
    var useStandardTemplate = true;

    final created = await showDialog<Project>(
      context: context,
      builder: (dialogContext) {
        return StatefulBuilder(
          builder: (context, setState) => AlertDialog(
            title: const Text(S.addProject),
            content: SingleChildScrollView(
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  TextField(
                    controller: titleController,
                    autofocus: true,
                    decoration: const InputDecoration(labelText: S.project),
                  ),
                  const SizedBox(height: 12),
                  TextField(
                    controller: descriptionController,
                    maxLines: 3,
                    decoration: const InputDecoration(labelText: S.description),
                  ),
                  const SizedBox(height: 16),
                  RadioGroup<bool>(
                    groupValue: useStandardTemplate,
                    onChanged: (value) =>
                        setState(() => useStandardTemplate = value ?? true),
                    child: const Column(
                      children: [
                        RadioListTile<bool>(
                          value: true,
                          contentPadding: EdgeInsets.zero,
                          title: Text('Novel standard template'),
                          subtitle:
                              Text('Themes, Events, Characters, Locations, Props, Custom'),
                        ),
                        RadioListTile<bool>(
                          value: false,
                          contentPadding: EdgeInsets.zero,
                          title: Text('Empty template'),
                          subtitle: Text('Start from scratch with one status'),
                        ),
                      ],
                    ),
                  ),
                ],
              ),
            ),
            actions: [
              TextButton(
                onPressed: () => Navigator.of(dialogContext).pop(),
                child: const Text(S.cancel),
              ),
              FilledButton(
                onPressed: () async {
                  if (titleController.text.trim().isEmpty) {
                    showMessage(context, S.pleaseEnterATitle);
                    return;
                  }
                  final project = await controller.createProject(
                    title: titleController.text.trim(),
                    description: descriptionController.text.trim().isEmpty
                        ? null
                        : descriptionController.text.trim(),
                    empty: !useStandardTemplate,
                  );
                  if (dialogContext.mounted) Navigator.of(dialogContext).pop(project);
                },
                child: const Text(S.add),
              ),
            ],
          ),
        );
      },
    );

    if (created != null && context.mounted) {
      // Open the project that was just created, not whichever one sorts first.
      _openProject(context, created);
    }
  }

  void _openProject(BuildContext context, Project project) {
    context.read<OpenProject>().open(project.id);
    Navigator.of(context).push(
      MaterialPageRoute<void>(
        builder: (_) => ProjectScreen(projectId: project.id),
      ),
    );
  }

  Future<void> _exportBackup(BuildContext context, Project project) async {
    final controller = context.read<LibraryController>();
    try {
      final content = controller.exportProject(project.id);
      final directory = await getTemporaryDirectory();
      final file = File('${directory.path}/${project.title.replaceAll('/', '-')}.nov');
      await file.writeAsString(content);
      await Share.shareXFiles([XFile(file.path)], text: project.title);
    } catch (error) {
      if (context.mounted) showMessage(context, '${S.anErrorOccurred}: $error');
    }
  }

  Future<void> _importBackup(BuildContext context) async {
    final controller = context.read<LibraryController>();
    try {
      final result = await FilePicker.platform.pickFiles(withData: true);
      final file = result?.files.single;
      if (file == null) return;
      String? content;
      if (file.bytes != null) {
        content = String.fromCharCodes(file.bytes!);
      } else if (file.path != null) {
        content = await File(file.path!).readAsString();
      }
      if (content == null) return;
      controller.importProject(content);
      if (context.mounted) showMessage(context, S.backupRestored);
    } catch (error) {
      if (context.mounted) {
        showMessage(context, '${S.invalidBackupFile}: $error');
      }
    }
  }

  Future<void> _showProjectMenu(BuildContext context, Project project) async {
    final controller = context.read<LibraryController>();
    await showModalBottomSheet<void>(
      context: context,
      builder: (sheetContext) => SafeArea(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            ListTile(
              leading: const Icon(Icons.edit_outlined),
              title: const Text(S.editProject),
              onTap: () async {
                Navigator.of(sheetContext).pop();
                final title = await promptForText(
                  context,
                  title: S.editProject,
                  initial: project.title,
                );
                if (title != null && title.isNotEmpty) {
                  controller.updateProject(project.id, title: title);
                }
              },
            ),
            ListTile(
              leading: const Icon(Icons.image_outlined),
              title: const Text(S.setCover),
              onTap: () async {
                Navigator.of(sheetContext).pop();
                final cover = await pickImageAsDataUri(context);
                if (cover != null) controller.setCover(project.id, cover);
              },
            ),
            if (project.cover != null)
              ListTile(
                leading: const Icon(Icons.hide_image_outlined),
                title: const Text(S.clearCover),
                onTap: () {
                  Navigator.of(sheetContext).pop();
                  controller.setCover(project.id, null);
                },
              ),
            ListTile(
              leading: const Icon(Icons.save_alt_outlined),
              title: const Text(S.createBackup),
              subtitle: Text('${S.lastBackupDate}: ${formatDate(project.lastBackupDate)}'),
              onTap: () async {
                Navigator.of(sheetContext).pop();
                await _exportBackup(context, project);
              },
            ),
            ListTile(
              leading: const Icon(Icons.copy_all_outlined),
              title: const Text('Duplicate project'),
              onTap: () {
                Navigator.of(sheetContext).pop();
                controller.duplicateProject(project.id);
              },
            ),
            ListTile(
              leading: Icon(
                Icons.delete_outline,
                color: Theme.of(context).colorScheme.error,
              ),
              title: Text(
                S.deleteProject,
                style: TextStyle(color: Theme.of(context).colorScheme.error),
              ),
              onTap: () async {
                Navigator.of(sheetContext).pop();
                final confirmed = await confirmAction(
                  context,
                  title: S.deleteProject,
                  message: 'This operation cannot be undone. '
                      'Every book, scene, plot item and section of this project will be deleted.',
                );
                if (confirmed) controller.deleteProject(project.id);
              },
            ),
          ],
        ),
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<LibraryController>();
    final projects = controller.projects;

    return Scaffold(
      appBar: AppBar(
        title: const Text(S.library),
        actions: [
          PopupMenuButton<String>(
            icon: const Icon(Icons.sort),
            tooltip: S.sortBy,
            onSelected: (value) {
              switch (value) {
                case 'title':
                  controller.setSort(ProjectSortField.title, ascending: true);
                  break;
                case 'updated':
                  controller.setSort(ProjectSortField.lastUpdate, ascending: false);
                  break;
                case 'backup':
                  controller.setSort(ProjectSortField.lastBackup, ascending: false);
                  break;
                case 'direction':
                  controller.toggleSortDirection();
                  break;
              }
            },
            itemBuilder: (_) => const [
              PopupMenuItem(value: 'title', child: Text('Title')),
              PopupMenuItem(value: 'updated', child: Text('Last update')),
              PopupMenuItem(value: 'backup', child: Text(S.lastBackupDate)),
              PopupMenuItem(value: 'direction', child: Text('Reverse order')),
            ],
          ),
          IconButton(
            tooltip: controller.gridView ? S.listView : S.gridView,
            icon: Icon(controller.gridView ? Icons.view_list_outlined : Icons.grid_view_outlined),
            onPressed: () => controller.setGridView(!controller.gridView),
          ),
          PopupMenuButton<String>(
            onSelected: (value) {
              if (value == 'import') _importBackup(context);
              if (value == 'settings') {
                Navigator.of(context).push(MaterialPageRoute<void>(
                  builder: (_) => const SettingsScreen(),
                ));
              }
            },
            itemBuilder: (_) => const [
              PopupMenuItem(value: 'import', child: Text(S.restoreBackup)),
              PopupMenuItem(value: 'settings', child: Text(S.settings)),
            ],
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        heroTag: 'library-fab',
        tooltip: S.addProject,
        onPressed: () => _createProject(context),
        child: const Icon(Icons.add),
      ),
      body: projects.isEmpty
          ? EmptyState(
              icon: Icons.auto_stories_outlined,
              title: S.noBooksToDisplay,
              subtitle: S.createFirstProject,
              action: FilledButton.icon(
                onPressed: () => _createProject(context),
                icon: const Icon(Icons.add),
                label: const Text(S.addProject),
              ),
            )
          : controller.gridView
              ? GridView.builder(
                  padding: const EdgeInsets.all(12),
                  gridDelegate: const SliverGridDelegateWithMaxCrossAxisExtent(
                    maxCrossAxisExtent: 200,
                    childAspectRatio: 0.62,
                    crossAxisSpacing: 12,
                    mainAxisSpacing: 12,
                  ),
                  itemCount: projects.length,
                  itemBuilder: (context, index) {
                    final project = projects[index];
                    return _ProjectCard(
                      project: project,
                      onTap: () => _openProject(context, project),
                      onMenu: () => _showProjectMenu(context, project),
                    );
                  },
                )
              : ListView.separated(
                  padding: const EdgeInsets.only(bottom: 96),
                  itemCount: projects.length,
                  separatorBuilder: (_, __) => const Divider(indent: 88),
                  itemBuilder: (context, index) {
                    final project = projects[index];
                    return ListTile(
                      contentPadding: const EdgeInsets.symmetric(horizontal: 16, vertical: 6),
                      leading: CoverThumb(cover: project.cover, width: 48, height: 64),
                      title: Text(project.title, maxLines: 1, overflow: TextOverflow.ellipsis),
                      subtitle: Text(
                        project.description ?? S.notSet,
                        maxLines: 2,
                        overflow: TextOverflow.ellipsis,
                      ),
                      trailing: Row(
                        mainAxisSize: MainAxisSize.min,
                        children: [
                          BackupIndicator(hasBackup: project.hasBackup),
                          IconButton(
                            icon: const Icon(Icons.more_vert),
                            onPressed: () => _showProjectMenu(context, project),
                          ),
                        ],
                      ),
                      onTap: () => _openProject(context, project),
                      onLongPress: () => _showProjectMenu(context, project),
                    );
                  },
                ),
    );
  }
}

class _ProjectCard extends StatelessWidget {
  final Project project;
  final VoidCallback onTap;
  final VoidCallback onMenu;

  const _ProjectCard({required this.project, required this.onTap, required this.onMenu});

  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);
    return InkWell(
      borderRadius: BorderRadius.circular(12),
      onTap: onTap,
      onLongPress: onMenu,
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Expanded(
            child: Stack(
              children: [
                Positioned.fill(
                  child: CoverThumb(
                    cover: project.cover,
                    width: double.infinity,
                    height: double.infinity,
                  ),
                ),
                Positioned(
                  top: 6,
                  right: 6,
                  child: Container(
                    padding: const EdgeInsets.all(4),
                    decoration: BoxDecoration(
                      color: theme.colorScheme.surface.withValues(alpha: 0.75),
                      shape: BoxShape.circle,
                    ),
                    child: BackupIndicator(hasBackup: project.hasBackup),
                  ),
                ),
                Positioned(
                  top: 0,
                  left: 0,
                  child: IconButton(
                    visualDensity: VisualDensity.compact,
                    icon: const Icon(Icons.more_vert, size: 18),
                    onPressed: onMenu,
                  ),
                ),
              ],
            ),
          ),
          const SizedBox(height: 8),
          Text(
            project.title,
            maxLines: 1,
            overflow: TextOverflow.ellipsis,
            style: theme.textTheme.titleSmall,
          ),
          Text(
            formatDate(project.lastUpdateDate),
            style: theme.textTheme.bodySmall?.copyWith(color: theme.colorScheme.onSurfaceVariant),
          ),
        ],
      ),
    );
  }
}
