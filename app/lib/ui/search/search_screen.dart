import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../core/utils/text_doc.dart';
import '../../state/project_controller.dart';
import '../plot/item_detail_screen.dart';
import '../widgets/common.dart';
import '../write/scene_editor_screen.dart';

/// One hit of the project-wide search.
class SearchHit {
  final String kind;
  final String title;
  final String snippet;
  final void Function(BuildContext context)? open;

  const SearchHit({
    required this.kind,
    required this.title,
    required this.snippet,
    this.open,
  });
}

/// Searches the project (`/search?query=` in the reference application).
///
/// The reference searches scenes and plot items of the open project; book and section titles are
/// included here because they are the fastest way back to a chapter when a project has many books.
class SearchScreen extends StatefulWidget {
  final String initialQuery;

  const SearchScreen({super.key, this.initialQuery = ''});

  @override
  State<SearchScreen> createState() => _SearchScreenState();
}

class _SearchScreenState extends State<SearchScreen> {
  late final TextEditingController _query =
      TextEditingController(text: widget.initialQuery);

  @override
  void dispose() {
    _query.dispose();
    super.dispose();
  }

  List<SearchHit> _search(ProjectController controller, String rawQuery) {
    final query = rawQuery.trim().toLowerCase();
    if (query.isEmpty) return const [];

    final hits = <SearchHit>[];
    String snippetOf(String? text) {
      final plain = TextDoc.fromJsonString(text).plainText.replaceAll('\n', ' ').trim();
      if (plain.isEmpty) return '';
      final at = plain.toLowerCase().indexOf(query);
      if (at < 0) return plain.length <= 90 ? plain : '${plain.substring(0, 90)}…';
      final start = at - 30 < 0 ? 0 : at - 30;
      final end = (at + query.length + 60).clamp(0, plain.length);
      return '${start > 0 ? '…' : ''}${plain.substring(start, end)}'
          '${end < plain.length ? '…' : ''}';
    }

    for (final book in controller.books) {
      if (book.title.toLowerCase().contains(query)) {
        hits.add(SearchHit(kind: S.books, title: book.title, snippet: ''));
      }
    }
    for (final scene in controller.scenes) {
      final plain = TextDoc.fromJsonString(scene.text).plainText;
      final synopsis = scene.synopsis ?? '';
      if (scene.title.toLowerCase().contains(query) ||
          plain.toLowerCase().contains(query) ||
          synopsis.toLowerCase().contains(query)) {
        hits.add(SearchHit(
          kind: S.scenes,
          title: scene.title,
          snippet: snippetOf(scene.text),
          open: (context) => Navigator.of(context).push(MaterialPageRoute<void>(
            builder: (_) => SceneEditorScreen(sceneId: scene.id),
          )),
        ));
      }
    }
    for (final item in controller.allItems) {
      final plain = TextDoc.fromJsonString(item.text).plainText;
      final synopsis = item.synopsis ?? '';
      if (item.title.toLowerCase().contains(query) ||
          plain.toLowerCase().contains(query) ||
          synopsis.toLowerCase().contains(query)) {
        hits.add(SearchHit(
          kind: S.plot,
          title: item.title,
          snippet: snippetOf(item.text).isEmpty ? synopsis : snippetOf(item.text),
          open: (context) => Navigator.of(context).push(MaterialPageRoute<void>(
            builder: (_) => ItemDetailScreen(itemId: item.id),
          )),
        ));
      }
    }
    return hits;
  }

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final hits = _search(controller, _query.text);
    final theme = Theme.of(context);
    final grouped = <String, List<SearchHit>>{};
    for (final hit in hits) {
      grouped.putIfAbsent(hit.kind, () => []).add(hit);
    }

    return Scaffold(
      appBar: AppBar(
        title: const Text(S.search),
      ),
      body: Column(
        children: [
          Padding(
            padding: const EdgeInsets.fromLTRB(16, 8, 16, 12),
            child: TextField(
              controller: _query,
              autofocus: true,
              textInputAction: TextInputAction.search,
              onChanged: (_) => setState(() {}),
              decoration: InputDecoration(
                prefixIcon: const Icon(Icons.search),
                hintText: S.searchHint,
                border: const OutlineInputBorder(),
                suffixIcon: _query.text.isEmpty
                    ? null
                    : IconButton(
                        tooltip: S.close,
                        icon: const Icon(Icons.clear),
                        onPressed: () => setState(_query.clear),
                      ),
              ),
            ),
          ),
          Expanded(
            child: _query.text.trim().isEmpty
                ? EmptyState(icon: Icons.search, title: S.search, subtitle: S.searchHint)
                : hits.isEmpty
                    ? const EmptyState(icon: Icons.search_off, title: S.noSearchResults)
                    : ListView(
                        children: [
                          for (final kind in grouped.keys) ...[
                            Padding(
                              padding: const EdgeInsets.fromLTRB(16, 12, 16, 4),
                              child: Text(kind, style: theme.textTheme.labelLarge),
                            ),
                            for (final hit in grouped[kind]!)
                              ListTile(
                                title: Text(hit.title, maxLines: 1,
                                    overflow: TextOverflow.ellipsis),
                                subtitle: hit.snippet.isEmpty
                                    ? null
                                    : Text(hit.snippet, maxLines: 2,
                                        overflow: TextOverflow.ellipsis),
                                trailing: hit.open == null
                                    ? null
                                    : const Icon(Icons.chevron_right),
                                onTap: hit.open == null ? null : () => hit.open!(context),
                              ),
                          ],
                        ],
                      ),
          ),
        ],
      ),
    );
  }
}
