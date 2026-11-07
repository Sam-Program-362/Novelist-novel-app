package B1;

import android.os.Bundle;
import androidx.lifecycle.C0137i;
import java.util.HashMap;
import m.C0423c;
import m.C0426f;
import m0.C0427a;
import m0.InterfaceC0430d;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f133a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f134b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f135c;

    /* renamed from: d, reason: collision with root package name */
    public Object f136d;

    /* renamed from: e, reason: collision with root package name */
    public Object f137e;

    /* renamed from: f, reason: collision with root package name */
    public Object f138f;

    public static HashMap b(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
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

    public void c(String str, InterfaceC0430d interfaceC0430d) {
        Object obj;
        a2.h.e(interfaceC0430d, "provider");
        C0426f c0426f = (C0426f) this.f136d;
        C0423c a3 = c0426f.a(str);
        if (a3 != null) {
            obj = a3.f4088l;
        } else {
            C0423c c0423c = new C0423c(str, interfaceC0430d);
            c0426f.n++;
            C0423c c0423c2 = c0426f.f4094l;
            if (c0423c2 == null) {
                c0426f.f4093k = c0423c;
                c0426f.f4094l = c0423c;
            } else {
                c0423c2.f4089m = c0423c;
                c0423c.n = c0423c2;
                c0426f.f4094l = c0423c;
            }
            obj = null;
        }
        if (((InterfaceC0430d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void d() {
        if (!this.f135c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0427a c0427a = (C0427a) this.f138f;
        if (c0427a == null) {
            c0427a = new C0427a(this);
        }
        this.f138f = c0427a;
        try {
            C0137i.class.getDeclaredConstructor(null);
            C0427a c0427a2 = (C0427a) this.f138f;
            if (c0427a2 != null) {
                c0427a2.f4096a.add(C0137i.class.getName());
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + C0137i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
