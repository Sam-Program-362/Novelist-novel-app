package L0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f822l;

    public o(p pVar, int i3) {
        this.f822l = pVar;
        this.f821k = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f822l.h(this.f821k);
    }
}
