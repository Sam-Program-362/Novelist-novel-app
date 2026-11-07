package org.apache.tika.sax;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Office;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public class XHTMLContentHandler extends SafeContentHandler {
    public static final String XHTML = "http://www.w3.org/1999/xhtml";
    private boolean documentStarted;
    private boolean headEnded;
    private boolean headStarted;
    private final Metadata metadata;
    private boolean useFrameset;
    public static final Set<String> ENDLINE = unmodifiableSet("p", "h1", "h2", "h3", "h4", "h5", "h6", "div", "ul", "ol", "dl", "pre", "hr", "blockquote", "address", "fieldset", "table", "form", "noscript", "li", "dt", "dd", "noframes", "br", "tr", "select", "option", "link", "script");
    private static final char[] NL = {'\n'};
    private static final char[] TAB = {'\t'};
    private static final Set<String> HEAD = unmodifiableSet("title", "link", "base", Office.PREFIX_DOC_META, "script");
    private static final Set<String> AUTO = unmodifiableSet("head", "frameset");
    private static final Set<String> INDENT = unmodifiableSet("li", "dd", "dt", "td", "th", "frame");
    private static final Attributes EMPTY_ATTRIBUTES = new AttributesImpl();

    public XHTMLContentHandler(ContentHandler contentHandler, Metadata metadata) {
        super(contentHandler);
        this.documentStarted = false;
        this.headStarted = false;
        this.headEnded = false;
        this.useFrameset = false;
        this.metadata = metadata;
    }

    private void lazyEndHead(boolean z3) throws SAXException {
        lazyStartHead();
        if (this.headEnded) {
            return;
        }
        this.headEnded = true;
        this.useFrameset = z3;
        for (String str : this.metadata.names()) {
            if (!str.equals("title")) {
                for (String str2 : this.metadata.getValues(str)) {
                    if (str2 != null) {
                        AttributesImpl attributesImpl = new AttributesImpl();
                        attributesImpl.addAttribute(StringUtils.EMPTY, "name", "name", "CDATA", str);
                        attributesImpl.addAttribute(StringUtils.EMPTY, "content", "content", "CDATA", str2);
                        super.startElement(XHTML, Office.PREFIX_DOC_META, Office.PREFIX_DOC_META, attributesImpl);
                        super.endElement(XHTML, Office.PREFIX_DOC_META, Office.PREFIX_DOC_META);
                        newline();
                    }
                }
            }
        }
        Attributes attributes = EMPTY_ATTRIBUTES;
        super.startElement(XHTML, "title", "title", attributes);
        String str3 = this.metadata.get(TikaCoreProperties.TITLE);
        if (str3 == null || str3.length() <= 0) {
            super.characters(new char[0], 0, 0);
        } else {
            char[] charArray = str3.toCharArray();
            super.characters(charArray, 0, charArray.length);
        }
        super.endElement(XHTML, "title", "title");
        newline();
        super.endElement(XHTML, "head", "head");
        newline();
        if (this.useFrameset) {
            super.startElement(XHTML, "frameset", "frameset", attributes);
        } else {
            super.startElement(XHTML, "body", "body", attributes);
        }
    }

    private void lazyStartHead() throws SAXException {
        if (this.headStarted) {
            return;
        }
        this.headStarted = true;
        AttributesImpl attributesImpl = new AttributesImpl();
        String str = this.metadata.get(HttpHeaders.CONTENT_LANGUAGE);
        if (str != null) {
            attributesImpl.addAttribute(StringUtils.EMPTY, "lang", "lang", "CDATA", str);
        }
        super.startElement(XHTML, "html", "html", attributesImpl);
        newline();
        super.startElement(XHTML, "head", "head", EMPTY_ATTRIBUTES);
        newline();
    }

    private static Set<String> unmodifiableSet(String... strArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    @Override // org.apache.tika.sax.SafeContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i3, int i4) throws SAXException {
        lazyEndHead(this.useFrameset);
        super.characters(cArr, i3, i4);
    }

    public void element(String str, String str2) throws SAXException {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        startElement(str);
        characters(str2);
        endElement(str);
    }

    @Override // org.apache.tika.sax.SafeContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        lazyEndHead(this.useFrameset);
        if (this.useFrameset) {
            super.endElement(XHTML, "frameset", "frameset");
        } else {
            super.endElement(XHTML, "body", "body");
        }
        super.endElement(XHTML, "html", "html");
        endPrefixMapping(StringUtils.EMPTY);
        super.endDocument();
    }

    @Override // org.apache.tika.sax.SafeContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        if (AUTO.contains(str3)) {
            return;
        }
        super.endElement(str, str2, str3);
        if (XHTML.equals(str) && ENDLINE.contains(str3)) {
            newline();
        }
    }

    @Override // org.apache.tika.sax.SafeContentHandler
    public boolean isInvalid(int i3) {
        if (super.isInvalid(i3)) {
            return true;
        }
        return 127 <= i3 && i3 <= 159;
    }

    public void newline() {
        char[] cArr = NL;
        ignorableWhitespace(cArr, 0, cArr.length);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        if (this.documentStarted) {
            return;
        }
        this.documentStarted = true;
        super.startDocument();
        startPrefixMapping(StringUtils.EMPTY, XHTML);
    }

    @Override // org.apache.tika.sax.SafeContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str3.equals("frameset")) {
            lazyEndHead(true);
            return;
        }
        if (AUTO.contains(str3)) {
            return;
        }
        if (HEAD.contains(str3)) {
            lazyStartHead();
        } else {
            lazyEndHead(false);
        }
        if (XHTML.equals(str) && INDENT.contains(str3)) {
            char[] cArr = TAB;
            ignorableWhitespace(cArr, 0, cArr.length);
        }
        super.startElement(str, str2, str3, attributes);
    }

    public void characters(String str) throws SAXException {
        if (str == null || str.length() <= 0) {
            return;
        }
        characters(str.toCharArray(), 0, str.length());
    }

    public void endElement(String str) throws SAXException {
        endElement(XHTML, str, str);
    }

    public void startElement(String str) throws SAXException {
        startElement(XHTML, str, str, EMPTY_ATTRIBUTES);
    }

    public void startElement(String str, String str2, String str3) throws SAXException {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute(StringUtils.EMPTY, str2, str2, "CDATA", str3);
        startElement(XHTML, str, str, attributesImpl);
    }

    public void startElement(String str, AttributesImpl attributesImpl) throws SAXException {
        startElement(XHTML, str, str, attributesImpl);
    }
}
