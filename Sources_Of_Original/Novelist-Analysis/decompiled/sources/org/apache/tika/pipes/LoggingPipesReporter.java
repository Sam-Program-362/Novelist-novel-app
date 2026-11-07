package org.apache.tika.pipes;

import F2.d;

/* JADX INFO: loaded from: classes.dex */
public class LoggingPipesReporter extends PipesReporter {
    F2.b LOGGER = d.b(LoggingPipesReporter.class);

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(Throwable th) {
        this.LOGGER.j("pipes error", th);
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j3) {
        this.LOGGER.b("{} {} {}", fetchEmitTuple, pipesResult, Long.valueOf(j3));
    }

    @Override // org.apache.tika.pipes.PipesReporter
    public void error(String str) {
        this.LOGGER.a(str, "error {}");
    }
}
