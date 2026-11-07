import 'package:flutter/material.dart';
import 'package:flutter/services.dart' show rootBundle;
import 'package:flutter_test/flutter_test.dart';
import 'package:novelist/app.dart';
import 'package:novelist/core/l10n/strings.dart';
import 'package:novelist/data/dao/plot_dao.dart';
import 'package:novelist/data/dao/projects_dao.dart';
import 'package:novelist/data/db/database.dart';
import 'package:novelist/data/repositories/project_repository.dart';
import 'package:novelist/data/templates/template_service.dart';
import 'package:novelist/models/entities.dart';
import 'package:novelist/state/app_settings.dart';
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

  Future<Project> seedProject([String title = 'Seeded novel']) async {
    final template = TemplateService.parse(await rootBundle.loadString('assets/template_standard_novel.json'));
    return ProjectRepository(db).createFromTemplate(title: title, template: template);
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
    final project = await seedProject();
    await tester.pumpWidget(NovelistApp(database: db, settings: settings));
    await tester.pumpAndSettle();

    expect(find.text('Seeded novel'), findsOneWidget);

    await tester.tap(find.text('Seeded novel'));
    await tester.pumpAndSettle();

    // Project shell: module title in the app bar and the book created by the template.
    expect(find.text(S.books), findsWidgets);
    expect(find.text('Book 1'), findsWidgets);
    expect(project.id, isPositive);

    // Back to the library without losing the project.
    await tester.pageBack();
    await tester.pumpAndSettle();
    expect(find.text(S.library), findsOneWidget);
    expect(find.text('Seeded novel'), findsOneWidget);
  });

  testWidgets('settings screen exposes the typography toggles', (tester) async {
    await tester.pumpWidget(NovelistApp(database: db, settings: settings));
    await tester.pumpAndSettle();

    await tester.tap(find.byIcon(Icons.more_vert));
    await tester.pumpAndSettle();
    await tester.tap(find.text(S.settings).last);
    await tester.pumpAndSettle();

    expect(find.text(S.smartQuotes), findsOneWidget);
    expect(find.text(S.smartEllipsis), findsOneWidget);

    await tester.tap(find.text(S.smartEllipsis));
    await tester.pumpAndSettle();
    expect(settings.smartEllipsis, isFalse);
  });
}
