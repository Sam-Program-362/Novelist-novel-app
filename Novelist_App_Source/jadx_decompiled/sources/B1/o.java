package B1;

import M1.RunnableC0053b;
import M1.c0;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import t1.C0480h;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f131b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f132c;

    public /* synthetic */ o(Object obj, Object obj2, int i3) {
        this.f130a = i3;
        this.f132c = obj;
        this.f131b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f130a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            case 1:
                ((C0480h) this.f131b).a(((C1.n) ((s) ((A.c) this.f132c).f7m).f146m).c(str, str2, obj));
                break;
            default:
                a2.h.e(str, "errorCode");
                ((Handler) this.f132c).post(new c0(this, str, str2, obj, 4));
                break;
        }
    }

    public final void b() {
        switch (this.f130a) {
            case 0:
                break;
            case 1:
                ((C0480h) this.f131b).a(null);
                break;
            default:
                ((Handler) this.f132c).post(new RunnableC0053b(this, 8));
                break;
        }
    }

    public final void d(Object obj) {
        switch (this.f130a) {
            case 0:
                ((p) this.f132c).f136d = (byte[]) this.f131b;
                break;
            case 1:
                ((C0480h) this.f131b).a(((C1.n) ((s) ((A.c) this.f132c).f7m).f146m).a(obj));
                break;
            default:
                ((Handler) this.f132c).post(new M.c(this, obj, 14));
                break;
        }
    }

    public o(o oVar) {
        this.f130a = 2;
        this.f131b = oVar;
        this.f132c = new Handler(Looper.getMainLooper());
    }

    private final void c() {
    }
}
