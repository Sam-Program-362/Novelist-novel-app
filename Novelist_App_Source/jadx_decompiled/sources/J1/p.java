package J1;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.AbstractC0142n;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import k.u0;
import org.apache.tika.utils.StringUtils;
import y1.C0500a;
import z1.InterfaceC0508a;
import z1.InterfaceC0509b;

/* loaded from: classes.dex */
public class p implements y1.b, InterfaceC0508a, h {

    /* renamed from: k, reason: collision with root package name */
    public C0500a f617k;

    /* renamed from: l, reason: collision with root package name */
    public u0 f618l;

    public final b a() {
        boolean z3;
        b bVar;
        H.f fVar;
        Set<String> stringSet;
        u0 u0Var = this.f618l;
        n nVar = (u0Var == null || ((Activity) u0Var.f3795b) == null) ? null : (n) u0Var.f3796c;
        if (nVar == null) {
            throw new d("no_activity", "image_picker plugin requires a foreground activity.");
        }
        H.f fVar2 = nVar.n;
        fVar2.getClass();
        HashMap hashMap = new HashMap();
        int i3 = 0;
        SharedPreferences sharedPreferences = fVar2.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        boolean z4 = true;
        if (!sharedPreferences.contains("flutter_image_picker_image_path") || (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) == null) {
            z3 = false;
        } else {
            hashMap.put("pathList", new ArrayList(stringSet));
            z3 = true;
        }
        if (sharedPreferences.contains("flutter_image_picker_error_code")) {
            hashMap.put("error", new a(sharedPreferences.getString("flutter_image_picker_error_code", StringUtils.EMPTY), sharedPreferences.getString("flutter_image_picker_error_message", null)));
        } else {
            z4 = z3;
        }
        int i4 = 100;
        if (z4) {
            if (sharedPreferences.contains("flutter_image_picker_type")) {
                hashMap.put("type", sharedPreferences.getString("flutter_image_picker_type", StringUtils.EMPTY).equals("video") ? c.n : c.f581m);
            }
            bVar = null;
            fVar = fVar2;
            if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                hashMap.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
            }
            if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                hashMap.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
            }
            hashMap.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        } else {
            bVar = null;
            fVar = fVar2;
        }
        if (hashMap.isEmpty()) {
            return bVar;
        }
        c cVar = (c) hashMap.get("type");
        ArrayList arrayList = (ArrayList) hashMap.get("pathList");
        if (cVar == null || arrayList == null) {
            fVar.a();
            return bVar;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str = (String) obj;
            Double d3 = (Double) hashMap.get("maxWidth");
            Double d4 = (Double) hashMap.get("maxHeight");
            Integer num = (Integer) hashMap.get("imageQuality");
            if (num != null) {
                i4 = num.intValue();
            }
            arrayList2.add(nVar.f607m.c(str, d3, d4, i4));
            i4 = 100;
        }
        fVar.a();
        return new b(cVar, (a) hashMap.get("error"), arrayList2);
    }

    @Override // z1.InterfaceC0508a
    public final void onAttachedToActivity(InterfaceC0509b interfaceC0509b) {
        C0500a c0500a = this.f617k;
        C1.f fVar = c0500a.f4730c;
        Application application = (Application) c0500a.f4728a;
        u0 u0Var = (u0) interfaceC0509b;
        Activity activity = (Activity) u0Var.f3794a;
        u0 u0Var2 = new u0();
        u0Var2.f3794a = application;
        u0Var2.f3795b = activity;
        u0Var2.f3798e = interfaceC0509b;
        u0Var2.f3799f = fVar;
        u0Var2.f3796c = new n(activity, new H.f(activity, new B1.b(13)), new H.f(activity));
        h.f593c.getClass();
        g.a(fVar, this);
        u0Var2.f3797d = new o(this, activity);
        u0Var.a((n) u0Var2.f3796c);
        ((HashSet) u0Var.f3796c).add((n) u0Var2.f3796c);
        AbstractC0142n lifecycle = ((HiddenLifecycleReference) u0Var.f3795b).getLifecycle();
        u0Var2.f3800g = lifecycle;
        lifecycle.a((o) u0Var2.f3797d);
        this.f618l = u0Var2;
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        this.f617k = c0500a;
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivity() {
        u0 u0Var = this.f618l;
        if (u0Var != null) {
            InterfaceC0509b interfaceC0509b = (InterfaceC0509b) u0Var.f3798e;
            if (interfaceC0509b != null) {
                ((HashSet) ((u0) interfaceC0509b).f3797d).remove((n) u0Var.f3796c);
                InterfaceC0509b interfaceC0509b2 = (InterfaceC0509b) u0Var.f3798e;
                ((HashSet) ((u0) interfaceC0509b2).f3796c).remove((n) u0Var.f3796c);
                u0Var.f3798e = null;
            }
            AbstractC0142n abstractC0142n = (AbstractC0142n) u0Var.f3800g;
            if (abstractC0142n != null) {
                abstractC0142n.b((o) u0Var.f3797d);
                u0Var.f3800g = null;
            }
            C1.f fVar = (C1.f) u0Var.f3799f;
            h.f593c.getClass();
            g.a(fVar, null);
            Application application = (Application) u0Var.f3794a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks((o) u0Var.f3797d);
                u0Var.f3794a = null;
            }
            u0Var.f3795b = null;
            u0Var.f3797d = null;
            u0Var.f3796c = null;
            this.f618l = null;
        }
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        this.f617k = null;
    }

    @Override // z1.InterfaceC0508a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0509b interfaceC0509b) {
        onAttachedToActivity(interfaceC0509b);
    }
}
