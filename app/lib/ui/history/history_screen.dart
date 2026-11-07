import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../core/utils/text_doc.dart';
import '../../models/entities.dart';
import '../../state/project_controller.dart';
import '../widgets/common.dart';

/// What a [HistoryScreen] lists: the versions of one scene or of one plot item.
enum HistoryTarget { scene, item }

/// History of a scene or item (`Restore from history` in the reference string table).
///
/// Every edit pushes the previous text onto `scene_history` / `item_history`; keeping the last twenty
/// versions per entity is the reference's own retention rule (`pushHistory(..., keep: 20)`).
class HistoryScreen extends StatefulWidget {
  final HistoryTarget target;
  final int id;
  final String title;

  const HistoryScreen({
    super.key,
    required this.target,
    required this.id,
    this.title = S.history,
  });

  @override
  State<HistoryScreen> createState() => _HistoryScreenState();
}

class _HistoryScreenState extends State<HistoryScreen> {
  Future<void> _restore(ProjectController controller, HistoryEntry entry) async {
    final ok = await confirmAction(
      context,
      title: S.restoreFromHistory,
      message: S.restoreThisVersion,
      confirmLabel: S.restore,
      destructive: false,
    );
    if (!ok || !mounted) return;

    if (widget.target == HistoryTarget.scene) {
      final current = controller.scenesDao.byId(widget.id);
      controller.scenesDao.pushHistory(widget.id, current?.text);
      controller.scenesDao.update(widget.id, text: entry.text ?? '');
    } else {
      final current = controller.allItems.where((item) => item.id == widget.id).firstOrNull;
      controller.plotDao.pushHistory(widget.id, current?.text);
      controller.updateItem(widget.id, text: entry.text);
    }
    controller.reload();
    if (!mounted) return;
    ScaffoldMessenger.of(context)
        .showSnackBar(const SnackBar(content: Text(S.backupRestored)));
  }

  String _dateLabel(int millis) {
    final date = DateTime.fromMillisecondsSinceEpoch(millis);
    final d = date.day.toString().padLeft(2, '0');
    final m = date.month.toString().padLeft(2, '0');
    final h = date.hour.toString().padLeft(2, '0');
    final min = date.minute.toString().padLeft(2, '0');
    return '$d/$m/${date.year} $h:$min';
  }

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final entries = widget.target == HistoryTarget.scene
        ? controller.scenesDao.history(widget.id)
        : controller.plotDao.history(widget.id);
    final theme = Theme.of(context);

    return Scaffold(
      appBar: AppBar(title: Text(widget.title)),
      body: entries.isEmpty
          ? const EmptyState(
              icon: Icons.history,
              title: S.noHistoriesToDisplay,
            )
          : ListView.separated(
              itemCount: entries.length,
              separatorBuilder: (_, __) => const Divider(height: 1),
              itemBuilder: (context, index) {
                final entry = entries[index];
                final plain = TextDoc.fromJsonString(entry.text).plainText.trim();
                return ListTile(
                  leading: const Icon(Icons.history),
                  title: Text(_dateLabel(entry.date), style: theme.textTheme.bodyMedium),
                  subtitle: Text(
                    plain.isEmpty ? S.itemHasNoDescription : plain,
                    maxLines: 2,
                    overflow: TextOverflow.ellipsis,
                  ),
                  trailing: TextButton(
                    onPressed: () => _restore(controller, entry),
                    child: const Text(S.restore),
                  ),
                );
              },
            ),
    );
  }
}

/// Small helper so call sites read like the reference's menu entries.
Future<void> openHistory(
  BuildContext context, {
  required HistoryTarget target,
  required int id,
  String? title,
}) {
  return Navigator.of(context).push(MaterialPageRoute<void>(
    builder: (_) => HistoryScreen(
      target: target,
      id: id,
      title: title ?? S.history,
    ),
  ));
}
