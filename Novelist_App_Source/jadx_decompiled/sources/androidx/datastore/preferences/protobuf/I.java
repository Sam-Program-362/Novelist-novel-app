package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class I {
    public static H a(Object obj, Object obj2) {
        H h3 = (H) obj;
        H h4 = (H) obj2;
        if (!h4.isEmpty()) {
            if (!h3.f1980k) {
                h3 = h3.b();
            }
            h3.a();
            if (!h4.isEmpty()) {
                h3.putAll(h4);
            }
        }
        return h3;
    }
}
