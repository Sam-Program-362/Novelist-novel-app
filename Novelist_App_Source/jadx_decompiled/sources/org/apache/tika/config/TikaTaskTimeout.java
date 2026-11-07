package org.apache.tika.config;

import org.apache.tika.parser.ParseContext;

/* loaded from: classes.dex */
public class TikaTaskTimeout {
    private final long timeoutMillis;

    public TikaTaskTimeout(long j3) {
        this.timeoutMillis = j3;
    }

    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public static long getTimeoutMillis(ParseContext parseContext, long j3) {
        TikaTaskTimeout tikaTaskTimeout = (TikaTaskTimeout) parseContext.get(TikaTaskTimeout.class);
        return tikaTaskTimeout == null ? j3 : tikaTaskTimeout.getTimeoutMillis();
    }
}
