import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../models/entities.dart';
import '../../state/app_settings.dart';
import '../../state/project_controller.dart';
import '../widgets/common.dart';

/// Word-count progress of one book (`/progress` in the reference application).
///
/// Reads the `book_progress` rows the calendar in the Schedule tab writes, so both screens always
/// agree about how much was written on a given day.
class ProgressScreen extends StatefulWidget {
  const ProgressScreen({super.key});

  @override
  State<ProgressScreen> createState() => _ProgressScreenState();
}

class _ProgressScreenState extends State<ProgressScreen> {
  int _revision = 0;

  int _streak(List<BookProgress> entries) {
    final days = entries.where((e) => e.wordCount > 0).map((e) => e.key).toSet();
    var cursor = DateTime.now();
    if (!days.contains(_keyOf(cursor))) {
      cursor = cursor.subtract(const Duration(days: 1));
      if (!days.contains(_keyOf(cursor))) return 0;
    }
    var streak = 0;
    while (days.contains(_keyOf(cursor))) {
      streak++;
      cursor = cursor.subtract(const Duration(days: 1));
    }
    return streak;
  }

  static String _keyOf(DateTime date) =>
      '${date.year.toString().padLeft(4, '0')}-'
      '${date.month.toString().padLeft(2, '0')}-'
      '${date.day.toString().padLeft(2, '0')}';

  Future<void> _addProgress(ProjectController controller, Book book) async {
    final text = await promptForText(
      context,
      title: S.addProgress,
      hint: S.words,
      initial: (controller.booksDao.progressForDate(book.id, DateTime.now()) ?? 0).toString(),
    );
    final value = int.tryParse(text?.trim() ?? '');
    if (value == null || value < 0) return;
    controller.booksDao.setProgress(book.id, DateTime.now(), value);
    controller.reload();
    if (!mounted) return;
    setState(() => _revision++);
  }

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final settings = context.watch<AppSettings>();
    final book = controller.selectedBook;
    final theme = Theme.of(context);

    if (book == null) {
      return Scaffold(
        appBar: AppBar(title: const Text(S.progress)),
        body: const EmptyState(icon: Icons.insights_outlined, title: S.noBooksInProject),
      );
    }

    // `_revision` forces a rebuild after a write; the DAOs themselves are synchronous.
    // ignore: unused_local_variable
    final revision = _revision;
    final entries = controller.booksDao.progressFor(book.id);
    final today = controller.booksDao.progressForDate(book.id, DateTime.now()) ?? 0;
    final goal = settings.dailyWordGoal <= 0 ? 1 : settings.dailyWordGoal;
    final recent = entries.length > 30 ? entries.sublist(entries.length - 30) : entries;
    final peak = recent.fold<int>(1, (max, e) => e.wordCount > max ? e.wordCount : max);

    return Scaffold(
      appBar: AppBar(
        title: const Text(S.progress),
        actions: [
          IconButton(
            tooltip: S.addProgress,
            icon: const Icon(Icons.add),
            onPressed: () => _addProgress(controller, book),
          ),
        ],
      ),
      body: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          Card(
            child: Padding(
              padding: const EdgeInsets.all(16),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(book.title, style: theme.textTheme.titleMedium),
                  const SizedBox(height: 12),
                  Row(
                    children: [
                      _Metric(label: S.totalWords, value: '${book.wordCount ?? 0}'),
                      _Metric(label: S.currentStreak, value: '${_streak(entries)}'),
                      _Metric(label: S.wordGoal, value: '$goal'),
                    ],
                  ),
                  const SizedBox(height: 16),
                  Text('${S.wordGoalToday}: $today / $goal', style: theme.textTheme.bodySmall),
                  const SizedBox(height: 6),
                  LinearProgressIndicator(
                    value: (today / goal).clamp(0.0, 1.0),
                    minHeight: 8,
                    borderRadius: BorderRadius.circular(4),
                  ),
                ],
              ),
            ),
          ),
          const SizedBox(height: 8),
          if (recent.isEmpty)
            const Padding(
              padding: EdgeInsets.symmetric(vertical: 24),
              child: EmptyState(icon: Icons.calendar_today_outlined, title: S.noProgressesToDisplay),
            )
          else ...[
            Padding(
              padding: const EdgeInsets.fromLTRB(4, 16, 4, 8),
              child: Text(S.dailyProgress, style: theme.textTheme.labelLarge),
            ),
            for (final entry in recent.reversed)
              Padding(
                padding: const EdgeInsets.symmetric(vertical: 3),
                child: Row(
                  children: [
                    SizedBox(
                      width: 92,
                      child: Text(
                        '${entry.day.toString().padLeft(2, '0')}/'
                        '${entry.month.toString().padLeft(2, '0')}',
                        style: theme.textTheme.bodySmall,
                      ),
                    ),
                    Expanded(
                      child: FractionallySizedBox(
                        alignment: Alignment.centerLeft,
                        widthFactor: (entry.wordCount / peak).clamp(0.02, 1.0),
                        child: Container(
                          height: 14,
                          decoration: BoxDecoration(
                            color: theme.colorScheme.primaryContainer,
                            borderRadius: BorderRadius.circular(3),
                          ),
                        ),
                      ),
                    ),
                    SizedBox(
                      width: 56,
                      child: Text(
                        '${entry.wordCount}',
                        textAlign: TextAlign.right,
                        style: theme.textTheme.bodySmall,
                      ),
                    ),
                  ],
                ),
              ),
          ],
        ],
      ),
    );
  }
}

class _Metric extends StatelessWidget {
  final String label;
  final String value;

  const _Metric({required this.label, required this.value});

  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);
    return Expanded(
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(value, style: theme.textTheme.titleLarge),
          Text(label, style: theme.textTheme.labelSmall),
        ],
      ),
    );
  }
}
