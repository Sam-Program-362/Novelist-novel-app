import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../models/entities.dart';
import '../../state/project_controller.dart';
import '../../core/utils/iterable_x.dart';
import '../widgets/common.dart';
import 'item_detail_screen.dart';
import 'plot_management_sheets.dart';

/// Plot module: categories of story elements and their items.
class PlotTab extends StatefulWidget {
  const PlotTab({super.key});

  @override
  State<PlotTab> createState() => _PlotTabState();
}

class _PlotTabState extends State<PlotTab> {
  int? _categoryId;

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final categories = controller.categories;

    if (categories.isEmpty) {
      return EmptyState(
        icon: Icons.account_tree_outlined,
        title: S.noCategoriesToDisplay,
        subtitle: 'Categories group story elements such as characters, locations and events.',
        action: FilledButton.icon(
          onPressed: () => showPlotManagement(context, initialTab: 0),
          icon: const Icon(Icons.add),
          label: const Text(S.addCategory),
        ),
      );
    }

    final selected = categories.where((c) => c.id == _categoryId).firstOrNull ?? categories.first;
    final items = controller.items(selected.id);

    return Scaffold(
      floatingActionButton: FloatingActionButton.extended(
        onPressed: () => _addItem(context, controller, selected),
        icon: const Icon(Icons.add),
        label: const Text(S.addItem),
      ),
      body: Column(
        children: [
          SizedBox(
            height: 56,
            child: ListView(
              scrollDirection: Axis.horizontal,
              padding: const EdgeInsets.symmetric(horizontal: 12),
              children: [
                for (final category in categories)
                  Padding(
                    padding: const EdgeInsets.only(right: 8),
                    child: ChoiceChip(
                      selected: category.id == selected.id,
                      avatar: StatusDot(colour: category.colour, size: 14),
                      label: Text(category.title),
                      onSelected: (_) => setState(() => _categoryId = category.id),
                    ),
                  ),
                Padding(
                  padding: const EdgeInsets.only(right: 12),
                  child: ActionChip(
                    avatar: const Icon(Icons.tune, size: 16),
                    label: const Text('Manage'),
                    onPressed: () => showPlotManagement(context),
                  ),
                ),
              ],
            ),
          ),
          const Divider(height: 1),
          Expanded(
            child: items.isEmpty
                ? EmptyState(
                    icon: Icons.account_tree_outlined,
                    title: S.noItemsToDisplay,
                    subtitle: 'Add the first element of “${selected.title}”.',
                  )
                : ListView.separated(
                    padding: const EdgeInsets.only(bottom: 96),
                    itemCount: items.length,
                    separatorBuilder: (_, __) => const Divider(indent: 64, height: 1),
                    itemBuilder: (context, index) {
                      final item = items[index];
                      final status = controller.statusById(item.statusId);
                      return ListTile(
                        leading: GestureDetector(
                          onTap: () => _changeStatus(context, controller, item),
                          onLongPress: () => _deleteOrMerge(context, controller, item),
                          child: StatusDot(colour: status?.colour ?? 0xFF9E9E9E),
                        ),
                        title: Text(item.title, maxLines: 1, overflow: TextOverflow.ellipsis),
                        subtitle: Text(
                          item.synopsis?.isNotEmpty == true ? item.synopsis! : (status?.title ?? ''),
                          maxLines: 2,
                          overflow: TextOverflow.ellipsis,
                        ),
                        trailing: PopupMenuButton<String>(
                          onSelected: (value) async {
                            switch (value) {
                              case 'edit':
                                final title = await promptForText(
                                  context,
                                  title: S.editItem,
                                  initial: item.title,
                                );
                                if (title != null && title.isNotEmpty) {
                                  controller.updateItem(item.id, title: title);
                                }
                                break;
                              case 'up':
                              case 'down':
                                await _reorder(controller, items, index, value);
                                break;
                              case 'delete':
                                final confirmed = await confirmAction(
                                  context,
                                  title: S.delete,
                                  message: S.areYouSureYouWantToDelete,
                                );
                                if (confirmed) controller.deleteItem(item.id);
                                break;
                            }
                          },
                          itemBuilder: (_) => const [
                            PopupMenuItem(value: 'edit', child: Text(S.editItem)),
                            PopupMenuItem(value: 'up', child: Text(S.reorderUp)),
                            PopupMenuItem(value: 'down', child: Text(S.reorderDown)),
                            PopupMenuItem(value: 'delete', child: Text(S.delete)),
                          ],
                        ),
                        onTap: () => Navigator.of(context).push(MaterialPageRoute<void>(
                          builder: (_) => ItemDetailScreen(itemId: item.id),
                        )),
                      );
                    },
                  ),
          ),
        ],
      ),
    );
  }

  Future<void> _reorder(
    ProjectController controller,
    List<PlotItem> items,
    int index,
    String direction,
  ) async {
    final ids = items.map((i) => i.id).toList();
    final target = direction == 'up' ? index - 1 : index + 1;
    if (target < 0 || target >= ids.length) return;
    final moved = ids.removeAt(index);
    ids.insert(target, moved);
    controller.reorderItems(ids);
  }

  Future<void> _addItem(
    BuildContext context,
    ProjectController controller,
    Category category,
  ) async {
    final title = await promptForText(context, title: S.addItem, hint: S.pleaseEnterATitle);
    if (title == null || title.isEmpty) {
      if (context.mounted && title != null) showMessage(context, S.pleaseEnterATitle);
      return;
    }
    final item = controller.createItem(categoryId: category.id, title: title);
    if (context.mounted) {
      Navigator.of(context).push(MaterialPageRoute<void>(
        builder: (_) => ItemDetailScreen(itemId: item.id),
      ));
    }
  }

  Future<void> _changeStatus(
    BuildContext context,
    ProjectController controller,
    PlotItem item,
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
                selected: status.id == item.statusId,
                onTap: () => Navigator.of(sheetContext).pop(status.id),
              ),
          ],
        ),
      ),
    );
    if (selected != null) controller.updateItem(item.id, statusId: selected);
  }

  Future<void> _deleteOrMerge(
    BuildContext context,
    ProjectController controller,
    PlotItem item,
  ) async {
    final action = await showModalBottomSheet<String>(
      context: context,
      builder: (sheetContext) => SafeArea(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            ListTile(
              leading: const Icon(Icons.delete_outline),
              title: const Text(S.delete),
              onTap: () => Navigator.of(sheetContext).pop('delete'),
            ),
            ListTile(
              leading: const Icon(Icons.merge_type),
              title: const Text(S.mergeItems),
              onTap: () => Navigator.of(sheetContext).pop('merge'),
            ),
          ],
        ),
      ),
    );
    if (!context.mounted || action == null) return;

    if (action == 'delete') {
      final confirmed = await confirmAction(
        context,
        title: S.delete,
        message: '“${item.title}” will be deleted, including its references. This cannot be undone.',
      );
      if (confirmed) controller.deleteItem(item.id);
      return;
    }

    final candidates = controller.allItems.where((i) => i.id != item.id).toList();
    if (candidates.isEmpty) {
      showMessage(context, S.noItemsToDisplay);
      return;
    }
    final target = await showModalBottomSheet<int>(
      context: context,
      builder: (sheetContext) => SafeArea(
        child: ListView(
          shrinkWrap: true,
          children: [
            Padding(
              padding: const EdgeInsets.all(16),
              child: Text('${S.mergeInto}…',
                  style: Theme.of(context).textTheme.titleMedium),
            ),
            for (final candidate in candidates)
              ListTile(
                leading: StatusDot(colour: 0xFF9E9E9E),
                title: Text(candidate.title),
                onTap: () => Navigator.of(sheetContext).pop(candidate.id),
              ),
          ],
        ),
      ),
    );
    if (target != null) {
      controller.mergeItems(item.id, target);
      if (context.mounted) showMessage(context, S.done);
    }
  }
}
