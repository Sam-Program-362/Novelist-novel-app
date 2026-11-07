package org.apache.tika.sax;

import java.util.ArrayList;
import java.util.Arrays;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes.dex */
public class StandardsExtractingContentHandler extends ContentHandlerDecorator {
    public static final String STANDARD_REFERENCES = "standard_references";
    private int maxBufferLength;
    private final Metadata metadata;
    private final StringBuilder stringBuilder;
    private double threshold;

    public StandardsExtractingContentHandler(ContentHandler contentHandler, Metadata metadata) {
        super(contentHandler);
        this.maxBufferLength = 100000;
        this.threshold = 0.0d;
        this.metadata = metadata;
        this.stringBuilder = new StringBuilder();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i3, int i4) throws SAXException {
        int length;
        try {
            int i5 = this.maxBufferLength;
            if (i5 > -1 && (length = i5 - this.stringBuilder.length()) <= i4) {
                i4 = length;
            }
            this.stringBuilder.append(new String(Arrays.copyOfRange(cArr, i3, i3 + i4)));
            super.characters(cArr, i3, i4);
        } catch (SAXException e3) {
            handleException(e3);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        super.endDocument();
        ArrayList<StandardReference> arrayListExtractStandardReferences = StandardsText.extractStandardReferences(this.stringBuilder.toString(), this.threshold);
        int size = arrayListExtractStandardReferences.size();
        int i3 = 0;
        while (i3 < size) {
            StandardReference standardReference = arrayListExtractStandardReferences.get(i3);
            i3++;
            this.metadata.add(STANDARD_REFERENCES, standardReference.toString());
        }
    }

    public double getThreshold() {
        return this.threshold;
    }

    public void setMaxBufferLength(int i3) {
        this.maxBufferLength = i3;
    }

    public void setThreshold(double d3) {
        this.threshold = d3;
    }

    public StandardsExtractingContentHandler() {
        this(new DefaultHandler(), new Metadata());
    }
}
