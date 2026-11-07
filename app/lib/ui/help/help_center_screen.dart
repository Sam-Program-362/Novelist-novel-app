import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:url_launcher/url_launcher.dart';

import '../../core/l10n/strings.dart';
import '../../core/utils/html_text.dart';
import '../widgets/common.dart';

/// One entry of the bundled FAQ (`assets/faqs_en.json`).
class FaqEntry {
  final String question;
  final String answer;

  const FaqEntry({required this.question, required this.answer});
}

/// Everything the help centre shows, resolved once from the bundled assets.
///
/// The documents are part of the shipped bundle in the reference application as well, which is why
/// the help centre works offline. Tests inject a [HelpContent] directly: `rootBundle` never completes
/// inside a widget test.
class HelpContent {
  final List<FaqEntry> faq;
  final String quickGuide;
  final String privacy;
  final String terms;
  final String version;

  const HelpContent({
    required this.faq,
    required this.quickGuide,
    required this.privacy,
    required this.terms,
    this.version = '',
  });

  static const empty = HelpContent(faq: [], quickGuide: '', privacy: '', terms: '');

  static Future<HelpContent> load() async {
    final bundle = rootBundle;
    final faq = jsonDecode(await bundle.loadString('assets/faqs_en.json')) as List<dynamic>;
    final entries = <FaqEntry>[
      for (final raw in faq)
        if (raw is Map)
          FaqEntry(
            question: (raw['question'] as String? ?? '').trim(),
            answer: htmlToText(raw['answer'] as String? ?? ''),
          ),
    ];
    return HelpContent(
      faq: entries,
      quickGuide: htmlToText(await bundle.loadString('assets/quickstart_en.html')),
      privacy: htmlToText(await bundle.loadString('assets/privacy_policy.html')),
      terms: htmlToText(await bundle.loadString('assets/terms_and_conditions.html')),
    );
  }
}

/// Help centre (`/help_center` in the reference application).
///
/// Four tabs: the FAQ, the quick-start guide, the privacy policy and the terms and conditions, all
/// from the same files the reference ships.
class HelpCenterScreen extends StatefulWidget {
  /// Injected content; when null the bundled assets are read on first frame.
  final HelpContent? content;
  final String version;

  const HelpCenterScreen({super.key, this.content, this.version = ''});

  @override
  State<HelpCenterScreen> createState() => _HelpCenterScreenState();
}

class _HelpCenterScreenState extends State<HelpCenterScreen> {
  HelpContent? _content;
  Object? _error;

  @override
  void initState() {
    super.initState();
    _content = widget.content;
    if (_content == null) {
      HelpContent.load().then((value) {
        if (!mounted) return;
        setState(() => _content = value);
      }).catchError((Object error) {
        if (!mounted) return;
        setState(() => _error = error);
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    final content = _content;
    if (content == null) {
      return Scaffold(
        appBar: AppBar(title: const Text(S.helpCenter)),
        body: _error == null
            ? const Center(child: CircularProgressIndicator())
            : EmptyState(
                icon: Icons.error_outline,
                title: S.anErrorOccurred,
                message: '$_error',
              ),
      );
    }
    return DefaultTabController(
      length: 4,
      child: Scaffold(
        appBar: AppBar(
          title: const Text(S.helpCenter),
          bottom: const TabBar(
            isScrollable: true,
            tabAlignment: TabAlignment.start,
            tabs: [
              Tab(text: S.faq),
              Tab(text: S.quickGuide),
              Tab(text: S.privacyPolicy),
              Tab(text: S.termsAndConditions),
            ],
          ),
        ),
        body: TabBarView(
          children: [
            _FaqTab(content: content, version: widget.version),
            _DocumentTab(text: content.quickGuide),
            _DocumentTab(text: content.privacy),
            _DocumentTab(text: content.terms),
          ],
        ),
      ),
    );
  }
}

class _FaqTab extends StatelessWidget {
  final HelpContent content;
  final String version;

  const _FaqTab({required this.content, required this.version});

  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);
    return ListView(
      padding: const EdgeInsets.symmetric(vertical: 8),
      children: [
        if (content.faq.isEmpty)
          const EmptyState(icon: Icons.help_outline, title: S.noQuestionsToDisplay)
        else
          for (final entry in content.faq)
            ExpansionTile(
              title: Text(entry.question, style: theme.textTheme.bodyLarge),
              childrenPadding: const EdgeInsets.fromLTRB(16, 0, 16, 16),
              expandedCrossAxisAlignment: CrossAxisAlignment.start,
              children: [SelectableText(entry.answer, style: theme.textTheme.bodyMedium)],
            ),
        const Divider(),
        ListTile(
          leading: const Icon(Icons.email_outlined),
          title: const Text(S.emailSupport),
          subtitle: const Text('info@novelist.app'),
          trailing: const Icon(Icons.open_in_new, size: 18),
          onTap: () async {
            final uri = Uri(scheme: 'mailto', path: 'info@novelist.app');
            try {
              final launched = await launchUrl(uri);
              if (!launched) throw StateError(S.noAppsCanPerformThisAction);
            } catch (_) {
              if (!context.mounted) return;
              ScaffoldMessenger.of(context)
                  .showSnackBar(const SnackBar(content: Text(S.noAppsCanPerformThisAction)));
            }
          },
        ),
        if (version.isNotEmpty)
          ListTile(
            leading: const Icon(Icons.info_outline),
            title: const Text(S.version),
            subtitle: Text(version),
          ),
      ],
    );
  }
}

class _DocumentTab extends StatelessWidget {
  final String text;

  const _DocumentTab({required this.text});

  @override
  Widget build(BuildContext context) {
    if (text.isEmpty) {
      return const EmptyState(icon: Icons.description_outlined, title: S.anErrorOccurred);
    }
    return ListView(
      padding: const EdgeInsets.fromLTRB(20, 16, 20, 32),
      children: [SelectableText(text, style: Theme.of(context).textTheme.bodyMedium)],
    );
  }
}
