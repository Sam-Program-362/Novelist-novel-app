import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../state/project_controller.dart';
import '../widgets/common.dart';

/// Management surface for the Plot module's schema: categories, metadata groups/elements,
/// statuses and subplots — all of which are project-level and user editable in the reference.
Future<void> showPlotManagement(BuildContext context, {int initialTab = 0}) {
  return showModalBottomSheet<void>(
    context: context,
    isScrollControlled: true,
    builder: (_) => _PlotManagementSheet(initialTab: initialTab),
  );
}

class _PlotManagementSheet extends StatefulWidget {
  final int initialTab;

  const _PlotManagementSheet({required this.initialTab});

  @override
  State<_PlotManagementSheet> createState() => _PlotManagementSheetState();
}

class _PlotManagementSheetState extends State<_PlotManagementSheet> {
  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    return DefaultTabController(
      length: 4,
      initialIndex: widget.initialTab,
      child: DraggableScrollableSheet(
        expand: false,
        initialChildSize: 0.85,
        maxChildSize: 0.95,
        builder: (context, scrollController) {
          return Column(
            children: [
              Padding(
                padding: const EdgeInsets.fromLTRB(16, 16, 8, 8),
                child: Row(
                  children: [
                    Expanded(
                      child: Text('Manage plot', style: Theme.of(context).textTheme.titleLarge),
                    ),
                    IconButton(
                      icon: const Icon(Icons.close),
                      onPressed: () => Navigator.of(context).pop(),
                    ),
                  ],
                ),
              ),
              TabBar(
                onTap: (index) => setState(() {}),
                isScrollable: true,
                tabAlignment: TabAlignment.start,
                tabs: const [
                  Tab(text: S.categories),
                  Tab(text: 'Metadata'),
                  Tab(text: S.statuses),
                  Tab(text: S.subplots),
                ],
              ),
              Expanded(
                child: TabBarView(
                  children: [
                    _CategoriesList(controller: controller, scrollController: scrollController),
                    _MetadataList(controller: controller, scrollController: scrollController),
                    _StatusesList(controller: controller, scrollController: scrollController),
                    _SubplotsList(controller: controller, scrollController: scrollController),
                  ],
                ),
              ),
            ],
          );
        },
      ),
    );
  }
}

class _CategoriesList extends StatelessWidget {
  final ProjectController controller;
  final ScrollController scrollController;

  const _CategoriesList({required this.controller, required this.scrollController});

  @override
  Widget build(BuildContext context) {
    final categories = controller.categories;
    return Scaffold(
      backgroundColor: Colors.transparent,
      floatingActionButton: FloatingActionButton.small(
        onPressed: () async {
          final title = await promptForText(context, title: S.addCategory);
          if (title == null || title.isEmpty) return;
          final colour = await pickColour(context) ?? 0xFF81B1F4;
          controller.addCategory(title, colour);
        },
        child: const Icon(Icons.add),
      ),
      body: categories.isEmpty
          ? const EmptyState(icon: Icons.category_outlined, title: S.noCategoriesToDisplay)
          : ListView.builder(
              controller: scrollController,
              padding: const EdgeInsets.only(bottom: 96),
              itemCount: categories.length,
              itemBuilder: (context, index) {
                final category = categories[index];
                return ListTile(
                  leading: StatusDot(colour: category.colour, size: 18),
                  title: Text(category.title),
                  subtitle: Text('${controller.items(category.id).length} items'),
                  trailing: PopupMenuButton<String>(
                    onSelected: (value) async {
                      switch (value) {
                        case 'edit':
                          final title = await promptForText(
                            context,
                            title: S.editCategory,
                            initial: category.title,
                          );
                          if (title != null && title.isNotEmpty) {
                            controller.updateCategory(category.id, title: title);
                          }
                          break;
                        case 'colour':
                          final colour = await pickColour(context, current: category.colour);
                          if (colour != null) {
                            controller.updateCategory(category.id, colour: colour);
                          }
                          break;
                        case 'up':
                        case 'down':
                          final ids = categories.map((c) => c.id).toList();
                          final target = value == 'up' ? index - 1 : index + 1;
                          if (target < 0 || target >= ids.length) return;
                          final moved = ids.removeAt(index);
                          ids.insert(target, moved);
                          controller.reorderCategories(ids);
                          break;
                        case 'delete':
                          final confirmed = await confirmAction(
                            context,
                            title: S.delete,
                            message: 'All items and metadata of this category will be deleted.',
                          );
                          if (confirmed) controller.deleteCategory(category.id);
                          break;
                      }
                    },
                    itemBuilder: (_) => const [
                      PopupMenuItem(value: 'edit', child: Text(S.editCategory)),
                      PopupMenuItem(value: 'colour', child: Text(S.pickColour)),
                      PopupMenuItem(value: 'up', child: Text(S.reorderUp)),
                      PopupMenuItem(value: 'down', child: Text(S.reorderDown)),
                      PopupMenuItem(value: 'delete', child: Text(S.delete)),
                    ],
                  ),
                );
              },
            ),
    );
  }
}

class _MetadataList extends StatelessWidget {
  final ProjectController controller;
  final ScrollController scrollController;

  const _MetadataList({required this.controller, required this.scrollController});

  @override
  Widget build(BuildContext context) {
    final categories = controller.categories;
    if (categories.isEmpty) {
      return const EmptyState(icon: Icons.list_alt, title: S.noCategoriesToDisplay);
    }
    return ListView(
      controller: scrollController,
      children: [
        for (final category in categories) ...[
          Padding(
            padding: const EdgeInsets.fromLTRB(16, 16, 16, 4),
            child: Row(
              children: [
                StatusDot(colour: category.colour, size: 14),
                const SizedBox(width: 8),
                Expanded(child: Text(category.title, style: Theme.of(context).textTheme.titleSmall)),
                IconButton(
                  icon: const Icon(Icons.add, size: 18),
                  tooltip: S.addMetadataGroup,
                  onPressed: () async {
                    final title = await promptForText(
                      context,
                      title: S.addMetadataGroup,
                      hint: 'e.g. Physical',
                    );
                    if (title == null || title.isEmpty) return;
                    controller.plotDao.addMetadataGroup(
                      categoryId: category.id,
                      title: title,
                    );
                    controller.reload();
                  },
                ),
              ],
            ),
          ),
          if (controller.plotDao.metadataGroups(category.id).isEmpty)
            const Padding(
              padding: EdgeInsets.symmetric(horizontal: 24, vertical: 6),
              child: Text(S.noMetadataGroupsToDisplay, style: TextStyle(fontSize: 12)),
            ),
          for (final group in controller.plotDao.metadataGroups(category.id)) ...[
            ListTile(
              dense: true,
              contentPadding: const EdgeInsets.only(left: 48, right: 8),
              title: Text(group.title),
              subtitle: Text('${controller.plotDao.metadataElements(group.id).length} fields'),
              trailing: PopupMenuButton<String>(
                onSelected: (value) async {
                  if (value == 'add') {
                    final title = await promptForText(
                      context,
                      title: S.addMetadataElement,
                      hint: 'e.g. Age',
                    );
                    if (title == null || title.isEmpty) return;
                    controller.plotDao.addMetadataElement(groupId: group.id, title: title);
                    controller.reload();
                  } else if (value == 'rename') {
                    final title = await promptForText(
                      context,
                      title: S.editMetadataGroup,
                      initial: group.title,
                    );
                    if (title == null || title.isEmpty) return;
                    controller.plotDao.updateMetadataGroup(group.id, title: title);
                    controller.reload();
                  } else if (value == 'delete') {
                    controller.plotDao.deleteMetadataGroup(group.id);
                    controller.reload();
                  }
                },
                itemBuilder: (_) => const [
                  PopupMenuItem(value: 'add', child: Text(S.addMetadataElement)),
                  PopupMenuItem(value: 'rename', child: Text(S.editMetadataGroup)),
                  PopupMenuItem(value: 'delete', child: Text(S.delete)),
                ],
              ),
            ),
            for (final element in controller.plotDao.metadataElements(group.id))
              ListTile(
                dense: true,
                contentPadding: const EdgeInsets.only(left: 72, right: 8),
                leading: Icon(
                  element.isRelevant ? Icons.visibility : Icons.visibility_off_outlined,
                  size: 16,
                ),
                title: Text(element.title),
                onTap: () async {
                  final title = await promptForText(
                    context,
                    title: S.editMetadataElement,
                    initial: element.title,
                  );
                  if (title == null || title.isEmpty) return;
                  controller.plotDao.updateMetadataElement(element.id, title: title);
                  controller.reload();
                },
                trailing: Switch(
                  value: element.isRelevant,
                  onChanged: (value) {
                    controller.plotDao.updateMetadataElement(element.id, isRelevant: value);
                    controller.reload();
                  },
                ),
              ),
          ],
        ],
        const SizedBox(height: 40),
      ],
    );
  }
}

class _StatusesList extends StatelessWidget {
  final ProjectController controller;
  final ScrollController scrollController;

  const _StatusesList({required this.controller, required this.scrollController});

  @override
  Widget build(BuildContext context) {
    final statuses = controller.statuses;
    return Scaffold(
      backgroundColor: Colors.transparent,
      floatingActionButton: FloatingActionButton.small(
        onPressed: () async {
          final title = await promptForText(context, title: S.addStatus);
          if (title == null || title.isEmpty) return;
          final colour = await pickColour(context) ?? 0xFF9E9E9E;
          controller.addStatus(title, colour);
        },
        child: const Icon(Icons.add),
      ),
      body: ListView.builder(
        controller: scrollController,
        padding: const EdgeInsets.only(bottom: 96),
        itemCount: statuses.length,
        itemBuilder: (context, index) {
          final status = statuses[index];
          return ListTile(
            leading: StatusDot(colour: status.colour),
            title: Text(status.title),
            trailing: PopupMenuButton<String>(
              onSelected: (value) async {
                switch (value) {
                  case 'edit':
                    final title = await promptForText(
                      context,
                      title: S.editStatus,
                      initial: status.title,
                    );
                    if (title != null && title.isNotEmpty) {
                      controller.updateStatus(status.id, title: title);
                    }
                    break;
                  case 'colour':
                    final colour = await pickColour(context, current: status.colour);
                    if (colour != null) controller.updateStatus(status.id, colour: colour);
                    break;
                  case 'delete':
                    controller.deleteStatus(status.id);
                    break;
                }
              },
              itemBuilder: (_) => const [
                PopupMenuItem(value: 'edit', child: Text(S.editStatus)),
                PopupMenuItem(value: 'colour', child: Text(S.pickColour)),
                PopupMenuItem(value: 'delete', child: Text(S.delete)),
              ],
            ),
          );
        },
      ),
    );
  }
}

class _SubplotsList extends StatelessWidget {
  final ProjectController controller;
  final ScrollController scrollController;

  const _SubplotsList({required this.controller, required this.scrollController});

  @override
  Widget build(BuildContext context) {
    final subplots = controller.subplots;
    return Scaffold(
      backgroundColor: Colors.transparent,
      floatingActionButton: FloatingActionButton.small(
        onPressed: () async {
          final title = await promptForText(context, title: S.addSubplot);
          if (title == null || title.isEmpty) return;
          final colour = await pickColour(context) ?? 0xFF81B1F4;
          controller.addSubplot(title, colour);
        },
        child: const Icon(Icons.add),
      ),
      body: subplots.isEmpty
          ? const EmptyState(icon: Icons.alt_route, title: S.noSubplotsToDisplay)
          : ListView.builder(
              controller: scrollController,
              padding: const EdgeInsets.only(bottom: 96),
              itemCount: subplots.length,
              itemBuilder: (context, index) {
                final subplot = subplots[index];
                return ListTile(
                  leading: StatusDot(colour: subplot.colour),
                  title: Text(subplot.title),
                  trailing: PopupMenuButton<String>(
                    onSelected: (value) async {
                      if (value == 'edit') {
                        final title = await promptForText(
                          context,
                          title: S.editSubplot,
                          initial: subplot.title,
                        );
                        if (title != null && title.isNotEmpty) {
                          controller.updateSubplot(subplot.id, title: title);
                        }
                      } else if (value == 'delete') {
                        controller.deleteSubplot(subplot.id);
                      }
                    },
                    itemBuilder: (_) => const [
                      PopupMenuItem(value: 'edit', child: Text(S.editSubplot)),
                      PopupMenuItem(value: 'delete', child: Text(S.delete)),
                    ],
                  ),
                );
              },
            ),
    );
  }
}
