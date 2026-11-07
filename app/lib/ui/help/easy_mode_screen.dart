import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../state/app_settings.dart';

/// `/easy_mode`: the simplified interface toggle plus the explanation of what it hides.
class EasyModeScreen extends StatelessWidget {
  const EasyModeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final settings = context.watch<AppSettings>();
    return Scaffold(
      appBar: AppBar(title: const Text(S.easyMode)),
      body: ListView(
        padding: const EdgeInsets.symmetric(vertical: 8),
        children: [
          SwitchListTile(
            value: settings.easyMode,
            onChanged: settings.setEasyMode,
            secondary: const Icon(Icons.auto_awesome_outlined),
            title: const Text(S.easyMode),
            subtitle: const Text(S.easyModeIncompatibility),
          ),
          const Divider(),
          ListTile(
            leading: const Icon(Icons.menu_book_outlined),
            title: const Text(S.books),
            subtitle: const Text('The manuscript keeps its sections, scenes and settings.'),
          ),
          ListTile(
            leading: const Icon(Icons.edit_note_outlined),
            title: const Text(S.write),
            subtitle: const Text('Writing, mentions, notes and pictures stay available.'),
          ),
          ListTile(
            leading: const Icon(Icons.visibility_off_outlined),
            title: const Text(S.easyModeIncompatibility),
            subtitle: const Text(
              'Plot, schedule, cloud and the advanced book settings are hidden while easy mode is '
              'on. Nothing is deleted, and turning it off restores the full drawer.',
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(20),
            child: OutlinedButton.icon(
              onPressed: () => Navigator.of(context).maybePop(),
              icon: const Icon(Icons.check),
              label: const Text(S.gotIt),
            ),
          ),
        ],
      ),
    );
  }
}
