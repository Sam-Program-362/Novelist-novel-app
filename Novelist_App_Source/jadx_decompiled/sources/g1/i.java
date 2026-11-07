package g1;

import M0.r;
import java.io.Serializable;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2844a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2845b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2846c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2847d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f2848e;

    public i() {
        this.f2845b = new Object();
        this.f2847d = new h();
    }

    public void a(c cVar) {
        ((h) this.f2847d).e(new g(f.f2836a, cVar));
        f();
    }

    public void b(d dVar) {
        ((h) this.f2847d).e(new g(f.f2836a, dVar));
        f();
    }

    public Object c() {
        Object obj;
        synchronized (this.f2845b) {
            try {
                r.h("Task is not yet complete", this.f2844a);
                Exception exc = (Exception) this.f2848e;
                if (exc != null) {
                    throw new D0.a(exc);
                }
                obj = this.f2846c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean d() {
        boolean z3;
        synchronized (this.f2845b) {
            z3 = false;
            if (this.f2844a && ((Exception) this.f2848e) == null) {
                z3 = true;
            }
        }
        return z3;
    }

    public void e() {
        boolean z3;
        if (this.f2844a) {
            int i3 = C0254a.f2834k;
            synchronized (this.f2845b) {
                z3 = this.f2844a;
            }
            if (!z3) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            synchronized (this.f2845b) {
                Exception exc = (Exception) this.f2848e;
            }
        }
    }

    public void f() {
        synchronized (this.f2845b) {
            try {
                if (this.f2844a) {
                    ((h) this.f2847d).f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public i(String str, String str2, String str3, String str4, boolean z3) {
        this.f2845b = str == null ? "libapp.so" : str;
        this.f2846c = str2 == null ? "flutter_assets" : str2;
        this.f2848e = str4;
        this.f2847d = str3 == null ? StringUtils.EMPTY : str3;
        this.f2844a = z3;
    }
}
