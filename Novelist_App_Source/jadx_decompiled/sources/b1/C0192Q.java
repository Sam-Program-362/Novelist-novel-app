package b1;

import M1.C0073w;
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
import androidx.lifecycle.InterfaceC0146s;
import d.C0227b;
import d0.C0230a;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import f.AbstractC0243a;
import f0.C0244a;
import f0.C0245b;
import g.AbstractC0250a;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import k.AbstractC0336B;
import k.C0352o;
import l0.C0388K;
import l0.InterfaceC0389L;
import o1.C0442b;
import org.apache.tika.metadata.ClimateForcast;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import x0.C0492b;

/* renamed from: b1.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192Q implements io.flutter.plugin.platform.k, B1.n, l2.d, C1.m, r1.u, x0.h {
    public static C0192Q n;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2598k;

    /* renamed from: l, reason: collision with root package name */
    public Object f2599l;

    /* renamed from: m, reason: collision with root package name */
    public Object f2600m;

    public /* synthetic */ C0192Q(int i3, boolean z3) {
        this.f2598k = i3;
    }

    public static C0192Q v(InterfaceC0146s interfaceC0146s) {
        return new C0192Q(interfaceC0146s, ((androidx.lifecycle.T) interfaceC0146s).f());
    }

    @Override // B1.n
    public void a(boolean z3) {
        ((io.flutter.plugin.platform.s) ((io.flutter.plugin.platform.s) this.f2599l).f3227G.f3201l).f3222B = z3;
    }

    @Override // r1.u
    public void b(KeyEvent keyEvent, M0.E e3) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            e3.a(false);
            return;
        }
        Character a3 = ((r1.t) this.f2600m).a(keyEvent.getUnicodeChar());
        boolean z3 = action != 0;
        H0.i iVar = (H0.i) this.f2599l;
        M1.K k3 = new M1.K(e3, 13);
        B1.s sVar = (B1.s) iVar.f443l;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z3 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a3.toString());
        hashMap.put(ClimateForcast.SOURCE, Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        sVar.x(hashMap, new B1.d(k3, 0));
    }

    @Override // io.flutter.plugin.platform.k
    public void c(io.flutter.view.i iVar) {
        ((io.flutter.plugin.platform.s) this.f2599l).f3235s.f3166a = iVar;
        ((io.flutter.plugin.platform.r) this.f2600m).f3214r.f3166a = iVar;
    }

    @Override // B1.n
    public void d(int i3, double d3, double d4) {
        if (((io.flutter.plugin.platform.r) this.f2600m).l(i3) != null) {
            return;
        }
        ((io.flutter.plugin.platform.s) this.f2599l).f3227G.d(i3, d3, d4);
    }

    @Override // B1.n
    public void e(B1.m mVar, B1.d dVar) {
        if (((io.flutter.plugin.platform.r) this.f2600m).l(mVar.f127a) != null) {
            return;
        }
        ((io.flutter.plugin.platform.s) this.f2599l).f3227G.e(mVar, dVar);
    }

    @Override // B1.n
    public void f(int i3, int i4) {
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) this.f2600m;
        if (rVar.l(i3) != null) {
            rVar.f3207A.f(i3, i4);
        } else {
            ((io.flutter.plugin.platform.s) this.f2599l).f3227G.f(i3, i4);
        }
    }

    @Override // io.flutter.plugin.platform.k
    public boolean g(int i3) {
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) this.f2600m;
        if (rVar.l(i3) == null) {
            return ((io.flutter.plugin.platform.s) this.f2599l).g(i3);
        }
        rVar.getClass();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    @Override // l2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(l2.e r7, R1.c r8) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0192Q.h(l2.e, R1.c):java.lang.Object");
    }

    @Override // B1.n
    public void i(B1.l lVar) {
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) this.f2600m;
        if (rVar.l(lVar.f112a) != null) {
            rVar.f3207A.i(lVar);
        } else {
            ((io.flutter.plugin.platform.s) this.f2599l).f3227G.i(lVar);
        }
    }

    @Override // B1.n
    public long j(B1.k kVar) {
        return ((io.flutter.plugin.platform.s) this.f2599l).f3227G.j(kVar);
    }

    @Override // C1.m
    public void k(A.c cVar, B1.o oVar) {
        C0442b c0442b = (C0442b) this.f2600m;
        a2.h.e(cVar, "call");
        Object obj = cVar.f7m;
        if (!(obj instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
        c0442b.getClass();
        AtomicBoolean atomicBoolean = c0442b.f4217l;
        if (atomicBoolean.compareAndSet(true, false)) {
            SharePlusPendingIntent.f2770a = StringUtils.EMPTY;
            atomicBoolean.set(false);
            c0442b.f4216k = oVar;
        } else {
            B1.o oVar2 = c0442b.f4216k;
            if (oVar2 != null) {
                oVar2.d("dev.fluttercommunity.plus/share/unavailable");
            }
            SharePlusPendingIntent.f2770a = StringUtils.EMPTY;
            atomicBoolean.set(false);
            c0442b.f4216k = oVar;
        }
        try {
            if (!a2.h.a((String) cVar.f6l, "share")) {
                oVar.b();
                return;
            }
            M1.O o2 = (M1.O) this.f2599l;
            a2.h.b(obj);
            o2.f((Map) obj);
        } catch (Throwable th) {
            c0442b.f4217l.set(true);
            c0442b.f4216k = null;
            oVar.a("Share failed", th.getMessage(), th);
        }
    }

    @Override // io.flutter.plugin.platform.k
    public View l(int i3) {
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) this.f2600m;
        return rVar.l(i3) != null ? rVar.l(i3) : ((io.flutter.plugin.platform.s) this.f2599l).l(i3);
    }

    @Override // B1.n
    public void m(int i3) {
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) this.f2600m;
        if (rVar.l(i3) != null) {
            rVar.f3207A.m(i3);
        } else {
            ((io.flutter.plugin.platform.s) this.f2599l).f3227G.m(i3);
        }
    }

    @Override // B1.n
    public void n(B1.k kVar) {
        ((io.flutter.plugin.platform.s) this.f2599l).f3227G.n(kVar);
    }

    @Override // io.flutter.plugin.platform.k
    public void o() {
        ((io.flutter.plugin.platform.s) this.f2599l).o();
        ((io.flutter.plugin.platform.r) this.f2600m).o();
    }

    @Override // B1.n
    public void p(int i3) {
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) this.f2600m;
        if (rVar.l(i3) != null) {
            rVar.f3207A.p(i3);
        } else {
            ((io.flutter.plugin.platform.s) this.f2599l).f3227G.p(i3);
        }
    }

    @Override // B1.n
    public void q(B1.k kVar) {
        io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) ((io.flutter.plugin.platform.r) this.f2600m).f3207A.f3201l;
        io.flutter.plugin.platform.o oVar = rVar.f3208k;
        String str = kVar.f104b;
        int i3 = kVar.f103a;
        C0073w c0073w = (C0073w) ((HashMap) oVar.f3201l).get(str);
        if (c0073w == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = kVar.f111i;
        io.flutter.plugin.platform.g a3 = c0073w.a(byteBuffer != null ? c0073w.f1166a.b(byteBuffer) : null);
        View view = a3.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(kVar.f109g);
        rVar.f3215s.put(i3, a3);
    }

    @Override // B1.n
    public boolean r() {
        FlutterJNI flutterJNI = ((io.flutter.plugin.platform.r) this.f2600m).f3211o;
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
            Rect rect = AbstractC0336B.f3577a;
        }
        if (drawable == null || (bVar = (F0.b) this.f2600m) == null) {
            return;
        }
        C0352o.c(drawable, bVar, imageView.getDrawableState());
    }

    public void t(String str, PrintWriter printWriter) {
        C0245b c0245b = (C0245b) this.f2600m;
        if (c0245b.f2813b.f4212m <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i3 = 0;
        while (true) {
            o.k kVar = c0245b.f2813b;
            if (i3 >= kVar.f4212m) {
                return;
            }
            C0244a c0244a = (C0244a) kVar.f4211l[i3];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0245b.f2813b.f4210k[i3]);
            printWriter.print(": ");
            printWriter.println(c0244a.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(c0244a.f2810l);
            H0.d dVar = c0244a.f2810l;
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
            if (c0244a.n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(c0244a.n);
                M0.E e3 = c0244a.n;
                e3.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(e3.f922l);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            H0.d dVar2 = c0244a.f2810l;
            Object obj = c0244a.f2179e;
            Object obj2 = obj != androidx.lifecycle.z.f2174k ? obj : null;
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
            printWriter.println(c0244a.f2177c > 0);
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
                Class<?> cls = ((InterfaceC0146s) this.f2599l).getClass();
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
        C0388K c0388k = (C0388K) this.f2600m;
        InterfaceC0389L interfaceC0389L = (InterfaceC0389L) this.f2599l;
        int o2 = interfaceC0389L.o();
        int f3 = interfaceC0389L.f();
        int i7 = i4 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i4) {
            View n3 = interfaceC0389L.n(i3);
            int i8 = interfaceC0389L.i(n3);
            int q3 = interfaceC0389L.q(n3);
            c0388k.f3950b = o2;
            c0388k.f3951c = f3;
            c0388k.f3952d = i8;
            c0388k.f3953e = q3;
            if (i5 != 0) {
                c0388k.f3949a = i5;
                if (c0388k.a()) {
                    return n3;
                }
            }
            if (i6 != 0) {
                c0388k.f3949a = i6;
                if (c0388k.a()) {
                    view = n3;
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
        int[] iArr = AbstractC0243a.f2793e;
        A0.j F3 = A0.j.F(context, null, iArr, i3);
        TypedArray typedArray = (TypedArray) F3.f58m;
        D.G.b(imageView, imageView.getContext(), iArr, null, (TypedArray) F3.f58m, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0250a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = AbstractC0336B.f3577a;
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(F3.x(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC0336B.c(typedArray.getInt(3, -1), null));
            }
            F3.J();
        } catch (Throwable th) {
            F3.J();
            throw th;
        }
    }

    public MotionEvent x(r1.z zVar) {
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
        b.j jVar = (b.j) this.f2599l;
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
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0227b) H2.h.p(bundle, str, C0227b.class)));
            bundle.remove(str);
        }
        if (jVar.f2302c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public /* synthetic */ C0192Q(Object obj, Object obj2, int i3) {
        this.f2598k = i3;
        this.f2599l = obj;
        this.f2600m = obj2;
    }

    public C0192Q(M1.O o2, C0442b c0442b) {
        this.f2598k = 11;
        a2.h.e(c0442b, "manager");
        this.f2599l = o2;
        this.f2600m = c0442b;
    }

    public C0192Q(H0.i iVar) {
        this.f2598k = 12;
        this.f2600m = new r1.t();
        this.f2599l = iVar;
    }

    public C0192Q(b.j jVar, String str, E2.a aVar) {
        this.f2598k = 1;
        this.f2599l = jVar;
        this.f2600m = str;
    }

    public C0192Q(View view, InputMethodManager inputMethodManager, H0.i iVar) {
        this.f2598k = 3;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f2600m = view;
        this.f2599l = inputMethodManager;
        iVar.f443l = this;
    }

    public C0192Q(C0492b c0492b) {
        this.f2598k = 16;
        C0192Q c0192q = new C0192Q(15);
        this.f2599l = c0492b;
        this.f2600m = c0192q;
    }

    public C0192Q(InterfaceC0146s interfaceC0146s, androidx.lifecycle.S s3) {
        this.f2598k = 2;
        this.f2599l = interfaceC0146s;
        a2.h.e(s3, "store");
        C0230a c0230a = C0230a.f2768b;
        a2.h.e(c0230a, "defaultCreationExtras");
        A0.j jVar = new A0.j(s3, C0245b.f2812d, c0230a);
        a2.e a3 = a2.p.a(C0245b.class);
        String b3 = a3.b();
        if (b3 != null) {
            this.f2600m = (C0245b) jVar.C(a3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b3));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C0192Q(ImageView imageView) {
        this.f2598k = 5;
        this.f2599l = imageView;
    }

    public C0192Q(int i3) {
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

    public C0192Q(InterfaceC0389L interfaceC0389L) {
        this.f2598k = 7;
        this.f2599l = interfaceC0389L;
        C0388K c0388k = new C0388K();
        c0388k.f3949a = 0;
        this.f2600m = c0388k;
    }
}
