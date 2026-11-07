import 'dart:convert';

import 'package:flutter_test/flutter_test.dart';
import 'package:novelist/core/utils/text_doc.dart';

void main() {
  group('TextDoc', () {
    test('parses the reference block format', () {
      const raw =
          '{"blocks":[{"type":"text","align":"left","text":"\\uFFFC hated sand.","embeds":[{"type":"mention","position":0,"code":"85676f52","value":"Tom"}]}]}';
      final doc = TextDoc.fromJsonString(raw);
      expect(doc.blocks, hasLength(1));
      final block = doc.blocks.first;
      expect(block.type, 'text');
      expect(block.align, 'left');
      expect(block.text.startsWith(kObjectReplacement), isTrue);
      expect(block.embeds.single.code, '85676f52');
      expect(block.plainText, 'Tom hated sand.');
    });

    test('falls back to plain text for legacy payloads', () {
      final doc = TextDoc.fromJsonString('Just some text');
      expect(doc.blocks, hasLength(1));
      expect(doc.blocks.first.text, 'Just some text');
    });

    test('serializes embeds exactly like the reference', () {
      const doc = TextDoc([
        TextBlock(
          align: 'center',
          text: 'Meet \uFFFC now',
          embeds: [TextEmbed(position: 5, code: 'abc12345', value: 'Irene')],
        ),
      ]);
      final decoded = jsonDecode(doc.toJsonString()) as Map<String, dynamic>;
      final blocks = decoded['blocks'] as List;
      expect(blocks, hasLength(1));
      final block = blocks.first as Map<String, dynamic>;
      expect(block['type'], 'text');
      expect(block['align'], 'center');
      expect(block['text'], 'Meet \uFFFC now');
      final embed = (block['embeds'] as List).first as Map<String, dynamic>;
      expect(embed['position'], 5);
      expect(embed['code'], 'abc12345');
      expect(embed['value'], 'Irene');
    });

    test('blocks without embeds omit the key', () {
      final doc = TextDoc([const TextBlock(text: 'plain')]);
      expect(doc.toJsonString().contains('embeds'), isFalse);
    });

    test('editable round trip preserves mentions and positions', () {
      const block = TextBlock(
        text: 'Tom met \uFFFC at the harbour.',
        embeds: [TextEmbed(position: 8, code: 'c0ffee11', value: 'Irene')],
      );
      final editable = TextDoc.blockToEditable(block);
      expect(editable, 'Tom met @Irene at the harbour.');

      final rebuilt = TextDoc.blockFromEditable(
        editable,
        knownMentions: {'Irene': 'c0ffee11'},
      );
      expect(rebuilt.text, block.text);
      expect(rebuilt.embeds.single.code, 'c0ffee11');
      expect(rebuilt.embeds.single.position, 8);
    });

    test('unknown @ tokens stay literal text', () {
      final rebuilt = TextDoc.blockFromEditable(
        'Email me @ noon',
        knownMentions: {'Tom': 'abc'},
      );
      expect(rebuilt.text, 'Email me @ noon');
      expect(rebuilt.embeds, isEmpty);
    });

    test('longest mention label wins', () {
      final rebuilt = TextDoc.blockFromEditable(
        'Hi @Mary Ann',
        knownMentions: {'Mary': 'aaa', 'Mary Ann': 'bbb'},
      );
      expect(rebuilt.embeds.single.code, 'bbb');
      expect(rebuilt.embeds.single.value, 'Mary Ann');
    });

    test('realign follows surviving object replacement characters', () {
      const block = TextBlock(
        text: '\uFFFC and \uFFFC',
        embeds: [
          TextEmbed(position: 0, code: 'a', value: 'A'),
          TextEmbed(position: 6, code: 'b', value: 'B'),
        ],
      );
      final edited = block.copyWith(text: 'New \uFFFC and \uFFFC');
      final realigned = TextDoc.realignEmbeds(edited);
      expect(realigned.embeds.map((e) => e.position), [4, 10]);
    });

    test('word counting ignores object replacement characters', () {
      const doc = TextDoc([
        TextBlock(
          text: '\uFFFC walked to \uFFFC.',
          embeds: [
            TextEmbed(position: 0, code: 'a', value: 'Tom'),
            TextEmbed(position: 14, code: 'b', value: 'Santa Marea'),
          ],
        ),
      ]);
      // "Tom walked to Santa Marea." -> 5 words
      expect(doc.wordCount, 5);
    });
  });
}
