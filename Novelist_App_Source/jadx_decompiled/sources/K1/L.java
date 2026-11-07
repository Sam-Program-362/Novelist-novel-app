package K1;

import android.content.Context;
import android.util.Log;
import i2.AbstractC0303u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y1.C0500a;

/* loaded from: classes.dex */
public final class L implements y1.b, InterfaceC0031g {

    /* renamed from: k, reason: collision with root package name */
    public Context f697k;

    /* renamed from: l, reason: collision with root package name */
    public A0.j f698l;

    /* renamed from: m, reason: collision with root package name */
    public final B1.b f699m = new B1.b(18);

    public static final Object h(L l3, String str, String str2, T1.h hVar) {
        Y.d dVar = new Y.d(str);
        Context context = l3.f697k;
        if (context != null) {
            Object d3 = M.a(context).d(new Y.h(new C0035k(dVar, str2, null), null), hVar);
            return d3 == S1.a.f1260k ? d3 : O1.g.f1211a;
        }
        a2.h.g("context");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c4, code lost:
    
        if (r13 == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r13 == r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c4 -> B:11:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(K1.L r11, java.util.List r12, T1.c r13) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.L.k(K1.L, java.util.List, T1.c):java.lang.Object");
    }

    @Override // K1.InterfaceC0031g
    public final Long a(String str, C0032h c0032h) {
        a2.o oVar = new a2.o();
        AbstractC0303u.j(new u(str, this, oVar, null));
        return (Long) oVar.f1713k;
    }

    @Override // K1.InterfaceC0031g
    public final void b(String str, double d3, C0032h c0032h) {
        AbstractC0303u.j(new G(str, this, d3, null));
    }

    @Override // K1.InterfaceC0031g
    public final void c(List list, C0032h c0032h) {
        AbstractC0303u.j(new C0034j(this, list, null));
    }

    @Override // K1.InterfaceC0031g
    public final ArrayList d(String str, C0032h c0032h) {
        List list;
        String m3 = m(str, c0032h);
        if (m3 == null || m3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || !m3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || (list = (List) M.c(m3, this.f699m)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // K1.InterfaceC0031g
    public final void e(String str, List list, C0032h c0032h) {
        AbstractC0303u.j(new E(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f699m.e(list)), null));
    }

    @Override // K1.InterfaceC0031g
    public final void f(String str, long j3, C0032h c0032h) {
        AbstractC0303u.j(new J(str, this, j3, null));
    }

    @Override // K1.InterfaceC0031g
    public final Map g(List list, C0032h c0032h) {
        return (Map) AbstractC0303u.j(new C0036l(this, list, null));
    }

    @Override // K1.InterfaceC0031g
    public final P i(String str, C0032h c0032h) {
        String m3 = m(str, c0032h);
        if (m3 != null) {
            return m3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new P(m3, N.n) : m3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new P(null, N.f703m) : new P(null, N.f704o);
        }
        return null;
    }

    @Override // K1.InterfaceC0031g
    public final void j(String str, boolean z3, C0032h c0032h) {
        AbstractC0303u.j(new D(str, this, z3, null));
    }

    @Override // K1.InterfaceC0031g
    public final void l(String str, String str2, C0032h c0032h) {
        AbstractC0303u.j(new K(this, str, str2, null));
    }

    @Override // K1.InterfaceC0031g
    public final String m(String str, C0032h c0032h) {
        a2.o oVar = new a2.o();
        AbstractC0303u.j(new y(str, this, oVar, null));
        return (String) oVar.f1713k;
    }

    @Override // K1.InterfaceC0031g
    public final void n(String str, String str2, C0032h c0032h) {
        AbstractC0303u.j(new H(this, str, str2, null));
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        a2.h.e(c0500a, "binding");
        C1.f fVar = c0500a.f4730c;
        a2.h.d(fVar, "getBinaryMessenger(...)");
        Context context = c0500a.f4728a;
        a2.h.d(context, "getApplicationContext(...)");
        this.f697k = context;
        try {
            InterfaceC0031g.f720f.getClass();
            C0030f.b(fVar, this, "data_store");
            this.f698l = new A0.j(fVar, context, this.f699m);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
        new C0025a().onAttachedToEngine(c0500a);
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        a2.h.e(c0500a, "binding");
        C1.f fVar = c0500a.f4730c;
        a2.h.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0031g.f720f.getClass();
        C0030f.b(fVar, null, "data_store");
        A0.j jVar = this.f698l;
        if (jVar != null) {
            C0030f.b((C1.f) jVar.f57l, null, "shared_preferences");
        }
        this.f698l = null;
    }

    @Override // K1.InterfaceC0031g
    public final Boolean p(String str, C0032h c0032h) {
        a2.o oVar = new a2.o();
        AbstractC0303u.j(new C0040p(str, this, oVar, null));
        return (Boolean) oVar.f1713k;
    }

    @Override // K1.InterfaceC0031g
    public final List q(List list, C0032h c0032h) {
        return P1.e.l0(((Map) AbstractC0303u.j(new v(this, list, null))).keySet());
    }

    @Override // K1.InterfaceC0031g
    public final Double r(String str, C0032h c0032h) {
        a2.o oVar = new a2.o();
        AbstractC0303u.j(new s(str, this, oVar, null));
        return (Double) oVar.f1713k;
    }
}
