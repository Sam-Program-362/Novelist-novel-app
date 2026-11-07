package B1;

import V.C0079c;
import V.Z;
import V.b0;
import V.j0;
import V.k0;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import p003b0.E;
import p003b0.I;
import p035l0.L;

/* JADX INFO: loaded from: classes.dex */
public final class a implements C1.b, C1.m, H.d, p007d.c, io.flutter.plugin.editing.a, p029j0.d, L, l2.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f79k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f80l;

    public /* synthetic */ a(Object obj, int i3) {
        this.f79k = i3;
        this.f80l = obj;
    }

    public static int j(int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        return i5 + 1 > i4 ? i6 + 1 : i6;
    }

    @Override // C1.b
    public void a(Object obj, A.c cVar) {
        A0.j jVar = (A0.j) this.f80l;
        if (((io.flutter.view.c) jVar.n) == null) {
            cVar.e(null);
            return;
        }
        HashMap map = (HashMap) obj;
        String str = (String) map.get("type");
        HashMap map2 = (HashMap) map.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) map2.get("message");
                if (str2 != null) {
                    io.flutter.view.i iVar = (io.flutter.view.i) ((io.flutter.view.c) jVar.n).f3261a;
                    if (Build.VERSION.SDK_INT < 28) {
                        AccessibilityEvent accessibilityEventE = iVar.e(0, 32);
                        accessibilityEventE.getText().add(str2);
                        iVar.i(accessibilityEventE);
                    }
                    break;
                }
                break;
            case "announce":
                String str3 = (String) map2.get("message");
                if (str3 != null) {
                    io.flutter.view.c cVar2 = (io.flutter.view.c) jVar.n;
                    if (Build.VERSION.SDK_INT >= 36) {
                        cVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.i) cVar2.f3261a).f3344a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) map.get("nodeId");
                if (num != null) {
                    io.flutter.view.c cVar3 = (io.flutter.view.c) jVar.n;
                    ((io.flutter.view.i) cVar3.f3261a).h(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) map.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.c cVar4 = (io.flutter.view.c) jVar.n;
                    ((io.flutter.view.i) cVar4.f3261a).h(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) map.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.c cVar5 = (io.flutter.view.c) jVar.n;
                    ((io.flutter.view.i) cVar5.f3261a).h(num3.intValue(), 2);
                    break;
                }
                break;
        }
        cVar.e(null);
    }

    @Override // H.d
    public void b(Object obj) {
        p000a.a.n((I1.k) this.f80l, new I1.d("Clear Failed", ((I.a) obj).getMessage()));
    }

    @Override // p029j0.d
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p029j0.d
    public void d(int i3, Object obj) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
            default:
                str = StringUtils.EMPTY;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f80l).setResultCode(i3);
    }

    @Override // p007d.c
    public void e(Object obj) {
        Map map = (Map) obj;
        I i3 = (I) this.f80l;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
        }
        E e3 = (E) i3.f2358E.pollFirst();
        if (e3 == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = e3.f2349k;
            if (i3.f2371c.j(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // p035l0.L
    public int f() {
        p035l0.t tVar = (p035l0.t) this.f80l;
        return tVar.f4023g - tVar.r();
    }

    public j0 g() {
        return (j0) ((l2.q) this.f80l).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T1.h, Z1.p] */
    @Override // l2.d
    public Object h(l2.e eVar, R1.c cVar) throws Throwable {
        l2.a aVar;
        Throwable th;
        m2.l lVar;
        if (cVar instanceof l2.a) {
            aVar = (l2.a) cVar;
            int i3 = aVar.f4034q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f4034q = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new l2.a(this, cVar);
            }
        } else {
            aVar = new l2.a(this, cVar);
        }
        Object obj = aVar.f4032o;
        int i4 = aVar.f4034q;
        O1.g gVar = O1.g.f1211a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = aVar.n;
            try {
                H2.h.E(obj);
                lVar.n();
                return gVar;
            } catch (Throwable th2) {
                th = th2;
                lVar.n();
                throw th;
            }
        }
        H2.h.E(obj);
        R1.h hVar = aVar.f1277l;
        a2.h.b(hVar);
        m2.l lVar2 = new m2.l(eVar, hVar);
        try {
            aVar.n = lVar2;
            aVar.f4034q = 1;
            Object objE = ((T1.h) this.f80l).e(lVar2, aVar);
            S1.a aVar2 = S1.a.f1260k;
            if (objE != aVar2) {
                objE = gVar;
            }
            if (objE == aVar2) {
                return aVar2;
            }
            lVar = lVar2;
            lVar.n();
            return gVar;
        } catch (Throwable th3) {
            th = th3;
            lVar = lVar2;
            lVar.n();
            throw th;
        }
    }

    @Override // p035l0.L
    public int i(View view) {
        return (view.getTop() - ((p035l0.u) view.getLayoutParams()).f4024a.top) - ((ViewGroup.MarginLayoutParams) ((p035l0.u) view.getLayoutParams())).topMargin;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:78:0x0126  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    @Override // C1.m
    public void k(A.c cVar, o oVar) {
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        switch (this.f79k) {
            case 3:
                A.c cVar2 = (A.c) this.f80l;
                if (((n) cVar2.f7m) == null) {
                    return;
                }
                String str = (String) cVar.f6l;
                Object obj = cVar.f7m;
                str.getClass();
                switch (str) {
                    case "create":
                        Map map = (Map) obj;
                        boolean z3 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (((n) cVar2.f7m).r()) {
                                ((n) cVar2.f7m).q(new k(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, byteBufferWrap));
                                oVar.d(null);
                                return;
                            }
                            if (z3) {
                                ((n) cVar2.f7m).n(new k(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, byteBufferWrap));
                                oVar.d(null);
                                return;
                            }
                            boolean z4 = map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue();
                            long j3 = ((n) cVar2.f7m).j(new k(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z4 ? 2 : 1, byteBufferWrap));
                            if (j3 != -2) {
                                oVar.d(Long.valueOf(j3));
                                return;
                            } else {
                                if (!z4) {
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                oVar.d(null);
                                return;
                            }
                        } catch (IllegalStateException e3) {
                            oVar.a("error", Log.getStackTraceString(e3), null);
                            return;
                        }
                    case "offset":
                        Map map2 = (Map) obj;
                        try {
                            ((n) cVar2.f7m).d(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e4) {
                            oVar.a("error", Log.getStackTraceString(e4), null);
                            return;
                        }
                    case "resize":
                        Map map3 = (Map) obj;
                        try {
                            ((n) cVar2.f7m).e(new m(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new d(oVar, i5));
                            return;
                        } catch (IllegalStateException e5) {
                            oVar.a("error", Log.getStackTraceString(e5), null);
                            return;
                        }
                    case "clearFocus":
                        try {
                            ((n) cVar2.f7m).m(((Integer) obj).intValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e6) {
                            oVar.a("error", Log.getStackTraceString(e6), null);
                            return;
                        }
                    case "synchronizeToNativeViewHierarchy":
                        try {
                            ((n) cVar2.f7m).a(((Boolean) obj).booleanValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e7) {
                            oVar.a("error", Log.getStackTraceString(e7), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj;
                        try {
                            ((n) cVar2.f7m).i(new l(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e8) {
                            oVar.a("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case "setDirection":
                        Map map4 = (Map) obj;
                        try {
                            ((n) cVar2.f7m).f(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e9) {
                            oVar.a("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case "dispose":
                        try {
                            ((n) cVar2.f7m).p(((Integer) ((Map) obj).get("id")).intValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e10) {
                            oVar.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    default:
                        oVar.b();
                        return;
                }
            case 4:
                p pVar = (p) this.f80l;
                String str2 = (String) cVar.f6l;
                Object obj2 = cVar.f7m;
                str2.getClass();
                if (!str2.equals("get")) {
                    if (!str2.equals("put")) {
                        oVar.b();
                        return;
                    } else {
                        pVar.f136d = (byte[]) obj2;
                        oVar.d(null);
                        return;
                    }
                }
                pVar.f135c = true;
                if (pVar.f134b || !pVar.f133a) {
                    oVar.d(p.b((byte[]) pVar.f136d));
                    return;
                } else {
                    pVar.f138f = oVar;
                    return;
                }
            default:
                g gVar = (g) this.f80l;
                if (((G1.a) gVar.f90l) == null) {
                    return;
                }
                String str3 = (String) cVar.f6l;
                str3.getClass();
                switch (str3) {
                    case "SensitiveContent.getContentSensitivity":
                        try {
                            int iD = ((G1.a) gVar.f90l).d();
                            if (iD == 0) {
                                i3 = 0;
                            } else if (iD == 1) {
                                i3 = 1;
                            } else if (iD == 2) {
                                i3 = 2;
                            }
                            oVar.d(Integer.valueOf(i3));
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e11) {
                            oVar.a("error", e11.getMessage(), null);
                            return;
                        }
                    case "SensitiveContent.setContentSensitivity":
                        int iIntValue = ((Integer) cVar.f7m).intValue();
                        try {
                            G1.a aVar = (G1.a) gVar.f90l;
                            if (iIntValue == 0) {
                                i4 = 0;
                            } else if (iIntValue == 1) {
                                i4 = 1;
                            } else if (iIntValue != 2) {
                                throw new IllegalArgumentException(e.h("contentSensitivityIndex ", iIntValue, " not known to the SensitiveContentChannel."));
                            }
                            aVar.e(i4);
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e12) {
                            oVar.a("error", e12.getMessage(), null);
                            return;
                        }
                    case "SensitiveContent.isSupported":
                        ((G1.a) gVar.f90l).getClass();
                        oVar.d(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                        return;
                    default:
                        oVar.b();
                        return;
                }
        }
    }

    public String l(String str, String str2) {
        D1.a aVar = (D1.a) this.f80l;
        Context contextCreateConfigurationContext = aVar.f273b;
        if (str2 != null) {
            Locale localeA = D1.a.a(str2);
            Configuration configuration = new Configuration(aVar.f273b.getResources().getConfiguration());
            configuration.setLocale(localeA);
            contextCreateConfigurationContext = aVar.f273b.createConfigurationContext(configuration);
        }
        int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", aVar.f273b.getPackageName());
        if (identifier != 0) {
            return contextCreateConfigurationContext.getResources().getString(identifier);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    public void m(j0 j0Var) {
        Object objA;
        Object obj;
        a2.h.e(j0Var, "newState");
        l2.q qVar = (l2.q) this.f80l;
        do {
            objA = qVar.a();
            j0 j0Var2 = (j0) objA;
            if (j0Var2 instanceof b0 ? true : a2.h.a(j0Var2, k0.f1439b)) {
                obj = j0Var2;
                obj = j0Var;
            } else if (j0Var2 instanceof C0079c) {
                if (j0Var.f1434a > j0Var2.f1434a) {
                    obj = j0Var2;
                    obj = j0Var;
                }
            } else if (!(j0Var2 instanceof Z)) {
                obj = j0Var2;
                throw new D0.a();
            }
            obj = j0Var2;
            obj = j0Var2;
            g gVar = m2.k.f4120a;
            if (objA == null) {
                objA = gVar;
            }
            if (obj == null) {
                obj = gVar;
            }
        } while (!qVar.c(objA, obj));
    }

    @Override // p035l0.L
    public View n(int i3) {
        return ((p035l0.t) this.f80l).o(i3);
    }

    @Override // p035l0.L
    public int o() {
        return ((p035l0.t) this.f80l).u();
    }

    @Override // H.d
    public void onResult(Object obj) {
        ((I1.k) this.f80l).f(new O1.d(O1.g.f1211a));
    }

    @Override // p035l0.L
    public int q(View view) {
        return view.getBottom() + ((p035l0.u) view.getLayoutParams()).f4024a.bottom + ((ViewGroup.MarginLayoutParams) ((p035l0.u) view.getLayoutParams())).bottomMargin;
    }

    public a(p057t1.c cVar, int i3) {
        this.f79k = i3;
        switch (i3) {
            case 6:
                new s(cVar, "flutter/spellcheck", C1.r.f180a, null).z(new H0.i(this, 7));
                break;
            default:
                new s(cVar, "flutter/mousecursor", C1.r.f180a, null).z(new H0.i(this, 3));
                break;
        }
    }

    public a(int i3) {
        this.f79k = i3;
        switch (i3) {
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                this.f80l = new SparseIntArray();
                break;
            default:
                this.f80l = new l2.q(k0.f1439b);
                break;
        }
    }

    public a(boolean z3) {
        this.f79k = 13;
        this.f80l = new AtomicBoolean(z3);
    }

    public a(C1.f fVar) {
        this.f79k = 1;
        new s(fVar, "flutter/keyboard", C1.r.f180a, null).z(new A.c(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Z1.p pVar) {
        this.f79k = 22;
        this.f80l = (T1.h) pVar;
    }
}
