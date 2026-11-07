package p052r1;

import A.p;
import B1.a;
import B1.q;
import B1.t;
import B1.u;
import B1.v;
import C1.f;
import D.AbstractC0005f;
import D.C0013n;
import E1.b;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.text.Selection;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import i2.A;
import i2.AbstractC0212u;
import i2.I;
import i2.N;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.editing.g;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;
import io.flutter.view.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import l2.d;
import p004b1.Q;
import p054s1.c;
import p064x0.h;
import p2.e;

/* JADX INFO: loaded from: classes.dex */
public final class n extends FrameLayout implements b, v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public i f4387A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextServicesManager f4388B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public a f4389C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final j f4390D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final a f4391E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final T.a f4392F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final l f4393G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f4394H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public k f4395I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f4396J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f4397K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public o f4398L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f4400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f4401m;
    public f n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f4402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f4403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashSet f4404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f4406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f4407t;
    public A.c u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public io.flutter.plugin.editing.j f4408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f4409w;
    public D1.a x;
    public A0.j y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0261a f4410z;

    public n(AbstractActivityC0262b abstractActivityC0262b, h hVar) {
        super(abstractActivityC0262b, null);
        this.f4399k = false;
        this.f4404q = new HashSet();
        this.f4407t = new HashSet();
        this.f4390D = new j();
        this.f4391E = new a(this, 23);
        this.f4392F = new T.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f4393G = new l(this);
        this.f4394H = new io.flutter.embedding.engine.renderer.a(this, 2);
        this.f4398L = new o();
        this.f4400l = hVar;
        this.f4402o = hVar;
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
            s sVar = this.f4406s.f4497s;
            SparseArray sparseArray = sVar.f3237v;
            SparseArray sparseArray2 = sVar.f3238w;
            SparseArray sparseArray3 = sVar.y;
            for (int i3 = 0; i3 < sparseArray3.size(); i3++) {
                sVar.n.removeView((io.flutter.plugin.platform.j) sparseArray3.valueAt(i3));
            }
            for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                sVar.n.removeView((p065x1.a) sparseArray2.valueAt(i4));
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
            r rVar = this.f4406s.f4498t;
            SparseArray sparseArray5 = rVar.f3215s;
            SparseArray sparseArray6 = rVar.f3216t;
            for (int i7 = 0; i7 < sparseArray6.size(); i7++) {
                rVar.n.removeView((p065x1.a) sparseArray6.valueAt(i7));
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
            i iVar = this.f4387A;
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
            g gVar = this.f4409w;
            if (gVar != null) {
                gVar.f3124a.f80l = null;
                SpellCheckerSession spellCheckerSession = gVar.f3126c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            A.c cVar = this.u;
            if (cVar != null) {
                ((a) cVar.f7m).f80l = null;
            }
            k kVar = this.f4406s.f4481b;
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
            f fVar = this.n;
            if (fVar != null) {
                fVar.f4365k.close();
                removeView(this.n);
                this.n = null;
            }
            this.f4403p = null;
            this.f4406s = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        t tVar;
        B1.s sVar;
        B1.s sVar2;
        io.flutter.plugin.editing.j jVar = this.f4408v;
        if (jVar == null || Build.VERSION.SDK_INT < 26 || (tVar = jVar.f3141f) == null || jVar.f3142g == null || (sVar = tVar.f156j) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            t tVar2 = (t) jVar.f3142g.get(sparseArray.keyAt(i3));
            if (tVar2 != null && (sVar2 = tVar2.f156j) != null) {
                String str = (String) sVar2.f144k;
                String string = B.a.g(sparseArray.valueAt(i3)).getTextValue().toString();
                v vVar = new v(string, string.length(), string.length(), -1, -1);
                if (str.equals((String) sVar.f144k)) {
                    jVar.f3143h.f(vVar);
                } else {
                    map.put(str, vVar);
                }
            }
        }
        A.c cVar = jVar.f3139d;
        int i4 = jVar.f3140e.f253c;
        cVar.getClass();
        map.size();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            v vVar2 = (v) entry.getValue();
            map2.put((String) entry.getKey(), A.c.j(vVar2.f163a, vVar2.f164b, vVar2.f165c, -1, -1));
        }
        ((B1.s) cVar.f6l).s("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i4), map2), null);
    }

    public final void b() {
        h hVar = this.f4400l;
        if (hVar != null) {
            addView(hVar);
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
        c cVar = this.f4406s;
        return cVar != null && cVar.f4481b == this.f4402o.getAttachedRenderer();
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        c cVar = this.f4406s;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap map = cVar.f4497s.u;
        if (view == null || !map.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) map.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    public final void d() {
        boolean z3;
        String str;
        boolean z4;
        char c3 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f4388B;
        if (textServicesManager == null) {
            z3 = false;
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                Iterator it2 = textServicesManager.getEnabledSpellCheckerInfos().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z4 = false;
                        break;
                    } else if (((SpellCheckerInfo) it2.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z4 = true;
                        break;
                    }
                }
                if (!this.f4388B.isSpellCheckerEnabled() || !z4) {
                    z3 = false;
                }
            }
            z3 = true;
        }
        B1.r rVar = this.f4406s.f4493o;
        rVar.getClass();
        B1.s sVar = rVar.f143b;
        HashMap map = new HashMap();
        map.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        map.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z3));
        map.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
        map.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c3 == 1) {
            str = "light";
        } else {
            if (c3 != 2) {
                throw null;
            }
            str = "dark";
        }
        map.put("platformBrightness", str);
        Objects.toString(map.get("textScaleFactor"));
        Objects.toString(map.get("alwaysUse24HourFormat"));
        Objects.toString(map.get("platformBrightness"));
        if (Build.VERSION.SDK_INT < 34 || displayMetrics == null) {
            sVar.x(map, null);
            return;
        }
        q qVar = new q(displayMetrics);
        A0.j jVar = rVar.f142a;
        ((ConcurrentLinkedQueue) jVar.f57l).add(qVar);
        q qVar2 = (q) jVar.n;
        jVar.n = qVar;
        A.c cVar = qVar2 != null ? new A.c(jVar, qVar2, 7, false) : null;
        map.put("configurationId", Integer.valueOf(qVar.f140a));
        sVar.x(map, cVar);
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
        j jVar = this.f4390D;
        jVar.f3061a = f3;
        jVar.f3079t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        k kVar = this.f4406s.f4481b;
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
        i iVar = this.f4387A;
        if (iVar == null || !iVar.f3346c.isEnabled()) {
            return null;
        }
        return this.f4387A;
    }

    public c getAttachedFlutterEngine() {
        return this.f4406s;
    }

    public f getBinaryMessenger() {
        return this.f4406s.f4482c;
    }

    public f getCurrentImageSurface() {
        return this.n;
    }

    public j getViewportMetrics() {
        return this.f4390D;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x0187  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a4  */
    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c3;
        double d3;
        int systemWindowInsetLeft;
        int systemWindowInsetBottom;
        int i3;
        Window window;
        DisplayCutout displayCutout;
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i4 = Build.VERSION.SDK_INT;
        j jVar = this.f4390D;
        if (i4 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            jVar.f3075p = systemGestureInsets.top;
            jVar.f3076q = systemGestureInsets.right;
            jVar.f3077r = systemGestureInsets.bottom;
            jVar.f3078s = systemGestureInsets.left;
        }
        boolean z3 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z4 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i4 >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
            jVar.f3068h = insets.top;
            jVar.f3069i = insets.right;
            jVar.f3070j = insets.bottom;
            jVar.f3071k = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            jVar.f3072l = insets2.top;
            jVar.f3073m = insets2.right;
            jVar.n = insets2.bottom;
            jVar.f3074o = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            jVar.f3075p = insets3.top;
            jVar.f3076q = insets3.right;
            jVar.f3077r = insets3.bottom;
            jVar.f3078s = insets3.left;
            DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                Insets waterfallInsets = displayCutout2.getWaterfallInsets();
                jVar.f3068h = Math.max(Math.max(jVar.f3068h, waterfallInsets.top), displayCutout2.getSafeInsetTop());
                jVar.f3069i = Math.max(Math.max(jVar.f3069i, waterfallInsets.right), displayCutout2.getSafeInsetRight());
                jVar.f3070j = Math.max(Math.max(jVar.f3070j, waterfallInsets.bottom), displayCutout2.getSafeInsetBottom());
                jVar.f3071k = Math.max(Math.max(jVar.f3071k, waterfallInsets.left), displayCutout2.getSafeInsetLeft());
            }
            i3 = 0;
        } else {
            if (z4) {
                c3 = 1;
            } else {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation != 2) {
                    c3 = 1;
                } else {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c3 = 3;
                    } else if (rotation == 3) {
                        c3 = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c3 = 4;
                    } else {
                        c3 = 1;
                    }
                }
            }
            jVar.f3068h = z3 ? windowInsets.getSystemWindowInsetTop() : 0;
            jVar.f3069i = (c3 == 3 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z4) {
                d3 = 0.18d;
                int systemWindowInsetBottom2 = ((((double) windowInsets.getSystemWindowInsetBottom()) > (((double) getRootView().getHeight()) * 0.18d) ? 1 : (((double) windowInsets.getSystemWindowInsetBottom()) == (((double) getRootView().getHeight()) * 0.18d) ? 0 : -1)) < 0 ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0 ? windowInsets.getSystemWindowInsetBottom() : 0;
                jVar.f3070j = systemWindowInsetBottom2;
                if (c3 != 2 || c3 == 4) {
                    systemWindowInsetLeft = 0;
                } else {
                    systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                }
                jVar.f3071k = systemWindowInsetLeft;
                jVar.f3072l = 0;
                jVar.f3073m = 0;
                if (windowInsets.getSystemWindowInsetBottom() < ((double) getRootView().getHeight()) * d3) {
                    systemWindowInsetBottom = 0;
                } else {
                    systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                }
                jVar.n = systemWindowInsetBottom;
                i3 = 0;
                jVar.f3074o = 0;
            } else {
                d3 = 0.18d;
            }
            jVar.f3070j = systemWindowInsetBottom2;
            if (c3 != 2) {
                systemWindowInsetLeft = 0;
            } else {
                systemWindowInsetLeft = 0;
            }
            jVar.f3071k = systemWindowInsetLeft;
            jVar.f3072l = 0;
            jVar.f3073m = 0;
            if (windowInsets.getSystemWindowInsetBottom() < ((double) getRootView().getHeight()) * d3) {
                systemWindowInsetBottom = 0;
            } else {
                systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            }
            jVar.n = systemWindowInsetBottom;
            i3 = 0;
            jVar.f3074o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i4 >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.b(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = jVar.f3082z;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            o oVar = this.f4398L;
            Context context2 = getContext();
            oVar.getClass();
            Activity activityW = p000a.a.w(context2);
            WindowInsets rootWindowInsets = null;
            if (activityW != null && (window = activityW.getWindow()) != null) {
                rootWindowInsets = window.getDecorView().getRootWindowInsets();
            }
            List boundingRects = rootWindowInsets == null ? Collections.EMPTY_LIST : rootWindowInsets.getBoundingRects(WindowInsets.Type.captionBar());
            int iMax = jVar.f3068h;
            Iterator it2 = boundingRects.iterator();
            while (it2.hasNext()) {
                iMax = Math.max(iMax, ((Rect) it2.next()).bottom);
            }
            jVar.f3068h = iMax;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            RoundedCorner roundedCorner = windowInsets.getRoundedCorner(0);
            RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(1);
            RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(2);
            RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(3);
            jVar.u = roundedCorner != null ? roundedCorner.getRadius() : i3;
            jVar.f3080v = roundedCorner2 != null ? roundedCorner2.getRadius() : i3;
            jVar.f3081w = roundedCorner3 != null ? roundedCorner3.getRadius() : i3;
            jVar.x = roundedCorner4 != null ? roundedCorner4.getRadius() : i3;
        }
        e();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a aVar;
        d dVarA;
        super.onAttachedToWindow();
        try {
            p064x0.g gVar = h.f4702j;
            Context context = getContext();
            gVar.getClass();
            aVar = new a(new Q(p064x0.g.a(context)), 24);
        } catch (NoClassDefFoundError unused) {
            aVar = null;
        }
        this.f4389C = aVar;
        Activity activityW = p000a.a.w(getContext());
        a aVar2 = this.f4389C;
        if (aVar2 == null || activityW == null) {
            return;
        }
        this.f4395I = new k(this, 0);
        Context context2 = getContext();
        Executor executorD = Build.VERSION.SDK_INT >= 28 ? AbstractC0005f.d(context2) : new p(new Handler(context2.getMainLooper()), 2);
        k kVar = this.f4395I;
        Q q3 = (Q) aVar2.f80l;
        a2.h.e(executorD, "executor");
        a2.h.e(kVar, "consumer");
        Q q4 = (Q) q3.f2600m;
        p064x0.b bVar = (p064x0.b) q3.f2599l;
        bVar.getClass();
        p064x0.i iVar = new p064x0.i(bVar, activityW, null);
        k2.a aVar3 = k2.a.f3867k;
        R1.i iVar2 = R1.i.f1255k;
        l2.c cVar = new l2.c(iVar, iVar2, -2, aVar3);
        e eVar = A.f2964a;
        j2.c cVar2 = n2.n.f4173a;
        if (cVar2.e(i2.r.f3022l) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        if (!cVar2.equals(iVar2)) {
            dVarA = cVar;
            dVarA = m2.k.a(cVar, cVar2, 0, null, 6);
        }
        dVarA = cVar;
        LinkedHashMap linkedHashMap = (LinkedHashMap) q4.f2600m;
        ReentrantLock reentrantLock = (ReentrantLock) q4.f2599l;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(kVar) == null) {
                linkedHashMap.put(kVar, AbstractC0212u.g(AbstractC0212u.a(new I(executorD)), new p061v0.a(dVarA, kVar, null)));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Exception {
        super.onConfigurationChanged(configuration);
        if (this.f4406s != null) {
            this.x.b(configuration);
            d();
            p000a.a.k(getContext(), this.f4406s);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060 A[PHI: r8
      0x0060: PHI (r8v15 int) = (r8v8 int), (r8v18 int) binds: [B:73:0x00bb, B:31:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i3;
        int i4;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.j jVar = this.f4408v;
        A0.j jVar2 = this.y;
        C0013n c0013n = jVar.f3140e;
        int i5 = c0013n.f252b;
        if (i5 == 1) {
            jVar.f3145j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (jVar.f3150p) {
                return jVar.f3145j;
            }
            InputConnection inputConnectionOnCreateInputConnection = jVar.f3146k.l(c0013n.f253c).onCreateInputConnection(editorInfo);
            jVar.f3145j = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        t tVar = jVar.f3141f;
        u uVar = tVar.f153g;
        boolean z3 = tVar.f147a;
        boolean z4 = tVar.f148b;
        boolean z5 = tVar.f149c;
        boolean z6 = tVar.f150d;
        int i7 = tVar.f152f;
        int i8 = uVar.f160a;
        if (i8 != 2) {
            if (i8 == 5) {
                i6 = uVar.f161b ? 4098 : 2;
                if (uVar.f162c) {
                    i6 |= 8192;
                }
            } else if (i8 == 6) {
                i6 = 3;
            } else if (i8 == 11) {
                i6 = 0;
            } else {
                if (i8 == 7) {
                    i3 = 131073;
                } else if (i8 == 8 || i8 == 13) {
                    i3 = 33;
                } else if (i8 == 9 || i8 == 12) {
                    i3 = 17;
                } else if (i8 == 10) {
                    i3 = 145;
                } else if (i8 == 3) {
                    i3 = 97;
                } else {
                    i3 = i8 == 4 ? 113 : 1;
                }
                if (z3) {
                    i4 = 524416;
                } else {
                    if (z4) {
                        i3 |= 32768;
                    }
                    if (z5) {
                        i6 = i3;
                        if (i7 == 1) {
                            i6 |= 4096;
                        } else if (i7 == 2) {
                            i6 |= 8192;
                        } else if (i7 == 3) {
                            i6 |= 16384;
                        }
                    } else {
                        i4 = 524432;
                    }
                }
                i3 |= i4;
                i6 = i3;
                if (i7 == 1) {
                    i6 |= 4096;
                } else if (i7 == 2) {
                    i6 |= 8192;
                } else if (i7 == 3) {
                    i6 |= 16384;
                }
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !z6) {
            editorInfo.imeOptions = 50331648;
        }
        int iIntValue = tVar.f154h.intValue();
        t tVar2 = jVar.f3141f;
        String str = tVar2.f155i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        if (tVar2.f159m != null) {
            editorInfo.hintLocales = new LocaleList(jVar.f3141f.f159m);
        }
        String[] strArr = jVar.f3141f.f157k;
        if (strArr != null) {
            if (i9 >= 25) {
                editorInfo.contentMimeTypes = strArr;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
            }
        }
        if (i9 >= 34) {
            if (i9 >= 35) {
                F.b.b(editorInfo);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar = new io.flutter.plugin.editing.c(this, jVar.f3140e.f253c, jVar.f3139d, jVar2, jVar.f3143h, editorInfo);
        io.flutter.plugin.editing.f fVar = jVar.f3143h;
        fVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = jVar.f3143h;
        fVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar2);
        jVar.f3145j = cVar;
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        k kVar;
        a aVar = this.f4389C;
        if (aVar != null && (kVar = this.f4395I) != null) {
            Q q3 = (Q) ((Q) aVar.f80l).f2600m;
            LinkedHashMap linkedHashMap = (LinkedHashMap) q3.f2600m;
            ReentrantLock reentrantLock = (ReentrantLock) q3.f2599l;
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
            C0261a c0261a = this.f4410z;
            Context context = getContext();
            c0261a.getClass();
            boolean zIsFromSource = motionEvent.isFromSource(2);
            boolean z3 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (zIsFromSource && z3) {
                int iB = C0261a.b(motionEvent.getActionMasked());
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0261a.a(motionEvent, motionEvent.getActionIndex(), iB, 0, C0261a.f4341f, byteBufferAllocateDirect, context);
                if (byteBufferAllocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0261a.f4342a.f3083a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
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
            int iKeyAt = jVar.f3142g.keyAt(i4);
            B1.s sVar = ((t) jVar.f3142g.valueAt(i4)).f156j;
            if (sVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure viewStructureNewChild = viewStructure.newChild(i4);
                viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                String[] strArr = (String[]) sVar.f146m;
                if (strArr.length > 0) {
                    viewStructureNewChild.setAutofillHints(strArr);
                }
                viewStructureNewChild.setAutofillType(1);
                viewStructureNewChild.setVisibility(0);
                String str2 = (String) sVar.f145l;
                if (str2 != null) {
                    viewStructureNewChild.setHint(str2);
                }
                if (str.hashCode() != iKeyAt || (rect = jVar.f3148m) == null) {
                    viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(((v) sVar.n).f163a));
                } else {
                    viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), jVar.f3148m.height());
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(jVar.f3143h));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        j jVar = this.f4390D;
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
        this.f4410z.d(motionEvent, C0261a.f4341f);
        return true;
    }

    public void setDelegate(o oVar) {
        this.f4398L = oVar;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        View view = this.f4402o;
        if (view instanceof h) {
            ((h) view).setVisibility(i3);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(p064x0.j jVar) {
        p064x0.b bVar = p064x0.b.n;
        ?? r9 = jVar.f4707a;
        ArrayList arrayList = new ArrayList();
        for (p064x0.c cVar : r9) {
            cVar.f4690a.a().toString();
            p058u0.b bVar2 = cVar.f4690a;
            int i3 = 2;
            int i4 = ((bVar2.f4587c - bVar2.f4585a == 0 || bVar2.f4588d - bVar2.f4586b == 0) ? p064x0.b.f4683m : bVar) == bVar ? 3 : 2;
            p064x0.b bVar3 = cVar.f4692c;
            if (bVar3 != p064x0.b.f4684o) {
                i3 = bVar3 == p064x0.b.f4685p ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.b(bVar2.a(), i4, i3));
        }
        ArrayList arrayList2 = this.f4390D.y;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public n(AbstractActivityC0262b abstractActivityC0262b, j jVar) {
        super(abstractActivityC0262b, null);
        this.f4399k = false;
        this.f4404q = new HashSet();
        this.f4407t = new HashSet();
        this.f4390D = new j();
        this.f4391E = new a(this, 23);
        this.f4392F = new T.a(this, new Handler(Looper.getMainLooper()), 2);
        this.f4393G = new l(this);
        this.f4394H = new io.flutter.embedding.engine.renderer.a(this, 2);
        this.f4398L = new o();
        this.f4401m = jVar;
        this.f4402o = jVar;
        b();
    }
}
