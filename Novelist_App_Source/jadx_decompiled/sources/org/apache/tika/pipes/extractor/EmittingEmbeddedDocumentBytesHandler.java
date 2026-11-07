package org.apache.tika.pipes.extractor;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.extractor.AbstractEmbeddedDocumentBytesHandler;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.StreamEmitter;
import org.apache.tika.pipes.emitter.TikaEmitterException;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public class EmittingEmbeddedDocumentBytesHandler extends AbstractEmbeddedDocumentBytesHandler {
    private static final Metadata METADATA = new Metadata();
    private static final ParseContext PARSE_CONTEXT = new ParseContext();
    private final EmitKey containerEmitKey;
    private final EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig;
    private final StreamEmitter emitter;

    public EmittingEmbeddedDocumentBytesHandler(FetchEmitTuple fetchEmitTuple, EmitterManager emitterManager) {
        this.containerEmitKey = fetchEmitTuple.getEmitKey();
        EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) fetchEmitTuple.getParseContext().get(EmbeddedDocumentBytesConfig.class);
        this.embeddedDocumentBytesConfig = embeddedDocumentBytesConfig;
        if (embeddedDocumentBytesConfig == null) {
            throw new TikaConfigException("EmbeddedDocumentBytesConfig must not be null!");
        }
        Emitter emitter = emitterManager.getEmitter(embeddedDocumentBytesConfig.getEmitter());
        if (!(emitter instanceof StreamEmitter)) {
            throw new TikaConfigException(AbstractC0468a.b("Emitter ", embeddedDocumentBytesConfig.getEmitter(), " must implement a StreamEmitter"));
        }
        this.emitter = (StreamEmitter) emitter;
    }

    @Override // org.apache.tika.extractor.AbstractEmbeddedDocumentBytesHandler, org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public void add(int i3, Metadata metadata, InputStream inputStream) {
        try {
            this.emitter.emit(getEmitKey(this.containerEmitKey.getEmitKey(), i3, this.embeddedDocumentBytesConfig, metadata), inputStream, METADATA, PARSE_CONTEXT);
        } catch (TikaEmitterException e3) {
            throw new IOException(e3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        StreamEmitter streamEmitter = this.emitter;
        if (streamEmitter instanceof Closeable) {
            ((Closeable) streamEmitter).close();
        }
    }
}
