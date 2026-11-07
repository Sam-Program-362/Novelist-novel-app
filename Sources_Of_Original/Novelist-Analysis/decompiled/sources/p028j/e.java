package p028j;

import B1.o;
import H0.i;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import p033k1.a;
import p033k1.l;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3400m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
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
                g gVar = (g) ((i) this.f3401o).f443l;
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
                synchronized (l.f3857p) {
                    p033k1.e eVar = (p033k1.e) this.f3399l;
                    if (eVar != null) {
                        l.a((l) this.f3401o, eVar);
                    }
                    try {
                        if (a.a(l.f3858q)) {
                            Log.d("Sqflite", "delete database " + ((String) this.f3400m));
                        }
                        SQLiteDatabase.deleteDatabase(new File((String) this.f3400m));
                    } catch (Exception e3) {
                        Log.e("Sqflite", "error " + e3 + " while closing database " + l.u);
                    }
                    break;
                }
                ((o) this.n).d(null);
                return;
        }
    }
}
