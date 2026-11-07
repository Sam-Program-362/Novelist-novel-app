package b0;

import a.AbstractC0102a;
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
import androidx.lifecycle.EnumC0141m;
import b.RunnableC0151d;
import b1.C0192Q;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import d0.C0230a;
import h0.C0262e;
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
import t.AbstractC0468a;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: A, reason: collision with root package name */
    public final M1.A f2354A;

    /* renamed from: B, reason: collision with root package name */
    public C0192Q f2355B;

    /* renamed from: C, reason: collision with root package name */
    public C0192Q f2356C;

    /* renamed from: D, reason: collision with root package name */
    public C0192Q f2357D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayDeque f2358E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2359F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2360G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2361H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2362I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2363J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f2364K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f2365L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f2366M;

    /* renamed from: N, reason: collision with root package name */
    public L f2367N;

    /* renamed from: O, reason: collision with root package name */
    public final A.b f2368O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2370b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f2373e;

    /* renamed from: g, reason: collision with root package name */
    public b.t f2375g;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2381m;
    public final A.c n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f2382o;

    /* renamed from: p, reason: collision with root package name */
    public final y f2383p;

    /* renamed from: q, reason: collision with root package name */
    public final y f2384q;

    /* renamed from: r, reason: collision with root package name */
    public final y f2385r;

    /* renamed from: s, reason: collision with root package name */
    public final y f2386s;

    /* renamed from: t, reason: collision with root package name */
    public final C0152A f2387t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public C0173u f2388v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC0102a f2389w;
    public AbstractComponentCallbacksC0171s x;
    public AbstractComponentCallbacksC0171s y;

    /* renamed from: z, reason: collision with root package name */
    public final C0153B f2390z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2369a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final B1.s f2371c = new B1.s(6);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f2372d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final x f2374f = new x(this);

    /* renamed from: h, reason: collision with root package name */
    public C0154a f2376h = null;

    /* renamed from: i, reason: collision with root package name */
    public final z f2377i = new z(this);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f2378j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    public final Map f2379k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map f2380l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [b0.y] */
    /* JADX WARN: Type inference failed for: r0v16, types: [b0.y] */
    /* JADX WARN: Type inference failed for: r0v17, types: [b0.y] */
    /* JADX WARN: Type inference failed for: r0v18, types: [b0.y] */
    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f2381m = new ArrayList();
        this.n = new A.c(this);
        this.f2382o = new CopyOnWriteArrayList();
        final int i3 = 0;
        this.f2383p = new C.a(this) { // from class: b0.y

            /* renamed from: b, reason: collision with root package name */
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
                            break;
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
                            break;
                        }
                        break;
                    default:
                        s.i iVar = (s.i) obj;
                        I i7 = this.f2565b;
                        if (i7.L()) {
                            boolean z4 = iVar.f4464a;
                            i7.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f2384q = new C.a(this) { // from class: b0.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f2565b;

            {
                this.f2565b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        I i42 = this.f2565b;
                        if (i42.L()) {
                            i42.i(false);
                            break;
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
                            break;
                        }
                        break;
                    default:
                        s.i iVar = (s.i) obj;
                        I i7 = this.f2565b;
                        if (i7.L()) {
                            boolean z4 = iVar.f4464a;
                            i7.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i5 = 2;
        this.f2385r = new C.a(this) { // from class: b0.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f2565b;

            {
                this.f2565b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        I i42 = this.f2565b;
                        if (i42.L()) {
                            i42.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i52 = this.f2565b;
                        if (i52.L() && num.intValue() == 80) {
                            i52.m(false);
                            break;
                        }
                        break;
                    case 2:
                        s.c cVar = (s.c) obj;
                        I i6 = this.f2565b;
                        if (i6.L()) {
                            boolean z3 = cVar.f4440a;
                            i6.n(false);
                            break;
                        }
                        break;
                    default:
                        s.i iVar = (s.i) obj;
                        I i7 = this.f2565b;
                        if (i7.L()) {
                            boolean z4 = iVar.f4464a;
                            i7.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i6 = 3;
        this.f2386s = new C.a(this) { // from class: b0.y

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f2565b;

            {
                this.f2565b = this;
            }

            @Override // C.a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        I i42 = this.f2565b;
                        if (i42.L()) {
                            i42.i(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        I i52 = this.f2565b;
                        if (i52.L() && num.intValue() == 80) {
                            i52.m(false);
                            break;
                        }
                        break;
                    case 2:
                        s.c cVar = (s.c) obj;
                        I i62 = this.f2565b;
                        if (i62.L()) {
                            boolean z3 = cVar.f4440a;
                            i62.n(false);
                            break;
                        }
                        break;
                    default:
                        s.i iVar = (s.i) obj;
                        I i7 = this.f2565b;
                        if (i7.L()) {
                            boolean z4 = iVar.f4464a;
                            i7.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f2387t = new C0152A(this);
        this.u = -1;
        this.f2390z = new C0153B(this);
        this.f2354A = new M1.A(12);
        this.f2358E = new ArrayDeque();
        this.f2368O = new A.b(this, 9);
    }

    public static HashSet E(C0154a c0154a) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < c0154a.f2437a.size(); i3++) {
            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = ((P) c0154a.f2437a.get(i3)).f2423b;
            if (abstractComponentCallbacksC0171s != null && c0154a.f2443g) {
                hashSet.add(abstractComponentCallbacksC0171s);
            }
        }
        return hashSet;
    }

    public static boolean J(int i3) {
        return Log.isLoggable("FragmentManager", i3);
    }

    public static boolean K(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        abstractComponentCallbacksC0171s.getClass();
        ArrayList m3 = abstractComponentCallbacksC0171s.f2518E.f2371c.m();
        int size = m3.size();
        boolean z3 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = m3.get(i3);
            i3++;
            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = (AbstractComponentCallbacksC0171s) obj;
            if (abstractComponentCallbacksC0171s2 != null) {
                z3 = K(abstractComponentCallbacksC0171s2);
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (abstractComponentCallbacksC0171s == null) {
            return true;
        }
        if (abstractComponentCallbacksC0171s.f2526M) {
            return abstractComponentCallbacksC0171s.f2516C == null || M(abstractComponentCallbacksC0171s.f2519F);
        }
        return false;
    }

    public static boolean N(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (abstractComponentCallbacksC0171s == null) {
            return true;
        }
        I i3 = abstractComponentCallbacksC0171s.f2516C;
        return abstractComponentCallbacksC0171s.equals(i3.y) && N(i3.x);
    }

    public static void b0(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0171s);
        }
        if (abstractComponentCallbacksC0171s.f2523J) {
            abstractComponentCallbacksC0171s.f2523J = false;
            abstractComponentCallbacksC0171s.S = !abstractComponentCallbacksC0171s.S;
        }
    }

    public final boolean A(boolean z3) {
        boolean z4;
        z(z3);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f2364K;
            ArrayList arrayList2 = this.f2365L;
            synchronized (this.f2369a) {
                if (this.f2369a.isEmpty()) {
                    z4 = false;
                } else {
                    try {
                        int size = this.f2369a.size();
                        z4 = false;
                        for (int i3 = 0; i3 < size; i3++) {
                            z4 |= ((F) this.f2369a.get(i3)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z4) {
                e0();
                v();
                ((HashMap) this.f2371c.f145l).values().removeAll(Collections.singleton(null));
                return z5;
            }
            z5 = true;
            this.f2370b = true;
            try {
                T(this.f2364K, this.f2365L);
            } finally {
                d();
            }
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        String str;
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        B1.s sVar = this.f2371c;
        ArrayList arrayList3 = this.f2381m;
        boolean z6 = ((C0154a) arrayList.get(i3)).f2450o;
        ArrayList arrayList4 = this.f2366M;
        if (arrayList4 == null) {
            this.f2366M = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f2366M.addAll(sVar.n());
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.y;
        int i8 = i3;
        boolean z7 = false;
        while (i8 < i4) {
            C0154a c0154a = (C0154a) arrayList.get(i8);
            if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                z3 = z6;
                i5 = i8;
                z4 = z7;
                int i9 = 1;
                ArrayList arrayList5 = this.f2366M;
                ArrayList arrayList6 = c0154a.f2437a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    P p3 = (P) arrayList6.get(size);
                    int i10 = p3.f2422a;
                    if (i10 != i9) {
                        if (i10 != 3) {
                            switch (i10) {
                                case 8:
                                    abstractComponentCallbacksC0171s = null;
                                    break;
                                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                                    abstractComponentCallbacksC0171s = p3.f2423b;
                                    break;
                                case 10:
                                    p3.f2430i = p3.f2429h;
                                    break;
                            }
                            size--;
                            i9 = 1;
                        }
                        arrayList5.add(p3.f2423b);
                        size--;
                        i9 = 1;
                    }
                    arrayList5.remove(p3.f2423b);
                    size--;
                    i9 = 1;
                }
            } else {
                ArrayList arrayList7 = this.f2366M;
                ArrayList arrayList8 = c0154a.f2437a;
                int i11 = 0;
                while (i11 < arrayList8.size()) {
                    P p4 = (P) arrayList8.get(i11);
                    boolean z8 = z6;
                    int i12 = p4.f2422a;
                    int i13 = i8;
                    int i14 = 1;
                    if (i12 != 1) {
                        z5 = z7;
                        if (i12 != 2) {
                            if (i12 == 3 || i12 == 6) {
                                arrayList7.remove(p4.f2423b);
                                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = p4.f2423b;
                                if (abstractComponentCallbacksC0171s2 == abstractComponentCallbacksC0171s) {
                                    arrayList8.add(i11, new P(9, abstractComponentCallbacksC0171s2));
                                    i11++;
                                    abstractComponentCallbacksC0171s = null;
                                }
                            } else if (i12 == 7) {
                                i14 = 1;
                            } else if (i12 == 8) {
                                arrayList8.add(i11, new P(9, abstractComponentCallbacksC0171s, 0));
                                p4.f2424c = true;
                                i11++;
                                abstractComponentCallbacksC0171s = p4.f2423b;
                            }
                            i14 = 1;
                        } else {
                            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s3 = p4.f2423b;
                            int i15 = abstractComponentCallbacksC0171s3.f2521H;
                            int size2 = arrayList7.size() - 1;
                            boolean z9 = false;
                            while (size2 >= 0) {
                                int i16 = size2;
                                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s4 = (AbstractComponentCallbacksC0171s) arrayList7.get(size2);
                                if (abstractComponentCallbacksC0171s4.f2521H != i15) {
                                    i6 = i15;
                                } else if (abstractComponentCallbacksC0171s4 == abstractComponentCallbacksC0171s3) {
                                    i6 = i15;
                                    z9 = true;
                                } else {
                                    if (abstractComponentCallbacksC0171s4 == abstractComponentCallbacksC0171s) {
                                        i6 = i15;
                                        arrayList8.add(i11, new P(9, abstractComponentCallbacksC0171s4, 0));
                                        i11++;
                                        i7 = 0;
                                        abstractComponentCallbacksC0171s = null;
                                    } else {
                                        i6 = i15;
                                        i7 = 0;
                                    }
                                    P p5 = new P(3, abstractComponentCallbacksC0171s4, i7);
                                    p5.f2425d = p4.f2425d;
                                    p5.f2427f = p4.f2427f;
                                    p5.f2426e = p4.f2426e;
                                    p5.f2428g = p4.f2428g;
                                    arrayList8.add(i11, p5);
                                    arrayList7.remove(abstractComponentCallbacksC0171s4);
                                    i11++;
                                    abstractComponentCallbacksC0171s = abstractComponentCallbacksC0171s;
                                }
                                size2 = i16 - 1;
                                i15 = i6;
                            }
                            i14 = 1;
                            if (z9) {
                                arrayList8.remove(i11);
                                i11--;
                            } else {
                                p4.f2422a = 1;
                                p4.f2424c = true;
                                arrayList7.add(abstractComponentCallbacksC0171s3);
                            }
                        }
                        i11 += i14;
                        z6 = z8;
                        i8 = i13;
                        z7 = z5;
                    } else {
                        z5 = z7;
                    }
                    arrayList7.add(p4.f2423b);
                    i11 += i14;
                    z6 = z8;
                    i8 = i13;
                    z7 = z5;
                }
                z3 = z6;
                i5 = i8;
                z4 = z7;
            }
            z7 = z4 || c0154a.f2443g;
            i8 = i5 + 1;
            z6 = z3;
        }
        boolean z10 = z6;
        boolean z11 = z7;
        this.f2366M.clear();
        if (!z10 && this.u >= 1) {
            for (int i17 = i3; i17 < i4; i17++) {
                ArrayList arrayList9 = ((C0154a) arrayList.get(i17)).f2437a;
                int size3 = arrayList9.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj = arrayList9.get(i18);
                    i18++;
                    AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s5 = ((P) obj).f2423b;
                    if (abstractComponentCallbacksC0171s5 != null && abstractComponentCallbacksC0171s5.f2516C != null) {
                        sVar.u(g(abstractComponentCallbacksC0171s5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i19 = i3;
        while (i19 < i4) {
            C0154a c0154a2 = (C0154a) arrayList.get(i19);
            if (((Boolean) arrayList2.get(i19)).booleanValue()) {
                c0154a2.c(-1);
                I i20 = c0154a2.f2451p;
                ArrayList arrayList10 = c0154a2.f2437a;
                boolean z12 = true;
                for (int size4 = arrayList10.size() - 1; size4 >= 0; size4--) {
                    P p6 = (P) arrayList10.get(size4);
                    AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s6 = p6.f2423b;
                    if (abstractComponentCallbacksC0171s6 != null) {
                        if (abstractComponentCallbacksC0171s6.f2531R != null) {
                            abstractComponentCallbacksC0171s6.e().f2503a = z12;
                        }
                        int i21 = c0154a2.f2442f;
                        int i22 = 8194;
                        int i23 = 4097;
                        if (i21 != 4097) {
                            if (i21 != 8194) {
                                i22 = 4100;
                                if (i21 != 8197) {
                                    i23 = 4099;
                                    if (i21 != 4099) {
                                        i22 = i21 != 4100 ? 0 : 8197;
                                    }
                                }
                            }
                            i22 = i23;
                        }
                        if (abstractComponentCallbacksC0171s6.f2531R != null || i22 != 0) {
                            abstractComponentCallbacksC0171s6.e();
                            abstractComponentCallbacksC0171s6.f2531R.f2508f = i22;
                        }
                        abstractComponentCallbacksC0171s6.e();
                        abstractComponentCallbacksC0171s6.f2531R.getClass();
                    }
                    switch (p6.f2422a) {
                        case 1:
                            abstractComponentCallbacksC0171s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            z12 = true;
                            i20.X(abstractComponentCallbacksC0171s6, true);
                            i20.S(abstractComponentCallbacksC0171s6);
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + p6.f2422a);
                        case 3:
                            abstractComponentCallbacksC0171s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            i20.a(abstractComponentCallbacksC0171s6);
                            z12 = true;
                        case 4:
                            abstractComponentCallbacksC0171s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            i20.getClass();
                            b0(abstractComponentCallbacksC0171s6);
                            z12 = true;
                        case 5:
                            abstractComponentCallbacksC0171s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            i20.X(abstractComponentCallbacksC0171s6, true);
                            i20.I(abstractComponentCallbacksC0171s6);
                            z12 = true;
                        case 6:
                            abstractComponentCallbacksC0171s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            i20.c(abstractComponentCallbacksC0171s6);
                            z12 = true;
                        case 7:
                            abstractComponentCallbacksC0171s6.A(p6.f2425d, p6.f2426e, p6.f2427f, p6.f2428g);
                            i20.X(abstractComponentCallbacksC0171s6, true);
                            i20.h(abstractComponentCallbacksC0171s6);
                            z12 = true;
                        case 8:
                            i20.Z(null);
                            z12 = true;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            i20.Z(abstractComponentCallbacksC0171s6);
                            z12 = true;
                        case 10:
                            i20.Y(abstractComponentCallbacksC0171s6, p6.f2429h);
                            z12 = true;
                    }
                }
            } else {
                c0154a2.c(1);
                I i24 = c0154a2.f2451p;
                ArrayList arrayList11 = c0154a2.f2437a;
                int size5 = arrayList11.size();
                int i25 = 0;
                while (i25 < size5) {
                    P p7 = (P) arrayList11.get(i25);
                    AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s7 = p7.f2423b;
                    if (abstractComponentCallbacksC0171s7 != null) {
                        if (abstractComponentCallbacksC0171s7.f2531R != null) {
                            abstractComponentCallbacksC0171s7.e().f2503a = false;
                        }
                        int i26 = c0154a2.f2442f;
                        if (abstractComponentCallbacksC0171s7.f2531R != null || i26 != 0) {
                            abstractComponentCallbacksC0171s7.e();
                            abstractComponentCallbacksC0171s7.f2531R.f2508f = i26;
                        }
                        abstractComponentCallbacksC0171s7.e();
                        abstractComponentCallbacksC0171s7.f2531R.getClass();
                    }
                    switch (p7.f2422a) {
                        case 1:
                            str = str2;
                            abstractComponentCallbacksC0171s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i24.X(abstractComponentCallbacksC0171s7, false);
                            i24.a(abstractComponentCallbacksC0171s7);
                            i25++;
                            str2 = str;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + p7.f2422a);
                        case 3:
                            str = str2;
                            abstractComponentCallbacksC0171s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i24.S(abstractComponentCallbacksC0171s7);
                            i25++;
                            str2 = str;
                        case 4:
                            str = str2;
                            abstractComponentCallbacksC0171s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i24.I(abstractComponentCallbacksC0171s7);
                            i25++;
                            str2 = str;
                        case 5:
                            str = str2;
                            abstractComponentCallbacksC0171s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i24.X(abstractComponentCallbacksC0171s7, false);
                            b0(abstractComponentCallbacksC0171s7);
                            i25++;
                            str2 = str;
                        case 6:
                            str = str2;
                            abstractComponentCallbacksC0171s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i24.h(abstractComponentCallbacksC0171s7);
                            i25++;
                            str2 = str;
                        case 7:
                            str = str2;
                            abstractComponentCallbacksC0171s7.A(p7.f2425d, p7.f2426e, p7.f2427f, p7.f2428g);
                            i24.X(abstractComponentCallbacksC0171s7, false);
                            i24.c(abstractComponentCallbacksC0171s7);
                            i25++;
                            str2 = str;
                        case 8:
                            i24.Z(abstractComponentCallbacksC0171s7);
                            str = str2;
                            i25++;
                            str2 = str;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            i24.Z(null);
                            str = str2;
                            i25++;
                            str2 = str;
                        case 10:
                            i24.Y(abstractComponentCallbacksC0171s7, p7.f2430i);
                            str = str2;
                            i25++;
                            str2 = str;
                    }
                }
            }
            i19++;
            str2 = str2;
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
        if (z11 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i27 = 0;
            while (i27 < size6) {
                Object obj2 = arrayList.get(i27);
                i27++;
                linkedHashSet.addAll(E((C0154a) obj2));
            }
            if (this.f2376h == null) {
                int size7 = arrayList3.size();
                int i28 = 0;
                while (i28 < size7) {
                    Object obj3 = arrayList3.get(i28);
                    i28++;
                    if (obj3 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i29 = 0;
                while (i29 < size8) {
                    Object obj4 = arrayList3.get(i29);
                    i29++;
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
        for (int i30 = i3; i30 < i4; i30++) {
            C0154a c0154a3 = (C0154a) arrayList.get(i30);
            if (booleanValue) {
                for (int size9 = c0154a3.f2437a.size() - 1; size9 >= 0; size9--) {
                    AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s8 = ((P) c0154a3.f2437a.get(size9)).f2423b;
                    if (abstractComponentCallbacksC0171s8 != null) {
                        g(abstractComponentCallbacksC0171s8).j();
                    }
                }
            } else {
                ArrayList arrayList12 = c0154a3.f2437a;
                int size10 = arrayList12.size();
                int i31 = 0;
                while (i31 < size10) {
                    Object obj5 = arrayList12.get(i31);
                    i31++;
                    AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s9 = ((P) obj5).f2423b;
                    if (abstractComponentCallbacksC0171s9 != null) {
                        g(abstractComponentCallbacksC0171s9).j();
                    }
                }
            }
        }
        O(this.u, true);
        int i32 = i3;
        Iterator it4 = f(arrayList, i32, i4).iterator();
        while (it4.hasNext()) {
            C0165l c0165l = (C0165l) it4.next();
            c0165l.f2483d = booleanValue;
            synchronized (c0165l.f2481b) {
                c0165l.f();
                ArrayList arrayList13 = c0165l.f2481b;
                ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                if (listIterator.hasPrevious()) {
                    ((U) listIterator.previous()).getClass();
                    throw null;
                }
                c0165l.f2484e = false;
            }
            c0165l.c();
        }
        while (i32 < i4) {
            C0154a c0154a4 = (C0154a) arrayList.get(i32);
            if (((Boolean) arrayList2.get(i32)).booleanValue() && c0154a4.f2453r >= 0) {
                c0154a4.f2453r = -1;
            }
            c0154a4.getClass();
            i32++;
        }
        if (!z11 || arrayList3.size() <= 0) {
            return;
        }
        arrayList3.get(0).getClass();
        throw new ClassCastException();
    }

    public final AbstractComponentCallbacksC0171s C(int i3) {
        B1.s sVar = this.f2371c;
        ArrayList arrayList = (ArrayList) sVar.f144k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = (AbstractComponentCallbacksC0171s) arrayList.get(size);
            if (abstractComponentCallbacksC0171s != null && abstractComponentCallbacksC0171s.f2520G == i3) {
                return abstractComponentCallbacksC0171s;
            }
        }
        for (O o2 : ((HashMap) sVar.f145l).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = o2.f2419c;
                if (abstractComponentCallbacksC0171s2.f2520G == i3) {
                    return abstractComponentCallbacksC0171s2;
                }
            }
        }
        return null;
    }

    public final void D() {
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            C0165l c0165l = (C0165l) it2.next();
            if (c0165l.f2484e) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0165l.f2484e = false;
                c0165l.c();
            }
        }
    }

    public final ViewGroup F(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        ViewGroup viewGroup = abstractComponentCallbacksC0171s.f2528O;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0171s.f2521H <= 0 || !this.f2389w.M()) {
            return null;
        }
        View L2 = this.f2389w.L(abstractComponentCallbacksC0171s.f2521H);
        if (L2 instanceof ViewGroup) {
            return (ViewGroup) L2;
        }
        return null;
    }

    public final C0153B G() {
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.x;
        return abstractComponentCallbacksC0171s != null ? abstractComponentCallbacksC0171s.f2516C.G() : this.f2390z;
    }

    public final M1.A H() {
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.x;
        return abstractComponentCallbacksC0171s != null ? abstractComponentCallbacksC0171s.f2516C.H() : this.f2354A;
    }

    public final void I(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0171s);
        }
        if (abstractComponentCallbacksC0171s.f2523J) {
            return;
        }
        abstractComponentCallbacksC0171s.f2523J = true;
        abstractComponentCallbacksC0171s.S = true ^ abstractComponentCallbacksC0171s.S;
        a0(abstractComponentCallbacksC0171s);
    }

    public final boolean L() {
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.x;
        if (abstractComponentCallbacksC0171s == null) {
            return true;
        }
        return abstractComponentCallbacksC0171s.f2517D != null && abstractComponentCallbacksC0171s.u && abstractComponentCallbacksC0171s.j().L();
    }

    public final void O(int i3, boolean z3) {
        C0173u c0173u;
        if (this.f2388v == null && i3 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i3 != this.u) {
            this.u = i3;
            B1.s sVar = this.f2371c;
            HashMap hashMap = (HashMap) sVar.f145l;
            ArrayList arrayList = (ArrayList) sVar.f144k;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                O o2 = (O) hashMap.get(((AbstractComponentCallbacksC0171s) obj).f2542o);
                if (o2 != null) {
                    o2.j();
                }
            }
            for (O o3 : hashMap.values()) {
                if (o3 != null) {
                    o3.j();
                    AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = o3.f2419c;
                    if (abstractComponentCallbacksC0171s.f2548v && !abstractComponentCallbacksC0171s.n()) {
                        sVar.v(o3);
                    }
                }
            }
            c0();
            if (this.f2359F && (c0173u = this.f2388v) != null && this.u == 7) {
                c0173u.f2556q.invalidateOptionsMenu();
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
        for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0171s != null) {
                abstractComponentCallbacksC0171s.f2518E.P();
            }
        }
    }

    public final boolean Q() {
        A(false);
        z(true);
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.y;
        if (abstractComponentCallbacksC0171s != null && abstractComponentCallbacksC0171s.g().Q()) {
            return true;
        }
        boolean R2 = R(this.f2364K, this.f2365L, -1, 0);
        if (R2) {
            this.f2370b = true;
            try {
                T(this.f2364K, this.f2365L);
            } finally {
                d();
            }
        }
        e0();
        v();
        ((HashMap) this.f2371c.f145l).values().removeAll(Collections.singleton(null));
        return R2;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        boolean z3 = (i4 & 1) != 0;
        int i5 = -1;
        if (!this.f2372d.isEmpty()) {
            if (i3 < 0) {
                i5 = z3 ? 0 : this.f2372d.size() - 1;
            } else {
                int size = this.f2372d.size() - 1;
                while (size >= 0) {
                    C0154a c0154a = (C0154a) this.f2372d.get(size);
                    if (i3 >= 0 && i3 == c0154a.f2453r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i5 = size;
                } else if (z3) {
                    i5 = size;
                    while (i5 > 0) {
                        C0154a c0154a2 = (C0154a) this.f2372d.get(i5 - 1);
                        if (i3 < 0 || i3 != c0154a2.f2453r) {
                            break;
                        }
                        i5--;
                    }
                } else if (size != this.f2372d.size() - 1) {
                    i5 = size + 1;
                }
            }
        }
        if (i5 < 0) {
            return false;
        }
        for (int size2 = this.f2372d.size() - 1; size2 >= i5; size2--) {
            arrayList.add((C0154a) this.f2372d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0171s + " nesting=" + abstractComponentCallbacksC0171s.f2515B);
        }
        boolean n = abstractComponentCallbacksC0171s.n();
        if (abstractComponentCallbacksC0171s.f2524K && n) {
            return;
        }
        B1.s sVar = this.f2371c;
        synchronized (((ArrayList) sVar.f144k)) {
            ((ArrayList) sVar.f144k).remove(abstractComponentCallbacksC0171s);
        }
        abstractComponentCallbacksC0171s.u = false;
        if (K(abstractComponentCallbacksC0171s)) {
            this.f2359F = true;
        }
        abstractComponentCallbacksC0171s.f2548v = true;
        a0(abstractComponentCallbacksC0171s);
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
            if (!((C0154a) arrayList.get(i3)).f2450o) {
                if (i4 != i3) {
                    B(arrayList, arrayList2, i4, i3);
                }
                i4 = i3 + 1;
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((C0154a) arrayList.get(i4)).f2450o) {
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
        A.c cVar;
        int i3;
        int i4;
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
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f2388v.n.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        B1.s sVar = this.f2371c;
        HashMap hashMap2 = (HashMap) sVar.f146m;
        HashMap hashMap3 = (HashMap) sVar.f145l;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        J j3 = (J) bundle.getParcelable("state");
        if (j3 == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = j3.f2391k;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            cVar = this.n;
            if (i5 >= size) {
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            Bundle A2 = sVar.A((String) obj, null);
            if (A2 != null) {
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = (AbstractComponentCallbacksC0171s) this.f2367N.f2400b.get(((N) A2.getParcelable("state")).f2407l);
                if (abstractComponentCallbacksC0171s != null) {
                    if (J(2)) {
                        i4 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0171s);
                    } else {
                        i4 = 2;
                    }
                    o2 = new O(cVar, sVar, abstractComponentCallbacksC0171s, A2);
                    bundle2 = A2;
                } else {
                    i4 = 2;
                    bundle2 = A2;
                    o2 = new O(this.n, this.f2371c, this.f2388v.n.getClassLoader(), G(), A2);
                }
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = o2.f2419c;
                abstractComponentCallbacksC0171s2.f2540l = bundle2;
                abstractComponentCallbacksC0171s2.f2516C = this;
                if (J(i4)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0171s2.f2542o + "): " + abstractComponentCallbacksC0171s2);
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
            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s3 = (AbstractComponentCallbacksC0171s) obj2;
            if (hashMap3.get(abstractComponentCallbacksC0171s3.f2542o) == null) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0171s3 + " that was not found in the set of active Fragments " + j3.f2391k);
                }
                this.f2367N.f(abstractComponentCallbacksC0171s3);
                abstractComponentCallbacksC0171s3.f2516C = this;
                O o3 = new O(cVar, sVar, abstractComponentCallbacksC0171s3);
                o3.f2421e = 1;
                o3.j();
                abstractComponentCallbacksC0171s3.f2548v = true;
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
                AbstractComponentCallbacksC0171s h3 = sVar.h(str3);
                if (h3 == null) {
                    throw new IllegalStateException(AbstractC0468a.b("No instantiated fragment for (", str3, ")"));
                }
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + h3);
                }
                sVar.b(h3);
            }
        }
        if (j3.f2393m != null) {
            this.f2372d = new ArrayList(j3.f2393m.length);
            int i8 = 0;
            while (true) {
                C0155b[] c0155bArr = j3.f2393m;
                if (i8 >= c0155bArr.length) {
                    break;
                }
                C0155b c0155b = c0155bArr[i8];
                ArrayList arrayList4 = c0155b.f2455l;
                C0154a c0154a = new C0154a(this);
                int[] iArr = c0155b.f2454k;
                int i9 = 0;
                int i10 = 0;
                while (i9 < iArr.length) {
                    P p3 = new P();
                    int i11 = i9 + 1;
                    p3.f2422a = iArr[i9];
                    if (J(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0154a + " op #" + i10 + " base fragment #" + iArr[i11]);
                    }
                    p3.f2429h = EnumC0141m.values()[c0155b.f2456m[i10]];
                    p3.f2430i = EnumC0141m.values()[c0155b.n[i10]];
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
                    c0154a.f2438b = i13;
                    c0154a.f2439c = i14;
                    c0154a.f2440d = i16;
                    c0154a.f2441e = i17;
                    c0154a.b(p3);
                    i10++;
                    iArr = iArr2;
                }
                c0154a.f2442f = c0155b.f2457o;
                c0154a.f2444h = c0155b.f2458p;
                c0154a.f2443g = true;
                c0154a.f2445i = c0155b.f2460r;
                c0154a.f2446j = c0155b.f2461s;
                c0154a.f2447k = c0155b.f2462t;
                c0154a.f2448l = c0155b.u;
                c0154a.f2449m = c0155b.f2463v;
                c0154a.n = c0155b.f2464w;
                c0154a.f2450o = c0155b.x;
                c0154a.f2453r = c0155b.f2459q;
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    String str4 = (String) arrayList4.get(i18);
                    if (str4 != null) {
                        ((P) c0154a.f2437a.get(i18)).f2423b = sVar.h(str4);
                    }
                }
                c0154a.c(1);
                if (J(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + c0154a.f2453r + "): " + c0154a);
                    PrintWriter printWriter = new PrintWriter(new S());
                    c0154a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2372d.add(c0154a);
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
            AbstractComponentCallbacksC0171s h4 = sVar.h(str5);
            this.y = h4;
            r(h4);
        }
        ArrayList arrayList5 = j3.f2395p;
        if (arrayList5 != null) {
            for (int i19 = i3; i19 < arrayList5.size(); i19++) {
                this.f2379k.put((String) arrayList5.get(i19), (C0156c) j3.f2396q.get(i19));
            }
        }
        this.f2358E = new ArrayDeque(j3.f2397r);
    }

    public final Bundle V() {
        int i3;
        ArrayList arrayList;
        C0155b[] c0155bArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        D();
        x();
        A(true);
        this.f2360G = true;
        this.f2367N.f2405g = true;
        B1.s sVar = this.f2371c;
        sVar.getClass();
        HashMap hashMap = (HashMap) sVar.f145l;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it2 = hashMap.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            O o2 = (O) it2.next();
            if (o2 != null) {
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = o2.f2419c;
                String str = abstractComponentCallbacksC0171s.f2542o;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = o2.f2419c;
                if (abstractComponentCallbacksC0171s2.f2539k == -1 && (bundle = abstractComponentCallbacksC0171s2.f2540l) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new N(abstractComponentCallbacksC0171s2));
                if (abstractComponentCallbacksC0171s2.f2539k > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0171s2.v(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    o2.f2417a.v(abstractComponentCallbacksC0171s2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0171s2.f2536Y.d(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle V2 = abstractComponentCallbacksC0171s2.f2518E.V();
                    if (!V2.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", V2);
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0171s2.f2541m;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0171s2.n;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0171s2.f2543p;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                sVar.A(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0171s.f2542o);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0171s + ": " + abstractComponentCallbacksC0171s.f2540l);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f2371c.f146m;
        if (!hashMap2.isEmpty()) {
            B1.s sVar2 = this.f2371c;
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
                            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s3 = (AbstractComponentCallbacksC0171s) obj;
                            arrayList.add(abstractComponentCallbacksC0171s3.f2542o);
                            if (J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0171s3.f2542o + "): " + abstractComponentCallbacksC0171s3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.f2372d.size();
            if (size2 > 0) {
                c0155bArr = new C0155b[size2];
                for (i3 = 0; i3 < size2; i3++) {
                    c0155bArr[i3] = new C0155b((C0154a) this.f2372d.get(i3));
                    if (J(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f2372d.get(i3));
                    }
                }
            } else {
                c0155bArr = null;
            }
            J j3 = new J();
            j3.f2394o = null;
            ArrayList arrayList4 = new ArrayList();
            j3.f2395p = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            j3.f2396q = arrayList5;
            j3.f2391k = arrayList2;
            j3.f2392l = arrayList;
            j3.f2393m = c0155bArr;
            j3.n = this.f2378j.get();
            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s4 = this.y;
            if (abstractComponentCallbacksC0171s4 != null) {
                j3.f2394o = abstractComponentCallbacksC0171s4.f2542o;
            }
            arrayList4.addAll(this.f2379k.keySet());
            arrayList5.addAll(this.f2379k.values());
            j3.f2397r = new ArrayList(this.f2358E);
            bundle2.putParcelable("state", j3);
            for (String str2 : this.f2380l.keySet()) {
                bundle2.putBundle(AbstractC0468a.a("result_", str2), (Bundle) this.f2380l.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(AbstractC0468a.a("fragment_", str3), (Bundle) hashMap2.get(str3));
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

    public final void X(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        ViewGroup F3 = F(abstractComponentCallbacksC0171s);
        if (F3 == null || !(F3 instanceof C0175w)) {
            return;
        }
        ((C0175w) F3).setDrawDisappearingViewsLast(!z3);
    }

    public final void Y(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, EnumC0141m enumC0141m) {
        if (abstractComponentCallbacksC0171s.equals(this.f2371c.h(abstractComponentCallbacksC0171s.f2542o)) && (abstractComponentCallbacksC0171s.f2517D == null || abstractComponentCallbacksC0171s.f2516C == this)) {
            abstractComponentCallbacksC0171s.f2534V = enumC0141m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0171s + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (abstractComponentCallbacksC0171s != null) {
            if (!abstractComponentCallbacksC0171s.equals(this.f2371c.h(abstractComponentCallbacksC0171s.f2542o)) || (abstractComponentCallbacksC0171s.f2517D != null && abstractComponentCallbacksC0171s.f2516C != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0171s + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = this.y;
        this.y = abstractComponentCallbacksC0171s;
        r(abstractComponentCallbacksC0171s2);
        r(this.y);
    }

    public final O a(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        String str = abstractComponentCallbacksC0171s.f2533U;
        if (str != null) {
            c0.d.c(abstractComponentCallbacksC0171s, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0171s);
        }
        O g3 = g(abstractComponentCallbacksC0171s);
        abstractComponentCallbacksC0171s.f2516C = this;
        B1.s sVar = this.f2371c;
        sVar.u(g3);
        if (!abstractComponentCallbacksC0171s.f2524K) {
            sVar.b(abstractComponentCallbacksC0171s);
            abstractComponentCallbacksC0171s.f2548v = false;
            abstractComponentCallbacksC0171s.S = false;
            if (K(abstractComponentCallbacksC0171s)) {
                this.f2359F = true;
            }
        }
        return g3;
    }

    public final void a0(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        ViewGroup F3 = F(abstractComponentCallbacksC0171s);
        if (F3 != null) {
            r rVar = abstractComponentCallbacksC0171s.f2531R;
            if ((rVar == null ? 0 : rVar.f2507e) + (rVar == null ? 0 : rVar.f2506d) + (rVar == null ? 0 : rVar.f2505c) + (rVar == null ? 0 : rVar.f2504b) > 0) {
                if (F3.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F3.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0171s);
                }
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = (AbstractComponentCallbacksC0171s) F3.getTag(R.id.visible_removing_fragment_view_tag);
                r rVar2 = abstractComponentCallbacksC0171s.f2531R;
                boolean z3 = rVar2 != null ? rVar2.f2503a : false;
                if (abstractComponentCallbacksC0171s2.f2531R == null) {
                    return;
                }
                abstractComponentCallbacksC0171s2.e().f2503a = z3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0173u c0173u, AbstractC0102a abstractC0102a, AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (this.f2388v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2388v = c0173u;
        this.f2389w = abstractC0102a;
        this.x = abstractComponentCallbacksC0171s;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2382o;
        if (abstractComponentCallbacksC0171s != 0) {
            copyOnWriteArrayList.add(new C(abstractComponentCallbacksC0171s));
        } else if (c0173u != null) {
            copyOnWriteArrayList.add(c0173u);
        }
        if (this.x != null) {
            e0();
        }
        if (c0173u != null) {
            b.t b3 = c0173u.f2556q.b();
            this.f2375g = b3;
            C0173u c0173u2 = abstractComponentCallbacksC0171s != 0 ? abstractComponentCallbacksC0171s : c0173u;
            b3.getClass();
            z zVar = this.f2377i;
            a2.h.e(zVar, "onBackPressedCallback");
            androidx.lifecycle.u h3 = c0173u2.h();
            if (h3.f2160c != EnumC0141m.f2150k) {
                b.o oVar = new b.o(zVar, new b.p(zVar, c0173u2));
                zVar.f2566a.add(oVar);
                oVar.d(false);
                B1.s sVar = b3.a().f2338c;
                sVar.getClass();
                if (((LinkedHashSet) sVar.f146m).add(oVar)) {
                    C0262e c0262e = (C0262e) sVar.f145l;
                    c0262e.getClass();
                    if (oVar.f2331c != null) {
                        throw new IllegalArgumentException(("Handler '" + oVar + "' is already registered with a dispatcher").toString());
                    }
                    c0262e.f2872e.addFirst(oVar);
                    oVar.f2331c = sVar;
                    c0262e.b();
                }
                b.s sVar2 = new b.s(oVar, b3, h3);
                h3.a(sVar2);
                zVar.f2568c.add(sVar2);
            }
        }
        if (abstractComponentCallbacksC0171s != 0) {
            L l3 = abstractComponentCallbacksC0171s.f2516C.f2367N;
            HashMap hashMap = l3.f2401c;
            L l4 = (L) hashMap.get(abstractComponentCallbacksC0171s.f2542o);
            if (l4 == null) {
                l4 = new L(l3.f2403e);
                hashMap.put(abstractComponentCallbacksC0171s.f2542o, l4);
            }
            this.f2367N = l4;
        } else if (c0173u != null) {
            androidx.lifecycle.S f3 = c0173u.f2556q.f();
            C0230a c0230a = C0230a.f2768b;
            a2.h.e(c0230a, "defaultCreationExtras");
            A0.j jVar = new A0.j(f3, L.f2399h, c0230a);
            a2.e a3 = a2.p.a(L.class);
            String b4 = a3.b();
            if (b4 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f2367N = (L) jVar.C(a3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b4));
        } else {
            this.f2367N = new L(false);
        }
        L l5 = this.f2367N;
        l5.f2405g = this.f2360G || this.f2361H;
        this.f2371c.n = l5;
        C0173u c0173u3 = this.f2388v;
        if (c0173u3 != null && abstractComponentCallbacksC0171s == 0) {
            B1.p c3 = c0173u3.c();
            c3.c("android:support:fragments", new b.f(this, 2));
            Bundle a4 = c3.a("android:support:fragments");
            if (a4 != null) {
                U(a4);
            }
        }
        C0173u c0173u4 = this.f2388v;
        if (c0173u4 != null) {
            b.j jVar2 = c0173u4.f2556q.f2314r;
            String a5 = AbstractC0468a.a("FragmentManager:", abstractComponentCallbacksC0171s != 0 ? B1.e.m(new StringBuilder(), abstractComponentCallbacksC0171s.f2542o, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER) : StringUtils.EMPTY);
            this.f2355B = jVar2.a(B1.e.j(a5, "StartActivityForResult"), new D(3), new B1.g(this, 11));
            this.f2356C = jVar2.a(B1.e.j(a5, "StartIntentSenderForResult"), new D(0), new H0.i(this, 18));
            this.f2357D = jVar2.a(B1.e.j(a5, "RequestPermissions"), new D(2), new B1.a(this, 15));
        }
        C0173u c0173u5 = this.f2388v;
        if (c0173u5 != null) {
            c0173u5.e(this.f2383p);
        }
        C0173u c0173u6 = this.f2388v;
        if (c0173u6 != null) {
            SignInHubActivity signInHubActivity = c0173u6.f2556q;
            signInHubActivity.getClass();
            y yVar = this.f2384q;
            a2.h.e(yVar, "listener");
            signInHubActivity.f2316t.add(yVar);
        }
        C0173u c0173u7 = this.f2388v;
        if (c0173u7 != null) {
            SignInHubActivity signInHubActivity2 = c0173u7.f2556q;
            signInHubActivity2.getClass();
            y yVar2 = this.f2385r;
            a2.h.e(yVar2, "listener");
            signInHubActivity2.f2317v.add(yVar2);
        }
        C0173u c0173u8 = this.f2388v;
        if (c0173u8 != null) {
            SignInHubActivity signInHubActivity3 = c0173u8.f2556q;
            signInHubActivity3.getClass();
            y yVar3 = this.f2386s;
            a2.h.e(yVar3, "listener");
            signInHubActivity3.f2318w.add(yVar3);
        }
        C0173u c0173u9 = this.f2388v;
        if (c0173u9 == null || abstractComponentCallbacksC0171s != 0) {
            return;
        }
        SignInHubActivity signInHubActivity4 = c0173u9.f2556q;
        signInHubActivity4.getClass();
        C0152A c0152a = this.f2387t;
        a2.h.e(c0152a, "provider");
        A0.j jVar3 = signInHubActivity4.f2310m;
        ((CopyOnWriteArrayList) jVar3.f58m).add(c0152a);
        ((RunnableC0151d) jVar3.f57l).run();
    }

    public final void c(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0171s);
        }
        if (abstractComponentCallbacksC0171s.f2524K) {
            abstractComponentCallbacksC0171s.f2524K = false;
            if (abstractComponentCallbacksC0171s.u) {
                return;
            }
            this.f2371c.b(abstractComponentCallbacksC0171s);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0171s);
            }
            if (K(abstractComponentCallbacksC0171s)) {
                this.f2359F = true;
            }
        }
    }

    public final void c0() {
        ArrayList l3 = this.f2371c.l();
        int size = l3.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = l3.get(i3);
            i3++;
            O o2 = (O) obj;
            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = o2.f2419c;
            if (abstractComponentCallbacksC0171s.f2529P) {
                if (this.f2370b) {
                    this.f2363J = true;
                } else {
                    abstractComponentCallbacksC0171s.f2529P = false;
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
        C0173u c0173u = this.f2388v;
        if (c0173u == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
                throw illegalStateException;
            }
        }
        try {
            c0173u.f2556q.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e4) {
            Log.e("FragmentManager", "Failed dumping state", e4);
            throw illegalStateException;
        }
    }

    public final HashSet e() {
        C0165l c0165l;
        HashSet hashSet = new HashSet();
        ArrayList l3 = this.f2371c.l();
        int size = l3.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = l3.get(i3);
            i3++;
            ViewGroup viewGroup = ((O) obj).f2419c.f2528O;
            if (viewGroup != null) {
                a2.h.e(H(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0165l) {
                    c0165l = (C0165l) tag;
                } else {
                    c0165l = new C0165l(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0165l);
                }
                hashSet.add(c0165l);
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
        C0165l c0165l;
        HashSet hashSet = new HashSet();
        while (i3 < i4) {
            ArrayList arrayList2 = ((C0154a) arrayList.get(i3)).f2437a;
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = ((P) obj).f2423b;
                if (abstractComponentCallbacksC0171s != null && (viewGroup = abstractComponentCallbacksC0171s.f2528O) != null) {
                    a2.h.d(H(), "fragmentManager.specialEffectsControllerFactory");
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof C0165l) {
                        c0165l = (C0165l) tag;
                    } else {
                        c0165l = new C0165l(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0165l);
                    }
                    hashSet.add(c0165l);
                }
            }
            i3++;
        }
        return hashSet;
    }

    public final O g(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        String str = abstractComponentCallbacksC0171s.f2542o;
        B1.s sVar = this.f2371c;
        O o2 = (O) ((HashMap) sVar.f145l).get(str);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O(this.n, sVar, abstractComponentCallbacksC0171s);
        o3.l(this.f2388v.n.getClassLoader());
        o3.f2421e = this.u;
        return o3;
    }

    public final void h(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0171s);
        }
        if (abstractComponentCallbacksC0171s.f2524K) {
            return;
        }
        abstractComponentCallbacksC0171s.f2524K = true;
        if (abstractComponentCallbacksC0171s.u) {
            if (J(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0171s);
            }
            B1.s sVar = this.f2371c;
            synchronized (((ArrayList) sVar.f144k)) {
                ((ArrayList) sVar.f144k).remove(abstractComponentCallbacksC0171s);
            }
            abstractComponentCallbacksC0171s.u = false;
            if (K(abstractComponentCallbacksC0171s)) {
                this.f2359F = true;
            }
            a0(abstractComponentCallbacksC0171s);
        }
    }

    public final void i(boolean z3) {
        if (z3 && this.f2388v != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0171s != null) {
                abstractComponentCallbacksC0171s.f2527N = true;
                if (z3) {
                    abstractComponentCallbacksC0171s.f2518E.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0171s != null) {
                if (!abstractComponentCallbacksC0171s.f2523J ? abstractComponentCallbacksC0171s.f2518E.j() : false) {
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
        for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0171s != null && M(abstractComponentCallbacksC0171s)) {
                if (!abstractComponentCallbacksC0171s.f2523J ? abstractComponentCallbacksC0171s.f2518E.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0171s);
                    z3 = true;
                }
            }
        }
        if (this.f2373e != null) {
            for (int i3 = 0; i3 < this.f2373e.size(); i3++) {
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = (AbstractComponentCallbacksC0171s) this.f2373e.get(i3);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0171s2)) {
                    abstractComponentCallbacksC0171s2.getClass();
                }
            }
        }
        this.f2373e = arrayList;
        return z3;
    }

    public final void l() {
        boolean z3;
        boolean isTerminated;
        this.f2362I = true;
        A(true);
        x();
        C0173u c0173u = this.f2388v;
        B1.s sVar = this.f2371c;
        if (c0173u != null) {
            z3 = ((L) sVar.n).f2404f;
        } else {
            z3 = c0173u.n != null ? !r1.isChangingConfigurations() : true;
        }
        int i3 = 0;
        if (z3) {
            Iterator it2 = this.f2379k.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((C0156c) it2.next()).f2465k;
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
        C0173u c0173u2 = this.f2388v;
        if (c0173u2 != null) {
            SignInHubActivity signInHubActivity = c0173u2.f2556q;
            signInHubActivity.getClass();
            y yVar = this.f2384q;
            a2.h.e(yVar, "listener");
            signInHubActivity.f2316t.remove(yVar);
        }
        C0173u c0173u3 = this.f2388v;
        if (c0173u3 != null) {
            c0173u3.g(this.f2383p);
        }
        C0173u c0173u4 = this.f2388v;
        if (c0173u4 != null) {
            SignInHubActivity signInHubActivity2 = c0173u4.f2556q;
            signInHubActivity2.getClass();
            y yVar2 = this.f2385r;
            a2.h.e(yVar2, "listener");
            signInHubActivity2.f2317v.remove(yVar2);
        }
        C0173u c0173u5 = this.f2388v;
        if (c0173u5 != null) {
            SignInHubActivity signInHubActivity3 = c0173u5.f2556q;
            signInHubActivity3.getClass();
            y yVar3 = this.f2386s;
            a2.h.e(yVar3, "listener");
            signInHubActivity3.f2318w.remove(yVar3);
        }
        C0173u c0173u6 = this.f2388v;
        if (c0173u6 != null && this.x == null) {
            SignInHubActivity signInHubActivity4 = c0173u6.f2556q;
            signInHubActivity4.getClass();
            C0152A c0152a = this.f2387t;
            a2.h.e(c0152a, "provider");
            A0.j jVar = signInHubActivity4.f2310m;
            ((CopyOnWriteArrayList) jVar.f58m).remove(c0152a);
            if (((HashMap) jVar.n).remove(c0152a) != null) {
                throw new ClassCastException();
            }
            ((RunnableC0151d) jVar.f57l).run();
        }
        this.f2388v = null;
        this.f2389w = null;
        this.x = null;
        if (this.f2375g != null) {
            z zVar = this.f2377i;
            ArrayList arrayList2 = zVar.f2566a;
            CopyOnWriteArrayList copyOnWriteArrayList = zVar.f2568c;
            Iterator it3 = copyOnWriteArrayList.iterator();
            a2.h.d(it3, "iterator(...)");
            while (it3.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it3.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z4 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
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
                ((b.o) obj2).b();
            }
            arrayList2.clear();
            this.f2375g = null;
        }
        C0192Q c0192q = this.f2355B;
        if (c0192q != null) {
            c0192q.y();
            this.f2356C.y();
            this.f2357D.y();
        }
    }

    public final void m(boolean z3) {
        if (z3 && this.f2388v != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0171s != null) {
                abstractComponentCallbacksC0171s.f2527N = true;
                if (z3) {
                    abstractComponentCallbacksC0171s.f2518E.m(true);
                }
            }
        }
    }

    public final void n(boolean z3) {
        if (z3 && this.f2388v != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0171s != null && z3) {
                abstractComponentCallbacksC0171s.f2518E.n(true);
            }
        }
    }

    public final void o() {
        ArrayList m3 = this.f2371c.m();
        int size = m3.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = m3.get(i3);
            i3++;
            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = (AbstractComponentCallbacksC0171s) obj;
            if (abstractComponentCallbacksC0171s != null) {
                abstractComponentCallbacksC0171s.m();
                abstractComponentCallbacksC0171s.f2518E.o();
            }
        }
    }

    public final boolean p() {
        if (this.u >= 1) {
            for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : this.f2371c.n()) {
                if (abstractComponentCallbacksC0171s != null) {
                    if (!abstractComponentCallbacksC0171s.f2523J ? abstractComponentCallbacksC0171s.f2518E.p() : false) {
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
        for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0171s != null && !abstractComponentCallbacksC0171s.f2523J) {
                abstractComponentCallbacksC0171s.f2518E.q();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (abstractComponentCallbacksC0171s != null) {
            if (abstractComponentCallbacksC0171s.equals(this.f2371c.h(abstractComponentCallbacksC0171s.f2542o))) {
                abstractComponentCallbacksC0171s.f2516C.getClass();
                boolean N2 = N(abstractComponentCallbacksC0171s);
                Boolean bool = abstractComponentCallbacksC0171s.f2547t;
                if (bool == null || bool.booleanValue() != N2) {
                    abstractComponentCallbacksC0171s.f2547t = Boolean.valueOf(N2);
                    I i3 = abstractComponentCallbacksC0171s.f2518E;
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
        for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0171s != null && z3) {
                abstractComponentCallbacksC0171s.f2518E.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.u < 1) {
            return false;
        }
        boolean z3 = false;
        for (AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s : this.f2371c.n()) {
            if (abstractComponentCallbacksC0171s != null && M(abstractComponentCallbacksC0171s)) {
                if (!abstractComponentCallbacksC0171s.f2523J ? abstractComponentCallbacksC0171s.f2518E.t() : false) {
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
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.x;
        if (abstractComponentCallbacksC0171s != null) {
            sb.append(abstractComponentCallbacksC0171s.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            C0173u c0173u = this.f2388v;
            if (c0173u != null) {
                sb.append(c0173u.getClass().getSimpleName());
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
                ((C0165l) it2.next()).d();
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
        String j3 = B1.e.j(str, "    ");
        B1.s sVar = this.f2371c;
        ArrayList arrayList = (ArrayList) sVar.f144k;
        String j4 = B1.e.j(str, "    ");
        HashMap hashMap = (HashMap) sVar.f145l;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o2 : hashMap.values()) {
                printWriter.print(str);
                if (o2 != null) {
                    AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = o2.f2419c;
                    printWriter.println(abstractComponentCallbacksC0171s);
                    abstractComponentCallbacksC0171s.getClass();
                    printWriter.print(j4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0171s.f2520G));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0171s.f2521H));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0171s.f2522I);
                    printWriter.print(j4);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0171s.f2539k);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0171s.f2542o);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0171s.f2515B);
                    printWriter.print(j4);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0171s.u);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0171s.f2548v);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0171s.x);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0171s.y);
                    printWriter.print(j4);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0171s.f2523J);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0171s.f2524K);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0171s.f2526M);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(j4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0171s.f2525L);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0171s.f2530Q);
                    if (abstractComponentCallbacksC0171s.f2516C != null) {
                        printWriter.print(j4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0171s.f2516C);
                    }
                    if (abstractComponentCallbacksC0171s.f2517D != null) {
                        printWriter.print(j4);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0171s.f2517D);
                    }
                    if (abstractComponentCallbacksC0171s.f2519F != null) {
                        printWriter.print(j4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0171s.f2519F);
                    }
                    if (abstractComponentCallbacksC0171s.f2543p != null) {
                        printWriter.print(j4);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0171s.f2543p);
                    }
                    if (abstractComponentCallbacksC0171s.f2540l != null) {
                        printWriter.print(j4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0171s.f2540l);
                    }
                    if (abstractComponentCallbacksC0171s.f2541m != null) {
                        printWriter.print(j4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0171s.f2541m);
                    }
                    if (abstractComponentCallbacksC0171s.n != null) {
                        printWriter.print(j4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0171s.n);
                    }
                    Object obj = abstractComponentCallbacksC0171s.f2544q;
                    if (obj == null) {
                        I i3 = abstractComponentCallbacksC0171s.f2516C;
                        obj = (i3 == null || (str2 = abstractComponentCallbacksC0171s.f2545r) == null) ? null : i3.f2371c.h(str2);
                    }
                    if (obj != null) {
                        printWriter.print(j4);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0171s.f2546s);
                    }
                    printWriter.print(j4);
                    printWriter.print("mPopDirection=");
                    r rVar = abstractComponentCallbacksC0171s.f2531R;
                    printWriter.println(rVar == null ? false : rVar.f2503a);
                    r rVar2 = abstractComponentCallbacksC0171s.f2531R;
                    if ((rVar2 == null ? 0 : rVar2.f2504b) != 0) {
                        printWriter.print(j4);
                        printWriter.print("getEnterAnim=");
                        r rVar3 = abstractComponentCallbacksC0171s.f2531R;
                        printWriter.println(rVar3 == null ? 0 : rVar3.f2504b);
                    }
                    r rVar4 = abstractComponentCallbacksC0171s.f2531R;
                    if ((rVar4 == null ? 0 : rVar4.f2505c) != 0) {
                        printWriter.print(j4);
                        printWriter.print("getExitAnim=");
                        r rVar5 = abstractComponentCallbacksC0171s.f2531R;
                        printWriter.println(rVar5 == null ? 0 : rVar5.f2505c);
                    }
                    r rVar6 = abstractComponentCallbacksC0171s.f2531R;
                    if ((rVar6 == null ? 0 : rVar6.f2506d) != 0) {
                        printWriter.print(j4);
                        printWriter.print("getPopEnterAnim=");
                        r rVar7 = abstractComponentCallbacksC0171s.f2531R;
                        printWriter.println(rVar7 == null ? 0 : rVar7.f2506d);
                    }
                    r rVar8 = abstractComponentCallbacksC0171s.f2531R;
                    if ((rVar8 == null ? 0 : rVar8.f2507e) != 0) {
                        printWriter.print(j4);
                        printWriter.print("getPopExitAnim=");
                        r rVar9 = abstractComponentCallbacksC0171s.f2531R;
                        printWriter.println(rVar9 != null ? rVar9.f2507e : 0);
                    }
                    if (abstractComponentCallbacksC0171s.f2528O != null) {
                        printWriter.print(j4);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0171s.f2528O);
                    }
                    C0173u c0173u = abstractComponentCallbacksC0171s.f2517D;
                    if ((c0173u != null ? c0173u.n : null) != null) {
                        C0192Q.v(abstractComponentCallbacksC0171s).t(j4, printWriter);
                    }
                    printWriter.print(j4);
                    printWriter.println("Child " + abstractComponentCallbacksC0171s.f2518E + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    abstractComponentCallbacksC0171s.f2518E.w(B1.e.j(j4, "  "), fileDescriptor, printWriter, strArr);
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
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = (AbstractComponentCallbacksC0171s) arrayList.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0171s2.toString());
            }
        }
        ArrayList arrayList2 = this.f2373e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size; i5++) {
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s3 = (AbstractComponentCallbacksC0171s) this.f2373e.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0171s3.toString());
            }
        }
        int size3 = this.f2372d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size3; i6++) {
                C0154a c0154a = (C0154a) this.f2372d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(c0154a.toString());
                c0154a.f(j3, printWriter, true);
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
                        Object obj2 = (F) this.f2369a.get(i7);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.println(obj2);
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
            ((C0165l) it2.next()).d();
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
