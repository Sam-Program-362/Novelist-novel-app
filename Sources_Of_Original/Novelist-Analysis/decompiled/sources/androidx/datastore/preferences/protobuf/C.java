package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f1969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f1970b;

    static {
        S s3 = S.f2003c;
        B b3 = null;
        try {
            b3 = (B) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1969a = b3;
        f1970b = new B();
    }
}
