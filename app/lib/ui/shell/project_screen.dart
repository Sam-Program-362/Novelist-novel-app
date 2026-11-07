import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../state/app_settings.dart';
import '../../state/open_project.dart';
import '../../state/project_controller.dart';
import '../backup/backup_screen.dart';
import '../books/books_tab.dart';
import '../cloud/cloud_library_screen.dart';
import '../help/help_center_screen.dart';
import '../help/tutorial_screen.dart';
import '../plot/plot_tab.dart';
import '../progress/progress_screen.dart';
import '../schedule/schedule_tab.dart';
import '../search/search_screen.dart';
import '../settings/settings_screen.dart';
import '../write/write_tab.dart';

/// Project workspace.
///
/// The reference exposes its modules through a navigation drawer (`drawer_open` / `end_drawer_open`
/// in the shipping string table) with the books switcher inside it; wide layouts keep the drawer
/// permanently visible instead of compressing a desktop UI onto a phone.
///
/// The drawer is also the entry point of the secondary routes the reference registers —
/// `/search`, `/progress`, `/cloud_library`, `/help_center`, `/tutorial` and `/easy_mode`.
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

  /// Easy mode keeps only the two modules a first draft needs.
  List<WorkspaceSection> _sections(bool easyMode) => easyMode
      ? const [WorkspaceSection.books, WorkspaceSection.write]
      : const [
          WorkspaceSection.books,
          WorkspaceSection.plot,
          WorkspaceSection.write,
          WorkspaceSection.schedule,
        ];

  static String _label(WorkspaceSection section) => switch (section) {
        WorkspaceSection.books => S.books,
        WorkspaceSection.plot => S.plot,
        WorkspaceSection.write => S.write,
        WorkspaceSection.schedule => S.schedule,
      };

  static IconData _icon(WorkspaceSection section) => switch (section) {
        WorkspaceSection.books => Icons.menu_book_outlined,
        WorkspaceSection.plot => Icons.account_tree_outlined,
        WorkspaceSection.write => Icons.edit_note_outlined,
        WorkspaceSection.schedule => Icons.insights_outlined,
      };

  static Widget _body(WorkspaceSection section) => switch (section) {
        WorkspaceSection.books => const BooksTab(),
        WorkspaceSection.plot => const PlotTab(),
        WorkspaceSection.write => const WriteTab(),
        WorkspaceSection.schedule => const ScheduleTab(),
      };

  bool get _wide => MediaQuery.sizeOf(context).width >= 840;

  void _push(Widget screen) {
    if (!_wide) Navigator.of(context).pop();
    Navigator.of(context).push(MaterialPageRoute<void>(builder: (_) => screen));
  }

  @override
  Widget build(BuildContext context) {
    final settings = context.watch<AppSettings>();
    return Consumer<ProjectController>(
      builder: (context, project, _) {
        final sections = _sections(settings.easyMode);
        if (_index >= sections.length) _index = 0;
        final current = sections[_index];
        final body = IndexedStack(
          index: _index,
          children: [for (final section in sections) _body(section)],
        );

        return Scaffold(
          appBar: AppBar(
            title: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(project.project?.title ?? S.project),
                Text(
                  _label(current),
                  style: Theme.of(context).textTheme.labelSmall,
                ),
              ],
            ),
            actions: [
              IconButton(
                tooltip: S.search,
                icon: const Icon(Icons.search),
                onPressed: () => _push(const SearchScreen()),
              ),
              IconButton(
                tooltip: S.progress,
                icon: const Icon(Icons.insights_outlined),
                onPressed: () => _push(const ProgressScreen()),
              ),
              IconButton(
                tooltip: S.backup,
                icon: const Icon(Icons.cloud_upload_outlined),
                onPressed: () => _push(const BackupScreen()),
              ),
              IconButton(
                tooltip: S.settings,
                icon: const Icon(Icons.settings_outlined),
                onPressed: () => _push(const SettingsScreen()),
              ),
            ],
          ),
          drawer: !_wide ? Drawer(child: _drawer(context, project, settings, sections)) : null,
          body: _wide
              ? Row(
                  children: [
                    SizedBox(
                      width: 280,
                      child: Material(
                        color: Theme.of(context).colorScheme.surfaceContainerLow,
                        child: SafeArea(
                          child: _drawer(context, project, settings, sections),
                        ),
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

  Widget _drawer(
    BuildContext context,
    ProjectController project,
    AppSettings settings,
    List<WorkspaceSection> sections,
  ) {
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
        for (var i = 0; i < sections.length; i++)
          ListTile(
            selected: _index == i,
            leading: Icon(_icon(sections[i])),
            title: Text(_label(sections[i])),
            onTap: () {
              setState(() => _index = i);
              if (!_wide) Navigator.of(context).pop();
            },
          ),
        const Divider(),
        ListTile(
          leading: const Icon(Icons.search),
          title: const Text(S.search),
          onTap: () => _push(const SearchScreen()),
        ),
        ListTile(
          leading: const Icon(Icons.insights_outlined),
          title: const Text(S.progress),
          onTap: () => _push(const ProgressScreen()),
        ),
        if (!settings.easyMode)
          ListTile(
            leading: const Icon(Icons.cloud_outlined),
            title: const Text(S.cloudLibrary),
            onTap: () => _push(const CloudLibraryScreen()),
          ),
        const Divider(),
        ListTile(
          leading: const Icon(Icons.cloud_upload_outlined),
          title: const Text(S.backup),
          onTap: () => _push(const BackupScreen()),
        ),
        ListTile(
          leading: const Icon(Icons.help_outline),
          title: const Text(S.helpCenter),
          onTap: () => _push(const HelpCenterScreen()),
        ),
        ListTile(
          leading: const Icon(Icons.school_outlined),
          title: const Text(S.tutorial),
          onTap: () => _push(const TutorialScreen()),
        ),
        SwitchListTile(
          secondary: const Icon(Icons.auto_awesome_outlined),
          title: const Text(S.easyMode),
          value: settings.easyMode,
          onChanged: settings.setEasyMode,
        ),
        ListTile(
          leading: const Icon(Icons.settings_outlined),
          title: const Text(S.settings),
          onTap: () => _push(const SettingsScreen()),
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
              if (!_wide) Navigator.of(context).pop();
            },
          ),
      ],
    );
  }
}
