import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../state/library_controller.dart';
import '../backup/backup_screen.dart';
import '../widgets/common.dart';

/// Cloud vendors the reference supports (`CloudVendor` in its shipping string table).
enum CloudVendor { googleDrive, appleICloud }

/// Cloud library (`/cloud_library`, `Send to cloud` / `Receive from cloud`).
///
/// The reference uploads a `.nov` backup to Google Drive or Apple iCloud Drive and lists what is
/// there (`/resumable/upload/drive/v3/files` is in its binary). Both vendors need OAuth clients that
/// cannot be created for this rebuild, so the screen keeps the full interaction — connection state,
/// vendor switch, send/receive, the cloud listing — and routes every action to the local backup
/// workflow with an explicit message instead of pretending to be online.
class CloudLibraryScreen extends StatefulWidget {
  /// Lets tests (and future platform channels) supply a connection state.
  final bool initiallyConnected;

  const CloudLibraryScreen({super.key, this.initiallyConnected = false});

  @override
  State<CloudLibraryScreen> createState() => _CloudLibraryScreenState();
}

class _CloudLibraryScreenState extends State<CloudLibraryScreen> {
  late bool _connected = widget.initiallyConnected;
  CloudVendor _vendor = CloudVendor.googleDrive;

  String get _vendorName => switch (_vendor) {
        CloudVendor.googleDrive => 'Google Drive',
        CloudVendor.appleICloud => 'Apple iCloud',
      };

  void _notConfigured() {
    ScaffoldMessenger.of(context).showSnackBar(
      const SnackBar(content: Text(S.cloudNotConnected)),
    );
  }

  Future<void> _connect() async {
    if (_connected) {
      setState(() => _connected = false);
      return;
    }
    final proceed = await confirmAction(
      context,
      title: S.cloudConnect,
      message: '$_vendorName · ${S.cloudNotConnected}',
      confirmLabel: S.backup,
      destructive: false,
    );
    if (!proceed || !mounted) return;
    await Navigator.of(context).push(
      MaterialPageRoute<void>(builder: (_) => const BackupScreen()),
    );
  }

  String _dateLabel(int? millis) {
    if (millis == null || millis <= 0) return S.notSet;
    final date = DateTime.fromMillisecondsSinceEpoch(millis);
    return '${date.day.toString().padLeft(2, '0')}/'
        '${date.month.toString().padLeft(2, '0')}/${date.year}';
  }

  @override
  Widget build(BuildContext context) {
    final library = context.watch<LibraryController>();
    final theme = Theme.of(context);
    final projects = library.projects;

    return Scaffold(
      appBar: AppBar(
        title: const Text(S.cloudLibrary),
        actions: [
          IconButton(
            tooltip: S.refresh,
            icon: const Icon(Icons.refresh),
            onPressed: library.notifyListeners,
          ),
        ],
      ),
      body: ListView(
        padding: const EdgeInsets.fromLTRB(16, 12, 16, 32),
        children: [
          Card(
            child: Padding(
              padding: const EdgeInsets.all(16),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Row(
                    children: [
                      Icon(
                        _connected ? Icons.cloud_done_outlined : Icons.cloud_off_outlined,
                        color: _connected ? theme.colorScheme.primary : theme.colorScheme.outline,
                      ),
                      const SizedBox(width: 10),
                      Text(
                        _connected ? S.cloudConnected : S.cloudDisconnected,
                        style: theme.textTheme.titleMedium,
                      ),
                    ],
                  ),
                  const SizedBox(height: 12),
                  SegmentedButton<CloudVendor>(
                    segments: const [
                      ButtonSegment(
                        value: CloudVendor.googleDrive,
                        label: Text('Google Drive'),
                        icon: Icon(Icons.add_to_drive),
                      ),
                      ButtonSegment(
                        value: CloudVendor.appleICloud,
                        label: Text('Apple iCloud'),
                        icon: Icon(Icons.cloud_outlined),
                      ),
                    ],
                    selected: {_vendor},
                    onSelectionChanged: (value) => setState(() => _vendor = value.first),
                  ),
                  const SizedBox(height: 12),
                  Row(
                    children: [
                      Expanded(
                        child: FilledButton.tonalIcon(
                          onPressed: _connect,
                          icon: const Icon(Icons.link),
                          label: Text(_connected ? S.cloudDisconnect : S.cloudConnect),
                        ),
                      ),
                      const SizedBox(width: 12),
                      Expanded(
                        child: OutlinedButton.icon(
                          onPressed: _notConfigured,
                          icon: const Icon(Icons.cloud_upload_outlined),
                          label: const Text(S.sendToCloud),
                        ),
                      ),
                    ],
                  ),
                  const SizedBox(height: 8),
                  Align(
                    alignment: Alignment.centerLeft,
                    child: TextButton.icon(
                      onPressed: _notConfigured,
                      icon: const Icon(Icons.cloud_download_outlined),
                      label: const Text(S.receiveFromCloud),
                    ),
                  ),
                ],
              ),
            ),
          ),
          Padding(
            padding: const EdgeInsets.fromLTRB(4, 20, 4, 4),
            child: Text(S.fromOnlineLibrary, style: theme.textTheme.labelLarge),
          ),
          if (projects.isEmpty)
            const Padding(
              padding: EdgeInsets.symmetric(vertical: 16),
              child: EmptyState(
                icon: Icons.cloud_queue,
                title: S.noCloudBooksToDisplay,
              ),
            )
          else
            for (final project in projects)
              ListTile(
                leading: const Icon(Icons.menu_book_outlined),
                title: Text(project.title),
                subtitle: Text(
                  '${S.lastBackupDate}: ${_dateLabel(project.lastBackupDate)} · $_vendorName',
                ),
                trailing: BackupIndicator(hasBackup: project.hasBackup),
                onTap: _notConfigured,
              ),
          Padding(
            padding: const EdgeInsets.fromLTRB(4, 20, 4, 0),
            child: Text(
              S.cloudNotConnected,
              style: theme.textTheme.bodySmall,
            ),
          ),
        ],
      ),
    );
  }
}
