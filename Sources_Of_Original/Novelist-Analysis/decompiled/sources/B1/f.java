package B1;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f87c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f88d;

    public f(p057t1.c cVar) {
        s sVar = new s(cVar, "flutter/lifecycle", C1.s.f182b, null);
        this.f85a = 0;
        this.f86b = 0;
        this.f87c = true;
        this.f88d = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0029  */
    public final void a(int i3, boolean z3) {
        int i4;
        String str;
        int i5 = this.f85a;
        if (i5 == i3 && z3 == this.f87c) {
            return;
        }
        if (i3 == 0 && i5 == 0) {
            this.f87c = z3;
            return;
        }
        int iA = X.j.a(i3);
        if (iA != 0) {
            if (iA == 1) {
                i4 = z3 ? 2 : 3;
            } else if (iA == 2 || iA == 3 || iA == 4) {
                i4 = i3;
            } else {
                i4 = 0;
            }
        } else {
            i4 = i3;
        }
        this.f85a = i3;
        this.f87c = z3;
        if (i4 == this.f86b) {
            return;
        }
        StringBuilder sb = new StringBuilder("AppLifecycleState.");
        if (i4 == 1) {
            str = "DETACHED";
        } else if (i4 == 2) {
            str = "RESUMED";
        } else if (i4 == 3) {
            str = "INACTIVE";
        } else if (i4 == 4) {
            str = "HIDDEN";
        } else {
            if (i4 != 5) {
                throw null;
            }
            str = "PAUSED";
        }
        sb.append(str.toLowerCase(Locale.ROOT));
        this.f88d.x(sb.toString(), null);
        this.f86b = i4;
    }
}
