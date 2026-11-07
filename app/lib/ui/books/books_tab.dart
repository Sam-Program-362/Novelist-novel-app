import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../models/entities.dart';
import '../../state/project_controller.dart';
import '../export/export_sheet.dart';
import '../preview/preview_screen.dart';
import '../widgets/common.dart';
import 'book_settings_screen.dart';
import 'organize_screen.dart';

/// Books of the project. Every book shares the project's Plot items and scene pool; a scene only
/// enters a book's manuscript when it is attached to a section (quickstart §3).
class BooksTab extends StatelessWidget {
  const BooksTab({super.key});

  Future<void> _addBook(BuildContext context) async {
    final controller = context.read<ProjectController>();
    final title = await promptForText(context, title: S.addBook, hint: S.bookTitle);
    if (title == null || title.isEmpty) return;
    final book = controller.createBook(title: title);
    if (context.mounted) {
      Navigator.of(context).push(MaterialPageRoute<void>(
        builder: (_) => OrganizeScreen(bookId: book.id),
      ));
    }
  }

  Future<void> _bookMenu(BuildContext context, Book book) async {
    final controller = context.read<ProjectController>();
    await showModalBottomSheet<void>(
      context: context,
      builder: (sheetContext) => SafeArea(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            ListTile(
              leading: const Icon(Icons.account_tree_outlined),
              title: const Text(S.organize),
              onTap: () {
                Navigator.of(sheetContext).pop();
                Navigator.of(context).push(MaterialPageRoute<void>(
                  builder: (_) => OrganizeScreen(bookId: book.id),
                ));
              },
            ),
            ListTile(
              leading: const Icon(Icons.visibility_outlined),
              title: const Text(S.preview),
              onTap: () {
                Navigator.of(sheetContext).pop();
                Navigator.of(context).push(MaterialPageRoute<void>(
                  builder: (_) => PreviewScreen(bookId: book.id),
                ));
              },
            ),
            ListTile(
              leading: const Icon(Icons.ios_share),
              title: const Text(S.exportAndShare),
              onTap: () {
                Navigator.of(sheetContext).pop();
                showExportSheet(context, book.id);
              },
            ),
            ListTile(
              leading: const Icon(Icons.tune),
              title: const Text(S.bookSettings),
              onTap: () {
                Navigator.of(sheetContext).pop();
                Navigator.of(context).push(MaterialPageRoute<void>(
                  builder: (_) => BookSettingsScreen(bookId: book.id),
                ));
              },
            ),
            ListTile(
              leading: const Icon(Icons.edit_outlined),
              title: const Text(S.editBook),
              onTap: () async {
                Navigator.of(sheetContext).pop();
                final title = await promptForText(context, title: S.editBook, initial: book.title);
                if (title != null && title.isNotEmpty) {
                  controller.updateBook(book.id, title: title);
                }
              },
            ),
            ListTile(
              leading: Icon(Icons.delete_outline, color: Theme.of(context).colorScheme.error),
              title: Text(
                S.delete,
                style: TextStyle(color: Theme.of(context).colorScheme.error),
              ),
              onTap: () async {
                Navigator.of(sheetContext).pop();
                final confirmed = await confirmAction(
                  context,
                  title: S.delete,
                  message: 'The book structure is deleted. The scenes stay in the Write pool.',
                );
                if (confirmed) controller.deleteBook(book.id);
              },
            ),
          ],
        ),
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final books = controller.books;

    if (books.isEmpty) {
      return EmptyState(
        icon: Icons.menu_book_outlined,
        title: S.noBooksInProject,
        subtitle: 'A project can contain several books that share the same plot and scenes.',
        action: FilledButton.icon(
          onPressed: () => _addBook(context),
          icon: const Icon(Icons.add),
          label: const Text(S.addBook),
        ),
      );
    }

    return Scaffold(
      floatingActionButton: FloatingActionButton(
        tooltip: S.addBook,
        onPressed: () => _addBook(context),
        child: const Icon(Icons.add),
      ),
      body: ListView.separated(
        padding: const EdgeInsets.fromLTRB(12, 12, 12, 96),
        itemCount: books.length,
        separatorBuilder: (_, __) => const SizedBox(height: 10),
        itemBuilder: (context, index) {
          final book = books[index];
          final words = controller.wordCountForBook(book);
          return Card(
            child: InkWell(
              borderRadius: BorderRadius.circular(12),
              onTap: () => Navigator.of(context).push(MaterialPageRoute<void>(
                builder: (_) => OrganizeScreen(bookId: book.id),
              )),
              child: Padding(
                padding: const EdgeInsets.all(12),
                child: Row(
                  children: [
                    CoverThumb(cover: book.cover, width: 56, height: 78, fallbackIcon: Icons.book),
                    const SizedBox(width: 12),
                    Expanded(
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Text(
                            book.title,
                            style: Theme.of(context).textTheme.titleMedium,
                            maxLines: 2,
                            overflow: TextOverflow.ellipsis,
                          ),
                          const SizedBox(height: 2),
                          Text(
                            '$words ${S.words}',
                            style: Theme.of(context).textTheme.bodySmall,
                          ),
                          if (book.dueDate != null)
                            Text(
                              '${S.dueDate}: ${formatDate(book.dueDate)}',
                              style: Theme.of(context).textTheme.bodySmall,
                            ),
                          if (book.metadata.author != null)
                            Text(
                              book.metadata.author!,
                              style: Theme.of(context).textTheme.bodySmall,
                            ),
                        ],
                      ),
                    ),
                    Column(
                      children: [
                        IconButton(
                          tooltip: S.preview,
                          icon: const Icon(Icons.visibility_outlined),
                          onPressed: () => Navigator.of(context).push(MaterialPageRoute<void>(
                            builder: (_) => PreviewScreen(bookId: book.id),
                          )),
                        ),
                        IconButton(
                          icon: const Icon(Icons.more_vert),
                          onPressed: () => _bookMenu(context, book),
                        ),
                      ],
                    ),
                  ],
                ),
              ),
            ),
          );
        },
      ),
    );
  }
}
