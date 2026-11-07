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

          final controller = openProject.controller;
          if (controller == null) return app;
          // Provided above the [Navigator] so pushed routes share the open project.
          return ChangeNotifierProvider<ProjectController>.value(
            value: controller,
            child: app,
          );
        },
      ),
    );
  }
}
