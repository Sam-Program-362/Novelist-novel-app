import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../state/app_settings.dart';

/// One step of the guided tour (`/tutorial` in the reference application).
class TutorialStep {
  final String title;
  final String body;
  final IconData icon;

  const TutorialStep({required this.title, required this.body, required this.icon});
}

const List<TutorialStep> kTutorialSteps = [
  TutorialStep(
    title: S.library,
    body: 'Create a project with the standard template, or open the sample novel to see how a '
        'finished project is organised. Long press a project to rename, duplicate or delete it.',
    icon: Icons.collections_bookmark_outlined,
  ),
  TutorialStep(
    title: S.plot,
    body: 'Themes, events, characters, locations, props and anything custom live here. Every item '
        'carries metadata, names and notes, and items can be linked to each other as relationships.',
    icon: Icons.account_tree_outlined,
  ),
  TutorialStep(
    title: S.write,
    body: 'Scenes are the blocks of your manuscript. Attach plot items to a scene, mention them in '
        'the text and the mention turns into a link; split a scene at the cursor when it grows.',
    icon: Icons.edit_note_outlined,
  ),
  TutorialStep(
    title: S.schedule,
    body: 'Set a word goal and a deadline. The calendar records how much you wrote each day and '
        'keeps the streak, which is the only motivation a first draft needs.',
    icon: Icons.insights_outlined,
  ),
  TutorialStep(
    title: S.preview,
    body: 'Preview compiles the book with the same rules as the export, so nothing surprises you '
        'when the manuscript leaves as EPUB, ODT or HTML.',
    icon: Icons.chrome_reader_mode_outlined,
  ),
];

/// Guided tour with an explicit exit (`End tutorial`) — the reference exposes the same control in
/// its string table, and the tour can be restarted from the drawer or the settings.
class TutorialScreen extends StatefulWidget {
  const TutorialScreen({super.key});

  @override
  State<TutorialScreen> createState() => _TutorialScreenState();
}

class _TutorialScreenState extends State<TutorialScreen> {
  final PageController _controller = PageController();
  int _index = 0;

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }

  Future<void> _finish() async {
    final settings = context.read<AppSettings>();
    await settings.setTutorialSeen(true);
    if (!mounted) return;
    if (Navigator.of(context).canPop()) Navigator.of(context).pop();
  }

  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);
    final isLast = _index == kTutorialSteps.length - 1;
    return Scaffold(
      appBar: AppBar(
        title: const Text(S.tutorial),
        actions: [
          TextButton(onPressed: _finish, child: const Text(S.endTutorial)),
        ],
      ),
      body: Column(
        children: [
          Expanded(
            child: PageView.builder(
              controller: _controller,
              itemCount: kTutorialSteps.length,
              onPageChanged: (value) => setState(() => _index = value),
              itemBuilder: (context, index) {
                final step = kTutorialSteps[index];
                return Padding(
                  padding: const EdgeInsets.fromLTRB(28, 24, 28, 8),
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Icon(step.icon, size: 56, color: theme.colorScheme.primary),
                      const SizedBox(height: 24),
                      Text('${index + 1}/${kTutorialSteps.length}',
                          style: theme.textTheme.labelMedium),
                      const SizedBox(height: 6),
                      Text(step.title, style: theme.textTheme.headlineSmall),
                      const SizedBox(height: 12),
                      Text(step.body, style: theme.textTheme.bodyLarge),
                    ],
                  ),
                );
              },
            ),
          ),
          Padding(
            padding: const EdgeInsets.fromLTRB(20, 8, 20, 24),
            child: Row(
              children: [
                for (var i = 0; i < kTutorialSteps.length; i++)
                  Padding(
                    padding: const EdgeInsets.only(right: 6),
                    child: Container(
                      width: i == _index ? 18 : 8,
                      height: 8,
                      decoration: BoxDecoration(
                        color: i == _index
                            ? theme.colorScheme.primary
                            : theme.colorScheme.surfaceContainerHighest,
                        borderRadius: BorderRadius.circular(4),
                      ),
                    ),
                  ),
                const Spacer(),
                FilledButton(
                  onPressed: isLast
                      ? _finish
                      : () => _controller.nextPage(
                            duration: const Duration(milliseconds: 220),
                            curve: Curves.easeOut,
                          ),
                  child: Text(isLast ? S.gotIt : S.next),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
