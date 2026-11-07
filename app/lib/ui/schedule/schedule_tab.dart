import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../models/entities.dart';
import '../../state/project_controller.dart';
import '../widgets/common.dart';

/// Schedule module: goals, deadline, daily progress, streaks and the progress chart.
class ScheduleTab extends StatefulWidget {
  const ScheduleTab({super.key});

  @override
  State<ScheduleTab> createState() => _ScheduleTabState();
}

class _ScheduleTabState extends State<ScheduleTab> {
  bool _recordedOnOpen = false;

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final book = controller.selectedBook;
    if (book == null) {
      return const EmptyState(icon: Icons.insights_outlined, title: S.noBooksInProject);
    }

    final progress = controller.booksDao.progressFor(book.id);
    final words = controller.wordCountForBook(book);
    final goal = book.settings.wordGoal;
    final progressStats = _ProgressStats.from(progress);

    // Recording "today" once per visit keeps the daily chart meaningful without writing on every
    // rebuild (which would produce a database write per frame).
    if (!_recordedOnOpen) {
      _recordedOnOpen = true;
      WidgetsBinding.instance.addPostFrameCallback((_) {
        if (!mounted) return;
        controller.booksDao.setProgress(book.id, DateTime.now(), words);
        controller.booksDao.setWordCount(book.id, words);
        controller.reload();
      });
    }

    return ListView(
      padding: const EdgeInsets.all(16),
      children: [
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Row(
                  children: [
                    Expanded(
                      child: Text(book.title, style: Theme.of(context).textTheme.titleMedium),
                    ),
                    IconButton(
                      icon: const Icon(Icons.flag_outlined),
                      tooltip: S.setGoals,
                      onPressed: () => _setGoals(context, controller, book),
                    ),
                  ],
                ),
                const SizedBox(height: 8),
                Text('$words ${S.words}', style: Theme.of(context).textTheme.headlineSmall),
                if (goal != null && goal > 0) ...[
                  const SizedBox(height: 8),
                  LinearProgressIndicator(
                    value: (words / goal).clamp(0, 1),
                    minHeight: 8,
                  ),
                  const SizedBox(height: 6),
                  Text('${(words / goal * 100).clamp(0, 100).toStringAsFixed(1)}% '
                      'of $goal ${S.words}'),
                ] else
                  const Text('No word goal set'),
                if (book.dueDate != null) ...[
                  const SizedBox(height: 8),
                  Text('${S.dueDate}: ${formatDate(book.dueDate)} · '
                      '${progressStats.remainingDays(book.dueDate!)} ${S.remainingDays.toLowerCase()}'),
                ],
              ],
            ),
          ),
        ),
        const SizedBox(height: 12),
        Row(
          children: [
            Expanded(
              child: _StatCard(
                label: S.writingDays,
                value: '${progressStats.writingDays}',
                icon: Icons.event_available,
              ),
            ),
            const SizedBox(width: 8),
            Expanded(
              child: _StatCard(
                label: S.currentStreak,
                value: '${progressStats.currentStreak}',
                icon: Icons.local_fire_department_outlined,
              ),
            ),
            const SizedBox(width: 8),
            Expanded(
              child: _StatCard(
                label: S.longestStreak,
                value: '${progressStats.longestStreak}',
                icon: Icons.emoji_events_outlined,
              ),
            ),
          ],
        ),
        const SizedBox(height: 16),
        Row(
          children: [
            Expanded(
              child: Text(S.dailyProgress, style: Theme.of(context).textTheme.titleSmall),
            ),
            TextButton.icon(
              onPressed: () => _addProgress(context, controller, book),
              icon: const Icon(Icons.add),
              label: const Text(S.addProgress),
            ),
          ],
        ),
        const SizedBox(height: 8),
        if (progress.isEmpty)
          Card(
            child: Padding(
              padding: const EdgeInsets.all(24),
              child: Center(child: Text(S.noProgressesToDisplay)),
            ),
          )
        else
          Card(
            child: Padding(
              padding: const EdgeInsets.fromLTRB(8, 16, 8, 8),
              child: SizedBox(
                height: 180,
                child: CustomPaint(
                  painter: _ProgressChartPainter(
                    progress: progressStats.last(30),
                    colour: Theme.of(context).colorScheme.primary,
                    labelColour: Theme.of(context).colorScheme.onSurfaceVariant,
                  ),
                  child: const SizedBox.expand(),
                ),
              ),
            ),
          ),
        const SizedBox(height: 24),
        Text(S.totalWords, style: Theme.of(context).textTheme.titleSmall),
        const SizedBox(height: 4),
        Text('${progressStats.totalWords} ${S.words} recorded'),
      ],
    );
  }

  Future<void> _setGoals(
    BuildContext context,
    ProjectController controller,
    Book book,
  ) async {
    final goalController =
        TextEditingController(text: book.settings.wordGoal?.toString() ?? '');
    DateTime? dueDate = book.dueDate == null
        ? null
        : DateTime.fromMillisecondsSinceEpoch(book.dueDate!);

    await showDialog<void>(
      context: context,
      builder: (dialogContext) => StatefulBuilder(
        builder: (context, setDialogState) => AlertDialog(
          title: const Text(S.setGoals),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              TextField(
                controller: goalController,
                keyboardType: TextInputType.number,
                decoration: const InputDecoration(labelText: S.wordGoal),
              ),
              const SizedBox(height: 12),
              ListTile(
                contentPadding: EdgeInsets.zero,
                title: const Text(S.dueDate),
                subtitle: Text(dueDate == null ? S.notSet : formatDate(dueDate!.millisecondsSinceEpoch)),
                trailing: const Icon(Icons.calendar_today_outlined),
                onTap: () async {
                  final picked = await showDatePicker(
                    context: context,
                    initialDate: dueDate ?? DateTime.now(),
                    firstDate: DateTime(2000),
                    lastDate: DateTime(2100),
                  );
                  if (picked != null) setDialogState(() => dueDate = picked);
                },
              ),
            ],
          ),
          actions: [
            TextButton(
              onPressed: () => Navigator.of(dialogContext).pop(),
              child: const Text(S.cancel),
            ),
            FilledButton(
              onPressed: () {
                final goal = int.tryParse(goalController.text.trim());
                controller.updateBook(
                  book.id,
                  dueDate: dueDate?.millisecondsSinceEpoch,
                  clearDueDate: dueDate == null,
                  settings: book.settings.copyWith(
                    wordGoal: goal,
                    clearWordGoal: goal == null,
                  ),
                );
                Navigator.of(dialogContext).pop();
              },
              child: const Text(S.save),
            ),
          ],
        ),
      ),
    );
  }

  Future<void> _addProgress(
    BuildContext context,
    ProjectController controller,
    Book book,
  ) async {
    DateTime selected = DateTime.now();
    final wordsController = TextEditingController(
      text: (controller.booksDao.progressForDate(book.id, selected) ?? 0).toString(),
    );

    await showDialog<void>(
      context: context,
      builder: (dialogContext) => StatefulBuilder(
        builder: (context, setDialogState) => AlertDialog(
          title: const Text(S.addProgress),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              ListTile(
                contentPadding: EdgeInsets.zero,
                title: const Text(S.selectedDate),
                subtitle: Text(formatDate(selected.millisecondsSinceEpoch)),
                trailing: const Icon(Icons.calendar_today_outlined),
                onTap: () async {
                  final picked = await showDatePicker(
                    context: context,
                    initialDate: selected,
                    firstDate: DateTime(2000),
                    lastDate: DateTime(2100),
                  );
                  if (picked != null) {
                    setDialogState(() {
                      selected = picked;
                      wordsController.text =
                          (controller.booksDao.progressForDate(book.id, picked) ?? 0).toString();
                    });
                  }
                },
              ),
              TextField(
                controller: wordsController,
                keyboardType: TextInputType.number,
                decoration: const InputDecoration(labelText: S.totalWords),
              ),
            ],
          ),
          actions: [
            TextButton(
              onPressed: () => Navigator.of(dialogContext).pop(),
              child: const Text(S.cancel),
            ),
            FilledButton(
              onPressed: () {
                final words = int.tryParse(wordsController.text.trim()) ?? 0;
                controller.booksDao.setProgress(book.id, selected, words);
                controller.reload();
                Navigator.of(dialogContext).pop();
              },
              child: const Text(S.save),
            ),
          ],
        ),
      ),
    );
  }
}

class _StatCard extends StatelessWidget {
  final String label;
  final String value;
  final IconData icon;

  const _StatCard({required this.label, required this.value, required this.icon});

  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);
    return Card(
      child: Padding(
        padding: const EdgeInsets.symmetric(vertical: 12, horizontal: 8),
        child: Column(
          children: [
            Icon(icon, size: 18, color: theme.colorScheme.onSurfaceVariant),
            const SizedBox(height: 4),
            Text(value, style: theme.textTheme.titleMedium),
            Text(
              label,
              textAlign: TextAlign.center,
              style: theme.textTheme.labelSmall,
              maxLines: 2,
            ),
          ],
        ),
      ),
    );
  }
}

class _ProgressStats {
  final List<BookProgress> entries;

  const _ProgressStats(this.entries);

  factory _ProgressStats.from(List<BookProgress> entries) => _ProgressStats(entries);

  int get writingDays => entries.where((e) => e.wordCount > 0).length;

  int get totalWords => entries.fold(0, (sum, e) => sum + e.wordCount);

  List<BookProgress> last(int days) {
    final cutoff = DateTime.now().subtract(Duration(days: days));
    return entries.where((e) => e.date.isAfter(cutoff)).toList(growable: false);
  }

  int get currentStreak {
    final byDay = {for (final e in entries) if (e.wordCount > 0) _key(e.date): true};
    var streak = 0;
    var cursor = DateTime.now();
    // Allow the streak to be "as of yesterday" when nothing has been written today yet.
    if (!byDay.containsKey(_key(cursor))) {
      cursor = cursor.subtract(const Duration(days: 1));
    }
    while (byDay.containsKey(_key(cursor))) {
      streak++;
      cursor = cursor.subtract(const Duration(days: 1));
    }
    return streak;
  }

  int get longestStreak {
    final dates = entries
        .where((e) => e.wordCount > 0)
        .map((e) => DateTime(e.year, e.month, e.day))
        .toSet()
        .toList()
      ..sort();
    var longest = 0;
    var current = 0;
    DateTime? previous;
    for (final date in dates) {
      if (previous != null && date.difference(previous).inDays == 1) {
        current++;
      } else {
        current = 1;
      }
      if (current > longest) longest = current;
      previous = date;
    }
    return longest;
  }

  int remainingDays(int dueMillis) {
    final due = DateTime.fromMillisecondsSinceEpoch(dueMillis);
    final difference = DateTime(due.year, due.month, due.day)
        .difference(DateTime(DateTime.now().year, DateTime.now().month, DateTime.now().day))
        .inDays;
    return difference < 0 ? 0 : difference;
  }

  static String _key(DateTime date) =>
      '${date.year}-${date.month.toString().padLeft(2, '0')}-${date.day.toString().padLeft(2, '0')}';
}

class _ProgressChartPainter extends CustomPainter {
  final List<BookProgress> progress;
  final Color colour;
  final Color labelColour;

  _ProgressChartPainter({
    required this.progress,
    required this.colour,
    required this.labelColour,
  });

  @override
  void paint(Canvas canvas, Size size) {
    if (progress.isEmpty) return;
    final maxWords = progress.map((e) => e.wordCount).reduce((a, b) => a > b ? a : b);
    final barWidth = size.width / (progress.length * 1.4);
    final paint = Paint()..color = colour;
    final baseline = size.height - 18;
    for (var i = 0; i < progress.length; i++) {
      final entry = progress[i];
      final ratio = maxWords == 0 ? 0.0 : entry.wordCount / maxWords;
      final height = (baseline - 4) * ratio;
      final dx = i * barWidth * 1.4 + barWidth * 0.2;
      final rect = RRect.fromRectAndRadius(
        Rect.fromLTWH(dx, baseline - height, barWidth, height),
        const Radius.circular(3),
      );
      canvas.drawRRect(rect, paint);
      if (i % 5 == 0) {
        final textPainter = TextPainter(
          text: TextSpan(
            text: '${entry.day}',
            style: TextStyle(fontSize: 9, color: labelColour),
          ),
          textDirection: TextDirection.ltr,
        )..layout();
        textPainter.paint(canvas, Offset(dx, baseline + 4));
      }
    }
  }

  @override
  bool shouldRepaint(covariant _ProgressChartPainter oldDelegate) =>
      oldDelegate.progress != progress;
}
