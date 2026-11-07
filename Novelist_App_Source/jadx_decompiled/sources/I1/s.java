package I1;

import D.C0002c;
import a.AbstractC0102a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public final class s implements C1.o, o {

    /* renamed from: k, reason: collision with root package name */
    public final Context f513k;

    /* renamed from: l, reason: collision with root package name */
    public final C0002c f514l;

    /* renamed from: m, reason: collision with root package name */
    public final C0002c f515m;
    public final C0002c n;

    /* renamed from: o, reason: collision with root package name */
    public Activity f516o;

    /* renamed from: p, reason: collision with root package name */
    public k f517p;

    public s(Context context, C0002c c0002c, C0002c c0002c2, C0002c c0002c3) {
        this.f513k = context;
        this.f514l = c0002c;
        this.f515m = c0002c2;
        this.n = c0002c3;
    }

    @Override // C1.o
    public final boolean a(int i3, int i4, Intent intent) {
        if (i3 != 53294) {
            return false;
        }
        if (this.f517p == null) {
            Log.e("google_sign_in", "Unexpected authorization result callback");
            return false;
        }
        try {
            F0.a d3 = C0002c.b(this.f513k).d(intent);
            AbstractC0102a.o(this.f517p, new w(d3.f295l, d3.n, d3.f294k));
            return true;
        } catch (K0.e e3) {
            AbstractC0102a.o(this.f517p, new a(b.f473p, e3.getMessage(), null));
            this.f517p = null;
            return false;
        }
    }
}
