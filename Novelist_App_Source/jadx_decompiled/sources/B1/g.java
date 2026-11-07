package B1;

import B1.g;
import D.C0013n;
import M1.C0073w;
import V.InterfaceC0084h;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.os.Parcel;
import android.util.Log;
import android.util.Size;
import android.view.View;
import androidx.lifecycle.A;
import androidx.lifecycle.InterfaceC0146s;
import b0.AbstractComponentCallbacksC0171s;
import b0.DialogInterfaceOnCancelListenerC0169p;
import b0.E;
import b0.I;
import b1.C0192Q;
import c1.AbstractC0224a;
import d.C0227b;
import d.InterfaceC0228c;
import io.flutter.embedding.engine.FlutterJNI;
import j1.C0329c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k.InterfaceC0349l;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.pipes.PipesServer;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import r1.InterfaceC0452B;
import r1.SurfaceHolderCallback2C0453C;
import s1.j;
import t1.C0473a;
import t1.C0475c;

/* loaded from: classes.dex */
public class g implements C1.m, L0.i, InterfaceC0084h, A, InterfaceC0228c, C1.h, InterfaceC0349l, InterfaceC0452B, C1.f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f89k;

    /* renamed from: l, reason: collision with root package name */
    public Object f90l;

    public /* synthetic */ g(Object obj, int i3) {
        this.f89k = i3;
        this.f90l = obj;
    }

    @Override // C1.f
    public C0473a a(C1.k kVar) {
        return ((t1.j) this.f90l).a(kVar);
    }

    @Override // L0.i
    public void accept(Object obj, Object obj2) {
        W0.b bVar = (W0.b) this.f90l;
        X0.f fVar = new X0.f((g1.e) obj2, 0);
        X0.d dVar = (X0.d) ((X0.e) obj).q();
        K0.f fVar2 = new K0.f(new K0.g(-1, -1, 0, true), false);
        fVar2.f638m = false;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i3 = AbstractC0224a.f2658a;
        obtain.writeStrongBinder(fVar);
        AbstractC0224a.b(obtain, bVar);
        AbstractC0224a.b(obtain, fVar2);
        ((X0.b) dVar).d(obtain, 9);
    }

    @Override // C1.f
    public void b(String str, C1.d dVar) {
        ((t1.j) this.f90l).c(str, dVar, null);
    }

    @Override // C1.f
    public void c(String str, C1.d dVar, C0473a c0473a) {
        ((t1.j) this.f90l).c(str, dVar, c0473a);
    }

    @Override // V.InterfaceC0084h
    public Object d(Z1.p pVar, T1.h hVar) {
        return ((InterfaceC0084h) this.f90l).d(new Y.c(pVar, null), hVar);
    }

    @Override // d.InterfaceC0228c
    public void e(Object obj) {
        C0227b c0227b = (C0227b) obj;
        I i3 = (I) this.f90l;
        E e3 = (E) i3.f2358E.pollLast();
        if (e3 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = e3.f2349k;
        int i4 = e3.f2350l;
        AbstractComponentCallbacksC0171s j3 = i3.f2371c.j(str);
        if (j3 != null) {
            j3.p(i4, c0227b.f2764k, c0227b.f2765l);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // C1.f
    public void f(String str, ByteBuffer byteBuffer, C1.e eVar) {
        ((t1.j) this.f90l).f(str, byteBuffer, eVar);
    }

    @Override // r1.InterfaceC0452B
    public void g() {
        ((SurfaceHolderCallback2C0453C) this.f90l).f4337b = null;
    }

    @Override // V.InterfaceC0084h
    public l2.d getData() {
        return ((InterfaceC0084h) this.f90l).getData();
    }

    @Override // C1.f
    public void h(String str, ByteBuffer byteBuffer) {
        ((t1.j) this.f90l).f(str, byteBuffer, null);
    }

    @Override // C1.h
    public void i(C1.g gVar) {
        ((C0329c) this.f90l).f3558r = gVar;
    }

    @Override // androidx.lifecycle.A
    public void j(Object obj) {
        InterfaceC0146s interfaceC0146s = (InterfaceC0146s) obj;
        DialogInterfaceOnCancelListenerC0169p dialogInterfaceOnCancelListenerC0169p = (DialogInterfaceOnCancelListenerC0169p) this.f90l;
        if (interfaceC0146s == null || !dialogInterfaceOnCancelListenerC0169p.f2493h0) {
            return;
        }
        dialogInterfaceOnCancelListenerC0169p.getClass();
        throw new IllegalStateException("Fragment " + dialogInterfaceOnCancelListenerC0169p + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // C1.m
    public void k(A.c cVar, o oVar) {
        Object obj;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        boolean z3 = true;
        switch (this.f89k) {
            case 0:
                A.c cVar2 = (A.c) this.f90l;
                if (((a) cVar2.f7m) == null) {
                    return;
                }
                String str = (String) cVar.f6l;
                str.getClass();
                if (!str.equals("Localization.getStringResource")) {
                    oVar.b();
                    return;
                }
                JSONObject jSONObject = (JSONObject) cVar.f7m;
                try {
                    oVar.d(((a) cVar2.f7m).l(jSONObject.getString(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                    return;
                } catch (JSONException e3) {
                    oVar.a("error", e3.getMessage(), null);
                    return;
                }
            case 1:
                A.c cVar3 = (A.c) this.f90l;
                if (((io.flutter.plugin.platform.o) cVar3.f7m) == null) {
                    return;
                }
                String str2 = (String) cVar.f6l;
                obj = cVar.f7m;
                str2.getClass();
                switch (str2) {
                    case "create":
                        Map map = (Map) obj;
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            int intValue = ((Integer) map.get("id")).intValue();
                            String str3 = (String) map.get("viewType");
                            int intValue2 = ((Integer) map.get("direction")).intValue();
                            io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) ((io.flutter.plugin.platform.o) cVar3.f7m).f3201l;
                            C0073w c0073w = (C0073w) ((HashMap) rVar.f3208k.f3201l).get(str3);
                            if (c0073w == null) {
                                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str3);
                            }
                            io.flutter.plugin.platform.g a3 = c0073w.a(wrap != null ? c0073w.f1166a.b(wrap) : null);
                            View view = a3.getView();
                            if (view == null) {
                                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                            }
                            view.setLayoutDirection(intValue2);
                            rVar.f3215s.put(intValue, a3);
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e4) {
                            oVar.a("error", Log.getStackTraceString(e4), null);
                            return;
                        }
                    case "clearFocus":
                        try {
                            ((io.flutter.plugin.platform.o) cVar3.f7m).m(((Integer) obj).intValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e5) {
                            oVar.a("error", Log.getStackTraceString(e5), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj;
                        try {
                            ((io.flutter.plugin.platform.o) cVar3.f7m).i(new l(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e6) {
                            oVar.a("error", Log.getStackTraceString(e6), null);
                            return;
                        }
                    case "setDirection":
                        Map map2 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.o) cVar3.f7m).f(((Integer) map2.get("id")).intValue(), ((Integer) map2.get("direction")).intValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e7) {
                            oVar.a("error", Log.getStackTraceString(e7), null);
                            return;
                        }
                    case "isSurfaceControlEnabled":
                        FlutterJNI flutterJNI = ((io.flutter.plugin.platform.r) ((io.flutter.plugin.platform.o) cVar3.f7m).f3201l).f3211o;
                        oVar.d(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                        return;
                    case "dispose":
                        try {
                            ((io.flutter.plugin.platform.o) cVar3.f7m).p(((Integer) ((Map) obj).get("id")).intValue());
                            oVar.d(null);
                            return;
                        } catch (IllegalStateException e8) {
                            oVar.a("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    default:
                        oVar.b();
                        return;
                }
            default:
                H0.i iVar = (H0.i) this.f90l;
                if (((C0192Q) iVar.f443l) == null) {
                    return;
                }
                String str4 = (String) cVar.f6l;
                str4.getClass();
                switch (str4.hashCode()) {
                    case -705821951:
                        if (str4.equals("Scribe.isFeatureAvailable")) {
                            break;
                        }
                        break;
                    case 1759284829:
                        if (str4.equals("Scribe.startStylusHandwriting")) {
                            break;
                        }
                        break;
                    case 2119738044:
                        if (str4.equals("Scribe.isStylusHandwritingAvailable")) {
                            break;
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:233)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instructions count: 938
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: B1.g.k(A.c, B1.o):void");
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [v1.a] */
            public Bitmap l(ByteBuffer byteBuffer, v1.d dVar) {
                ImageDecoder.Source createSource;
                Bitmap decodeBitmap;
                createSource = ImageDecoder.createSource(byteBuffer);
                try {
                    decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: v1.a
                        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                            ColorSpace colorSpace;
                            Size size;
                            ColorSpace.Named unused;
                            g gVar = g.this;
                            unused = ColorSpace.Named.SRGB;
                            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                            imageDecoder.setTargetColorSpace(colorSpace);
                            imageDecoder.setAllocator(1);
                            j jVar = (j) gVar.f90l;
                            if (jVar != null) {
                                size = imageInfo.getSize();
                                FlutterJNI.nativeImageHeaderCallback(jVar.f4529a, size.getWidth(), size.getHeight());
                            }
                        }
                    });
                    return decodeBitmap;
                } catch (IOException e3) {
                    Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e3);
                    return null;
                }
            }

            public void n(int i3, t tVar) {
                io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f90l;
                jVar.d();
                jVar.f3141f = tVar;
                jVar.f3140e = new C0013n(2, i3);
                jVar.f3143h.e(jVar);
                s sVar = tVar.f156j;
                jVar.f3143h = new io.flutter.plugin.editing.f(sVar != null ? (v) sVar.n : null, jVar.f3136a);
                jVar.e(tVar);
                jVar.f3144i = true;
                if (jVar.f3140e.f252b == 3) {
                    jVar.f3150p = false;
                }
                jVar.f3148m = null;
                jVar.f3143h.a(jVar);
            }

            public void o(double d3, double d4, double[] dArr) {
                io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f90l;
                double[] dArr2 = new double[4];
                boolean z3 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
                double d5 = dArr[12];
                double d6 = dArr[15];
                double d7 = d5 / d6;
                dArr2[1] = d7;
                dArr2[0] = d7;
                double d8 = dArr[13] / d6;
                dArr2[3] = d8;
                dArr2[2] = d8;
                g1.h hVar = new g1.h(z3, dArr, dArr2);
                hVar.a(d3, 0.0d);
                hVar.a(d3, d4);
                hVar.a(0.0d, d4);
                double d9 = jVar.f3136a.getContext().getResources().getDisplayMetrics().density;
                jVar.f3148m = new Rect((int) (dArr2[0] * d9), (int) (dArr2[2] * d9), (int) Math.ceil(dArr2[1] * d9), (int) Math.ceil(dArr2[3] * d9));
            }

            @Override // C1.h
            public void onCancel() {
                ((C0329c) this.f90l).f3558r = null;
            }

            public void p(v vVar) {
                v vVar2;
                int i3;
                int i4;
                io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f90l;
                View view = jVar.f3136a;
                if (!jVar.f3144i && (vVar2 = jVar.f3149o) != null && (i3 = vVar2.f166d) >= 0 && (i4 = vVar2.f167e) > i3) {
                    int i5 = i4 - i3;
                    int i6 = vVar.f167e;
                    int i7 = vVar.f166d;
                    boolean z3 = true;
                    if (i5 == i6 - i7) {
                        int i8 = 0;
                        while (true) {
                            if (i8 >= i5) {
                                z3 = false;
                                break;
                            } else if (vVar2.f163a.charAt(i8 + i3) != vVar.f163a.charAt(i8 + i7)) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                    jVar.f3144i = z3;
                }
                jVar.f3149o = vVar;
                jVar.f3143h.f(vVar);
                if (jVar.f3144i) {
                    jVar.f3137b.restartInput(view);
                    jVar.f3144i = false;
                }
            }

            public void q(boolean z3) {
                ((WebSettingsBoundaryInterface) this.f90l).setPaymentRequestEnabled(z3);
            }

            @Override // r1.InterfaceC0452B
            public void r(io.flutter.embedding.engine.renderer.k kVar) {
                ((SurfaceHolderCallback2C0453C) this.f90l).f4337b = kVar;
            }

            public void s() {
                ArrayDeque arrayDeque = (ArrayDeque) this.f90l;
                if (arrayDeque.isEmpty()) {
                    return;
                }
                throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + u());
            }

            public void t(long j3) {
                long u = u();
                if (u != j3) {
                    if (u != -1) {
                        if (u != -2) {
                            return;
                        } else {
                            u = -2;
                        }
                    }
                    throw new IOException("expected non-string scope or scope " + j3 + " but found " + u);
                }
            }

            public String toString() {
                switch (this.f89k) {
                    case 18:
                        return "<" + ((String) this.f90l) + '>';
                    default:
                        return super.toString();
                }
            }

            public long u() {
                ArrayDeque arrayDeque = (ArrayDeque) this.f90l;
                if (arrayDeque.isEmpty()) {
                    return 0L;
                }
                return ((Long) arrayDeque.peek()).longValue();
            }

            public g(int i3) {
                this.f89k = i3;
                switch (i3) {
                    case 12:
                        this.f90l = new ArrayDeque(16);
                        break;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        break;
                    default:
                        this.f90l = new AtomicInteger(0);
                        break;
                }
            }

            public g(C0475c c0475c, int i3) {
                this.f89k = i3;
                switch (i3) {
                    case 4:
                        this.f90l = new s(c0475c, "flutter/system", C1.j.f175a, null);
                        break;
                    default:
                        new s(c0475c, "flutter/sensitivecontent", C1.r.f180a, null).z(new a(this, 5));
                        break;
                }
            }

            @Override // r1.InterfaceC0452B
            public void m() {
            }
        }
