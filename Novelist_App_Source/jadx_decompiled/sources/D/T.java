package D;

import a.AbstractC0102a;
import android.graphics.Rect;
import java.util.List;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f198a;

    /* renamed from: b, reason: collision with root package name */
    public w.b[] f199b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect[][] f200c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect[][] f201d;

    public T() {
        this(new h0());
    }

    public final void a() {
        w.b[] bVarArr = this.f199b;
        if (bVarArr != null) {
            w.b bVar = bVarArr[0];
            w.b bVar2 = bVarArr[1];
            h0 h0Var = this.f198a;
            if (bVar2 == null) {
                bVar2 = h0Var.f241a.h(2);
            }
            if (bVar == null) {
                bVar = h0Var.f241a.h(1);
            }
            h(w.b.a(bVar, bVar2));
            w.b bVar3 = this.f199b[AbstractC0102a.G(16)];
            if (bVar3 != null) {
                g(bVar3);
            }
            w.b bVar4 = this.f199b[AbstractC0102a.G(32)];
            if (bVar4 != null) {
                e(bVar4);
            }
            w.b bVar5 = this.f199b[AbstractC0102a.G(64)];
            if (bVar5 != null) {
                i(bVar5);
            }
        }
    }

    public abstract h0 b();

    public void c(h0 h0Var) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            List<Rect> e3 = h0Var.f241a.e(i3);
            int G3 = AbstractC0102a.G(i3);
            this.f200c[G3] = (Rect[]) e3.toArray(new Rect[e3.size()]);
            if (i3 != 8) {
                List<Rect> f3 = h0Var.f241a.f(i3);
                this.f201d[G3] = (Rect[]) f3.toArray(new Rect[f3.size()]);
            }
        }
    }

    public void d(int i3, w.b bVar) {
        if (this.f199b == null) {
            this.f199b = new w.b[10];
        }
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                this.f199b[AbstractC0102a.G(i4)] = bVar;
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
