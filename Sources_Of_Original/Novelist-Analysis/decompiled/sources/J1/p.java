package J1;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.AbstractC0140n;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
import p031k.u0;

/* JADX INFO: loaded from: classes.dex */
public class p implements p067y1.b, p070z1.a, h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p067y1.a f617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u0 f618l;

    public final b a() {
        boolean z3;
        Set<String> stringSet;
        u0 u0Var = this.f618l;
        n nVar = (u0Var == null || ((Activity) u0Var.f3795b) == null) ? null : (n) u0Var.f3796c;
        if (nVar == null) {
            throw new d("no_activity", "image_picker plugin requires a foreground activity.");
        }
        H.f fVar = nVar.n;
        fVar.getClass();
        HashMap map = new HashMap();
        int i3 = 0;
        SharedPreferences sharedPreferences = fVar.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        boolean z4 = true;
        if (!sharedPreferences.contains("flutter_image_picker_image_path") || (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) == null) {
            z3 = false;
        } else {
            map.put("pathList", new ArrayList(stringSet));
            z3 = true;
        }
        if (sharedPreferences.contains("flutter_image_picker_error_code")) {
            map.put("error", new a(sharedPreferences.getString("flutter_image_picker_error_code", StringUtils.EMPTY), sharedPreferences.getString("flutter_image_picker_error_message", null)));
        } else {
            z4 = z3;
        }
        int iIntValue = 100;
        if (z4) {
            if (sharedPreferences.contains("flutter_image_picker_type")) {
                map.put("type", sharedPreferences.getString("flutter_image_picker_type", StringUtils.EMPTY).equals("video") ? c.n : c.f581m);
            }
            if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                map.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
            }
            if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                map.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
            }
            map.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        }
        if (map.isEmpty()) {
            return 0;
        }
        c cVar = (c) map.get("type");
        ArrayList arrayList = (ArrayList) map.get("pathList");
        if (cVar == null || arrayList == null) {
            fVar.a();
            return r2;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str = (String) obj;
            Double d3 = (Double) map.get("maxWidth");
            Double d4 = (Double) map.get("maxHeight");
            Integer num = (Integer) map.get("imageQuality");
            if (num != null) {
                iIntValue = num.intValue();
            }
            arrayList2.add(nVar.f607m.c(str, d3, d4, iIntValue));
            iIntValue = 100;
        }
        fVar.a();
        return new b(cVar, (a) map.get("error"), arrayList2);
    }

    @Override // p070z1.a
    public final void onAttachedToActivity(p070z1.b bVar) {
        p067y1.a aVar = this.f617k;
        C1.f fVar = aVar.f4730c;
        Application application = (Application) aVar.f4728a;
        u0 u0Var = (u0) bVar;
        Activity activity = (Activity) u0Var.f3794a;
        u0 u0Var2 = new u0();
        u0Var2.f3794a = application;
        u0Var2.f3795b = activity;
        u0Var2.f3798e = bVar;
        u0Var2.f3799f = fVar;
        u0Var2.f3796c = new n(activity, new H.f(activity, new B1.b(13)), new H.f(activity));
        h.f593c.getClass();
        g.a(fVar, this);
        u0Var2.f3797d = new o(this, activity);
        u0Var.a((n) u0Var2.f3796c);
        ((HashSet) u0Var.f3796c).add((n) u0Var2.f3796c);
        AbstractC0140n lifecycle = ((HiddenLifecycleReference) u0Var.f3795b).getLifecycle();
        u0Var2.f3800g = lifecycle;
        lifecycle.a((o) u0Var2.f3797d);
        this.f618l = u0Var2;
    }

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        this.f617k = aVar;
    }

    @Override // p070z1.a
    public final void onDetachedFromActivity() {
        u0 u0Var = this.f618l;
        if (u0Var != null) {
            p070z1.b bVar = (p070z1.b) u0Var.f3798e;
            if (bVar != null) {
                ((HashSet) ((u0) bVar).f3797d).remove((n) u0Var.f3796c);
                p070z1.b bVar2 = (p070z1.b) u0Var.f3798e;
                ((HashSet) ((u0) bVar2).f3796c).remove((n) u0Var.f3796c);
                u0Var.f3798e = null;
            }
            AbstractC0140n abstractC0140n = (AbstractC0140n) u0Var.f3800g;
            if (abstractC0140n != null) {
                abstractC0140n.b((o) u0Var.f3797d);
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

    @Override // p070z1.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        this.f617k = null;
    }

    @Override // p070z1.a
    public final void onReattachedToActivityForConfigChanges(p070z1.b bVar) {
        onAttachedToActivity(bVar);
    }
}
