import 'dart:convert';

import 'package:flutter/services.dart' show rootBundle;

/// Parses the bundled system templates and resolves their localisation placeholders.
///
/// The shipped templates use `§template_standard_novel_category_1_title§` style placeholders instead
/// of literal text. The English values live in the AOT snapshot, but the string table is hash
/// ordered so keys cannot be matched back to values mechanically. Resolution therefore uses:
///
/// * **Category titles** – the binary contains exactly the nouns {Themes, Events, Characters,
///   Locations, Props, Custom} and the template defines six categories whose metadata schemas
///   match those nouns one-to-one (Characters = name/surname/role…, Locations = city/country/planet…,
///   Events = date/time, Props = purpose/symbolic value, custom fields ⇒ Custom). Evidence-backed
///   but *reconstructed*: see docs/REFERENCE_APPLICATION_ANALYSIS.md §8.
/// * **Metadata group/element titles** – derived from the uppercase codes. This reproduces the
///   verified English labels exactly (EFFECTS → “Effects”, INNER_MEANING → “Inner meaning”,
///   SYMBOLIC_VALUE → “Symbolic value”, …).
/// * **Status titles** – “First draft”, “Writing” and “Done” are verified strings; the remaining
///   two are reconstructed.
class TemplateService {
  static const String standardTemplateAsset = 'assets/template_standard_novel.json';
  static const String emptyTemplateAsset = 'assets/template_empty.json';

  static const Map<String, String> categoryTitles = {
    '1': 'Themes',
    '2': 'Events',
    '3': 'Characters',
    '4': 'Locations',
    '5': 'Props',
    '6': 'Custom',
  };

  static const List<String> statusTitles = [
    'To do',
    'First draft',
    'Writing',
    'To revise',
    'Done',
  ];

  static Future<String> loadStandardBody() => rootBundle.loadString(standardTemplateAsset);

  static Future<String> loadEmptyBody() => rootBundle.loadString(emptyTemplateAsset);

  /// Converts `INNER_MEANING` / `BIRTH_DATE` style codes into sentence-case labels.
  static String labelFromCode(String code) {
    final words = code.toLowerCase().split('_').where((w) => w.isNotEmpty).toList();
    if (words.isEmpty) return code;
    final first = words.first;
    final capitalised = first[0].toUpperCase() + first.substring(1);
    return [capitalised, ...words.skip(1)].join(' ');
  }

  /// Parses a template JSON body into a structure the repositories can insert.
  ///
  /// Accepts both the `template_standard_novel.json` shape (categories + statuses) and the
  /// `template_empty.json` shape (statuses only).
  static TemplateData parse(String body) {
    final decoded = jsonDecode(body);
    final map = decoded is Map ? Map<String, dynamic>.from(decoded) : <String, dynamic>{};

    final statuses = <TemplateStatus>[];
    for (final raw in (map['statuses'] as List?) ?? const []) {
      if (raw is! Map) continue;
      final status = Map<String, dynamic>.from(raw);
      final code = status['code']?.toString() ?? '';
      final index = int.tryParse(code) ?? (statuses.length + 1);
      statuses.add(TemplateStatus(
        code: code,
        title: statusTitles[(index - 1).clamp(0, statusTitles.length - 1)],
        colour: (status['color'] as num?)?.toInt() ?? 0xFF9E9E9E,
        ranking: (status['ranking'] as num?)?.toInt() ?? statuses.length + 1,
      ));
    }
    if (statuses.isEmpty) {
      statuses.add(const TemplateStatus(
        code: '1',
        title: 'To do',
        colour: 0xFFD6E0D1,
        ranking: 1,
      ));
    }

    final categories = <TemplateCategory>[];
    for (final raw in (map['categories'] as List?) ?? const []) {
      if (raw is! Map) continue;
      final category = Map<String, dynamic>.from(raw);
      final code = category['code']?.toString() ?? '';
      categories.add(TemplateCategory(
        code: code,
        title: categoryTitles[code] ?? 'Category',
        colour: (category['color'] as num?)?.toInt() ?? 0xFF9E9E9E,
        ranking: (category['ranking'] as num?)?.toInt() ?? categories.length + 1,
        groups: ((category['metadata_groups'] as List?) ?? const [])
            .whereType<Map>()
            .map((g) {
              final group = Map<String, dynamic>.from(g);
              final groupCode = group['code']?.toString() ?? '';
              return TemplateMetadataGroup(
                code: groupCode,
                title: labelFromCode(groupCode),
                ranking: (group['ranking'] as num?)?.toInt() ?? 1,
                elements: ((group['metadata_elements'] as List?) ?? const [])
                    .whereType<Map>()
                    .map((e) {
                      final element = Map<String, dynamic>.from(e);
                      final elementCode = element['code']?.toString() ?? '';
                      return TemplateMetadataElement(
                        code: elementCode,
                        title: labelFromCode(elementCode),
                        ranking: (element['ranking'] as num?)?.toInt() ?? 1,
                        isRelevant: element['is_relevant'] == true,
                      );
                    })
                    .toList(growable: false),
              );
            })
            .toList(growable: false),
      ));
    }

    return TemplateData(statuses: statuses, categories: categories);
  }

  static Future<TemplateData> loadStandard() async => parse(await loadStandardBody());

  static Future<TemplateData> loadEmpty() async => parse(await loadEmptyBody());
}

class TemplateData {
  final List<TemplateStatus> statuses;
  final List<TemplateCategory> categories;

  const TemplateData({required this.statuses, required this.categories});
}

class TemplateStatus {
  final String code;
  final String title;
  final int colour;
  final int ranking;

  const TemplateStatus({
    required this.code,
    required this.title,
    required this.colour,
    required this.ranking,
  });
}

class TemplateCategory {
  final String code;
  final String title;
  final int colour;
  final int ranking;
  final List<TemplateMetadataGroup> groups;

  const TemplateCategory({
    required this.code,
    required this.title,
    required this.colour,
    required this.ranking,
    required this.groups,
  });
}

class TemplateMetadataGroup {
  final String code;
  final String title;
  final int ranking;
  final List<TemplateMetadataElement> elements;

  const TemplateMetadataGroup({
    required this.code,
    required this.title,
    required this.ranking,
    required this.elements,
  });
}

class TemplateMetadataElement {
  final String code;
  final String title;
  final int ranking;
  final bool isRelevant;

  const TemplateMetadataElement({
    required this.code,
    required this.title,
    required this.ranking,
    required this.isRelevant,
  });
}
