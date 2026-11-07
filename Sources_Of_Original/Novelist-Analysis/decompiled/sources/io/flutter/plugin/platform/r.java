package io.flutter.plugin.platform;

import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashSet;
import p004b1.Q;
import p052r1.AbstractActivityC0262b;
import p052r1.C0261a;

/* JADX INFO: loaded from: classes.dex */
public final class r implements k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f3208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0261a f3209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractActivityC0262b f3210m;
    public p052r1.n n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public io.flutter.plugin.editing.j f3212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public A.c f3213q;
    public final Q u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FlutterJNI f3211o = null;
    public Surface x = null;
    public SurfaceControl y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f3219z = new HashSet();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final o f3207A = new o(this, 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0218a f3214r = new C0218a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseArray f3215s = new SparseArray();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseArray f3216t = new SparseArray();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f3217v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f3218w = new ArrayList();

    public r() {
        if (Q.n == null) {
            Q.n = new Q(13);
        }
        this.u = Q.n;
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
        AbstractActivityC0262b abstractActivityC0262b = this.f3210m;
        p065x1.a aVar = new p065x1.a(abstractActivityC0262b, abstractActivityC0262b.getResources().getDisplayMetrics().density, this.f3209l);
        aVar.setOnDescendantFocusChangeListener(new l(this, i3, 1));
        sparseArray.put(i3, aVar);
        view.setImportantForAccessibility(4);
        aVar.addView(view);
        this.n.addView(aVar);
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
