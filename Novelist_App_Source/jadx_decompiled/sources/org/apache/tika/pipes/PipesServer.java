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
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.extractor.BasicEmbeddedDocumentBytesHandler;
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
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.HandlerConfig;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.StreamEmitter;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.pipes.extractor.EmittingEmbeddedDocumentBytesHandler;
import org.apache.tika.pipes.fetcher.Fetcher;
import org.apache.tika.pipes.fetcher.FetcherManager;
import org.apache.tika.utils.ExceptionUtils;
import org.apache.tika.utils.StringUtils;
import s2.c;
import w2.g;
import w2.h;

/* loaded from: classes.dex */
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
            STATUS[] values = values();
            if (i4 < values.length) {
                return values[i4];
            }
            throw new IllegalArgumentException(e.i("byte with index ", i4, " must be < ", values.length));
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
        InputStream newInputStream;
        DigestingParser.Digester digester = this.digester;
        if (digester != null) {
            try {
                digester.digest(tikaInputStream, metadata, parseContext);
            } catch (IOException e3) {
                LOG.f("problem digesting: " + fetchEmitTuple.getId(), e3);
            }
        }
        try {
            MediaType detect = this.detector.detect(tikaInputStream, metadata);
            metadata.set(HttpHeaders.CONTENT_TYPE, detect.toString());
            metadata.set(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE, detect.toString());
        } catch (IOException e4) {
            LOG.f("problem detecting: " + fetchEmitTuple.getId(), e4);
        }
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) parseContext.get(EmbeddedDocumentBytesConfig.class);
        if (embeddedDocumentBytesConfig == null || !embeddedDocumentBytesConfig.isIncludeOriginal()) {
            return;
        }
        EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler = (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class);
        try {
            newInputStream = Files.newInputStream(tikaInputStream.getPath(), new OpenOption[0]);
            try {
                embeddedDocumentBytesHandler.add(0, metadata, newInputStream);
                if (newInputStream != null) {
                    newInputStream.close();
                }
            } finally {
            }
        } catch (IOException e5) {
            LOG.f("problem reading source file into embedded document byte store", e5);
        }
    }

    private void actuallyParse(FetchEmitTuple fetchEmitTuple) {
        MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes;
        long currentTimeMillis = System.currentTimeMillis();
        Fetcher fetcher = getFetcher(fetchEmitTuple);
        if (fetcher == null) {
            return;
        }
        F2.b bVar = LOG;
        if (bVar.v()) {
            bVar.l(Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "timer -- got fetcher: {}ms");
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            metadataListAndEmbeddedBytes = parseFromTuple(fetchEmitTuple, fetcher);
            try {
                if (bVar.v()) {
                    bVar.l(Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), "timer -- to parse: {} ms");
                }
                try {
                    if (metadataListAndEmbeddedBytes != null && !metadataIsEmpty(metadataListAndEmbeddedBytes.getMetadataList())) {
                        emitParseData(fetchEmitTuple, metadataListAndEmbeddedBytes);
                        if (!metadataListAndEmbeddedBytes.hasEmbeddedDocumentByteStore() || metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler() == null) {
                            return;
                        }
                        metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler().close();
                        return;
                    }
                    write(STATUS.EMPTY_OUTPUT);
                    if (metadataListAndEmbeddedBytes == null || !metadataListAndEmbeddedBytes.hasEmbeddedDocumentByteStore() || metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler() == null) {
                        return;
                    }
                    metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler().close();
                } catch (IOException e3) {
                    LOG.f("problem closing embedded document byte store", e3);
                }
            } catch (Throwable th) {
                th = th;
                if (metadataListAndEmbeddedBytes != null && metadataListAndEmbeddedBytes.hasEmbeddedDocumentByteStore() && metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler() != null) {
                    try {
                        metadataListAndEmbeddedBytes.getEmbeddedDocumentBytesHandler().close();
                    } catch (IOException e4) {
                        LOG.f("problem closing embedded document byte store", e4);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            metadataListAndEmbeddedBytes = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void emit(java.lang.String r3, org.apache.tika.pipes.emitter.EmitKey r4, boolean r5, org.apache.tika.pipes.PipesServer.MetadataListAndEmbeddedBytes r6, java.lang.String r7, org.apache.tika.parser.ParseContext r8) {
        /*
            r2 = this;
            org.apache.tika.pipes.emitter.EmitterManager r0 = r2.emitterManager     // Catch: java.lang.IllegalArgumentException -> L54
            java.lang.String r1 = r4.getEmitterName()     // Catch: java.lang.IllegalArgumentException -> L54
            org.apache.tika.pipes.emitter.Emitter r3 = r0.getEmitter(r1)     // Catch: java.lang.IllegalArgumentException -> L54
            if (r5 == 0) goto L1a
            boolean r5 = r6.toBePackagedForStreamEmitter()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            if (r5 == 0) goto L1a
            r2.emitContentsAndBytes(r3, r4, r6)     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            goto L25
        L16:
            r3 = move-exception
            goto L3d
        L18:
            r3 = move-exception
            goto L3d
        L1a:
            java.lang.String r4 = r4.getEmitKey()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            java.util.List r5 = r6.getMetadataList()     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
            r3.emit(r4, r5, r8)     // Catch: org.apache.tika.pipes.emitter.TikaEmitterException -> L16 java.io.IOException -> L18
        L25:
            boolean r3 = org.apache.tika.utils.StringUtils.isBlank(r7)
            if (r3 == 0) goto L31
            org.apache.tika.pipes.PipesServer$STATUS r3 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_SUCCESS
            r2.write(r3)
            return
        L31:
            org.apache.tika.pipes.PipesServer$STATUS r3 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r7.getBytes(r4)
            r2.write(r3, r4)
            return
        L3d:
            F2.b r4 = org.apache.tika.pipes.PipesServer.LOG
            java.lang.String r5 = "emit exception"
            r4.f(r5, r3)
            java.lang.String r3 = org.apache.tika.utils.ExceptionUtils.getStackTrace(r3)
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r4)
            org.apache.tika.pipes.PipesServer$STATUS r4 = org.apache.tika.pipes.PipesServer.STATUS.EMIT_EXCEPTION
            r2.write(r4, r3)
            return
        L54:
            java.lang.String r3 = r2.getNoEmitterMsg(r3)
            F2.b r4 = org.apache.tika.pipes.PipesServer.LOG
            r4.m(r3)
            org.apache.tika.pipes.PipesServer$STATUS r4 = org.apache.tika.pipes.PipesServer.STATUS.EMITTER_NOT_FOUND
            r2.write(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.emit(java.lang.String, org.apache.tika.pipes.emitter.EmitKey, boolean, org.apache.tika.pipes.PipesServer$MetadataListAndEmbeddedBytes, java.lang.String, org.apache.tika.parser.ParseContext):void");
    }

    private void emitContentsAndBytes(Emitter emitter, EmitKey emitKey, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        if (!(emitter instanceof StreamEmitter)) {
            throw new IllegalArgumentException("The emitter for embedded document byte store must be a StreamEmitter. I see: ".concat(String.valueOf(emitter.getClass())));
        }
        throw new UnsupportedOperationException("this is not yet implemented");
    }

    private void emitParseData(FetchEmitTuple fetchEmitTuple, MetadataListAndEmbeddedBytes metadataListAndEmbeddedBytes) {
        EmitKey emitKey;
        long currentTimeMillis = System.currentTimeMillis();
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
            bVar.l(Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "timer -- emitted: {} ms");
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
        Path path;
        try {
            path = Paths.get(strArr[0], new String[0]);
            PipesServer pipesServer = new PipesServer(path, System.in, System.out, Long.parseLong(strArr[1]), Long.parseLong(strArr[2]), Long.parseLong(strArr[3]));
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

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0111, code lost:
    
        if (r14.v() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        r14.l(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r6), "timer -- parse only time: {} ms");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if (r14.v() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        if (r14.v() == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<org.apache.tika.metadata.Metadata> parseConcatenated(org.apache.tika.pipes.FetchEmitTuple r10, org.apache.tika.pipes.HandlerConfig r11, java.io.InputStream r12, org.apache.tika.metadata.Metadata r13, org.apache.tika.parser.ParseContext r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.parseConcatenated(org.apache.tika.pipes.FetchEmitTuple, org.apache.tika.pipes.HandlerConfig, java.io.InputStream, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):java.util.List");
    }

    private void parseOne() {
        synchronized (this.lock) {
            this.parsing = true;
            this.since = System.currentTimeMillis();
        }
        FetchEmitTuple fetchEmitTuple = null;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                fetchEmitTuple = readFetchEmitTuple();
                F2.b bVar = LOG;
                if (bVar.v()) {
                    bVar.l(Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "timer -- read fetchEmitTuple: {} ms");
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                actuallyParse(fetchEmitTuple);
                if (bVar.v()) {
                    bVar.l(Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), "timer -- actually parsed: {} ms");
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        if (r13.v() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        r13.l(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r6), "timer -- parse only time: {} ms");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        if (r13.v() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r13.v() == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<org.apache.tika.metadata.Metadata> parseRecursive(org.apache.tika.pipes.FetchEmitTuple r11, org.apache.tika.pipes.HandlerConfig r12, java.io.InputStream r13, org.apache.tika.metadata.Metadata r14, org.apache.tika.parser.ParseContext r15) {
        /*
            r10 = this;
            java.lang.String r0 = "timer -- parse only time: {} ms"
            java.lang.String r1 = "sax problem:"
            java.lang.String r2 = "encrypted document:"
            java.lang.String r3 = "security exception:"
            java.lang.String r4 = "parse exception: "
            org.apache.tika.sax.RecursiveParserWrapperHandler r5 = new org.apache.tika.sax.RecursiveParserWrapperHandler
            org.apache.tika.sax.BasicContentHandlerFactory r6 = new org.apache.tika.sax.BasicContentHandlerFactory
            org.apache.tika.sax.BasicContentHandlerFactory$HANDLER_TYPE r7 = r12.getType()
            int r8 = r12.getWriteLimit()
            boolean r9 = r12.isThrowOnWriteLimitReached()
            r6.<init>(r7, r8, r9, r15)
            int r12 = r12.getMaxEmbeddedResources()
            r5.<init>(r6, r12)
            long r6 = java.lang.System.currentTimeMillis()
            r10.preParse(r11, r13, r14, r15)
            org.apache.tika.parser.Parser r12 = r10.rMetaParser     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49 java.lang.SecurityException -> L4b org.apache.tika.exception.EncryptedDocumentException -> L4d org.xml.sax.SAXException -> L4f
            r12.parse(r13, r5, r14, r15)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49 java.lang.SecurityException -> L4b org.apache.tika.exception.EncryptedDocumentException -> L4d org.xml.sax.SAXException -> L4f
            F2.b r11 = org.apache.tika.pipes.PipesServer.LOG
            boolean r12 = r11.v()
            if (r12 == 0) goto Lc7
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r6
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11.l(r12, r0)
            goto Lc7
        L46:
            r11 = move-exception
            goto Lcc
        L49:
            r12 = move-exception
            goto L51
        L4b:
            r12 = move-exception
            goto L79
        L4d:
            r12 = move-exception
            goto L8f
        L4f:
            r12 = move-exception
            goto Lab
        L51:
            F2.b r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r4)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.f(r11, r12)     // Catch: java.lang.Throwable -> L46
            boolean r11 = r13.v()
            if (r11 == 0) goto Lc7
        L6c:
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r6
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.l(r11, r0)
            goto Lc7
        L79:
            F2.b r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.f(r11, r12)     // Catch: java.lang.Throwable -> L46
            throw r12     // Catch: java.lang.Throwable -> L46
        L8f:
            F2.b r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.f(r11, r12)     // Catch: java.lang.Throwable -> L46
            boolean r11 = r13.v()
            if (r11 == 0) goto Lc7
            goto L6c
        Lab:
            F2.b r13 = org.apache.tika.pipes.PipesServer.LOG     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r11.getId()     // Catch: java.lang.Throwable -> L46
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46
            r14.<init>(r1)     // Catch: java.lang.Throwable -> L46
            r14.append(r11)     // Catch: java.lang.Throwable -> L46
            java.lang.String r11 = r14.toString()     // Catch: java.lang.Throwable -> L46
            r13.f(r11, r12)     // Catch: java.lang.Throwable -> L46
            boolean r11 = r13.v()
            if (r11 == 0) goto Lc7
            goto L6c
        Lc7:
            java.util.List r11 = r5.getMetadataList()
            return r11
        Lcc:
            F2.b r12 = org.apache.tika.pipes.PipesServer.LOG
            boolean r13 = r12.v()
            if (r13 == 0) goto Le0
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r6
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.l(r13, r0)
        Le0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesServer.parseRecursive(org.apache.tika.pipes.FetchEmitTuple, org.apache.tika.pipes.HandlerConfig, java.io.InputStream, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):java.util.List");
    }

    private MetadataListAndEmbeddedBytes parseWithStream(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata) {
        ParseContext parseContext = setupParseContext(fetchEmitTuple);
        HandlerConfig handlerConfig = (HandlerConfig) parseContext.get(HandlerConfig.class);
        return new MetadataListAndEmbeddedBytes(handlerConfig.getParseMode() == HandlerConfig.PARSE_MODE.RMETA ? parseRecursive(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext) : parseConcatenated(fetchEmitTuple, handlerConfig, inputStream, metadata, parseContext), (EmbeddedDocumentBytesHandler) parseContext.get(EmbeddedDocumentBytesHandler.class));
    }

    private void preParse(FetchEmitTuple fetchEmitTuple, InputStream inputStream, Metadata metadata, ParseContext parseContext) {
        try {
            TikaInputStream cast = TikaInputStream.cast(inputStream);
            if (cast == null) {
                cast = TikaInputStream.get(inputStream, (TemporaryResources) null, metadata);
            }
            _preParse(fetchEmitTuple, cast, metadata, parseContext);
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

    private ParseContext setupParseContext(FetchEmitTuple fetchEmitTuple) {
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
            } finally {
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
            } finally {
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
            InputStream fetch = fetcher.fetch(fetchEmitTuple.getFetchKey().getFetchKey(), metadata, fetchEmitTuple.getParseContext());
            try {
                MetadataListAndEmbeddedBytes parseWithStream = parseWithStream(fetchEmitTuple, fetch, metadata);
                if (fetch == null) {
                    return parseWithStream;
                }
                fetch.close();
                return parseWithStream;
            } catch (Throwable th) {
                if (fetch != null) {
                    try {
                        fetch.close();
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
            long currentTimeMillis = System.currentTimeMillis();
            initializeResources();
            if (bVar.v()) {
                bVar.l(Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "timer -- initialize parser and other resources: {} ms");
            }
            bVar.u("pipes server initialized");
            try {
                write(STATUS.READY);
                long currentTimeMillis2 = System.currentTimeMillis();
                while (true) {
                    int read = this.input.read();
                    if (read != -1) {
                        STATUS status = STATUS.PING;
                        if (read != status.getByte()) {
                            if (read != STATUS.CALL.getByte()) {
                                break;
                            }
                            parseOne();
                            F2.b bVar2 = LOG;
                            if (bVar2.v()) {
                                bVar2.l(Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), "timer -- parse one: {} ms");
                            }
                            currentTimeMillis2 = System.currentTimeMillis();
                        } else {
                            F2.b bVar3 = LOG;
                            if (bVar3.v()) {
                                bVar3.l(Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), "timer -- ping: {} ms");
                            }
                            write(status);
                            currentTimeMillis2 = System.currentTimeMillis();
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
                        long currentTimeMillis = System.currentTimeMillis() - this.since;
                        if (this.parsing && currentTimeMillis > this.serverParseTimeoutMillis) {
                            LOG.r(Long.valueOf(currentTimeMillis), Long.valueOf(this.serverParseTimeoutMillis), "timeout server; elapsed {}  with {}");
                            exit(17);
                        } else if (!this.parsing) {
                            long j3 = this.serverWaitTimeoutMillis;
                            if (j3 > 0 && currentTimeMillis > j3) {
                                LOG.k("closing down from inactivity");
                                exit(0);
                            }
                        }
                    } finally {
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
