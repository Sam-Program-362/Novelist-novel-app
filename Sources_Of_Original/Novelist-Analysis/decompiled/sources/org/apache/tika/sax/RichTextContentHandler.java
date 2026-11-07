package org.apache.tika.sax;

import java.io.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class RichTextContentHandler extends WriteOutContentHandler {
    public RichTextContentHandler(Writer writer) {
        super(writer);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if ("img".equals(str2) && attributes.getValue("alt") != null) {
            String strB = p055t.a.b("[image: ", attributes.getValue("alt"), "]");
            characters(strB.toCharArray(), 0, strB.length());
        }
        if (!"a".equals(str2) || attributes.getValue("name") == null) {
            return;
        }
        String strB2 = p055t.a.b("[bookmark: ", attributes.getValue("name"), "]");
        characters(strB2.toCharArray(), 0, strB2.length());
    }
}
