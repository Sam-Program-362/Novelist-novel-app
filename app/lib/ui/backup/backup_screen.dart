import 'dart:io';

import 'package:file_picker/file_picker.dart';
import 'package:flutter/material.dart';
import 'package:path_provider/path_provider.dart';
import 'package:provider/provider.dart';
import 'package:share_plus/share_plus.dart';

import '../../core/l10n/strings.dart';
import '../../data/io/nov_file.dart';
import '../../state/project_controller.dart';
import '../widgets/common.dart';

/// Backup & restore of the open project.
///
/// The reference is offline-first and (per its own FAQ) offers **no automatic cloud sync**: projects
/// are transferred with *Send to cloud* / *Receive from cloud* or by creating a backup on one device
/// and restoring it on another. This screen implements the backup half faithfully — local `.nov`
/// export and restore — and states plainly that cloud transfer is not configured rather than
/// pretending to support it.
class BackupScreen extends StatelessWidget {
  const BackupScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final controller = context.watch<ProjectController>();
    final project = controller.project;
    if (project == null) {
      return const Scaffold(body: Center(child: Text(S.anErrorOccurred)));
    }
    final theme = Theme.of(context);

    Future<void> createBackup() async {
      try {
        final nov = NovFile(controller.db);
        final content = nov.exportToString(project.id);
        final directory = await getTemporaryDirectory();
        final file = File(
          '${directory.path}/${project.title.replaceAll('/', '-')}.nov',
        );
        await file.writeAsString(content);
        await Share.shareXFiles([XFile(file.path)], text: project.title);
        controller.projectsDao.markBackedUp(project.id);
        controller.reload();
        if (context.mounted) showMessage(context, S.backupCreated);
      } catch (error) {
        if (context.mounted) showMessage(context, '${S.anErrorOccurred}: $error');
      }
    }

    Future<void> restoreBackup() async {
      try {
        final result = await FilePicker.platform.pickFiles(withData: true);
        final picked = result?.files.single;
        if (picked == null) return;
        String? content;
        if (picked.bytes != null) {
          content = String.fromCharCodes(picked.bytes!);
        } else if (picked.path != null) {
          content = await File(picked.path!).readAsString();
        }
        if (content == null) return;
        final parsed = NovFile(controller.db).parse(content);
        if (!context.mounted) return;
        final confirmed = await confirmAction(
          context,
          title: S.restoreBackup,
          message: '“${parsed.map['title']}” will be imported as a new project. '
              'Existing projects are not modified.',
          confirmLabel: S.restore,
          destructive: false,
        );
        if (!confirmed) return;
        NovFile(controller.db).importParsed(parsed);
        if (context.mounted) showMessage(context, S.backupRestored);
      } catch (error) {
        if (context.mounted) showMessage(context, '${S.invalidBackupFile}: $error');
      }
    }

    return Scaffold(
      appBar: AppBar(title: const Text(S.backup)),
      body: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          Card(
            child: Padding(
              padding: const EdgeInsets.all(16),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(project.title, style: theme.textTheme.titleMedium),
                  const SizedBox(height: 6),
                  Row(
                    children: [
                      BackupIndicator(hasBackup: project.hasBackup),
                      const SizedBox(width: 8),
                      Text(
                        project.hasBackup
                            ? '${S.lastBackupDate}: ${formatDate(project.lastBackupDate)}'
                            : S.needsBackup,
                      ),
                    ],
                  ),
                  if (project.lastCloudSyncDate != null) ...[
                    const SizedBox(height: 4),
                    Text('${S.lastSync}: ${formatDate(project.lastCloudSyncDate)} '
                        '(${project.lastCloudSyncDeviceName ?? ''})'),
                  ],
                ],
              ),
            ),
          ),
          const SizedBox(height: 16),
          FilledButton.icon(
            onPressed: createBackup,
            icon: const Icon(Icons.save_alt_outlined),
            label: const Text(S.createBackup),
          ),
          const SizedBox(height: 8),
          OutlinedButton.icon(
            onPressed: restoreBackup,
            icon: const Icon(Icons.restore),
            label: const Text(S.restoreBackup),
          ),
          const SizedBox(height: 24),
          Text(S.cloud, style: theme.textTheme.titleSmall),
          const SizedBox(height: 8),
          Card(
            child: ListTile(
              leading: const Icon(Icons.cloud_off_outlined),
              title: const Text(S.cloudNotConnected),
              subtitle: const Text(
                'The original app transfers projects manually through Google Drive or iCloud. '
                'This build keeps everything on the device: export a backup and restore it on the '
                'other device.',
              ),
            ),
          ),
          const SizedBox(height: 24),
          Text(S.history, style: theme.textTheme.titleSmall),
          const SizedBox(height: 8),
          const Card(
            child: ListTile(
              leading: Icon(Icons.history),
              title: Text('Scene and item versions'),
              subtitle: Text(
                'Previous versions are stored for every scene and plot item. '
                'Open a scene and choose History to restore one.',
              ),
            ),
          ),
        ],
      ),
    );
  }
}
