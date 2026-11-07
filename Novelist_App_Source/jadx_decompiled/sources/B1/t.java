package B1;

import java.util.Locale;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f147a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f148b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f149c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f150d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f151e;

    /* renamed from: f, reason: collision with root package name */
    public final int f152f;

    /* renamed from: g, reason: collision with root package name */
    public final u f153g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f154h;

    /* renamed from: i, reason: collision with root package name */
    public final String f155i;

    /* renamed from: j, reason: collision with root package name */
    public final s f156j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f157k;

    /* renamed from: l, reason: collision with root package name */
    public final t[] f158l;

    /* renamed from: m, reason: collision with root package name */
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
          (r8v1 B1.t) from 0x021e: PHI (r8v2 B1.t) = (r8v1 B1.t), (r8v4 B1.t) binds: [B:68:0x0211, B:75:0x04fc] A[DONT_GENERATE, DONT_INLINE]
          (r8v1 B1.t) from 0x01e8: MOVE (r30v5 B1.t) = (r8v1 B1.t) (LINE:489)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static B1.t a(org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.t.a(org.json.JSONObject):B1.t");
    }
}
