import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart' show rootBundle;
import 'package:provider/provider.dart';
import 'package:url_launcher/url_launcher.dart';

import '../../core/l10n/strings.dart';
import '../../core/utils/colours.dart';
import '../../state/app_settings.dart';
import '../widgets/common.dart';

/// Settings, help and legal surfaces.
class SettingsScreen extends StatelessWidget {
  const SettingsScreen({super.key});

  static const _fonts = [
    '',
    'Roboto',
    'Merriweather',
    'Lora',
    'Source Serif 4',
    'Crimson Text',
    'EB Garamond',
    'Libre Baskerville',
    'Playfair Display',
    'Cormorant Garamond',
    'Literata',
    'Alegreya',
    'Hina Mincho',
    'Zen Tokyo Zoo',
    'IM Fell English SC',
    'Love Ya Like A Sister',
  ];

  @override
  Widget build(BuildContext context) {
    final settings = context.watch<AppSettings>();
    final theme = Theme.of(context);

    return Scaffold(
      appBar: AppBar(title: const Text(S.settings)),
      body: ListView(
        padding: const EdgeInsets.only(bottom: 32),
        children: [
          _header(theme, S.theme),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 16),
            child: SegmentedButton<ThemeMode>(
              segments: const [
                ButtonSegment(value: ThemeMode.light, label: Text(S.light)),
                ButtonSegment(value: ThemeMode.dark, label: Text(S.dark)),
                ButtonSegment(value: ThemeMode.system, label: Text(S.system)),
              ],
              selected: {settings.themeMode},
              onSelectionChanged: (value) => settings.setThemeMode(value.first),
            ),
          ),
          ListTile(
            title: const Text(S.pickColour),
            subtitle: const Text('Primary colour used for the whole interface'),
            trailing: CircleAvatar(backgroundColor: Color(settings.seed), radius: 14),
            onTap: () async {
              final colour = await pickColour(context, current: settings.seed);
              if (colour != null) settings.setSeed(colour);
            },
          ),
          const Divider(),
          _header(theme, S.font),
          ListTile(
            title: const Text(S.font),
            subtitle: Text(settings.editorFont.isEmpty ? 'System default' : settings.editorFont),
            trailing: const Icon(Icons.expand_more),
            onTap: () async {
              final selected = await showModalBottomSheet<String>(
                context: context,
                builder: (sheetContext) => SafeArea(
                  child: ListView(
                    shrinkWrap: true,
                    children: [
                      for (final font in _fonts)
                        ListTile(
                          title: Text(font.isEmpty ? 'System default' : font),
                          selected: settings.editorFont == font,
                          onTap: () => Navigator.of(sheetContext).pop(font),
                        ),
                    ],
                  ),
                ),
              );
              if (selected != null) settings.setEditorFont(selected);
            },
          ),
          ListTile(
            title: Text('${S.fontSize} · ${settings.editorFontSize.toStringAsFixed(0)}'),
            subtitle: Slider(
              value: settings.editorFontSize,
              min: 12,
              max: 28,
              divisions: 16,
              label: settings.editorFontSize.toStringAsFixed(0),
              onChanged: settings.setEditorFontSize,
            ),
          ),
          ListTile(
            title: Text('${S.lineHeight} · ${settings.editorLineHeight.toStringAsFixed(2)}'),
            subtitle: Slider(
              value: settings.editorLineHeight,
              min: 1.1,
              max: 2.2,
              divisions: 11,
              label: settings.editorLineHeight.toStringAsFixed(2),
              onChanged: settings.setEditorLineHeight,
            ),
          ),
          const Divider(),
          _header(theme, 'Typing'),
          SwitchListTile(
            value: settings.smartQuotes,
            title: const Text(S.smartQuotes),
            onChanged: settings.setSmartQuotes,
          ),
          SwitchListTile(
            value: settings.smartGuillemets,
            title: const Text(S.smartGuillemets),
            onChanged: settings.setSmartGuillemets,
          ),
          SwitchListTile(
            value: settings.smartHyphens,
            title: const Text(S.smartHyphens),
            onChanged: settings.setSmartHyphens,
          ),
          SwitchListTile(
            value: settings.smartEllipsis,
            title: const Text(S.smartEllipsis),
            onChanged: settings.setSmartEllipsis,
          ),
          SwitchListTile(
            value: settings.autoCorrection,
            title: const Text(S.setAutomaticCorrection),
            onChanged: settings.setAutoCorrection,
          ),
          SwitchListTile(
            value: settings.autoIndentation,
            title: const Text(S.applyAutomaticIndentation),
            onChanged: settings.setAutoIndentation,
          ),
          const Divider(),
          _header(theme, S.language),
          const ListTile(
            title: Text('English'),
            subtitle: Text(S.englishOnlyNote),
            leading: Icon(Icons.translate),
          ),
          const Divider(),
          _header(theme, S.helpCenter),
          ListTile(
            leading: const Icon(Icons.menu_book_outlined),
            title: const Text(S.quickGuide),
            onTap: () => _showHtmlAsset(context, 'assets/quickstart_en.html', S.quickGuide),
          ),
          ListTile(
            leading: const Icon(Icons.help_outline),
            title: const Text(S.faq),
            onTap: () => _showFaq(context),
          ),
          ListTile(
            leading: const Icon(Icons.privacy_tip_outlined),
            title: const Text(S.privacyPolicy),
            onTap: () => _showHtmlAsset(context, 'assets/privacy_policy.html', S.privacyPolicy),
          ),
          ListTile(
            leading: const Icon(Icons.description_outlined),
            title: const Text(S.termsAndConditions),
            onTap: () =>
                _showHtmlAsset(context, 'assets/terms_and_conditions.html', S.termsAndConditions),
          ),
          ListTile(
            leading: const Icon(Icons.mail_outline),
            title: const Text(S.emailSupport),
            subtitle: const Text('info@novelist.app'),
            onTap: () => launchUrl(Uri.parse('mailto:info@novelist.app')),
          ),
          ListTile(
            leading: const Icon(Icons.public),
            title: const Text(S.webVersion),
            onTap: () => launchUrl(Uri.parse('https://web.novelist.app/')),
          ),
          const Divider(),
          _header(theme, S.about),
          const ListTile(
            leading: Icon(Icons.info_outline),
            title: Text(S.version),
            subtitle: Text('0.1.0 — standalone rebuild'),
          ),
          ListTile(
            leading: const Icon(Icons.code),
            title: const Text(S.thirdPartyLibraries),
            onTap: () => showLicensePage(
              context: context,
              applicationName: 'Novelist',
              applicationVersion: '0.1.0',
            ),
          ),
        ],
      ),
    );
  }

  Widget _header(ThemeData theme, String title) => Padding(
        padding: const EdgeInsets.fromLTRB(16, 20, 16, 8),
        child: Text(
          title,
          style: theme.textTheme.labelLarge?.copyWith(color: theme.colorScheme.primary),
        ),
      );

  Future<void> _showHtmlAsset(BuildContext context, String asset, String title) async {
    final raw = await rootBundle.loadString(asset);
    final text = _stripHtml(raw);
    if (!context.mounted) return;
    await showDialog<void>(
      context: context,
      builder: (dialogContext) => AlertDialog(
        title: Text(title),
        content: SizedBox(
          width: 520,
          child: SingleChildScrollView(child: Text(text)),
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.of(dialogContext).pop(),
            child: const Text(S.close),
          ),
        ],
      ),
    );
  }

  Future<void> _showFaq(BuildContext context) async {
    final raw = await rootBundle.loadString('assets/faqs_en.json');
    final entries = jsonDecode(raw) as List;
    if (!context.mounted) return;
    await showModalBottomSheet<void>(
      context: context,
      isScrollControlled: true,
      builder: (sheetContext) => DraggableScrollableSheet(
        expand: false,
        initialChildSize: 0.85,
        builder: (context, scrollController) => ListView(
          controller: scrollController,
          padding: const EdgeInsets.all(16),
          children: [
            Text(S.faq, style: Theme.of(context).textTheme.titleLarge),
            const SizedBox(height: 12),
            for (final entry in entries.whereType<Map>())
              ExpansionTile(
                title: Text(entry['question']?.toString() ?? ''),
                childrenPadding: const EdgeInsets.fromLTRB(16, 0, 16, 16),
                children: [
                  Align(
                    alignment: Alignment.centerLeft,
                    child: Text(_stripHtml(entry['answer']?.toString() ?? '')),
                  ),
                ],
              ),
            if (entries.isEmpty) const Text(S.noQuestionsToDisplay),
          ],
        ),
      ),
    );
  }

  String _stripHtml(String html) {
    var text = html
        .replaceAll(RegExp(r'<(script|style)[^>]*>.*?</\1>', dotAll: true), ' ')
        .replaceAll(RegExp(r'<br\s*/?>', caseSensitive: false), '\n')
        .replaceAll(RegExp(r'</(p|div|li|h[1-6])>', caseSensitive: false), '\n')
        .replaceAll(RegExp(r'<[^>]+>'), ' ');
    const entities = {
      '&nbsp;': ' ',
      '&amp;': '&',
      '&lt;': '<',
      '&gt;': '>',
      '&quot;': '"',
      '&#39;': "'",
      '&rsquo;': '\u2019',
      '&lsquo;': '\u2018',
      '&ldquo;': '\u201C',
      '&rdquo;': '\u201D',
      '&mdash;': '\u2014',
      '&ndash;': '\u2013',
      '&hellip;': '\u2026',
      '&eacute;': '\u00E9',
    };
    entities.forEach((key, value) => text = text.replaceAll(key, value));
    return text.replaceAll(RegExp(r'[ \t]+'), ' ').replaceAll(RegExp(r'\n\s*\n+'), '\n\n').trim();
  }
}
