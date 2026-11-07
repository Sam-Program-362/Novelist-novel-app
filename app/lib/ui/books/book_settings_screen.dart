import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../models/entities.dart';
import '../../state/project_controller.dart';
import '../../core/utils/iterable_x.dart';
import '../widgets/common.dart';

/// Book metadata and compile settings (`book_metadata` / `book_settings` JSON columns).
class BookSettingsScreen extends StatefulWidget {
  final int bookId;

  const BookSettingsScreen({super.key, required this.bookId});

  @override
  State<BookSettingsScreen> createState() => _BookSettingsScreenState();
}

class _BookSettingsScreenState extends State<BookSettingsScreen> {
  late TextEditingController author;
  late TextEditingController genre;
  late TextEditingController language;
  late TextEditingController publisher;
  late TextEditingController isbn;
  late TextEditingController copyright;
  late TextEditingController description;
  late TextEditingController tocTitle;
  bool showTableOfContents = true;
  bool autoIndentation = true;
  int? dueDate;
  bool _loaded = false;

  void _loadFromBook(Book book) {
    if (_loaded) return;
    author = TextEditingController(text: book.metadata.author ?? '');
    genre = TextEditingController(text: book.metadata.genre ?? '');
    language = TextEditingController(text: book.metadata.language ?? '');
    publisher = TextEditingController(text: book.metadata.publisher ?? '');
    isbn = TextEditingController(text: book.metadata.isbn ?? '');
    copyright = TextEditingController(text: book.metadata.copyright ?? '');
    description = TextEditingController(text: book.description ?? '');
    tocTitle = TextEditingController(text: book.settings.tableOfContentsTitle ?? '');
    showTableOfContents = book.settings.showTableOfContents;
    autoIndentation = book.settings.applyAutomaticIndentation;
    dueDate = book.dueDate;
    _loaded = true;
  }

  @override
  void dispose() {
    if (_loaded) {
      author.dispose();
      genre.dispose();
      language.dispose();
      publisher.dispose();
      isbn.dispose();
      copyright.dispose();
      description.dispose();
      tocTitle.dispose();
    }
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final book = controller.books.where((b) => b.id == widget.bookId).firstOrNull;
    if (book == null) {
      return const Scaffold(body: Center(child: Text(S.anErrorOccurred)));
    }
    _loadFromBook(book);

    return Scaffold(
      appBar: AppBar(
        title: const Text(S.bookSettings),
        actions: [
          TextButton(
            onPressed: () {
              controller.updateBook(
                book.id,
                description: description.text.trim(),
                dueDate: dueDate,
                clearDueDate: dueDate == null,
                metadata: BookMetadata(
                  author: author.text.trim(),
                  genre: genre.text.trim(),
                  language: language.text.trim(),
                  publisher: publisher.text.trim(),
                  isbn: isbn.text.trim(),
                  copyright: copyright.text.trim(),
                ),
                settings: book.settings.copyWith(
                  showTableOfContents: showTableOfContents,
                  tableOfContentsTitle:
                      tocTitle.text.trim().isEmpty ? null : tocTitle.text.trim(),
                  applyAutomaticIndentation: autoIndentation,
                ),
              );
              Navigator.of(context).pop();
            },
            child: const Text(S.save),
          ),
        ],
      ),
      body: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          TextField(
            controller: description,
            maxLines: 4,
            decoration: const InputDecoration(labelText: S.description),
          ),
          const SizedBox(height: 12),
          TextField(
            controller: author,
            decoration: const InputDecoration(labelText: S.author),
          ),
          const SizedBox(height: 12),
          TextField(
            controller: genre,
            decoration: const InputDecoration(labelText: S.genre),
          ),
          const SizedBox(height: 12),
          TextField(
            controller: language,
            decoration: const InputDecoration(labelText: S.language),
          ),
          const SizedBox(height: 12),
          TextField(
            controller: publisher,
            decoration: const InputDecoration(labelText: S.publisher),
          ),
          const SizedBox(height: 12),
          TextField(
            controller: isbn,
            decoration: const InputDecoration(labelText: S.isbn),
          ),
          const SizedBox(height: 12),
          TextField(
            controller: copyright,
            decoration: const InputDecoration(labelText: S.copyright),
          ),
          const SizedBox(height: 20),
          Text(S.preview, style: Theme.of(context).textTheme.titleSmall),
          SwitchListTile(
            contentPadding: EdgeInsets.zero,
            value: showTableOfContents,
            title: const Text(S.showTableOfContents),
            onChanged: (value) => setState(() => showTableOfContents = value),
          ),
          TextField(
            controller: tocTitle,
            decoration: const InputDecoration(labelText: S.tableOfContentsTitle),
          ),
          SwitchListTile(
            contentPadding: EdgeInsets.zero,
            value: autoIndentation,
            title: const Text(S.applyAutomaticIndentation),
            onChanged: (value) => setState(() => autoIndentation = value),
          ),
          const SizedBox(height: 8),
          ListTile(
            contentPadding: EdgeInsets.zero,
            title: const Text(S.dueDate),
            subtitle: Text(formatDate(dueDate)),
            trailing: const Icon(Icons.calendar_today_outlined),
            onTap: () async {
              final picked = await showDatePicker(
                context: context,
                initialDate: dueDate == null ? DateTime.now() : DateTime.fromMillisecondsSinceEpoch(dueDate!),
                firstDate: DateTime(2000),
                lastDate: DateTime(2100),
              );
              if (picked != null) {
                setState(() => dueDate = picked.millisecondsSinceEpoch);
              }
            },
          ),
        ],
      ),
    );
  }
}
