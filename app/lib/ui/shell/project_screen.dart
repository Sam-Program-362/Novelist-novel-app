import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../state/open_project.dart';
import '../../state/project_controller.dart';
import '../backup/backup_screen.dart';
import '../books/books_tab.dart';
import '../plot/plot_tab.dart';
import '../schedule/schedule_tab.dart';
import '../settings/settings_screen.dart';
import '../write/write_tab.dart';

/// Project workspace.
///
/// The reference exposes its modules through a navigation drawer (`drawer_open` / `end_drawer_open`
/// in the shipping string table) with the books switcher inside it; wide layouts keep the drawer
/// permanently visible instead of compressing a desktop UI onto a phone.
class ProjectScreen extends StatefulWidget {
  final int projectId;
  final int initialSection;

  const ProjectScreen({super.key, required this.projectId, this.initialSection = 0});

  @override
  State<ProjectScreen> createState() => _ProjectScreenState();
}

class _ProjectScreenState extends State<ProjectScreen> {
  int _index = 0;

  @override
  void initState() {
    super.initState();
    _index = widget.initialSection;
    // Opening here keeps the project state alive when returning from detail routes.
    WidgetsBinding.instance.addPostFrameCallback((_) {
      if (!mounted) return;
      context.read<OpenProject>().open(widget.projectId);
    });
  }

  static const _titles = [S.books, S.plot, S.write, S.schedule];

  @override
  Widget build(BuildContext context) {
    return Consumer<ProjectController>(
      builder: (context, project, _) {
          final wide = MediaQuery.sizeOf(context).width >= 840;
          final body = IndexedStack(
            index: _index,
            children: const [
              BooksTab(),
              PlotTab(),
              WriteTab(),
              ScheduleTab(),
            ],
          );

          return Scaffold(
            appBar: AppBar(
              title: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(project.project?.title ?? S.project),
                  Text(
                    _titles[_index],
                    style: Theme.of(context).textTheme.labelSmall,
                  ),
                ],
              ),
              actions: [
                IconButton(
                  tooltip: S.backup,
                  icon: const Icon(Icons.cloud_upload_outlined),
                  onPressed: () => Navigator.of(context).push(
                    MaterialPageRoute<void>(builder: (_) => const BackupScreen()),
                  ),
                ),
                IconButton(
                  tooltip: S.settings,
                  icon: const Icon(Icons.settings_outlined),
                  onPressed: () => Navigator.of(context).push(
                    MaterialPageRoute<void>(builder: (_) => const SettingsScreen()),
                  ),
                ),
              ],
            ),
            drawer: !wide ? Drawer(child: _drawer(context, project)) : null,
            body: wide
                ? Row(
                    children: [
                      SizedBox(
                        width: 280,
                        child: Material(
                          color: Theme.of(context).colorScheme.surfaceContainerLow,
                          child: SafeArea(child: _drawer(context, project)),
                        ),
                      ),
                      const VerticalDivider(width: 1),
                      Expanded(child: body),
                    ],
                  )
                : body,
          );
      },
    );
  }

  Widget _drawer(BuildContext context, ProjectController project) {
    final theme = Theme.of(context);
    return ListView(
      padding: EdgeInsets.zero,
      children: [
        DrawerHeader(
          decoration: BoxDecoration(color: theme.colorScheme.surfaceContainerHigh),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            mainAxisAlignment: MainAxisAlignment.end,
            children: [
              Text(
                project.project?.title ?? S.project,
                style: theme.textTheme.titleLarge,
                maxLines: 2,
                overflow: TextOverflow.ellipsis,
              ),
              const SizedBox(height: 6),
              Text(
                '${project.books.length} ${S.books.toLowerCase()} · '
                '${project.projectWordCount} ${S.words}',
                style: theme.textTheme.bodySmall,
              ),
            ],
          ),
        ),
        for (var i = 0; i < _titles.length; i++)
          ListTile(
            selected: _index == i,
            leading: Icon(_icons[i]),
            title: Text(_titles[i]),
            onTap: () {
              setState(() => _index = i);
              if (MediaQuery.sizeOf(context).width < 840) Navigator.of(context).pop();
            },
          ),
        const Divider(),
        ListTile(
          leading: const Icon(Icons.cloud_outlined),
          title: const Text(S.backup),
          onTap: () {
            if (MediaQuery.sizeOf(context).width < 840) Navigator.of(context).pop();
            Navigator.of(context).push(
              MaterialPageRoute<void>(builder: (_) => const BackupScreen()),
            );
          },
        ),
        ListTile(
          leading: const Icon(Icons.settings_outlined),
          title: const Text(S.settings),
          onTap: () {
            if (MediaQuery.sizeOf(context).width < 840) Navigator.of(context).pop();
            Navigator.of(context).push(
              MaterialPageRoute<void>(builder: (_) => const SettingsScreen()),
            );
          },
        ),
        const Divider(),
        Padding(
          padding: const EdgeInsets.fromLTRB(16, 8, 16, 4),
          child: Text(S.books, style: theme.textTheme.labelMedium),
        ),
        for (final book in project.books)
          ListTile(
            dense: true,
            selected: project.selectedBookId == book.id,
            leading: const Icon(Icons.menu_book_outlined, size: 20),
            title: Text(book.title, maxLines: 1, overflow: TextOverflow.ellipsis),
            subtitle: Text('${book.wordCount ?? 0} ${S.words}'),
            onTap: () {
              project.selectBook(book.id);
              if (MediaQuery.sizeOf(context).width < 840) Navigator.of(context).pop();
            },
          ),
      ],
    );
  }

  static const _icons = [
    Icons.menu_book_outlined,
    Icons.account_tree_outlined,
    Icons.edit_note_outlined,
    Icons.insights_outlined,
  ];
}
