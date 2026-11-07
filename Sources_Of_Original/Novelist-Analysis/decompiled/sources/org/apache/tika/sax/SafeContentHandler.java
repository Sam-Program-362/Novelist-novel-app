package org.apache.tika.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public class SafeContentHandler extends ContentHandlerDecorator {
    private static final char[] REPLACEMENT = {65533};
    private final Output charactersOutput;
    private final Output ignorableWhitespaceOutput;

    public interface Output {
        void write(char[] cArr, int i3, int i4);
    }

    public static class StringOutput implements Output {
        private final StringBuilder builder;

        public /* synthetic */ StringOutput(int i3) {
            this();
        }

        public String toString() {
            return this.builder.toString();
        }

        @Override // org.apache.tika.sax.SafeContentHandler.Output
        public void write(char[] cArr, int i3, int i4) {
            this.builder.append(cArr, i3, i4);
        }

        private StringOutput() {
            this.builder = new StringBuilder();
        }
    }

    public SafeContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        final int i3 = 0;
        this.charactersOutput = new Output(this) { // from class: org.apache.tika.sax.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafeContentHandler f4230b;

            {
                this.f4230b = this;
            }

            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i4, int i5) throws SAXException {
                switch (i3) {
                    case 0:
                        this.f4230b.lambda$new$0(cArr, i4, i5);
                        break;
                    default:
                        this.f4230b.lambda$new$1(cArr, i4, i5);
                        break;
                }
            }
        };
        final int i4 = 1;
        this.ignorableWhitespaceOutput = new Output(this) { // from class: org.apache.tika.sax.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafeContentHandler f4230b;

            {
                this.f4230b = this;
            }

            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i5, int i6) throws SAXException {
                switch (i4) {
                    case 0:
                        this.f4230b.lambda$new$0(cArr, i5, i6);
                        break;
                    default:
                        this.f4230b.lambda$new$1(cArr, i5, i6);
                        break;
                }
            }
        };
    }

    private void filter(char[] cArr, int i3, int i4, Output output) {
        int i5 = i4 + i3;
        int i6 = i3;
        while (i3 < i5) {
            int iCodePointAt = Character.codePointAt(cArr, i3, i5);
            int iCharCount = Character.charCount(iCodePointAt) + i3;
            if (isInvalid(iCodePointAt)) {
                if (i3 > i6) {
                    output.write(cArr, i6, i3 - i6);
                }
                writeReplacement(output);
                i6 = iCharCount;
            }
            i3 = iCharCount;
        }
        output.write(cArr, i6, i5 - i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(char[] cArr, int i3, int i4) throws SAXException {
        super.characters(cArr, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(char[] cArr, int i3, int i4) throws SAXException {
        super.ignorableWhitespace(cArr, i3, i4);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i3, int i4) {
        filter(cArr, i3, i4, this.charactersOutput);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i3, int i4) {
        filter(cArr, i3, i4, this.ignorableWhitespaceOutput);
    }

    public boolean isInvalid(int i3) {
        if (i3 < 32) {
            return (i3 == 9 || i3 == 10 || i3 == 13) ? false : true;
        }
        if (i3 < 57344) {
            return i3 > 55295;
        }
        if (i3 < 65536) {
            return i3 > 65533;
        }
        return i3 > 1114111;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        int i3 = 0;
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            if (isInvalid(attributes.getValue(i4))) {
                AttributesImpl attributesImpl = new AttributesImpl();
                for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                    String value = attributes.getValue(i5);
                    if (i5 >= i4 && isInvalid(value)) {
                        StringOutput stringOutput = new StringOutput(i3);
                        filter(value.toCharArray(), 0, value.length(), stringOutput);
                        value = stringOutput.toString();
                    }
                    attributesImpl.addAttribute(attributes.getURI(i5), attributes.getLocalName(i5), attributes.getQName(i5), attributes.getType(i5), value);
                }
                attributes = attributesImpl;
                break;
            }
        }
        super.startElement(str, str2, str3, attributes);
    }

    public void writeReplacement(Output output) {
        char[] cArr = REPLACEMENT;
        output.write(cArr, 0, cArr.length);
    }

    private boolean isInvalid(String str) {
        char[] charArray = str.toCharArray();
        int iCharCount = 0;
        while (iCharCount < charArray.length) {
            int iCodePointAt = Character.codePointAt(charArray, iCharCount);
            if (isInvalid(iCodePointAt)) {
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return false;
    }
}
