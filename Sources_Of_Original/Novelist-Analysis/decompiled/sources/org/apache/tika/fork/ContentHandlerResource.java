package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
class ContentHandlerResource implements ForkResource {
    private final ContentHandler handler;

    public ContentHandlerResource(ContentHandler contentHandler) {
        this.handler = contentHandler;
    }

    private void internalProcess(DataInputStream dataInputStream) throws SAXException, IOException {
        AttributesImpl attributesImpl;
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte == 1) {
            this.handler.startDocument();
            return;
        }
        if (unsignedByte == 2) {
            this.handler.endDocument();
            return;
        }
        if (unsignedByte == 3) {
            this.handler.startPrefixMapping(readString(dataInputStream), readString(dataInputStream));
            return;
        }
        if (unsignedByte == 4) {
            this.handler.endPrefixMapping(readString(dataInputStream));
            return;
        }
        if (unsignedByte == 5) {
            String string = readString(dataInputStream);
            String string2 = readString(dataInputStream);
            String string3 = readString(dataInputStream);
            int i3 = dataInputStream.readInt();
            if (i3 >= 0) {
                attributesImpl = new AttributesImpl();
                for (int i4 = 0; i4 < i3; i4++) {
                    attributesImpl.addAttribute(readString(dataInputStream), readString(dataInputStream), readString(dataInputStream), readString(dataInputStream), readString(dataInputStream));
                }
            } else {
                attributesImpl = null;
            }
            this.handler.startElement(string, string2, string3, attributesImpl);
            return;
        }
        if (unsignedByte == 6) {
            this.handler.endElement(readString(dataInputStream), readString(dataInputStream), readString(dataInputStream));
            return;
        }
        if (unsignedByte == 7) {
            char[] characters = readCharacters(dataInputStream);
            this.handler.characters(characters, 0, characters.length);
        } else if (unsignedByte == 8) {
            char[] characters2 = readCharacters(dataInputStream);
            this.handler.characters(characters2, 0, characters2.length);
        } else if (unsignedByte == 9) {
            this.handler.processingInstruction(readString(dataInputStream), readString(dataInputStream));
        } else if (unsignedByte == 10) {
            this.handler.skippedEntity(readString(dataInputStream));
        }
    }

    private char[] readCharacters(DataInputStream dataInputStream) {
        return readStringUTF(dataInputStream).toCharArray();
    }

    private String readString(DataInputStream dataInputStream) {
        if (dataInputStream.readBoolean()) {
            return readStringUTF(dataInputStream);
        }
        return null;
    }

    private String readStringUTF(DataInputStream dataInputStream) throws IOException {
        int i3 = dataInputStream.readInt();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(dataInputStream.readUTF());
        }
        return sb.toString();
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
