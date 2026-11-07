package org.apache.tika.sax;

import java.io.Writer;
import org.xml.sax.Attributes;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public class RichTextContentHandler extends WriteOutContentHandler {
    public RichTextContentHandler(Writer writer) {
        super(writer);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        super.startElement(str, str2, str3, attributes);
        if ("img".equals(str2) && attributes.getValue("alt") != null) {
            String b3 = AbstractC0468a.b("[image: ", attributes.getValue("alt"), "]");
            characters(b3.toCharArray(), 0, b3.length());
        }
        if (!"a".equals(str2) || attributes.getValue("name") == null) {
            return;
        }
        String b4 = AbstractC0468a.b("[bookmark: ", attributes.getValue("name"), "]");
        characters(b4.toCharArray(), 0, b4.length());
    }
}
