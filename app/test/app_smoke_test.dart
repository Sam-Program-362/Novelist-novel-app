import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:novelist/app.dart';
import 'package:novelist/core/l10n/strings.dart';
import 'package:novelist/data/dao/plot_dao.dart';
import 'package:novelist/data/dao/projects_dao.dart';
import 'package:novelist/data/db/database.dart';
import 'package:novelist/state/app_settings.dart';
import 'package:shared_preferences/shared_preferences.dart';

/// Boots the real application widget tree against an in-memory database.
///
/// This is the only test that exercises provider wiring, theming and navigation; the other suites are
/// database-level. It catches the class of bug unit tests cannot see (a provider registered below the
/// navigator, a missing route, a form that cannot be submitted).
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

  testWidgets('starts on the library with an empty state', (tester) async {
    await tester.pumpWidget(NovelistApp(database: db, settings: settings));
    await tester.pumpAndSettle();

    expect(find.text(S.library), findsOneWidget);
    expect(find.text(S.noBooksToDisplay), findsOneWidget);
    expect(find.text(S.createFirstProject), findsOneWidget);
    expect(find.byTooltip(S.addProject), findsOneWidget);
  });

  testWidgets('creates a project from the standard template and opens it', (tester) async {
    await tester.pumpWidget(NovelistApp(database: db, settings: settings));
    await tester.pumpAndSettle();

    await tester.tap(find.byTooltip(S.addProject));
    await tester.pumpAndSettle();

    await tester.enterText(find.byType(TextField).first, 'Smoke test novel');
    await tester.pumpAndSettle();
    await tester.tap(find.widgetWithText(FilledButton, S.add));
    await tester.pumpAndSettle();

    // The freshly created project is opened in the workspace shell.
    expect(find.text('Smoke test novel'), findsWidgets);
    expect(find.text(S.books), findsWidgets);

    final projects = ProjectsDao(db).list();
    expect(projects, hasLength(1));
    expect(projects.first.title, 'Smoke test novel');

    // The standard template created the six categories and one book.
    final plot = PlotDao(db);
    expect(plot.categories(projects.first.id), hasLength(6));
    expect(db.count('book', 'book_project_id = ?', [projects.first.id]), 1);
  });

  testWidgets('settings screen exposes the typography toggles', (tester) async {
    await tester.pumpWidget(NovelistApp(database: db, settings: settings));
    await tester.pumpAndSettle();

    final icon = find.byIcon(Icons.settings_outlined);
    expect(icon, findsOneWidget);
    await tester.tap(icon);
    await tester.pumpAndSettle();

    expect(find.text(S.settings), findsWidgets);
    expect(find.text(S.smartQuotes), findsOneWidget);
    expect(find.text(S.smartEllipsis), findsOneWidget);

    // Flipping a switch persists through the controller.
    await tester.tap(find.text(S.smartEllipsis));
    await tester.pumpAndSettle();
    expect(settings.smartEllipsis, isFalse);
  });
}
