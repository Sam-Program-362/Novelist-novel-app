package F1;

import A.c;
import C1.o;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.tika.mime.MimeTypes;
import p031k.u0;
import p067y1.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements b, p070z1.a, o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PackageManager f343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p070z1.b f344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap f345m;
    public final HashMap n = new HashMap();

    public a(c cVar) {
        this.f343k = (PackageManager) cVar.f6l;
        cVar.f7m = this;
    }

    @Override // C1.o
    public final boolean a(int i3, int i4, Intent intent) {
        Integer numValueOf = Integer.valueOf(i3);
        HashMap map = this.n;
        if (!map.containsKey(numValueOf)) {
            return false;
        }
        ((B1.o) map.remove(Integer.valueOf(i3))).d(i4 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    public final void b(String str, String str2, boolean z3, B1.o oVar) {
        if (this.f344l == null) {
            oVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap map = this.f345m;
        if (map == null) {
            oVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            oVar.a("error", "Text processing activity not found", null);
            return;
        }
        int iHashCode = oVar.hashCode();
        this.n.put(Integer.valueOf(iHashCode), oVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType(MimeTypes.PLAIN_TEXT);
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z3);
        ((Activity) ((u0) this.f344l).f3794a).startActivityForResult(intent, iHashCode);
    }

    public final HashMap c() {
        HashMap map = this.f345m;
        PackageManager packageManager = this.f343k;
        if (map == null) {
            this.f345m = new HashMap();
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(MimeTypes.PLAIN_TEXT);
            for (ResolveInfo resolveInfo : Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(type, 0)) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f345m.put(str, resolveInfo);
            }
        }
        HashMap map2 = new HashMap();
        for (String str2 : this.f345m.keySet()) {
            map2.put(str2, ((ResolveInfo) this.f345m.get(str2)).loadLabel(packageManager).toString());
        }
        return map2;
    }

    @Override // p070z1.a
    public final void onAttachedToActivity(p070z1.b bVar) {
        this.f344l = bVar;
        ((u0) bVar).a(this);
    }

    @Override // p070z1.a
    public final void onDetachedFromActivity() {
        ((HashSet) ((u0) this.f344l).f3797d).remove(this);
        this.f344l = null;
    }

    @Override // p070z1.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((u0) this.f344l).f3797d).remove(this);
        this.f344l = null;
    }

    @Override // p070z1.a
    public final void onReattachedToActivityForConfigChanges(p070z1.b bVar) {
        this.f344l = bVar;
        ((u0) bVar).a(this);
    }

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
    }
}
