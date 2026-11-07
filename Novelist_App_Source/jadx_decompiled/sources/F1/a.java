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
import java.util.List;
import k.u0;
import org.apache.tika.mime.MimeTypes;
import y1.C0500a;
import y1.b;
import z1.InterfaceC0508a;
import z1.InterfaceC0509b;

/* loaded from: classes.dex */
public class a implements b, InterfaceC0508a, o {

    /* renamed from: k, reason: collision with root package name */
    public final PackageManager f343k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0509b f344l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f345m;
    public final HashMap n = new HashMap();

    public a(c cVar) {
        this.f343k = (PackageManager) cVar.f6l;
        cVar.f7m = this;
    }

    @Override // C1.o
    public final boolean a(int i3, int i4, Intent intent) {
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = this.n;
        if (!hashMap.containsKey(valueOf)) {
            return false;
        }
        ((B1.o) hashMap.remove(Integer.valueOf(i3))).d(i4 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    public final void b(String str, String str2, boolean z3, B1.o oVar) {
        if (this.f344l == null) {
            oVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f345m;
        if (hashMap == null) {
            oVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            oVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = oVar.hashCode();
        this.n.put(Integer.valueOf(hashCode), oVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType(MimeTypes.PLAIN_TEXT);
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z3);
        ((Activity) ((u0) this.f344l).f3794a).startActivityForResult(intent, hashCode);
    }

    public final HashMap c() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f345m;
        PackageManager packageManager = this.f343k;
        if (hashMap == null) {
            this.f345m = new HashMap();
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(MimeTypes.PLAIN_TEXT);
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f345m.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f345m.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f345m.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // z1.InterfaceC0508a
    public final void onAttachedToActivity(InterfaceC0509b interfaceC0509b) {
        this.f344l = interfaceC0509b;
        ((u0) interfaceC0509b).a(this);
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivity() {
        ((HashSet) ((u0) this.f344l).f3797d).remove(this);
        this.f344l = null;
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((u0) this.f344l).f3797d).remove(this);
        this.f344l = null;
    }

    @Override // z1.InterfaceC0508a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0509b interfaceC0509b) {
        this.f344l = interfaceC0509b;
        ((u0) interfaceC0509b).a(this);
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
    }
}
