package n2;

import i2.InterfaceC0210s;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0210s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final R1.h f4149k;

    public c(R1.h hVar) {
        this.f4149k = hVar;
    }

    @Override // i2.InterfaceC0210s
    public final R1.h d() {
        return this.f4149k;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f4149k + ')';
    }
}
