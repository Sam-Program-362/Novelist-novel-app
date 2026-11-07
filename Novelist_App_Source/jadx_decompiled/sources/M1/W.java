package M1;

import android.webkit.JsResult;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class W implements Z1.l {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1054k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f1055l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ JsResult f1056m;

    public /* synthetic */ W(Z z3, JsResult jsResult, int i3) {
        this.f1054k = i3;
        this.f1055l = z3;
        this.f1056m = jsResult;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        Q q3 = (Q) obj;
        switch (this.f1054k) {
            case 0:
                if (!q3.f1040d) {
                    boolean equals = Boolean.TRUE.equals(q3.f1038b);
                    JsResult jsResult = this.f1056m;
                    if (!equals) {
                        jsResult.cancel();
                        break;
                    } else {
                        jsResult.confirm();
                        break;
                    }
                } else {
                    O o2 = this.f1055l.f1064b.f1145a;
                    Throwable th = q3.f1039c;
                    Objects.requireNonNull(th);
                    o2.getClass();
                    O.d(th);
                    break;
                }
            default:
                if (!q3.f1040d) {
                    this.f1056m.confirm();
                    break;
                } else {
                    O o3 = this.f1055l.f1064b.f1145a;
                    Throwable th2 = q3.f1039c;
                    Objects.requireNonNull(th2);
                    o3.getClass();
                    O.d(th2);
                    break;
                }
        }
        return null;
    }
}
