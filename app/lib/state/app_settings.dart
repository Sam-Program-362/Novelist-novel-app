import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

import '../core/theme/design.dart';

/// Application-level preferences (theme, editor typography, smart-typography behaviour).
///
/// The reference stores these in DataStore / shared preferences rather than in the project database,
/// which is why they are device-wide and survive project deletion.
class AppSettings extends ChangeNotifier {
  static const _kThemeMode = 'theme_mode';
  static const _kSeed = 'seed_colour';
  static const _kFont = 'editor_font';
  static const _kFontSize = 'editor_font_size';
  static const _kLineHeight = 'editor_line_height';
  static const _kSmartQuotes = 'smart_quotes';
  static const _kSmartGuillemets = 'smart_guillemets';
  static const _kSmartHyphens = 'smart_hyphens';
  static const _kSmartEllipsis = 'smart_ellipsis';
  static const _kAutoCorrection = 'auto_correction';
  static const _kAutoIndentation = 'auto_indentation';
  static const _kGridView = 'library_grid';
  static const _kEasyMode = 'easy_mode';
  static const _kIntroSeen = 'intro_seen';
  static const _kTutorialSeen = 'tutorial_seen';
  static const _kDailyGoal = 'daily_word_goal';

  final SharedPreferences _prefs;

  ThemeMode _themeMode;
  int _seed;
  String _editorFont;
  double _editorFontSize;
  double _editorLineHeight;
  bool _smartQuotes;
  bool _smartGuillemets;
  bool _smartHyphens;
  bool _smartEllipsis;
  bool _autoCorrection;
  bool _autoIndentation;
  bool _libraryGridView;
  bool _easyMode;
  bool _introSeen;
  bool _tutorialSeen;
  int _dailyWordGoal;

  AppSettings._(
    this._prefs, {
    required ThemeMode themeMode,
    required int seed,
    required String editorFont,
    required double editorFontSize,
    required double editorLineHeight,
    required bool smartQuotes,
    required bool smartGuillemets,
    required bool smartHyphens,
    required bool smartEllipsis,
    required bool autoCorrection,
    required bool autoIndentation,
    required bool libraryGridView,
    required bool easyMode,
    required bool introSeen,
    required bool tutorialSeen,
    required int dailyWordGoal,
  })  : _themeMode = themeMode,
        _seed = seed,
        _editorFont = editorFont,
        _editorFontSize = editorFontSize,
        _editorLineHeight = editorLineHeight,
        _smartQuotes = smartQuotes,
        _smartGuillemets = smartGuillemets,
        _smartHyphens = smartHyphens,
        _smartEllipsis = smartEllipsis,
        _autoCorrection = autoCorrection,
        _autoIndentation = autoIndentation,
        _libraryGridView = libraryGridView,
        _easyMode = easyMode,
        _introSeen = introSeen,
        _tutorialSeen = tutorialSeen,
        _dailyWordGoal = dailyWordGoal;

  static Future<AppSettings> load() async {
    final prefs = await SharedPreferences.getInstance();
    return AppSettings._(
      prefs,
      themeMode: ThemeMode.values[
          (prefs.getInt(_kThemeMode) ?? ThemeMode.system.index).clamp(0, ThemeMode.values.length - 1)],
      seed: prefs.getInt(_kSeed) ?? kDefaultSeed,
      editorFont: prefs.getString(_kFont) ?? '',
      editorFontSize: prefs.getDouble(_kFontSize) ?? 17,
      editorLineHeight: prefs.getDouble(_kLineHeight) ?? 1.6,
      smartQuotes: prefs.getBool(_kSmartQuotes) ?? true,
      smartGuillemets: prefs.getBool(_kSmartGuillemets) ?? false,
      smartHyphens: prefs.getBool(_kSmartHyphens) ?? true,
      smartEllipsis: prefs.getBool(_kSmartEllipsis) ?? true,
      autoCorrection: prefs.getBool(_kAutoCorrection) ?? true,
      autoIndentation: prefs.getBool(_kAutoIndentation) ?? true,
      libraryGridView: prefs.getBool(_kGridView) ?? true,
      easyMode: prefs.getBool(_kEasyMode) ?? false,
      introSeen: prefs.getBool(_kIntroSeen) ?? false,
      tutorialSeen: prefs.getBool(_kTutorialSeen) ?? false,
      dailyWordGoal: prefs.getInt(_kDailyGoal) ?? 500,
    );
  }

  ThemeMode get themeMode => _themeMode;
  int get seed => _seed;
  String get editorFont => _editorFont;
  double get editorFontSize => _editorFontSize;
  double get editorLineHeight => _editorLineHeight;
  bool get smartQuotes => _smartQuotes;
  bool get smartGuillemets => _smartGuillemets;
  bool get smartHyphens => _smartHyphens;
  bool get smartEllipsis => _smartEllipsis;
  bool get autoCorrection => _autoCorrection;
  bool get autoIndentation => _autoIndentation;
  bool get libraryGridView => _libraryGridView;

  /// Simplified interface: only the modules a first-time writer needs (see `EasyModeScreen`).
  bool get easyMode => _easyMode;

  /// The intro pages are shown once, before the library has any project.
  bool get introSeen => _introSeen;

  /// The guided tutorial can be re-opened from the drawer at any time.
  bool get tutorialSeen => _tutorialSeen;

  int get dailyWordGoal => _dailyWordGoal;

  ThemeData themeFor(Brightness brightness) => AppTheme.build(
        brightness: brightness,
        seed: _seed,
        fontFamily: _editorFont.isEmpty ? null : _editorFont,
      );

  Future<void> setThemeMode(ThemeMode mode) async {
    _themeMode = mode;
    await _prefs.setInt(_kThemeMode, mode.index);
    notifyListeners();
  }

  Future<void> setSeed(int seed) async {
    _seed = seed;
    await _prefs.setInt(_kSeed, seed);
    notifyListeners();
  }

  Future<void> setEditorFont(String font) async {
    _editorFont = font;
    await _prefs.setString(_kFont, font);
    notifyListeners();
  }

  Future<void> setEditorFontSize(double size) async {
    _editorFontSize = size;
    await _prefs.setDouble(_kFontSize, size);
    notifyListeners();
  }

  Future<void> setEditorLineHeight(double height) async {
    _editorLineHeight = height;
    await _prefs.setDouble(_kLineHeight, height);
    notifyListeners();
  }

  Future<void> setSmartQuotes(bool value) async {
    _smartQuotes = value;
    await _prefs.setBool(_kSmartQuotes, value);
    notifyListeners();
  }

  Future<void> setSmartGuillemets(bool value) async {
    _smartGuillemets = value;
    await _prefs.setBool(_kSmartGuillemets, value);
    notifyListeners();
  }

  Future<void> setSmartHyphens(bool value) async {
    _smartHyphens = value;
    await _prefs.setBool(_kSmartHyphens, value);
    notifyListeners();
  }

  Future<void> setSmartEllipsis(bool value) async {
    _smartEllipsis = value;
    await _prefs.setBool(_kSmartEllipsis, value);
    notifyListeners();
  }

  Future<void> setAutoCorrection(bool value) async {
    _autoCorrection = value;
    await _prefs.setBool(_kAutoCorrection, value);
    notifyListeners();
  }

  Future<void> setAutoIndentation(bool value) async {
    _autoIndentation = value;
    await _prefs.setBool(_kAutoIndentation, value);
    notifyListeners();
  }

  Future<void> setLibraryGridView(bool value) async {
    _libraryGridView = value;
    await _prefs.setBool(_kGridView, value);
    notifyListeners();
  }

  Future<void> setEasyMode(bool value) async {
    _easyMode = value;
    await _prefs.setBool(_kEasyMode, value);
    notifyListeners();
  }

  Future<void> setIntroSeen(bool value) async {
    _introSeen = value;
    await _prefs.setBool(_kIntroSeen, value);
    notifyListeners();
  }

  Future<void> setTutorialSeen(bool value) async {
    _tutorialSeen = value;
    await _prefs.setBool(_kTutorialSeen, value);
    notifyListeners();
  }

  Future<void> setDailyWordGoal(int value) async {
    _dailyWordGoal = value;
    await _prefs.setInt(_kDailyGoal, value);
    notifyListeners();
  }
}
