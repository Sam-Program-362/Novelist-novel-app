package io.flutter.plugin.platform;

import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import b1.C0192Q;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;
import r1.AbstractActivityC0455b;
import r1.C0454a;
import x1.C0498a;

/* loaded from: classes.dex */
public final class r implements k {

    /* renamed from: k, reason: collision with root package name */
    public o f3208k;

    /* renamed from: l, reason: collision with root package name */
    public C0454a f3209l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractActivityC0455b f3210m;
    public r1.n n;

    /* renamed from: p, reason: collision with root package name */
    public io.flutter.plugin.editing.j f3212p;

    /* renamed from: q, reason: collision with root package name */
    public A.c f3213q;
    public final C0192Q u;

    /* renamed from: o, reason: collision with root package name */
    public FlutterJNI f3211o = null;
    public Surface x = null;
    public SurfaceControl y = null;

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f3219z = new HashSet();

    /* renamed from: A, reason: collision with root package name */
    public final o f3207A = new o(this, 3);

    /* renamed from: r, reason: collision with root package name */
    public final C0309a f3214r = new C0309a();

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f3215s = new SparseArray();

    /* renamed from: t, reason: collision with root package name */
    public final SparseArray f3216t = new SparseArray();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f3217v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f3218w = new ArrayList();

    public r() {
        if (C0192Q.n == null) {
            C0192Q.n = new C0192Q(13);
        }
        this.u = C0192Q.n;
    }

    public final boolean a(int i3) {
        g gVar = (g) this.f3215s.get(i3);
        if (gVar == null) {
            return false;
        }
        SparseArray sparseArray = this.f3216t;
        if (sparseArray.get(i3) != null) {
            return true;
        }
        View view = gVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        AbstractActivityC0455b abstractActivityC0455b = this.f3210m;
        C0498a c0498a = new C0498a(abstractActivityC0455b, abstractActivityC0455b.getResources().getDisplayMetrics().density, this.f3209l);
        c0498a.setOnDescendantFocusChangeListener(new l(this, i3, 1));
        sparseArray.put(i3, c0498a);
        view.setImportantForAccessibility(4);
        c0498a.addView(view);
        this.n.addView(c0498a);
        return true;
    }

    @Override // io.flutter.plugin.platform.k
    public final void c(io.flutter.view.i iVar) {
        this.f3214r.f3166a = iVar;
    }

    @Override // io.flutter.plugin.platform.k
    public final boolean g(int i3) {
        return false;
    }

    @Override // io.flutter.plugin.platform.k
    public final View l(int i3) {
        g gVar = (g) this.f3215s.get(i3);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    @Override // io.flutter.plugin.platform.k
    public final void o() {
        this.f3214r.f3166a = null;
    }
}
