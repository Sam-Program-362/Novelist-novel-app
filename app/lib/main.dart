import 'dart:io';

import 'package:flutter/material.dart';
import 'package:path_provider/path_provider.dart';

import 'app.dart';
import 'data/db/database.dart';
import 'state/app_settings.dart';

Future<void> main() async {
  WidgetsFlutterBinding.ensureInitialized();

  final directory = await getApplicationDocumentsDirectory();
  final databaseFile = File('${directory.path}/novelist.db');
  final database = AppDatabase.open(databaseFile.path);
  final settings = await AppSettings.load();

  runApp(NovelistApp(database: database, settings: settings));
}
