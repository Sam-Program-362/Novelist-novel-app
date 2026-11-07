import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import 'data/db/database.dart';
import 'state/app_settings.dart';
import 'state/library_controller.dart';
import 'state/open_project.dart';
import 'state/project_controller.dart';
import 'ui/library/library_screen.dart';

class NovelistApp extends StatelessWidget {
  final AppDatabase database;
  final AppSettings settings;

  const NovelistApp({super.key, required this.database, required this.settings});

  @override
  Widget build(BuildContext context) {
    return MultiProvider(
      providers: [
        Provider<AppDatabase>.value(value: database),
        ChangeNotifierProvider<AppSettings>.value(value: settings),
        ChangeNotifierProvider<LibraryController>(create: (_) => LibraryController(database)),
        ChangeNotifierProvider<OpenProject>(create: (_) => OpenProject(database)),
      ],
      child: Consumer2<AppSettings, OpenProject>(
        builder: (context, appSettings, openProject, _) {
          final app = MaterialApp(
            title: 'Novelist',
            debugShowCheckedModeBanner: false,
            themeMode: appSettings.themeMode,
            theme: appSettings.themeFor(Brightness.light),
            darkTheme: appSettings.themeFor(Brightness.dark),
            home: const LibraryScreen(),
          );

          // Always provided, above the [Navigator], so every pushed route can reach the open
          // project. Adding or removing this provider around `MaterialApp` would change the tree
          // shape and rebuild the Navigator, throwing away the route stack mid-navigation.
          return ChangeNotifierProvider<ProjectController>.value(
            value: openProject.controller,
            child: app,
          );
        },
      ),
    );
  }
}
