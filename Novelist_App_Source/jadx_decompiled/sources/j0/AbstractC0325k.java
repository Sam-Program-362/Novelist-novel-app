package j0;

import M1.A;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: j0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0325k {

    /* renamed from: a, reason: collision with root package name */
    public static final q.h f3538a = new q.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3539b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static A f3540c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0323i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static A b() {
        A a3 = new A(19);
        f3540c = a3;
        q.h hVar = f3538a;
        hVar.getClass();
        if (q.g.f4294p.c(hVar, null, a3)) {
            q.g.b(hVar);
        }
        return f3540c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC0325k.c(android.content.Context, boolean):void");
    }
}
