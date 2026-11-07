package D;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w.b[] f199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect[][] f200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect[][] f201d;

    public T() {
        this(new h0());
    }

    public final void a() {
        w.b[] bVarArr = this.f199b;
        if (bVarArr != null) {
            w.b bVarH = bVarArr[0];
            w.b bVarH2 = bVarArr[1];
            h0 h0Var = this.f198a;
            if (bVarH2 == null) {
                bVarH2 = h0Var.f241a.h(2);
            }
            if (bVarH == null) {
                bVarH = h0Var.f241a.h(1);
            }
            h(w.b.a(bVarH, bVarH2));
            w.b bVar = this.f199b[p000a.a.G(16)];
            if (bVar != null) {
                g(bVar);
            }
            w.b bVar2 = this.f199b[p000a.a.G(32)];
            if (bVar2 != null) {
                e(bVar2);
            }
            w.b bVar3 = this.f199b[p000a.a.G(64)];
            if (bVar3 != null) {
                i(bVar3);
            }
        }
    }

    public abstract h0 b();

    public void c(h0 h0Var) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            List<Rect> listE = h0Var.f241a.e(i3);
            int iG = p000a.a.G(i3);
            this.f200c[iG] = (Rect[]) listE.toArray(new Rect[listE.size()]);
            if (i3 != 8) {
                List<Rect> listF = h0Var.f241a.f(i3);
                this.f201d[iG] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            }
        }
    }

    public void d(int i3, w.b bVar) {
        if (this.f199b == null) {
            this.f199b = new w.b[10];
        }
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                this.f199b[p000a.a.G(i4)] = bVar;
            }
        }
    }

    public abstract void f(w.b bVar);

    public abstract void h(w.b bVar);

    public T(h0 h0Var) {
        this.f200c = new Rect[10][];
        this.f201d = new Rect[10][];
        this.f198a = h0Var;
        c(h0Var);
    }

    public void e(w.b bVar) {
    }

    public void g(w.b bVar) {
    }

    public void i(w.b bVar) {
    }
}
