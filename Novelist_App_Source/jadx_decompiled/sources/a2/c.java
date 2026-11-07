package a2;

import f2.InterfaceC0247a;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements InterfaceC0247a, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public transient InterfaceC0247a f1698k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1699l;

    /* renamed from: m, reason: collision with root package name */
    public final Class f1700m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1701o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1702p;

    public c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f1699l = obj;
        this.f1700m = cls;
        this.n = str;
        this.f1701o = str2;
        this.f1702p = z3;
    }

    public abstract InterfaceC0247a c();

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
