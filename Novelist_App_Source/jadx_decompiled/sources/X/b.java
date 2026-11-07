package X;

import android.content.Context;
import java.io.File;
import x0.C0492b;
import y0.InterfaceC0499a;

/* loaded from: classes.dex */
public final class b extends a2.i implements Z1.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1553l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1554m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, int i3) {
        super(0);
        this.f1553l = i3;
        this.f1554m = obj;
        this.n = obj2;
    }

    @Override // Z1.a
    public final Object a() {
        switch (this.f1553l) {
            case 0:
                Context context = (Context) this.f1554m;
                ((c) this.n).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                a2.h.e(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            default:
                ((InterfaceC0499a) ((C0492b) this.f1554m).f4689l).b((r1.k) this.n);
                return O1.g.f1211a;
        }
    }
}
