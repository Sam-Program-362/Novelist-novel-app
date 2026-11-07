package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f1981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f1982b;

    static {
        S s3 = S.f2003c;
        I i3 = null;
        try {
            i3 = (I) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1981a = i3;
        f1982b = new I();
    }
}
