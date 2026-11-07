package org.apache.tika.pipes;

import B1.e;
import F2.d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.EncryptedDocumentException;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.extractor.BasicEmbeddedDocumentBytesHandler;
import org.apache.tika.extractor.DocumentSelector;
import org.apache.tika.extractor.EmbeddedDocumentByteStoreExtractorFactory;
import org.apache.tika.extractor.EmbeddedDocumentBytesHandler;
import org.apache.tika.extractor.EmbeddedDocumentExtractor;
import org.apache.tika.extractor.EmbeddedDocumentExtractorFactory;
import org.apache.tika.extractor.RUnpackExtractor;
import org.apache.tika.extractor.RUnpackExtractorFactory;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.metadata.filter.MetadataFilter;
import org.apache.tika.metadata.listfilter.MetadataListFilter;
import org.apache.tika.metadata.listfilter.NoOpListFilter;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.RecursiveParserWrapper;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.StreamEmitter;
import org.apache.tika.pipes.emitter.TikaEmitterException;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.pipes.extractor.EmittingEmbeddedDocumentBytesHandler;
import org.apache.tika.pipes.fetcher.Fetcher;
import org.apache.tika.pipes.fetcher.FetcherManager;
import org.apache.tika.sax.BasicContentHandlerFactory;
import org.apache.tika.sax.RecursiveParserWrapperHandler;
import org.apache.tika.utils.ExceptionUtils;
import org.apache.tika.utils.StringUtils;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import s2.c;
import w2.g;
import w2.h;

/* JADX INFO: loaded from: classes.dex */
public class PipesServer implements Runnable {
    private static final F2.b LOG = d.b(PipesServer.class);
    public static final int TIMEOUT_EXIT_CODE = 17;
    private Parser autoDetectParser;
    private Detector detector;
    private DigestingParser.Digester digester;
    private EmitterManager emitterManager;
    private FetcherManager fetcherManager;
    private final DataInputStream input;
    private final long maxForEmitBatchBytes;
    private final DataOutputStream output;
    private Parser rMetaParser;
    private final long serverParseTimeoutMillis;
    private final long serverWaitTimeoutMillis;
    private TikaConfig tikaConfig;
    private final Path tikaConfigPath;
    private final Object[] lock = new Object[0];
    private long checkForTimeoutMs = 1000;
    private volatile boolean parsing = false;
    private volatile long since = System.currentTimeMillis();

    public static class MetadataListAndEmbeddedBytes {
        final Optional<EmbeddedDocumentBytesHandler> embeddedDocumentBytesHandler;
        List<Metadata> metadataList;

        public MetadataListAndEmbeddedBytes(List<Metadata> list, EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler) {
            this.metadataList = list;
            this.embeddedDocumentBytesHandler = Optional.ofNullable(embeddedDocumentBytesHandler);
        }

        public void filter(MetadataListFilter metadataListFilter) {
            this.metadataList = metadataListFilter.filter(this.metadataList);
        }

        public EmbeddedDocumentBytesHandler getEmbeddedDocumentBytesHandler() {
            return this.embeddedDocumentBytesHandler.get();
        }

        public List<Metadata> getMetadataList() {
            return this.metadataList;
        }

        public boolean hasEmbeddedDocumentByteStore() {
            return this.embeddedDocumentBytesHandler.isPresent();
        }

        public boolean toBePackagedForStreamEmitter() {
            return !(this.embeddedDocumentBytesHandler.get() instanceof EmittingEmbeddedDocumentBytesHandler);
        }
    }

    public enum STATUS {
        READY,
        CALL,
        PING,
        FAILED_TO_START,
        FETCHER_NOT_FOUND,
        EMITTER_NOT_FOUND,
        FETCHER_INITIALIZATION_EXCEPTION,
        FETCH_EXCEPTION,
        PARSE_SUCCESS,
        PARSE_EXCEPTION_NO_EMIT,
        EMIT_SUCCESS,
        EMIT_SUCCESS_PARSE_EXCEPTION,
        EMIT_EXCEPTION,
        OOM,
        TIMEOUT,
        EMPTY_OUTPUT,
        INTERMEDIATE_RESULT;

        public static STATUS lookup(int i3) {
            int i4 = i3 - 1;
            if (i4 < 0) {
                throw new IllegalArgumentException("byte must be > 0");
            }
            STATUS[] statusArrValues = values();
            if (i4 < statusArrValues.length) {
                return statusArrValues[i4];
            }
            throw new IllegalArgumentException(e.i("byte with index ", i4, " must be < ", statusArrValues.length));
        }

        public byte getByte() {
            return (byte) (ordinal() + 1);
        }
    }

    public PipesServer(Path path, InputStream inputStream, PrintStream printStream, long j3, long j4, long j5) {
        this.tikaConfigPath = path;
        this.input = new DataInputStream(inputStream);
        this.output = new DataOutputStream(printStream);
        this.maxForEmitBatchBytes = j3;
        this.serverParseTimeoutMillis = j4;
        this.serverWaitTimeoutMillis = j5;
    }

    private void _preParse(FetchEmitTuple fetchEmitTuple, TikaInputStream tikaInputStream, Metadata metadata, ParseContext parseContext) {
        DigestingParser.Digester digester = this.digester;
        if (digester != null) {
            try {
                digester.digest(tikaInputStream, metadata, parseContext);
            } catch (IOException e3) {
                LOG.f("problem digesting: " + fetchEmitTuple.getId(), e3);
            }
        }
        try {
            MediaType mediaTypeDetect = this.detector.detect(tikaInputStream, metadata);
            metadata.set(HttpHeaders.CONTENT_TYPE, mediaTypeDetect.toString());
            metadata.set(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE, mediaTypeDetect.toString());
        } catch (IOException e4) {
            LOG.f("problem detecting: " + fetchEmitTuple.getId(), e4);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig == null || !embeddedDocumentBytesConfig.isIncludeOriginal()) {
            return;
        }
        EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler = (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class);
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(tikaInputStream.getPath(), new OpenOption[0]);
            try {
                embeddedDocumentBytesHandler.add(0, metadata, inputStreamNewInputStream);
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
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
        } catch (IOException e5) {
            LOG.f("problem reading source file into embedded document byte store", e5);
        }
    }

    private void actuallyParse(FetchEmitTuple fetchEmitTuple) throws Throwable {
        MetadataListAndEmbeddedBytes fromTuple;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Fetcher fetcher = getFetcher(fetchEmitTuple);
        if (fetcher == null) {
            return;
        }
        F2.b bVar = LOG;
        if (bVar.v()) {
            bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- got fetcher: {}ms");
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        try {
            fromTuple = parseFromTuple(fetchEmitTuple, fetcher);
            try {
                if (bVar.v()) {
                    bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2), "timer -- to parse: {} ms");
                }
                try {
                    if (fromTuple != null && !metadataIsEmpty(fromTuple.getMetadataList())) {
                        emitParseData(fetchEmitTuple, fromTuple);
                        if (!fromTuple.hasEmbeddedDocumentByteStore() || fromTuple.getEmbeddedDocumentBytesHandler() == null) {
                            return;
                        }
                        fromTuple.getEmbeddedDocumentBytesHandler().close();
                        return;
                    }
                    write(STATUS.EMPTY_OUTPUT);
                    if (fromTuple == null || !fromTuple.hasEmbeddedDocumentByteStore() || fromTuple.getEmbeddedDocumentBytesHandler() == null) {
                        return;
                    }
                    fromTuple.getEmbeddedDocumentBytesHandler().close();
                } catch (IOException e3) {
                    LOG.f("problem closing embedded document byte store", e3);
                }
            } catch (Throwable th) {
                th = th;
                if (fromTuple != null && fromTuple.hasEmbeddedDocumentByteStore() && fromTuple.getEmbeddedDocumentBytesHandler() != null) {
                    try {
                        fromTuple.getEmbeddedDocumentBytesHandler().close();
                    } catch (IOException e4) {
                        LOG.f("problem closing embedded document byte store", e4);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fromTuple = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a A[Catch: TikaEmitterException -> 0x0016, IOException -> 0x0018, TRY_LEAVE, TryCatch #3 {IOException -> 0x0018, TikaEmitterException -> 0x0016, blocks: (B:4:0x000c, B:6:0x0012, B:11:0x001a), top: B:24:0x000c }] */
    private void emit(String str, EmitKey emitKey, boolean z3, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes, String str2, ParseContext parseContext) {
        try {
            Emitter emitter = this.emitterManager.getEmitter(emitKey.getEmitterName());
            if (z3) {
                try {
                    if (metadataListAndEmbeddedBytes.toBePackagedForStreamEmitter()) {
                        emitContentsAndBytes(emitter, emitKey, metadataListAndEmbeddedBytes);
                    } else {
                        emitter.emit(emitKey.getEmitKey(), metadataListAndEmbeddedBytes.getMetadataList(), parseContext);
                    }
                } catch (IOException e3) {
                    e = e3;
                    LOG.f("emit exception", e);
                    write(STATUS.EMIT_EXCEPTION, ExceptionUtils.getStackTrace(e).getBytes(StandardCharsets.UTF_8));
                    return;
                } catch (TikaEmitterException e4) {
                    e = e4;
                    LOG.f("emit exception", e);
                    write(STATUS.EMIT_EXCEPTION, ExceptionUtils.getStackTrace(e).getBytes(StandardCharsets.UTF_8));
                    return;
                }
            } else {
                emitter.emit(emitKey.getEmitKey(), metadataListAndEmbeddedBytes.getMetadataList(), parseContext);
            }
            if (StringUtils.isBlank(str2)) {
                write(STATUS.EMIT_SUCCESS);
            } else {
                write(STATUS.EMIT_SUCCESS_PARSE_EXCEPTION, str2.getBytes(StandardCharsets.UTF_8));
            }
        } catch (IllegalArgumentException unused) {
            String noEmitterMsg = getNoEmitterMsg(str);
            LOG.m(noEmitterMsg);
            write(STATUS.EMITTER_NOT_FOUND, noEmitterMsg);
        }
    }

    private void emitContentsAndBytes(Emitter emitter, EmitKey emitKey, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        if (!(emitter instanceof StreamEmitter)) {
            throw new IllegalArgumentException("The emitter for embedded document byte store must be a StreamEmitter. I see: ".concat(String.valueOf(emitter.getClass())));
        }
        throw new UnsupportedOperationException("this is not yet implemented");
    }

    private void emitParseData(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        EmitKey emitKey;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String containerStacktrace = getContainerStacktrace(fetchEmitTuple, metadataListAndEmbeddedBytes.getMetadataList());
        filterMetadata(fetchEmitTuple, metadataListAndEmbeddedBytes.getMetadataList());
        filterMetadataList(fetchEmitTuple, metadataListAndEmbeddedBytes);
        ParseContext parseContext = fetchEmitTuple.getParseContext();
        FetchEmitTuple.ON_PARSE_EXCEPTION onParseException = fetchEmitTuple.getOnParseException();
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (!StringUtils.isBlank(containerStacktrace) && onParseException != FetchEmitTuple.ON_PARSE_EXCEPTION.EMIT) {
            write(STATUS.PARSE_EXCEPTION_NO_EMIT, containerStacktrace);
            return;
        }
        injectUserMetadata(fetchEmitTuple.getMetadata(), metadataListAndEmbeddedBytes.getMetadataList());
        EmitKey emitKey2 = fetchEmitTuple.getEmitKey();
        if (StringUtils.isBlank(emitKey2.getEmitKey())) {
            EmitKey emitKey3 = new EmitKey(emitKey2.getEmitterName(), fetchEmitTuple.getFetchKey().getFetchKey());
            fetchEmitTuple.setEmitKey(emitKey3);
            emitKey = emitKey3;
        } else {
            emitKey = emitKey2;
        }
        EmitData emitData = new EmitData(fetchEmitTuple.getEmitKey(), metadataListAndEmbeddedBytes.getMetadataList(), containerStacktrace);
        if (embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes() && metadataListAndEmbeddedBytes.toBePackagedForStreamEmitter()) {
            emit(fetchEmitTuple.getId(), emitKey, embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes(), metadataListAndEmbeddedBytes, containerStacktrace, parseContext);
        } else if (this.maxForEmitBatchBytes < 0 || emitData.getEstimatedSizeBytes() < this.maxForEmitBatchBytes) {
            write(emitData);
        } else {
            emit(fetchEmitTuple.getId(), emitKey, embeddedDocumentBytesConfig.isExtractEmbeddedDocumentBytes(), metadataListAndEmbeddedBytes, containerStacktrace, parseContext);
        }
        F2.b bVar = LOG;
        if (bVar.v()) {
            bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- emitted: {} ms");
        }
    }

    private void exit(int i3) {
        if (i3 != 0) {
            LOG.a(Integer.valueOf(i3), "exiting: {}");
        } else {
            LOG.z("exiting: {}", Integer.valueOf(i3));
        }
        System.exit(i3);
    }

    private void filterMetadata(FetchEmitTuple fetchEmitTuple, List<Metadata> list) {
        MetadataFilter metadataFilter = (MetadataFilter) fetchEmitTuple.getParseContext().get(MetadataFilter.class);
        if (metadataFilter == null) {
            metadataFilter = this.tikaConfig.getMetadataFilter();
        }
        Iterator<Metadata> it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                metadataFilter.filter(it2.next());
            } catch (TikaException e3) {
                LOG.f("failed to filter metadata", e3);
            }
        }
    }

    private void filterMetadataList(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        MetadataListFilter metadataListFilter = (MetadataListFilter) fetchEmitTuple.getParseContext().get(MetadataListFilter.class);
        if (metadataListFilter == null) {
            metadataListFilter = this.tikaConfig.getMetadataListFilter();
        }
        if (metadataListFilter instanceof NoOpListFilter) {
            return;
        }
        try {
            metadataListAndEmbeddedBytes.filter(metadataListFilter);
        } catch (TikaException e3) {
            LOG.f("failed to filter metadata list", e3);
        }
    }

    private String getContainerStacktrace(FetchEmitTuple fetchEmitTuple, List<Metadata> list) {
        String str;
        return (metadataIsEmpty(list) || (str = list.get(0).get(TikaCoreProperties.CONTAINER_EXCEPTION)) == null) ? StringUtils.EMPTY : str;
    }

    private Fetcher getFetcher(FetchEmitTuple fetchEmitTuple) {
        try {
            return this.fetcherManager.getFetcher(fetchEmitTuple.getFetchKey().getFetcherName());
        } catch (IOException e3) {
            e = e3;
            LOG.f("Couldn't initialize fetcher for fetch id '" + fetchEmitTuple.getId() + "'", e);
            write(STATUS.FETCHER_INITIALIZATION_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        } catch (IllegalArgumentException unused) {
            String noFetcherMsg = getNoFetcherMsg(fetchEmitTuple.getFetchKey().getFetcherName());
            LOG.m(noFetcherMsg);
            write(STATUS.FETCHER_NOT_FOUND, noFetcherMsg);
            return null;
        } catch (TikaException e4) {
            e = e4;
            LOG.f("Couldn't initialize fetcher for fetch id '" + fetchEmitTuple.getId() + "'", e);
            write(STATUS.FETCHER_INITIALIZATION_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

    private String getNoEmitterMsg(String str) {
        StringBuilder sb = new StringBuilder("Emitter '");
        sb.append(str);
        sb.append("' not found.\nThe configured emitterManager supports:");
        int i3 = 0;
        for (String str2 : this.emitterManager.getSupported()) {
            int i4 = i3 + 1;
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(str2);
            i3 = i4;
        }
        return sb.toString();
    }

    private String getNoFetcherMsg(String str) {
        StringBuilder sb = new StringBuilder("Fetcher '");
        sb.append(str);
        sb.append("' not found.\nThe configured FetcherManager supports:");
        int i3 = 0;
        for (String str2 : this.fetcherManager.getSupported()) {
            int i4 = i3 + 1;
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(str2);
            i3 = i4;
        }
        return sb.toString();
    }

    private void handleOOM(String str, OutOfMemoryError outOfMemoryError) {
        write(STATUS.OOM);
        LOG.j("oom: " + str, outOfMemoryError);
        exit(1);
    }

    private void injectUserMetadata(Metadata metadata, List<Metadata> list) {
        for (String str : metadata.names()) {
            list.get(0).set(str, (String) null);
            for (String str2 : metadata.getValues(str)) {
                list.get(0).add(str, str2);
            }
        }
    }

    public static void main(String[] strArr) {
        try {
            PipesServer pipesServer = new PipesServer(Paths.get(strArr[0], new String[0]), System.in, System.out, Long.parseLong(strArr[1]), Long.parseLong(strArr[2]), Long.parseLong(strArr[3]));
            int i3 = h.f4677o;
            g gVar = new g();
            gVar.W(new byte[0]);
            System.setIn(new h(gVar));
            System.setOut(System.err);
            Thread thread = new Thread(pipesServer, "Tika Watchdog");
            thread.setDaemon(true);
            thread.start();
            pipesServer.processRequests();
        } finally {
            LOG.k("server shutting down");
        }
    }

    private boolean metadataIsEmpty(List<Metadata> list) {
        return list == null || list.size() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090 A[PHI: r14
      0x0090: PHI (r14v3 F2.b) = (r14v1 F2.b), (r14v2 F2.b), (r14v4 F2.b) binds: [B:22:0x008e, B:31:0x00e1, B:38:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    private List<Metadata> parseConcatenated(FetchEmitTuple fetchEmitTuple, HandlerConfig handlerConfig, InputStream inputStream, Metadata metadata, ParseContext parseContext) {
        F2.b bVar;
        ContentHandler newContentHandler = new BasicContentHandlerFactory(handlerConfig.getType(), handlerConfig.getWriteLimit(), handlerConfig.isThrowOnWriteLimitReached(), parseContext).getNewContentHandler();
        parseContext.set(DocumentSelector.class, new DocumentSelector(handlerConfig) { // from class: org.apache.tika.pipes.PipesServer.1
            int embedded = 0;
            final int maxEmbedded;
            final /* synthetic */ HandlerConfig val$handlerConfig;

            {
                this.val$handlerConfig = handlerConfig;
                this.maxEmbedded = handlerConfig.maxEmbeddedResources;
            }

            @Override // org.apache.tika.extractor.DocumentSelector
            public boolean select(Metadata metadata2) {
                int i3 = this.maxEmbedded;
                if (i3 < 0) {
                    return true;
                }
                int i4 = this.embedded;
                this.embedded = i4 + 1;
                return i4 < i3;
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        preParse(fetchEmitTuple, inputStream, metadata, parseContext);
        try {
            try {
                try {
                    try {
                        this.autoDetectParser.parse(inputStream, newContentHandler, metadata, parseContext);
                        metadata.add(TikaCoreProperties.TIKA_CONTENT, newContentHandler.toString());
                        F2.b bVar2 = LOG;
                        if (bVar2.v()) {
                            bVar2.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- parse only time: {} ms");
                        }
                    } catch (SecurityException e3) {
                        LOG.f("security exception:" + fetchEmitTuple.getId(), e3);
                        throw e3;
                    }
                } catch (SAXException e4) {
                    String stackTrace = ExceptionUtils.getStackTrace(e4);
                    bVar = LOG;
                    bVar.f("sax problem:" + fetchEmitTuple.getId(), e4);
                    metadata.add(TikaCoreProperties.TIKA_CONTENT, newContentHandler.toString());
                    if (stackTrace != null) {
                        metadata.add(TikaCoreProperties.CONTAINER_EXCEPTION, stackTrace);
                    }
                    if (bVar.v()) {
                        bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- parse only time: {} ms");
                    }
                }
            } catch (EncryptedDocumentException e5) {
                String stackTrace2 = ExceptionUtils.getStackTrace(e5);
                bVar = LOG;
                bVar.f("encrypted document:" + fetchEmitTuple.getId(), e5);
                metadata.add(TikaCoreProperties.TIKA_CONTENT, newContentHandler.toString());
                if (stackTrace2 != null) {
                    metadata.add(TikaCoreProperties.CONTAINER_EXCEPTION, stackTrace2);
                }
                if (bVar.v()) {
                    bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- parse only time: {} ms");
                }
            } catch (Exception e6) {
                String stackTrace3 = ExceptionUtils.getStackTrace(e6);
                bVar = LOG;
                bVar.f("parse exception: " + fetchEmitTuple.getId(), e6);
                metadata.add(TikaCoreProperties.TIKA_CONTENT, newContentHandler.toString());
                if (stackTrace3 != null) {
                    metadata.add(TikaCoreProperties.CONTAINER_EXCEPTION, stackTrace3);
                }
                if (bVar.v()) {
                    bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- parse only time: {} ms");
                }
            }
            return Collections.singletonList(metadata);
        } catch (Throwable th) {
            metadata.add(TikaCoreProperties.TIKA_CONTENT, newContentHandler.toString());
            if (0 != 0) {
                metadata.add(TikaCoreProperties.CONTAINER_EXCEPTION, (String) null);
            }
            F2.b bVar3 = LOG;
            if (bVar3.v()) {
                bVar3.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- parse only time: {} ms");
            }
            throw th;
        }
    }

    private void parseOne() {
        synchronized (this.lock) {
            this.parsing = true;
            this.since = System.currentTimeMillis();
        }
        FetchEmitTuple fetchEmitTuple = null;
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                fetchEmitTuple = readFetchEmitTuple();
                F2.b bVar = LOG;
                if (bVar.v()) {
                    bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- read fetchEmitTuple: {} ms");
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                actuallyParse(fetchEmitTuple);
                if (bVar.v()) {
                    bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2), "timer -- actually parsed: {} ms");
                }
                synchronized (this.lock) {
                    this.parsing = false;
                    this.since = System.currentTimeMillis();
                }
            } catch (OutOfMemoryError e3) {
                handleOOM(fetchEmitTuple.getId(), e3);
                synchronized (this.lock) {
                    this.parsing = false;
                    this.since = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            synchronized (this.lock) {
                this.parsing = false;
                this.since = System.currentTimeMillis();
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006c A[PHI: r13
      0x006c: PHI (r13v3 F2.b) = (r13v1 F2.b), (r13v2 F2.b), (r13v4 F2.b) binds: [B:19:0x006a, B:25:0x00a8, B:29:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    private List<Metadata> parseRecursive(FetchEmitTuple fetchEmitTuple, HandlerConfig handlerConfig, InputStream inputStream, Metadata metadata, ParseContext parseContext) {
        F2.b bVar;
        RecursiveParserWrapperHandler recursiveParserWrapperHandler = new RecursiveParserWrapperHandler(new BasicContentHandlerFactory(handlerConfig.getType(), handlerConfig.getWriteLimit(), handlerConfig.isThrowOnWriteLimitReached(), parseContext), handlerConfig.getMaxEmbeddedResources());
        long jCurrentTimeMillis = System.currentTimeMillis();
        preParse(fetchEmitTuple, inputStream, metadata, parseContext);
        try {
            try {
                try {
                    try {
                        this.rMetaParser.parse(inputStream, recursiveParserWrapperHandler, metadata, parseContext);
                        F2.b bVar2 = LOG;
                        if (bVar2.v()) {
                            bVar2.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- parse only time: {} ms");
                        }
                    } catch (SecurityException e3) {
                        LOG.f("security exception:" + fetchEmitTuple.getId(), e3);
                        throw e3;
                    }
                } catch (SAXException e4) {
                    bVar = LOG;
                    bVar.f("sax problem:" + fetchEmitTuple.getId(), e4);
                    if (bVar.v()) {
                        bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- parse only time: {} ms");
                    }
                }
            } catch (EncryptedDocumentException e5) {
                bVar = LOG;
                bVar.f("encrypted document:" + fetchEmitTuple.getId(), e5);
                if (bVar.v()) {
                    bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- parse only time: {} ms");
                }
            } catch (Exception e6) {
                bVar = LOG;
                bVar.f("parse exception: " + fetchEmitTuple.getId(), e6);
                if (bVar.v()) {
                    bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- parse only time: {} ms");
                }
            }
            return recursiveParserWrapperHandler.getMetadataList();
        } catch (Throwable th) {
            F2.b bVar3 = LOG;
            if (bVar3.v()) {
                bVar3.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- parse only time: {} ms");
            }
            throw th;
        }
    }

    private MetadataListAndEmbeddedBytes parseWithStream(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata) throws TikaConfigException {
        ParseContext parseContext = setupParseContext(fetchEmitTuple);
        HandlerConfig handlerConfig = (HandlerConfig) parseContext.get(HandlerConfig.class);
        return new MetadataListAndEmbeddedBytes(handlerConfig.getParseMode() == HandlerConfig.PARSE_MODE.RMETA ? parseRecursive(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext) : parseConcatenated(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext), (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class));
    }

    private void preParse(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata, ParseContext parseContext) {
        try {
            TikaInputStream tikaInputStreamCast = TikaInputStream.cast(inputStream);
            if (tikaInputStreamCast == null) {
                tikaInputStreamCast = TikaInputStream.get(inputStream, (TemporaryResources) null, metadata);
            }
            _preParse(fetchEmitTuple, tikaInputStreamCast, metadata, parseContext);
            byte[] bArr = c.f4533a;
            writeIntermediate(fetchEmitTuple.getEmitKey(), metadata);
        } catch (Throwable th) {
            byte[] bArr2 = c.f4533a;
            throw th;
        }
    }

    private FetchEmitTuple readFetchEmitTuple() {
        try {
            byte[] bArr = new byte[this.input.readInt()];
            this.input.readFully(bArr);
            int i3 = h.f4677o;
            g gVar = new g();
            gVar.W(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(new h(gVar));
            try {
                FetchEmitTuple fetchEmitTuple = (FetchEmitTuple) objectInputStream.readObject();
                objectInputStream.close();
                return fetchEmitTuple;
            } catch (Throwable th) {
                try {
                    objectInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e3) {
            LOG.j("problem reading tuple", e3);
            exit(1);
            return null;
        } catch (ClassNotFoundException e4) {
            LOG.j("can't find class?!", e4);
            exit(1);
            return null;
        }
    }

    private ParseContext setupParseContext(FetchEmitTuple fetchEmitTuple) throws TikaConfigException {
        ParseContext parseContext = fetchEmitTuple.getParseContext();
        if (parseContext.get(HandlerConfig.class) == null) {
            parseContext.set(HandlerConfig.class, HandlerConfig.DEFAULT_HANDLER_CONFIG);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig == null) {
            parseContext.set(EmbeddedDocumentBytesConfig.class, EmbeddedDocumentBytesConfig.SKIP);
            return parseContext;
        }
        EmbeddedDocumentExtractorFactory embeddedDocumentExtractorFactory = ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getEmbeddedDocumentExtractorFactory();
        if (embeddedDocumentExtractorFactory == null) {
            parseContext.set(EmbeddedDocumentExtractor.class, new RUnpackExtractor(parseContext, RUnpackExtractorFactory.DEFAULT_MAX_EMBEDDED_BYTES_FOR_EXTRACTION));
        } else if (!(embeddedDocumentExtractorFactory instanceof EmbeddedDocumentByteStoreExtractorFactory)) {
            throw new TikaConfigException(e.k("EmbeddedDocumentExtractorFactory must be an instance of EmbeddedDocumentByteStoreExtractorFactory if you wantto extract embedded bytes! I see this embedded doc factory: ", String.valueOf(embeddedDocumentExtractorFactory.getClass()), "and a request: ", String.valueOf(embeddedDocumentBytesConfig)));
        }
        if (StringUtils.isBlank(embeddedDocumentBytesConfig.getEmitter())) {
            parseContext.set(EmbeddedDocumentBytesHandler.class, new BasicEmbeddedDocumentBytesHandler(embeddedDocumentBytesConfig));
            return parseContext;
        }
        parseContext.set(EmbeddedDocumentBytesHandler.class, new EmittingEmbeddedDocumentBytesHandler(fetchEmitTuple, this.emitterManager));
        return parseContext;
    }

    private void write(EmitData emitData) {
        try {
            int i3 = x2.c.f4723p;
            x2.c cVar = new x2.c(new w2.e());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(cVar);
            try {
                objectOutputStream.writeObject(emitData);
                objectOutputStream.close();
                write(STATUS.PARSE_SUCCESS, cVar.b());
            } catch (Throwable th) {
                try {
                    objectOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e3) {
            LOG.j("problem writing emit data (forking process shutdown?)", e3);
            exit(1);
        }
    }

    private void writeIntermediate(EmitKey emitKey, Metadata metadata) {
        try {
            int i3 = x2.c.f4723p;
            x2.c cVar = new x2.c(new w2.e());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(cVar);
            try {
                objectOutputStream.writeObject(metadata);
                objectOutputStream.close();
                write(STATUS.INTERMEDIATE_RESULT, cVar.b());
            } catch (Throwable th) {
                try {
                    objectOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e3) {
            LOG.j("problem writing intermediate data (forking process shutdown?)", e3);
            exit(1);
        }
    }

    public void initializeResources() {
        this.tikaConfig = new TikaConfig(this.tikaConfigPath);
        this.fetcherManager = FetcherManager.load(this.tikaConfigPath);
        if (this.maxForEmitBatchBytes > -1) {
            this.emitterManager = EmitterManager.load(this.tikaConfigPath);
        } else {
            LOG.u("'maxForEmitBatchBytes' < 0. Not initializing emitters in PipesServer");
            this.emitterManager = null;
        }
        AutoDetectParser autoDetectParser = new AutoDetectParser(this.tikaConfig);
        this.autoDetectParser = autoDetectParser;
        if (autoDetectParser.getAutoDetectParserConfig().getDigesterFactory() != null) {
            this.digester = ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getDigesterFactory().build();
            ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getDigesterFactory().setSkipContainerDocument(true);
            if (((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().getEmbeddedDocumentExtractorFactory() == null) {
                ((AutoDetectParser) this.autoDetectParser).getAutoDetectParserConfig().setEmbeddedDocumentExtractorFactory(new RUnpackExtractorFactory());
            }
        }
        this.detector = ((AutoDetectParser) this.autoDetectParser).getDetector();
        this.rMetaParser = new RecursiveParserWrapper(this.autoDetectParser);
    }

    public MetadataListAndEmbeddedBytes parseFromTuple(FetchEmitTuple fetchEmitTuple, Fetcher fetcher) {
        Metadata metadata = new Metadata();
        try {
            InputStream inputStreamFetch = fetcher.fetch(fetchEmitTuple.getFetchKey().getFetchKey(), metadata, fetchEmitTuple.getParseContext());
            try {
                MetadataListAndEmbeddedBytes withStream = parseWithStream(fetchEmitTuple, inputStreamFetch, metadata);
                if (inputStreamFetch == null) {
                    return withStream;
                }
                inputStreamFetch.close();
                return withStream;
            } catch (Throwable th) {
                if (inputStreamFetch != null) {
                    try {
                        inputStreamFetch.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            LOG.f("fetch exception " + fetchEmitTuple.getId(), e);
            write(STATUS.FETCH_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        } catch (SecurityException e4) {
            LOG.j("security exception " + fetchEmitTuple.getId(), e4);
            throw e4;
        } catch (TikaException e5) {
            e = e5;
            LOG.f("fetch exception " + fetchEmitTuple.getId(), e);
            write(STATUS.FETCH_EXCEPTION, ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

    public void processRequests() {
        F2.b bVar = LOG;
        bVar.u("processing requests");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            initializeResources();
            if (bVar.v()) {
                bVar.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), "timer -- initialize parser and other resources: {} ms");
            }
            bVar.u("pipes server initialized");
            try {
                write(STATUS.READY);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                while (true) {
                    int i3 = this.input.read();
                    if (i3 != -1) {
                        STATUS status = STATUS.PING;
                        if (i3 != status.getByte()) {
                            if (i3 != STATUS.CALL.getByte()) {
                                break;
                            }
                            parseOne();
                            F2.b bVar2 = LOG;
                            if (bVar2.v()) {
                                bVar2.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2), "timer -- parse one: {} ms");
                            }
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                        } else {
                            F2.b bVar3 = LOG;
                            if (bVar3.v()) {
                                bVar3.l(Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2), "timer -- ping: {} ms");
                            }
                            write(status);
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                        }
                    } else {
                        LOG.m("received -1 from client; shutting down");
                        exit(1);
                    }
                    this.output.flush();
                }
                throw new IllegalStateException("Unexpected request");
            } catch (Throwable th) {
                LOG.j("main loop error (did the forking process shut down?)", th);
                exit(1);
                System.err.flush();
            }
        } catch (Throwable th2) {
            LOG.j("couldn't initialize parser", th2);
            try {
                this.output.writeByte(STATUS.FAILED_TO_START.getByte());
                this.output.flush();
            } catch (IOException e3) {
                LOG.f("couldn't notify of failure to start", e3);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                synchronized (this.lock) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.since;
                        if (this.parsing && jCurrentTimeMillis > this.serverParseTimeoutMillis) {
                            LOG.r(Long.valueOf(jCurrentTimeMillis), Long.valueOf(this.serverParseTimeoutMillis), "timeout server; elapsed {}  with {}");
                            exit(17);
                        } else if (!this.parsing) {
                            long j3 = this.serverWaitTimeoutMillis;
                            if (j3 > 0 && jCurrentTimeMillis > j3) {
                                LOG.k("closing down from inactivity");
                                exit(0);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Thread.sleep(this.checkForTimeoutMs);
            } catch (InterruptedException unused) {
                LOG.u("interrupted");
                return;
            }
        }
    }

    private void write(STATUS status, String str) {
        write(status, str.getBytes(StandardCharsets.UTF_8));
    }

    private void write(STATUS status, byte[] bArr) {
        try {
            int length = bArr.length;
            this.output.write(status.getByte());
            this.output.writeInt(length);
            this.output.write(bArr);
            this.output.flush();
        } catch (IOException e3) {
            LOG.j("problem writing data (forking process shutdown?)", e3);
            exit(1);
        }
    }

    private void write(STATUS status) {
        try {
            this.output.write(status.getByte());
            this.output.flush();
        } catch (IOException e3) {
            LOG.j("problem writing data (forking process shutdown?)", e3);
            exit(1);
        }
    }
}
