/// Minimal HTML → plain-text conversion for the bundled help documents.
///
/// The reference app renders `quickstart_en.html`, `privacy_policy.html` and
/// `terms_and_conditions.html` with a web view (`HtmlWidget` is present in the shipping string
/// table). Shipping a web view would add a platform channel and a JavaScript engine to a build
/// that otherwise has no runtime dependencies, so the same documents are reduced to text here:
/// block-level tags become newlines, list items become bullets and the handful of entities that
/// occur in the documents are decoded explicitly.
library;

const Map<String, String> _entities = {
  '&amp;': '&',
  '&lt;': '<',
  '&gt;': '>',
  '&quot;': '"',
  '&#39;': "'",
  '&apos;': "'",
  '&nbsp;': ' ',
  '&mdash;': '—',
  '&ndash;': '–',
  '&hellip;': '…',
  '&rsquo;': '’',
  '&lsquo;': '‘',
  '&ldquo;': '“',
  '&rdquo;': '”',
};

String htmlToText(String html) {
  var text = html;

  // Drop non-content sections wholesale.
  text = text.replaceAll(RegExp(r'<(script|style|head)[\s\S]*?</\1>', caseSensitive: false), '');

  // Headings get their own paragraph plus a blank line so the scanner keeps them apart.
  text = text.replaceAll(
    RegExp(r'<h([1-6])[^>]*>([\s\S]*?)</h\1>', caseSensitive: false),
    (m) => '\n\n${m[2]!.trim().toUpperCase()}\n\n',
  );
  text = text.replaceAll(
    RegExp(r'<li[^>]*>', caseSensitive: false),
    '\n• ',
  );
  text = text.replaceAll(
    RegExp(r'</(p|div|li|tr|h[1-6])>|<br\s*/?>|</ul>|</ol>', caseSensitive: false),
    '\n',
  );
  text = text.replaceAll(RegExp(r'<[^>]+>'), '');

  for (final entry in _entities.entries) {
    text = text.replaceAll(entry.key, entry.value);
  }
  text = text.replaceAll(RegExp(r'&#(\d+);'), (m) {
    final code = int.tryParse(m[1]!);
    return code == null ? m[0]! : String.fromCharCode(code);
  });

  return text
      .split('\n')
      .map((line) => line.trim().replaceAll(RegExp(r'[ \t]+'), ' '))
      .join('\n')
      .replaceAll(RegExp(r'\n{3,}'), '\n\n')
      .trim();
}
