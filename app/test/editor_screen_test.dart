import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:novelist/core/l10n/strings.dart';
import 'package:novelist/core/utils/text_doc.dart';
import 'package:novelist/data/dao/plot_dao.dart';
import 'package:novelist/data/dao/projects_dao.dart';
import 'package:novelist/data/dao/scenes_dao.dart';
import 'package:novelist/data/db/database.dart';
import 'package:novelist/models/entities.dart';
import 'package:novelist/state/app_settings.dart';
import 'package:novelist/state/project_controller.dart';
import 'package:novelist/ui/write/scene_editor_screen.dart';
import 'package:provider/provider.dart';
import 'package:shared_preferences/shared_preferences.dart';

/// Drives the scene editor as a user would: type, wait for the debounce, and check what reached the
/// database. This is the only place the rich-text pipeline is exercised end to end.
void main() {
  TestWidgetsFlutterBinding.ensureInitialized();

  late AppDatabase db;
  late AppSettings settings;
  late ProjectController controller;
  late Scene scene;
  late PlotItem hero;

  setUp(() async {
    SharedPreferences.setMockInitialValues({});
    settings = await AppSettings.load();
    db = AppDatabase.inMemory();

    final project = ProjectsDao(db).create(title: 'Editor test');
    final plot = PlotDao(db);
    final status = plot.addStatus(
      projectId: project.id,
      title: 'First draft',
      colour: 0xFF6A8F9E,
    );
    final category = plot.createCategory(
      projectId: project.id,
      title: 'Characters',
      colour: 0xFFB5A19C,
    );
    hero = plot.createItem(categoryId: category.id, title: 'Tom', statusId: status.id);
    scene = ScenesDao(db).create(
      projectId: project.id,
      title: 'Opening',
      statusId: status.id,
      text: TextDoc([
        const TextBlock(text: 'The first paragraph.'),
        const TextBlock(text: 'The second paragraph.'),
      ]).toJsonString(),
    );
    controller = ProjectController(db, project.id);
  });

  tearDown(() => db.close());

  Future<void> pumpEditor(WidgetTester tester) async {
    await tester.pumpWidget(
      MultiProvider(
        providers: [
          ChangeNotifierProvider<ProjectController>.value(value: controller),
          ChangeNotifierProvider<AppSettings>.value(value: settings),
        ],
        child: MaterialApp(home: SceneEditorScreen(sceneId: scene.id)),
      ),
    );
    await tester.pump();
  }

  testWidgets('loads the stored paragraphs into the editor', (tester) async {
    await pumpEditor(tester);

    expect(find.text('Opening'), findsWidgets);
    expect(find.text('The first paragraph.'), findsOneWidget);
    expect(find.text('The second paragraph.'), findsOneWidget);

    // Title, synopsis and one field per paragraph.
    expect(find.byType(TextField), findsNWidgets(4));
  });

  testWidgets('typing is persisted with smart typography and keeps mentions', (tester) async {
    await pumpEditor(tester);

    final paragraphs = find.byType(TextField);
    await tester.enterText(paragraphs.at(2), 'Then @Tom said "hello"...');
    await tester.pump(const Duration(seconds: 2));

    final saved = ScenesDao(db).byId(scene.id)!;
    final doc = TextDoc.fromJsonString(saved.text);
    final block = doc.blocks.first;

    // The paragraph was corrected and the @token became a mention pointing at the alias code.
    expect(block.text, contains('\u201Chello\u201D\u2026'));
    expect(block.text, contains('\uFFFC'));
    expect(block.embeds.single.value, 'Tom');
    expect(doc.blocks, hasLength(2));

    // The other paragraph and the scene title are untouched.
    expect(doc.blocks.last.text, 'The second paragraph.');
    expect(saved.title, 'Opening');
  });

  testWidgets('adding a paragraph and a scene title round-trips through the database', (tester) async {
    await pumpEditor(tester);

    await tester.enterText(find.byType(TextField).first, 'A better title');
    await tester.pump(const Duration(seconds: 2));
    expect(ScenesDao(db).byId(scene.id)!.title, 'A better title');

    await tester.tap(find.byTooltip(S.alignCenter));
    await tester.pump(const Duration(seconds: 2));
    final aligned = TextDoc.fromJsonString(ScenesDao(db).byId(scene.id)!.text);
    expect(aligned.blocks.first.align, 'center');
  });

  testWidgets('the mention picker inserts the alias of a plot item', (tester) async {
    await pumpEditor(tester);

    await tester.tap(find.byTooltip(S.insertMention));
    await tester.pump();
    await tester.pump(const Duration(milliseconds: 400));

    expect(find.text('Tom'), findsWidgets);
    await tester.tap(find.text('Tom').last);
    await tester.pump(const Duration(milliseconds: 400));
    await tester.pump(const Duration(seconds: 2));

    final saved = TextDoc.fromJsonString(ScenesDao(db).byId(scene.id)!.text);
    final embed = saved.blocks
        .expand((block) => block.embeds)
        .where((embed) => embed.code == hero.code)
        .toList();
    expect(embed, isNotEmpty, reason: 'the inserted mention should point at the item code');
  });
}
