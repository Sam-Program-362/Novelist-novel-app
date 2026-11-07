package org.apache.tika.parser;

import B1.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.exception.CorruptedFileException;
import org.apache.tika.exception.EncryptedDocumentException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.exception.WriteLimitReachedException;
import org.apache.tika.exception.ZeroByteFileException;
import org.apache.tika.extractor.ParentContentHandler;
import org.apache.tika.io.FilenameUtils;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.ContentHandlerFactory;
import org.apache.tika.sax.SecureContentHandler;
import org.apache.tika.sax.WriteLimiter;
import org.apache.tika.utils.ExceptionUtils;
import org.apache.tika.utils.ParserUtils;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class RecursiveParserWrapper extends ParserDecorator {
    private static final long serialVersionUID = 9086536568120690938L;
    private final boolean catchEmbeddedExceptions;
    private final boolean inlineContent;

    public class EmbeddedParserDecorator extends StatefulParser {
        private static final long serialVersionUID = 207648200464263337L;
        private String embeddedIdPath;
        private String location;
        private final ParserState parserState;

        public /* synthetic */ EmbeddedParserDecorator(RecursiveParserWrapper recursiveParserWrapper, Parser parser, ParserState parserState) {
            this(parser, "/", "/", parserState);
        }

        @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
        public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws SAXException, IOException {
            String str;
            TemporaryResources temporaryResources;
            if (this.parserState.recursiveParserWrapperHandler.hasHitMaximumEmbeddedResources()) {
                return;
            }
            String strJ = e.j(this.location, RecursiveParserWrapper.getResourceName(metadata, this.parserState.unknownCount));
            metadata.add(TikaCoreProperties.EMBEDDED_RESOURCE_PATH, strJ);
            if (this.embeddedIdPath.equals("/")) {
                String str2 = this.embeddedIdPath;
                ParserState parserState = this.parserState;
                int i3 = parserState.embeddedCount + 1;
                parserState.embeddedCount = i3;
                str = str2 + i3;
            } else {
                String str3 = this.embeddedIdPath;
                ParserState parserState2 = this.parserState;
                int i4 = parserState2.embeddedCount + 1;
                parserState2.embeddedCount = i4;
                str = str3 + "/" + i4;
            }
            String str4 = str;
            metadata.add(TikaCoreProperties.EMBEDDED_ID_PATH, str4);
            metadata.set(TikaCoreProperties.EMBEDDED_ID, this.parserState.embeddedCount);
            ContentHandler newContentHandler = this.parserState.recursiveParserWrapperHandler.getNewContentHandler();
            this.parserState.recursiveParserWrapperHandler.startEmbeddedDocument(newContentHandler, metadata);
            Parser parser = (Parser) parseContext.get(Parser.class);
            parseContext.set(Parser.class, RecursiveParserWrapper.this.new EmbeddedParserDecorator(getWrappedParser(), strJ, str4, this.parserState));
            long jCurrentTimeMillis = System.currentTimeMillis();
            RecursivelySecureContentHandler recursivelySecureContentHandler = (RecursivelySecureContentHandler) parseContext.get(RecursivelySecureContentHandler.class);
            ParentContentHandler parentContentHandler = (ParentContentHandler) parseContext.get(ParentContentHandler.class);
            parseContext.set(ParentContentHandler.class, new ParentContentHandler(recursivelySecureContentHandler));
            TikaInputStream tikaInputStreamCast = TikaInputStream.cast(inputStream);
            if (tikaInputStreamCast == null) {
                TemporaryResources temporaryResources2 = new TemporaryResources();
                temporaryResources = temporaryResources2;
                tikaInputStreamCast = TikaInputStream.get(new w2.a(inputStream), temporaryResources2, metadata);
            } else {
                temporaryResources = null;
            }
            TikaInputStream tikaInputStream = tikaInputStreamCast;
            try {
                try {
                    try {
                        super.parse(inputStream, new RecursivelySecureContentHandler(newContentHandler, tikaInputStream, recursivelySecureContentHandler.handlerCounter, recursivelySecureContentHandler.throwOnWriteLimitReached, parseContext), metadata, parseContext);
                        parseContext.set(Parser.class, parser);
                        parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                        parseContext.set(ParentContentHandler.class, parentContentHandler);
                        metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                        this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                        if (temporaryResources != null) {
                            tikaInputStream.close();
                        }
                    } catch (SAXException e3) {
                        if (WriteLimitReachedException.isWriteLimitReached(e3)) {
                            metadata.add(TikaCoreProperties.WRITE_LIMIT_REACHED, "true");
                            throw e3;
                        }
                        if (!RecursiveParserWrapper.this.catchEmbeddedExceptions) {
                            throw e3;
                        }
                        ParserUtils.recordParserFailure(this, e3, metadata);
                        parseContext.set(Parser.class, parser);
                        parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                        parseContext.set(ParentContentHandler.class, parentContentHandler);
                        metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                        this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                        if (temporaryResources == null) {
                            return;
                        }
                        tikaInputStream.close();
                    }
                } catch (CorruptedFileException e4) {
                    throw e4;
                } catch (TikaException e5) {
                    if (e5 instanceof EncryptedDocumentException) {
                        metadata.set(TikaCoreProperties.IS_ENCRYPTED, true);
                    }
                    if (parseContext.get(ZeroByteFileException.IgnoreZeroByteFileException.class) == null || !(e5 instanceof ZeroByteFileException)) {
                        if (!RecursiveParserWrapper.this.catchEmbeddedExceptions) {
                            throw e5;
                        }
                        ParserUtils.recordParserFailure(this, e5, metadata);
                    }
                    parseContext.set(Parser.class, parser);
                    parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                    parseContext.set(ParentContentHandler.class, parentContentHandler);
                    metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                    this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                    if (temporaryResources == null) {
                        return;
                    }
                    tikaInputStream.close();
                }
            } catch (Throwable th) {
                parseContext.set(Parser.class, parser);
                parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                parseContext.set(ParentContentHandler.class, parentContentHandler);
                metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                if (temporaryResources != null) {
                    tikaInputStream.close();
                }
                throw th;
            }
        }

        private EmbeddedParserDecorator(Parser parser, String str, String str2, ParserState parserState) {
            super(parser);
            this.embeddedIdPath = null;
            this.location = str;
            if (!str.endsWith("/")) {
                this.location = e.j(this.location, "/");
            }
            this.embeddedIdPath = str2;
            this.parserState = parserState;
        }
    }

    public static class ParserState {
        private int embeddedCount;
        private final AbstractRecursiveParserWrapperHandler recursiveParserWrapperHandler;
        private AtomicInteger unknownCount;

        public /* synthetic */ ParserState(AbstractRecursiveParserWrapperHandler abstractRecursiveParserWrapperHandler, int i3) {
            this(abstractRecursiveParserWrapperHandler);
        }

        private ParserState(AbstractRecursiveParserWrapperHandler abstractRecursiveParserWrapperHandler) {
            this.unknownCount = new AtomicInteger(0);
            this.embeddedCount = 0;
            this.recursiveParserWrapperHandler = abstractRecursiveParserWrapperHandler;
        }
    }

    public static class RecursivelySecureContentHandler extends SecureContentHandler {
        private static AtomicInteger COUNTER = new AtomicInteger();
        private final ContentHandler handler;
        private final SecureHandlerCounter handlerCounter;
        private final int id;
        private final ParseContext parseContext;
        private final boolean throwOnWriteLimitReached;

        public RecursivelySecureContentHandler(ContentHandler contentHandler, TikaInputStream tikaInputStream, SecureHandlerCounter secureHandlerCounter, boolean z3, ParseContext parseContext) {
            super(contentHandler, tikaInputStream);
            this.id = COUNTER.getAndIncrement();
            this.handler = contentHandler;
            this.handlerCounter = secureHandlerCounter;
            this.throwOnWriteLimitReached = z3;
            this.parseContext = parseContext;
        }

        private void handleWriteLimitReached() throws WriteLimitReachedException {
            this.handlerCounter.writeLimitReached = true;
            if (this.throwOnWriteLimitReached) {
                throw new WriteLimitReachedException(this.handlerCounter.totalWriteLimit);
            }
            ParseRecord parseRecord = (ParseRecord) this.parseContext.get(ParseRecord.class);
            if (parseRecord != null) {
                parseRecord.setWriteLimitReached(true);
            }
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i3, int i4) throws SAXException {
            if (this.handlerCounter.writeLimitReached) {
                return;
            }
            if (this.handlerCounter.totalWriteLimit < 0) {
                super.characters(cArr, i3, i4);
                return;
            }
            int available = this.handlerCounter.getAvailable(i4);
            super.characters(cArr, i3, available);
            this.handlerCounter.addChars(available);
            if (available < i4) {
                handleWriteLimitReached();
            }
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            this.handler.endElement(str, str2, str3);
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i3, int i4) throws SAXException {
            if (this.handlerCounter.writeLimitReached) {
                return;
            }
            if (this.handlerCounter.totalWriteLimit < 0) {
                super.ignorableWhitespace(cArr, i3, i4);
                return;
            }
            int available = this.handlerCounter.getAvailable(i4);
            super.ignorableWhitespace(cArr, i3, available);
            this.handlerCounter.addChars(available);
            if (available < i4) {
                handleWriteLimitReached();
            }
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            this.handler.startElement(str, str2, str3, attributes);
        }
    }

    public static class SecureHandlerCounter {
        private int totalChars;
        private final int totalWriteLimit;
        private boolean writeLimitReached;

        public /* synthetic */ SecureHandlerCounter(int i3, int i4) {
            this(i3);
        }

        public void addChars(int i3) {
            this.totalChars += i3;
        }

        public int getAvailable(int i3) {
            return Math.min(this.totalWriteLimit - this.totalChars, i3);
        }

        private SecureHandlerCounter(int i3) {
            this.writeLimitReached = false;
            this.totalChars = 0;
            this.totalWriteLimit = i3;
        }
    }

    public RecursiveParserWrapper(Parser parser) {
        this(parser, true);
    }

    public static String getResourceName(Metadata metadata, AtomicInteger atomicInteger) {
        String strA;
        if (metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY) != null) {
            strA = metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY);
        } else if (metadata.get(TikaCoreProperties.EMBEDDED_RELATIONSHIP_ID) != null) {
            strA = metadata.get(TikaCoreProperties.EMBEDDED_RELATIONSHIP_ID);
        } else {
            Property property = TikaCoreProperties.VERSION_NUMBER;
            strA = metadata.get(property) != null ? p055t.a.a("version-number-", metadata.get(property)) : e.g("embedded-", atomicInteger.incrementAndGet());
        }
        return FilenameUtils.getName(strA);
    }

    @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return getWrappedParser().getSupportedTypes(parseContext);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0053  */
    @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws TikaException, SAXException {
        int writeLimit;
        boolean zIsThrowOnWriteLimitReached;
        ContentHandler contentHandler2;
        if (!(contentHandler instanceof AbstractRecursiveParserWrapperHandler)) {
            throw new IllegalStateException("ContentHandler must implement RecursiveParserWrapperHandler");
        }
        AbstractRecursiveParserWrapperHandler abstractRecursiveParserWrapperHandler = (AbstractRecursiveParserWrapperHandler) contentHandler;
        int i3 = 0;
        ParserState parserState = new ParserState(abstractRecursiveParserWrapperHandler, i3);
        parseContext.set(Parser.class, new EmbeddedParserDecorator(this, getWrappedParser(), parserState));
        ContentHandler newContentHandler = parserState.recursiveParserWrapperHandler.getNewContentHandler();
        long jCurrentTimeMillis = System.currentTimeMillis();
        parserState.recursiveParserWrapperHandler.startDocument();
        TemporaryResources temporaryResources = new TemporaryResources();
        if (contentHandler != null) {
            ContentHandlerFactory contentHandlerFactory = abstractRecursiveParserWrapperHandler.getContentHandlerFactory();
            if (contentHandlerFactory instanceof WriteLimiter) {
                WriteLimiter writeLimiter = (WriteLimiter) contentHandlerFactory;
                writeLimit = writeLimiter.getWriteLimit();
                zIsThrowOnWriteLimitReached = writeLimiter.isThrowOnWriteLimitReached();
            } else {
                writeLimit = -1;
                zIsThrowOnWriteLimitReached = true;
            }
        } else {
            writeLimit = -1;
            zIsThrowOnWriteLimitReached = true;
        }
        boolean z3 = zIsThrowOnWriteLimitReached;
        try {
            TikaInputStream tikaInputStream = TikaInputStream.get(inputStream, temporaryResources, metadata);
            SecureHandlerCounter secureHandlerCounter = new SecureHandlerCounter(writeLimit, i3);
            contentHandler2 = newContentHandler;
            try {
                RecursivelySecureContentHandler recursivelySecureContentHandler = new RecursivelySecureContentHandler(contentHandler2, tikaInputStream, secureHandlerCounter, z3, parseContext);
                parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                getWrappedParser().parse(tikaInputStream, recursivelySecureContentHandler, metadata, parseContext);
            } catch (Throwable th) {
                th = th;
                try {
                    if (th instanceof EncryptedDocumentException) {
                        metadata.set(TikaCoreProperties.IS_ENCRYPTED, "true");
                    }
                    if (!WriteLimitReachedException.isWriteLimitReached(th)) {
                        metadata.add(TikaCoreProperties.CONTAINER_EXCEPTION, ExceptionUtils.getFilteredStackTrace(th));
                        throw th;
                    }
                    metadata.set(TikaCoreProperties.WRITE_LIMIT_REACHED, "true");
                } catch (Throwable th2) {
                    temporaryResources.dispose();
                    metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                    parserState.recursiveParserWrapperHandler.endDocument(contentHandler2, metadata);
                    parserState.recursiveParserWrapperHandler.endDocument();
                    parseContext.set(RecursivelySecureContentHandler.class, null);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            contentHandler2 = newContentHandler;
        }
        temporaryResources.dispose();
        metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
        parserState.recursiveParserWrapperHandler.endDocument(contentHandler2, metadata);
        parserState.recursiveParserWrapperHandler.endDocument();
        parseContext.set(RecursivelySecureContentHandler.class, null);
    }

    public RecursiveParserWrapper(Parser parser, boolean z3) {
        super(parser);
        this.inlineContent = false;
        this.catchEmbeddedExceptions = z3;
    }
}
