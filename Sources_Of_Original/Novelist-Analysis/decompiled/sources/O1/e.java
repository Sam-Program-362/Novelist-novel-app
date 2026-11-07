package O1;

import a2.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Z1.a f1207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile Object f1208l = f.f1210a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f1209m = this;

    public e(Z1.a aVar) {
        this.f1207k = aVar;
    }

    public final Object a() {
        Object objA;
        Object obj = this.f1208l;
        f fVar = f.f1210a;
        if (obj != fVar) {
            return obj;
        }
        synchronized (this.f1209m) {
            objA = this.f1208l;
            if (objA == fVar) {
                Z1.a aVar = this.f1207k;
                h.b(aVar);
                objA = aVar.a();
                this.f1208l = objA;
                this.f1207k = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f1208l != f.f1210a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
