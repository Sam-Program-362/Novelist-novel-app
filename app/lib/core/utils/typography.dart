/// Smart typography helpers reproducing the reference's `smart_quotes`, `smart_guillemets`,
/// `smart_hyphens`, `smart_ellipsis` and `set_automatic_correction` behaviours.
class SmartTypography {
  /// Converts straight quotes to curly quotes, keeping opening/closing context.
  static String quotes(String input) {
    final buffer = StringBuffer();
    var openDouble = true;
    var openSingle = true;
    for (var i = 0; i < input.length; i++) {
      final char = input[i];
      final previous = i == 0 ? ' ' : input[i - 1];
      final atWordStart = RegExp(r'[\s(\[{—–-]').hasMatch(previous);
      if (char == '"') {
        buffer.write(openDouble ? '\u201C' : '\u201D');
        openDouble = !openDouble;
      } else if (char == "'") {
        // Apostrophes inside words stay apostrophes.
        if (!atWordStart) {
          buffer.write('\u2019');
        } else {
          buffer.write(openSingle ? '\u2018' : '\u2019');
          openSingle = !openSingle;
        }
      } else {
        buffer.write(char);
      }
    }
    return buffer.toString();
  }

  /// Converts straight quotes to guillemets (« ») as used by several European locales.
  static String guillemets(String input) {
    var open = true;
    final buffer = StringBuffer();
    for (var i = 0; i < input.length; i++) {
      final char = input[i];
      if (char == '"') {
        buffer.write(open ? '\u00AB' : '\u00BB');
        open = !open;
      } else {
        buffer.write(char);
      }
    }
    return buffer.toString();
  }

  static String ellipsis(String input) => input.replaceAll('...', '\u2026');

  static String hyphens(String input) =>
      input.replaceAll('--', '\u2014').replaceAll(RegExp(r'(?<= )-(?= )'), '\u2013');

  /// Applies every enabled rule in a single pass. Used when a paragraph loses focus so the author
  /// never sees the document change mid-word.
  static String apply(
    String input, {
    bool smartQuotes = true,
    bool smartGuillemets = false,
    bool smartHyphens = true,
    bool smartEllipsis = true,
  }) {
    var result = input;
    if (smartGuillemets) {
      result = guillemets(result);
    } else if (smartQuotes) {
      result = quotes(result);
    }
    if (smartEllipsis) result = ellipsis(result);
    if (smartHyphens) result = hyphens(result);
    return result;
  }
}
