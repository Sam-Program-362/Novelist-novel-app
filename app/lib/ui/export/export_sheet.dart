import 'dart:io';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:path_provider/path_provider.dart';
import 'package:provider/provider.dart';
import 'package:share_plus/share_plus.dart';

import '../../core/l10n/strings.dart';
import '../../data/io/compile.dart';
import '../../state/project_controller.dart';
import '../../core/utils/iterable_x.dart';
import '../widgets/common.dart';

/// Compile dialog: format selection plus the reference's inclusion toggles
/// (`include_sections`, `include_scenes`, `include_items`, table of contents).
Future<void> showExportSheet(BuildContext context, int bookId) {
  return showModalBottomSheet<void>(
    context: context,
    isScrollControlled: true,
    builder: (_) => _ExportSheet(bookId: bookId),
  );
}

class _ExportSheet extends StatefulWidget {
  final int bookId;

  const _ExportSheet({required this.bookId});

  @override
  State<_ExportSheet> createState() => _ExportSheetState();
}

class _ExportSheetState extends State<_ExportSheet> {
  CompileFormat _format = CompileFormat.epub;
  bool _includeSections = true;
  bool _includeScenes = true;
  bool _showToc = true;
  bool _working = false;

  Future<void> _compileAndShare() async {
    final controller = context.read<ProjectController>();
    final book = controller.books.where((b) => b.id == widget.bookId).firstOrNull;
    if (book == null) return;

    final options = CompileOptions(
      format: _format,
      includeSections: _includeSections,
      includeScenes: _includeScenes,
      showTableOfContents: _showToc,
      tableOfContentsTitle: book.settings.tableOfContentsTitle,
    );

    setState(() => _working = true);
    try {
      final compiled = controller.compiledBook(book, options);
      if (compiled.chapters.isEmpty) {
        if (mounted) {
          setState(() => _working = false);
          showMessage(context, S.nothingToCompile);
        }
        return;
      }
      final document = Compiler.compile(compiled, options);
      final directory = await getTemporaryDirectory();
      final file = File('${directory.path}/${document.fileName}');
      await file.writeAsBytes(document.bytes);
      await Share.shareXFiles([XFile(file.path)], text: book.title);
      if (mounted) setState(() => _working = false);
    } catch (error) {
      if (mounted) {
        setState(() => _working = false);
        showMessage(context, '${S.anErrorOccurred}: $error');
      }
    }
  }

  Future<void> _copyToClipboard() async {
    final controller = context.read<ProjectController>();
    final book = controller.books.where((b) => b.id == widget.bookId).firstOrNull;
    if (book == null) return;
    final compiled = controller.compiledBook(
      book,
      CompileOptions(format: CompileFormat.html, showTableOfContents: _showToc),
    );
    final document = Compiler.compile(compiled, const CompileOptions(format: CompileFormat.html));
    await Clipboard.setData(ClipboardData(text: document.plainText));
    if (mounted) {
      showMessage(context, S.copied);
      Navigator.of(context).pop();
    }
  }

  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);
    return SafeArea(
      child: Padding(
        padding: const EdgeInsets.fromLTRB(16, 16, 16, 16),
        child: Column(
          mainAxisSize: MainAxisSize.min,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(S.selectAFormat, style: theme.textTheme.titleLarge),
            const SizedBox(height: 8),
            RadioGroup<CompileFormat>(
              groupValue: _format,
              onChanged: (value) => setState(() => _format = value ?? _format),
              child: const Column(
                children: [
                  RadioListTile<CompileFormat>(
                    value: CompileFormat.epub,
                    contentPadding: EdgeInsets.zero,
                    title: Text('EPUB'),
                    subtitle: Text(S.epubDescription),
                  ),
                  RadioListTile<CompileFormat>(
                    value: CompileFormat.odt,
                    contentPadding: EdgeInsets.zero,
                    title: Text('ODT'),
                    subtitle: Text(S.odtDescription),
                  ),
                  RadioListTile<CompileFormat>(
                    value: CompileFormat.html,
                    contentPadding: EdgeInsets.zero,
                    title: Text('HTML'),
                    subtitle: Text(S.htmlDescription),
                  ),
                ],
              ),
            ),
            const Divider(),
            SwitchListTile(
              value: _includeSections,
              contentPadding: EdgeInsets.zero,
              title: const Text(S.includeSections),
              onChanged: (value) => setState(() => _includeSections = value),
            ),
            SwitchListTile(
              value: _includeScenes,
              contentPadding: EdgeInsets.zero,
              title: const Text(S.includeScenes),
              onChanged: (value) => setState(() => _includeScenes = value),
            ),
            SwitchListTile(
              value: _showToc,
              contentPadding: EdgeInsets.zero,
              title: const Text(S.showTableOfContents),
              onChanged: (value) => setState(() => _showToc = value),
            ),
            const SizedBox(height: 8),
            Row(
              children: [
                Expanded(
                  child: OutlinedButton.icon(
                    onPressed: _working ? null : _copyToClipboard,
                    icon: const Icon(Icons.copy_all_outlined),
                    label: const Text(S.copyIntoClipboard),
                  ),
                ),
                const SizedBox(width: 8),
                Expanded(
                  child: FilledButton.icon(
                    onPressed: _working ? null : _compileAndShare,
                    icon: _working
                        ? const SizedBox(
                            width: 16,
                            height: 16,
                            child: CircularProgressIndicator(strokeWidth: 2),
                          )
                        : const Icon(Icons.ios_share),
                    label: const Text(S.exportAndShare),
                  ),
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
