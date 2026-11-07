package K0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends UnsupportedOperationException {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J0.c f656k;

    public o(J0.c cVar) {
        this.f656k = cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f656k));
    }
}
