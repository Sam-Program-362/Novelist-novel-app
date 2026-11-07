import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../../core/l10n/strings.dart';
import '../../state/app_settings.dart';

/// First launch (`/intro` in the reference application).
///
/// Three pages that explain the pitch of the app before the library is shown for the first time.
/// The reference accompanies this with ten large illustrations (`balloon`, `boat`, `bulb`, `cactus`,
/// `island`, `lighthouse`, `mountain`, `planet`, `rocket`, `telescope`, ~1 MB each); they are not
/// bundled in this build to keep the repository small, so the logo and the module icons carry the
/// same three pages. See `docs/UI_SPEC.md`.
class IntroScreen extends StatefulWidget {
  /// Called when the intro is finished instead of popping (used when shown as the app's home).
  final VoidCallback? onDone;

  const IntroScreen({super.key, this.onDone});

  @override
  State<IntroScreen> createState() => _IntroScreenState();
}

class _IntroScreenState extends State<IntroScreen> {
  final PageController _controller = PageController();
  int _index = 0;

  static const _pages = [
    (
      icon: Icons.auto_stories_outlined,
      title: S.introPitch1Title,
      body: S.introPitch1Body,
    ),
    (
      icon: Icons.account_tree_outlined,
      title: S.introPitch2Title,
      body: S.introPitch2Body,
    ),
    (
      icon: Icons.local_fire_department_outlined,
      title: S.introPitch3Title,
      body: S.introPitch3Body,
    ),
  ];

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }

  Future<void> _finish() async {
    await context.read<AppSettings>().setIntroSeen(true);
    if (!mounted) return;
    if (widget.onDone != null) {
      widget.onDone!();
    } else if (Navigator.of(context).canPop()) {
      // As the app's home there is nothing to pop; setting `introSeen` swaps the home instead.
      Navigator.of(context).pop();
    }
  }

  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);
    final isLast = _index == _pages.length - 1;
    return Scaffold(
      body: SafeArea(
        child: Column(
          children: [
            const Spacer(),
            SizedBox(
              height: 64,
              child: Image.asset(
                theme.brightness == Brightness.dark
                    ? 'assets/logo_dark.png'
                    : 'assets/logo_light.png',
                fit: BoxFit.contain,
                errorBuilder: (_, __, ___) =>
                    Icon(Icons.menu_book, size: 48, color: theme.colorScheme.primary),
              ),
            ),
            const Spacer(),
            Expanded(
              flex: 3,
              child: PageView.builder(
                controller: _controller,
                itemCount: _pages.length,
                onPageChanged: (value) => setState(() => _index = value),
                itemBuilder: (context, index) {
                  final page = _pages[index];
                  return Padding(
                    padding: const EdgeInsets.symmetric(horizontal: 32),
                    child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Icon(page.icon, size: 48, color: theme.colorScheme.primary),
                        const SizedBox(height: 20),
                        Text(page.title, style: theme.textTheme.headlineSmall, textAlign: TextAlign.center),
                        const SizedBox(height: 10),
                        Text(
                          page.body,
                          style: theme.textTheme.bodyLarge,
                          textAlign: TextAlign.center,
                        ),
                      ],
                    ),
                  );
                },
              ),
            ),
            Padding(
              padding: const EdgeInsets.fromLTRB(24, 8, 24, 28),
              child: Row(
                children: [
                  TextButton(onPressed: _finish, child: const Text(S.skip)),
                  const Spacer(),
                  FilledButton(
                    onPressed: isLast
                        ? _finish
                        : () => _controller.nextPage(
                              duration: const Duration(milliseconds: 220),
                              curve: Curves.easeOut,
                            ),
                    child: Text(isLast ? S.start : S.next),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
