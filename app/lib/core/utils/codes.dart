import 'dart:math';

/// Generates the short public identifiers ("codes") used by the reference application.
/// They are 8 lowercase hexadecimal characters, e.g. `fbfae51b`, and are stored as text so
/// that `.nov` cross references and mentions stay stable when rows are re-inserted.
class CodeGen {
  static final Random _rng = Random.secure();

  static String next() {
    final buffer = StringBuffer();
    for (var i = 0; i < 8; i++) {
      buffer.write(_rng.nextInt(16).toRadixString(16));
    }
    return buffer.toString();
  }
}
