package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f2001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O f2002b;

    static {
        S s3 = S.f2003c;
        O o2 = null;
        try {
            o2 = (O) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2001a = o2;
        f2002b = new O();
    }
}
