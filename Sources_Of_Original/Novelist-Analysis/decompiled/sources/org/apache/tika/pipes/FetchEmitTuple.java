package org.apache.tika.pipes;

import B1.e;
import java.io.Serializable;
import java.util.Objects;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import org.apache.tika.pipes.fetcher.FetchKey;

/* JADX INFO: loaded from: classes.dex */
public class FetchEmitTuple implements Serializable {
    public static final ON_PARSE_EXCEPTION DEFAULT_ON_PARSE_EXCEPTION = ON_PARSE_EXCEPTION.EMIT;
    private EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig;
    private EmitKey emitKey;
    private final FetchKey fetchKey;
    private final String id;
    private final Metadata metadata;
    private final ON_PARSE_EXCEPTION onParseException;
    private final ParseContext parseContext;

    public enum ON_PARSE_EXCEPTION {
        SKIP,
        EMIT
    }

    public FetchEmitTuple(String str, FetchKey fetchKey, EmitKey emitKey) {
        this(str, fetchKey, emitKey, new Metadata());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FetchEmitTuple fetchEmitTuple = (FetchEmitTuple) obj;
            if (Objects.equals(this.id, fetchEmitTuple.id) && Objects.equals(this.fetchKey, fetchEmitTuple.fetchKey) && Objects.equals(this.emitKey, fetchEmitTuple.emitKey) && Objects.equals(this.metadata, fetchEmitTuple.metadata) && Objects.equals(this.parseContext, fetchEmitTuple.parseContext) && this.onParseException == fetchEmitTuple.onParseException && Objects.equals(this.embeddedDocumentBytesConfig, fetchEmitTuple.embeddedDocumentBytesConfig)) {
                return true;
            }
        }
        return false;
    }

    public EmitKey getEmitKey() {
        return this.emitKey;
    }

    public FetchKey getFetchKey() {
        return this.fetchKey;
    }

    public String getId() {
        return this.id;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public ON_PARSE_EXCEPTION getOnParseException() {
        return this.onParseException;
    }

    public ParseContext getParseContext() {
        return this.parseContext;
    }

    public int hashCode() {
        return Objects.hashCode(this.embeddedDocumentBytesConfig) + ((Objects.hashCode(this.onParseException) + ((Objects.hashCode(this.parseContext) + ((Objects.hashCode(this.metadata) + ((Objects.hashCode(this.emitKey) + ((Objects.hashCode(this.fetchKey) + (Objects.hashCode(this.id) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public void setEmitKey(EmitKey emitKey) {
        this.emitKey = emitKey;
    }

    public String toString() {
        String str = this.id;
        String strValueOf = String.valueOf(this.fetchKey);
        String strValueOf2 = String.valueOf(this.emitKey);
        String strValueOf3 = String.valueOf(this.metadata);
        String strValueOf4 = String.valueOf(this.parseContext);
        String strValueOf5 = String.valueOf(this.onParseException);
        String strValueOf6 = String.valueOf(this.embeddedDocumentBytesConfig);
        StringBuilder sb = new StringBuilder("FetchEmitTuple{id='");
        sb.append(str);
        sb.append("', fetchKey=");
        sb.append(strValueOf);
        sb.append(", emitKey=");
        sb.append(strValueOf2);
        sb.append(", metadata=");
        sb.append(strValueOf3);
        sb.append(", parseContext=");
        sb.append(strValueOf4);
        sb.append(", onParseException=");
        sb.append(strValueOf5);
        sb.append(", embeddedDocumentBytesConfig=");
        return e.m(sb, strValueOf6, "}");
    }

    public FetchEmitTuple(String str, FetchKey fetchKey, EmitKey emitKey, Metadata metadata) {
        this(str, fetchKey, emitKey, metadata, new ParseContext());
    }

    public FetchEmitTuple(String str, FetchKey fetchKey, EmitKey emitKey, Metadata metadata, ParseContext parseContext) {
        this(str, fetchKey, emitKey, metadata, parseContext, ON_PARSE_EXCEPTION.EMIT);
    }

    public FetchEmitTuple(String str, FetchKey fetchKey, EmitKey emitKey, Metadata metadata, ParseContext parseContext, ON_PARSE_EXCEPTION on_parse_exception) {
        this.id = str;
        this.fetchKey = fetchKey;
        this.emitKey = emitKey;
        this.metadata = metadata;
        this.parseContext = parseContext;
        this.onParseException = on_parse_exception;
    }
}
