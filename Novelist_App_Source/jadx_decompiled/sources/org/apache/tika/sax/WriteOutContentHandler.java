package org.apache.tika.sax;

import java.io.StringWriter;
import java.io.Writer;
import org.apache.tika.exception.WriteLimitReachedException;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.ParseRecord;
import org.xml.sax.ContentHandler;

/* loaded from: classes.dex */
public class WriteOutContentHandler extends ContentHandlerDecorator {
    private ParseContext parseContext;
    private boolean throwOnWriteLimitReached;
    private int writeCount;
    private final int writeLimit;
    private boolean writeLimitReached;

    public WriteOutContentHandler(ContentHandler contentHandler, int i3) {
        super(contentHandler);
        this.writeCount = 0;
        this.throwOnWriteLimitReached = true;
        this.parseContext = null;
        this.writeLimit = i3;
    }

    private void handleWriteLimitReached() {
        this.writeLimitReached = true;
        this.writeCount = this.writeLimit;
        if (this.throwOnWriteLimitReached) {
            throw new WriteLimitReachedException(this.writeLimit);
        }
        ParseRecord parseRecord = (ParseRecord) this.parseContext.get(ParseRecord.class);
        if (parseRecord != null) {
            parseRecord.setWriteLimitReached(true);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i3, int i4) {
        if (this.writeLimitReached) {
            return;
        }
        int i5 = this.writeLimit;
        if (i5 != -1) {
            int i6 = this.writeCount;
            if (i6 + i4 > i5) {
                super.characters(cArr, i3, i5 - i6);
                handleWriteLimitReached();
                return;
            }
        }
        super.characters(cArr, i3, i4);
        this.writeCount += i4;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i3, int i4) {
        if (this.writeLimitReached) {
            return;
        }
        int i5 = this.writeLimit;
        if (i5 != -1) {
            int i6 = this.writeCount;
            if (i6 + i4 > i5) {
                super.ignorableWhitespace(cArr, i3, i5 - i6);
                handleWriteLimitReached();
                return;
            }
        }
        super.ignorableWhitespace(cArr, i3, i4);
        this.writeCount += i4;
    }

    public WriteOutContentHandler(Writer writer, int i3) {
        this(new ToTextContentHandler(writer), i3);
    }

    public WriteOutContentHandler(Writer writer) {
        this(writer, -1);
    }

    public WriteOutContentHandler(int i3) {
        this(new StringWriter(), i3);
    }

    public WriteOutContentHandler() {
        this(100000);
    }

    public WriteOutContentHandler(ContentHandler contentHandler, int i3, boolean z3, ParseContext parseContext) {
        super(contentHandler);
        this.writeCount = 0;
        this.writeLimit = i3;
        this.throwOnWriteLimitReached = z3;
        this.parseContext = parseContext;
    }
}
