package org.apache.tika.fork;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.TeeContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class ForkParser implements Parser, Closeable {
    private static final long serialVersionUID = -4962742892274663950L;
    private int currentlyInUse;
    private List<String> java;
    private final ClassLoader loader;

    @Field
    private int maxFilesProcessedPerClient;
    private final Parser parser;
    private final ParserFactoryFactory parserFactoryFactory;
    private final Queue<ForkClient> pool;

    @Field
    private int poolSize;

    @Field
    private long serverParseTimeoutMillis;

    @Field
    private long serverPulseMillis;

    @Field
    private long serverWaitTimeoutMillis;
    private final Path tikaBin;

    public ForkParser(Path path, ParserFactoryFactory parserFactoryFactory) {
        this.pool = new LinkedList();
        this.java = Arrays.asList("java", "-Xmx32m", "-Djava.awt.headless=true");
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        this.loader = null;
        this.parser = null;
        this.tikaBin = path;
        this.parserFactoryFactory = parserFactoryFactory;
    }

    private synchronized ForkClient acquireClient() {
        ForkClient poll;
        while (true) {
            try {
                poll = this.pool.poll();
                if (poll == null && this.currentlyInUse < this.poolSize) {
                    poll = newClient();
                }
                if (poll != null && !poll.ping()) {
                    poll.close();
                    poll = null;
                }
                if (poll != null) {
                    this.currentlyInUse++;
                } else if (this.currentlyInUse >= this.poolSize) {
                    try {
                        wait();
                    } catch (InterruptedException e3) {
                        throw new TikaException("Interrupted while waiting for a fork parser", e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return poll;
    }

    private ForkClient newClient() {
        TimeoutLimits timeoutLimits = new TimeoutLimits(this.serverPulseMillis, this.serverParseTimeoutMillis, this.serverWaitTimeoutMillis);
        ClassLoader classLoader = this.loader;
        if (classLoader == null && this.parser == null && this.tikaBin != null && this.parserFactoryFactory != null) {
            return new ForkClient(this.tikaBin, this.parserFactoryFactory, this.java, timeoutLimits);
        }
        if (classLoader != null && this.parser != null && this.tikaBin == null && this.parserFactoryFactory == null) {
            return new ForkClient(this.loader, this.parser, this.java, timeoutLimits);
        }
        if (classLoader == null || this.parser != null || this.tikaBin == null || this.parserFactoryFactory == null) {
            throw new IllegalStateException("Unexpected combination of state items");
        }
        return new ForkClient(this.tikaBin, this.parserFactoryFactory, this.loader, this.java, timeoutLimits);
    }

    private synchronized void releaseClient(ForkClient forkClient, boolean z3) {
        try {
            int i3 = this.currentlyInUse - 1;
            this.currentlyInUse = i3;
            if (i3 + this.pool.size() >= this.poolSize || !z3) {
                forkClient.close();
            } else {
                if (this.maxFilesProcessedPerClient <= 0 || forkClient.getFilesProcessed() < this.maxFilesProcessedPerClient) {
                    this.pool.offer(forkClient);
                } else {
                    forkClient.close();
                }
                notifyAll();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            Iterator<ForkClient> it2 = this.pool.iterator();
            while (it2.hasNext()) {
                it2.next().close();
            }
            this.pool.clear();
            this.poolSize = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    public List<String> getJavaCommandAsList() {
        return Collections.unmodifiableList(this.java);
    }

    public synchronized int getPoolSize() {
        return this.poolSize;
    }

    @Override // org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return this.parser.getSupportedTypes(parseContext);
    }

    @Override // org.apache.tika.parser.Parser
    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) {
        if (inputStream == null) {
            throw new NullPointerException("null stream");
        }
        ForkClient acquireClient = acquireClient();
        boolean z3 = false;
        try {
            try {
                if (!(contentHandler instanceof AbstractRecursiveParserWrapperHandler)) {
                    contentHandler = new TeeContentHandler(contentHandler, new MetadataContentHandler(metadata));
                }
                Throwable call = acquireClient.call("parse", inputStream, contentHandler, metadata, parseContext);
                releaseClient(acquireClient, true);
                if (call instanceof IOException) {
                    throw ((IOException) call);
                }
                if (call instanceof SAXException) {
                    throw ((SAXException) call);
                }
                if (call instanceof TikaException) {
                    throw ((TikaException) call);
                }
                if (call != null) {
                    throw new TikaException("Unexpected error in forked server process", call);
                }
            } catch (IOException e3) {
                throw new TikaException("Failed to communicate with a forked parser process. The process has most likely crashed due to some error like running out of memory. A new process will be started for the next parsing request.", e3);
            } catch (TikaException e4) {
                try {
                    throw e4;
                } catch (Throwable th) {
                    th = th;
                    z3 = true;
                    releaseClient(acquireClient, z3);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            releaseClient(acquireClient, z3);
            throw th;
        }
    }

    public void setJavaCommand(List<String> list) {
        this.java = new ArrayList(list);
    }

    public void setMaxFilesProcessedPerServer(int i3) {
        this.maxFilesProcessedPerClient = i3;
    }

    public synchronized void setPoolSize(int i3) {
        this.poolSize = i3;
    }

    public void setServerParseTimeoutMillis(long j3) {
        this.serverParseTimeoutMillis = j3;
    }

    public void setServerPulseMillis(long j3) {
        this.serverPulseMillis = j3;
    }

    public void setServerWaitTimeoutMillis(long j3) {
        this.serverWaitTimeoutMillis = j3;
    }

    public ForkParser(Path path, ParserFactoryFactory parserFactoryFactory, ClassLoader classLoader) {
        this.pool = new LinkedList();
        this.java = Arrays.asList("java", "-Xmx32m", "-Djava.awt.headless=true");
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        this.parser = null;
        this.loader = classLoader;
        this.tikaBin = path;
        this.parserFactoryFactory = parserFactoryFactory;
    }

    public ForkParser(ClassLoader classLoader, Parser parser) {
        this.pool = new LinkedList();
        this.java = Arrays.asList("java", "-Xmx32m", "-Djava.awt.headless=true");
        this.poolSize = 5;
        this.currentlyInUse = 0;
        this.serverPulseMillis = 1000L;
        this.serverParseTimeoutMillis = 60000L;
        this.serverWaitTimeoutMillis = 60000L;
        this.maxFilesProcessedPerClient = -1;
        if (!(parser instanceof ForkParser)) {
            this.tikaBin = null;
            this.parserFactoryFactory = null;
            this.loader = classLoader;
            this.parser = parser;
            return;
        }
        throw new IllegalArgumentException("The underlying parser of a ForkParser should not be a ForkParser, but a specific implementation.");
    }

    public ForkParser(ClassLoader classLoader) {
        this(classLoader, new AutoDetectParser());
    }

    public ForkParser() {
        this(ForkParser.class.getClassLoader());
    }
}
