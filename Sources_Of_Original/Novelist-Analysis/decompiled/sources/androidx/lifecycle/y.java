package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A f2171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2173m = -1;
    public final /* synthetic */ z n;

    public y(z zVar, A a3) {
        this.n = zVar;
        this.f2171k = a3;
    }

    public final void h(boolean z3) {
        if (z3 == this.f2172l) {
            return;
        }
        this.f2172l = z3;
        int i3 = z3 ? 1 : -1;
        z zVar = this.n;
        int i4 = zVar.f2177c;
        zVar.f2177c = i3 + i4;
        if (!zVar.f2178d) {
            zVar.f2178d = true;
            while (true) {
                try {
                    int i5 = zVar.f2177c;
                    if (i4 == i5) {
                        break;
                    }
                    boolean z4 = i4 == 0 && i5 > 0;
                    boolean z5 = i4 > 0 && i5 == 0;
                    if (z4) {
                        zVar.e();
                    } else if (z5) {
                        zVar.f();
                    }
                    i4 = i5;
                } catch (Throwable th) {
                    zVar.f2178d = false;
                    throw th;
                }
            }
            zVar.f2178d = false;
        }
        if (this.f2172l) {
            zVar.c(this);
        }
    }

    public void i() {
    }

    public boolean j(InterfaceC0144s interfaceC0144s) {
        return false;
    }

    public abstract boolean k();
}
