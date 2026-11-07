package O1;

import a2.h;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public Z1.a f1207k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Object f1208l = f.f1210a;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1209m = this;

    public e(Z1.a aVar) {
        this.f1207k = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f1208l;
        f fVar = f.f1210a;
        if (obj2 != fVar) {
            return obj2;
        }
        synchronized (this.f1209m) {
            obj = this.f1208l;
            if (obj == fVar) {
                Z1.a aVar = this.f1207k;
                h.b(aVar);
                obj = aVar.a();
                this.f1208l = obj;
                this.f1207k = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f1208l != f.f1210a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
