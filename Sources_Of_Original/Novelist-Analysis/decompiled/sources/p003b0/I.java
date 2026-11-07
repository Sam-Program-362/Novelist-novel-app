package p003b0;

import A.b;
import A.c;
import A0.j;
import B1.g;
import B1.s;
import M1.A;
import a2.h;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0139m;
import androidx.lifecycle.InterfaceC0144s;
import androidx.lifecycle.S;
import androidx.lifecycle.u;
import c0.d;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import it.returntrue.novelist.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p000a.a;
import p002b.f;
import p002b.o;
import p002b.p;
import p002b.t;
import p004b1.Q;
import p022h0.e;
import s.i;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final A f2354A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Q f2355B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Q f2356C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Q f2357D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayDeque f2358E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f2359F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f2360G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f2361H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f2362I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f2363J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f2364K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f2365L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f2366M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public L f2367N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final b f2368O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2370b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f2373e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f2375g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f2381m;
    public final c n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f2382o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f2383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f2384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f2385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f2386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A f2387t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0165u f2388v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f2389w;
    public AbstractComponentCallbacksC0163s x;
    public AbstractComponentCallbacksC0163s y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final B f2390z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2369a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f2371c = new s(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2372d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f2374f = new x(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0146a f2376h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f2377i = new z(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f2378j = new AtomicInteger();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f2379k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f2380l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [b0.y] */
    /* JADX WARN: Type inference failed for: r0v16, types: [b0.y] */
    /* JADX WARN: Type inference failed for: r0v17, types: [b0.y] */
    /* JADX WARN: Type inference failed for: r0v18, types: [b0.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f2381m = new ArrayList();
        this.n = new c(this);
        this.f2382o = new CopyOnWriteArrayList();
        final int i3 = 0;
        this.f2383p = new C.a(this) { // from class: b0.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f2565b;

            {
                this.f2565b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        I i4 = this.f2565b;
                        if (i4.L()) {
                            i4.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i5 = this.f2565b;
                        if (i5.L() && num.intValue() == 80) {
                            i5.m(false);
                            break;
                        }
                        break;
                    case 2:
                        s.c cVar = (s.c) obj;
                        I i6 = this.f2565b;
                        if (i6.L()) {
                            boolean z3 = cVar.f4440a;
                            i6.n(false);
                        }
                        break;
                    default:
                        i iVar = (i) obj;
                        I i7 = this.f2565b;
                        if (i7.L()) {
                            boolean z4 = iVar.f4464a;
                            i7.s(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f2384q = new C.a(this) { // from class: b0.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f2565b;

            {
                this.f2565b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        I i5 = this.f2565b;
                        if (i5.L()) {
                            i5.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i6 = this.f2565b;
                        if (i6.L() && num.intValue() == 80) {
                            i6.m(false);
                            break;
                        }
                        break;
                    case 2:
                        s.c cVar = (s.c) obj;
                        I i7 = this.f2565b;
                        if (i7.L()) {
                            boolean z3 = cVar.f4440a;
                            i7.n(false);
                        }
                        break;
                    default:
                        i iVar = (i) obj;
                        I i8 = this.f2565b;
                        if (i8.L()) {
                            boolean z4 = iVar.f4464a;
                            i8.s(false);
                        }
                        break;
                }
            }
        };
        final int i5 = 2;
        this.f2385r = new C.a(this) { // from class: b0.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f2565b;

            {
                this.f2565b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        I i6 = this.f2565b;
                        if (i6.L()) {
                            i6.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i7 = this.f2565b;
                        if (i7.L() && num.intValue() == 80) {
                            i7.m(false);
                            break;
                        }
                        break;
                    case 2:
                        s.c cVar = (s.c) obj;
                        I i8 = this.f2565b;
                        if (i8.L()) {
                            boolean z3 = cVar.f4440a;
                            i8.n(false);
                        }
                        break;
                    default:
                        i iVar = (i) obj;
                        I i9 = this.f2565b;
                        if (i9.L()) {
                            boolean z4 = iVar.f4464a;
                            i9.s(false);
                        }
                        break;
                }
            }
        };
        final int i6 = 3;
        this.f2386s = new C.a(this) { // from class: b0.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f2565b;

            {
                this.f2565b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        I i7 = this.f2565b;
                        if (i7.L()) {
                            i7.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i8 = this.f2565b;
                        if (i8.L() && num.intValue() == 80) {
                            i8.m(false);
                            break;
                        }
                        break;
                    case 2:
                        s.c cVar = (s.c) obj;
                        I i9 = this.f2565b;
                        if (i9.L()) {
                            boolean z3 = cVar.f4440a;
                            i9.n(false);
                        }
                        break;
                    default:
                        i iVar = (i) obj;
                        I i10 = this.f2565b;
                        if (i10.L()) {
                            boolean z4 = iVar.f4464a;
                            i10.s(false);
                        }
                        break;
                }
            }
        };
        this.f2387t = new A(this);
        this.u = -1;
        this.f2390z = new B(this);
        this.f2354A = new A(12);
        this.f2358E = new ArrayDeque();
        this.f2368O = new b(this, 9);
    }

    public static HashSet E(C0146a c0146a) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < c0146a.f2437a.size(); i3++) {
            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = ((P) c0146a.f2437a.get(i3)).f2423b;
            if (abstractComponentCallbacksC0163s != null && c0146a.f2443g) {
                hashSet.add(abstractComponentCallbacksC0163s);
            }
        }
        return hashSet;
    }

    public static boolean J(int i3) {
        return Log.isLoggable("FragmentManager", i3);
    }

    public static boolean K(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        abstractComponentCallbacksC0163s.getClass();
        ArrayList arrayListM = abstractComponentCallbacksC0163s.f2518E.f2371c.m();
        int size = arrayListM.size();
        boolean zK = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListM.get(i3);
            i3++;
            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = (AbstractComponentCallbacksC0163s) obj;
            if (abstractComponentCallbacksC0163s2 != null) {
                zK = K(abstractComponentCallbacksC0163s2);
            }
            if (zK) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (abstractComponentCallbacksC0163s == null) {
            return true;
        }
        if (abstractComponentCallbacksC0163s.f2526M) {
            return abstractComponentCallbacksC0163s.f2516C == null || M(abstractComponentCallbacksC0163s.f2519F);
        }
        return false;
    }

    public static boolean N(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (abstractComponentCallbacksC0163s == null) {
            return true;
        }
        I i3 = abstractComponentCallbacksC0163s.f2516C;
        return abstractComponentCallbacksC0163s.equals(i3.y) && N(i3.x);
    }

    public static void b0(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0163s);
        }
        if (abstractComponentCallbacksC0163s.f2523J) {
            abstractComponentCallbacksC0163s.f2523J = false;
            abstractComponentCallbacksC0163s.S = !abstractComponentCallbacksC0163s.S;
        }
    }

    public final boolean A(boolean z3) {
        boolean zA;
        z(z3);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f2364K;
            ArrayList arrayList2 = this.f2365L;
            synchronized (this.f2369a) {
                if (this.f2369a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f2369a.size();
                        zA = false;
                        for (int i3 = 0; i3 < size; i3++) {
                            zA |= ((F) this.f2369a.get(i3)).a(arrayList, arrayList2);
                        }
                        this.f2369a.clear();
                        this.f2388v.f2554o.removeCallbacks(this.f2368O);
                    } catch (Throwable th) {
                        this.f2369a.clear();
                        this.f2388v.f2554o.removeCallbacks(this.f2368O);
                        throw th;
                    }
                }
            }
            if (!zA) {
                e0();
                v();
                ((HashMap) this.f2371c.f145l).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f2370b = true;
            try {
                T(this.f2364K, this.f2365L);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x021e A[PHI: r15
      0x021e: PHI (r15v21 int) = (r15v20 int), (r15v23 int) binds: [B:103:0x020b, B:107:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0166  */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        s sVar = this.f2371c;
        ArrayList arrayList3 = this.f2381m;
        boolean z6 = ((C0146a) arrayList.get(i3)).f2450o;
        ArrayList arrayList4 = this.f2366M;
        if (arrayList4 == null) {
            this.f2366M = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f2366M.addAll(sVar.n());
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.y;
        int i7 = i3;
        boolean z7 = false;
        while (i7 < i4) {
            C0146a c0146a = (C0146a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                z3 = z6;
                i5 = i7;
                z4 = z7;
                int i8 = 1;
                ArrayList arrayList5 = this.f2366M;
                ArrayList arrayList6 = c0146a.f2437a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    P p3 = (P) arrayList6.get(size);
                    int i9 = p3.f2422a;
                    if (i9 != i8) {
                        if (i9 != 3) {
                            switch (i9) {
                                case 6:
                                    arrayList5.add(p3.f2423b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC0163s = null;
                                    break;
                                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                                    abstractComponentCallbacksC0163s = p3.f2423b;
                                    break;
                                case 10:
                                    p3.f2430i = p3.f2429h;
                                    break;
                            }
                        } else {
                            arrayList5.add(p3.f2423b);
                        }
                        size--;
                        i8 = 1;
                    }
                    arrayList5.remove(p3.f2423b);
                    size--;
                    i8 = 1;
                }
            } else {
                ArrayList arrayList7 = this.f2366M;
                ArrayList arrayList8 = c0146a.f2437a;
                int i10 = 0;
                while (i10 < arrayList8.size()) {
                    P p4 = (P) arrayList8.get(i10);
                    boolean z8 = z6;
                    int i11 = p4.f2422a;
                    int i12 = i7;
                    int i13 = 1;
                    if (i11 != 1) {
                        z5 = z7;
                        if (i11 != 2) {
                            if (i11 == 3 || i11 == 6) {
                                arrayList7.remove(p4.f2423b);
                                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = p4.f2423b;
                                if (abstractComponentCallbacksC0163s2 == abstractComponentCallbacksC0163s) {
                                    arrayList8.add(i10, new P(9, abstractComponentCallbacksC0163s2));
                                    i10++;
                                    abstractComponentCallbacksC0163s = null;
                                }
                            } else if (i11 == 7) {
                                i13 = 1;
                            } else if (i11 == 8) {
                                arrayList8.add(i10, new P(9, abstractComponentCallbacksC0163s, 0));
                                p4.f2424c = true;
                                i10++;
                                abstractComponentCallbacksC0163s = p4.f2423b;
                            }
                            i13 = 1;
                        } else {
                            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s3 = p4.f2423b;
                            int i14 = abstractComponentCallbacksC0163s3.f2521H;
                            int size2 = arrayList7.size() - 1;
                            boolean z9 = false;
                            while (size2 >= 0) {
                                int i15 = size2;
                                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s4 = (AbstractComponentCallbacksC0163s) arrayList7.get(size2);
                                if (abstractComponentCallbacksC0163s4.f2521H != i14) {
                                    i14 = i14;
                                } else if (abstractComponentCallbacksC0163s4 == abstractComponentCallbacksC0163s3) {
                                    i14 = i14;
                                    z9 = true;
                                } else {
                                    if (abstractComponentCallbacksC0163s4 == abstractComponentCallbacksC0163s) {
                                        arrayList8.add(i10, new P(9, abstractComponentCallbacksC0163s4, 0));
                                        i10++;
                                        i6 = 0;
                                        abstractComponentCallbacksC0163s = null;
                                    } else {
                                        i6 = 0;
                                    }
                                    P p5 = new P(3, abstractComponentCallbacksC0163s4, i6);
                                    p5.f2425d = p4.f2425d;
                                    p5.f2427f = p4.f2427f;
                                    p5.f2426e = p4.f2426e;
                                    p5.f2428g = p4.f2428g;
                                    arrayList8.add(i10, p5);
                                    arrayList7.remove(abstractComponentCallbacksC0163s4);
                                    i10++;
                                    abstractComponentCallbacksC0163s = abstractComponentCallbacksC0163s;
                                }
                                size2 = i15 - 1;
                                i14 = i14;
                            }
                            i13 = 1;
                            if (z9) {
                                arrayList8.remove(i10);
                                i10--;
                            } else {
                                p4.f2422a = 1;
                                p4.f2424c = true;
                                arrayList7.add(abstractComponentCallbacksC0163s3);
                            }
                        }
                        i10 += i13;
                        z6 = z8;
                        i7 = i12;
                        z7 = z5;
                    } else {
                        z5 = z7;
                    }
                    arrayList7.add(p4.f2423b);
                    i10 += i13;
                    z6 = z8;
                    i7 = i12;
                    z7 = z5;
                }
                z3 = z6;
                i5 = i7;
                z4 = z7;
            }
            z7 = z4 || c0146a.f2443g;
            i7 = i5 + 1;
            z6 = z3;
        }
        boolean z10 = z6;
        boolean z11 = z7;
        this.f2366M.clear();
        if (!z10 && this.u >= 1) {
            for (int i16 = i3; i16 < i4; i16++) {
                ArrayList arrayList9 = ((C0146a) arrayList.get(i16)).f2437a;
                int size3 = arrayList9.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj = arrayList9.get(i17);
                    i17++;
                    AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s5 = ((P) obj).f2423b;
                    if (abstractComponentCallbacksC0163s5 != null && abstractComponentCallbacksC0163s5.f2516C != null) {
                        sVar.u(g(abstractComponentCallbacksC0163s5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i18 = i3;
        while (i18 < i4) {
            C0146a c0146a2 = (C0146a) arrayList.get(i18);
            if (((Boolean) arrayList2.get(i18)).booleanValue()) {
                c0146a2.c(-1);
                I i19 = c0146a2.f2451p;
                ArrayList arrayList10 = c0146a2.f2437a;
                boolean z12 = true;
                for (int size4 = arrayList10.size() - 1; size4 >= 0; size4--) {
                    P p6 = (P) arrayList10.get(size4);
                    AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s6 = p6.f2423b;
                    if (abstractComponentCallbacksC0163s6 != null) {
                        if (abstractComponentCallbacksC0163s6.f2531R != null) {
                            abstractComponentCallbacksC0163s6.e().f2503a = z12;
                        }
                        int i20 = c0146a2.f2442f;
                        int i21 = 8194;
                        int i22 = 4097;
                        if (i20 != 4097) {
                            if (i20 != 8194) {
                                i21 = 4100;
                                if (i20 != 8197) {
                                    i22 = 4099;
                                    if (i20 != 4099) {
                                        i21 = i20 != 4100 ? 0 : 8197;
                                    } else {
                                        i21 = i22;
                                    }
                                }
                            } else {
                                i21 = i22;
                            }
                        }
                        if (abstractComponentCallbacksC0163s6.f2531R != null || i21 != 0) {
                            abstractComponentCallbacksC0163s6.e();
                            abstractComponentCallbacksC0163s6.f2531R.f2508f = i21;
                        }
                        abstractComponentCallbacksC0163s6.e();
                        abstractComponentCallbacksC0163s6.f2531R.getClass();
                    }
                    switch (p6.f2422a) {
                        case 1:
                            abstractComponentCallbacksC0163s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            z12 = true;
                            i19.X(abstractComponentCallbacksC0163s6, true);
                            i19.S(abstractComponentCallbacksC0163s6);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str + p6.f2422a);
                        case 3:
                            abstractComponentCallbacksC0163s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            i19.a(abstractComponentCallbacksC0163s6);
                            z12 = true;
                            break;
                        case 4:
                            abstractComponentCallbacksC0163s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            i19.getClass();
                            b0(abstractComponentCallbacksC0163s6);
                            z12 = true;
                            break;
                        case 5:
                            abstractComponentCallbacksC0163s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            i19.X(abstractComponentCallbacksC0163s6, true);
                            i19.I(abstractComponentCallbacksC0163s6);
                            z12 = true;
                            break;
                        case 6:
                            abstractComponentCallbacksC0163s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            i19.c(abstractComponentCallbacksC0163s6);
                            z12 = true;
                            break;
                        case 7:
                            abstractComponentCallbacksC0163s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            i19.X(abstractComponentCallbacksC0163s6, true);
                            i19.h(abstractComponentCallbacksC0163s6);
                            z12 = true;
                            break;
                        case 8:
                            i19.Z(null);
                            z12 = true;
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            i19.Z(abstractComponentCallbacksC0163s6);
                            z12 = true;
                            break;
                        case 10:
                            i19.Y(abstractComponentCallbacksC0163s6, p6.f2429h);
                            z12 = true;
                            break;
                    }
                }
            } else {
                c0146a2.c(1);
                I i23 = c0146a2.f2451p;
                ArrayList arrayList11 = c0146a2.f2437a;
                int size5 = arrayList11.size();
                int i24 = 0;
                while (i24 < size5) {
                    P p7 = (P) arrayList11.get(i24);
                    AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s7 = p7.f2423b;
                    if (abstractComponentCallbacksC0163s7 != null) {
                        if (abstractComponentCallbacksC0163s7.f2531R != null) {
                            abstractComponentCallbacksC0163s7.e().f2503a = false;
                        }
                        int i25 = c0146a2.f2442f;
                        if (abstractComponentCallbacksC0163s7.f2531R != null || i25 != 0) {
                            abstractComponentCallbacksC0163s7.e();
                            abstractComponentCallbacksC0163s7.f2531R.f2508f = i25;
                        }
                        abstractComponentCallbacksC0163s7.e();
                        abstractComponentCallbacksC0163s7.f2531R.getClass();
                    }
                    switch (p7.f2422a) {
                        case 1:
                            abstractComponentCallbacksC0163s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i23.X(abstractComponentCallbacksC0163s7, false);
                            i23.a(abstractComponentCallbacksC0163s7);
                            i24++;
                            str = str;
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str + p7.f2422a);
                        case 3:
                            abstractComponentCallbacksC0163s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i23.S(abstractComponentCallbacksC0163s7);
                            i24++;
                            str = str;
                            break;
                        case 4:
                            abstractComponentCallbacksC0163s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i23.I(abstractComponentCallbacksC0163s7);
                            i24++;
                            str = str;
                            break;
                        case 5:
                            abstractComponentCallbacksC0163s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i23.X(abstractComponentCallbacksC0163s7, false);
                            b0(abstractComponentCallbacksC0163s7);
                            i24++;
                            str = str;
                            break;
                        case 6:
                            abstractComponentCallbacksC0163s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i23.h(abstractComponentCallbacksC0163s7);
                            i24++;
                            str = str;
                            break;
                        case 7:
                            abstractComponentCallbacksC0163s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i23.X(abstractComponentCallbacksC0163s7, false);
                            i23.c(abstractComponentCallbacksC0163s7);
                            i24++;
                            str = str;
                            break;
                        case 8:
                            i23.Z(abstractComponentCallbacksC0163s7);
                            i24++;
                            str = str;
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            i23.Z(null);
                            i24++;
                            str = str;
                            break;
                        case 10:
                            i23.Y(abstractComponentCallbacksC0163s7, p7.f2430i);
                            i24++;
                            str = str;
                            break;
                    }
                }
            }
            i18++;
            str = str;
        }
        boolean zBooleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
        if (z11 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i26 = 0;
            while (i26 < size6) {
                Object obj2 = arrayList.get(i26);
                i26++;
                linkedHashSet.addAll(E((C0146a) obj2));
            }
            if (this.f2376h == null) {
                int size7 = arrayList3.size();
                int i27 = 0;
                while (i27 < size7) {
                    Object obj3 = arrayList3.get(i27);
                    i27++;
                    if (obj3 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i28 = 0;
                while (i28 < size8) {
                    Object obj4 = arrayList3.get(i28);
                    i28++;
                    if (obj4 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i29 = i3; i29 < i4; i29++) {
            C0146a c0146a3 = (C0146a) arrayList.get(i29);
            if (zBooleanValue) {
                for (int size9 = c0146a3.f2437a.size() - 1; size9 >= 0; size9--) {
                    AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s8 = ((P) c0146a3.f2437a.get(size9)).f2423b;
                    if (abstractComponentCallbacksC0163s8 != null) {
                        g(abstractComponentCallbacksC0163s8).j();
                    }
                }
            } else {
                ArrayList arrayList12 = c0146a3.f2437a;
                int size10 = arrayList12.size();
                int i30 = 0;
                while (i30 < size10) {
                    Object obj5 = arrayList12.get(i30);
                    i30++;
                    AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s9 = ((P) obj5).f2423b;
                    if (abstractComponentCallbacksC0163s9 != null) {
                        g(abstractComponentCallbacksC0163s9).j();
                    }
                }
            }
        }
        O(this.u, true);
        int i31 = i3;
        for (C0157l c0157l : f(arrayList, i31, i4)) {
            c0157l.f2483d = zBooleanValue;
            synchronized (c0157l.f2481b) {
                c0157l.f();
                ArrayList arrayList13 = c0157l.f2481b;
                ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                if (listIterator.hasPrevious()) {
                    ((U) listIterator.previous()).getClass();
                    throw null;
                }
                c0157l.f2484e = false;
            }
            c0157l.c();
        }
        while (i31 < i4) {
            C0146a c0146a4 = (C0146a) arrayList.get(i31);
            if (((Boolean) arrayList2.get(i31)).booleanValue() && c0146a4.f2453r >= 0) {
                c0146a4.f2453r = -1;
            }
            c0146a4.getClass();
            i31++;
        }
        if (!z11 || arrayList3.size() <= 0) {
            return;
        }
        arrayList3.get(0).getClass();
        throw new ClassCastException();
    }

    public final AbstractComponentCallbacksC0163s C(int i3) {
        s sVar = this.f2371c;
        ArrayList arrayList = (ArrayList) sVar.f144k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = (AbstractComponentCallbacksC0163s) arrayList.get(size);
            if (abstractComponentCallbacksC0163s != null && abstractComponentCallbacksC0163s.f2520G == i3) {
                return abstractComponentCallbacksC0163s;
            }
        }
        for (O o2 : ((HashMap) sVar.f145l).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = o2.f2419c;
                if (abstractComponentCallbacksC0163s2.f2520G == i3) {
                    return abstractComponentCallbacksC0163s2;
                }
            }
        }
        return null;
    }

    public final void D() {
        for (C0157l c0157l : e()) {
            if (c0157l.f2484e) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0157l.f2484e = false;
                c0157l.c();
            }
        }
    }

    public final ViewGroup F(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        ViewGroup viewGroup = abstractComponentCallbacksC0163s.f2528O;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0163s.f2521H <= 0 || !this.f2389w.M()) {
            return null;
        }
        View viewL = this.f2389w.L(abstractComponentCallbacksC0163s.f2521H);
        if (viewL instanceof ViewGroup) {
            return (ViewGroup) viewL;
        }
        return null;
    }

    public final B G() {
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.x;
        return abstractComponentCallbacksC0163s != null ? abstractComponentCallbacksC0163s.f2516C.G() : this.f2390z;
    }

    public final A H() {
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.x;
        return abstractComponentCallbacksC0163s != null ? abstractComponentCallbacksC0163s.f2516C.H() : this.f2354A;
    }

    public final void I(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0163s);
        }
        if (abstractComponentCallbacksC0163s.f2523J) {
            return;
        }
        abstractComponentCallbacksC0163s.f2523J = true;
        abstractComponentCallbacksC0163s.S = true ^ abstractComponentCallbacksC0163s.S;
        a0(abstractComponentCallbacksC0163s);
    }

    public final boolean L() {
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.x;
        if (abstractComponentCallbacksC0163s == null) {
            return true;
        }
        return abstractComponentCallbacksC0163s.f2517D != null && abstractComponentCallbacksC0163s.u && abstractComponentCallbacksC0163s.j().L();
    }

    public final void O(int i3, boolean z3) {
        C0165u c0165u;
        if (this.f2388v == null && i3 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i3 != this.u) {
            this.u = i3;
            s sVar = this.f2371c;
            HashMap map = (HashMap) sVar.f145l;
            ArrayList arrayList = (ArrayList) sVar.f144k;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                O o2 = (O) map.get(((AbstractComponentCallbacksC0163s) obj).f2542o);
                if (o2 != null) {
                    o2.j();
                }
            }
            for (O o3 : map.values()) {
                if (o3 != null) {
                    o3.j();
                    AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = o3.f2419c;
                    if (abstractComponentCallbacksC0163s.f2548v && !abstractComponentCallbacksC0163s.n()) {
                        sVar.v(o3);
                    }
                }
            }
            c0();
            if (this.f2359F && (c0165u = this.f2388v) != null && this.u == 7) {
                c0165u.f2556q.invalidateOptionsMenu();
                this.f2359F = false;
            }
        }
    }

    public final void P() {
        if (this.f2388v == null) {
            return;
        }
        this.f2360G = false;
        this.f2361H = false;
        this.f2367N.f2405g = false;
        for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0163s != null) {
                abstractComponentCallbacksC0163s.f2518E.P();
            }
        }
    }

    public final boolean Q() {
        A(false);
        z(true);
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.y;
        if (abstractComponentCallbacksC0163s != null && abstractComponentCallbacksC0163s.g().Q()) {
            return true;
        }
        boolean zR = R(this.f2364K, this.f2365L, -1, 0);
        if (zR) {
            this.f2370b = true;
            try {
                T(this.f2364K, this.f2365L);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        e0();
        v();
        ((HashMap) this.f2371c.f145l).values().removeAll(Collections.singleton(null));
        return zR;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        boolean z3 = (i4 & 1) != 0;
        int size = -1;
        if (!this.f2372d.isEmpty()) {
            if (i3 < 0) {
                size = z3 ? 0 : this.f2372d.size() - 1;
            } else {
                int size2 = this.f2372d.size() - 1;
                while (size2 >= 0) {
                    C0146a c0146a = (C0146a) this.f2372d.get(size2);
                    if (i3 >= 0 && i3 == c0146a.f2453r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z3) {
                    size = size2;
                    while (size > 0) {
                        C0146a c0146a2 = (C0146a) this.f2372d.get(size - 1);
                        if (i3 < 0 || i3 != c0146a2.f2453r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f2372d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f2372d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0146a) this.f2372d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0163s + " nesting=" + abstractComponentCallbacksC0163s.f2515B);
        }
        boolean zN = abstractComponentCallbacksC0163s.n();
        if (abstractComponentCallbacksC0163s.f2524K && zN) {
            return;
        }
        s sVar = this.f2371c;
        synchronized (((ArrayList) sVar.f144k)) {
            ((ArrayList) sVar.f144k).remove(abstractComponentCallbacksC0163s);
        }
        abstractComponentCallbacksC0163s.u = false;
        if (K(abstractComponentCallbacksC0163s)) {
            this.f2359F = true;
        }
        abstractComponentCallbacksC0163s.f2548v = true;
        a0(abstractComponentCallbacksC0163s);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            if (!((C0146a) arrayList.get(i3)).f2450o) {
                if (i4 != i3) {
                    B(arrayList, arrayList2, i4, i3);
                }
                i4 = i3 + 1;
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((C0146a) arrayList.get(i4)).f2450o) {
                        i4++;
                    }
                }
                B(arrayList, arrayList2, i3, i4);
                i3 = i4 - 1;
            }
            i3++;
        }
        if (i4 != size) {
            B(arrayList, arrayList2, i4, size);
        }
    }

    public final void U(Bundle bundle) {
        c cVar;
        int i3;
        Bundle bundle2;
        O o2;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f2388v.n.getClassLoader());
                this.f2380l.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f2388v.n.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        s sVar = this.f2371c;
        HashMap map2 = (HashMap) sVar.f146m;
        HashMap map3 = (HashMap) sVar.f145l;
        map2.clear();
        map2.putAll(map);
        J j3 = (J) bundle.getParcelable("state");
        if (j3 == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = j3.f2391k;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            cVar = this.n;
            int i5 = 2;
            if (i4 >= size) {
                break;
            }
            Object obj = arrayList.get(i4);
            i4++;
            Bundle bundleA = sVar.A((String) obj, null);
            if (bundleA != null) {
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = (AbstractComponentCallbacksC0163s) this.f2367N.f2400b.get(((N) bundleA.getParcelable("state")).f2407l);
                if (abstractComponentCallbacksC0163s != null) {
                    if (J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0163s);
                    }
                    o2 = new O(cVar, sVar, abstractComponentCallbacksC0163s, bundleA);
                    bundle2 = bundleA;
                } else {
                    i5 = 2;
                    bundle2 = bundleA;
                    o2 = new O(this.n, this.f2371c, this.f2388v.n.getClassLoader(), G(), bundleA);
                }
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = o2.f2419c;
                abstractComponentCallbacksC0163s2.f2540l = bundle2;
                abstractComponentCallbacksC0163s2.f2516C = this;
                if (J(i5)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0163s2.f2542o + "): " + abstractComponentCallbacksC0163s2);
                }
                o2.l(this.f2388v.n.getClassLoader());
                sVar.u(o2);
                o2.f2421e = this.u;
            }
        }
        L l3 = this.f2367N;
        l3.getClass();
        ArrayList arrayList2 = new ArrayList(l3.f2400b.values());
        int size2 = arrayList2.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList2.get(i6);
            i6++;
            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s3 = (AbstractComponentCallbacksC0163s) obj2;
            if (map3.get(abstractComponentCallbacksC0163s3.f2542o) == null) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0163s3 + " that was not found in the set of active Fragments " + j3.f2391k);
                }
                this.f2367N.f(abstractComponentCallbacksC0163s3);
                abstractComponentCallbacksC0163s3.f2516C = this;
                O o3 = new O(cVar, sVar, abstractComponentCallbacksC0163s3);
                o3.f2421e = 1;
                o3.j();
                abstractComponentCallbacksC0163s3.f2548v = true;
                o3.j();
            }
        }
        ArrayList arrayList3 = j3.f2392l;
        ((ArrayList) sVar.f144k).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                String str3 = (String) obj3;
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163sH = sVar.h(str3);
                if (abstractComponentCallbacksC0163sH == null) {
                    throw new IllegalStateException(p055t.a.b("No instantiated fragment for (", str3, ")"));
                }
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0163sH);
                }
                sVar.b(abstractComponentCallbacksC0163sH);
            }
        }
        if (j3.f2393m != null) {
            this.f2372d = new ArrayList(j3.f2393m.length);
            int i8 = 0;
            while (true) {
                C0147b[] c0147bArr = j3.f2393m;
                if (i8 >= c0147bArr.length) {
                    break;
                }
                C0147b c0147b = c0147bArr[i8];
                ArrayList arrayList4 = c0147b.f2455l;
                C0146a c0146a = new C0146a(this);
                int[] iArr = c0147b.f2454k;
                int i9 = 0;
                int i10 = 0;
                while (i9 < iArr.length) {
                    P p3 = new P();
                    int i11 = i9 + 1;
                    p3.f2422a = iArr[i9];
                    if (J(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0146a + " op #" + i10 + " base fragment #" + iArr[i11]);
                    }
                    p3.f2429h = EnumC0139m.values()[c0147b.f2456m[i10]];
                    p3.f2430i = EnumC0139m.values()[c0147b.n[i10]];
                    int i12 = i9 + 2;
                    p3.f2424c = iArr[i11] != 0;
                    int i13 = iArr[i12];
                    p3.f2425d = i13;
                    int i14 = iArr[i9 + 3];
                    p3.f2426e = i14;
                    int i15 = i9 + 5;
                    int i16 = iArr[i9 + 4];
                    p3.f2427f = i16;
                    i9 += 6;
                    int[] iArr2 = iArr;
                    int i17 = iArr2[i15];
                    p3.f2428g = i17;
                    c0146a.f2438b = i13;
                    c0146a.f2439c = i14;
                    c0146a.f2440d = i16;
                    c0146a.f2441e = i17;
                    c0146a.b(p3);
                    i10++;
                    iArr = iArr2;
                }
                c0146a.f2442f = c0147b.f2457o;
                c0146a.f2444h = c0147b.f2458p;
                c0146a.f2443g = true;
                c0146a.f2445i = c0147b.f2460r;
                c0146a.f2446j = c0147b.f2461s;
                c0146a.f2447k = c0147b.f2462t;
                c0146a.f2448l = c0147b.u;
                c0146a.f2449m = c0147b.f2463v;
                c0146a.n = c0147b.f2464w;
                c0146a.f2450o = c0147b.x;
                c0146a.f2453r = c0147b.f2459q;
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    String str4 = (String) arrayList4.get(i18);
                    if (str4 != null) {
                        ((P) c0146a.f2437a.get(i18)).f2423b = sVar.h(str4);
                    }
                }
                c0146a.c(1);
                if (J(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + c0146a.f2453r + "): " + c0146a);
                    PrintWriter printWriter = new PrintWriter(new S());
                    c0146a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2372d.add(c0146a);
                i8++;
            }
            i3 = 0;
        } else {
            i3 = 0;
            this.f2372d = new ArrayList();
        }
        this.f2378j.set(j3.n);
        String str5 = j3.f2394o;
        if (str5 != null) {
            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163sH2 = sVar.h(str5);
            this.y = abstractComponentCallbacksC0163sH2;
            r(abstractComponentCallbacksC0163sH2);
        }
        ArrayList arrayList5 = j3.f2395p;
        if (arrayList5 != null) {
            for (int i19 = i3; i19 < arrayList5.size(); i19++) {
                this.f2379k.put((String) arrayList5.get(i19), (C0148c) j3.f2396q.get(i19));
            }
        }
        this.f2358E = new ArrayDeque(j3.f2397r);
    }

    public final Bundle V() {
        int i3;
        ArrayList arrayList;
        C0147b[] c0147bArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        D();
        x();
        A(true);
        this.f2360G = true;
        this.f2367N.f2405g = true;
        s sVar = this.f2371c;
        sVar.getClass();
        HashMap map = (HashMap) sVar.f145l;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it2 = map.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            O o2 = (O) it2.next();
            if (o2 != null) {
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = o2.f2419c;
                String str = abstractComponentCallbacksC0163s.f2542o;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = o2.f2419c;
                if (abstractComponentCallbacksC0163s2.f2539k == -1 && (bundle = abstractComponentCallbacksC0163s2.f2540l) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new N(abstractComponentCallbacksC0163s2));
                if (abstractComponentCallbacksC0163s2.f2539k > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0163s2.v(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    o2.f2417a.v(abstractComponentCallbacksC0163s2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0163s2.f2536Y.d(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleV = abstractComponentCallbacksC0163s2.f2518E.V();
                    if (!bundleV.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleV);
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0163s2.f2541m;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0163s2.n;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0163s2.f2543p;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                sVar.A(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0163s.f2542o);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0163s + ": " + abstractComponentCallbacksC0163s.f2540l);
                }
            }
        }
        HashMap map2 = (HashMap) this.f2371c.f146m;
        if (!map2.isEmpty()) {
            s sVar2 = this.f2371c;
            synchronized (((ArrayList) sVar2.f144k)) {
                try {
                    if (((ArrayList) sVar2.f144k).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) sVar2.f144k).size());
                        ArrayList arrayList3 = (ArrayList) sVar2.f144k;
                        int size = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList3.get(i4);
                            i4++;
                            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s3 = (AbstractComponentCallbacksC0163s) obj;
                            arrayList.add(abstractComponentCallbacksC0163s3.f2542o);
                            if (J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0163s3.f2542o + "): " + abstractComponentCallbacksC0163s3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = this.f2372d.size();
            if (size2 > 0) {
                c0147bArr = new C0147b[size2];
                for (i3 = 0; i3 < size2; i3++) {
                    c0147bArr[i3] = new C0147b((C0146a) this.f2372d.get(i3));
                    if (J(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f2372d.get(i3));
                    }
                }
            } else {
                c0147bArr = null;
            }
            J j3 = new J();
            j3.f2394o = null;
            ArrayList arrayList4 = new ArrayList();
            j3.f2395p = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            j3.f2396q = arrayList5;
            j3.f2391k = arrayList2;
            j3.f2392l = arrayList;
            j3.f2393m = c0147bArr;
            j3.n = this.f2378j.get();
            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s4 = this.y;
            if (abstractComponentCallbacksC0163s4 != null) {
                j3.f2394o = abstractComponentCallbacksC0163s4.f2542o;
            }
            arrayList4.addAll(this.f2379k.keySet());
            arrayList5.addAll(this.f2379k.values());
            j3.f2397r = new ArrayList(this.f2358E);
            bundle2.putParcelable("state", j3);
            for (String str2 : this.f2380l.keySet()) {
                bundle2.putBundle(p055t.a.a("result_", str2), (Bundle) this.f2380l.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(p055t.a.a("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void W() {
        synchronized (this.f2369a) {
            try {
                if (this.f2369a.size() == 1) {
                    this.f2388v.f2554o.removeCallbacks(this.f2368O);
                    this.f2388v.f2554o.post(this.f2368O);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        ViewGroup viewGroupF = F(abstractComponentCallbacksC0163s);
        if (viewGroupF == null || !(viewGroupF instanceof C0167w)) {
            return;
        }
        ((C0167w) viewGroupF).setDrawDisappearingViewsLast(!z3);
    }

    public final void Y(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, EnumC0139m enumC0139m) {
        if (abstractComponentCallbacksC0163s.equals(this.f2371c.h(abstractComponentCallbacksC0163s.f2542o)) && (abstractComponentCallbacksC0163s.f2517D == null || abstractComponentCallbacksC0163s.f2516C == this)) {
            abstractComponentCallbacksC0163s.f2534V = enumC0139m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0163s + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (abstractComponentCallbacksC0163s != null) {
            if (!abstractComponentCallbacksC0163s.equals(this.f2371c.h(abstractComponentCallbacksC0163s.f2542o)) || (abstractComponentCallbacksC0163s.f2517D != null && abstractComponentCallbacksC0163s.f2516C != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0163s + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = this.y;
        this.y = abstractComponentCallbacksC0163s;
        r(abstractComponentCallbacksC0163s2);
        r(this.y);
    }

    public final O a(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        String str = abstractComponentCallbacksC0163s.f2533U;
        if (str != null) {
            d.c(abstractComponentCallbacksC0163s, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0163s);
        }
        O oG = g(abstractComponentCallbacksC0163s);
        abstractComponentCallbacksC0163s.f2516C = this;
        s sVar = this.f2371c;
        sVar.u(oG);
        if (!abstractComponentCallbacksC0163s.f2524K) {
            sVar.b(abstractComponentCallbacksC0163s);
            abstractComponentCallbacksC0163s.f2548v = false;
            abstractComponentCallbacksC0163s.S = false;
            if (K(abstractComponentCallbacksC0163s)) {
                this.f2359F = true;
            }
        }
        return oG;
    }

    public final void a0(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        ViewGroup viewGroupF = F(abstractComponentCallbacksC0163s);
        if (viewGroupF != null) {
            r rVar = abstractComponentCallbacksC0163s.f2531R;
            if ((rVar == null ? 0 : rVar.f2507e) + (rVar == null ? 0 : rVar.f2506d) + (rVar == null ? 0 : rVar.f2505c) + (rVar == null ? 0 : rVar.f2504b) > 0) {
                if (viewGroupF.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupF.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0163s);
                }
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = (AbstractComponentCallbacksC0163s) viewGroupF.getTag(R.id.visible_removing_fragment_view_tag);
                r rVar2 = abstractComponentCallbacksC0163s.f2531R;
                boolean z3 = rVar2 != null ? rVar2.f2503a : false;
                if (abstractComponentCallbacksC0163s2.f2531R == null) {
                    return;
                }
                abstractComponentCallbacksC0163s2.e().f2503a = z3;
            }
        }
    }

    public final void b(C0165u c0165u, a aVar, AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (this.f2388v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2388v = c0165u;
        this.f2389w = aVar;
        this.x = abstractComponentCallbacksC0163s;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2382o;
        if (abstractComponentCallbacksC0163s != null) {
            copyOnWriteArrayList.add(new C(abstractComponentCallbacksC0163s));
        } else if (c0165u != null) {
            copyOnWriteArrayList.add(c0165u);
        }
        if (this.x != null) {
            e0();
        }
        if (c0165u != null) {
            t tVarB = c0165u.f2556q.b();
            this.f2375g = tVarB;
            InterfaceC0144s interfaceC0144s = abstractComponentCallbacksC0163s != null ? abstractComponentCallbacksC0163s : c0165u;
            tVarB.getClass();
            z zVar = this.f2377i;
            h.e(zVar, "onBackPressedCallback");
            u uVarH = interfaceC0144s.h();
            if (uVarH.f2160c != EnumC0139m.f2150k) {
                o oVar = new o(zVar, new p(zVar, interfaceC0144s));
                zVar.f2566a.add(oVar);
                oVar.d(false);
                s sVar = tVarB.a().f2338c;
                sVar.getClass();
                if (((LinkedHashSet) sVar.f146m).add(oVar)) {
                    e eVar = (e) sVar.f145l;
                    eVar.getClass();
                    if (oVar.f2331c != null) {
                        throw new IllegalArgumentException(("Handler '" + oVar + "' is already registered with a dispatcher").toString());
                    }
                    eVar.f2872e.addFirst(oVar);
                    oVar.f2331c = sVar;
                    eVar.b();
                }
                p002b.s sVar2 = new p002b.s(oVar, tVarB, uVarH);
                uVarH.a(sVar2);
                zVar.f2568c.add(sVar2);
            }
        }
        if (abstractComponentCallbacksC0163s != null) {
            L l3 = abstractComponentCallbacksC0163s.f2516C.f2367N;
            HashMap map = l3.f2401c;
            L l4 = (L) map.get(abstractComponentCallbacksC0163s.f2542o);
            if (l4 == null) {
                l4 = new L(l3.f2403e);
                map.put(abstractComponentCallbacksC0163s.f2542o, l4);
            }
            this.f2367N = l4;
        } else if (c0165u != null) {
            S sF = c0165u.f2556q.f();
            p008d0.a aVar2 = p008d0.a.f2768b;
            h.e(aVar2, "defaultCreationExtras");
            j jVar = new j(sF, L.f2399h, aVar2);
            a2.e eVarA = a2.p.a(L.class);
            String strB = eVarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f2367N = (L) jVar.C(eVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        } else {
            this.f2367N = new L(false);
        }
        L l5 = this.f2367N;
        l5.f2405g = this.f2360G || this.f2361H;
        this.f2371c.n = l5;
        C0165u c0165u2 = this.f2388v;
        if (c0165u2 != null && abstractComponentCallbacksC0163s == null) {
            B1.p pVarC = c0165u2.c();
            pVarC.c("android:support:fragments", new f(this, 2));
            Bundle bundleA = pVarC.a("android:support:fragments");
            if (bundleA != null) {
                U(bundleA);
            }
        }
        C0165u c0165u3 = this.f2388v;
        if (c0165u3 != null) {
            p002b.j jVar2 = c0165u3.f2556q.f2314r;
            String strA = p055t.a.a("FragmentManager:", abstractComponentCallbacksC0163s != null ? B1.e.m(new StringBuilder(), abstractComponentCallbacksC0163s.f2542o, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER) : StringUtils.EMPTY);
            this.f2355B = jVar2.a(B1.e.j(strA, "StartActivityForResult"), new D(3), new g(this, 11));
            this.f2356C = jVar2.a(B1.e.j(strA, "StartIntentSenderForResult"), new D(0), new H0.i(this, 18));
            this.f2357D = jVar2.a(B1.e.j(strA, "RequestPermissions"), new D(2), new B1.a(this, 15));
        }
        C0165u c0165u4 = this.f2388v;
        if (c0165u4 != null) {
            c0165u4.e(this.f2383p);
        }
        C0165u c0165u5 = this.f2388v;
        if (c0165u5 != null) {
            SignInHubActivity signInHubActivity = c0165u5.f2556q;
            signInHubActivity.getClass();
            y yVar = this.f2384q;
            h.e(yVar, "listener");
            signInHubActivity.f2316t.add(yVar);
        }
        C0165u c0165u6 = this.f2388v;
        if (c0165u6 != null) {
            SignInHubActivity signInHubActivity2 = c0165u6.f2556q;
            signInHubActivity2.getClass();
            y yVar2 = this.f2385r;
            h.e(yVar2, "listener");
            signInHubActivity2.f2317v.add(yVar2);
        }
        C0165u c0165u7 = this.f2388v;
        if (c0165u7 != null) {
            SignInHubActivity signInHubActivity3 = c0165u7.f2556q;
            signInHubActivity3.getClass();
            y yVar3 = this.f2386s;
            h.e(yVar3, "listener");
            signInHubActivity3.f2318w.add(yVar3);
        }
        C0165u c0165u8 = this.f2388v;
        if (c0165u8 == null || abstractComponentCallbacksC0163s != null) {
            return;
        }
        SignInHubActivity signInHubActivity4 = c0165u8.f2556q;
        signInHubActivity4.getClass();
        A a3 = this.f2387t;
        h.e(a3, "provider");
        j jVar3 = signInHubActivity4.f2310m;
        ((CopyOnWriteArrayList) jVar3.f58m).add(a3);
        ((p002b.d) jVar3.f57l).run();
    }

    public final void c(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0163s);
        }
        if (abstractComponentCallbacksC0163s.f2524K) {
            abstractComponentCallbacksC0163s.f2524K = false;
            if (abstractComponentCallbacksC0163s.u) {
                return;
            }
            this.f2371c.b(abstractComponentCallbacksC0163s);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0163s);
            }
            if (K(abstractComponentCallbacksC0163s)) {
                this.f2359F = true;
            }
        }
    }

    public final void c0() {
        ArrayList arrayListL = this.f2371c.l();
        int size = arrayListL.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListL.get(i3);
            i3++;
            O o2 = (O) obj;
            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = o2.f2419c;
            if (abstractComponentCallbacksC0163s.f2529P) {
                if (this.f2370b) {
                    this.f2363J = true;
                } else {
                    abstractComponentCallbacksC0163s.f2529P = false;
                    o2.j();
                }
            }
        }
    }

    public final void d() {
        this.f2370b = false;
        this.f2365L.clear();
        this.f2364K.clear();
    }

    public final void d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0165u c0165u = this.f2388v;
        if (c0165u == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
                throw illegalStateException;
            }
        }
        try {
            c0165u.f2556q.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e4) {
            Log.e("FragmentManager", "Failed dumping state", e4);
            throw illegalStateException;
        }
    }

    public final HashSet e() {
        C0157l c0157l;
        HashSet hashSet = new HashSet();
        ArrayList arrayListL = this.f2371c.l();
        int size = arrayListL.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListL.get(i3);
            i3++;
            ViewGroup viewGroup = ((O) obj).f2419c.f2528O;
            if (viewGroup != null) {
                h.e(H(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0157l) {
                    c0157l = (C0157l) tag;
                } else {
                    c0157l = new C0157l(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0157l);
                }
                hashSet.add(c0157l);
            }
        }
        return hashSet;
    }

    public final void e0() {
        synchronized (this.f2369a) {
            try {
                if (!this.f2369a.isEmpty()) {
                    this.f2377i.a(true);
                    if (J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z3 = this.f2372d.size() + (this.f2376h != null ? 1 : 0) > 0 && N(this.x);
                if (J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z3);
                }
                this.f2377i.a(z3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i3, int i4) {
        ViewGroup viewGroup;
        C0157l c0157l;
        HashSet hashSet = new HashSet();
        while (i3 < i4) {
            ArrayList arrayList2 = ((C0146a) arrayList.get(i3)).f2437a;
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = ((P) obj).f2423b;
                if (abstractComponentCallbacksC0163s != null && (viewGroup = abstractComponentCallbacksC0163s.f2528O) != null) {
                    h.d(H(), "fragmentManager.specialEffectsControllerFactory");
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof C0157l) {
                        c0157l = (C0157l) tag;
                    } else {
                        c0157l = new C0157l(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0157l);
                    }
                    hashSet.add(c0157l);
                }
            }
            i3++;
        }
        return hashSet;
    }

    public final O g(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        String str = abstractComponentCallbacksC0163s.f2542o;
        s sVar = this.f2371c;
        O o2 = (O) ((HashMap) sVar.f145l).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.n, sVar, abstractComponentCallbacksC0163s);
        o3.l(this.f2388v.n.getClassLoader());
        o3.f2421e = this.u;
        return o3;
    }

    public final void h(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0163s);
        }
        if (abstractComponentCallbacksC0163s.f2524K) {
            return;
        }
        abstractComponentCallbacksC0163s.f2524K = true;
        if (abstractComponentCallbacksC0163s.u) {
            if (J(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0163s);
            }
            s sVar = this.f2371c;
            synchronized (((ArrayList) sVar.f144k)) {
                ((ArrayList) sVar.f144k).remove(abstractComponentCallbacksC0163s);
            }
            abstractComponentCallbacksC0163s.u = false;
            if (K(abstractComponentCallbacksC0163s)) {
                this.f2359F = true;
            }
            a0(abstractComponentCallbacksC0163s);
        }
    }

    public final void i(boolean z3) {
        if (z3 && this.f2388v != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0163s != null) {
                abstractComponentCallbacksC0163s.f2527N = true;
                if (z3) {
                    abstractComponentCallbacksC0163s.f2518E.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0163s != null) {
                if (!abstractComponentCallbacksC0163s.f2523J ? abstractComponentCallbacksC0163s.f2518E.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0163s != null && M(abstractComponentCallbacksC0163s)) {
                if (!abstractComponentCallbacksC0163s.f2523J ? abstractComponentCallbacksC0163s.f2518E.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0163s);
                    z3 = true;
                }
            }
        }
        if (this.f2373e != null) {
            for (int i3 = 0; i3 < this.f2373e.size(); i3++) {
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = (AbstractComponentCallbacksC0163s) this.f2373e.get(i3);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0163s2)) {
                    abstractComponentCallbacksC0163s2.getClass();
                }
            }
        }
        this.f2373e = arrayList;
        return z3;
    }

    public final void l() {
        boolean z3;
        boolean zIsTerminated;
        this.f2362I = true;
        A(true);
        x();
        C0165u c0165u = this.f2388v;
        s sVar = this.f2371c;
        if (c0165u != null) {
            z3 = ((L) sVar.n).f2404f;
        } else {
            SignInHubActivity signInHubActivity = c0165u.n;
            z3 = signInHubActivity != null ? !signInHubActivity.isChangingConfigurations() : true;
        }
        int i3 = 0;
        if (z3) {
            Iterator it2 = this.f2379k.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((C0148c) it2.next()).f2465k;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((L) sVar.n).d((String) obj, false);
                }
            }
        }
        u(-1);
        C0165u c0165u2 = this.f2388v;
        if (c0165u2 != null) {
            SignInHubActivity signInHubActivity2 = c0165u2.f2556q;
            signInHubActivity2.getClass();
            y yVar = this.f2384q;
            h.e(yVar, "listener");
            signInHubActivity2.f2316t.remove(yVar);
        }
        C0165u c0165u3 = this.f2388v;
        if (c0165u3 != null) {
            c0165u3.g(this.f2383p);
        }
        C0165u c0165u4 = this.f2388v;
        if (c0165u4 != null) {
            SignInHubActivity signInHubActivity3 = c0165u4.f2556q;
            signInHubActivity3.getClass();
            y yVar2 = this.f2385r;
            h.e(yVar2, "listener");
            signInHubActivity3.f2317v.remove(yVar2);
        }
        C0165u c0165u5 = this.f2388v;
        if (c0165u5 != null) {
            SignInHubActivity signInHubActivity4 = c0165u5.f2556q;
            signInHubActivity4.getClass();
            y yVar3 = this.f2386s;
            h.e(yVar3, "listener");
            signInHubActivity4.f2318w.remove(yVar3);
        }
        C0165u c0165u6 = this.f2388v;
        if (c0165u6 != null && this.x == null) {
            SignInHubActivity signInHubActivity5 = c0165u6.f2556q;
            signInHubActivity5.getClass();
            A a3 = this.f2387t;
            h.e(a3, "provider");
            j jVar = signInHubActivity5.f2310m;
            ((CopyOnWriteArrayList) jVar.f58m).remove(a3);
            if (((HashMap) jVar.n).remove(a3) != null) {
                throw new ClassCastException();
            }
            ((p002b.d) jVar.f57l).run();
        }
        this.f2388v = null;
        this.f2389w = null;
        this.x = null;
        if (this.f2375g != null) {
            z zVar = this.f2377i;
            ArrayList arrayList2 = zVar.f2566a;
            CopyOnWriteArrayList copyOnWriteArrayList = zVar.f2568c;
            Iterator it3 = copyOnWriteArrayList.iterator();
            h.d(it3, "iterator(...)");
            while (it3.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it3.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z4 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z4) {
                                    executorService.shutdownNow();
                                    z4 = true;
                                }
                            }
                        }
                        if (z4) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                }
            }
            copyOnWriteArrayList.clear();
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                ((o) obj2).b();
            }
            arrayList2.clear();
            this.f2375g = null;
        }
        Q q3 = this.f2355B;
        if (q3 != null) {
            q3.y();
            this.f2356C.y();
            this.f2357D.y();
        }
    }

    public final void m(boolean z3) {
        if (z3 && this.f2388v != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0163s != null) {
                abstractComponentCallbacksC0163s.f2527N = true;
                if (z3) {
                    abstractComponentCallbacksC0163s.f2518E.m(true);
                }
            }
        }
    }

    public final void n(boolean z3) {
        if (z3 && this.f2388v != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0163s != null && z3) {
                abstractComponentCallbacksC0163s.f2518E.n(true);
            }
        }
    }

    public final void o() {
        ArrayList arrayListM = this.f2371c.m();
        int size = arrayListM.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListM.get(i3);
            i3++;
            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = (AbstractComponentCallbacksC0163s) obj;
            if (abstractComponentCallbacksC0163s != null) {
                abstractComponentCallbacksC0163s.m();
                abstractComponentCallbacksC0163s.f2518E.o();
            }
        }
    }

    public final boolean p() {
        if (this.u >= 1) {
            for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : this.f2371c.n()) {
                if (abstractComponentCallbacksC0163s != null) {
                    if (!abstractComponentCallbacksC0163s.f2523J ? abstractComponentCallbacksC0163s.f2518E.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.u < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0163s != null && !abstractComponentCallbacksC0163s.f2523J) {
                abstractComponentCallbacksC0163s.f2518E.q();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (abstractComponentCallbacksC0163s != null) {
            if (abstractComponentCallbacksC0163s.equals(this.f2371c.h(abstractComponentCallbacksC0163s.f2542o))) {
                abstractComponentCallbacksC0163s.f2516C.getClass();
                boolean zN = N(abstractComponentCallbacksC0163s);
                Boolean bool = abstractComponentCallbacksC0163s.f2547t;
                if (bool == null || bool.booleanValue() != zN) {
                    abstractComponentCallbacksC0163s.f2547t = Boolean.valueOf(zN);
                    I i3 = abstractComponentCallbacksC0163s.f2518E;
                    i3.e0();
                    i3.r(i3.y);
                }
            }
        }
    }

    public final void s(boolean z3) {
        if (z3 && this.f2388v != null) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0163s != null && z3) {
                abstractComponentCallbacksC0163s.f2518E.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.u < 1) {
            return false;
        }
        boolean z3 = false;
        for (AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0163s != null && M(abstractComponentCallbacksC0163s)) {
                if (!abstractComponentCallbacksC0163s.f2523J ? abstractComponentCallbacksC0163s.f2518E.t() : false) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.x;
        if (abstractComponentCallbacksC0163s != null) {
            sb.append(abstractComponentCallbacksC0163s.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            C0165u c0165u = this.f2388v;
            if (c0165u != null) {
                sb.append(c0165u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f2388v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i3) {
        try {
            this.f2370b = true;
            for (O o2 : ((HashMap) this.f2371c.f145l).values()) {
                if (o2 != null) {
                    o2.f2421e = i3;
                }
            }
            O(i3, false);
            Iterator it2 = e().iterator();
            while (it2.hasNext()) {
                ((C0157l) it2.next()).d();
            }
            this.f2370b = false;
            A(true);
        } catch (Throwable th) {
            this.f2370b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.f2363J) {
            this.f2363J = false;
            c0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String strJ = B1.e.j(str, "    ");
        s sVar = this.f2371c;
        ArrayList arrayList = (ArrayList) sVar.f144k;
        String strJ2 = B1.e.j(str, "    ");
        HashMap map = (HashMap) sVar.f145l;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : map.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = o2.f2419c;
                    printWriter.println(abstractComponentCallbacksC0163s);
                    abstractComponentCallbacksC0163s.getClass();
                    printWriter.print(strJ2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0163s.f2520G));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0163s.f2521H));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0163s.f2522I);
                    printWriter.print(strJ2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0163s.f2539k);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0163s.f2542o);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0163s.f2515B);
                    printWriter.print(strJ2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0163s.u);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0163s.f2548v);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0163s.x);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0163s.y);
                    printWriter.print(strJ2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0163s.f2523J);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0163s.f2524K);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0163s.f2526M);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strJ2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0163s.f2525L);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0163s.f2530Q);
                    if (abstractComponentCallbacksC0163s.f2516C != null) {
                        printWriter.print(strJ2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0163s.f2516C);
                    }
                    if (abstractComponentCallbacksC0163s.f2517D != null) {
                        printWriter.print(strJ2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0163s.f2517D);
                    }
                    if (abstractComponentCallbacksC0163s.f2519F != null) {
                        printWriter.print(strJ2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0163s.f2519F);
                    }
                    if (abstractComponentCallbacksC0163s.f2543p != null) {
                        printWriter.print(strJ2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0163s.f2543p);
                    }
                    if (abstractComponentCallbacksC0163s.f2540l != null) {
                        printWriter.print(strJ2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0163s.f2540l);
                    }
                    if (abstractComponentCallbacksC0163s.f2541m != null) {
                        printWriter.print(strJ2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0163s.f2541m);
                    }
                    if (abstractComponentCallbacksC0163s.n != null) {
                        printWriter.print(strJ2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0163s.n);
                    }
                    Object objH = abstractComponentCallbacksC0163s.f2544q;
                    if (objH == null) {
                        I i3 = abstractComponentCallbacksC0163s.f2516C;
                        objH = (i3 == null || (str2 = abstractComponentCallbacksC0163s.f2545r) == null) ? null : i3.f2371c.h(str2);
                    }
                    if (objH != null) {
                        printWriter.print(strJ2);
                        printWriter.print("mTarget=");
                        printWriter.print(objH);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0163s.f2546s);
                    }
                    printWriter.print(strJ2);
                    printWriter.print("mPopDirection=");
                    r rVar = abstractComponentCallbacksC0163s.f2531R;
                    printWriter.println(rVar == null ? false : rVar.f2503a);
                    r rVar2 = abstractComponentCallbacksC0163s.f2531R;
                    if ((rVar2 == null ? 0 : rVar2.f2504b) != 0) {
                        printWriter.print(strJ2);
                        printWriter.print("getEnterAnim=");
                        r rVar3 = abstractComponentCallbacksC0163s.f2531R;
                        printWriter.println(rVar3 == null ? 0 : rVar3.f2504b);
                    }
                    r rVar4 = abstractComponentCallbacksC0163s.f2531R;
                    if ((rVar4 == null ? 0 : rVar4.f2505c) != 0) {
                        printWriter.print(strJ2);
                        printWriter.print("getExitAnim=");
                        r rVar5 = abstractComponentCallbacksC0163s.f2531R;
                        printWriter.println(rVar5 == null ? 0 : rVar5.f2505c);
                    }
                    r rVar6 = abstractComponentCallbacksC0163s.f2531R;
                    if ((rVar6 == null ? 0 : rVar6.f2506d) != 0) {
                        printWriter.print(strJ2);
                        printWriter.print("getPopEnterAnim=");
                        r rVar7 = abstractComponentCallbacksC0163s.f2531R;
                        printWriter.println(rVar7 == null ? 0 : rVar7.f2506d);
                    }
                    r rVar8 = abstractComponentCallbacksC0163s.f2531R;
                    if ((rVar8 == null ? 0 : rVar8.f2507e) != 0) {
                        printWriter.print(strJ2);
                        printWriter.print("getPopExitAnim=");
                        r rVar9 = abstractComponentCallbacksC0163s.f2531R;
                        printWriter.println(rVar9 != null ? rVar9.f2507e : 0);
                    }
                    if (abstractComponentCallbacksC0163s.f2528O != null) {
                        printWriter.print(strJ2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0163s.f2528O);
                    }
                    C0165u c0165u = abstractComponentCallbacksC0163s.f2517D;
                    if ((c0165u != null ? c0165u.n : null) != null) {
                        Q.v(abstractComponentCallbacksC0163s).t(strJ2, printWriter);
                    }
                    printWriter.print(strJ2);
                    printWriter.println("Child " + abstractComponentCallbacksC0163s.f2518E + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    abstractComponentCallbacksC0163s.f2518E.w(B1.e.j(strJ2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = (AbstractComponentCallbacksC0163s) arrayList.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0163s2.toString());
            }
        }
        ArrayList arrayList2 = this.f2373e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size; i5++) {
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s3 = (AbstractComponentCallbacksC0163s) this.f2373e.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0163s3.toString());
            }
        }
        int size3 = this.f2372d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size3; i6++) {
                C0146a c0146a = (C0146a) this.f2372d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(c0146a.toString());
                c0146a.f(strJ, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2378j.get());
        synchronized (this.f2369a) {
            try {
                int size4 = this.f2369a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i7 = 0; i7 < size4; i7++) {
                        Object obj = (F) this.f2369a.get(i7);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2388v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2389w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2360G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2361H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2362I);
        if (this.f2359F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2359F);
        }
    }

    public final void x() {
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0157l) it2.next()).d();
        }
    }

    public final void y(F f3, boolean z3) {
        if (!z3) {
            if (this.f2388v == null) {
                if (!this.f2362I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f2360G || this.f2361H) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2369a) {
            try {
                if (this.f2388v == null) {
                    if (!z3) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2369a.add(f3);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z3) {
        if (this.f2370b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2388v == null) {
            if (!this.f2362I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2388v.f2554o.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z3 && (this.f2360G || this.f2361H)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2364K == null) {
            this.f2364K = new ArrayList();
            this.f2365L = new ArrayList();
        }
    }
}
