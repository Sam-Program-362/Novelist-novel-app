package org.apache.tika.sax;

/* JADX INFO: loaded from: classes.dex */
public interface WriteLimiter {
    int getWriteLimit();

    boolean isThrowOnWriteLimitReached();
}
