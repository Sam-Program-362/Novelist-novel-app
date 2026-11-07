package B1;

import V.j0;
import V.k0;
import a.AbstractC0102a;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import b0.E;
import b0.I;
import d.InterfaceC0228c;
import j0.InterfaceC0318d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.AbstractC0410t;
import l0.C0411u;
import l0.InterfaceC0389L;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import t1.C0475c;

/* loaded from: classes.dex */
public final class a implements C1.b, C1.m, H.d, InterfaceC0228c, io.flutter.plugin.editing.a, InterfaceC0318d, InterfaceC0389L, l2.d {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f79k;

    /* renamed from: l, reason: collision with root package name */
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
        HashMap hashMap;
        HashMap hashMap2;
        A0.j jVar = (A0.j) this.f80l;
        if (((io.flutter.view.c) jVar.n) == null) {
            cVar.e(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.i iVar = (io.flutter.view.i) ((io.flutter.view.c) jVar.n).f3261a;
                    if (Build.VERSION.SDK_INT < 28) {
                        AccessibilityEvent e3 = iVar.e(0, 32);
                        e3.getText().add(str2);
                        iVar.i(e3);
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
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
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.c cVar3 = (io.flutter.view.c) jVar.n;
                    ((io.flutter.view.i) cVar3.f3261a).h(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.c cVar4 = (io.flutter.view.c) jVar.n;
                    ((io.flutter.view.i) cVar4.f3261a).h(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
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
        AbstractC0102a.n((I1.k) this.f80l, new I1.d("Clear Failed", ((I.a) obj).getMessage()));
    }

    @Override // j0.InterfaceC0318d
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // j0.InterfaceC0318d
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

    @Override // d.InterfaceC0228c
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

    @Override // l0.InterfaceC0389L
    public int f() {
        AbstractC0410t abstractC0410t = (AbstractC0410t) this.f80l;
        return abstractC0410t.f4023g - abstractC0410t.r();
    }

    public j0 g() {
        return (j0) ((l2.q) this.f80l).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v4, types: [T1.h, Z1.p] */
    @Override // l2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(l2.e r6, R1.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof l2.a
            if (r0 == 0) goto L13
            r0 = r7
            l2.a r0 = (l2.a) r0
            int r1 = r0.f4034q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4034q = r1
            goto L18
        L13:
            l2.a r0 = new l2.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f4032o
            int r1 = r0.f4034q
            O1.g r2 = O1.g.f1211a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            m2.l r6 = r0.n
            H2.h.E(r7)     // Catch: java.lang.Throwable -> L29
            goto L56
        L29:
            r7 = move-exception
            goto L60
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            H2.h.E(r7)
            m2.l r7 = new m2.l
            R1.h r1 = r0.f1277l
            a2.h.b(r1)
            r7.<init>(r6, r1)
            r0.n = r7     // Catch: java.lang.Throwable -> L5e
            r0.f4034q = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r5.f80l     // Catch: java.lang.Throwable -> L5e
            T1.h r6 = (T1.h) r6     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r6.e(r7, r0)     // Catch: java.lang.Throwable -> L5e
            S1.a r0 = S1.a.f1260k
            if (r6 != r0) goto L51
            goto L52
        L51:
            r6 = r2
        L52:
            if (r6 != r0) goto L55
            return r0
        L55:
            r6 = r7
        L56:
            r6.n()
            return r2
        L5a:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L60
        L5e:
            r6 = move-exception
            goto L5a
        L60:
            r6.n()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.a.h(l2.e, R1.c):java.lang.Object");
    }

    @Override // l0.InterfaceC0389L
    public int i(View view) {
        return (view.getTop() - ((C0411u) view.getLayoutParams()).f4024a.top) - ((ViewGroup.MarginLayoutParams) ((C0411u) view.getLayoutParams())).topMargin;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // C1.m
    public void k(A.c cVar, o oVar) {
        char c3;
        char c4;
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
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1019779949:
                        if (str.equals(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR)) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        Map map = (Map) obj;
                        boolean z3 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (((n) cVar2.f7m).r()) {
                                ((n) cVar2.f7m).q(new k(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, wrap));
                                oVar.d(null);
                                return;
                            }
                            if (z3) {
                                ((n) cVar2.f7m).n(new k(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                oVar.d(null);
                                return;
                            }
                            boolean z4 = map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue();
                            long j3 = ((n) cVar2.f7m).j(new k(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z4 ? 2 : 1, wrap));
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
                    case 1:
                        Map map2 = (Map) obj;
                        try {
                            ((n) cVar2.f7m).d(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e4) {
                            oVar.a("error", Log.getStackTraceString(e4), null);
                            return;
                        }
                    case 2:
                        Map map3 = (Map) obj;
                        try {
                            ((n) cVar2.f7m).e(new m(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new d(oVar, i5));
                            return;
                        } catch (IllegalStateException e5) {
                            oVar.a("error", Log.getStackTraceString(e5), null);
                            return;
                        }
                    case 3:
                        try {
                            ((n) cVar2.f7m).m(((Integer) obj).intValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e6) {
                            oVar.a("error", Log.getStackTraceString(e6), null);
                            return;
                        }
                    case 4:
                        try {
                            ((n) cVar2.f7m).a(((Boolean) obj).booleanValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e7) {
                            oVar.a("error", Log.getStackTraceString(e7), null);
                            return;
                        }
                    case 5:
                        List list = (List) obj;
                        try {
                            ((n) cVar2.f7m).i(new l(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e8) {
                            oVar.a("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case 6:
                        Map map4 = (Map) obj;
                        try {
                            ((n) cVar2.f7m).f(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e9) {
                            oVar.a("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case 7:
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
                switch (str3.hashCode()) {
                    case -1937987631:
                        if (str3.equals("SensitiveContent.getContentSensitivity")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 598223325:
                        if (str3.equals("SensitiveContent.setContentSensitivity")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1615625817:
                        if (str3.equals("SensitiveContent.isSupported")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                        try {
                            int d3 = ((G1.a) gVar.f90l).d();
                            if (d3 == 0) {
                                i3 = 0;
                            } else if (d3 == 1) {
                                i3 = 1;
                            } else if (d3 == 2) {
                                i3 = 2;
                            }
                            oVar.d(Integer.valueOf(i3));
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e11) {
                            oVar.a("error", e11.getMessage(), null);
                            return;
                        }
                    case 1:
                        int intValue = ((Integer) cVar.f7m).intValue();
                        try {
                            G1.a aVar = (G1.a) gVar.f90l;
                            if (intValue == 0) {
                                i4 = 0;
                            } else if (intValue == 1) {
                                i4 = 1;
                            } else if (intValue != 2) {
                                throw new IllegalArgumentException(e.h("contentSensitivityIndex ", intValue, " not known to the SensitiveContentChannel."));
                            }
                            aVar.e(i4);
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e12) {
                            oVar.a("error", e12.getMessage(), null);
                            return;
                        }
                    case 2:
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
        Context context = aVar.f273b;
        if (str2 != null) {
            Locale a3 = D1.a.a(str2);
            Configuration configuration = new Configuration(aVar.f273b.getResources().getConfiguration());
            configuration.setLocale(a3);
            context = aVar.f273b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", aVar.f273b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.f1434a > r2.f1434a) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Type inference failed for: r3v4, types: [B1.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(V.j0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            a2.h.e(r6, r0)
            java.lang.Object r0 = r5.f80l
            l2.q r0 = (l2.q) r0
        L9:
            java.lang.Object r1 = r0.a()
            r2 = r1
            V.j0 r2 = (V.j0) r2
            boolean r3 = r2 instanceof V.b0
            if (r3 == 0) goto L16
            r3 = 1
            goto L1c
        L16:
            V.k0 r3 = V.k0.f1439b
            boolean r3 = a2.h.a(r2, r3)
        L1c:
            if (r3 == 0) goto L1f
            goto L29
        L1f:
            boolean r3 = r2 instanceof V.C0079c
            if (r3 == 0) goto L2b
            int r3 = r6.f1434a
            int r4 = r2.f1434a
            if (r3 <= r4) goto L2f
        L29:
            r2 = r6
            goto L2f
        L2b:
            boolean r3 = r2 instanceof V.Z
            if (r3 == 0) goto L3e
        L2f:
            B1.g r3 = m2.k.f4120a
            if (r1 != 0) goto L34
            r1 = r3
        L34:
            if (r2 != 0) goto L37
            r2 = r3
        L37:
            boolean r1 = r0.c(r1, r2)
            if (r1 == 0) goto L9
            return
        L3e:
            D0.a r6 = new D0.a
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.a.m(V.j0):void");
    }

    @Override // l0.InterfaceC0389L
    public View n(int i3) {
        return ((AbstractC0410t) this.f80l).o(i3);
    }

    @Override // l0.InterfaceC0389L
    public int o() {
        return ((AbstractC0410t) this.f80l).u();
    }

    @Override // H.d
    public void onResult(Object obj) {
        ((I1.k) this.f80l).f(new O1.d(O1.g.f1211a));
    }

    @Override // l0.InterfaceC0389L
    public int q(View view) {
        return view.getBottom() + ((C0411u) view.getLayoutParams()).f4024a.bottom + ((ViewGroup.MarginLayoutParams) ((C0411u) view.getLayoutParams())).bottomMargin;
    }

    public a(C0475c c0475c, int i3) {
        this.f79k = i3;
        switch (i3) {
            case 6:
                new s(c0475c, "flutter/spellcheck", C1.r.f180a, null).z(new H0.i(this, 7));
                break;
            default:
                new s(c0475c, "flutter/mousecursor", C1.r.f180a, null).z(new H0.i(this, 3));
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
