import 'package:flutter_test/flutter_test.dart';
import 'package:novelist/core/utils/text_doc.dart';
import 'package:novelist/core/utils/typography.dart';

/// Typing helpers behind the Settings toggles (`smart_quotes`, `smart_guillemets`,
/// `smart_hyphens`, `smart_ellipsis` and `set_automatic_correction`).
void main() {
  group('SmartTypography', () {
    test('curls straight double quotes in pairs', () {
      expect(SmartTypography.quotes('"Hello," she said.'), '\u201CHello,\u201D she said.');
    });

    test('keeps apostrophes inside words but curls quoted words', () {
      expect(SmartTypography.quotes("It's 'quoted' here"), "It\u2019s \u2018quoted\u2019 here");
    });

    test('converts to guillemets instead of curly quotes', () {
      expect(SmartTypography.guillemets('"Oui"'), '\u00ABOui\u00BB');
    });

    test('collapses three dots and double hyphens', () {
      expect(SmartTypography.ellipsis('Wait...'), 'Wait\u2026');
      expect(SmartTypography.hyphens('well--known'), 'well\u2014known');
    });

    test('apply honours every switch', () {
      expect(
        SmartTypography.apply('"Wait..."'),
        '\u201CWait\u2026\u201D',
      );
      expect(
        SmartTypography.apply('"Wait..."', smartGuillemets: true, smartQuotes: false),
        '\u00ABWait\u2026\u00BB',
      );
      expect(
        SmartTypography.apply('"Wait..."', smartQuotes: false, smartEllipsis: false),
        '"Wait..."',
      );
    });

    test('mention tokens survive typography unchanged', () {
      const input = 'Then @Tom said "hello" to @Irene...';
      final corrected = SmartTypography.apply(input);
      expect(corrected, contains('@Tom'));
      expect(corrected, contains('@Irene'));
      expect(corrected, contains('\u2026'));

      final block = TextDoc.blockFromEditable(corrected, knownMentions: {
        'Tom': 'aaaa1111',
        'Irene': 'bbbb2222',
      });
      expect(block.embeds, hasLength(2));
      expect(block.plainText, 'Then Tom said \u201Chello\u201D to Irene\u2026');
    });
  });
}
