package org.apache.tika.sax.xpath;

import java.util.LinkedList;
import org.apache.tika.sax.ContentHandlerDecorator;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: classes.dex */
public class MatchingContentHandler extends ContentHandlerDecorator {
    private Matcher matcher;
    private final LinkedList<Matcher> matchers;

    public MatchingContentHandler(ContentHandler contentHandler, Matcher matcher) {
        super(contentHandler);
        this.matchers = new LinkedList<>();
        this.matcher = matcher;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i3, int i4) {
        if (this.matcher.matchesText()) {
            super.characters(cArr, i3, i4);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if (this.matcher.matchesElement()) {
            super.endElement(str, str2, str3);
        }
        if (this.matchers.isEmpty()) {
            return;
        }
        this.matcher = this.matchers.removeFirst();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i3, int i4) {
        if (this.matcher.matchesText()) {
            super.ignorableWhitespace(cArr, i3, i4);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) {
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void skippedEntity(String str) {
        if (this.matcher.matchesText()) {
            super.skippedEntity(str);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.matchers.addFirst(this.matcher);
        this.matcher = this.matcher.descend(str, str2);
        AttributesImpl attributesImpl = new AttributesImpl();
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            String uri = attributes.getURI(i3);
            String localName = attributes.getLocalName(i3);
            if (this.matcher.matchesAttribute(uri, localName)) {
                attributesImpl.addAttribute(uri, localName, attributes.getQName(i3), attributes.getType(i3), attributes.getValue(i3));
            }
        }
        if (this.matcher.matchesElement() || attributesImpl.getLength() > 0) {
            super.startElement(str, str2, str3, attributesImpl);
            if (this.matcher.matchesElement()) {
                return;
            }
            this.matcher = new CompositeMatcher(this.matcher, ElementMatcher.INSTANCE);
        }
    }
}
