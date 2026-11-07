package A0;

import B1.s;
import C1.q;
import D.AbstractC0019u;
import K1.C0030f;
import K1.C0032h;
import K1.InterfaceC0031g;
import K1.L;
import K1.M;
import K1.N;
import K1.r;
import M0.E;
import M1.A;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.recyclerview.widget.RecyclerView;
import b.RunnableC0151d;
import b1.C0192Q;
import d0.AbstractC0231b;
import e0.C0239b;
import g.AbstractC0250a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import k.C0355s;
import l0.AbstractC0391a;
import l0.C0392b;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.xmlpull.v1.XmlPullParserException;
import q1.ThreadFactoryC0448a;
import r1.u;
import r1.v;
import t1.C0475c;
import t1.C0480h;
import v.AbstractC0487e;
import v.InterfaceC0483a;

/* loaded from: classes.dex */
public class j implements C1.d, InterfaceC0031g, l2.d, L1.e, C1.m {

    /* renamed from: o, reason: collision with root package name */
    public static j f55o;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f56k;

    /* renamed from: l, reason: collision with root package name */
    public Object f57l;

    /* renamed from: m, reason: collision with root package name */
    public Object f58m;
    public Object n;

    public /* synthetic */ j(int i3) {
        this.f56k = i3;
    }

    public static j E() {
        if (f55o == null) {
            A a3 = new A(29);
            ThreadFactoryC0448a threadFactoryC0448a = new ThreadFactoryC0448a();
            threadFactoryC0448a.f4310a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC0448a);
            FlutterJNI flutterJNI = new FlutterJNI();
            w1.c cVar = new w1.c();
            cVar.f4662a = false;
            cVar.f4663b = false;
            cVar.f4667f = flutterJNI;
            cVar.f4668g = newCachedThreadPool;
            j jVar = new j(18);
            jVar.f57l = cVar;
            jVar.f58m = a3;
            jVar.n = newCachedThreadPool;
            f55o = jVar;
        }
        return f55o;
    }

    public static j F(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new j(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public static Bundle v(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public View A(int i3) {
        return ((RecyclerView) ((B1.g) this.f57l).f90l).getChildAt(i3);
    }

    public int B() {
        return ((RecyclerView) ((B1.g) this.f57l).f90l).getChildCount();
    }

    public P C(a2.e eVar, String str) {
        P a3;
        Q q3 = (Q) this.f58m;
        a2.h.e(str, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        S s3 = (S) this.f57l;
        s3.getClass();
        LinkedHashMap linkedHashMap = s3.f2137a;
        P p3 = (P) linkedHashMap.get(str);
        if (eVar.d(p3)) {
            if (q3 instanceof O) {
                a2.h.b(p3);
            }
            a2.h.c(p3, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return p3;
        }
        d0.c cVar = new d0.c((AbstractC0231b) this.n);
        ((LinkedHashMap) cVar.f2769a).put(C0239b.f2780a, str);
        try {
            try {
                q3.getClass();
                a3 = q3.b(E2.a.t(eVar), cVar);
            } catch (AbstractMethodError unused) {
                a3 = q3.b(E2.a.t(eVar), cVar);
            }
        } catch (AbstractMethodError unused2) {
            a3 = q3.a(E2.a.t(eVar));
        }
        a2.h.e(a3, "viewModel");
        P p4 = (P) linkedHashMap.put(str, a3);
        if (p4 != null) {
            p4.a();
        }
        return a3;
    }

    public boolean D(KeyEvent keyEvent) {
        u[] uVarArr = (u[]) this.f57l;
        if (((HashSet) this.f58m).remove(keyEvent)) {
            return false;
        }
        if (uVarArr.length <= 0) {
            G(keyEvent);
            return true;
        }
        L0.k kVar = new L0.k();
        kVar.f813a = this;
        kVar.f815c = ((u[]) this.f57l).length;
        kVar.f814b = false;
        kVar.f816d = keyEvent;
        for (u uVar : uVarArr) {
            uVar.b(keyEvent, new E(kVar));
        }
        return true;
    }

    public void G(KeyEvent keyEvent) {
        InputConnection inputConnection;
        HashSet hashSet = (HashSet) this.f58m;
        v vVar = (v) this.n;
        if (vVar != null) {
            io.flutter.plugin.editing.j jVar = ((r1.n) vVar).f4408v;
            boolean z3 = false;
            if (jVar.f3137b.isAcceptingText() && (inputConnection = jVar.f3145j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.c) {
                    io.flutter.plugin.editing.c cVar = (io.flutter.plugin.editing.c) inputConnection;
                    io.flutter.plugin.editing.f fVar = cVar.f3103d;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            z3 = cVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            z3 = cVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            z3 = cVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            z3 = cVar.e(false, keyEvent.isShiftPressed());
                        } else {
                            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                                EditorInfo editorInfo = cVar.f3104e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    cVar.performEditorAction(editorInfo.imeOptions & 255);
                                    z3 = true;
                                }
                            }
                            int selectionStart = Selection.getSelectionStart(fVar);
                            int selectionEnd = Selection.getSelectionEnd(fVar);
                            int unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                int min = Math.min(selectionStart, selectionEnd);
                                int max = Math.max(selectionStart, selectionEnd);
                                cVar.beginBatchEdit();
                                if (min != max) {
                                    fVar.delete(min, max);
                                }
                                fVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                                int i3 = min + 1;
                                cVar.setSelection(i3, i3);
                                cVar.endBatchEdit();
                                z3 = true;
                            }
                        }
                    }
                } else {
                    z3 = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (z3) {
                return;
            }
            hashSet.add(keyEvent);
            ((r1.n) vVar).getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void H(Activity activity, x0.j jVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.n;
        a2.h.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f58m;
        reentrantLock.lock();
        try {
            if (jVar.equals((x0.j) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it2 = ((n) ((H0.i) this.f57l).f443l).f73b.iterator();
            while (it2.hasNext()) {
                m mVar = (m) it2.next();
                if (mVar.f67a.equals(activity)) {
                    mVar.f69c = jVar;
                    mVar.f68b.accept(jVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean I(String str, boolean z3, L1.k kVar, L1.a aVar) {
        ActivityOptions activityOptions;
        Map map = kVar.f881c;
        if (((Activity) this.n) == null) {
            throw new L1.b();
        }
        Bundle v3 = v(map);
        if (z3) {
            Iterator it2 = map.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    String lowerCase = ((String) it2.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                    }
                } else {
                    Uri parse = Uri.parse(str);
                    Activity activity = (Activity) this.n;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", aVar.f867a ? 1 : 0);
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    int i3 = Build.VERSION.SDK_INT;
                    LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
                    String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
                    if (!TextUtils.isEmpty(languageTag)) {
                        Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                        if (!bundleExtra.containsKey("Accept-Language")) {
                            bundleExtra.putString("Accept-Language", languageTag);
                            intent.putExtra("com.android.browser.headers", bundleExtra);
                        }
                    }
                    if (i3 >= 34) {
                        activityOptions = ActivityOptions.makeBasic();
                        AbstractC0019u.j(activityOptions);
                    } else {
                        activityOptions = null;
                    }
                    if (i3 >= 36) {
                        if (activityOptions == null) {
                            activityOptions = ActivityOptions.makeBasic();
                        }
                        E.f.e(activityOptions, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
                    }
                    Bundle bundle2 = activityOptions != null ? activityOptions.toBundle() : null;
                    intent.putExtra("com.android.browser.headers", v3);
                    try {
                        intent.setData(parse);
                        activity.startActivity(intent, bundle2);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        Activity activity2 = (Activity) this.n;
        boolean z4 = kVar.f879a;
        boolean z5 = kVar.f880b;
        int i4 = WebViewActivity.f3257o;
        try {
            ((Activity) this.n).startActivity(new Intent(activity2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z4).putExtra("enableDomStorage", z5).putExtra("com.android.browser.headers", v3));
            return true;
        } catch (ActivityNotFoundException unused2) {
            return false;
        }
    }

    public void J() {
        ((TypedArray) this.f58m).recycle();
    }

    public void K(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0391a abstractC0391a = (AbstractC0391a) arrayList.get(i3);
            abstractC0391a.getClass();
            A.l lVar = (A.l) this.f57l;
            Object[] objArr = (Object[]) lVar.f34b;
            a2.h.e(abstractC0391a, "instance");
            int i4 = lVar.f33a;
            for (int i5 = 0; i5 < i4; i5++) {
                if (objArr[i5] == abstractC0391a) {
                    throw new IllegalStateException("Already in the pool!");
                }
            }
            int i6 = lVar.f33a;
            if (i6 < objArr.length) {
                objArr[i6] = abstractC0391a;
                lVar.f33a = i6 + 1;
            }
        }
        arrayList.clear();
    }

    public void L(C1.h hVar) {
        ((C1.f) this.f57l).b((String) this.f58m, hVar == null ? null : new j(this, hVar));
    }

    public boolean M() {
        String str;
        Context context = (Context) this.f57l;
        List list = Collections.EMPTY_LIST;
        PackageManager packageManager = context.getPackageManager();
        List arrayList = list == null ? new ArrayList() : list;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str2 = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                str = (String) it2.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        return str != null;
    }

    public void N(Object obj, String str) {
        j jVar = new j(11);
        ((j) this.n).n = jVar;
        this.n = jVar;
        jVar.f58m = obj;
        jVar.f57l = str;
    }

    @Override // K1.InterfaceC0031g
    public Long a(String str, C0032h c0032h) {
        long j3;
        SharedPreferences s3 = s(c0032h);
        if (!s3.contains(str)) {
            return null;
        }
        try {
            j3 = s3.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j3 = s3.getInt(str, 0);
        }
        return Long.valueOf(j3);
    }

    @Override // K1.InterfaceC0031g
    public void b(String str, double d3, C0032h c0032h) {
        s(c0032h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).apply();
    }

    @Override // K1.InterfaceC0031g
    public void c(List list, C0032h c0032h) {
        SharedPreferences s3 = s(c0032h);
        SharedPreferences.Editor edit = s3.edit();
        a2.h.d(edit, "edit(...)");
        Map<String, ?> all = s3.getAll();
        a2.h.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (M.b(str, all.get(str), list != null ? P1.e.n0(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it2 = arrayList.iterator();
        a2.h.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next = it2.next();
            a2.h.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // K1.InterfaceC0031g
    public ArrayList d(String str, C0032h c0032h) {
        List list;
        SharedPreferences s3 = s(c0032h);
        if (!s3.contains(str)) {
            return null;
        }
        String string = s3.getString(str, StringUtils.EMPTY);
        a2.h.b(string);
        if (!string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || (list = (List) M.c(s3.getString(str, StringUtils.EMPTY), (B1.b) this.n)) == null) {
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
    public void e(String str, List list, C0032h c0032h) {
        s(c0032h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((B1.b) this.n).e(list))).apply();
    }

    @Override // K1.InterfaceC0031g
    public void f(String str, long j3, C0032h c0032h) {
        s(c0032h).edit().putLong(str, j3).apply();
    }

    @Override // K1.InterfaceC0031g
    public Map g(List list, C0032h c0032h) {
        Object value;
        Map<String, ?> all = s(c0032h).getAll();
        a2.h.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (M.b(entry.getKey(), entry.getValue(), list != null ? P1.e.n0(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object c3 = M.c(value, (B1.b) this.n);
                a2.h.c(c3, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, c3);
            }
        }
        return hashMap;
    }

    @Override // l2.d
    public Object h(l2.e eVar, R1.c cVar) {
        Object h3 = ((l2.d) this.f57l).h(new r(eVar, (Y.d) this.f58m, (L) this.n), cVar);
        return h3 == S1.a.f1260k ? h3 : O1.g.f1211a;
    }

    @Override // K1.InterfaceC0031g
    public K1.P i(String str, C0032h c0032h) {
        SharedPreferences s3 = s(c0032h);
        if (!s3.contains(str)) {
            return null;
        }
        String string = s3.getString(str, StringUtils.EMPTY);
        a2.h.b(string);
        return string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") ? new K1.P(string, N.n) : string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new K1.P(null, N.f703m) : new K1.P(null, N.f704o);
    }

    @Override // K1.InterfaceC0031g
    public void j(String str, boolean z3, C0032h c0032h) {
        s(c0032h).edit().putBoolean(str, z3).apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        if (r1.startsWith("generic") == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0192 A[LOOP:1: B:24:0x0190->B:25:0x0192, LOOP_END] */
    @Override // C1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(A.c r11, B1.o r12) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.j.k(A.c, B1.o):void");
    }

    @Override // K1.InterfaceC0031g
    public void l(String str, String str2, C0032h c0032h) {
        s(c0032h).edit().putString(str, str2).apply();
    }

    @Override // K1.InterfaceC0031g
    public String m(String str, C0032h c0032h) {
        SharedPreferences s3 = s(c0032h);
        if (s3.contains(str)) {
            return s3.getString(str, StringUtils.EMPTY);
        }
        return null;
    }

    @Override // K1.InterfaceC0031g
    public void n(String str, String str2, C0032h c0032h) {
        s(c0032h).edit().putString(str, str2).apply();
    }

    @Override // C1.d
    public void o(ByteBuffer byteBuffer, C0480h c0480h) {
        AtomicReference atomicReference = (AtomicReference) this.f58m;
        C1.h hVar = (C1.h) this.f57l;
        j jVar = (j) this.n;
        String str = (String) jVar.f58m;
        C1.n nVar = (C1.n) jVar.n;
        String str2 = (String) nVar.d(byteBuffer).f6l;
        if (!str2.equals("listen")) {
            if (!str2.equals("cancel")) {
                c0480h.a(null);
                return;
            }
            if (((C1.g) atomicReference.getAndSet(null)) == null) {
                c0480h.a(nVar.c("error", "No active stream to cancel", null));
                return;
            }
            try {
                hVar.onCancel();
                c0480h.a(nVar.a(null));
                return;
            } catch (RuntimeException e3) {
                Log.e("EventChannel#" + str, "Failed to close event stream", e3);
                c0480h.a(nVar.c("error", e3.getMessage(), null));
                return;
            }
        }
        C1.g gVar = new C1.g(this);
        if (((C1.g) atomicReference.getAndSet(gVar)) != null) {
            try {
                hVar.onCancel();
            } catch (RuntimeException e4) {
                Log.e("EventChannel#" + str, "Failed to close existing event stream", e4);
            }
        }
        try {
            hVar.i(gVar);
            c0480h.a(nVar.a(null));
        } catch (RuntimeException e5) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str, "Failed to open event stream", e5);
            c0480h.a(nVar.c("error", e5.getMessage(), null));
        }
    }

    @Override // K1.InterfaceC0031g
    public Boolean p(String str, C0032h c0032h) {
        SharedPreferences s3 = s(c0032h);
        if (s3.contains(str)) {
            return Boolean.valueOf(s3.getBoolean(str, true));
        }
        return null;
    }

    @Override // K1.InterfaceC0031g
    public List q(List list, C0032h c0032h) {
        Map<String, ?> all = s(c0032h).getAll();
        a2.h.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            a2.h.d(key, "<get-key>(...)");
            if (M.b(key, entry.getValue(), list != null ? P1.e.n0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return P1.e.l0(linkedHashMap.keySet());
    }

    @Override // K1.InterfaceC0031g
    public Double r(String str, C0032h c0032h) {
        SharedPreferences s3 = s(c0032h);
        if (!s3.contains(str)) {
            return null;
        }
        Object c3 = M.c(s3.getString(str, StringUtils.EMPTY), (B1.b) this.n);
        a2.h.c(c3, "null cannot be cast to non-null type kotlin.Double");
        return (Double) c3;
    }

    public SharedPreferences s(C0032h c0032h) {
        Context context = (Context) this.f58m;
        String str = c0032h.f721a;
        if (str != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            a2.h.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        a2.h.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void t(int i3, io.flutter.view.f fVar) {
        ((FlutterJNI) this.f58m).dispatchSemanticsAction(i3, fVar);
    }

    public String toString() {
        switch (this.f56k) {
            case 12:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f57l);
                sb.append('{');
                j jVar = (j) ((j) this.f58m).n;
                String str = StringUtils.EMPTY;
                while (jVar != null) {
                    Object obj = jVar.f58m;
                    sb.append(str);
                    String str2 = (String) jVar.f57l;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    jVar = (j) jVar.n;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 16:
                return ((C0392b) this.f58m).toString() + ", hidden list:" + ((ArrayList) this.n).size();
            default:
                return super.toString();
        }
    }

    public void u(int i3, io.flutter.view.f fVar, Serializable serializable) {
        ((FlutterJNI) this.f58m).dispatchSemanticsAction(i3, fVar, serializable);
    }

    public int w(int i3, int i4) {
        ArrayList arrayList = (ArrayList) this.n;
        int size = arrayList.size();
        while (i4 < size) {
            ((AbstractC0391a) arrayList.get(i4)).getClass();
            i4++;
        }
        return i3;
    }

    public ColorStateList x(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f58m;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0) {
            Context context = (Context) this.f57l;
            Object obj = AbstractC0250a.f2826a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i3);
    }

    public Drawable y(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f58m;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : AbstractC0250a.a((Context) this.f57l, resourceId);
    }

    public Typeface z(int i3, int i4, C0355s c0355s) {
        C0355s c0355s2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f58m).getResourceId(i3, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.n) == null) {
                this.n = new TypedValue();
            }
            Context context = (Context) this.f57l;
            TypedValue typedValue = (TypedValue) this.n;
            Object obj = AbstractC0487e.f4618a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String charSequence2 = charSequence.toString();
                if (!charSequence2.startsWith("res/")) {
                    c0355s.a();
                    return null;
                }
                int i5 = typedValue.assetCookie;
                o.i iVar = w.e.f4641b;
                Typeface typeface = (Typeface) iVar.a(w.e.b(resources, resourceId, charSequence2, i5, i4));
                int i6 = 19;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new M.c(c0355s, typeface, i6));
                    return typeface;
                }
                try {
                    if (!charSequence2.toLowerCase().endsWith(".xml")) {
                        c0355s2 = c0355s;
                        try {
                            int i7 = typedValue.assetCookie;
                            Typeface l3 = w.e.f4640a.l(context, resources, resourceId, charSequence2, i4);
                            if (l3 != null) {
                                iVar.b(w.e.b(resources, resourceId, charSequence2, i7, i4), l3);
                            }
                            if (l3 != null) {
                                new Handler(Looper.getMainLooper()).post(new M.c(c0355s2, l3, i6));
                            } else {
                                c0355s2.a();
                            }
                            return l3;
                        } catch (IOException e3) {
                            e = e3;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            c0355s2.a();
                            return null;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            c0355s2.a();
                            return null;
                        }
                    }
                    InterfaceC0483a x = S0.a.x(resources.getXml(resourceId), resources);
                    if (x != null) {
                        try {
                            return w.e.a(context, x, resources, resourceId, charSequence2, typedValue.assetCookie, i4, c0355s);
                        } catch (IOException e5) {
                            e = e5;
                            c0355s2 = c0355s;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            c0355s2.a();
                            return null;
                        } catch (XmlPullParserException e6) {
                            e = e6;
                            c0355s2 = c0355s;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            c0355s2.a();
                            return null;
                        }
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        c0355s.a();
                        return null;
                    } catch (IOException e7) {
                        iOException = e7;
                        c0355s2 = c0355s;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                        c0355s2.a();
                        return null;
                    } catch (XmlPullParserException e8) {
                        xmlPullParserException = e8;
                        c0355s2 = c0355s;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                        c0355s2.a();
                        return null;
                    }
                } catch (IOException e9) {
                    e = e9;
                    c0355s2 = c0355s;
                } catch (XmlPullParserException e10) {
                    e = e10;
                    c0355s2 = c0355s;
                }
            }
        }
        return null;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i3) {
        this.f56k = i3;
        this.f57l = obj;
        this.f58m = obj2;
        this.n = obj3;
    }

    public j(String str) {
        this.f56k = 12;
        j jVar = new j(11);
        this.f58m = jVar;
        this.n = jVar;
        this.f57l = str;
    }

    public j(S s3, Q q3, AbstractC0231b abstractC0231b) {
        this.f56k = 13;
        a2.h.e(s3, "store");
        a2.h.e(abstractC0231b, "extras");
        this.f57l = s3;
        this.f58m = q3;
        this.n = abstractC0231b;
    }

    public j(B1.g gVar) {
        this.f56k = 16;
        this.f57l = gVar;
        this.f58m = new C0392b();
        this.n = new ArrayList();
    }

    public j(C1.f fVar, String str) {
        this.f56k = 4;
        C1.r rVar = C1.r.f180a;
        this.f57l = fVar;
        this.f58m = str;
        this.n = rVar;
    }

    public j(Context context) {
        this.f56k = 9;
        B1.d dVar = new B1.d(context, 3);
        this.f57l = context;
        this.f58m = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(s.e r29) {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.j.<init>(s.e):void");
    }

    public j(Context context, TypedArray typedArray) {
        this.f56k = 14;
        this.f57l = context;
        this.f58m = typedArray;
    }

    public j(RunnableC0151d runnableC0151d) {
        this.f56k = 5;
        this.f58m = new CopyOnWriteArrayList();
        this.n = new HashMap();
        this.f57l = runnableC0151d;
    }

    public j(A a3) {
        this.f56k = 15;
        this.f57l = new A.l(30);
        this.f58m = new ArrayList();
        this.n = new ArrayList();
        new A(this, 22);
    }

    public j(C0475c c0475c, FlutterJNI flutterJNI) {
        this.f56k = 1;
        B1.a aVar = new B1.a(this, 0);
        s sVar = new s(c0475c, "flutter/accessibility", q.f177a, null);
        this.f57l = sVar;
        sVar.y(aVar);
        this.f58m = flutterJNI;
    }

    public j(v vVar) {
        this.f56k = 19;
        this.f58m = new HashSet();
        this.n = vVar;
        r1.n nVar = (r1.n) vVar;
        this.f57l = new u[]{new r1.s(nVar.getBinaryMessenger()), new C0192Q(new H0.i(nVar.getBinaryMessenger()))};
        new B1.a(nVar.getBinaryMessenger()).f80l = this;
    }

    public j() {
        this.f56k = 2;
        this.f57l = new ConcurrentLinkedQueue();
    }

    public j(j jVar, C1.h hVar) {
        this.f56k = 3;
        this.n = jVar;
        this.f58m = new AtomicReference(null);
        this.f57l = hVar;
    }

    public j(C1.f fVar, Context context, B1.b bVar) {
        this.f56k = 7;
        a2.h.e(fVar, "messenger");
        a2.h.e(context, "context");
        this.f57l = fVar;
        this.f58m = context;
        this.n = bVar;
        try {
            InterfaceC0031g.f720f.getClass();
            C0030f.b(fVar, this, "shared_preferences");
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e3);
        }
    }

    public j(H0.i iVar) {
        this.f56k = 0;
        this.f57l = iVar;
        this.f58m = new ReentrantLock();
        this.n = new WeakHashMap();
    }
}
