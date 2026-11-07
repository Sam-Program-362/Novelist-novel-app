package io.flutter.plugin.platform;

import M1.C0073w;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import b1.C0192Q;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import r1.AbstractActivityC0455b;
import r1.C0454a;
import r1.C0459f;
import s1.C0467c;

/* loaded from: classes.dex */
public final class s implements k {

    /* renamed from: H, reason: collision with root package name */
    public static final Class[] f3220H = {SurfaceView.class};

    /* renamed from: E, reason: collision with root package name */
    public final C0192Q f3225E;

    /* renamed from: l, reason: collision with root package name */
    public C0454a f3229l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractActivityC0455b f3230m;
    public r1.n n;

    /* renamed from: p, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f3232p;

    /* renamed from: q, reason: collision with root package name */
    public io.flutter.plugin.editing.j f3233q;

    /* renamed from: r, reason: collision with root package name */
    public A.c f3234r;

    /* renamed from: o, reason: collision with root package name */
    public FlutterJNI f3231o = null;

    /* renamed from: z, reason: collision with root package name */
    public int f3239z = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f3221A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3222B = true;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3226F = false;

    /* renamed from: G, reason: collision with root package name */
    public final o f3227G = new o(this, 0);

    /* renamed from: k, reason: collision with root package name */
    public final o f3228k = new o(2);

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f3236t = new HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final C0309a f3235s = new C0309a();
    public final HashMap u = new HashMap();
    public final SparseArray x = new SparseArray();

    /* renamed from: C, reason: collision with root package name */
    public final HashSet f3223C = new HashSet();

    /* renamed from: D, reason: collision with root package name */
    public final HashSet f3224D = new HashSet();
    public final SparseArray y = new SparseArray();

    /* renamed from: v, reason: collision with root package name */
    public final SparseArray f3237v = new SparseArray();

    /* renamed from: w, reason: collision with root package name */
    public final SparseArray f3238w = new SparseArray();

    public s() {
        if (C0192Q.n == null) {
            C0192Q.n = new C0192Q(13);
        }
        this.f3225E = C0192Q.n;
    }

    public static void a(s sVar, B1.k kVar) {
        int i3 = kVar.f109g;
        if (i3 == 0 || i3 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i3 + "(view id: " + kVar.f103a + ")");
    }

    public static h i(io.flutter.embedding.engine.renderer.k kVar) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29) {
            return i3 >= 29 ? new C0311c(kVar.c()) : new z(kVar.e());
        }
        TextureRegistry$SurfaceProducer d3 = kVar.d(i3 <= 34 ? 2 : 1);
        o oVar = new o(4);
        oVar.f3201l = d3;
        return oVar;
    }

    public final g b(B1.k kVar, boolean z3) {
        String str = kVar.f104b;
        int i3 = kVar.f103a;
        C0073w c0073w = (C0073w) ((HashMap) this.f3228k.f3201l).get(str);
        if (c0073w == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = kVar.f111i;
        Object b3 = byteBuffer != null ? c0073w.f1166a.b(byteBuffer) : null;
        if (z3) {
            new MutableContextWrapper(this.f3230m);
        }
        g a3 = c0073w.a(b3);
        View view = a3.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(kVar.f109g);
        this.f3237v.put(i3, a3);
        return a3;
    }

    @Override // io.flutter.plugin.platform.k
    public final void c(io.flutter.view.i iVar) {
        this.f3235s.f3166a = iVar;
    }

    public final void d() {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.x;
            if (i3 >= sparseArray.size()) {
                return;
            }
            C0312d c0312d = (C0312d) sparseArray.valueAt(i3);
            c0312d.a();
            c0312d.f4365k.close();
            i3++;
        }
    }

    public final void e(boolean z3) {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.x;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            C0312d c0312d = (C0312d) sparseArray.valueAt(i3);
            if (this.f3223C.contains(Integer.valueOf(keyAt))) {
                C0467c c0467c = this.n.f4406s;
                if (c0467c != null) {
                    c0312d.c(c0467c.f4481b);
                }
                z3 &= c0312d.e();
            } else {
                if (!this.f3221A) {
                    c0312d.a();
                }
                c0312d.setVisibility(8);
                this.n.removeView(c0312d);
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f3238w;
            if (i4 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i4);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f3224D.contains(Integer.valueOf(keyAt2)) || (!z3 && this.f3222B)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i4++;
        }
    }

    public final float f() {
        return this.f3230m.getResources().getDisplayMetrics().density;
    }

    @Override // io.flutter.plugin.platform.k
    public final boolean g(int i3) {
        return this.f3236t.containsKey(Integer.valueOf(i3));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void h() {
        if (!this.f3222B || this.f3221A) {
            return;
        }
        r1.n nVar = this.n;
        nVar.f4402o.d();
        C0459f c0459f = nVar.n;
        if (c0459f == null) {
            C0459f c0459f2 = new C0459f(nVar.getContext(), nVar.getWidth(), nVar.getHeight(), 1);
            nVar.n = c0459f2;
            nVar.addView(c0459f2);
        } else {
            c0459f.g(nVar.getWidth(), nVar.getHeight());
        }
        nVar.f4403p = nVar.f4402o;
        C0459f c0459f3 = nVar.n;
        nVar.f4402o = c0459f3;
        C0467c c0467c = nVar.f4406s;
        if (c0467c != null) {
            c0459f3.c(c0467c.f4481b);
        }
        this.f3221A = true;
    }

    public final void j() {
        for (D d3 : this.f3236t.values()) {
            h hVar = d3.f3161f;
            h hVar2 = d3.f3161f;
            int width = hVar.getWidth();
            int height = hVar2.getHeight();
            boolean isFocused = d3.a().isFocused();
            x detachState = d3.f3156a.detachState();
            d3.f3163h.setSurface(null);
            d3.f3163h.release();
            d3.f3163h = ((DisplayManager) d3.f3157b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + d3.f3160e, width, height, d3.f3159d, hVar2.getSurface(), 0, D.f3155i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(d3.f3157b, d3.f3163h.getDisplay(), d3.f3158c, detachState, d3.f3162g, isFocused);
            singleViewPresentation.show();
            d3.f3156a.cancel();
            d3.f3156a = singleViewPresentation;
        }
    }

    public final MotionEvent k(float f3, B1.l lVar, boolean z3) {
        long j3 = lVar.f126p;
        int i3 = lVar.f116e;
        MotionEvent x = this.f3225E.x(new r1.z(j3));
        List<List> list = (List) lVar.f118g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d3 = f3;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d3);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d3);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d3);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d3);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d3);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d3);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) lVar.f117f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]);
        if (z3 || x == null) {
            return MotionEvent.obtain(lVar.f113b.longValue(), lVar.f114c.longValue(), lVar.f115d, lVar.f116e, pointerPropertiesArr, pointerCoordsArr, lVar.f119h, lVar.f120i, lVar.f121j, lVar.f122k, lVar.f123l, lVar.f124m, lVar.n, lVar.f125o);
        }
        if (x.getPointerCount() != i3 || x.getAction() != lVar.f115d) {
            return MotionEvent.obtain(x.getDownTime(), x.getEventTime(), lVar.f115d, lVar.f116e, pointerPropertiesArr, pointerCoordsArr, x.getMetaState(), x.getButtonState(), x.getXPrecision(), x.getYPrecision(), x.getDeviceId(), x.getEdgeFlags(), x.getSource(), x.getFlags());
        }
        if (pointerCoordsArr.length < 1) {
            return x;
        }
        x.offsetLocation(pointerCoordsArr[0].x - x.getX(), pointerCoordsArr[0].y - x.getY());
        return x;
    }

    @Override // io.flutter.plugin.platform.k
    public final View l(int i3) {
        if (g(i3)) {
            return ((D) this.f3236t.get(Integer.valueOf(i3))).a();
        }
        g gVar = (g) this.f3237v.get(i3);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    public final int m(double d3) {
        return (int) Math.round(d3 * f());
    }

    @Override // io.flutter.plugin.platform.k
    public final void o() {
        this.f3235s.f3166a = null;
    }
}
