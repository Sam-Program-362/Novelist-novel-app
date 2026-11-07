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
import androidx.lifecycle.InterfaceC0144s;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.pipes.PipesServer;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import p003b0.AbstractComponentCallbacksC0163s;
import p003b0.DialogInterfaceOnCancelListenerC0161p;
import p003b0.E;
import p003b0.I;
import p004b1.Q;
import p031k.InterfaceC0234l;
import p052r1.B;
import p052r1.C;
import p054s1.j;

/* JADX INFO: loaded from: classes.dex */
public class g implements C1.m, L0.i, InterfaceC0084h, A, p007d.c, C1.h, InterfaceC0234l, B, C1.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f89k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f90l;

    public /* synthetic */ g(Object obj, int i3) {
        this.f89k = i3;
        this.f90l = obj;
    }

    @Override // C1.f
    public p057t1.a a(C1.k kVar) {
        return ((p057t1.j) this.f90l).a(kVar);
    }

    @Override // L0.i
    public void accept(Object obj, Object obj2) {
        W0.b bVar = (W0.b) this.f90l;
        X0.f fVar = new X0.f((p019g1.e) obj2, 0);
        X0.d dVar = (X0.d) ((X0.e) obj).q();
        K0.f fVar2 = new K0.f(new K0.g(-1, -1, 0, true), false);
        fVar2.f638m = false;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i3 = p006c1.a.f2658a;
        parcelObtain.writeStrongBinder(fVar);
        p006c1.a.b(parcelObtain, bVar);
        p006c1.a.b(parcelObtain, fVar2);
        ((X0.b) dVar).d(parcelObtain, 9);
    }

    @Override // C1.f
    public void b(String str, C1.d dVar) {
        ((p057t1.j) this.f90l).c(str, dVar, null);
    }

    @Override // C1.f
    public void c(String str, C1.d dVar, p057t1.a aVar) {
        ((p057t1.j) this.f90l).c(str, dVar, aVar);
    }

    @Override // V.InterfaceC0084h
    public Object d(Z1.p pVar, T1.h hVar) {
        return ((InterfaceC0084h) this.f90l).d(new Y.c(pVar, null), hVar);
    }

    @Override // p007d.c
    public void e(Object obj) {
        p007d.b bVar = (p007d.b) obj;
        I i3 = (I) this.f90l;
        E e3 = (E) i3.f2358E.pollLast();
        if (e3 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = e3.f2349k;
        int i4 = e3.f2350l;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163sJ = i3.f2371c.j(str);
        if (abstractComponentCallbacksC0163sJ != null) {
            abstractComponentCallbacksC0163sJ.p(i4, bVar.f2764k, bVar.f2765l);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // C1.f
    public void f(String str, ByteBuffer byteBuffer, C1.e eVar) {
        ((p057t1.j) this.f90l).f(str, byteBuffer, eVar);
    }

    @Override // p052r1.B
    public void g() {
        ((C) this.f90l).f4337b = null;
    }

    @Override // V.InterfaceC0084h
    public l2.d getData() {
        return ((InterfaceC0084h) this.f90l).getData();
    }

    @Override // C1.f
    public void h(String str, ByteBuffer byteBuffer) {
        ((p057t1.j) this.f90l).f(str, byteBuffer, null);
    }

    @Override // C1.h
    public void i(C1.g gVar) {
        ((p030j1.c) this.f90l).f3558r = gVar;
    }

    @Override // androidx.lifecycle.A
    public void j(Object obj) {
        InterfaceC0144s interfaceC0144s = (InterfaceC0144s) obj;
        DialogInterfaceOnCancelListenerC0161p dialogInterfaceOnCancelListenerC0161p = (DialogInterfaceOnCancelListenerC0161p) this.f90l;
        if (interfaceC0144s == null || !dialogInterfaceOnCancelListenerC0161p.f2493h0) {
            return;
        }
        dialogInterfaceOnCancelListenerC0161p.getClass();
        throw new IllegalStateException("Fragment " + dialogInterfaceOnCancelListenerC0161p + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // C1.m
    public void k(A.c cVar, o oVar) {
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
                Object obj = cVar.f7m;
                str2.getClass();
                switch (str2) {
                    case "create":
                        Map map = (Map) obj;
                        ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            int iIntValue = ((Integer) map.get("id")).intValue();
                            String str3 = (String) map.get("viewType");
                            int iIntValue2 = ((Integer) map.get("direction")).intValue();
                            io.flutter.plugin.platform.r rVar = (io.flutter.plugin.platform.r) ((io.flutter.plugin.platform.o) cVar3.f7m).f3201l;
                            C0073w c0073w = (C0073w) ((HashMap) rVar.f3208k.f3201l).get(str3);
                            if (c0073w == null) {
                                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str3);
                            }
                            io.flutter.plugin.platform.g gVarA = c0073w.a(byteBufferWrap != null ? c0073w.f1166a.b(byteBufferWrap) : null);
                            View view = gVarA.getView();
                            if (view == null) {
                                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                            }
                            view.setLayoutDirection(iIntValue2);
                            rVar.f3215s.put(iIntValue, gVarA);
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
                if (((Q) iVar.f443l) == null) {
                    return;
                }
                String str4 = (String) cVar.f6l;
                str4.getClass();
                switch (str4.hashCode()) {
                    case -705821951:
                        if (str4.equals("Scribe.isFeatureAvailable")) {
                        }
                        break;
                    case 1759284829:
                        if (str4.equals("Scribe.startStylusHandwriting")) {
                        }
                        break;
                    case 2119738044:
                        if (str4.equals("Scribe.isStylusHandwritingAvailable")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instruction units count: 938
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: B1.g.k(A.c, B1.o):void");
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [v1.a] */
            public Bitmap l(ByteBuffer byteBuffer, p062v1.d dVar) {
                try {
                    return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: v1.a
                        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                            g gVar = this.f4622a;
                            ColorSpace.Named unused = ColorSpace.Named.SRGB;
                            imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                            imageDecoder.setAllocator(1);
                            j jVar = (j) gVar.f90l;
                            if (jVar != null) {
                                Size size = imageInfo.getSize();
                                FlutterJNI.nativeImageHeaderCallback(jVar.f4529a, size.getWidth(), size.getHeight());
                            }
                        }
                    });
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
                p019g1.h hVar = new p019g1.h(z3, dArr, dArr2);
                hVar.a(d3, 0.0d);
                hVar.a(d3, d4);
                hVar.a(0.0d, d4);
                double d9 = jVar.f3136a.getContext().getResources().getDisplayMetrics().density;
                jVar.f3148m = new Rect((int) (dArr2[0] * d9), (int) (dArr2[2] * d9), (int) Math.ceil(dArr2[1] * d9), (int) Math.ceil(dArr2[3] * d9));
            }

            @Override // C1.h
            public void onCancel() {
                ((p030j1.c) this.f90l).f3558r = null;
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

            @Override // p052r1.B
            public void r(io.flutter.embedding.engine.renderer.k kVar) {
                ((C) this.f90l).f4337b = kVar;
            }

            public void s() throws IOException {
                ArrayDeque arrayDeque = (ArrayDeque) this.f90l;
                if (arrayDeque.isEmpty()) {
                    return;
                }
                throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + u());
            }

            public void t(long j3) throws IOException {
                long jU = u();
                if (jU != j3) {
                    if (jU != -1) {
                        if (jU != -2) {
                            return;
                        } else {
                            jU = -2;
                        }
                    }
                    throw new IOException("expected non-string scope or scope " + j3 + " but found " + jU);
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

            public g(p057t1.c cVar, int i3) {
                this.f89k = i3;
                switch (i3) {
                    case 4:
                        this.f90l = new s(cVar, "flutter/system", C1.j.f175a, null);
                        break;
                    default:
                        new s(cVar, "flutter/sensitivecontent", C1.r.f180a, null).z(new a(this, 5));
                        break;
                }
            }

            @Override // p052r1.B
            public void m() {
            }
        }
