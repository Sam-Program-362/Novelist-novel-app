import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:novelist/app.dart';
import 'package:novelist/core/l10n/strings.dart';
import 'package:novelist/data/dao/books_dao.dart';
import 'package:novelist/data/dao/plot_dao.dart';
import 'package:novelist/data/dao/projects_dao.dart';
import 'package:novelist/data/db/database.dart';
import 'package:novelist/models/entities.dart';
import 'package:novelist/state/app_settings.dart';
import 'package:novelist/ui/shell/project_screen.dart';
import 'package:shared_preferences/shared_preferences.dart';

/// Boots the real application widget tree against an in-memory database.
///
/// These tests exercise provider wiring, theming and navigation; the other suites are database-level
/// and cannot see a provider registered below the navigator or a route that fails to build.
void main() {
  TestWidgetsFlutterBinding.ensureInitialized();

  late AppDatabase db;
  late AppSettings settings;

  setUp(() async {
    SharedPreferences.setMockInitialValues({});
    settings = await AppSettings.load();
    db = AppDatabase.inMemory();
  });

  tearDown(() => db.close());

  /// Pumps a handful of frames instead of `pumpAndSettle`: screens with a progress indicator never
  /// reach a frame-free state, and the point of these tests is what is on screen, not the animation.
  Future<void> settle(WidgetTester tester) async {
    for (var i = 0; i < 12; i++) {
      await tester.pump(const Duration(milliseconds: 80));
    }
  }

  /// Seeds a minimal project synchronously so navigation can be tested without touching assets.
  Project seedProject([String title = 'Seeded novel']) {
    final project = ProjectsDao(db).create(title: title);
    final status = PlotDao(db).addStatus(
      projectId: project.id,
      title: 'To do',
      colour: 0xFFD6E0D1,
    );
    BooksDao(db).create(projectId: project.id, title: 'Book 1');
    expect(status.id, isPositive);
    return project;
  }

  testWidgets('starts on the library with an empty state', (tester) async {
    await tester.pumpWidget(NovelistApp(database: db, settings: settings));
    await tester.pumpAndSettle();

    expect(find.text(S.library), findsOneWidget);
    expect(find.text(S.noBooksToDisplay), findsOneWidget);
    expect(find.text(S.createFirstProject), findsOneWidget);
    expect(find.byTooltip(S.addProject), findsOneWidget);
  });

  testWidgets('creates a project from the standard template', (tester) async {
    await tester.pumpWidget(NovelistApp(database: db, settings: settings));
    await tester.pumpAndSettle();

    await tester.tap(find.byTooltip(S.addProject));
    await tester.pumpAndSettle();

    await tester.enterText(find.byType(TextField).first, 'Smoke test novel');
    await tester.pumpAndSettle();
    await tester.tap(find.widgetWithText(FilledButton, S.add));

    // The dialog resolves after the template is read from the asset bundle.
    for (var i = 0; i < 20; i++) {
      await tester.pump(const Duration(milliseconds: 100));
    }
    await tester.pumpAndSettle();

    final projects = ProjectsDao(db).list();
    expect(projects, hasLength(1), reason: 'the dialog should have created the project');
    expect(projects.first.title, 'Smoke test novel');

    final plot = PlotDao(db);
    expect(plot.categories(projects.first.id), hasLength(6));
    expect(db.count('book', 'book_project_id = ?', [projects.first.id]), 1);
    expect(plot.statuses(projects.first.id), hasLength(5));
  });

  testWidgets('opens a project in the workspace shell', (tester) async {
    seedProject();
    await tester.pumpWidget(NovelistApp(database: db, settings: settings));
    await settle(tester);

    expect(find.text('Seeded novel'), findsOneWidget);

    await tester.tap(find.text('Seeded novel'));
    await settle(tester);

    final visibleTexts = tester
        .widgetList<Text>(find.byType(Text))
        .map((text) => text.data)
        .whereType<String>()
        .toList(growable: false);
    expect(
      find.byType(ProjectScreen),
      findsOneWidget,
      reason: 'the project route should be on screen; visible texts: $visibleTexts',
    );

    // Project shell: module title in the app bar and the book that belongs to the project.
    expect(find.text(S.books), findsWidgets);
    expect(find.text('Book 1'), findsWidgets);

    // Back to the library without losing the project.
    await tester.pageBack();
    await settle(tester);
    expect(find.text(S.library), findsOneWidget);
    expect(find.text('Seeded novel'), findsOneWidget);
  });

  testWidgets('settings screen exposes the typography toggles', (tester) async {
    await tester.pumpWidget(NovelistApp(database: db, settings: settings));
    await tester.pumpAndSettle();

    await tester.tap(find.byIcon(Icons.more_vert));
    await settle(tester);
    await tester.tap(find.text(S.settings).last);
    await settle(tester);

    // The typing section is below the fold, so scroll it into view like a user would.
    await tester.scrollUntilVisible(
      find.text(S.smartEllipsis),
      200,
      scrollable: find.byType(Scrollable).first,
    );
    expect(find.text(S.smartQuotes), findsOneWidget);
    expect(find.text(S.smartEllipsis), findsOneWidget);

    await tester.tap(find.text(S.smartEllipsis));
    await settle(tester);
    expect(settings.smartEllipsis, isFalse);
  });
}
