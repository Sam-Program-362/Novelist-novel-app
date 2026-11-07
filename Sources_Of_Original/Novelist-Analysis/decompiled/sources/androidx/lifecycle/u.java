package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0140n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p037m.a f2159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC0139m f2160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f2161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l2.q f2166i;

    public u(InterfaceC0144s interfaceC0144s) {
        new AtomicReference(null);
        this.f2158a = true;
        this.f2159b = new p037m.a();
        EnumC0139m enumC0139m = EnumC0139m.f2151l;
        this.f2160c = enumC0139m;
        this.f2165h = new ArrayList();
        this.f2161d = new WeakReference(interfaceC0144s);
        this.f2166i = new l2.q(enumC0139m);
    }

    @Override // androidx.lifecycle.AbstractC0140n
    public final void a(r rVar) {
        InterfaceC0143q c0131e;
        Object obj;
        InterfaceC0144s interfaceC0144s;
        EnumC0138l enumC0138l;
        a2.h.e(rVar, "observer");
        d("addObserver");
        EnumC0139m enumC0139m = this.f2160c;
        EnumC0139m enumC0139m2 = EnumC0139m.f2150k;
        if (enumC0139m != enumC0139m2) {
            enumC0139m2 = EnumC0139m.f2151l;
        }
        C0145t c0145t = new C0145t();
        HashMap map = v.f2167a;
        boolean z3 = rVar instanceof InterfaceC0143q;
        boolean z4 = rVar instanceof DefaultLifecycleObserver;
        int i3 = 1;
        if (z3 && z4) {
            c0131e = new C0131e((DefaultLifecycleObserver) rVar, (InterfaceC0143q) rVar);
        } else if (z4) {
            c0131e = new C0131e((DefaultLifecycleObserver) rVar, (InterfaceC0143q) null);
        } else if (z3) {
            c0131e = (InterfaceC0143q) rVar;
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
                InterfaceC0133g[] interfaceC0133gArr = new InterfaceC0133g[size];
                if (size > 0) {
                    v.a((Constructor) list.get(0), rVar);
                    throw null;
                }
                c0131e = new p038m0.b(interfaceC0133gArr, i3);
            } else {
                c0131e = new C0131e(rVar);
            }
        }
        c0145t.f2157b = c0131e;
        c0145t.f2156a = enumC0139m2;
        p037m.a aVar = this.f2159b;
        p037m.c cVarA = aVar.a(rVar);
        if (cVarA != null) {
            obj = cVarA.f4088l;
        } else {
            HashMap map2 = aVar.f4083o;
            p037m.c cVar = new p037m.c(rVar, c0145t);
            aVar.n++;
            p037m.c cVar2 = aVar.f4094l;
            if (cVar2 == null) {
                aVar.f4093k = cVar;
                aVar.f4094l = cVar;
            } else {
                cVar2.f4089m = cVar;
                cVar.n = cVar2;
                aVar.f4094l = cVar;
            }
            map2.put(rVar, cVar);
            obj = null;
        }
        if (((C0145t) obj) == null && (interfaceC0144s = (InterfaceC0144s) this.f2161d.get()) != null) {
            boolean z5 = this.f2162e != 0 || this.f2163f;
            EnumC0139m enumC0139mC = c(rVar);
            this.f2162e++;
            while (c0145t.f2156a.compareTo(enumC0139mC) < 0 && this.f2159b.f4083o.containsKey(rVar)) {
                EnumC0139m enumC0139m3 = c0145t.f2156a;
                ArrayList arrayList = this.f2165h;
                arrayList.add(enumC0139m3);
                C0136j c0136j = EnumC0138l.Companion;
                EnumC0139m enumC0139m4 = c0145t.f2156a;
                c0136j.getClass();
                a2.h.e(enumC0139m4, "state");
                int iOrdinal = enumC0139m4.ordinal();
                if (iOrdinal == 1) {
                    enumC0138l = EnumC0138l.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC0138l = iOrdinal != 3 ? null : EnumC0138l.ON_RESUME;
                } else {
                    enumC0138l = EnumC0138l.ON_START;
                }
                if (enumC0138l == null) {
                    throw new IllegalStateException("no event up from " + c0145t.f2156a);
                }
                c0145t.a(interfaceC0144s, enumC0138l);
                arrayList.remove(arrayList.size() - 1);
                enumC0139mC = c(rVar);
            }
            if (!z5) {
                h();
            }
            this.f2162e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0140n
    public final void b(r rVar) {
        a2.h.e(rVar, "observer");
        d("removeObserver");
        this.f2159b.b(rVar);
    }

    public final EnumC0139m c(r rVar) {
        C0145t c0145t;
        HashMap map = this.f2159b.f4083o;
        p037m.c cVar = map.containsKey(rVar) ? ((p037m.c) map.get(rVar)).n : null;
        EnumC0139m enumC0139m = (cVar == null || (c0145t = (C0145t) cVar.f4088l) == null) ? null : c0145t.f2156a;
        ArrayList arrayList = this.f2165h;
        EnumC0139m enumC0139m2 = arrayList.isEmpty() ? null : (EnumC0139m) arrayList.get(arrayList.size() - 1);
        EnumC0139m enumC0139m3 = this.f2160c;
        a2.h.e(enumC0139m3, "state1");
        if (enumC0139m == null || enumC0139m.compareTo(enumC0139m3) >= 0) {
            enumC0139m = enumC0139m3;
        }
        return (enumC0139m2 == null || enumC0139m2.compareTo(enumC0139m) >= 0) ? enumC0139m : enumC0139m2;
    }

    public final void d(String str) {
        if (this.f2158a) {
            p034l.a.S().f3913i.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(p055t.a.b("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0138l enumC0138l) {
        a2.h.e(enumC0138l, "event");
        d("handleLifecycleEvent");
        f(enumC0138l.a());
    }

    public final void f(EnumC0139m enumC0139m) {
        EnumC0139m enumC0139m2 = this.f2160c;
        if (enumC0139m2 == enumC0139m) {
            return;
        }
        EnumC0139m enumC0139m3 = EnumC0139m.f2151l;
        EnumC0139m enumC0139m4 = EnumC0139m.f2150k;
        if (enumC0139m2 == enumC0139m3 && enumC0139m == enumC0139m4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0139m + ", but was " + this.f2160c + " in component " + this.f2161d.get()).toString());
        }
        this.f2160c = enumC0139m;
        if (this.f2163f || this.f2162e != 0) {
            this.f2164g = true;
            return;
        }
        this.f2163f = true;
        h();
        this.f2163f = false;
        if (this.f2160c == enumC0139m4) {
            this.f2159b = new p037m.a();
        }
    }

    public final void g() {
        d("setCurrentState");
        f(EnumC0139m.f2152m);
    }

    public final void h() {
        EnumC0138l enumC0138l;
        EnumC0138l enumC0138l2;
        InterfaceC0144s interfaceC0144s = (InterfaceC0144s) this.f2161d.get();
        if (interfaceC0144s == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p037m.a aVar = this.f2159b;
            if (aVar.n != 0) {
                p037m.c cVar = aVar.f4093k;
                a2.h.b(cVar);
                EnumC0139m enumC0139m = ((C0145t) cVar.f4088l).f2156a;
                p037m.c cVar2 = this.f2159b.f4094l;
                a2.h.b(cVar2);
                EnumC0139m enumC0139m2 = ((C0145t) cVar2.f4088l).f2156a;
                if (enumC0139m == enumC0139m2 && this.f2160c == enumC0139m2) {
                    break;
                }
                this.f2164g = false;
                EnumC0139m enumC0139m3 = this.f2160c;
                p037m.c cVar3 = this.f2159b.f4093k;
                a2.h.b(cVar3);
                if (enumC0139m3.compareTo(((C0145t) cVar3.f4088l).f2156a) < 0) {
                    p037m.a aVar2 = this.f2159b;
                    p037m.b bVar = new p037m.b(aVar2.f4094l, aVar2.f4093k, 1);
                    aVar2.f4095m.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f2164g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        a2.h.d(entry, "next()");
                        r rVar = (r) entry.getKey();
                        C0145t c0145t = (C0145t) entry.getValue();
                        while (c0145t.f2156a.compareTo(this.f2160c) > 0 && !this.f2164g && this.f2159b.f4083o.containsKey(rVar)) {
                            C0136j c0136j = EnumC0138l.Companion;
                            EnumC0139m enumC0139m4 = c0145t.f2156a;
                            c0136j.getClass();
                            a2.h.e(enumC0139m4, "state");
                            int iOrdinal = enumC0139m4.ordinal();
                            if (iOrdinal == 2) {
                                enumC0138l2 = EnumC0138l.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                enumC0138l2 = iOrdinal != 4 ? null : EnumC0138l.ON_PAUSE;
                            } else {
                                enumC0138l2 = EnumC0138l.ON_STOP;
                            }
                            if (enumC0138l2 == null) {
                                throw new IllegalStateException("no event down from " + c0145t.f2156a);
                            }
                            this.f2165h.add(enumC0138l2.a());
                            c0145t.a(interfaceC0144s, enumC0138l2);
                            ArrayList arrayList = this.f2165h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p037m.c cVar4 = this.f2159b.f4094l;
                if (!this.f2164g && cVar4 != null && this.f2160c.compareTo(((C0145t) cVar4.f4088l).f2156a) > 0) {
                    p037m.a aVar3 = this.f2159b;
                    aVar3.getClass();
                    p037m.d dVar = new p037m.d(aVar3);
                    aVar3.f4095m.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f2164g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        r rVar2 = (r) entry2.getKey();
                        C0145t c0145t2 = (C0145t) entry2.getValue();
                        while (c0145t2.f2156a.compareTo(this.f2160c) < 0 && !this.f2164g && this.f2159b.f4083o.containsKey(rVar2)) {
                            this.f2165h.add(c0145t2.f2156a);
                            C0136j c0136j2 = EnumC0138l.Companion;
                            EnumC0139m enumC0139m5 = c0145t2.f2156a;
                            c0136j2.getClass();
                            a2.h.e(enumC0139m5, "state");
                            int iOrdinal2 = enumC0139m5.ordinal();
                            if (iOrdinal2 == 1) {
                                enumC0138l = EnumC0138l.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                enumC0138l = iOrdinal2 != 3 ? null : EnumC0138l.ON_RESUME;
                            } else {
                                enumC0138l = EnumC0138l.ON_START;
                            }
                            if (enumC0138l == null) {
                                throw new IllegalStateException("no event up from " + c0145t2.f2156a);
                            }
                            c0145t2.a(interfaceC0144s, enumC0138l);
                            ArrayList arrayList2 = this.f2165h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f2164g = false;
        this.f2166i.b(this.f2160c);
    }
}
