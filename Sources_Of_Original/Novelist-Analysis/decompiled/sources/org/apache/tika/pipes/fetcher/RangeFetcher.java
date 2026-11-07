package org.apache.tika.pipes.fetcher;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* JADX INFO: loaded from: classes.dex */
public interface RangeFetcher extends Fetcher {
    default InputStream fetch(String str, long j3, long j4, Metadata metadata) {
        return fetch(str, j3, j4, metadata, new ParseContext());
    }

    InputStream fetch(String str, long j3, long j4, Metadata metadata, ParseContext parseContext);
}
