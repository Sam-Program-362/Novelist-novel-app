import 'dart:async';

import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../core/utils/text_doc.dart';
import '../../models/entities.dart';
import '../../state/app_settings.dart';
import '../../state/project_controller.dart';
import '../widgets/common.dart';

/// Writing editor.
///
/// Storage stays byte-compatible with the reference: paragraphs are `type/text/align` blocks and a
/// mention is a U+FFFC character plus an embed record (see `docs/DATA_MODEL.md` §3). Because a
/// `TextField` cannot host arbitrary inline widgets, the editor shows mentions as `@Label` tokens
/// and converts them back on save — the same `@` workflow the bundled quick-start describes.
class SceneEditorScreen extends StatefulWidget {
  final int sceneId;

  const SceneEditorScreen({super.key, required this.sceneId});

  @override
  State<SceneEditorScreen> createState() => _SceneEditorScreenState();
}

class _BlockState {
  final TextEditingController controller;
  String align;

  _BlockState({required String text, required this.align})
      : controller = TextEditingController(text: text);

  void dispose() => controller.dispose();
}

class _SceneEditorScreenState extends State<SceneEditorScreen> {
  late final ProjectController project;
  late final AppSettings settings;

  final _titleController = TextEditingController();
  final _synopsisController = TextEditingController();
  final List<_BlockState> _blocks = [];
  final List<FocusNode> _focusNodes = [];

  int _focused = 0;
  int _statusId = 0;
  String _lastSaved = '';
  bool _dirty = false;
  bool _loading = true;
  Timer? _debounce;

  @override
  void initState() {
    super.initState();
    project = context.read<ProjectController>();
    settings = context.read<AppSettings>();
    _load();
  }

  void _load() {
    final scene = project.sceneById(widget.sceneId);
    if (scene == null) {
      _loading = false;
      return;
    }
    _titleController.text = scene.title;
    final doc = TextDoc.fromJsonString(scene.text);
    for (final block in doc.blocks) {
      final state = _BlockState(
        text: TextDoc.blockToEditable(block),
        align: block.align,
      );
      _blocks.add(state);
      final node = FocusNode();
      node.addListener(() {
        if (node.hasFocus) {
          final index = _focusNodes.indexOf(node);
          if (index >= 0) _focused = index;
        }
      });
      _focusNodes.add(node);
      state.controller.addListener(_scheduleSave);
    }
    _lastSaved = doc.toJsonString();
    _synopsisController.text = scene.synopsis ?? '';
    _synopsisController.addListener(_scheduleSave);
    _titleController.addListener(_scheduleSave);
    _statusId = scene.statusId;
    _loading = false;
  }

  @override
  void dispose() {
    _debounce?.cancel();
    _saveNow(notify: false);
    for (final block in _blocks) {
      block.dispose();
    }
    for (final node in _focusNodes) {
      node.dispose();
    }
    _titleController.dispose();
    _synopsisController.dispose();
    super.dispose();
  }

  void _scheduleSave() {
    _dirty = true;
    _debounce?.cancel();
    _debounce = Timer(const Duration(milliseconds: 900), () {
      _saveNow();
    });
  }

  void _saveNow({bool notify = true}) {
    if (_loading) return;
    final known = project.mentionLookup;
    final blocks = <TextBlock>[];
    for (final state in _blocks) {
      blocks.add(TextDoc.blockFromEditable(
        state.controller.text,
        knownMentions: known,
        align: state.align,
      ));
    }
    if (blocks.isEmpty) blocks.add(const TextBlock());
    final json = TextDoc(blocks).toJsonString();
    final title = _titleController.text.trim().isEmpty
        ? (project.sceneById(widget.sceneId)?.title ?? 'Scene')
        : _titleController.text.trim();

    if (json != _lastSaved) {
      project.scenesDao.pushHistory(widget.sceneId, _lastSaved);
      _lastSaved = json;
    }
    project.updateScene(
      widget.sceneId,
      title: title,
      synopsis: _synopsisController.text.trim(),
      text: json,
      statusId: _statusId,
    );
    _dirty = false;
    if (notify && mounted) setState(() {});
  }

  void _addBlockAfter(int index) {
    final state = _BlockState(text: '', align: 'left');
    final node = FocusNode();
    state.controller.addListener(_scheduleSave);
    setState(() {
      _blocks.insert(index + 1, state);
      _focusNodes.insert(index + 1, node);
    });
    _scheduleSave();
    FocusScope.of(context).requestFocus(node);
  }

  void _removeBlock(int index) {
    if (_blocks.length <= 1) return;
    setState(() {
      _blocks.removeAt(index).dispose();
      _focusNodes.removeAt(index).dispose();
    });
    _scheduleSave();
  }

  Future<void> _insertMention() async {
    final items = project.allItems;
    if (items.isEmpty) {
      showMessage(context, S.noItemsToDisplay);
      return;
    }
    final selected = await showModalBottomSheet<PlotItem>(
      context: context,
      isScrollControlled: true,
      builder: (sheetContext) => DraggableScrollableSheet(
        expand: false,
        initialChildSize: 0.7,
        builder: (context, scrollController) => Column(
          children: [
            Padding(
              padding: const EdgeInsets.all(16),
              child: Text(S.insertMention, style: Theme.of(context).textTheme.titleMedium),
            ),
            const Divider(height: 1),
            Expanded(
              child: ListView.builder(
                controller: scrollController,
                itemCount: items.length,
                itemBuilder: (context, index) {
                  final item = items[index];
                  final category = project.categoryById(item.categoryId);
                  return ListTile(
                    leading: StatusDot(colour: category?.colour ?? 0xFF9E9E9E, size: 14),
                    title: Text(item.title),
                    subtitle: Text(category?.title ?? ''),
                    onTap: () => Navigator.of(sheetContext).pop(item),
                  );
                },
              ),
            ),
          ],
        ),
      ),
    );
    if (selected == null || !mounted) return;
    final index = _focused.clamp(0, _blocks.length - 1);
    final controller = _blocks[index].controller;
    final selection = controller.selection;
    final token = '@${selected.title}';
    final text = controller.text;
    final start = selection.start >= 0 ? selection.start : text.length;
    final end = selection.end >= 0 ? selection.end : text.length;
    controller.text = text.replaceRange(start, end, token);
    controller.selection = TextSelection.collapsed(offset: start + token.length);
    _scheduleSave();
  }

  void _setAlign(String align) {
    final index = _focused.clamp(0, _blocks.length - 1);
    setState(() => _blocks[index].align = align);
    _scheduleSave();
  }

  Future<void> _splitScene() async {
    _saveNow();
    final blockCount = _blocks.length;
    if (blockCount < 2) {
      showMessage(context, 'Add at least two paragraphs before splitting.');
      return;
    }
    final splitAt = (_focused + 1).clamp(1, blockCount - 1);
    try {
      final created = project.splitScene(widget.sceneId, splitAt);
      if (!mounted) return;
      showMessage(context, 'Scene split into two.');
      Navigator.of(context).pushReplacement(MaterialPageRoute<void>(
        builder: (_) => SceneEditorScreen(sceneId: created.id),
      ));
    } catch (error) {
      if (mounted) showMessage(context, '$error');
    }
  }

  @override
  Widget build(BuildContext context) {
    if (_loading) {
      return const Scaffold(body: Center(child: CircularProgressIndicator()));
    }
    final theme = Theme.of(context);
    final scene = project.sceneById(widget.sceneId);
    if (scene == null) {
      return const Scaffold(body: Center(child: Text(S.anErrorOccurred)));
    }

    final words = TextDoc.fromJsonString(_lastSaved).wordCount;

    return Scaffold(
      appBar: AppBar(
        title: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(scene.title, maxLines: 1, overflow: TextOverflow.ellipsis),
            Text(
              '$_statusTitle · $words ${S.words} · ${_dirty ? S.saving : S.saved}',
              style: theme.textTheme.labelSmall,
            ),
          ],
        ),
        actions: [
          IconButton(
            tooltip: S.reference,
            icon: const Icon(Icons.menu_book_outlined),
            onPressed: () => _showReferencePanel(scene),
          ),
          PopupMenuButton<String>(
            onSelected: (value) async {
              switch (value) {
                case 'split':
                  await _splitScene();
                  break;
                case 'items':
                  await _editAttachedItems(scene);
                  break;
                case 'notes':
                  await _editNotes(scene);
                  break;
                case 'pictures':
                  await _editPictures(scene);
                  break;
                case 'subplots':
                  await _editSubplots(scene);
                  break;
                case 'history':
                  await _showHistory(scene);
                  break;
                case 'delete':
                  final confirmed = await confirmAction(
                    context,
                    title: S.delete,
                    message: '“${scene.title}” will be deleted from the project.',
                  );
                  if (confirmed && mounted) {
                    project.deleteScene(widget.sceneId);
                    Navigator.of(context).pop();
                  }
                  break;
              }
            },
            itemBuilder: (_) => const [
              PopupMenuItem(value: 'split', child: Text(S.splitScene)),
              PopupMenuItem(value: 'items', child: Text(S.attachItems)),
              PopupMenuItem(value: 'notes', child: Text(S.sceneNotes)),
              PopupMenuItem(value: 'pictures', child: Text(S.scenePictures)),
              PopupMenuItem(value: 'subplots', child: Text(S.sceneSubplots)),
              PopupMenuItem(value: 'history', child: Text(S.history)),
              PopupMenuItem(value: 'delete', child: Text(S.delete)),
            ],
          ),
        ],
      ),
      body: Column(
        children: [
          Expanded(
            child: ListView(
              padding: const EdgeInsets.fromLTRB(16, 12, 16, 24),
              children: [
                TextField(
                  controller: _titleController,
                  style: theme.textTheme.headlineSmall,
                  decoration: const InputDecoration(
                    hintText: S.sceneTitle,
                    border: InputBorder.none,
                    filled: false,
                  ),
                ),
                TextField(
                  controller: _synopsisController,
                  maxLines: 3,
                  minLines: 1,
                  style: theme.textTheme.bodySmall,
                  decoration: const InputDecoration(
                    hintText: S.synopsis,
                    border: InputBorder.none,
                    filled: false,
                  ),
                ),
                const Divider(),
                for (var i = 0; i < _blocks.length; i++) _buildBlock(i),
                const SizedBox(height: 48),
              ],
            ),
          ),
          _toolbar(theme),
        ],
      ),
    );
  }

  String get _statusTitle {
    for (final status in project.statuses) {
      if (status.id == _statusId) return status.title;
    }
    return S.notSet;
  }

  Widget _buildBlock(int index) {
    final block = _blocks[index];
    final settings = context.watch<AppSettings>();
    final style = GoogleFontsHelper.style(
      settings.editorFont,
      fontSize: settings.editorFontSize,
      height: settings.editorLineHeight,
    );
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 6),
      child: Row(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Expanded(
            child: TextField(
              controller: block.controller,
              focusNode: _focusNodes[index],
              maxLines: null,
              keyboardType: TextInputType.multiline,
              textAlign: switch (block.align) {
                'center' => TextAlign.center,
                'right' => TextAlign.right,
                'justify' => TextAlign.justify,
                _ => TextAlign.left,
              },
              style: style,
              decoration: const InputDecoration(
                hintText: 'Start writing…',
                border: InputBorder.none,
                filled: false,
                isDense: true,
              ),
              onSubmitted: (_) => _addBlockAfter(index),
            ),
          ),
          if (_blocks.length > 1)
            IconButton(
              visualDensity: VisualDensity.compact,
              icon: const Icon(Icons.close, size: 16),
              onPressed: () => _removeBlock(index),
            ),
        ],
      ),
    );
  }

  Widget _toolbar(ThemeData theme) {
    return Material(
      color: theme.colorScheme.surfaceContainerHigh,
      child: SafeArea(
        top: false,
        child: SingleChildScrollView(
          scrollDirection: Axis.horizontal,
          child: Row(
            children: [
              IconButton(
                tooltip: S.insertMention,
                icon: const Icon(Icons.alternate_email),
                onPressed: _insertMention,
              ),
              IconButton(
                tooltip: S.alignLeft,
                icon: const Icon(Icons.format_align_left),
                onPressed: () => _setAlign('left'),
              ),
              IconButton(
                tooltip: S.alignCenter,
                icon: const Icon(Icons.format_align_center),
                onPressed: () => _setAlign('center'),
              ),
              IconButton(
                tooltip: S.alignRight,
                icon: const Icon(Icons.format_align_right),
                onPressed: () => _setAlign('right'),
              ),
              IconButton(
                tooltip: S.alignJustify,
                icon: const Icon(Icons.format_align_justify),
                onPressed: () => _setAlign('justify'),
              ),
              const VerticalDivider(width: 1),
              IconButton(
                tooltip: S.splitScene,
                icon: const Icon(Icons.call_split),
                onPressed: _splitScene,
              ),
              IconButton(
                tooltip: S.attachItems,
                icon: const Icon(Icons.link),
                onPressed: () {
                  final scene = project.sceneById(widget.sceneId);
                  if (scene != null) _editAttachedItems(scene);
                },
              ),
              IconButton(
                tooltip: S.save,
                icon: const Icon(Icons.save_outlined),
                onPressed: () => _saveNow(),
              ),
            ],
          ),
        ),
      ),
    );
  }

  Future<void> _showReferencePanel(Scene scene) async {
    final attached = project.scenesDao.attachedItems(scene.id);
    await showModalBottomSheet<void>(
      context: context,
      isScrollControlled: true,
      builder: (sheetContext) => DraggableScrollableSheet(
        expand: false,
        initialChildSize: 0.6,
        builder: (context, scrollController) => ListView(
          controller: scrollController,
          padding: const EdgeInsets.all(16),
          children: [
            Text(S.reference, style: Theme.of(context).textTheme.titleMedium),
            const SizedBox(height: 8),
            if (attached.isEmpty)
              const Text(S.noItemsToDisplay)
            else
              for (final item in attached)
                Card(
                  margin: const EdgeInsets.only(bottom: 8),
                  child: ListTile(
                    title: Text(item.title),
                    subtitle: Text(item.synopsis ?? ''),
                    isThreeLine: (item.synopsis ?? '').length > 60,
                  ),
                ),
          ],
        ),
      ),
    );
  }

  Future<void> _editAttachedItems(Scene scene) async {
    final all = project.allItems;
    final attached = project.scenesDao.attachedItemIds(scene.id).toSet();
    final selected = {...attached};
    final result = await showModalBottomSheet<bool>(
      context: context,
      isScrollControlled: true,
      builder: (sheetContext) => DraggableScrollableSheet(
        expand: false,
        initialChildSize: 0.75,
        builder: (context, scrollController) => StatefulBuilder(
          builder: (context, setSheetState) => Column(
            children: [
              Padding(
                padding: const EdgeInsets.all(16),
                child: Row(
                  children: [
                    Expanded(
                      child: Text(S.attachItems,
                          style: Theme.of(context).textTheme.titleMedium),
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
                child: all.isEmpty
                    ? const EmptyState(icon: Icons.account_tree_outlined, title: S.noItemsToDisplay)
                    : ListView.builder(
                        controller: scrollController,
                        itemCount: all.length,
                        itemBuilder: (context, index) {
                          final item = all[index];
                          final category = project.categoryById(item.categoryId);
                          return CheckboxListTile(
                            value: selected.contains(item.id),
                            title: Text(item.title),
                            subtitle: Text(category?.title ?? ''),
                            onChanged: (value) => setSheetState(() {
                              if (value == true) {
                                selected.add(item.id);
                              } else {
                                selected.remove(item.id);
                              }
                            }),
                          );
                        },
                      ),
              ),
            ],
          ),
        ),
      ),
    );
    if (result != true) return;
    for (final itemId in selected) {
      project.scenesDao.attachItem(scene.id, itemId);
    }
    for (final itemId in attached.difference(selected)) {
      project.scenesDao.detachItem(scene.id, itemId);
    }
    if (mounted) setState(() {});
  }

  Future<void> _editNotes(Scene scene) async {
    final notes = project.scenesDao.notes(scene.id);
    final text = await promptForText(
      context,
      title: S.sceneNotes,
      initial: notes.isEmpty ? '' : notes.first.text,
      maxLines: 6,
    );
    if (text == null) return;
    if (notes.isEmpty) {
      project.scenesDao.addNote(scene.id, text);
    } else {
      project.db.update('scene_note', {'scene_note_text': text}, 'scene_note_id = ?',
          [notes.first.id]);
    }
    if (mounted) setState(() {});
  }

  Future<void> _editPictures(Scene scene) async {
    final picture = await pickImageAsDataUri(context);
    if (picture == null) return;
    project.scenesDao.addPicture(scene.id, picture);
    if (mounted) setState(() {});
  }

  Future<void> _editSubplots(Scene scene) async {
    if (project.subplots.isEmpty) {
      showMessage(context, S.noSubplotsToDisplay);
      return;
    }
    final existing = project.scenesDao.subplots(scene.id);
    final selected = <int, String>{for (final link in existing) link.subplotId: link.synopsis};
    final result = await showModalBottomSheet<bool>(
      context: context,
      isScrollControlled: true,
      builder: (sheetContext) => DraggableScrollableSheet(
        expand: false,
        initialChildSize: 0.7,
        builder: (context, scrollController) => StatefulBuilder(
          builder: (context, setSheetState) => Column(
            children: [
              Padding(
                padding: const EdgeInsets.all(16),
                child: Row(
                  children: [
                    Expanded(
                      child: Text(S.sceneSubplots,
                          style: Theme.of(context).textTheme.titleMedium),
                    ),
                    FilledButton(
                      onPressed: () => Navigator.of(sheetContext).pop(true),
                      child: const Text(S.done),
                    ),
                  ],
                ),
              ),
              Expanded(
                child: ListView(
                  controller: scrollController,
                  children: [
                    for (final subplot in project.subplots)
                      CheckboxListTile(
                        value: selected.containsKey(subplot.id),
                        title: Text(subplot.title),
                        onChanged: (value) => setSheetState(() {
                          if (value == true) {
                            selected[subplot.id] = '';
                          } else {
                            selected.remove(subplot.id);
                          }
                        }),
                      ),
                  ],
                ),
              ),
            ],
          ),
        ),
      ),
    );
    if (result != true) return;
    project.scenesDao.setSubplots(scene.id, selected);
    if (mounted) setState(() {});
  }

  Future<void> _showHistory(Scene scene) async {
    final history = project.scenesDao.history(scene.id);
    await showModalBottomSheet<void>(
      context: context,
      isScrollControlled: true,
      builder: (sheetContext) => DraggableScrollableSheet(
        expand: false,
        initialChildSize: 0.6,
        builder: (context, scrollController) => history.isEmpty
            ? const EmptyState(icon: Icons.history, title: S.noHistoriesToDisplay)
            : ListView.builder(
                controller: scrollController,
                itemCount: history.length,
                itemBuilder: (context, index) {
                  final entry = history[index];
                  return ListTile(
                    title: Text(formatDate(entry.date)),
                    subtitle: Text(
                      TextDoc.fromJsonString(entry.text).plainText,
                      maxLines: 3,
                      overflow: TextOverflow.ellipsis,
                    ),
                    trailing: TextButton(
                      child: const Text(S.restoreFromHistory),
                      onPressed: () {
                        Navigator.of(sheetContext).pop();
                        final current = project.sceneById(scene.id);
                        project.scenesDao.pushHistory(scene.id, current?.text);
                        project.updateScene(scene.id, text: entry.text);
                        _loadFromText(entry.text);
                      },
                    ),
                  );
                },
              ),
      ),
    );
  }

  void _loadFromText(String? text) {
    final doc = TextDoc.fromJsonString(text);
    setState(() {
      for (final block in _blocks) {
        block.dispose();
      }
      _blocks.clear();
      for (final node in _focusNodes) {
        node.dispose();
      }
      _focusNodes.clear();
      for (final block in doc.blocks) {
        final state = _BlockState(text: TextDoc.blockToEditable(block), align: block.align);
        state.controller.addListener(_scheduleSave);
        _blocks.add(state);
        _focusNodes.add(FocusNode());
      }
      _lastSaved = doc.toJsonString();
    });
  }
}

class GoogleFontsHelper {
  /// Editor typography: a Google Fonts family when the author picks one, otherwise the platform
  /// default. Fonts are fetched at runtime exactly like the reference (no font files are bundled).
  static TextStyle? style(String family, {required double fontSize, required double height}) {
    final base = TextStyle(fontSize: fontSize, height: height);
    if (family.isEmpty) return base;
    try {
      return GoogleFonts.getFont(family).copyWith(fontSize: fontSize, height: height);
    } catch (_) {
      return base;
    }
  }
}
