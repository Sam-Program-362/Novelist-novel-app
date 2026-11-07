package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final O f2001a;

    /* renamed from: b, reason: collision with root package name */
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
