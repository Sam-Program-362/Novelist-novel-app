package org.apache.tika.fork;

import B1.e;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.RecursiveParserWrapperHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
class RecursiveMetadataContentHandlerResource implements ForkResource {
    private static final ContentHandler DEFAULT_HANDLER = new DefaultHandler();
    private final AbstractRecursiveParserWrapperHandler handler;

    public RecursiveMetadataContentHandlerResource(RecursiveParserWrapperHandler recursiveParserWrapperHandler) {
        this.handler = recursiveParserWrapperHandler;
    }

    private void internalProcess(DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        ContentHandler contentHandler = DEFAULT_HANDLER;
        if (readByte2 == 3) {
            contentHandler = (ContentHandler) readObject(dataInputStream);
        } else if (readByte2 != 4) {
            throw new IllegalArgumentException(e.g("Expected HANDLER_AND_METADATA or METADATA_ONLY, but got:", readByte2));
        }
        Metadata metadata = (Metadata) readObject(dataInputStream);
        if (readByte == 1) {
            this.handler.endEmbeddedDocument(contentHandler, metadata);
        } else {
            if (readByte != 2) {
                throw new IllegalArgumentException(e.g("Expected either 0x01 or 0x02, but got: ", readByte));
            }
            this.handler.endDocument(contentHandler, metadata);
        }
        byte readByte3 = dataInputStream.readByte();
        if (readByte3 != 5) {
            throw new IOException(e.g("Expected the 'complete' signal, but got: ", readByte3));
        }
    }

    private Object readObject(DataInputStream dataInputStream) {
        try {
            return ForkObjectInputStream.readObject(dataInputStream, getClass().getClassLoader());
        } catch (ClassNotFoundException e3) {
            throw new IOException(e3);
        }
    }

    @Override // org.apache.tika.fork.ForkResource
    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
        try {
            internalProcess(dataInputStream);
            return null;
        } catch (SAXException e3) {
            return e3;
        }
    }
}
