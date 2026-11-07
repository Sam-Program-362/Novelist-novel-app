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

/* JADX INFO: loaded from: classes.dex */
class RecursiveMetadataContentHandlerResource implements ForkResource {
    private static final ContentHandler DEFAULT_HANDLER = new DefaultHandler();
    private final AbstractRecursiveParserWrapperHandler handler;

    public RecursiveMetadataContentHandlerResource(RecursiveParserWrapperHandler recursiveParserWrapperHandler) {
        this.handler = recursiveParserWrapperHandler;
    }

    private void internalProcess(DataInputStream dataInputStream) throws IOException {
        byte b3 = dataInputStream.readByte();
        byte b4 = dataInputStream.readByte();
        ContentHandler contentHandler = DEFAULT_HANDLER;
        if (b4 == 3) {
            contentHandler = (ContentHandler) readObject(dataInputStream);
        } else if (b4 != 4) {
            throw new IllegalArgumentException(e.g("Expected HANDLER_AND_METADATA or METADATA_ONLY, but got:", b4));
        }
        Metadata metadata = (Metadata) readObject(dataInputStream);
        if (b3 == 1) {
            this.handler.endEmbeddedDocument(contentHandler, metadata);
        } else {
            if (b3 != 2) {
                throw new IllegalArgumentException(e.g("Expected either 0x01 or 0x02, but got: ", b3));
            }
            this.handler.endDocument(contentHandler, metadata);
        }
        byte b5 = dataInputStream.readByte();
        if (b5 != 5) {
            throw new IOException(e.g("Expected the 'complete' signal, but got: ", b5));
        }
    }

    private Object readObject(DataInputStream dataInputStream) throws IOException {
        try {
            return ForkObjectInputStream.readObject(dataInputStream, getClass().getClassLoader());
        } catch (ClassNotFoundException e3) {
            throw new IOException(e3);
        }
    }

    @Override // org.apache.tika.fork.ForkResource
    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        try {
            internalProcess(dataInputStream);
            return null;
        } catch (SAXException e3) {
            return e3;
        }
    }
}
