package A0;

import B1.o;
import B1.s;
import C1.q;
import D.AbstractC0005f;
import D.AbstractC0009j;
import D.AbstractC0019u;
import D.J;
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
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.app.Notification;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.StatFs;
import android.provider.Settings;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
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
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;
import org.xmlpull.v1.XmlPullParserException;
import p031k.C0240s;
import p035l0.AbstractC0248a;
import p035l0.C0249b;
import p052r1.u;
import p052r1.v;

/* JADX INFO: loaded from: classes.dex */
public class j implements C1.d, InterfaceC0031g, l2.d, L1.e, C1.m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static j f55o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f56k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f57l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f58m;
    public Object n;

    public /* synthetic */ j(int i3) {
        this.f56k = i3;
    }

    public static j E() {
        if (f55o == null) {
            A a3 = new A(29);
            p049q1.a aVar = new p049q1.a();
            aVar.f4310a = 0;
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            p063w1.c cVar = new p063w1.c();
            cVar.f4662a = false;
            cVar.f4663b = false;
            cVar.f4667f = flutterJNI;
            cVar.f4668g = executorServiceNewCachedThreadPool;
            j jVar = new j(18);
            jVar.f57l = cVar;
            jVar.f58m = a3;
            jVar.n = executorServiceNewCachedThreadPool;
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
        P pA;
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
        p008d0.c cVar = new p008d0.c((p008d0.b) this.n);
        ((LinkedHashMap) cVar.f2769a).put(p010e0.b.f2780a, str);
        try {
            try {
                q3.getClass();
                pA = q3.b(E2.a.t(eVar), cVar);
            } catch (AbstractMethodError unused) {
                pA = q3.b(E2.a.t(eVar), cVar);
            }
        } catch (AbstractMethodError unused2) {
            pA = q3.a(E2.a.t(eVar));
        }
        a2.h.e(pA, "viewModel");
        P p4 = (P) linkedHashMap.put(str, pA);
        if (p4 != null) {
            p4.a();
        }
        return pA;
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

    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    public void G(KeyEvent keyEvent) {
        InputConnection inputConnection;
        int selectionStart;
        int selectionEnd;
        int unicodeChar;
        int iMin;
        int iMax;
        HashSet hashSet = (HashSet) this.f58m;
        v vVar = (v) this.n;
        if (vVar != null) {
            io.flutter.plugin.editing.j jVar = ((p052r1.n) vVar).f4408v;
            boolean zSendKeyEvent = false;
            if (jVar.f3137b.isAcceptingText() && (inputConnection = jVar.f3145j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.c) {
                    io.flutter.plugin.editing.c cVar = (io.flutter.plugin.editing.c) inputConnection;
                    io.flutter.plugin.editing.f fVar = cVar.f3103d;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            zSendKeyEvent = cVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            zSendKeyEvent = cVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            zSendKeyEvent = cVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            zSendKeyEvent = cVar.e(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                            EditorInfo editorInfo = cVar.f3104e;
                            if ((editorInfo.inputType & 131072) == 0) {
                                cVar.performEditorAction(editorInfo.imeOptions & 255);
                            } else {
                                selectionStart = Selection.getSelectionStart(fVar);
                                selectionEnd = Selection.getSelectionEnd(fVar);
                                unicodeChar = keyEvent.getUnicodeChar();
                                if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                    iMin = Math.min(selectionStart, selectionEnd);
                                    iMax = Math.max(selectionStart, selectionEnd);
                                    cVar.beginBatchEdit();
                                    if (iMin != iMax) {
                                        fVar.delete(iMin, iMax);
                                    }
                                    fVar.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                                    int i3 = iMin + 1;
                                    cVar.setSelection(i3, i3);
                                    cVar.endBatchEdit();
                                }
                            }
                            zSendKeyEvent = true;
                        } else {
                            selectionStart = Selection.getSelectionStart(fVar);
                            selectionEnd = Selection.getSelectionEnd(fVar);
                            unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0) {
                                iMin = Math.min(selectionStart, selectionEnd);
                                iMax = Math.max(selectionStart, selectionEnd);
                                cVar.beginBatchEdit();
                                if (iMin != iMax) {
                                    fVar.delete(iMin, iMax);
                                }
                                fVar.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                                int i4 = iMin + 1;
                                cVar.setSelection(i4, i4);
                                cVar.endBatchEdit();
                                zSendKeyEvent = true;
                            }
                        }
                    }
                } else {
                    zSendKeyEvent = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (zSendKeyEvent) {
                return;
            }
            hashSet.add(keyEvent);
            ((p052r1.n) vVar).getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void H(Activity activity, p064x0.j jVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.n;
        a2.h.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f58m;
        reentrantLock.lock();
        try {
            if (jVar.equals((p064x0.j) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (m mVar : ((n) ((H0.i) this.f57l).f443l).f73b) {
                if (mVar.f67a.equals(activity)) {
                    mVar.f69c = jVar;
                    mVar.f68b.accept(jVar);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public boolean I(String str, boolean z3, L1.k kVar, L1.a aVar) {
        ActivityOptions activityOptionsMakeBasic;
        Map map = kVar.f881c;
        if (((Activity) this.n) == null) {
            throw new L1.b();
        }
        Bundle bundleV = v(map);
        if (z3) {
            Iterator it2 = map.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    String lowerCase = ((String) it2.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                        case "accept":
                        case "content-language":
                        case "content-type":
                        case "accept-language":
                            break;
                    }
                } else {
                    Uri uri = Uri.parse(str);
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
                        activityOptionsMakeBasic = ActivityOptions.makeBasic();
                        AbstractC0019u.j(activityOptionsMakeBasic);
                    } else {
                        activityOptionsMakeBasic = null;
                    }
                    if (i3 >= 36) {
                        if (activityOptionsMakeBasic == null) {
                            activityOptionsMakeBasic = ActivityOptions.makeBasic();
                        }
                        E.f.e(activityOptionsMakeBasic, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
                    }
                    Bundle bundle2 = activityOptionsMakeBasic != null ? activityOptionsMakeBasic.toBundle() : null;
                    intent.putExtra("com.android.browser.headers", bundleV);
                    try {
                        intent.setData(uri);
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
            ((Activity) this.n).startActivity(new Intent(activity2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z4).putExtra("enableDomStorage", z5).putExtra("com.android.browser.headers", bundleV));
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
            AbstractC0248a abstractC0248a = (AbstractC0248a) arrayList.get(i3);
            abstractC0248a.getClass();
            A.l lVar = (A.l) this.f57l;
            Object[] objArr = (Object[]) lVar.f34b;
            a2.h.e(abstractC0248a, "instance");
            int i4 = lVar.f33a;
            for (int i5 = 0; i5 < i4; i5++) {
                if (objArr[i5] == abstractC0248a) {
                    throw new IllegalStateException("Already in the pool!");
                }
            }
            int i6 = lVar.f33a;
            if (i6 < objArr.length) {
                objArr[i6] = abstractC0248a;
                lVar.f33a = i6 + 1;
            }
        }
        arrayList.clear();
    }

    public void L(C1.h hVar) {
        ((C1.f) this.f57l).b((String) this.f58m, hVar == null ? null : new j(this, hVar));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[RETURN] */
    public boolean M() {
        Context context = (Context) this.f57l;
        List list = Collections.EMPTY_LIST;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                if (str2 != null) {
                    return true;
                }
                return false;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        }
        str2 = null;
        if (str2 != null) {
            return true;
        }
        return false;
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
        SharedPreferences sharedPreferencesS = s(c0032h);
        if (!sharedPreferencesS.contains(str)) {
            return null;
        }
        try {
            j3 = sharedPreferencesS.getLong(str, 0L);
        } catch (ClassCastException unused) {
            j3 = sharedPreferencesS.getInt(str, 0);
        }
        return Long.valueOf(j3);
    }

    @Override // K1.InterfaceC0031g
    public void b(String str, double d3, C0032h c0032h) {
        s(c0032h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).apply();
    }

    @Override // K1.InterfaceC0031g
    public void c(List list, C0032h c0032h) {
        SharedPreferences sharedPreferencesS = s(c0032h);
        SharedPreferences.Editor editorEdit = sharedPreferencesS.edit();
        a2.h.d(editorEdit, "edit(...)");
        Map<String, ?> all = sharedPreferencesS.getAll();
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
            editorEdit.remove((String) next);
        }
        editorEdit.apply();
    }

    @Override // K1.InterfaceC0031g
    public ArrayList d(String str, C0032h c0032h) {
        List list;
        SharedPreferences sharedPreferencesS = s(c0032h);
        if (!sharedPreferencesS.contains(str)) {
            return null;
        }
        String string = sharedPreferencesS.getString(str, StringUtils.EMPTY);
        a2.h.b(string);
        if (!string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") || (list = (List) M.c(sharedPreferencesS.getString(str, StringUtils.EMPTY), (B1.b) this.n)) == null) {
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
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (M.b(entry.getKey(), entry.getValue(), list != null ? P1.e.n0(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object objC = M.c(value, (B1.b) this.n);
                a2.h.c(objC, "null cannot be cast to non-null type kotlin.Any");
                map.put(key, objC);
            }
        }
        return map;
    }

    @Override // l2.d
    public Object h(l2.e eVar, R1.c cVar) {
        Object objH = ((l2.d) this.f57l).h(new r(eVar, (Y.d) this.f58m, (L) this.n), cVar);
        return objH == S1.a.f1260k ? objH : O1.g.f1211a;
    }

    @Override // K1.InterfaceC0031g
    public K1.P i(String str, C0032h c0032h) {
        SharedPreferences sharedPreferencesS = s(c0032h);
        if (!sharedPreferencesS.contains(str)) {
            return null;
        }
        String string = sharedPreferencesS.getString(str, StringUtils.EMPTY);
        a2.h.b(string);
        if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new K1.P(string, N.n);
        }
        return string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new K1.P(null, N.f703m) : new K1.P(null, N.f704o);
    }

    @Override // K1.InterfaceC0031g
    public void j(String str, boolean z3, C0032h c0032h) {
        s(c0032h).edit().putBoolean(str, z3).apply();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x0155  */
    @Override // C1.m
    public void k(A.c cVar, o oVar) {
        boolean z3;
        a2.h.e(cVar, "call");
        if (!((String) cVar.f6l).equals("getDeviceInfo")) {
            oVar.b();
            return;
        }
        HashMap map = new HashMap();
        map.put("board", Build.BOARD);
        map.put("bootloader", Build.BOOTLOADER);
        String str = Build.BRAND;
        map.put("brand", str);
        String str2 = Build.DEVICE;
        map.put("device", str2);
        map.put("display", Build.DISPLAY);
        String str3 = Build.FINGERPRINT;
        map.put("fingerprint", str3);
        String str4 = Build.HARDWARE;
        map.put("hardware", str4);
        map.put("host", Build.HOST);
        map.put("id", Build.ID);
        String str5 = Build.MANUFACTURER;
        map.put("manufacturer", str5);
        String str6 = Build.MODEL;
        map.put("model", str6);
        String str7 = Build.PRODUCT;
        map.put("product", str7);
        if (Build.VERSION.SDK_INT >= 25) {
            String string = Settings.Global.getString((ContentResolver) this.n, "device_name");
            if (string == null) {
                string = StringUtils.EMPTY;
            }
            map.put("name", string);
        }
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        map.put("supported32BitAbis", P1.f.d0(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        map.put("supported64BitAbis", P1.f.d0(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        map.put("supportedAbis", P1.f.d0(Arrays.copyOf(strArr3, strArr3.length)));
        map.put("tags", Build.TAGS);
        map.put("type", Build.TYPE);
        a2.h.d(str, "BRAND");
        int i3 = 0;
        if (str.startsWith("generic")) {
            a2.h.d(str2, "DEVICE");
            if (str2.startsWith("generic")) {
                z3 = true;
            } else {
                a2.h.d(str3, "FINGERPRINT");
                if (!str3.startsWith("generic") || str3.startsWith("unknown")) {
                    z3 = true;
                } else {
                    a2.h.d(str4, "HARDWARE");
                    if (p024h2.d.Y(str4, "goldfish") || p024h2.d.Y(str4, "ranchu")) {
                        z3 = true;
                    } else {
                        a2.h.d(str6, "MODEL");
                        if (p024h2.d.Y(str6, "google_sdk") || p024h2.d.Y(str6, "Emulator") || p024h2.d.Y(str6, "Android SDK built for x86")) {
                            z3 = true;
                        } else {
                            a2.h.d(str5, "MANUFACTURER");
                            if (p024h2.d.Y(str5, "Genymotion")) {
                                z3 = true;
                            } else {
                                a2.h.d(str7, "PRODUCT");
                                if (p024h2.d.Y(str7, "sdk") || p024h2.d.Y(str7, "vbox86p") || p024h2.d.Y(str7, "emulator") || p024h2.d.Y(str7, "simulator")) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            a2.h.d(str3, "FINGERPRINT");
            if (str3.startsWith("generic")) {
                z3 = true;
            } else {
                z3 = true;
            }
        }
        map.put("isPhysicalDevice", Boolean.valueOf(!z3));
        FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.f57l).getSystemAvailableFeatures();
        a2.h.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (featureInfo.name != null) {
                arrayList.add(featureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(P1.g.e0(arrayList));
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            arrayList2.add(((FeatureInfo) obj).name);
        }
        map.put("systemFeatures", arrayList2);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        map.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
        map.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
        HashMap map2 = new HashMap();
        int i4 = Build.VERSION.SDK_INT;
        map2.put("baseOS", Build.VERSION.BASE_OS);
        map2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        map2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        map2.put("codename", Build.VERSION.CODENAME);
        map2.put("incremental", Build.VERSION.INCREMENTAL);
        map2.put("release", Build.VERSION.RELEASE);
        map2.put("sdkInt", Integer.valueOf(i4));
        map.put("version", map2);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) this.f58m).getMemoryInfo(memoryInfo);
        map.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
        map.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / 1048576));
        map.put("availableRamSize", Long.valueOf(memoryInfo.availMem / 1048576));
        oVar.d(map);
    }

    @Override // K1.InterfaceC0031g
    public void l(String str, String str2, C0032h c0032h) {
        s(c0032h).edit().putString(str, str2).apply();
    }

    @Override // K1.InterfaceC0031g
    public String m(String str, C0032h c0032h) {
        SharedPreferences sharedPreferencesS = s(c0032h);
        if (sharedPreferencesS.contains(str)) {
            return sharedPreferencesS.getString(str, StringUtils.EMPTY);
        }
        return null;
    }

    @Override // K1.InterfaceC0031g
    public void n(String str, String str2, C0032h c0032h) {
        s(c0032h).edit().putString(str, str2).apply();
    }

    @Override // C1.d
    public void o(ByteBuffer byteBuffer, p057t1.h hVar) {
        AtomicReference atomicReference = (AtomicReference) this.f58m;
        C1.h hVar2 = (C1.h) this.f57l;
        j jVar = (j) this.n;
        String str = (String) jVar.f58m;
        C1.n nVar = (C1.n) jVar.n;
        String str2 = (String) nVar.d(byteBuffer).f6l;
        if (!str2.equals("listen")) {
            if (!str2.equals("cancel")) {
                hVar.a(null);
                return;
            }
            if (((C1.g) atomicReference.getAndSet(null)) == null) {
                hVar.a(nVar.c("error", "No active stream to cancel", null));
                return;
            }
            try {
                hVar2.onCancel();
                hVar.a(nVar.a(null));
                return;
            } catch (RuntimeException e3) {
                Log.e("EventChannel#" + str, "Failed to close event stream", e3);
                hVar.a(nVar.c("error", e3.getMessage(), null));
                return;
            }
        }
        C1.g gVar = new C1.g(this);
        if (((C1.g) atomicReference.getAndSet(gVar)) != null) {
            try {
                hVar2.onCancel();
            } catch (RuntimeException e4) {
                Log.e("EventChannel#" + str, "Failed to close existing event stream", e4);
            }
        }
        try {
            hVar2.i(gVar);
            hVar.a(nVar.a(null));
        } catch (RuntimeException e5) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str, "Failed to open event stream", e5);
            hVar.a(nVar.c("error", e5.getMessage(), null));
        }
    }

    @Override // K1.InterfaceC0031g
    public Boolean p(String str, C0032h c0032h) {
        SharedPreferences sharedPreferencesS = s(c0032h);
        if (sharedPreferencesS.contains(str)) {
            return Boolean.valueOf(sharedPreferencesS.getBoolean(str, true));
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
        SharedPreferences sharedPreferencesS = s(c0032h);
        if (!sharedPreferencesS.contains(str)) {
            return null;
        }
        Object objC = M.c(sharedPreferencesS.getString(str, StringUtils.EMPTY), (B1.b) this.n);
        a2.h.c(objC, "null cannot be cast to non-null type kotlin.Double");
        return (Double) objC;
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
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    jVar = (j) jVar.n;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 16:
                return ((C0249b) this.f58m).toString() + ", hidden list:" + ((ArrayList) this.n).size();
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
            ((AbstractC0248a) arrayList.get(i4)).getClass();
            i4++;
        }
        return i3;
    }

    public ColorStateList x(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f58m;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0) {
            Context context = (Context) this.f57l;
            Object obj = p017g.a.f2826a;
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
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : p017g.a.a((Context) this.f57l, resourceId);
    }

    public Typeface z(int i3, int i4, C0240s c0240s) {
        C0240s c0240s2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f58m).getResourceId(i3, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.n) == null) {
                this.n = new TypedValue();
            }
            Context context = (Context) this.f57l;
            TypedValue typedValue = (TypedValue) this.n;
            Object obj = p060v.e.f4618a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    c0240s.a();
                    return null;
                }
                int i5 = typedValue.assetCookie;
                p042o.i iVar = w.e.f4641b;
                Typeface typeface = (Typeface) iVar.a(w.e.b(resources, resourceId, string, i5, i4));
                int i6 = 19;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new M.c(c0240s, typeface, i6));
                    return typeface;
                }
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        p060v.a aVarX = S0.a.x(resources.getXml(resourceId), resources);
                        if (aVarX == null) {
                            try {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                c0240s.a();
                                return null;
                            } catch (IOException e3) {
                                iOException = e3;
                                c0240s2 = c0240s;
                            } catch (XmlPullParserException e4) {
                                xmlPullParserException = e4;
                                c0240s2 = c0240s;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                                c0240s2.a();
                                return null;
                            }
                        } else {
                            try {
                                return w.e.a(context, aVarX, resources, resourceId, string, typedValue.assetCookie, i4, c0240s);
                            } catch (IOException e5) {
                                e = e5;
                                c0240s2 = c0240s;
                            } catch (XmlPullParserException e6) {
                                e = e6;
                                c0240s2 = c0240s;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                                c0240s2.a();
                                return null;
                            }
                        }
                        iOException = e;
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                    } else {
                        c0240s2 = c0240s;
                        try {
                            int i7 = typedValue.assetCookie;
                            Typeface typefaceL = w.e.f4640a.l(context, resources, resourceId, string, i4);
                            if (typefaceL != null) {
                                iVar.b(w.e.b(resources, resourceId, string, i7, i4), typefaceL);
                            }
                            if (typefaceL != null) {
                                new Handler(Looper.getMainLooper()).post(new M.c(c0240s2, typefaceL, i6));
                            } else {
                                c0240s2.a();
                            }
                            return typefaceL;
                        } catch (IOException e7) {
                            e = e7;
                        } catch (XmlPullParserException e8) {
                            e = e8;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                            c0240s2.a();
                            return null;
                        }
                    }
                } catch (IOException e9) {
                    e = e9;
                    c0240s2 = c0240s;
                } catch (XmlPullParserException e10) {
                    e = e10;
                    c0240s2 = c0240s;
                }
                c0240s2.a();
                return null;
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

    public j(S s3, Q q3, p008d0.b bVar) {
        this.f56k = 13;
        a2.h.e(s3, "store");
        a2.h.e(bVar, "extras");
        this.f57l = s3;
        this.f58m = q3;
        this.n = bVar;
    }

    public j(B1.g gVar) {
        this.f56k = 16;
        this.f57l = gVar;
        this.f58m = new C0249b();
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

    /* JADX WARN: Code duplicated, block: B:82:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ab  */
    public j(s.e eVar) {
        ArrayList arrayList;
        Bundle bundle;
        int i3;
        ArrayList arrayList2;
        char c3;
        Icon iconCreateWithBitmap;
        Bundle bundle2;
        String strF;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i4;
        this.f56k = 20;
        this.n = new Bundle();
        this.f58m = eVar;
        Context context = eVar.f4448a;
        ArrayList arrayList3 = eVar.f4462p;
        ArrayList arrayList4 = eVar.f4450c;
        ArrayList arrayList5 = eVar.f4451d;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f57l = AbstractC0009j.a(context, eVar.f4460m);
        } else {
            this.f57l = new Notification.Builder(eVar.f4448a);
        }
        Notification notification = eVar.f4461o;
        int i5 = 0;
        ((Notification.Builder) this.f57l).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f4452e).setContentText(eVar.f4453f).setContentInfo(null).setContentIntent(eVar.f4454g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        ((Notification.Builder) this.f57l).setLargeIcon((Icon) null);
        ((Notification.Builder) this.f57l).setSubText(null).setUsesChronometer(false).setPriority(eVar.f4455h);
        ArrayList arrayList6 = eVar.f4449b;
        int size = arrayList6.size();
        int i6 = 0;
        while (i6 < size) {
            int i7 = i6 + 1;
            s.d dVar = (s.d) arrayList6.get(i6);
            if (dVar.f4442b == null && (i4 = dVar.f4445e) != 0) {
                dVar.f4442b = IconCompat.a(i4);
            }
            int i8 = i5;
            IconCompat iconCompat = dVar.f4442b;
            boolean z3 = dVar.f4443c;
            Bundle bundle3 = dVar.f4441a;
            if (iconCompat != null) {
                int i9 = iconCompat.f1917a;
                switch (i9) {
                    case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                        arrayList3 = arrayList3;
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        notification = notification;
                        arrayList6 = arrayList6;
                        size = size;
                        c3 = 2;
                        iconCreateWithBitmap = (Icon) iconCompat.f1918b;
                        break;
                    case 0:
                    default:
                        throw new IllegalArgumentException("Unknown type");
                    case 1:
                        arrayList3 = arrayList3;
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        notification = notification;
                        arrayList6 = arrayList6;
                        size = size;
                        c3 = 2;
                        iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1918b);
                        colorStateList = iconCompat.f1923g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f1924h;
                        if (mode != IconCompat.f1916k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 2:
                        arrayList3 = arrayList3;
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        notification = notification;
                        arrayList6 = arrayList6;
                        size = size;
                        if (i9 == -1) {
                            Object obj = iconCompat.f1918b;
                            if (Build.VERSION.SDK_INT >= 28) {
                                strF = AbstractC0005f.f(obj);
                            } else {
                                try {
                                    strF = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                                } catch (IllegalAccessException e3) {
                                    Log.e("IconCompat", "Unable to get icon package", e3);
                                    strF = null;
                                } catch (NoSuchMethodException e4) {
                                    Log.e("IconCompat", "Unable to get icon package", e4);
                                    strF = null;
                                } catch (InvocationTargetException e5) {
                                    Log.e("IconCompat", "Unable to get icon package", e5);
                                    strF = null;
                                }
                            }
                            c3 = 2;
                            break;
                        } else {
                            c3 = 2;
                            if (i9 == 2) {
                                String str = iconCompat.f1926j;
                                if (str != null && !TextUtils.isEmpty(str)) {
                                    strF = iconCompat.f1926j;
                                } else {
                                    strF = ((String) iconCompat.f1918b).split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)[i8];
                                }
                            } else {
                                throw new IllegalStateException("called getResPackage() on " + iconCompat);
                            }
                        }
                        iconCreateWithBitmap = Icon.createWithResource(strF, iconCompat.f1921e);
                        colorStateList = iconCompat.f1923g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f1924h;
                        if (mode != IconCompat.f1916k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 3:
                        iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f1918b, iconCompat.f1921e, iconCompat.f1922f);
                        c3 = 2;
                        colorStateList = iconCompat.f1923g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f1924h;
                        if (mode != IconCompat.f1916k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 4:
                        iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f1918b);
                        c3 = 2;
                        colorStateList = iconCompat.f1923g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f1924h;
                        if (mode != IconCompat.f1916k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 5:
                        if (Build.VERSION.SDK_INT >= 26) {
                            iconCreateWithBitmap = AbstractC0009j.b((Bitmap) iconCompat.f1918b);
                        } else {
                            Bitmap bitmap = (Bitmap) iconCompat.f1918b;
                            int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            Paint paint = new Paint(3);
                            float f3 = iMin * 0.5f;
                            paint.setColor(-16777216);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                            Matrix matrix = new Matrix();
                            matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
                            bitmapShader.setLocalMatrix(matrix);
                            paint.setShader(bitmapShader);
                            canvas.drawCircle(f3, f3, f3 * 0.9166667f, paint);
                            canvas.setBitmap(null);
                            iconCreateWithBitmap = Icon.createWithBitmap(bitmapCreateBitmap);
                        }
                        c3 = 2;
                        colorStateList = iconCompat.f1923g;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f1924h;
                        if (mode != IconCompat.f1916k) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case 6:
                        if (Build.VERSION.SDK_INT >= 30) {
                            iconCreateWithBitmap = J.a(iconCompat.c());
                            c3 = 2;
                            colorStateList = iconCompat.f1923g;
                            if (colorStateList != null) {
                                iconCreateWithBitmap.setTintList(colorStateList);
                            }
                            mode = iconCompat.f1924h;
                            if (mode != IconCompat.f1916k) {
                                iconCreateWithBitmap.setTintMode(mode);
                            }
                        } else {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.c());
                        }
                        break;
                }
            } else {
                arrayList3 = arrayList3;
                arrayList4 = arrayList4;
                arrayList5 = arrayList5;
                notification = notification;
                arrayList6 = arrayList6;
                size = size;
                c3 = 2;
                iconCreateWithBitmap = null;
            }
            Notification.Action.Builder builder = new Notification.Action.Builder(iconCreateWithBitmap, dVar.f4446f, dVar.f4447g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z3);
            int i10 = Build.VERSION.SDK_INT;
            builder.setAllowGeneratedReplies(z3);
            bundle2.putInt("android.support.action.semanticAction", i8);
            if (i10 >= 28) {
                AbstractC0005f.p(builder);
            }
            if (i10 >= 29) {
                s.f.d(builder);
            }
            if (i10 >= 31) {
                s.g.a(builder);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", dVar.f4444d);
            builder.addExtras(bundle2);
            ((Notification.Builder) this.f57l).addAction(builder.build());
            i6 = i7;
            arrayList4 = arrayList4;
            arrayList6 = arrayList6;
            size = size;
            arrayList5 = arrayList5;
            arrayList3 = arrayList3;
            notification = notification;
            i5 = 0;
        }
        ArrayList arrayList7 = arrayList3;
        ArrayList arrayList8 = arrayList4;
        ArrayList arrayList9 = arrayList5;
        Notification notification2 = notification;
        Bundle bundle4 = eVar.f4459l;
        if (bundle4 != null) {
            ((Bundle) this.n).putAll(bundle4);
        }
        ((Notification.Builder) this.f57l).setShowWhen(eVar.f4456i);
        ((Notification.Builder) this.f57l).setLocalOnly(eVar.f4458k);
        ((Notification.Builder) this.f57l).setGroup(null);
        ((Notification.Builder) this.f57l).setSortKey(null);
        ((Notification.Builder) this.f57l).setGroupSummary(false);
        ((Notification.Builder) this.f57l).setCategory(null);
        ((Notification.Builder) this.f57l).setColor(0);
        ((Notification.Builder) this.f57l).setVisibility(0);
        ((Notification.Builder) this.f57l).setPublicVersion(null);
        ((Notification.Builder) this.f57l).setSound(notification2.sound, notification2.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList8 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList8.size());
                Iterator it2 = arrayList8.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList2 == null) {
                arrayList = arrayList7;
            } else {
                if (arrayList7 != null) {
                    p042o.f fVar = new p042o.f(arrayList7.size() + arrayList2.size());
                    fVar.addAll(arrayList2);
                    fVar.addAll(arrayList7);
                    arrayList2 = new ArrayList(fVar);
                }
                arrayList = arrayList2;
            }
        } else {
            arrayList = arrayList7;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                ((Notification.Builder) this.f57l).addPerson((String) obj2);
            }
        }
        if (arrayList9.size() > 0) {
            if (eVar.f4459l == null) {
                eVar.f4459l = new Bundle();
            }
            Bundle bundle5 = eVar.f4459l.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i12 = 0;
            while (i12 < arrayList9.size()) {
                String string = Integer.toString(i12);
                ArrayList arrayList10 = arrayList9;
                s.d dVar2 = (s.d) arrayList10.get(i12);
                Bundle bundle8 = new Bundle();
                if (dVar2.f4442b == null && (i3 = dVar2.f4445e) != 0) {
                    dVar2.f4442b = IconCompat.a(i3);
                }
                IconCompat iconCompat2 = dVar2.f4442b;
                Bundle bundle9 = dVar2.f4441a;
                bundle8.putInt("icon", iconCompat2 != null ? iconCompat2.b() : 0);
                bundle8.putCharSequence("title", dVar2.f4446f);
                bundle8.putParcelable("actionIntent", dVar2.f4447g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", dVar2.f4443c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", dVar2.f4444d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i12++;
                arrayList9 = arrayList10;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (eVar.f4459l == null) {
                eVar.f4459l = new Bundle();
            }
            eVar.f4459l.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.n).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i13 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f57l).setExtras(eVar.f4459l);
        ((Notification.Builder) this.f57l).setRemoteInputHistory(null);
        if (i13 >= 26) {
            AbstractC0009j.i((Notification.Builder) this.f57l);
            AbstractC0009j.o((Notification.Builder) this.f57l);
            AbstractC0009j.p((Notification.Builder) this.f57l);
            AbstractC0009j.q((Notification.Builder) this.f57l);
            AbstractC0009j.k((Notification.Builder) this.f57l);
            if (!TextUtils.isEmpty(eVar.f4460m)) {
                ((Notification.Builder) this.f57l).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it3 = arrayList8.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i13 >= 29) {
            s.f.b((Notification.Builder) this.f57l, eVar.n);
            s.f.c((Notification.Builder) this.f57l);
        }
        if (i13 >= 36) {
            E.f.f((Notification.Builder) this.f57l);
        }
    }

    public j(Context context, TypedArray typedArray) {
        this.f56k = 14;
        this.f57l = context;
        this.f58m = typedArray;
    }

    public j(p002b.d dVar) {
        this.f56k = 5;
        this.f58m = new CopyOnWriteArrayList();
        this.n = new HashMap();
        this.f57l = dVar;
    }

    public j(A a3) {
        this.f56k = 15;
        this.f57l = new A.l(30);
        this.f58m = new ArrayList();
        this.n = new ArrayList();
        new A(this, 22);
    }

    public j(p057t1.c cVar, FlutterJNI flutterJNI) {
        this.f56k = 1;
        B1.a aVar = new B1.a(this, 0);
        s sVar = new s(cVar, "flutter/accessibility", q.f177a, null);
        this.f57l = sVar;
        sVar.y(aVar);
        this.f58m = flutterJNI;
    }

    public j(v vVar) {
        this.f56k = 19;
        this.f58m = new HashSet();
        this.n = vVar;
        p052r1.n nVar = (p052r1.n) vVar;
        this.f57l = new u[]{new p052r1.s(nVar.getBinaryMessenger()), new p004b1.Q(new H0.i(nVar.getBinaryMessenger()))};
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
