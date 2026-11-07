package j;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import k1.AbstractC0364a;
import k1.C0368e;
import k1.C0375l;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3398k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3399l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3400m;
    public final /* synthetic */ Object n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f3401o;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f3398k = i3;
        this.f3401o = obj;
        this.f3399l = obj2;
        this.f3400m = obj3;
        this.n = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3398k) {
            case 0:
                g gVar = (g) ((H0.i) this.f3401o).f443l;
                k kVar = (k) this.f3400m;
                f fVar = (f) this.f3399l;
                if (fVar != null) {
                    gVar.f3414J = true;
                    fVar.f3403b.c(false);
                    gVar.f3414J = false;
                }
                if (kVar.isEnabled() && kVar.hasSubMenu()) {
                    ((j) this.n).p(kVar, null, 4);
                    return;
                }
                return;
            default:
                synchronized (C0375l.f3857p) {
                    C0368e c0368e = (C0368e) this.f3399l;
                    if (c0368e != null) {
                        C0375l.a((C0375l) this.f3401o, c0368e);
                    }
                    try {
                        if (AbstractC0364a.a(C0375l.f3858q)) {
                            Log.d("Sqflite", "delete database " + ((String) this.f3400m));
                        }
                        SQLiteDatabase.deleteDatabase(new File((String) this.f3400m));
                    } catch (Exception e3) {
                        Log.e("Sqflite", "error " + e3 + " while closing database " + C0375l.u);
                    }
                }
                ((B1.o) this.n).d(null);
                return;
        }
    }
}
