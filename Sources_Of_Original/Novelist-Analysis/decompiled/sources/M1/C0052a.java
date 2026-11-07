package M1;

/* JADX INFO: renamed from: M1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0052a extends RuntimeException {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f1070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f1072m;

    public C0052a(String str, String str2, String str3) {
        this.f1070k = str;
        this.f1071l = str2;
        this.f1072m = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f1071l;
    }
}
