package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import m0.InterfaceC0430d;

/* loaded from: classes.dex */
public final class M implements InterfaceC0430d {

    /* renamed from: a, reason: collision with root package name */
    public final B1.p f2131a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2132b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2133c;

    /* renamed from: d, reason: collision with root package name */
    public final O1.e f2134d;

    public M(B1.p pVar, T t3) {
        a2.h.e(pVar, "savedStateRegistry");
        this.f2131a = pVar;
        this.f2134d = new O1.e(new V.S(t3, 2));
    }

    @Override // m0.InterfaceC0430d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2133c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it2 = ((N) this.f2134d.a()).f2135b.entrySet().iterator();
        if (!it2.hasNext()) {
            this.f2132b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        ((I) entry.getValue()).getClass();
        throw null;
    }
}
