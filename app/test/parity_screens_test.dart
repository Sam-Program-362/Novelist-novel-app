import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:novelist/core/l10n/strings.dart';
import 'package:novelist/data/dao/books_dao.dart';
import 'package:novelist/data/dao/plot_dao.dart';
import 'package:novelist/data/dao/projects_dao.dart';
import 'package:novelist/data/dao/scenes_dao.dart';
import 'package:novelist/data/db/database.dart';
import 'package:novelist/models/entities.dart';
import 'package:novelist/state/app_settings.dart';
import 'package:novelist/state/library_controller.dart';
import 'package:novelist/state/project_controller.dart';
import 'package:novelist/ui/cloud/cloud_library_screen.dart';
import 'package:novelist/ui/help/help_center_screen.dart';
import 'package:novelist/ui/help/tutorial_screen.dart';
import 'package:novelist/ui/history/history_screen.dart';
import 'package:novelist/ui/progress/progress_screen.dart';
import 'package:novelist/ui/search/search_screen.dart';
import 'package:provider/provider.dart';
import 'package:shared_preferences/shared_preferences.dart';

/// The routes the reference registers outside the workspace tabs: help centre, tutorial, cloud
/// library, progress, history and search. Each test boots the screen inside the same provider tree
/// the real app builds, so a missing provider or a route that cannot build fails here.
void main() {
  TestWidgetsFlutterBinding.ensureInitialized();

  late AppDatabase db;
  late AppSettings settings;
  late ProjectController controller;
  late LibraryController library;
  late Project project;
  late int statusId;

  setUp(() async {
    SharedPreferences.setMockInitialValues({'intro_seen': true});
    settings = await AppSettings.load();
    db = AppDatabase.inMemory();
    project = ProjectsDao(db).create(title: 'Parity novel');
    statusId = PlotDao(db).addStatus(
      projectId: project.id,
      title: 'To do',
      colour: 0xFFD6E0D1,
    ).id;
    controller = ProjectController(db, project.id);
    library = LibraryController(db);
  });

  tearDown(() {
    controller.dispose();
    db.close();
  });

  Future<void> settle(WidgetTester tester) async {
    for (var i = 0; i < 12; i++) {
      await tester.pump(const Duration(milliseconds: 80));
    }
  }

  Widget host(Widget child) => MultiProvider(
        providers: [
          ChangeNotifierProvider<AppSettings>.value(value: settings),
          ChangeNotifierProvider<ProjectController>.value(value: controller),
          ChangeNotifierProvider<LibraryController>.value(value: library),
        ],
        child: MaterialApp(home: child),
      );

  testWidgets('help centre shows the FAQ, the guide and the legal documents', (tester) async {
    const content = HelpContent(
      faq: [
        FaqEntry(question: 'How do I back up?', answer: 'Use Backup in the drawer.'),
      ],
      quickGuide: 'Quick guide body',
      privacy: 'Privacy body',
      terms: 'Terms body',
    );

    await tester.pumpWidget(host(const HelpCenterScreen(content: content, version: '2026.1.19')));
    await settle(tester);

    expect(find.text(S.faq), findsOneWidget);
    expect(find.text('How do I back up?'), findsOneWidget);

    await tester.tap(find.text('How do I back up?'));
    await settle(tester);
    expect(find.text('Use Backup in the drawer.'), findsOneWidget);

    await tester.tap(find.text(S.privacyPolicy));
    await settle(tester);
    expect(find.text('Privacy body'), findsOneWidget);

    await tester.tap(find.text(S.termsAndConditions));
    await settle(tester);
    expect(find.text('Terms body'), findsOneWidget);
  });

  testWidgets('tutorial walks to the end and remembers that it was seen', (tester) async {
    await tester.pumpWidget(host(const TutorialScreen()));
    await settle(tester);

    expect(find.text(kTutorialSteps.first.title), findsOneWidget);
    expect(find.text(S.endTutorial), findsOneWidget);

    for (var i = 0; i < kTutorialSteps.length - 1; i++) {
      await tester.tap(find.text(S.next));
      await settle(tester);
    }
    expect(find.text(kTutorialSteps.last.title), findsOneWidget);
    expect(settings.tutorialSeen, isFalse);

    await tester.tap(find.text(S.gotIt));
    await settle(tester);
    expect(settings.tutorialSeen, isTrue);
  });

  testWidgets('cloud library reports the disconnected state and lists local projects',
      (tester) async {
    await tester.pumpWidget(host(const CloudLibraryScreen()));
    await settle(tester);

    expect(find.text(S.cloudDisconnected), findsOneWidget);
    expect(find.text('Parity novel'), findsOneWidget);

    await tester.tap(find.text(S.sendToCloud));
    await settle(tester);
    expect(find.text(S.cloudNotConnected), findsWidgets);
  });

  testWidgets('progress reports today against the daily goal and the streak', (tester) async {
    final book = BooksDao(db).create(projectId: project.id, title: 'Book 1');
    BooksDao(db).setProgress(book.id, DateTime.now(), 320);
    controller.reload();

    await tester.pumpWidget(host(const ProgressScreen()));
    await settle(tester);

    expect(find.textContaining(S.wordGoalToday), findsOneWidget);
    expect(find.textContaining('320'), findsWidgets);
    expect(find.text(S.currentStreak), findsOneWidget);
    expect(find.text('1'), findsWidgets);
  });

  testWidgets('history restores a previous version of a scene', (tester) async {
    final scene = ScenesDao(db).create(
      projectId: project.id,
      title: 'Opening',
      statusId: statusId,
      text: 'Current version',
    );
    ScenesDao(db).pushHistory(scene.id, 'Older version');
    controller.reload();

    await tester.pumpWidget(host(HistoryScreen(
      target: HistoryTarget.scene,
      id: scene.id,
      title: S.history,
    )));
    await settle(tester);

    expect(find.textContaining('Older version'), findsOneWidget);

    await tester.tap(find.text(S.restore));
    await settle(tester);
    await tester.tap(find.text(S.restore).last);
    await settle(tester);

    expect(ScenesDao(db).byId(scene.id)!.text, 'Older version');
  });

  testWidgets('history shows the item versions and restores one', (tester) async {
    final category = PlotDao(db).createCategory(projectId: project.id, title: 'Characters');
    final item = PlotDao(db).createItem(
      categoryId: category.id,
      title: 'Keeper',
      statusId: statusId,
      text: 'Current item text',
    );
    PlotDao(db).pushHistory(item.id, 'Previous item text');
    controller.reload();

    await tester.pumpWidget(host(HistoryScreen(
      target: HistoryTarget.item,
      id: item.id,
    )));
    await settle(tester);

    expect(find.textContaining('Previous item text'), findsOneWidget);
  });

  testWidgets('search finds scenes and items and reports empty results', (tester) async {
    ScenesDao(db).create(
      projectId: project.id,
      title: 'Lighthouse scene',
      statusId: statusId,
      text: 'The keeper climbs the stairs.',
    );
    final category = PlotDao(db).createCategory(projectId: project.id, title: 'Locations');
    PlotDao(db).createItem(
      categoryId: category.id,
      title: 'Lighthouse',
      statusId: statusId,
      synopsis: 'Where the novel ends.',
    );
    controller.reload();

    await tester.pumpWidget(host(const SearchScreen(initialQuery: 'lighthouse')));
    await settle(tester);

    expect(find.text('Lighthouse scene'), findsOneWidget);
    expect(find.text('Lighthouse'), findsOneWidget);

    await tester.enterText(find.byType(TextField), 'nothing-matches-this');
    await settle(tester);
    expect(find.text(S.noSearchResults), findsOneWidget);
  });
}
