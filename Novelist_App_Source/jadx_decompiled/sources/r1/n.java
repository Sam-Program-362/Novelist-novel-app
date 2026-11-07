package r1;

import D.AbstractC0005f;
import a.AbstractC0102a;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import b1.C0192Q;
import i2.AbstractC0303u;
import i2.I;
import i2.N;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import s1.C0467c;
import v0.C0488a;
import x0.C0492b;
import x0.C0493c;
import x0.C0497g;
import x1.C0498a;

/* loaded from: classes.dex */
public final class n extends FrameLayout implements E1.b, v {

    /* renamed from: A, reason: collision with root package name */
    public io.flutter.view.i f4387A;

    /* renamed from: B, reason: collision with root package name */
    public TextServicesManager f4388B;

    /* renamed from: C, reason: collision with root package name */
    public B1.a f4389C;

    /* renamed from: D, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f4390D;

    /* renamed from: E, reason: collision with root package name */
    public final B1.a f4391E;

    /* renamed from: F, reason: collision with root package name */
    public final T.a f4392F;

    /* renamed from: G, reason: collision with root package name */
    public final l f4393G;

    /* renamed from: H, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f4394H;

    /* renamed from: I, reason: collision with root package name */
    public k f4395I;

    /* renamed from: J, reason: collision with root package name */
    public int f4396J;

    /* renamed from: K, reason: collision with root package name */
    public int f4397K;

    /* renamed from: L, reason: collision with root package name */
    public o f4398L;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4399k;

    /* renamed from: l, reason: collision with root package name */
    public final C0461h f4400l;

    /* renamed from: m, reason: collision with root package name */
    public final j f4401m;
    public C0459f n;

    /* renamed from: o, reason: collision with root package name */
    public View f4402o;

    /* renamed from: p, reason: collision with root package name */
    public View f4403p;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f4404q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4405r;

    /* renamed from: s, reason: collision with root package name */
    public C0467c f4406s;

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f4407t;
    public A.c u;

    /* renamed from: v, reason: collision with root package name */
    public io.flutter.plugin.editing.j f4408v;

    /* renamed from: w, reason: collision with root package name */
    public io.flutter.plugin.editing.g f4409w;
    public D1.a x;
    public A0.j y;

    /* renamed from: z, reason: collision with root package name */
    public C0454a f4410z;

    public n(AbstractActivityC0455b abstractActivityC0455b, C0461h c0461h) {
        super(abstractActivityC0455b, null);
        this.f4399k = false;
        this.f4404q = new HashSet();
        this.f4407t = new HashSet();
        this.f4390D = new io.flutter.embedding.engine.renderer.j();
        this.f4391E = new B1.a(this, 23);
        this.f4392F = new T.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f4393G = new l(this);
        this.f4394H = new io.flutter.embedding.engine.renderer.a(this, 2);
        this.f4398L = new o();
        this.f4400l = c0461h;
        this.f4402o = c0461h;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void a() {
        Objects.toString(this.f4406s);
        if (c()) {
            Iterator it2 = this.f4407t.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.f4392F);
            io.flutter.plugin.platform.s sVar = this.f4406s.f4497s;
            SparseArray sparseArray = sVar.f3237v;
            SparseArray sparseArray2 = sVar.f3238w;
            SparseArray sparseArray3 = sVar.y;
            for (int i3 = 0; i3 < sparseArray3.size(); i3++) {
                sVar.n.removeView((io.flutter.plugin.platform.j) sparseArray3.valueAt(i3));
            }
            for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                sVar.n.removeView((C0498a) sparseArray2.valueAt(i4));
            }
            sVar.d();
            SparseArray sparseArray4 = sVar.x;
            if (sVar.n == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                for (int i5 = 0; i5 < sparseArray4.size(); i5++) {
                    sVar.n.removeView((View) sparseArray4.valueAt(i5));
                }
                sparseArray4.clear();
            }
            sVar.n = null;
            sVar.f3221A = false;
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                ((io.flutter.plugin.platform.g) sparseArray.valueAt(i6)).getClass();
            }
            io.flutter.plugin.platform.r rVar = this.f4406s.f4498t;
            SparseArray sparseArray5 = rVar.f3215s;
            SparseArray sparseArray6 = rVar.f3216t;
            for (int i7 = 0; i7 < sparseArray6.size(); i7++) {
                rVar.n.removeView((C0498a) sparseArray6.valueAt(i7));
            }
            Surface surface = rVar.x;
            if (surface != null) {
                surface.release();
                rVar.x = null;
                rVar.y = null;
            }
            rVar.n = null;
            for (int i8 = 0; i8 < sparseArray5.size(); i8++) {
                ((io.flutter.plugin.platform.g) sparseArray5.valueAt(i8)).getClass();
            }
            this.f4406s.f4497s.o();
            this.f4406s.f4498t.o();
            io.flutter.view.i iVar = this.f4387A;
            iVar.u = true;
            iVar.f3348e.o();
            iVar.f3361s = null;
            AccessibilityManager accessibilityManager = iVar.f3346c;
            accessibilityManager.removeAccessibilityStateChangeListener(iVar.f3363v);
            accessibilityManager.removeTouchExplorationStateChangeListener(iVar.f3364w);
            iVar.f3349f.unregisterContentObserver(iVar.x);
            A0.j jVar = iVar.f3345b;
            jVar.n = null;
            ((FlutterJNI) jVar.f58m).setAccessibilityDelegate(null);
            this.f4387A = null;
            this.f4408v.f3137b.restartInput(this);
            this.f4408v.c();
            int size = ((HashSet) this.y.f58m).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.g gVar = this.f4409w;
            if (gVar != null) {
                gVar.f3124a.f80l = null;
                SpellCheckerSession spellCheckerSession = gVar.f3126c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            A.c cVar = this.u;
            if (cVar != null) {
                ((B1.a) cVar.f7m).f80l = null;
            }
            io.flutter.embedding.engine.renderer.k kVar = this.f4406s.f4481b;
            this.f4405r = false;
            kVar.g(this.f4394H);
            FlutterJNI flutterJNI = kVar.f3083a;
            if (this.f4399k) {
                flutterJNI.removeResizingFlutterUiListener(this.f4393G);
            }
            kVar.j();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.f4403p;
            if (view != null && this.f4402o == this.n) {
                this.f4402o = view;
            }
            this.f4402o.a();
            C0459f c0459f = this.n;
            if (c0459f != null) {
                c0459f.f4365k.close();
                removeView(this.n);
                this.n = null;
            }
            this.f4403p = null;
            this.f4406s = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        B1.t tVar;
        B1.s sVar;
        B1.s sVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.j jVar = this.f4408v;
        if (jVar == null || Build.VERSION.SDK_INT < 26 || (tVar = jVar.f3141f) == null || jVar.f3142g == null || (sVar = tVar.f156j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            B1.t tVar2 = (B1.t) jVar.f3142g.get(sparseArray.keyAt(i3));
            if (tVar2 != null && (sVar2 = tVar2.f156j) != null) {
                String str = (String) sVar2.f144k;
                textValue = B.a.g(sparseArray.valueAt(i3)).getTextValue();
                String charSequence = textValue.toString();
                B1.v vVar = new B1.v(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (str.equals((String) sVar.f144k)) {
                    jVar.f3143h.f(vVar);
                } else {
                    hashMap.put(str, vVar);
                }
            }
        }
        A.c cVar = jVar.f3139d;
        int i4 = jVar.f3140e.f253c;
        cVar.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            B1.v vVar2 = (B1.v) entry.getValue();
            hashMap2.put((String) entry.getKey(), A.c.j(vVar2.f163a, vVar2.f164b, vVar2.f165c, -1, -1));
        }
        ((B1.s) cVar.f6l).s("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i4), hashMap2), null);
    }

    public final void b() {
        C0461h c0461h = this.f4400l;
        if (c0461h != null) {
            addView(c0461h);
        } else {
            j jVar = this.f4401m;
            if (jVar != null) {
                addView(jVar);
            } else {
                addView(this.n);
            }
        }
        this.f4399k = E2.a.A(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final boolean c() {
        C0467c c0467c = this.f4406s;
        return c0467c != null && c0467c.f4481b == this.f4402o.getAttachedRenderer();
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        C0467c c0467c = this.f4406s;
        if (c0467c == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap hashMap = c0467c.f4497s.u;
        if (view == null || !hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.n.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.y.D(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f3 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.j jVar = this.f4390D;
        jVar.f3061a = f3;
        jVar.f3079t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.k kVar = this.f4406s.f4481b;
        kVar.getClass();
        int i3 = jVar.f3062b;
        ArrayList arrayList = jVar.f3082z;
        ArrayList arrayList2 = jVar.y;
        if (i3 == 0) {
            int i4 = jVar.f3064d;
            int i5 = jVar.f3065e;
            if (i4 <= 0 && i5 <= 0) {
                return;
            }
        } else {
            int i6 = jVar.f3063c;
            if (i6 == 0) {
                int i7 = jVar.f3066f;
                int i8 = jVar.f3067g;
                if (i7 <= 0 && i8 <= 0) {
                    return;
                }
            } else if (i3 <= 0 || i6 <= 0 || jVar.f3061a <= 0.0f) {
                return;
            }
        }
        arrayList2.size();
        arrayList.size();
        int size = arrayList.size() + arrayList2.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            io.flutter.embedding.engine.renderer.b bVar = (io.flutter.embedding.engine.renderer.b) arrayList2.get(i9);
            int i10 = i9 * 4;
            Rect rect = bVar.f3041a;
            iArr[i10] = rect.left;
            iArr[i10 + 1] = rect.top;
            iArr[i10 + 2] = rect.right;
            iArr[i10 + 3] = rect.bottom;
            iArr2[i9] = X.j.a(bVar.f3042b);
            iArr3[i9] = X.j.a(bVar.f3043c);
        }
        int size2 = arrayList2.size() * 4;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            io.flutter.embedding.engine.renderer.b bVar2 = (io.flutter.embedding.engine.renderer.b) arrayList.get(i11);
            int i12 = (i11 * 4) + size2;
            Rect rect2 = bVar2.f3041a;
            iArr[i12] = rect2.left;
            iArr[i12 + 1] = rect2.top;
            iArr[i12 + 2] = rect2.right;
            iArr[i12 + 3] = rect2.bottom;
            iArr2[arrayList2.size() + i11] = X.j.a(bVar2.f3042b);
            iArr3[arrayList2.size() + i11] = X.j.a(bVar2.f3043c);
        }
        kVar.f3083a.setViewportMetrics(jVar.f3061a, jVar.f3062b, jVar.f3063c, jVar.f3068h, jVar.f3069i, jVar.f3070j, jVar.f3071k, jVar.f3072l, jVar.f3073m, jVar.n, jVar.f3074o, jVar.f3075p, jVar.f3076q, jVar.f3077r, jVar.f3078s, jVar.f3079t, iArr, iArr2, iArr3, jVar.f3064d, jVar.f3065e, jVar.f3066f, jVar.f3067g, jVar.u, jVar.f3080v, jVar.f3081w, jVar.x);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.i iVar = this.f4387A;
        if (iVar == null || !iVar.f3346c.isEnabled()) {
            return null;
        }
        return this.f4387A;
    }

    public C0467c getAttachedFlutterEngine() {
        return this.f4406s;
    }

    public C1.f getBinaryMessenger() {
        return this.f4406s.f4482c;
    }

    public C0459f getCurrentImageSurface() {
        return this.n;
    }

    public io.flutter.embedding.engine.renderer.j getViewportMetrics() {
        return this.f4390D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01b6, code lost:
    
        r3 = r18.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r18) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.n.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [l2.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        B1.a aVar;
        super.onAttachedToWindow();
        try {
            C0497g c0497g = x0.h.f4702j;
            Context context = getContext();
            c0497g.getClass();
            aVar = new B1.a(new C0192Q(C0497g.a(context)), 24);
        } catch (NoClassDefFoundError unused) {
            aVar = null;
        }
        this.f4389C = aVar;
        Activity w3 = AbstractC0102a.w(getContext());
        B1.a aVar2 = this.f4389C;
        if (aVar2 == null || w3 == null) {
            return;
        }
        this.f4395I = new k(this, 0);
        Context context2 = getContext();
        Executor d3 = Build.VERSION.SDK_INT >= 28 ? AbstractC0005f.d(context2) : new A.p(new Handler(context2.getMainLooper()), 2);
        k kVar = this.f4395I;
        C0192Q c0192q = (C0192Q) aVar2.f80l;
        a2.h.e(d3, "executor");
        a2.h.e(kVar, "consumer");
        C0192Q c0192q2 = (C0192Q) c0192q.f2600m;
        C0492b c0492b = (C0492b) c0192q.f2599l;
        c0492b.getClass();
        x0.i iVar = new x0.i(c0492b, w3, null);
        k2.a aVar3 = k2.a.f3867k;
        R1.i iVar2 = R1.i.f1255k;
        l2.c cVar = new l2.c(iVar, iVar2, -2, aVar3);
        p2.e eVar = i2.A.f2964a;
        j2.c cVar2 = n2.n.f4173a;
        if (cVar2.e(i2.r.f3022l) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        l2.c cVar3 = cVar;
        if (!cVar2.equals(iVar2)) {
            cVar3 = m2.k.a(cVar, cVar2, 0, null, 6);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0192q2.f2600m;
        ReentrantLock reentrantLock = (ReentrantLock) c0192q2.f2599l;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(kVar) == null) {
                linkedHashMap.put(kVar, AbstractC0303u.g(AbstractC0303u.a(new I(d3)), new C0488a(cVar3, kVar, null)));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f4406s != null) {
            this.x.b(configuration);
            d();
            AbstractC0102a.k(getContext(), this.f4406s);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r2.f162c != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r17) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.n.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        k kVar;
        B1.a aVar = this.f4389C;
        if (aVar != null && (kVar = this.f4395I) != null) {
            C0192Q c0192q = (C0192Q) ((C0192Q) aVar.f80l).f2600m;
            LinkedHashMap linkedHashMap = (LinkedHashMap) c0192q.f2600m;
            ReentrantLock reentrantLock = (ReentrantLock) c0192q.f2599l;
            reentrantLock.lock();
            try {
                N n = (N) linkedHashMap.get(kVar);
                if (n != null) {
                    n.b(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f4395I = null;
        this.f4389C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0454a c0454a = this.f4410z;
            Context context = getContext();
            c0454a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z3 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z3) {
                int b3 = C0454a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0454a.a(motionEvent, motionEvent.getActionIndex(), b3, 0, C0454a.f4341f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0454a.f4342a.f3083a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f4387A.f(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        this.f4396J = View.MeasureSpec.getMode(i3);
        this.f4397K = View.MeasureSpec.getMode(i4);
        super.onMeasure(i3, i4);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i3);
        io.flutter.plugin.editing.j jVar = this.f4408v;
        if (jVar == null || Build.VERSION.SDK_INT < 26 || jVar.f3142g == null) {
            return;
        }
        String str = (String) jVar.f3141f.f156j.f144k;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i4 = 0; i4 < jVar.f3142g.size(); i4++) {
            int keyAt = jVar.f3142g.keyAt(i4);
            B1.s sVar = ((B1.t) jVar.f3142g.valueAt(i4)).f156j;
            if (sVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i4);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = (String[]) sVar.f146m;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = (String) sVar.f145l;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = jVar.f3148m) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    newChild.setAutofillValue(AutofillValue.forText(((B1.v) sVar.n).f163a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), jVar.f3148m.height());
                    newChild.setAutofillValue(AutofillValue.forText(jVar.f3143h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        io.flutter.embedding.engine.renderer.j jVar = this.f4390D;
        jVar.f3062b = i3;
        jVar.f3063c = i4;
        boolean z3 = this.f4399k;
        if (z3 && this.f4397K == 0) {
            jVar.f3066f = 0;
            jVar.f3067g = 8192;
        } else {
            jVar.f3066f = i4;
            jVar.f3067g = i4;
        }
        if (z3 && this.f4396J == 0) {
            jVar.f3064d = 0;
            jVar.f3065e = 8192;
        } else {
            jVar.f3064d = i3;
            jVar.f3065e = i3;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f4410z.d(motionEvent, C0454a.f4341f);
        return true;
    }

    public void setDelegate(o oVar) {
        this.f4398L = oVar;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        View view = this.f4402o;
        if (view instanceof C0461h) {
            ((C0461h) view).setVisibility(i3);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(x0.j jVar) {
        C0492b c0492b = C0492b.n;
        ?? r9 = jVar.f4707a;
        ArrayList arrayList = new ArrayList();
        for (C0493c c0493c : r9) {
            c0493c.f4690a.a().toString();
            u0.b bVar = c0493c.f4690a;
            int i3 = 2;
            int i4 = ((bVar.f4587c - bVar.f4585a == 0 || bVar.f4588d - bVar.f4586b == 0) ? C0492b.f4683m : c0492b) == c0492b ? 3 : 2;
            C0492b c0492b2 = c0493c.f4692c;
            if (c0492b2 != C0492b.f4684o) {
                i3 = c0492b2 == C0492b.f4685p ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.b(bVar.a(), i4, i3));
        }
        ArrayList arrayList2 = this.f4390D.y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public n(AbstractActivityC0455b abstractActivityC0455b, j jVar) {
        super(abstractActivityC0455b, null);
        this.f4399k = false;
        this.f4404q = new HashSet();
        this.f4407t = new HashSet();
        this.f4390D = new io.flutter.embedding.engine.renderer.j();
        this.f4391E = new B1.a(this, 23);
        this.f4392F = new T.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f4393G = new l(this);
        this.f4394H = new io.flutter.embedding.engine.renderer.a(this, 2);
        this.f4398L = new o();
        this.f4401m = jVar;
        this.f4402o = jVar;
        b();
    }
}
