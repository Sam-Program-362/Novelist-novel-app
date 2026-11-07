import 'package:flutter/material.dart';

/// The reference application stores colours as 32-bit ARGB integers, but inconsistently:
/// system templates use signed values (e.g. `-8305804`) while user projects in `sample.nov`
/// use unsigned ones (e.g. `4288423856`). Both are accepted and normalised here.
Color colourFromStored(int value) => Color(value & 0xFFFFFFFF);

/// Palette offered by the colour picker (`pick_color`). Values are ARGB integers so they can be
/// persisted without depending on Flutter's evolving `Color` API.
class AppPalette {
  static const int blue = 0xFF15628F;
  static const int indigo = 0xFF3F51B5;
  static const int teal = 0xFF00796B;
  static const int green = 0xFF2E7D32;
  static const int amber = 0xFFF9A825;
  static const int orange = 0xFFEF6C00;
  static const int red = 0xFFC62828;
  static const int pink = 0xFFAD1457;
  static const int purple = 0xFF6A1B9A;
  static const int brown = 0xFF6D4C41;
  static const int blueGrey = 0xFF455A64;
  static const int grey = 0xFF616161;

  static const List<int> all = [
    blue,
    indigo,
    teal,
    green,
    amber,
    orange,
    red,
    pink,
    purple,
    brown,
    blueGrey,
    grey,
  ];

  /// Status colours used by the bundled standard template (`template_standard_novel.json`).
  static const List<int> templateStatusColours = [
    0xFFD6E0D1,
    0xFF6A8F9E,
    0xFFFF53EF,
    0xFF2F2F00,
    0xFF486C6A,
  ];

  static const List<int> categoryColours = [
    0xFF81B1F4,
    0xFF51B2C6,
    0xFFB5A19C,
    0xFFC7B0A9,
    0xFF331313,
    0xFF141414,
  ];
}
