package p033k1;

import H0.i;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f3835b;

    public f(i iVar, Runnable runnable) {
        this.f3834a = iVar;
        this.f3835b = runnable;
    }

    public final Integer a() {
        i iVar = this.f3834a;
        if (iVar != null) {
            return Integer.valueOf(((e) iVar.f443l).f3823c);
        }
        return null;
    }
}
