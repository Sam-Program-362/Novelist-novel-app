import 'dart:convert';

/// Marker character used by the reference application to embed a mention inside a
/// paragraph (U+FFFC OBJECT REPLACEMENT CHARACTER).
const String kObjectReplacement = '\uFFFC';

/// A single embed inside a block. The reference format currently only uses `mention`.
class TextEmbed {
  final String type;
  final int position;
  final String code;
  final String value;

  const TextEmbed({
    this.type = 'mention',
    required this.position,
    required this.code,
    required this.value,
  });

  factory TextEmbed.fromJson(Map<String, dynamic> json) => TextEmbed(
        type: (json['type'] as String?) ?? 'mention',
        position: (json['position'] as num?)?.toInt() ?? 0,
        code: (json['code'] as String?) ?? '',
        value: (json['value'] as String?) ?? '',
      );

  Map<String, dynamic> toJson() => {
        'type': type,
        'position': position,
        'code': code,
        'value': value,
      };

  TextEmbed copyWith({int? position, String? code, String? value}) => TextEmbed(
        type: type,
        position: position ?? this.position,
        code: code ?? this.code,
        value: value ?? this.value,
      );
}

/// A paragraph. The reference format is paragraph-level: `type` + `align` + inline embeds.
class TextBlock {
  final String type;
  final String align;
  final String text;
  final List<TextEmbed> embeds;

  const TextBlock({
    this.type = 'text',
    this.align = 'left',
    this.text = '',
    this.embeds = const [],
  });

  factory TextBlock.fromJson(Map<String, dynamic> json) {
    final rawEmbeds = json['embeds'];
    return TextBlock(
      type: (json['type'] as String?) ?? 'text',
      align: (json['align'] as String?) ?? 'left',
      text: (json['text'] as String?) ?? '',
      embeds: rawEmbeds is List
          ? rawEmbeds
              .whereType<Map>()
              .map((e) => TextEmbed.fromJson(Map<String, dynamic>.from(e)))
              .toList(growable: false)
          : const [],
    );
  }

  Map<String, dynamic> toJson() {
    final map = <String, dynamic>{
      'type': type,
      'align': align,
      'text': text,
    };
    if (embeds.isNotEmpty) {
      map['embeds'] = embeds.map((e) => e.toJson()).toList(growable: false);
    }
    return map;
  }

  TextBlock copyWith({String? align, String? text, List<TextEmbed>? embeds}) => TextBlock(
        type: type,
        align: align ?? this.align,
        text: text ?? this.text,
        embeds: embeds ?? this.embeds,
      );

  /// Human readable text with mentions resolved to their display value.
  String get plainText {
    if (embeds.isEmpty) return text;
    final buffer = StringBuffer();
    var embedIndex = 0;
    for (var i = 0; i < text.length; i++) {
      final char = text[i];
      if (char == kObjectReplacement && embedIndex < embeds.length) {
        buffer.write(embeds[embedIndex].value);
        embedIndex++;
      } else {
        buffer.write(char);
      }
    }
    return buffer.toString();
  }
}

/// Serialized rich-text document stored in `scene_text` / `item_text`.
///
/// Mirrors the reference format exactly:
/// `{"blocks":[{"type":"text","align":"left","text":"...\uFFFC...","embeds":[...]}]}`
class TextDoc {
  final List<TextBlock> blocks;

  const TextDoc(this.blocks);

  static const TextDoc empty = TextDoc([TextBlock()]);

  factory TextDoc.fromJsonString(String? raw) {
    if (raw == null || raw.trim().isEmpty) return TextDoc.empty;
    try {
      final decoded = jsonDecode(raw);
      if (decoded is Map && decoded['blocks'] is List) {
        final blocks = (decoded['blocks'] as List)
            .whereType<Map>()
            .map((b) => TextBlock.fromJson(Map<String, dynamic>.from(b)))
            .toList(growable: false);
        if (blocks.isEmpty) return TextDoc.empty;
        return TextDoc(blocks);
      }
    } catch (_) {
      // Fall back to treating the payload as a single paragraph of legacy plain text.
    }
    return TextDoc([TextBlock(text: raw)]);
  }

  factory TextDoc.fromPlainText(String text) {
    final lines = text.replaceAll('\r\n', '\n').split('\n');
    return TextDoc(lines.map((l) => TextBlock(text: l)).toList(growable: false));
  }

  String toJsonString() => jsonEncode({
        'blocks': blocks.map((b) => b.toJson()).toList(growable: false),
      });

  String get plainText => blocks.map((b) => b.plainText).join('\n');

  int get wordCount => countWords(plainText);

  bool get isEmpty => plainText.trim().isEmpty;

  static int countWords(String text) {
    final matches = RegExp(r"[A-Za-z0-9\u00C0-\u024F\u0900-\u097F']+").allMatches(text);
    return matches.length;
  }

  /// Renders a block as editable text where each mention becomes an `@Label` token.
  ///
  /// The reference UI shows mentions as inline chips; an editable text field cannot render
  /// arbitrary widgets, so the editor round-trips mentions through `@Label` tokens that are
  /// converted back to `\uFFFC` + embeds on save. This keeps the stored format byte-compatible
  /// with the original while remaining conveniently editable.
  static String blockToEditable(TextBlock block) {
    if (block.embeds.isEmpty) return block.text;
    final buffer = StringBuffer();
    var embedIndex = 0;
    for (var i = 0; i < block.text.length; i++) {
      final char = block.text[i];
      if (char == kObjectReplacement && embedIndex < block.embeds.length) {
        buffer.write('@${block.embeds[embedIndex].value}');
        embedIndex++;
      } else {
        buffer.write(char);
      }
    }
    return buffer.toString();
  }

  /// Parses editable text back into the stored representation.
  ///
  /// [knownMentions] maps a display label to an item code. Only labels that exist in the
  /// project are converted, so a stray "@" typed by the author stays literal text.
  static TextBlock blockFromEditable(
    String editable, {
    required Map<String, String> knownMentions,
    String align = 'left',
    List<TextEmbed> existing = const [],
  }) {
    if (editable.isEmpty || knownMentions.isEmpty) {
      return TextBlock(align: align, text: editable, embeds: const []);
    }
    // Longest labels first so "@Mary Ann" wins over "@Mary".
    final labels = knownMentions.keys.toList()
      ..sort((a, b) => b.length.compareTo(a.length));

    final text = StringBuffer();
    final embeds = <TextEmbed>[];
    var i = 0;
    while (i < editable.length) {
      if (editable[i] == '@') {
        String? matched;
        for (final label in labels) {
          if (label.isEmpty) continue;
          if (editable.startsWith(label, i + 1)) {
            matched = label;
            break;
          }
        }
        if (matched != null) {
          embeds.add(TextEmbed(
            position: text.length,
            code: knownMentions[matched] ?? '',
            value: matched,
          ));
          text.write(kObjectReplacement);
          i += 1 + matched.length;
          continue;
        }
      }
      text.write(editable[i]);
      i++;
    }
    return TextBlock(align: align, text: text.toString(), embeds: embeds);
  }

  /// Rebuilds embed positions after a text edit, keeping embeds aligned with the
  /// object-replacement characters that survive the edit (order preserving).
  static TextBlock realignEmbeds(TextBlock block) {
    if (block.embeds.isEmpty) return block;
    final positions = <int>[];
    for (var i = 0; i < block.text.length; i++) {
      if (block.text[i] == kObjectReplacement) positions.add(i);
    }
    if (positions.isEmpty) return block.copyWith(embeds: const []);
    final rebuilt = <TextEmbed>[];
    for (var i = 0; i < positions.length && i < block.embeds.length; i++) {
      rebuilt.add(block.embeds[i].copyWith(position: positions[i]));
    }
    return block.copyWith(embeds: rebuilt);
  }
}

int countWords(String text) => TextDoc.countWords(text);
