import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../core/utils/iterable_x.dart';
import '../../core/utils/text_doc.dart';
import '../../models/entities.dart';
import '../../state/project_controller.dart';
import '../widgets/common.dart';

/// Full detail of a Plot item: description, metadata, aliases, notes, pictures, relationships and
/// the previous-version history — mirroring the reference's item detail surface.
class ItemDetailScreen extends StatefulWidget {
  final int itemId;

  const ItemDetailScreen({super.key, required this.itemId});

  @override
  State<ItemDetailScreen> createState() => _ItemDetailScreenState();
}

class _ItemDetailScreenState extends State<ItemDetailScreen> {
  final _descriptionController = TextEditingController();
  final _synopsisController = TextEditingController();
  final _titleController = TextEditingController();
  bool _loaded = false;
  int? _initialisedItemId;

  @override
  void dispose() {
    _descriptionController.dispose();
    _synopsisController.dispose();
    _titleController.dispose();
    super.dispose();
  }

  void _load(PlotItem item) {
    if (_initialisedItemId == item.id) return;
    _initialisedItemId = item.id;
    _titleController.text = item.title;
    _synopsisController.text = item.synopsis ?? '';
    _descriptionController.text = TextDoc.fromJsonString(item.text).blocks
        .map((b) => TextDoc.blockToEditable(b))
        .join('\n');
    _loaded = true;
  }

  void _save(ProjectController controller, PlotItem item) {
    if (!_loaded) return;
    final blocks = _descriptionController.text
        .split('\n')
        .map((line) => TextDoc.blockFromEditable(
              line,
              knownMentions: controller.mentionLookup,
            ))
        .toList(growable: false);
    final doc = TextDoc(blocks.isEmpty ? [const TextBlock()] : blocks);
    controller.plotDao.pushHistory(item.id, item.text);
    controller.updateItem(
      item.id,
      title: _titleController.text.trim().isEmpty ? item.title : _titleController.text.trim(),
      synopsis: _synopsisController.text.trim(),
      text: doc.toJsonString(),
    );
  }

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final item = controller.allItems.where((i) => i.id == widget.itemId).firstOrNull;
    if (item == null) {
      return const Scaffold(body: Center(child: Text(S.anErrorOccurred)));
    }
    _load(item);
    final status = controller.statusById(item.statusId);
    final category = controller.categoryById(item.categoryId);

    return DefaultTabController(
      length: 6,
      child: Scaffold(
        appBar: AppBar(
          title: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(item.title, maxLines: 1, overflow: TextOverflow.ellipsis),
              Text(
                category?.title ?? '',
                style: Theme.of(context).textTheme.labelSmall,
              ),
            ],
          ),
          actions: [
            IconButton(
              tooltip: status?.title ?? S.notSet,
              icon: StatusDot(colour: status?.colour ?? 0xFF9E9E9E),
              onPressed: () async {
                final selected = await showModalBottomSheet<int>(
                  context: context,
                  builder: (sheetContext) => SafeArea(
                    child: Column(
                      mainAxisSize: MainAxisSize.min,
                      children: [
                        for (final s in controller.statuses)
                          ListTile(
                            leading: StatusDot(colour: s.colour),
                            title: Text(s.title),
                            selected: s.id == item.statusId,
                            onTap: () => Navigator.of(sheetContext).pop(s.id),
                          ),
                      ],
                    ),
                  ),
                );
                if (selected != null) controller.updateItem(item.id, statusId: selected);
              },
            ),
            IconButton(
              icon: const Icon(Icons.save_outlined),
              onPressed: () => _save(controller, item),
              tooltip: S.save,
            ),
          ],
          bottom: const TabBar(
            isScrollable: true,
            tabAlignment: TabAlignment.start,
            tabs: [
              Tab(text: S.description),
              Tab(text: S.metadata),
              Tab(text: S.names),
              Tab(text: S.notes),
              Tab(text: S.pictures),
              Tab(text: S.relationships),
            ],
          ),
        ),
        body: TabBarView(
          children: [
            _detailsTab(controller, item),
            _metadataTab(controller, item),
            _namesTab(controller, item),
            _notesTab(controller, item),
            _picturesTab(controller, item),
            _relationshipsTab(controller, item),
          ],
        ),
      ),
    );
  }

  Widget _detailsTab(ProjectController controller, PlotItem item) {
    return ListView(
      padding: const EdgeInsets.all(16),
      children: [
        TextField(
          controller: _titleController,
          decoration: const InputDecoration(labelText: S.editItem),
        ),
        const SizedBox(height: 12),
        TextField(
          controller: _synopsisController,
          maxLines: 3,
          decoration: const InputDecoration(labelText: S.synopsis),
        ),
        const SizedBox(height: 16),
        Text(S.description, style: Theme.of(context).textTheme.titleSmall),
        const SizedBox(height: 8),
        TextField(
          controller: _descriptionController,
          maxLines: null,
          minLines: 10,
          keyboardType: TextInputType.multiline,
          decoration: const InputDecoration(
            hintText: 'Write freely. Use @Name to mention another plot item.',
            alignLabelWithHint: true,
          ),
        ),
        const SizedBox(height: 12),
        Row(
          children: [
            Expanded(
              child: FilledButton.icon(
                onPressed: () => _save(controller, item),
                icon: const Icon(Icons.save_outlined),
                label: const Text(S.save),
              ),
            ),
          ],
        ),
      ],
    );
  }

  Widget _metadataTab(ProjectController controller, PlotItem item) {
    final groups = controller.plotDao.metadataGroups(item.categoryId);
    final values = controller.plotDao.itemMetadata(item.id);
    if (groups.isEmpty) {
      return const EmptyState(icon: Icons.list_alt, title: S.noMetadataGroupsToDisplay);
    }
    return ListView(
      padding: const EdgeInsets.all(16),
      children: [
        for (final group in groups) ...[
          Padding(
            padding: const EdgeInsets.only(top: 8, bottom: 4),
            child: Text(group.title, style: Theme.of(context).textTheme.titleSmall),
          ),
          for (final element in controller.plotDao.metadataElements(group.id))
            Padding(
              padding: const EdgeInsets.only(bottom: 8),
              child: _MetadataField(
                key: ValueKey('${item.id}-${element.id}'),
                label: element.title,
                initialValue: values[element.id] ?? '',
                onChanged: (value) =>
                    controller.plotDao.setItemMetadataValue(item.id, element.id, value),
              ),
            ),
        ],
      ],
    );
  }

  Widget _namesTab(ProjectController controller, PlotItem item) {
    final names = controller.plotDao.names(item.id);
    return Scaffold(
      backgroundColor: Colors.transparent,
      floatingActionButton: FloatingActionButton.small(
        heroTag: null, // several of these live in one TabBarView, so no route-wide hero
        onPressed: () async {
          final name = await promptForText(context, title: S.addName);
          if (name == null || name.isEmpty) return;
          controller.plotDao.addName(item.id, name);
          setState(() {});
        },
        child: const Icon(Icons.add),
      ),
      body: names.isEmpty
          ? const EmptyState(icon: Icons.badge_outlined, title: S.noNamesToDisplay)
          : ListView.builder(
              padding: const EdgeInsets.only(bottom: 96),
              itemCount: names.length,
              itemBuilder: (context, index) {
                final name = names[index];
                return ListTile(
                  title: Text(name.name),
                  trailing: Row(
                    mainAxisSize: MainAxisSize.min,
                    children: [
                      IconButton(
                        icon: const Icon(Icons.edit_outlined),
                        onPressed: () async {
                          final value = await promptForText(
                            context,
                            title: S.editName,
                            initial: name.name,
                          );
                          if (value == null || value.isEmpty) return;
                          controller.plotDao.updateName(name.id, value);
                          setState(() {});
                        },
                      ),
                      IconButton(
                        icon: const Icon(Icons.delete_outline),
                        onPressed: () {
                          controller.plotDao.deleteName(name.id);
                          setState(() {});
                        },
                      ),
                    ],
                  ),
                );
              },
            ),
    );
  }

  Widget _notesTab(ProjectController controller, PlotItem item) {
    final notes = controller.plotDao.notes(item.id);
    return Scaffold(
      backgroundColor: Colors.transparent,
      floatingActionButton: FloatingActionButton.small(
        heroTag: null, // several of these live in one TabBarView, so no route-wide hero
        onPressed: () async {
          final text = await promptForText(context, title: S.addNote, maxLines: 4);
          if (text == null || text.isEmpty) return;
          controller.plotDao.addNote(item.id, text);
          setState(() {});
        },
        child: const Icon(Icons.add),
      ),
      body: notes.isEmpty
          ? const EmptyState(icon: Icons.sticky_note_2_outlined, title: S.noNotesToDisplay)
          : ListView.builder(
              padding: const EdgeInsets.only(bottom: 96),
              itemCount: notes.length,
              itemBuilder: (context, index) {
                final note = notes[index];
                return Card(
                  margin: const EdgeInsets.fromLTRB(12, 6, 12, 6),
                  child: ListTile(
                    title: Text(note.text),
                    trailing: PopupMenuButton<String>(
                      onSelected: (value) async {
                        if (value == 'edit') {
                          final text = await promptForText(
                            context,
                            title: S.editNote,
                            initial: note.text,
                            maxLines: 4,
                          );
                          if (text != null && text.isNotEmpty) {
                            controller.plotDao.updateNote(note.id, text);
                            setState(() {});
                          }
                        } else {
                          controller.plotDao.deleteNote(note.id);
                          setState(() {});
                        }
                      },
                      itemBuilder: (_) => const [
                        PopupMenuItem(value: 'edit', child: Text(S.editNote)),
                        PopupMenuItem(value: 'delete', child: Text(S.delete)),
                      ],
                    ),
                  ),
                );
              },
            ),
    );
  }

  Widget _picturesTab(ProjectController controller, PlotItem item) {
    final pictures = controller.plotDao.pictures(item.id);
    return Scaffold(
      backgroundColor: Colors.transparent,
      floatingActionButton: FloatingActionButton.small(
        heroTag: null, // several of these live in one TabBarView, so no route-wide hero
        onPressed: () async {
          final data = await pickImageAsDataUri(context);
          if (data == null) return;
          controller.plotDao.addPicture(item.id, data);
          setState(() {});
        },
        child: const Icon(Icons.add_photo_alternate_outlined),
      ),
      body: pictures.isEmpty
          ? const EmptyState(
              icon: Icons.photo_library_outlined,
              title: S.noPicturesToDisplay,
              subtitle: 'Images are reference material and are never included in the manuscript.',
            )
          : GridView.builder(
              padding: const EdgeInsets.all(12),
              gridDelegate: const SliverGridDelegateWithMaxCrossAxisExtent(
                maxCrossAxisExtent: 180,
                crossAxisSpacing: 8,
                mainAxisSpacing: 8,
              ),
              itemCount: pictures.length,
              itemBuilder: (context, index) {
                final picture = pictures[index];
                return GestureDetector(
                  onLongPress: () async {
                    final remove = await confirmAction(
                      context,
                      title: S.delete,
                      message: S.areYouSureYouWantToDelete,
                    );
                    if (remove) {
                      controller.plotDao.deletePicture(picture.id);
                      setState(() {});
                    }
                  },
                  child: CoverThumb(
                    cover: picture.name,
                    width: double.infinity,
                    height: double.infinity,
                    fallbackIcon: Icons.image_outlined,
                  ),
                );
              },
            ),
    );
  }

  Widget _relationshipsTab(ProjectController controller, PlotItem item) {
    final relationships = controller.plotDao.relationships(item.id);
    final others = controller.allItems.where((i) => i.id != item.id).toList();
    return Scaffold(
      backgroundColor: Colors.transparent,
      floatingActionButton: FloatingActionButton.small(
        heroTag: null, // several of these live in one TabBarView, so no route-wide hero
        onPressed: others.isEmpty
            ? null
            : () async {
                final target = await showModalBottomSheet<int>(
                  context: context,
                  builder: (sheetContext) => SafeArea(
                    child: ListView(
                      shrinkWrap: true,
                      children: [
                        for (final other in others)
                          ListTile(
                            title: Text(other.title),
                            onTap: () => Navigator.of(sheetContext).pop(other.id),
                          ),
                      ],
                    ),
                  ),
                );
                if (target == null || !context.mounted) return;
                final description = await promptForText(
                  context,
                  title: S.addRelationship,
                  hint: 'e.g. younger brother',
                );
                if (description == null) return;
                controller.plotDao.addRelationship(
                  itemId: item.id,
                  otherItemId: target,
                  description: description,
                );
                setState(() {});
              },
        child: const Icon(Icons.add),
      ),
      body: relationships.isEmpty
          ? const EmptyState(icon: Icons.share_outlined, title: S.noRelationshipsToDisplay)
          : ListView.builder(
              padding: const EdgeInsets.only(bottom: 96),
              itemCount: relationships.length,
              itemBuilder: (context, index) {
                final relation = relationships[index];
                final other = controller.allItems
                    .where((i) => i.id == relation.otherItemId)
                    .firstOrNull;
                return ListTile(
                  leading: Icon(
                    relation.isRelevant ? Icons.star : Icons.star_border,
                    size: 18,
                  ),
                  title: Text(other?.title ?? S.notSet),
                  subtitle: Text(relation.description),
                  onTap: () {
                    controller.plotDao.updateRelationship(
                      relation.id,
                      isRelevant: !relation.isRelevant,
                    );
                    setState(() {});
                  },
                  trailing: IconButton(
                    icon: const Icon(Icons.delete_outline),
                    onPressed: () {
                      controller.plotDao.deleteRelationship(relation.id);
                      setState(() {});
                    },
                  ),
                );
              },
            ),
    );
  }
}

class _MetadataField extends StatefulWidget {
  final String label;
  final String initialValue;
  final ValueChanged<String> onChanged;

  const _MetadataField({
    super.key,
    required this.label,
    required this.initialValue,
    required this.onChanged,
  });

  @override
  State<_MetadataField> createState() => _MetadataFieldState();
}

class _MetadataFieldState extends State<_MetadataField> {
  late final TextEditingController _controller =
      TextEditingController(text: widget.initialValue);

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return TextField(
      controller: _controller,
      decoration: InputDecoration(labelText: widget.label),
      onChanged: widget.onChanged,
    );
  }
}
