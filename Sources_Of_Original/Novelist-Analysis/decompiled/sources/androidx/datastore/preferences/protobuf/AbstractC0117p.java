package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0117p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0116o f2087a = new C0116o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0116o f2088b;

    static {
        S s3 = S.f2003c;
        C0116o c0116o = null;
        try {
            c0116o = (C0116o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2088b = c0116o;
    }
}
