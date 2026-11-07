package org.apache.tika.utils;

import F2.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLResolver;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.sax.SAXTransformerFactory;
import org.apache.tika.exception.TikaException;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.OfflineContentHandler;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes.dex */
public class XMLReaderUtils implements Serializable {
    public static final int DEFAULT_MAX_ENTITY_EXPANSIONS = 20;
    public static final int DEFAULT_NUM_REUSES = 100;
    public static final int DEFAULT_POOL_SIZE = 10;
    private static final String JAXP_ENTITY_EXPANSION_LIMIT_KEY = "jdk.xml.entityExpansionLimit";
    private static final String XERCES_SECURITY_MANAGER = "org.apache.xerces.util.SecurityManager";
    private static final String XERCES_SECURITY_MANAGER_PROPERTY = "http://apache.org/xml/properties/security-manager";
    private static final long serialVersionUID = 6110455808615143122L;
    private static final F2.b LOG = d.b(XMLReaderUtils.class);
    private static final AtomicBoolean HAS_WARNED_STAX = new AtomicBoolean(false);
    private static final ContentHandler IGNORING_CONTENT_HANDLER = new DefaultHandler();
    private static final DTDHandler IGNORING_DTD_HANDLER = new DTDHandler() { // from class: org.apache.tika.utils.XMLReaderUtils.1
        @Override // org.xml.sax.DTDHandler
        public void notationDecl(String str, String str2, String str3) {
        }

        @Override // org.xml.sax.DTDHandler
        public void unparsedEntityDecl(String str, String str2, String str3, String str4) {
        }
    };
    private static final ErrorHandler IGNORING_ERROR_HANDLER = new ErrorHandler() { // from class: org.apache.tika.utils.XMLReaderUtils.2
        @Override // org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) {
        }

        @Override // org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) {
        }

        @Override // org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) {
        }
    };
    private static final ReentrantReadWriteLock SAX_POOL_LOCK = new ReentrantReadWriteLock();
    private static final ReentrantReadWriteLock DOM_POOL_LOCK = new ReentrantReadWriteLock();
    private static final AtomicInteger POOL_GENERATION = new AtomicInteger();
    private static final EntityResolver IGNORING_SAX_ENTITY_RESOLVER = new b();
    private static final XMLResolver IGNORING_STAX_ENTITY_RESOLVER = new c();
    private static int POOL_SIZE = 10;
    private static int MAX_NUM_REUSES = 100;
    private static long LAST_LOG = -1;
    private static volatile int MAX_ENTITY_EXPANSIONS = determineMaxEntityExpansions();
    private static ArrayBlockingQueue<PoolSAXParser> SAX_PARSERS = new ArrayBlockingQueue<>(POOL_SIZE);
    private static ArrayBlockingQueue<PoolDOMBuilder> DOM_BUILDERS = new ArrayBlockingQueue<>(POOL_SIZE);

    public static class BuiltInPoolSAXParser extends PoolSAXParser {
        public BuiltInPoolSAXParser(int i3, SAXParser sAXParser) {
            super(i3, sAXParser);
        }

        @Override // org.apache.tika.utils.XMLReaderUtils.PoolSAXParser
        public void reset() {
            this.saxParser.reset();
            try {
                XMLReaderUtils.clearReader(this.saxParser.getXMLReader());
            } catch (SAXException unused) {
            }
        }
    }

    public static class PoolDOMBuilder {
        private final DocumentBuilder documentBuilder;
        int numUses = 0;
        private final int poolGeneration;

        public PoolDOMBuilder(int i3, DocumentBuilder documentBuilder) {
            this.poolGeneration = i3;
            this.documentBuilder = documentBuilder;
        }

        public DocumentBuilder getDocumentBuilder() {
            return this.documentBuilder;
        }

        public int getPoolGeneration() {
            return this.poolGeneration;
        }

        public void incrementUses() {
            this.numUses = 0;
        }

        public void reset() {
            this.documentBuilder.reset();
            this.documentBuilder.setEntityResolver(XMLReaderUtils.IGNORING_SAX_ENTITY_RESOLVER);
            this.documentBuilder.setErrorHandler(null);
        }
    }

    public static abstract class PoolSAXParser {
        int numUses = 0;
        final int poolGeneration;
        final SAXParser saxParser;

        public PoolSAXParser(int i3, SAXParser sAXParser) {
            this.poolGeneration = i3;
            this.saxParser = sAXParser;
        }

        public int getGeneration() {
            return this.poolGeneration;
        }

        public SAXParser getSAXParser() {
            return this.saxParser;
        }

        public void incrementUses() {
            this.numUses++;
        }

        public abstract void reset();
    }

    public static class UnrecognizedPoolSAXParser extends PoolSAXParser {
        public UnrecognizedPoolSAXParser(int i3, SAXParser sAXParser) {
            super(i3, sAXParser);
        }

        @Override // org.apache.tika.utils.XMLReaderUtils.PoolSAXParser
        public void reset() {
            try {
                this.saxParser.reset();
            } catch (UnsupportedOperationException unused) {
            }
            try {
                XMLReaderUtils.clearReader(this.saxParser.getXMLReader());
            } catch (SAXException unused2) {
            }
            XMLReaderUtils.trySetXercesSecurityManager(this.saxParser);
        }
    }

    public static class Xerces2PoolSAXParser extends PoolSAXParser {
        public Xerces2PoolSAXParser(int i3, SAXParser sAXParser) {
            super(i3, sAXParser);
        }

        @Override // org.apache.tika.utils.XMLReaderUtils.PoolSAXParser
        public void reset() {
            try {
                Object property = this.saxParser.getProperty(XMLReaderUtils.XERCES_SECURITY_MANAGER_PROPERTY);
                this.saxParser.reset();
                this.saxParser.setProperty(XMLReaderUtils.XERCES_SECURITY_MANAGER_PROPERTY, property);
            } catch (SAXException e3) {
                XMLReaderUtils.LOG.f("problem resetting sax parser", e3);
            }
            try {
                XMLReaderUtils.clearReader(this.saxParser.getXMLReader());
            } catch (SAXException unused) {
            }
        }
    }

    public static class XercesPoolSAXParser extends PoolSAXParser {
        public XercesPoolSAXParser(int i3, SAXParser sAXParser) {
            super(i3, sAXParser);
        }

        @Override // org.apache.tika.utils.XMLReaderUtils.PoolSAXParser
        public void reset() {
            try {
                XMLReaderUtils.clearReader(this.saxParser.getXMLReader());
            } catch (SAXException unused) {
            }
        }
    }

    static {
        try {
            setPoolSize(POOL_SIZE);
        } catch (TikaException e3) {
            throw new RuntimeException("problem initializing SAXParser and DOMBuilder pools", e3);
        }
    }

    private static PoolDOMBuilder acquireDOMBuilder() {
        ReentrantReadWriteLock reentrantReadWriteLock = DOM_POOL_LOCK;
        reentrantReadWriteLock.readLock().lock();
        try {
            PoolDOMBuilder poolDOMBuilderPoll = DOM_BUILDERS.poll();
            reentrantReadWriteLock.readLock().unlock();
            if (poolDOMBuilderPoll == null) {
                LOG.m("Contention waiting for a DOMBuilder. Consider increasing the XMLReaderUtils.POOL_SIZE");
            }
            return poolDOMBuilderPoll;
        } catch (Throwable th) {
            DOM_POOL_LOCK.readLock().unlock();
            throw th;
        }
    }

    private static PoolSAXParser acquireSAXParser() {
        ReentrantReadWriteLock reentrantReadWriteLock = SAX_POOL_LOCK;
        reentrantReadWriteLock.readLock().lock();
        try {
            PoolSAXParser poolSAXParserPoll = SAX_PARSERS.poll();
            reentrantReadWriteLock.readLock().unlock();
            if (poolSAXParserPoll == null) {
                LOG.m("Contention waiting for a SAXParser. Consider increasing the XMLReaderUtils.POOL_SIZE");
            }
            return poolSAXParserPoll;
        } catch (Throwable th) {
            SAX_POOL_LOCK.readLock().unlock();
            throw th;
        }
    }

    public static Document buildDOM(InputStream inputStream, ParseContext parseContext) throws TikaException {
        DocumentBuilder documentBuilder = (DocumentBuilder) parseContext.get(DocumentBuilder.class);
        PoolDOMBuilder poolDOMBuilderAcquireDOMBuilder = null;
        if (documentBuilder == null) {
            documentBuilder = (POOL_SIZE == 0 || (poolDOMBuilderAcquireDOMBuilder = acquireDOMBuilder()) == null) ? getDocumentBuilder() : poolDOMBuilderAcquireDOMBuilder.getDocumentBuilder();
        }
        try {
            return documentBuilder.parse(inputStream);
        } finally {
            releaseDOMBuilder(poolDOMBuilderAcquireDOMBuilder);
        }
    }

    private static PoolSAXParser buildPoolParser(int i3, SAXParser sAXParser) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        try {
            sAXParser.reset();
            z3 = true;
        } catch (UnsupportedOperationException unused) {
            z3 = false;
        }
        try {
            Object objNewInstance = Class.forName(XERCES_SECURITY_MANAGER).getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass().getMethod("setEntityExpansionLimit", Integer.TYPE).invoke(objNewInstance, Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            sAXParser.setProperty(XERCES_SECURITY_MANAGER_PROPERTY, objNewInstance);
            z4 = true;
        } catch (ClassNotFoundException unused2) {
            z4 = false;
        } catch (SecurityException e3) {
            throw e3;
        } catch (Throwable th) {
            if (System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(5L) + LAST_LOG) {
                LOG.f("SAX Security Manager could not be setup [log suppressed for 5 minutes]", th);
                LAST_LOG = System.currentTimeMillis();
            }
            z4 = false;
        }
        if (!z4) {
            try {
                sAXParser.setProperty("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
                z5 = true;
            } catch (SAXException e4) {
                if (System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(5L) + LAST_LOG) {
                    LOG.f("SAX Security Manager could not be setup [log suppressed for 5 minutes]", e4);
                    LAST_LOG = System.currentTimeMillis();
                }
            }
        }
        if (!z3 && z4) {
            return new XercesPoolSAXParser(i3, sAXParser);
        }
        if (z3 && z4) {
            return new Xerces2PoolSAXParser(i3, sAXParser);
        }
        return (z3 && !z4 && z5) ? new BuiltInPoolSAXParser(i3, sAXParser) : new UnrecognizedPoolSAXParser(i3, sAXParser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void clearReader(XMLReader xMLReader) {
        if (xMLReader == null) {
            return;
        }
        xMLReader.setContentHandler(IGNORING_CONTENT_HANDLER);
        xMLReader.setDTDHandler(IGNORING_DTD_HANDLER);
        xMLReader.setEntityResolver(IGNORING_SAX_ENTITY_RESOLVER);
        xMLReader.setErrorHandler(IGNORING_ERROR_HANDLER);
    }

    private static int determineMaxEntityExpansions() {
        String property = System.getProperty(JAXP_ENTITY_EXPANSION_LIMIT_KEY);
        if (property != null) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException unused) {
                LOG.r(property, 20, "Couldn't parse an integer for the entity expansion limit: {}; backing off to default: {}");
            }
        }
        return 20;
    }

    public static String getAttrValue(String str, Attributes attributes) {
        for (int i3 = 0; i3 < attributes.getLength(); i3++) {
            if (str.equals(attributes.getLocalName(i3))) {
                return attributes.getValue(i3);
            }
        }
        return null;
    }

    public static DocumentBuilder getDocumentBuilder() throws TikaException {
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = getDocumentBuilderFactory().newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setEntityResolver(IGNORING_SAX_ENTITY_RESOLVER);
            documentBuilderNewDocumentBuilder.setErrorHandler(null);
            return documentBuilderNewDocumentBuilder;
        } catch (ParserConfigurationException e3) {
            throw new TikaException("XML parser not available", e3);
        }
    }

    public static DocumentBuilderFactory getDocumentBuilderFactory() {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        F2.b bVar = LOG;
        if (bVar.d()) {
            bVar.s(documentBuilderFactoryNewInstance.getClass(), "DocumentBuilderFactory class {}");
        }
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setValidating(false);
        trySetSAXFeature(documentBuilderFactoryNewInstance, "http://javax.xml.XMLConstants/feature/secure-processing", true);
        trySetSAXFeature(documentBuilderFactoryNewInstance, "http://xml.org/sax/features/external-general-entities", false);
        trySetSAXFeature(documentBuilderFactoryNewInstance, "http://xml.org/sax/features/external-parameter-entities", false);
        trySetSAXFeature(documentBuilderFactoryNewInstance, "http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        trySetSAXFeature(documentBuilderFactoryNewInstance, "http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
        trySetXercesSecurityManager(documentBuilderFactoryNewInstance);
        return documentBuilderFactoryNewInstance;
    }

    public static int getMaxEntityExpansions() {
        return MAX_ENTITY_EXPANSIONS;
    }

    public static int getMaxNumReuses() {
        return MAX_NUM_REUSES;
    }

    public static int getPoolSize() {
        return POOL_SIZE;
    }

    public static SAXParser getSAXParser() throws TikaException {
        try {
            SAXParser sAXParserNewSAXParser = getSAXParserFactory().newSAXParser();
            trySetXercesSecurityManager(sAXParserNewSAXParser);
            return sAXParserNewSAXParser;
        } catch (ParserConfigurationException e3) {
            throw new TikaException("Unable to configure a SAX parser", e3);
        } catch (SAXException e4) {
            throw new TikaException("Unable to create a SAX parser", e4);
        }
    }

    public static SAXParserFactory getSAXParserFactory() {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        F2.b bVar = LOG;
        if (bVar.d()) {
            bVar.s(sAXParserFactoryNewInstance.getClass(), "SAXParserFactory class {}");
        }
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        sAXParserFactoryNewInstance.setValidating(false);
        trySetSAXFeature(sAXParserFactoryNewInstance, "http://javax.xml.XMLConstants/feature/secure-processing", true);
        trySetSAXFeature(sAXParserFactoryNewInstance, "http://xml.org/sax/features/external-general-entities", false);
        trySetSAXFeature(sAXParserFactoryNewInstance, "http://xml.org/sax/features/external-parameter-entities", false);
        trySetSAXFeature(sAXParserFactoryNewInstance, "http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        trySetSAXFeature(sAXParserFactoryNewInstance, "http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
        return sAXParserFactoryNewInstance;
    }

    public static SAXTransformerFactory getSAXTransformerFactory() throws TikaException {
        try {
            SAXTransformerFactory sAXTransformerFactory = (SAXTransformerFactory) TransformerFactory.newInstance();
            sAXTransformerFactory.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            trySetTransformerAttribute(sAXTransformerFactory, "http://javax.xml.XMLConstants/property/accessExternalDTD", StringUtils.EMPTY);
            trySetTransformerAttribute(sAXTransformerFactory, "http://javax.xml.XMLConstants/property/accessExternalStylesheet", StringUtils.EMPTY);
            return sAXTransformerFactory;
        } catch (TransformerConfigurationException | TransformerFactoryConfigurationError e3) {
            throw new TikaException("Transformer not available", e3);
        }
    }

    public static Transformer getTransformer() throws TikaException {
        try {
            return getTransformerFactory().newTransformer();
        } catch (TransformerConfigurationException e3) {
            throw new TikaException("Transformer not available", e3);
        }
    }

    public static TransformerFactory getTransformerFactory() throws TikaException {
        try {
            TransformerFactory transformerFactoryNewInstance = TransformerFactory.newInstance();
            transformerFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            trySetTransformerAttribute(transformerFactoryNewInstance, "http://javax.xml.XMLConstants/property/accessExternalDTD", StringUtils.EMPTY);
            trySetTransformerAttribute(transformerFactoryNewInstance, "http://javax.xml.XMLConstants/property/accessExternalStylesheet", StringUtils.EMPTY);
            return transformerFactoryNewInstance;
        } catch (TransformerConfigurationException | TransformerFactoryConfigurationError e3) {
            throw new TikaException("Transformer not available", e3);
        }
    }

    public static XMLInputFactory getXMLInputFactory() {
        XMLInputFactory xMLInputFactoryNewFactory = XMLInputFactory.newFactory();
        F2.b bVar = LOG;
        if (bVar.d()) {
            bVar.s(xMLInputFactoryNewFactory.getClass(), "XMLInputFactory class {}");
        }
        tryToSetStaxProperty(xMLInputFactoryNewFactory, "javax.xml.stream.isNamespaceAware", true);
        tryToSetStaxProperty(xMLInputFactoryNewFactory, "http://javax.xml.XMLConstants/property/accessExternalDTD", StringUtils.EMPTY);
        tryToSetStaxProperty(xMLInputFactoryNewFactory, "javax.xml.stream.isValidating", false);
        tryToSetStaxProperty(xMLInputFactoryNewFactory, "javax.xml.stream.supportDTD", false);
        tryToSetStaxProperty(xMLInputFactoryNewFactory, "javax.xml.stream.isSupportingExternalEntities", false);
        xMLInputFactoryNewFactory.setXMLResolver(IGNORING_STAX_ENTITY_RESOLVER);
        trySetStaxSecurityManager(xMLInputFactoryNewFactory);
        return xMLInputFactoryNewFactory;
    }

    public static XMLReader getXMLReader() throws TikaException {
        try {
            XMLReader xMLReader = getSAXParser().getXMLReader();
            xMLReader.setEntityResolver(IGNORING_SAX_ENTITY_RESOLVER);
            return xMLReader;
        } catch (SAXException e3) {
            throw new TikaException("Unable to create an XMLReader", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InputSource lambda$static$0(String str, String str2) {
        return new InputSource(new StringReader(StringUtils.EMPTY));
    }

    public static void parseSAX(InputStream inputStream, ContentHandler contentHandler, ParseContext parseContext) throws TikaException {
        SAXParser sAXParser = (SAXParser) parseContext.get(SAXParser.class);
        PoolSAXParser poolSAXParserAcquireSAXParser = null;
        if (sAXParser == null) {
            sAXParser = (POOL_SIZE == 0 || (poolSAXParserAcquireSAXParser = acquireSAXParser()) == null) ? getSAXParser() : poolSAXParserAcquireSAXParser.getSAXParser();
        }
        try {
            sAXParser.parse(inputStream, new OfflineContentHandler(contentHandler));
        } finally {
            releaseParser(poolSAXParserAcquireSAXParser);
        }
    }

    private static void releaseDOMBuilder(PoolDOMBuilder poolDOMBuilder) {
        if (poolDOMBuilder != null && poolDOMBuilder.getPoolGeneration() == POOL_GENERATION.get()) {
            try {
                poolDOMBuilder.reset();
            } catch (UnsupportedOperationException unused) {
            }
            DOM_POOL_LOCK.readLock().lock();
            poolDOMBuilder.incrementUses();
            if (poolDOMBuilder.numUses >= MAX_NUM_REUSES) {
                try {
                    poolDOMBuilder = new PoolDOMBuilder(poolDOMBuilder.getPoolGeneration(), getDocumentBuilderFactory().newDocumentBuilder());
                } catch (ParserConfigurationException e3) {
                    LOG.f("Exception trying to configure a new dom builder?!", e3);
                    return;
                }
            }
            try {
                if (!DOM_BUILDERS.offer(poolDOMBuilder)) {
                    LOG.m("DocumentBuilder not taken back into pool.  If you haven't resized the pool, this could be a sign that there are more calls to 'acquire' than to 'release'");
                }
            } finally {
                DOM_POOL_LOCK.readLock().unlock();
            }
        }
    }

    private static void releaseParser(PoolSAXParser poolSAXParser) {
        ReentrantReadWriteLock.ReadLock lock;
        if (poolSAXParser == null) {
            return;
        }
        try {
            poolSAXParser.reset();
        } catch (UnsupportedOperationException unused) {
        }
        if (poolSAXParser.getGeneration() != POOL_GENERATION.get()) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = SAX_POOL_LOCK;
        reentrantReadWriteLock.readLock().lock();
        try {
            poolSAXParser.incrementUses();
            if (poolSAXParser.numUses >= MAX_NUM_REUSES) {
                try {
                    poolSAXParser = buildPoolParser(poolSAXParser.getGeneration(), getSAXParserFactory().newSAXParser());
                } catch (ParserConfigurationException | SAXException e3) {
                    LOG.f("Couldn't build new SAXParser after hitting max reuses", e3);
                    lock = SAX_POOL_LOCK.readLock();
                }
            }
            if (!SAX_PARSERS.offer(poolSAXParser)) {
                LOG.m("SAXParser not taken back into pool.  If you haven't resized the pool this could be a sign that there are more calls to 'acquire' than to 'release'");
            }
            lock = reentrantReadWriteLock.readLock();
            lock.unlock();
        } catch (Throwable th) {
            SAX_POOL_LOCK.readLock().unlock();
            throw th;
        }
    }

    public static void setMaxEntityExpansions(int i3) {
        MAX_ENTITY_EXPANSIONS = i3;
    }

    public static void setMaxNumReuses(int i3) {
        MAX_NUM_REUSES = i3;
    }

    public static void setPoolSize(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("PoolSize must be >= 0");
        }
        SAX_POOL_LOCK.writeLock().lock();
        try {
            Iterator<PoolSAXParser> it2 = SAX_PARSERS.iterator();
            while (it2.hasNext()) {
                it2.next().reset();
            }
            SAX_PARSERS.clear();
            if (i3 > 0) {
                SAX_PARSERS = new ArrayBlockingQueue<>(i3);
                int iIncrementAndGet = POOL_GENERATION.incrementAndGet();
                for (int i4 = 0; i4 < i3; i4++) {
                    try {
                        SAX_PARSERS.offer(buildPoolParser(iIncrementAndGet, getSAXParserFactory().newSAXParser()));
                    } catch (ParserConfigurationException | SAXException e3) {
                        throw new TikaException("problem creating sax parser", e3);
                    }
                }
            }
            SAX_POOL_LOCK.writeLock().unlock();
            DOM_POOL_LOCK.writeLock().lock();
            try {
                DOM_BUILDERS.clear();
                if (i3 > 0) {
                    DOM_BUILDERS = new ArrayBlockingQueue<>(i3);
                    for (int i5 = 0; i5 < i3; i5++) {
                        DOM_BUILDERS.offer(new PoolDOMBuilder(POOL_GENERATION.get(), getDocumentBuilder()));
                    }
                }
                DOM_POOL_LOCK.writeLock().unlock();
                POOL_SIZE = i3;
            } catch (Throwable th) {
                DOM_POOL_LOCK.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            SAX_POOL_LOCK.writeLock().unlock();
            throw th2;
        }
    }

    private static void trySetSAXFeature(SAXParserFactory sAXParserFactory, String str, boolean z3) {
        try {
            sAXParserFactory.setFeature(str, z3);
        } catch (AbstractMethodError e3) {
            LOG.r(str, e3, "Cannot set SAX feature because outdated XML parser in classpath: {}");
        } catch (SecurityException e4) {
            throw e4;
        } catch (Exception e5) {
            LOG.r(str, e5, "SAX Feature unsupported: {}");
        }
    }

    private static void trySetStaxSecurityManager(XMLInputFactory xMLInputFactory) {
        try {
            try {
                xMLInputFactory.setProperty("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            } catch (IllegalArgumentException unused) {
                xMLInputFactory.setProperty("com.ctc.wstx.maxEntityCount", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            }
        } catch (IllegalArgumentException unused2) {
            if (HAS_WARNED_STAX.getAndSet(true)) {
                return;
            }
            LOG.m("Could not set limit on maximum entity expansions for: ".concat(String.valueOf(xMLInputFactory.getClass())));
        }
    }

    private static void trySetTransformerAttribute(TransformerFactory transformerFactory, String str, String str2) {
        try {
            transformerFactory.setAttribute(str, str2);
        } catch (AbstractMethodError e3) {
            LOG.r(str, e3, "Cannot set Transformer attribute because outdated XML parser in classpath: {}");
        } catch (SecurityException e4) {
            throw e4;
        } catch (Exception e5) {
            LOG.r(str, e5, "Transformer Attribute unsupported: {}");
        }
    }

    private static void trySetXercesSecurityManager(DocumentBuilderFactory documentBuilderFactory) {
        try {
            Object objNewInstance = Class.forName(new String[]{XERCES_SECURITY_MANAGER}[0]).getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass().getMethod("setEntityExpansionLimit", Integer.TYPE).invoke(objNewInstance, Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            documentBuilderFactory.setAttribute(XERCES_SECURITY_MANAGER_PROPERTY, objNewInstance);
        } catch (ClassNotFoundException unused) {
            try {
                documentBuilderFactory.setAttribute("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            } catch (IllegalArgumentException e3) {
                if (System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(5L) + LAST_LOG) {
                    LOG.f("SAX Security Manager could not be setup [log suppressed for 5 minutes]", e3);
                    LAST_LOG = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            if (System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(5L) + LAST_LOG) {
                LOG.f("SAX Security Manager could not be setup [log suppressed for 5 minutes]", th);
                LAST_LOG = System.currentTimeMillis();
            }
            documentBuilderFactory.setAttribute("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
        }
    }

    private static void tryToSetStaxProperty(XMLInputFactory xMLInputFactory, String str, boolean z3) {
        try {
            xMLInputFactory.setProperty(str, Boolean.valueOf(z3));
        } catch (IllegalArgumentException e3) {
            LOG.r(str, e3, "StAX Feature unsupported: {}");
        }
    }

    private static void tryToSetStaxProperty(XMLInputFactory xMLInputFactory, String str, String str2) {
        try {
            xMLInputFactory.setProperty(str, str2);
        } catch (IllegalArgumentException e3) {
            LOG.r(str, e3, "StAX Feature unsupported: {}");
        }
    }

    public static Transformer getTransformer(ParseContext parseContext) {
        Transformer transformer = (Transformer) parseContext.get(Transformer.class);
        return transformer != null ? transformer : getTransformer();
    }

    private static void trySetSAXFeature(DocumentBuilderFactory documentBuilderFactory, String str, boolean z3) {
        try {
            documentBuilderFactory.setFeature(str, z3);
        } catch (AbstractMethodError e3) {
            LOG.r(str, e3, "Cannot set SAX feature because outdated XML parser in classpath: {}");
        } catch (Exception e4) {
            LOG.r(str, e4, "SAX Feature unsupported: {}");
        }
    }

    public static DocumentBuilder getDocumentBuilder(ParseContext parseContext) {
        DocumentBuilder documentBuilder = (DocumentBuilder) parseContext.get(DocumentBuilder.class);
        return documentBuilder != null ? documentBuilder : getDocumentBuilder();
    }

    public static Document buildDOM(Reader reader, ParseContext parseContext) throws TikaException {
        DocumentBuilder documentBuilder = (DocumentBuilder) parseContext.get(DocumentBuilder.class);
        PoolDOMBuilder poolDOMBuilderAcquireDOMBuilder = null;
        if (documentBuilder == null) {
            if (POOL_SIZE != 0 && (poolDOMBuilderAcquireDOMBuilder = acquireDOMBuilder()) != null) {
                documentBuilder = poolDOMBuilderAcquireDOMBuilder.getDocumentBuilder();
            } else {
                documentBuilder = getDocumentBuilder();
            }
        }
        try {
            return documentBuilder.parse(new InputSource(reader));
        } finally {
            releaseDOMBuilder(poolDOMBuilderAcquireDOMBuilder);
        }
    }

    public static void parseSAX(Reader reader, ContentHandler contentHandler, ParseContext parseContext) throws TikaException {
        SAXParser sAXParser = (SAXParser) parseContext.get(SAXParser.class);
        PoolSAXParser poolSAXParserAcquireSAXParser = null;
        if (sAXParser == null) {
            if (POOL_SIZE != 0 && (poolSAXParserAcquireSAXParser = acquireSAXParser()) != null) {
                sAXParser = poolSAXParserAcquireSAXParser.getSAXParser();
            } else {
                sAXParser = getSAXParser();
            }
        }
        try {
            sAXParser.parse(new InputSource(reader), new OfflineContentHandler(contentHandler));
        } finally {
            releaseParser(poolSAXParserAcquireSAXParser);
        }
    }

    public static XMLInputFactory getXMLInputFactory(ParseContext parseContext) {
        XMLInputFactory xMLInputFactory = (XMLInputFactory) parseContext.get(XMLInputFactory.class);
        return xMLInputFactory != null ? xMLInputFactory : getXMLInputFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void trySetXercesSecurityManager(SAXParser sAXParser) {
        try {
            Object objNewInstance = Class.forName(new String[]{XERCES_SECURITY_MANAGER}[0]).getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass().getMethod("setEntityExpansionLimit", Integer.TYPE).invoke(objNewInstance, Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            sAXParser.setProperty(XERCES_SECURITY_MANAGER_PROPERTY, objNewInstance);
        } catch (ClassNotFoundException unused) {
            try {
                sAXParser.setProperty("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            } catch (SAXException e3) {
                if (System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(5L) + LAST_LOG) {
                    LOG.f("SAX Security Manager could not be setup [log suppressed for 5 minutes]", e3);
                    LAST_LOG = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            if (System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(5L) + LAST_LOG) {
                LOG.f("SAX Security Manager could not be setup [log suppressed for 5 minutes]", th);
                LAST_LOG = System.currentTimeMillis();
            }
            sAXParser.setProperty("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
        }
    }

    public static Document buildDOM(Path path) throws IOException {
        InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            Document documentBuildDOM = buildDOM(inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return documentBuildDOM;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static Document buildDOM(String str) throws TikaException {
        PoolDOMBuilder poolDOMBuilderAcquireDOMBuilder;
        DocumentBuilder documentBuilder;
        if (POOL_SIZE == 0) {
            documentBuilder = getDocumentBuilder();
            poolDOMBuilderAcquireDOMBuilder = null;
        } else {
            poolDOMBuilderAcquireDOMBuilder = acquireDOMBuilder();
            if (poolDOMBuilderAcquireDOMBuilder != null) {
                documentBuilder = poolDOMBuilderAcquireDOMBuilder.getDocumentBuilder();
            } else {
                documentBuilder = getDocumentBuilder();
            }
        }
        try {
            return documentBuilder.parse(str);
        } finally {
            releaseDOMBuilder(poolDOMBuilderAcquireDOMBuilder);
        }
    }

    public static Document buildDOM(InputStream inputStream) throws TikaException {
        PoolDOMBuilder poolDOMBuilderAcquireDOMBuilder;
        DocumentBuilder documentBuilder;
        if (POOL_SIZE == 0) {
            documentBuilder = getDocumentBuilder();
            poolDOMBuilderAcquireDOMBuilder = null;
        } else {
            poolDOMBuilderAcquireDOMBuilder = acquireDOMBuilder();
            if (poolDOMBuilderAcquireDOMBuilder != null) {
                documentBuilder = poolDOMBuilderAcquireDOMBuilder.getDocumentBuilder();
            } else {
                documentBuilder = getDocumentBuilder();
            }
        }
        try {
            return documentBuilder.parse(inputStream);
        } finally {
            releaseDOMBuilder(poolDOMBuilderAcquireDOMBuilder);
        }
    }
}
