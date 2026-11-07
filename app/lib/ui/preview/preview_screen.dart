import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../data/io/compile.dart';
import '../../state/project_controller.dart';
import '../../core/utils/iterable_x.dart';
import '../export/export_sheet.dart';
import '../widgets/common.dart';

/// Manuscript preview of one book.
///
/// The content is produced by the same compiler that feeds EPUB/ODT/HTML export, so what the author
/// sees here is exactly what gets compiled — including the rule that only scenes attached to a
/// compiled section appear.
class PreviewScreen extends StatefulWidget {
  final int bookId;

  const PreviewScreen({super.key, required this.bookId});

  @override
  State<PreviewScreen> createState() => _PreviewScreenState();
}

class _PreviewScreenState extends State<PreviewScreen> {
  double _zoom = 1.0;

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final book = controller.books.where((b) => b.id == widget.bookId).firstOrNull;
    if (book == null) {
      return const Scaffold(body: Center(child: Text(S.anErrorOccurred)));
    }
    final compiled = controller.compiledBook(
      book,
      CompileOptions(
        format: CompileFormat.html,
        showTableOfContents: book.settings.showTableOfContents,
        tableOfContentsTitle: book.settings.tableOfContentsTitle,
      ),
    );
    final theme = Theme.of(context);

    return Scaffold(
      appBar: AppBar(
        title: Text(book.title, maxLines: 1, overflow: TextOverflow.ellipsis),
        actions: [
          IconButton(
            tooltip: S.zoomOut,
            icon: const Icon(Icons.zoom_out),
            onPressed: () => setState(() => _zoom = (_zoom - 0.1).clamp(0.7, 2.0)),
          ),
          IconButton(
            tooltip: S.zoomIn,
            icon: const Icon(Icons.zoom_in),
            onPressed: () => setState(() => _zoom = (_zoom + 0.1).clamp(0.7, 2.0)),
          ),
          IconButton(
            tooltip: S.exportAndShare,
            icon: const Icon(Icons.ios_share),
            onPressed: () => showExportSheet(context, widget.bookId),
          ),
        ],
      ),
      body: compiled.chapters.isEmpty
          ? const EmptyState(
              icon: Icons.visibility_outlined,
              title: S.nothingToCompile,
              subtitle: 'Attach scenes to the book’s sections to build a manuscript.',
            )
          : Center(
              child: ConstrainedBox(
                constraints: const BoxConstraints(maxWidth: 760),
                child: Scrollbar(
                  child: ListView(
                    padding: const EdgeInsets.all(20),
                    children: [
                      Text(
                        book.title,
                        style: theme.textTheme.headlineMedium
                            ?.copyWith(fontSize: 28 * _zoom),
                        textAlign: TextAlign.center,
                      ),
                      if (compiled.author != null)
                        Padding(
                          padding: const EdgeInsets.only(top: 6),
                          child: Text(
                            compiled.author!,
                            textAlign: TextAlign.center,
                            style: theme.textTheme.bodyMedium
                                ?.copyWith(fontSize: 14 * _zoom),
                          ),
                        ),
                      if (book.settings.showTableOfContents) ...[
                        const SizedBox(height: 24),
                        Text(
                          book.settings.tableOfContentsTitle ?? 'Contents',
                          style: theme.textTheme.titleMedium
                              ?.copyWith(fontSize: 16 * _zoom),
                        ),
                        const SizedBox(height: 8),
                        for (final chapter in compiled.chapters)
                          Padding(
                            padding: EdgeInsets.only(
                              left: 12.0 + chapter.depth * 14,
                              bottom: 4,
                            ),
                            child: Text(
                              chapter.title,
                              style: theme.textTheme.bodyMedium
                                  ?.copyWith(fontSize: 13 * _zoom),
                            ),
                          ),
                      ],
                      const Divider(height: 40),
                      for (final chapter in compiled.chapters) ...[
                        for (var level = 0; level < chapter.depth; level++)
                          const SizedBox(height: 8),
                        Text(
                          chapter.title,
                          style: theme.textTheme.titleLarge?.copyWith(
                            fontSize: (20 - chapter.depth * 2).clamp(14, 22) * _zoom,
                            fontWeight: FontWeight.w600,
                          ),
                        ),
                        const SizedBox(height: 10),
                        for (final scene in chapter.scenes)
                          for (final paragraph in scene.paragraphs)
                            Padding(
                              padding: const EdgeInsets.only(bottom: 10),
                              child: Text(
                                paragraph.text,
                                textAlign: switch (paragraph.align) {
                                  'center' => TextAlign.center,
                                  'right' => TextAlign.right,
                                  'justify' => TextAlign.justify,
                                  _ => TextAlign.left,
                                },
                                style: TextStyle(
                                  fontSize: 15 * _zoom,
                                  height: 1.6,
                                ),
                              ),
                            ),
                      ],
                      const SizedBox(height: 60),
                    ],
                  ),
                ),
              ),
            ),
    );
  }
}
