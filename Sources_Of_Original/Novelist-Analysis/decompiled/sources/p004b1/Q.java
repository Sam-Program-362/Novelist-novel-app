package p004b1;

import B1.n;
import B1.o;
import C1.m;
import D.G;
import H0.i;
import K1.C0038n;
import M0.E;
import M1.C0073w;
import M1.K;
import M1.O;
import O1.g;
import R1.c;
import S1.a;
import V.C0090n;
import V.C0091o;
import V.C0092p;
import a2.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0144s;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.z;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import l2.d;
import l2.e;
import l2.j;
import m2.l;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.metadata.ClimateForcast;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import p031k.B;
import p031k.C0237o;
import p035l0.L;
import p044o1.b;
import p052r1.t;
import p052r1.u;
import p064x0.h;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements k, n, d, m, u, h {
    public static Q n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f2599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f2600m;

    public /* synthetic */ Q(int i3, boolean z3) {
        this.f2598k = i3;
    }

    public static Q v(InterfaceC0144s interfaceC0144s) {
        return new Q(interfaceC0144s, ((T) interfaceC0144s).f());
    }

    @Override // B1.n
    public void a(boolean z3) {
        ((s) ((s) this.f2599l).f3227G.f3201l).f3222B = z3;
    }

    @Override // p052r1.u
    public void b(KeyEvent keyEvent, E e3) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            e3.a(false);
            return;
        }
        Character chA = ((t) this.f2600m).a(keyEvent.getUnicodeChar());
        boolean z3 = action != 0;
        i iVar = (i) this.f2599l;
        K k3 = new K(e3, 13);
        B1.s sVar = (B1.s) iVar.f443l;
        HashMap map = new HashMap();
        map.put("type", z3 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(keyEvent.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        map.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        map.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        map.put("character", chA.toString());
        map.put(ClimateForcast.SOURCE, Integer.valueOf(keyEvent.getSource()));
        map.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        sVar.x(map, new B1.d(k3, 0));
    }

    @Override // io.flutter.plugin.platform.k
    public void c(io.flutter.view.i iVar) {
        ((s) this.f2599l).f3235s.f3166a = iVar;
        ((r) this.f2600m).f3214r.f3166a = iVar;
    }

    @Override // B1.n
    public void d(int i3, double d3, double d4) {
        if (((r) this.f2600m).l(i3) != null) {
            return;
        }
        ((s) this.f2599l).f3227G.d(i3, d3, d4);
    }

    @Override // B1.n
    public void e(B1.m mVar, B1.d dVar) {
        if (((r) this.f2600m).l(mVar.f127a) != null) {
            return;
        }
        ((s) this.f2599l).f3227G.e(mVar, dVar);
    }

    @Override // B1.n
    public void f(int i3, int i4) {
        r rVar = (r) this.f2600m;
        if (rVar.l(i3) != null) {
            rVar.f3207A.f(i3, i4);
        } else {
            ((s) this.f2599l).f3227G.f(i3, i4);
        }
    }

    @Override // io.flutter.plugin.platform.k
    public boolean g(int i3) {
        r rVar = (r) this.f2600m;
        if (rVar.l(i3) == null) {
            return ((s) this.f2599l).g(i3);
        }
        rVar.getClass();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // l2.d
    public Object h(e eVar, c cVar) {
        j jVar;
        Throwable th;
        l lVar;
        Q q3;
        e eVar2;
        d dVar;
        l2.l lVar2;
        C0038n c0038n;
        switch (this.f2598k) {
            case 8:
                if (cVar instanceof j) {
                    jVar = (j) cVar;
                    int i3 = jVar.f4052o;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jVar.f4052o = i3 - Integer.MIN_VALUE;
                    } else {
                        jVar = new j(this, cVar);
                    }
                } else {
                    jVar = new j(this, cVar);
                }
                Object obj = jVar.n;
                int i4 = jVar.f4052o;
                a aVar = a.f1260k;
                if (i4 == 0) {
                    H2.h.E(obj);
                    R1.h hVar = jVar.f1277l;
                    a2.h.b(hVar);
                    l lVar3 = new l(eVar, hVar);
                    try {
                        C0090n c0090n = (C0090n) this.f2599l;
                        jVar.f4054q = this;
                        jVar.f4055r = eVar;
                        jVar.f4056s = lVar3;
                        jVar.f4052o = 1;
                        if (c0090n.e(lVar3, jVar) == aVar) {
                            return aVar;
                        }
                        q3 = this;
                        eVar2 = eVar;
                        lVar = lVar3;
                        lVar.n();
                        dVar = (d) q3.f2600m;
                        jVar.f4054q = null;
                        jVar.f4055r = null;
                        jVar.f4056s = null;
                        jVar.f4052o = 2;
                        if (dVar.h(eVar2, jVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        lVar = lVar3;
                        lVar.n();
                        throw th;
                    }
                } else if (i4 == 1) {
                    lVar = jVar.f4056s;
                    eVar2 = jVar.f4055r;
                    q3 = jVar.f4054q;
                    try {
                        H2.h.E(obj);
                        lVar.n();
                        dVar = (d) q3.f2600m;
                        jVar.f4054q = null;
                        jVar.f4055r = null;
                        jVar.f4056s = null;
                        jVar.f4052o = 2;
                        if (dVar.h(eVar2, jVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        lVar.n();
                        throw th;
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H2.h.E(obj);
                }
                return g.f1211a;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                Object objH = ((Q) this.f2599l).h(new K1.r(new a2.m(), eVar, (C0092p) this.f2600m), cVar);
                return objH == a.f1260k ? objH : g.f1211a;
            default:
                if (cVar instanceof l2.l) {
                    lVar2 = (l2.l) cVar;
                    int i5 = lVar2.f4061o;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lVar2.f4061o = i5 - Integer.MIN_VALUE;
                    } else {
                        lVar2 = new l2.l(this, cVar);
                    }
                } else {
                    lVar2 = new l2.l(this, cVar);
                }
                Object obj2 = lVar2.n;
                int i6 = lVar2.f4061o;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0038n = lVar2.f4063q;
                    try {
                        H2.h.E(obj2);
                    } catch (m2.a e3) {
                        e = e3;
                        if (e.f4100k != c0038n) {
                            throw e;
                        }
                    }
                    break;
                } else {
                    H2.h.E(obj2);
                    Q q4 = (Q) this.f2599l;
                    C0038n c0038n2 = new C0038n((C0091o) this.f2600m, eVar);
                    try {
                        lVar2.f4063q = c0038n2;
                        lVar2.f4061o = 1;
                        Object objH2 = q4.h(c0038n2, lVar2);
                        a aVar2 = a.f1260k;
                        if (objH2 == aVar2) {
                            return aVar2;
                        }
                    } catch (m2.a e4) {
                        e = e4;
                        c0038n = c0038n2;
                        if (e.f4100k != c0038n) {
                            throw e;
                        }
                    }
                }
                return g.f1211a;
        }
    }

    @Override // B1.n
    public void i(B1.l lVar) {
        r rVar = (r) this.f2600m;
        if (rVar.l(lVar.f112a) != null) {
            rVar.f3207A.i(lVar);
        } else {
            ((s) this.f2599l).f3227G.i(lVar);
        }
    }

    @Override // B1.n
    public long j(B1.k kVar) {
        return ((s) this.f2599l).f3227G.j(kVar);
    }

    @Override // C1.m
    public void k(A.c cVar, o oVar) {
        o oVar2;
        b bVar = (b) this.f2600m;
        a2.h.e(cVar, "call");
        Object obj = cVar.f7m;
        if (!(obj instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
        bVar.getClass();
        AtomicBoolean atomicBoolean = bVar.f4217l;
        if (!atomicBoolean.compareAndSet(true, false) && (oVar2 = bVar.f4216k) != null) {
            oVar2.d("dev.fluttercommunity.plus/share/unavailable");
        }
        SharePlusPendingIntent.f2770a = StringUtils.EMPTY;
        atomicBoolean.set(false);
        bVar.f4216k = oVar;
        try {
            if (!a2.h.a((String) cVar.f6l, "share")) {
                oVar.b();
                return;
            }
            O o2 = (O) this.f2599l;
            a2.h.b(obj);
            o2.f((Map) obj);
        } catch (Throwable th) {
            bVar.f4217l.set(true);
            bVar.f4216k = null;
            oVar.a("Share failed", th.getMessage(), th);
        }
    }

    @Override // io.flutter.plugin.platform.k
    public View l(int i3) {
        r rVar = (r) this.f2600m;
        return rVar.l(i3) != null ? rVar.l(i3) : ((s) this.f2599l).l(i3);
    }

    @Override // B1.n
    public void m(int i3) {
        r rVar = (r) this.f2600m;
        if (rVar.l(i3) != null) {
            rVar.f3207A.m(i3);
        } else {
            ((s) this.f2599l).f3227G.m(i3);
        }
    }

    @Override // B1.n
    public void n(B1.k kVar) {
        ((s) this.f2599l).f3227G.n(kVar);
    }

    @Override // io.flutter.plugin.platform.k
    public void o() {
        ((s) this.f2599l).o();
        ((r) this.f2600m).o();
    }

    @Override // B1.n
    public void p(int i3) {
        r rVar = (r) this.f2600m;
        if (rVar.l(i3) != null) {
            rVar.f3207A.p(i3);
        } else {
            ((s) this.f2599l).f3227G.p(i3);
        }
    }

    @Override // B1.n
    public void q(B1.k kVar) {
        r rVar = (r) ((r) this.f2600m).f3207A.f3201l;
        io.flutter.plugin.platform.o oVar = rVar.f3208k;
        String str = kVar.f104b;
        int i3 = kVar.f103a;
        C0073w c0073w = (C0073w) ((HashMap) oVar.f3201l).get(str);
        if (c0073w == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = kVar.f111i;
        io.flutter.plugin.platform.g gVarA = c0073w.a(byteBuffer != null ? c0073w.f1166a.b(byteBuffer) : null);
        View view = gVarA.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(kVar.f109g);
        rVar.f3215s.put(i3, gVarA);
    }

    @Override // B1.n
    public boolean r() {
        FlutterJNI flutterJNI = ((r) this.f2600m).f3211o;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }

    public void s() {
        F0.b bVar;
        ImageView imageView = (ImageView) this.f2599l;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Rect rect = B.f3577a;
        }
        if (drawable == null || (bVar = (F0.b) this.f2600m) == null) {
            return;
        }
        C0237o.c(drawable, bVar, imageView.getDrawableState());
    }

    public void t(String str, PrintWriter printWriter) {
        p014f0.b bVar = (p014f0.b) this.f2600m;
        if (bVar.f2813b.f4212m <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i3 = 0;
        while (true) {
            p042o.k kVar = bVar.f2813b;
            if (i3 >= kVar.f4212m) {
                return;
            }
            p014f0.a aVar = (p014f0.a) kVar.f4211l[i3];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(bVar.f2813b.f4210k[i3]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(aVar.f2810l);
            H0.d dVar = aVar.f2810l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.f427a);
            if (dVar.f428b || dVar.f431e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.f428b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.f431e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.f429c || dVar.f430d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.f429c);
                printWriter.print(" mReset=");
                printWriter.println(dVar.f430d);
            }
            if (dVar.f433g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.f433g);
                printWriter.print(" waiting=");
                dVar.f433g.getClass();
                printWriter.println(false);
            }
            if (dVar.f434h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar.f434h);
                printWriter.print(" waiting=");
                dVar.f434h.getClass();
                printWriter.println(false);
            }
            if (aVar.n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.n);
                E e3 = aVar.n;
                e3.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(e3.f922l);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            H0.d dVar2 = aVar.f2810l;
            Object obj = aVar.f2179e;
            Object obj2 = obj != z.f2174k ? obj : null;
            dVar2.getClass();
            StringBuilder sb = new StringBuilder(64);
            if (obj2 == null) {
                sb.append("null");
            } else {
                Class<?> cls = obj2.getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}");
            }
            printWriter.println(sb.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.f2177c > 0);
            i3++;
        }
    }

    public String toString() {
        switch (this.f2598k) {
            case 2:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((InterfaceC0144s) this.f2599l).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public View u(int i3, int i4, int i5, int i6) {
        p035l0.K k3 = (p035l0.K) this.f2600m;
        L l3 = (L) this.f2599l;
        int iO = l3.o();
        int iF = l3.f();
        int i7 = i4 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i4) {
            View viewN = l3.n(i3);
            int i8 = l3.i(viewN);
            int iQ = l3.q(viewN);
            k3.f3950b = iO;
            k3.f3951c = iF;
            k3.f3952d = i8;
            k3.f3953e = iQ;
            if (i5 != 0) {
                k3.f3949a = i5;
                if (k3.a()) {
                    return viewN;
                }
            }
            if (i6 != 0) {
                k3.f3949a = i6;
                if (k3.a()) {
                    view = viewN;
                }
            }
            i3 += i7;
        }
        return view;
    }

    public void w(int i3) {
        int resourceId;
        ImageView imageView = (ImageView) this.f2599l;
        Context context = imageView.getContext();
        int[] iArr = p013f.a.f2793e;
        A0.j jVarF = A0.j.F(context, null, iArr, i3);
        TypedArray typedArray = (TypedArray) jVarF.f58m;
        G.b(imageView, imageView.getContext(), iArr, null, (TypedArray) jVarF.f58m, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = p017g.a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = B.f3577a;
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(jVarF.x(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(B.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            jVarF.J();
        }
    }

    public MotionEvent x(p052r1.z zVar) {
        long j3 = zVar.f4434a;
        LongSparseArray longSparseArray = (LongSparseArray) this.f2599l;
        PriorityQueue priorityQueue = (PriorityQueue) this.f2600m;
        while (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() < j3) {
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j3) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j3);
        longSparseArray.remove(j3);
        return motionEvent;
    }

    public void y() {
        Integer num;
        p002b.j jVar = (p002b.j) this.f2599l;
        String str = (String) this.f2600m;
        Bundle bundle = jVar.f2306g;
        LinkedHashMap linkedHashMap = jVar.f2305f;
        a2.h.e(str, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        if (!jVar.f2303d.contains(str) && (num = (Integer) jVar.f2301b.remove(str)) != null) {
            jVar.f2300a.remove(num);
        }
        jVar.f2304e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((p007d.b) H2.h.p(bundle, str, p007d.b.class)));
            bundle.remove(str);
        }
        if (jVar.f2302c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public /* synthetic */ Q(Object obj, Object obj2, int i3) {
        this.f2598k = i3;
        this.f2599l = obj;
        this.f2600m = obj2;
    }

    public Q(O o2, b bVar) {
        this.f2598k = 11;
        a2.h.e(bVar, "manager");
        this.f2599l = o2;
        this.f2600m = bVar;
    }

    public Q(i iVar) {
        this.f2598k = 12;
        this.f2600m = new t();
        this.f2599l = iVar;
    }

    public Q(p002b.j jVar, String str, E2.a aVar) {
        this.f2598k = 1;
        this.f2599l = jVar;
        this.f2600m = str;
    }

    public Q(View view, InputMethodManager inputMethodManager, i iVar) {
        this.f2598k = 3;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f2600m = view;
        this.f2599l = inputMethodManager;
        iVar.f443l = this;
    }

    public Q(p064x0.b bVar) {
        this.f2598k = 16;
        Q q3 = new Q(15);
        this.f2599l = bVar;
        this.f2600m = q3;
    }

    public Q(InterfaceC0144s interfaceC0144s, S s3) {
        this.f2598k = 2;
        this.f2599l = interfaceC0144s;
        a2.h.e(s3, "store");
        p008d0.a aVar = p008d0.a.f2768b;
        a2.h.e(aVar, "defaultCreationExtras");
        A0.j jVar = new A0.j(s3, p014f0.b.f2812d, aVar);
        a2.e eVarA = p.a(p014f0.b.class);
        String strB = eVarA.b();
        if (strB != null) {
            this.f2600m = (p014f0.b) jVar.C(eVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public Q(ImageView imageView) {
        this.f2598k = 5;
        this.f2599l = imageView;
    }

    public Q(int i3) {
        this.f2598k = i3;
        switch (i3) {
            case 15:
                this.f2599l = new ReentrantLock();
                this.f2600m = new LinkedHashMap();
                break;
            default:
                this.f2599l = new LongSparseArray();
                this.f2600m = new PriorityQueue();
                break;
        }
    }

    public Q(L l3) {
        this.f2598k = 7;
        this.f2599l = l3;
        p035l0.K k3 = new p035l0.K();
        k3.f3949a = 0;
        this.f2600m = k3;
    }
}
