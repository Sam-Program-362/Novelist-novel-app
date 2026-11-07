import 'dart:convert';
import 'dart:typed_data';

import 'package:archive/archive.dart';

import '../../core/utils/text_doc.dart';
import '../../models/entities.dart';
import '../dao/sections_dao.dart';

enum CompileFormat { epub, odt, html }

class CompileOptions {
  final CompileFormat format;
  final bool includeSections;
  final bool includeScenes;
  final bool includeSynopsis;
  final bool showTableOfContents;
  final String? tableOfContentsTitle;

  const CompileOptions({
    required this.format,
    this.includeSections = true,
    this.includeScenes = true,
    this.includeSynopsis = false,
    this.showTableOfContents = true,
    this.tableOfContentsTitle,
  });
}

class CompiledDocument {
  final String fileName;
  final Uint8List bytes;
  final String mimeType;
  final String plainText;

  const CompiledDocument({
    required this.fileName,
    required this.bytes,
    required this.mimeType,
    required this.plainText,
  });
}

class CompiledParagraph {
  final String text;
  final String align;

  const CompiledParagraph({required this.text, this.align = 'left'});
}

class CompiledScene {
  final String title;
  final List<CompiledParagraph> paragraphs;

  const CompiledScene({required this.title, required this.paragraphs});
}

class CompiledChapter {
  final String title;
  final int depth;
  final List<CompiledScene> scenes;

  const CompiledChapter({required this.title, required this.depth, required this.scenes});
}

class CompiledBook {
  final String title;
  final String? author;
  final String? language;
  final String? description;
  final List<CompiledChapter> chapters;

  const CompiledBook({
    required this.title,
    this.author,
    this.language,
    this.description,
    required this.chapters,
  });

  int get wordCount {
    var total = 0;
    for (final chapter in chapters) {
      for (final scene in chapter.scenes) {
        for (final paragraph in scene.paragraphs) {
          total += TextDoc.countWords(paragraph.text);
        }
      }
    }
    return total;
  }
}

/// Builds the compile-ready document from a book's manuscript.
///
/// Only scenes attached through `section_scene` reach this function — the caller passes the
/// ordered manuscript from `SectionsDao`, which is the single source of manuscript membership.
CompiledBook buildCompiledBook({
  required Book book,
  required List<ManuscriptEntry> entries,
  required Map<int, Scene> scenesById,
  required Map<String, String> mentionValues,
  CompileOptions options = const CompileOptions(format: CompileFormat.html),
}) {
  final chapters = <CompiledChapter>[];
  for (final entry in entries) {
    if (!options.includeSections) break;
    final chapterScenes = <CompiledScene>[];
    if (options.includeScenes) {
      for (final sceneId in entry.sceneIds) {
        final scene = scenesById[sceneId];
        if (scene == null) continue;
        final doc = TextDoc.fromJsonString(scene.text);
        final paragraphs = doc.blocks
            .map((block) => CompiledParagraph(text: block.plainText, align: block.align))
            .where((p) => p.text.trim().isNotEmpty)
            .toList(growable: false);
        if (paragraphs.isEmpty) continue;
        chapterScenes.add(CompiledScene(
          title: scene.title,
          paragraphs: paragraphs,
        ));
      }
    }
    chapters.add(CompiledChapter(
      title: entry.section.title,
      depth: entry.depth,
      scenes: chapterScenes,
    ));
  }

  return CompiledBook(
    title: book.title,
    author: book.metadata.author,
    language: book.metadata.language,
    description: book.description,
    chapters: chapters,
  );
}

class Compiler {
  static CompiledDocument compile(CompiledBook book, CompileOptions options) {
    switch (options.format) {
      case CompileFormat.html:
        return _html(book, options);
      case CompileFormat.epub:
        return _epub(book, options);
      case CompileFormat.odt:
        return _odt(book, options);
    }
  }

  static String _escape(String value) => const HtmlEscape().convert(value);

  static String _alignmentClass(String align) => 'align-$align';

  static String _paragraphsToHtml(List<CompiledParagraph> paragraphs) {
    final buffer = StringBuffer();
    for (final paragraph in paragraphs) {
      buffer.writeln(
        '<p class="${_alignmentClass(paragraph.align)}">${_escape(paragraph.text)}</p>',
      );
    }
    return buffer.toString();
  }

  static String _tocTitle(CompiledBook book, CompileOptions options) =>
      options.tableOfContentsTitle ?? 'Contents';

  // ------------------------------------------------------------------ HTML

  static CompiledDocument _html(CompiledBook book, CompileOptions options) {
    final buffer = StringBuffer();
    buffer.writeln('<!DOCTYPE html>');
    buffer.writeln('<html lang="${_escape(book.language ?? 'en')}">');
    buffer.writeln('<head>');
    buffer.writeln('<meta charset="utf-8"/>');
    buffer.writeln('<meta name="viewport" content="width=device-width, initial-scale=1"/>');
    buffer.writeln('<title>${_escape(book.title)}</title>');
    buffer.writeln('<style>');
    buffer.writeln('body{font-family:Georgia,serif;line-height:1.6;max-width:42em;'
        'margin:0 auto;padding:2em 1.2em;color:#1c1c1c;background:#fff}');
    buffer.writeln('h1{font-size:2em;margin:0 0 .2em}h2{margin-top:2em}');
    buffer.writeln('.author{color:#555;margin-bottom:2em}');
    buffer.writeln('.scene{margin-bottom:1.2em}');
    buffer.writeln('.align-center{text-align:center}.align-right{text-align:right}'
        '.align-justify{text-align:justify}');
    buffer.writeln('nav ul{list-style:none;padding-left:1em}');
    buffer.writeln('</style>');
    buffer.writeln('</head>');
    buffer.writeln('<body>');
    buffer.writeln('<h1>${_escape(book.title)}</h1>');
    if (book.author != null && book.author!.isNotEmpty) {
      buffer.writeln('<p class="author">${_escape(book.author!)}</p>');
    }
    if (book.description != null && book.description!.isNotEmpty) {
      buffer.writeln('<p class="description">${_escape(book.description!)}</p>');
    }
    if (options.showTableOfContents) {
      buffer.writeln('<nav><h2>${_escape(_tocTitle(book, options))}</h2><ul>');
      for (final chapter in book.chapters) {
        buffer.writeln(
          '<li style="margin-left:${chapter.depth * 1.2}em">${_escape(chapter.title)}</li>',
        );
      }
      buffer.writeln('</ul></nav>');
    }
    for (final chapter in book.chapters) {
      final level = (2 + chapter.depth).clamp(2, 6);
      buffer.writeln('<h$level>${_escape(chapter.title)}</h$level>');
      for (final scene in chapter.scenes) {
        buffer.writeln('<section class="scene">');
        buffer.write(_paragraphsToHtml(scene.paragraphs));
        buffer.writeln('</section>');
      }
    }
    buffer.writeln('</body>');
    buffer.writeln('</html>');

    final html = buffer.toString();
    return CompiledDocument(
      fileName: '${_safeFileName(book.title)}.html',
      bytes: Uint8List.fromList(utf8.encode(html)),
      mimeType: 'text/html',
      plainText: _plainText(book, options),
    );
  }

  static String _plainText(CompiledBook book, CompileOptions options) {
    final buffer = StringBuffer();
    buffer.writeln(book.title);
    if (book.author != null && book.author!.isNotEmpty) buffer.writeln(book.author);
    buffer.writeln();
    for (final chapter in book.chapters) {
      buffer.writeln(chapter.title);
      buffer.writeln();
      for (final scene in chapter.scenes) {
        for (final paragraph in scene.paragraphs) {
          buffer.writeln(paragraph.text);
          buffer.writeln();
        }
      }
    }
    return buffer.toString();
  }

  // ------------------------------------------------------------------ EPUB

  static CompiledDocument _epub(CompiledBook book, CompileOptions options) {
    final archive = Archive();
    void addText(String name, String content, {bool compressed = true}) {
      final bytes = utf8.encode(content);
      final file = ArchiveFile(name, bytes.length, bytes);
      file.compress = compressed;
      archive.addFile(file);
    }

    addText('mimetype', 'application/epub+zip', compressed: false);
    addText('META-INF/container.xml', '''<?xml version="1.0" encoding="UTF-8"?>
<container version="1.0" xmlns="urn:oasis:names:tc:opendocument:xmlns:container">
  <rootfiles>
    <rootfile full-path="OEBPS/content.opf" media-type="application/oebps-package+xml"/>
  </rootfiles>
</container>''');

    final chapterFiles = <String>[];
    for (var i = 0; i < book.chapters.length; i++) {
      final name = 'chapter${i + 1}.xhtml';
      chapterFiles.add(name);
      addText('OEBPS/$name', _epubChapter(book, book.chapters[i]));
    }

    addText('OEBPS/style.css', '''body{font-family:serif;line-height:1.6;margin:1em}
h1{font-size:1.6em}h2{font-size:1.3em}
.align-center{text-align:center}.align-right{text-align:right}.align-justify{text-align:justify}
p{text-indent:1.5em;margin:0 0 .6em}''');

    final uuid = _pseudoUuid(book.title);
    addText('OEBPS/content.opf', '''<?xml version="1.0" encoding="UTF-8"?>
<package xmlns="http://www.idpf.org/2007/opf" version="3.0" unique-identifier="book-id">
  <metadata xmlns:dc="http://purl.org/dc/elements/1.1/">
    <dc:identifier id="book-id">urn:uuid:$uuid</dc:identifier>
    <dc:title>${_escape(book.title)}</dc:title>
    <dc:language>${_escape(book.language ?? 'en')}</dc:language>
    ${book.author != null && book.author!.isNotEmpty ? '<dc:creator>${_escape(book.author!)}</dc:creator>' : ''}
    <meta property="dcterms:modified">${DateTime.now().toUtc().toIso8601String().split('.').first}Z</meta>
  </metadata>
  <manifest>
    <item id="nav" href="nav.xhtml" media-type="application/xhtml+xml" properties="nav"/>
    <item id="ncx" href="toc.ncx" media-type="application/x-dtbncx+xml"/>
    <item id="css" href="style.css" media-type="text/css"/>
${[for (var i = 0; i < chapterFiles.length; i++) '    <item id="ch${i + 1}" href="${chapterFiles[i]}" media-type="application/xhtml+xml"/>'].join('\n')}
  </manifest>
  <spine toc="ncx">
${[for (var i = 0; i < chapterFiles.length; i++) '    <itemref idref="ch${i + 1}"/>'].join('\n')}
  </spine>
</package>''');

    addText('OEBPS/nav.xhtml', '''<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:epub="http://www.idpf.org/2007/ops">
<head><title>${_escape(_tocTitle(book, options))}</title></head>
<body>
<nav epub:type="toc" id="toc">
<h1>${_escape(_tocTitle(book, options))}</h1>
<ol>
${[for (var i = 0; i < book.chapters.length; i++) '  <li><a href="${chapterFiles[i]}">${_escape(book.chapters[i].title)}</a></li>'].join('\n')}
</ol>
</nav>
</body>
</html>''');

    addText('OEBPS/toc.ncx', '''<?xml version="1.0" encoding="UTF-8"?>
<ncx xmlns="http://www.daisy.org/z3986/2005/ncx/" version="2005-1">
  <head><meta name="dtb:uid" content="urn:uuid:$uuid"/></head>
  <docTitle><text>${_escape(book.title)}</text></docTitle>
  <navMap>
${[for (var i = 0; i < book.chapters.length; i++) '''    <navPoint id="np${i + 1}" playOrder="${i + 1}">
      <navLabel><text>${_escape(book.chapters[i].title)}</text></navLabel>
      <content src="${chapterFiles[i]}"/>
    </navPoint>'''].join('\n')}
  </navMap>
</ncx>''');

    final encoded = ZipEncoder().encode(archive) ?? const <int>[];
    return CompiledDocument(
      fileName: '${_safeFileName(book.title)}.epub',
      bytes: Uint8List.fromList(encoded),
      mimeType: 'application/epub+zip',
      plainText: _plainText(book, options),
    );
  }

  static String _epubChapter(CompiledBook book, CompiledChapter chapter) {
    final level = (1 + chapter.depth).clamp(1, 5);
    final buffer = StringBuffer();
    buffer.writeln('<?xml version="1.0" encoding="UTF-8"?>');
    buffer.writeln('<!DOCTYPE html>');
    buffer.writeln('<html xmlns="http://www.w3.org/1999/xhtml">');
    buffer.writeln('<head><title>${_escape(chapter.title)}</title>'
        '<link rel="stylesheet" type="text/css" href="style.css"/></head>');
    buffer.writeln('<body>');
    buffer.writeln('<h$level>${_escape(chapter.title)}</h$level>');
    for (final scene in chapter.scenes) {
      for (final paragraph in scene.paragraphs) {
        buffer.writeln(
          '<p class="${_alignmentClass(paragraph.align)}">${_escape(paragraph.text)}</p>',
        );
      }
    }
    buffer.writeln('</body>');
    buffer.writeln('</html>');
    return buffer.toString();
  }

  // ------------------------------------------------------------------- ODT

  static CompiledDocument _odt(CompiledBook book, CompileOptions options) {
    final archive = Archive();
    void addText(String name, String content, {bool compressed = true}) {
      final bytes = utf8.encode(content);
      final file = ArchiveFile(name, bytes.length, bytes);
      file.compress = compressed;
      archive.addFile(file);
    }

    addText('mimetype', 'application/vnd.oasis.opendocument.text', compressed: false);
    addText('META-INF/manifest.xml', '''<?xml version="1.0" encoding="UTF-8"?>
<manifest:manifest xmlns:manifest="urn:oasis:names:tc:opendocument:xmlns:manifest:1.0">
  <manifest:file-entry manifest:full-path="/" manifest:media-type="application/vnd.oasis.opendocument.text"/>
  <manifest:file-entry manifest:full-path="content.xml" manifest:media-type="text/xml"/>
  <manifest:file-entry manifest:full-path="styles.xml" manifest:media-type="text/xml"/>
  <manifest:file-entry manifest:full-path="meta.xml" manifest:media-type="text/xml"/>
</manifest:manifest>''');

    addText('meta.xml', '''<?xml version="1.0" encoding="UTF-8"?>
<office:document-meta xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"
 xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:meta="urn:oasis:names:tc:opendocument:xmlns:meta:1.0"
 office:version="1.2">
  <office:meta>
    <dc:title>${_escape(book.title)}</dc:title>
    ${book.author != null ? '<dc:creator>${_escape(book.author!)}</dc:creator>' : ''}
    <meta:generator>Novelist Rebuild</meta:generator>
  </office:meta>
</office:document-meta>''');

    addText('styles.xml', '''<?xml version="1.0" encoding="UTF-8"?>
<office:document-styles xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"
 xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0"
 xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0"
 xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0" office:version="1.2">
  <office:styles>
    <style:style style:name="Text_body" style:family="paragraph">
      <style:paragraph-properties fo:text-indent="1.2cm" fo:margin-bottom="0.2cm"/>
    </style:style>
  </office:styles>
</office:document-styles>''');

    final body = StringBuffer();
    body.writeln('<text:h text:outline-level="1">${_escape(book.title)}</text:h>');
    if (book.author != null && book.author!.isNotEmpty) {
      body.writeln('<text:p>${_escape(book.author!)}</text:p>');
    }
    for (final chapter in book.chapters) {
      final level = (1 + chapter.depth).clamp(1, 6);
      body.writeln(
        '<text:h text:outline-level="$level">${_escape(chapter.title)}</text:h>',
      );
      for (final scene in chapter.scenes) {
        for (final paragraph in scene.paragraphs) {
          final style = paragraph.align == 'center'
              ? ' style:name="Text_body" fo:text-align="center"'
              : ' style:name="Text_body"';
          body.writeln('<text:p text:style-name="Text_body"$style>'
              '${_escape(paragraph.text)}</text:p>');
        }
      }
    }

    addText('content.xml', '''<?xml version="1.0" encoding="UTF-8"?>
<office:document-content xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0"
 xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0"
 xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0"
 xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0" office:version="1.2">
  <office:body>
    <office:text>
${body.toString()}
    </office:text>
  </office:body>
</office:document-content>''');

    final encoded = ZipEncoder().encode(archive) ?? const <int>[];
    return CompiledDocument(
      fileName: '${_safeFileName(book.title)}.odt',
      bytes: Uint8List.fromList(encoded),
      mimeType: 'application/vnd.oasis.opendocument.text',
      plainText: _plainText(book, options),
    );
  }

  static String _safeFileName(String title) {
    final cleaned = title
        .replaceAll(RegExp(r'[\\/:*?"<>|]'), '')
        .replaceAll(RegExp(r'\s+'), ' ')
        .trim();
    return cleaned.isEmpty ? 'manuscript' : cleaned;
  }

  static String _pseudoUuid(String seed) {
    final hash = seed.codeUnits.fold<int>(7, (acc, value) => (acc * 31 + value) & 0x7fffffff);
    final hex = hash.toRadixString(16).padLeft(8, '0');
    return '$hex-${hex.substring(0, 4)}-4${hex.substring(1, 4)}-a${hex.substring(2, 5)}-$hex$hex'
        .substring(0, 36);
  }
}
