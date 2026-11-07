package p039m1;

import A0.j;
import B1.s;
import C1.f;
import a2.h;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import p067y1.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s f4099k;

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        h.e(aVar, "binding");
        f fVar = aVar.f4730c;
        h.d(fVar, "getBinaryMessenger(...)");
        Context context = aVar.f4728a;
        h.d(context, "getApplicationContext(...)");
        this.f4099k = new s(fVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        h.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        h.b(contentResolver);
        j jVar = new j(packageManager, (ActivityManager) systemService, contentResolver, 17);
        s sVar = this.f4099k;
        if (sVar != null) {
            sVar.z(jVar);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        h.e(aVar, "binding");
        s sVar = this.f4099k;
        if (sVar != null) {
            sVar.z(null);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }
}
