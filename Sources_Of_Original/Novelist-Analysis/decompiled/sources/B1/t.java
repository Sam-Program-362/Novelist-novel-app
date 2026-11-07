package B1;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t[] f158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Locale[] f159m;

    public t(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i3, u uVar, Integer num, String str, s sVar, String[] strArr, t[] tVarArr, Locale[] localeArr) {
        this.f147a = z3;
        this.f148b = z4;
        this.f149c = z5;
        this.f150d = z6;
        this.f151e = z7;
        this.f152f = i3;
        this.f153g = uVar;
        this.f154h = num;
        this.f155i = str;
        this.f156j = sVar;
        this.f157k = strArr;
        this.f158l = tVarArr;
        this.f159m = localeArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 B1.t, still in use, count: 2, list:
          (r8v1 B1.t) from 0x021e: PHI (r8v2 B1.t) = (r8v1 B1.t), (r8v4 B1.t) binds: [B:120:0x0211, B:312:0x04fc] A[DONT_GENERATE, DONT_INLINE]
          (r8v1 B1.t) from 0x01e8: MOVE (r30v5 B1.t) = (r8v1 B1.t) (LINE:489)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static B1.t a(org.json.JSONObject r35) {
        /*
            Method dump skipped, instruction units count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.t.a(org.json.JSONObject):B1.t");
    }
}
