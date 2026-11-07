package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class I {
    public static H a(Object obj, Object obj2) {
        H hB = (H) obj;
        H h3 = (H) obj2;
        if (!h3.isEmpty()) {
            if (!hB.f1980k) {
                hB = hB.b();
            }
            hB.a();
            if (!h3.isEmpty()) {
                hB.putAll(h3);
            }
        }
        return hB;
    }
}
