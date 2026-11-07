package a2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements p016f2.a, Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient p016f2.a f1698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f1699l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Class f1700m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1702p;

    public c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f1699l = obj;
        this.f1700m = cls;
        this.n = str;
        this.f1701o = str2;
        this.f1702p = z3;
    }

    public abstract p016f2.a c();

    public final d g() {
        boolean z3 = this.f1702p;
        Class cls = this.f1700m;
        if (!z3) {
            return p.a(cls);
        }
        p.f1714a.getClass();
        return new j(cls);
    }
}
