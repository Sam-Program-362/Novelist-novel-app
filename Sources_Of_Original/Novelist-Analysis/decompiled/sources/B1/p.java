package B1;

import android.os.Bundle;
import androidx.lifecycle.C0135i;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f138f;

    public static HashMap b(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public Bundle a(String str) {
        if (!this.f134b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f137e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f137e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f137e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f137e = null;
        return bundle2;
    }

    public void c(String str, p038m0.d dVar) {
        Object obj;
        a2.h.e(dVar, "provider");
        p037m.f fVar = (p037m.f) this.f136d;
        p037m.c cVarA = fVar.a(str);
        if (cVarA != null) {
            obj = cVarA.f4088l;
        } else {
            p037m.c cVar = new p037m.c(str, dVar);
            fVar.n++;
            p037m.c cVar2 = fVar.f4094l;
            if (cVar2 == null) {
                fVar.f4093k = cVar;
                fVar.f4094l = cVar;
            } else {
                cVar2.f4089m = cVar;
                cVar.n = cVar2;
                fVar.f4094l = cVar;
            }
            obj = null;
        }
        if (((p038m0.d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void d() {
        if (!this.f135c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        p038m0.a aVar = (p038m0.a) this.f138f;
        if (aVar == null) {
            aVar = new p038m0.a(this);
        }
        this.f138f = aVar;
        try {
            C0135i.class.getDeclaredConstructor(null);
            p038m0.a aVar2 = (p038m0.a) this.f138f;
            if (aVar2 != null) {
                aVar2.f4096a.add(C0135i.class.getName());
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + C0135i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
