package J1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends RuntimeException {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f585l;

    public d(String str, String str2) {
        this.f584k = str;
        this.f585l = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f585l;
    }
}
