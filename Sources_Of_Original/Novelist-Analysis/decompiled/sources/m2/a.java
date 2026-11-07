package m2;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient Object f4100k;

    public a(l2.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f4100k = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
