package H0;

import C1.m;
import K1.B;
import Y0.n;
import Y0.s;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import b0.AbstractComponentCallbacksC0171s;
import b0.C0173u;
import b0.E;
import b0.I;
import b1.C0192Q;
import c1.AbstractC0224a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import d.C0227b;
import d.InterfaceC0228c;
import j.o;
import j.t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import k.C0346i;
import k.N;
import l0.AbstractC0410t;
import l0.C0411u;
import l0.InterfaceC0389L;
import l1.InterfaceC0419c;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONException;
import r1.InterfaceC0452B;
import r1.SurfaceHolderCallback2C0453C;
import t1.C0475c;

/* loaded from: classes.dex */
public final class i implements m, l2.d, L0.i, InterfaceC0228c, N, o, InterfaceC0389L, InterfaceC0419c, InterfaceC0452B, s0.m {

    /* renamed from: m, reason: collision with root package name */
    public static i f441m;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f442k;

    /* renamed from: l, reason: collision with root package name */
    public Object f443l;

    public /* synthetic */ i(Object obj, int i3) {
        this.f442k = i3;
        this.f443l = obj;
    }

    public static boolean t(int i3) {
        return (48 <= i3 && i3 <= 57) || i3 == 35 || i3 == 42;
    }

    private final void v(A.c cVar, B1.o oVar) {
        A.c cVar2 = (A.c) this.f443l;
        if (((F1.a) cVar2.f7m) == null) {
            return;
        }
        String str = (String) cVar.f6l;
        Object obj = cVar.f7m;
        str.getClass();
        if (!str.equals("ProcessText.processTextAction")) {
            if (!str.equals("ProcessText.queryTextActions")) {
                oVar.b();
                return;
            }
            try {
                oVar.d(((F1.a) cVar2.f7m).c());
                return;
            } catch (IllegalStateException e3) {
                oVar.a("error", e3.getMessage(), null);
                return;
            }
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            ((F1.a) cVar2.f7m).b((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), oVar);
        } catch (IllegalStateException e4) {
            oVar.a("error", e4.getMessage(), null);
        }
    }

    public static synchronized i w(Context context) {
        i iVar;
        synchronized (i.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (i.class) {
                iVar = f441m;
                if (iVar == null) {
                    iVar = new i(applicationContext);
                    f441m = iVar;
                }
            }
            return iVar;
        }
        return iVar;
    }

    @Override // l1.InterfaceC0419c
    public void a(Object obj, String str) {
        ((B1.o) this.f443l).a("sqlite_error", str, obj);
    }

    @Override // L0.i
    public void accept(Object obj, Object obj2) {
        switch (this.f442k) {
            case 13:
                g1.e eVar = (g1.e) obj2;
                O0.a aVar = (O0.a) ((O0.c) obj).q();
                M0.j jVar = (M0.j) this.f443l;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(aVar.f1580c);
                int i3 = Z0.a.f1676a;
                if (jVar == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                }
                try {
                    aVar.f1579b.transact(1, obtain, null, 1);
                    obtain.recycle();
                    eVar.b(null);
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            case 14:
            default:
                Y0.b bVar = (Y0.b) this.f443l;
                Y0.d dVar = new Y0.d(bVar, (g1.e) obj2, 0);
                s sVar = (s) ((Y0.e) obj).q();
                K0.f a3 = Y0.f.a();
                String str = bVar.f1583k;
                Parcel d3 = sVar.d();
                int i4 = n.f1605a;
                d3.writeStrongBinder(dVar);
                d3.writeString(str);
                n.b(d3, a3);
                sVar.e(d3, 2);
                return;
            case 15:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.f443l;
                X0.f fVar = new X0.f((g1.e) obj2, 1);
                X0.d dVar2 = (X0.d) ((X0.e) obj).q();
                K0.f fVar2 = new K0.f(new K0.g(-1, -1, 0, true), false);
                fVar2.f638m = false;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i5 = AbstractC0224a.f2658a;
                obtain2.writeStrongBinder(fVar);
                AbstractC0224a.b(obtain2, getCredentialRequest);
                AbstractC0224a.b(obtain2, fVar2);
                ((X0.b) dVar2).d(obtain2, 1);
                return;
        }
    }

    @Override // j.o
    public void b(j.j jVar, boolean z3) {
        if (jVar instanceof t) {
            ((t) jVar).f3502v.j().c(false);
        }
        o oVar = ((C0346i) this.f443l).f3703o;
        if (oVar != null) {
            oVar.b(jVar, z3);
        }
    }

    @Override // k.N
    public void c(j.j jVar, MenuItem menuItem) {
        ((j.g) this.f443l).f3418p.removeCallbacksAndMessages(jVar);
    }

    @Override // s0.m
    public String[] d() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f443l).getSupportedFeatures();
    }

    @Override // d.InterfaceC0228c
    public void e(Object obj) {
        C0227b c0227b = (C0227b) obj;
        I i3 = (I) this.f443l;
        E e3 = (E) i3.f2358E.pollFirst();
        if (e3 == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = e3.f2349k;
        int i4 = e3.f2350l;
        AbstractComponentCallbacksC0171s j3 = i3.f2371c.j(str);
        if (j3 != null) {
            j3.p(i4, c0227b.f2764k, c0227b.f2765l);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // l0.InterfaceC0389L
    public int f() {
        AbstractC0410t abstractC0410t = (AbstractC0410t) this.f443l;
        return abstractC0410t.f4022f - abstractC0410t.t();
    }

    @Override // r1.InterfaceC0452B
    public void g() {
        SurfaceHolderCallback2C0453C surfaceHolderCallback2C0453C = (SurfaceHolderCallback2C0453C) this.f443l;
        surfaceHolderCallback2C0453C.f4336a.setAlpha(0.0f);
        io.flutter.embedding.engine.renderer.k kVar = surfaceHolderCallback2C0453C.f4337b;
        if (kVar != null) {
            kVar.g(surfaceHolderCallback2C0453C.f4339d);
        }
        surfaceHolderCallback2C0453C.f4337b = null;
    }

    @Override // s0.m
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) E2.a.d(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f443l).getStatics());
    }

    @Override // s0.m
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) E2.a.d(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f443l).getWebkitToCompatConverter());
    }

    @Override // l2.d
    public Object h(l2.e eVar, R1.c cVar) {
        switch (this.f442k) {
            case 12:
                Object h3 = ((l2.d) this.f443l).h(new B(eVar, 0), cVar);
                if (h3 != S1.a.f1260k) {
                    break;
                }
                break;
            default:
                Object h4 = ((C0192Q) this.f443l).h(new B(eVar, 1), cVar);
                if (h4 != S1.a.f1260k) {
                    break;
                }
                break;
        }
        return O1.g.f1211a;
    }

    @Override // l0.InterfaceC0389L
    public int i(View view) {
        return (view.getLeft() - ((C0411u) view.getLayoutParams()).f4024a.left) - ((ViewGroup.MarginLayoutParams) ((C0411u) view.getLayoutParams())).leftMargin;
    }

    @Override // j.o
    public boolean j(j.j jVar) {
        C0346i c0346i = (C0346i) this.f443l;
        if (jVar == c0346i.f3702m) {
            return false;
        }
        ((t) jVar).f3503w.getClass();
        c0346i.getClass();
        o oVar = c0346i.f3703o;
        if (oVar != null) {
            return oVar.j(jVar);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x045d A[Catch: JSONException -> 0x031a, TryCatch #8 {JSONException -> 0x031a, blocks: (B:157:0x0306, B:158:0x030a, B:163:0x03ba, B:165:0x03bf, B:167:0x03eb, B:170:0x040f, B:172:0x0402, B:175:0x0409, B:176:0x041e, B:178:0x0442, B:188:0x0446, B:181:0x0453, B:183:0x045d, B:185:0x046a, B:190:0x044b, B:191:0x046f, B:193:0x047d, B:194:0x048e, B:196:0x048b, B:197:0x0493, B:199:0x04a5, B:200:0x04aa, B:202:0x04d1, B:204:0x04e1, B:231:0x05a2, B:207:0x05bc, B:209:0x05cc, B:210:0x05d9, B:242:0x04c8, B:263:0x0515, B:256:0x0533, B:228:0x0577, B:249:0x059a, B:235:0x05b4, B:214:0x05de, B:265:0x030f, B:268:0x031d, B:271:0x0328, B:274:0x0332, B:277:0x033d, B:280:0x0348, B:283:0x0354, B:286:0x035e, B:289:0x0368, B:292:0x0372, B:295:0x037c, B:298:0x0386, B:301:0x0391, B:304:0x039c, B:307:0x03a7, B:217:0x053c, B:219:0x0546, B:220:0x0549, B:222:0x055f, B:223:0x0571, B:226:0x0568), top: B:156:0x0306, inners: #4, #14, #15, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x046a A[Catch: JSONException -> 0x031a, TryCatch #8 {JSONException -> 0x031a, blocks: (B:157:0x0306, B:158:0x030a, B:163:0x03ba, B:165:0x03bf, B:167:0x03eb, B:170:0x040f, B:172:0x0402, B:175:0x0409, B:176:0x041e, B:178:0x0442, B:188:0x0446, B:181:0x0453, B:183:0x045d, B:185:0x046a, B:190:0x044b, B:191:0x046f, B:193:0x047d, B:194:0x048e, B:196:0x048b, B:197:0x0493, B:199:0x04a5, B:200:0x04aa, B:202:0x04d1, B:204:0x04e1, B:231:0x05a2, B:207:0x05bc, B:209:0x05cc, B:210:0x05d9, B:242:0x04c8, B:263:0x0515, B:256:0x0533, B:228:0x0577, B:249:0x059a, B:235:0x05b4, B:214:0x05de, B:265:0x030f, B:268:0x031d, B:271:0x0328, B:274:0x0332, B:277:0x033d, B:280:0x0348, B:283:0x0354, B:286:0x035e, B:289:0x0368, B:292:0x0372, B:295:0x037c, B:298:0x0386, B:301:0x0391, B:304:0x039c, B:307:0x03a7, B:217:0x053c, B:219:0x0546, B:220:0x0549, B:222:0x055f, B:223:0x0571, B:226:0x0568), top: B:156:0x0306, inners: #4, #14, #15, #21 }] */
    @Override // C1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(A.c r20, B1.o r21) {
        /*
            Method dump skipped, instructions count: 1814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.i.k(A.c, B1.o):void");
    }

    @Override // k.N
    public void l(j.j jVar, j.k kVar) {
        j.g gVar = (j.g) this.f443l;
        Handler handler = gVar.f3418p;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f3420r;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (jVar == ((j.f) arrayList.get(i3)).f3403b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i4 = i3 + 1;
        handler.postAtTime(new j.e(this, i4 < arrayList.size() ? (j.f) arrayList.get(i4) : null, kVar, jVar, 0), jVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // r1.InterfaceC0452B
    public void m() {
        SurfaceHolderCallback2C0453C surfaceHolderCallback2C0453C = (SurfaceHolderCallback2C0453C) this.f443l;
        io.flutter.embedding.engine.renderer.k kVar = surfaceHolderCallback2C0453C.f4337b;
        if (kVar != null) {
            kVar.a(surfaceHolderCallback2C0453C.f4339d);
        }
    }

    @Override // l0.InterfaceC0389L
    public View n(int i3) {
        return ((AbstractC0410t) this.f443l).o(i3);
    }

    @Override // l0.InterfaceC0389L
    public int o() {
        return ((AbstractC0410t) this.f443l).s();
    }

    @Override // l1.InterfaceC0419c
    public void p(Object obj) {
        ((B1.o) this.f443l).d(obj);
    }

    @Override // l0.InterfaceC0389L
    public int q(View view) {
        return view.getRight() + ((C0411u) view.getLayoutParams()).f4024a.right + ((ViewGroup.MarginLayoutParams) ((C0411u) view.getLayoutParams())).rightMargin;
    }

    @Override // r1.InterfaceC0452B
    public void r(io.flutter.embedding.engine.renderer.k kVar) {
        SurfaceHolderCallback2C0453C surfaceHolderCallback2C0453C = (SurfaceHolderCallback2C0453C) this.f443l;
        io.flutter.embedding.engine.renderer.k kVar2 = surfaceHolderCallback2C0453C.f4337b;
        if (kVar2 != null) {
            kVar2.g(surfaceHolderCallback2C0453C.f4339d);
        }
        surfaceHolderCallback2C0453C.f4337b = kVar;
    }

    public void s(String str) {
        E1.b bVar = (E1.b) ((A.c) this.f443l).f6l;
        Integer valueOf = Integer.valueOf(PipesIterator.DEFAULT_QUEUE_SIZE);
        if (A.c.n == null) {
            E1.a aVar = new E1.a();
            aVar.put(MimeTypesReaderMetKeys.ALIAS_TAG, 1010);
            aVar.put("allScroll", 1013);
            aVar.put("basic", valueOf);
            aVar.put("cell", 1006);
            aVar.put("click", 1002);
            aVar.put("contextMenu", 1001);
            aVar.put("copy", 1011);
            aVar.put("forbidden", 1012);
            aVar.put("grab", 1020);
            aVar.put("grabbing", 1021);
            aVar.put("help", 1003);
            aVar.put("move", 1013);
            aVar.put("none", 0);
            aVar.put("noDrop", 1012);
            aVar.put("precise", 1007);
            aVar.put("text", 1008);
            aVar.put("resizeColumn", 1014);
            aVar.put("resizeDown", 1015);
            aVar.put("resizeUpLeft", 1016);
            aVar.put("resizeDownRight", 1017);
            aVar.put("resizeLeft", 1014);
            aVar.put("resizeLeftRight", 1014);
            aVar.put("resizeRight", 1014);
            aVar.put("resizeRow", 1015);
            aVar.put("resizeUp", 1015);
            aVar.put("resizeUpDown", 1015);
            aVar.put("resizeUpLeft", 1017);
            aVar.put("resizeUpRight", 1016);
            aVar.put("resizeUpLeftDownRight", 1017);
            aVar.put("resizeUpRightDownLeft", 1016);
            aVar.put("verticalText", 1009);
            aVar.put("wait", 1004);
            aVar.put("zoomIn", 1018);
            aVar.put("zoomOut", 1019);
            A.c.n = aVar;
        }
        bVar.setPointerIcon(PointerIcon.getSystemIcon(((r1.n) bVar).getContext(), ((Integer) A.c.n.getOrDefault(str, valueOf)).intValue()));
    }

    public void u() {
        ((C0173u) this.f443l).f2555p.P();
    }

    public synchronized void x() {
        b bVar = (b) this.f443l;
        ReentrantLock reentrantLock = bVar.f422a;
        reentrantLock.lock();
        try {
            bVar.f423b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public i(Context context) {
        String d3;
        this.f442k = 0;
        b a3 = b.a(context);
        this.f443l = a3;
        a3.b();
        String d4 = a3.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(d4) || (d3 = a3.d(b.f("googleSignInOptions", d4))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(d3);
        } catch (JSONException unused) {
        }
    }

    public i() {
        this.f442k = 25;
        this.f443l = new LinkedHashMap(0, 0.75f, true);
    }

    public i(C1.f fVar) {
        this.f442k = 2;
        this.f443l = new B1.s(fVar, "flutter/keyevent", C1.j.f175a, null);
    }

    public i(C0475c c0475c) {
        this.f442k = 6;
        new B1.s(c0475c, "flutter/scribe", C1.k.f176a, null).z(new B1.g(this, 2));
    }
}
