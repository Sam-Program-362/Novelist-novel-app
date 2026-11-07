package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2137a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f2137a;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((P) it2.next()).a();
        }
        linkedHashMap.clear();
    }
}
