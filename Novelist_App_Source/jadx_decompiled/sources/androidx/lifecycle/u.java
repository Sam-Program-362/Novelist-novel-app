package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l.C0377a;
import m.C0421a;
import m.C0423c;
import m0.C0428b;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public final class u extends AbstractC0142n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2158a;

    /* renamed from: b, reason: collision with root package name */
    public C0421a f2159b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0141m f2160c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f2161d;

    /* renamed from: e, reason: collision with root package name */
    public int f2162e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2163f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2164g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2165h;

    /* renamed from: i, reason: collision with root package name */
    public final l2.q f2166i;

    public u(InterfaceC0146s interfaceC0146s) {
        new AtomicReference(null);
        this.f2158a = true;
        this.f2159b = new C0421a();
        EnumC0141m enumC0141m = EnumC0141m.f2151l;
        this.f2160c = enumC0141m;
        this.f2165h = new ArrayList();
        this.f2161d = new WeakReference(interfaceC0146s);
        this.f2166i = new l2.q(enumC0141m);
    }

    @Override // androidx.lifecycle.AbstractC0142n
    public final void a(r rVar) {
        InterfaceC0145q c0133e;
        Object obj;
        InterfaceC0146s interfaceC0146s;
        a2.h.e(rVar, "observer");
        d("addObserver");
        EnumC0141m enumC0141m = this.f2160c;
        EnumC0141m enumC0141m2 = EnumC0141m.f2150k;
        if (enumC0141m != enumC0141m2) {
            enumC0141m2 = EnumC0141m.f2151l;
        }
        C0147t c0147t = new C0147t();
        HashMap hashMap = v.f2167a;
        boolean z3 = rVar instanceof InterfaceC0145q;
        boolean z4 = rVar instanceof DefaultLifecycleObserver;
        int i3 = 1;
        if (z3 && z4) {
            c0133e = new C0133e((DefaultLifecycleObserver) rVar, (InterfaceC0145q) rVar);
        } else if (z4) {
            c0133e = new C0133e((DefaultLifecycleObserver) rVar, (InterfaceC0145q) null);
        } else if (z3) {
            c0133e = (InterfaceC0145q) rVar;
        } else {
            Class<?> cls = rVar.getClass();
            if (v.c(cls) == 2) {
                Object obj2 = v.f2168b.get(cls);
                a2.h.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    v.a((Constructor) list.get(0), rVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0135g[] interfaceC0135gArr = new InterfaceC0135g[size];
                if (size > 0) {
                    v.a((Constructor) list.get(0), rVar);
                    throw null;
                }
                c0133e = new C0428b(interfaceC0135gArr, i3);
            } else {
                c0133e = new C0133e(rVar);
            }
        }
        c0147t.f2157b = c0133e;
        c0147t.f2156a = enumC0141m2;
        C0421a c0421a = this.f2159b;
        C0423c a3 = c0421a.a(rVar);
        if (a3 != null) {
            obj = a3.f4088l;
        } else {
            HashMap hashMap2 = c0421a.f4083o;
            C0423c c0423c = new C0423c(rVar, c0147t);
            c0421a.n++;
            C0423c c0423c2 = c0421a.f4094l;
            if (c0423c2 == null) {
                c0421a.f4093k = c0423c;
                c0421a.f4094l = c0423c;
            } else {
                c0423c2.f4089m = c0423c;
                c0423c.n = c0423c2;
                c0421a.f4094l = c0423c;
            }
            hashMap2.put(rVar, c0423c);
            obj = null;
        }
        if (((C0147t) obj) == null && (interfaceC0146s = (InterfaceC0146s) this.f2161d.get()) != null) {
            boolean z5 = this.f2162e != 0 || this.f2163f;
            EnumC0141m c3 = c(rVar);
            this.f2162e++;
            while (c0147t.f2156a.compareTo(c3) < 0 && this.f2159b.f4083o.containsKey(rVar)) {
                EnumC0141m enumC0141m3 = c0147t.f2156a;
                ArrayList arrayList = this.f2165h;
                arrayList.add(enumC0141m3);
                C0138j c0138j = EnumC0140l.Companion;
                EnumC0141m enumC0141m4 = c0147t.f2156a;
                c0138j.getClass();
                a2.h.e(enumC0141m4, "state");
                int ordinal = enumC0141m4.ordinal();
                EnumC0140l enumC0140l = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0140l.ON_RESUME : EnumC0140l.ON_START : EnumC0140l.ON_CREATE;
                if (enumC0140l == null) {
                    throw new IllegalStateException("no event up from " + c0147t.f2156a);
                }
                c0147t.a(interfaceC0146s, enumC0140l);
                arrayList.remove(arrayList.size() - 1);
                c3 = c(rVar);
            }
            if (!z5) {
                h();
            }
            this.f2162e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0142n
    public final void b(r rVar) {
        a2.h.e(rVar, "observer");
        d("removeObserver");
        this.f2159b.b(rVar);
    }

    public final EnumC0141m c(r rVar) {
        C0147t c0147t;
        HashMap hashMap = this.f2159b.f4083o;
        C0423c c0423c = hashMap.containsKey(rVar) ? ((C0423c) hashMap.get(rVar)).n : null;
        EnumC0141m enumC0141m = (c0423c == null || (c0147t = (C0147t) c0423c.f4088l) == null) ? null : c0147t.f2156a;
        ArrayList arrayList = this.f2165h;
        EnumC0141m enumC0141m2 = arrayList.isEmpty() ? null : (EnumC0141m) arrayList.get(arrayList.size() - 1);
        EnumC0141m enumC0141m3 = this.f2160c;
        a2.h.e(enumC0141m3, "state1");
        if (enumC0141m == null || enumC0141m.compareTo(enumC0141m3) >= 0) {
            enumC0141m = enumC0141m3;
        }
        return (enumC0141m2 == null || enumC0141m2.compareTo(enumC0141m) >= 0) ? enumC0141m : enumC0141m2;
    }

    public final void d(String str) {
        if (this.f2158a) {
            C0377a.S().f3913i.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0468a.b("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0140l enumC0140l) {
        a2.h.e(enumC0140l, "event");
        d("handleLifecycleEvent");
        f(enumC0140l.a());
    }

    public final void f(EnumC0141m enumC0141m) {
        EnumC0141m enumC0141m2 = this.f2160c;
        if (enumC0141m2 == enumC0141m) {
            return;
        }
        EnumC0141m enumC0141m3 = EnumC0141m.f2151l;
        EnumC0141m enumC0141m4 = EnumC0141m.f2150k;
        if (enumC0141m2 == enumC0141m3 && enumC0141m == enumC0141m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0141m + ", but was " + this.f2160c + " in component " + this.f2161d.get()).toString());
        }
        this.f2160c = enumC0141m;
        if (this.f2163f || this.f2162e != 0) {
            this.f2164g = true;
            return;
        }
        this.f2163f = true;
        h();
        this.f2163f = false;
        if (this.f2160c == enumC0141m4) {
            this.f2159b = new C0421a();
        }
    }

    public final void g() {
        d("setCurrentState");
        f(EnumC0141m.f2152m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f2164g = false;
        r12.f2166i.b(r12.f2160c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.u.h():void");
    }
}
