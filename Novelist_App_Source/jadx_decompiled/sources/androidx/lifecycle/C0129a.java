package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2138a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2139b;

    public C0129a(HashMap hashMap) {
        this.f2139b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0140l enumC0140l = (EnumC0140l) entry.getValue();
            List list = (List) this.f2138a.get(enumC0140l);
            if (list == null) {
                list = new ArrayList();
                this.f2138a.put(enumC0140l, list);
            }
            list.add((C0130b) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0146s interfaceC0146s, EnumC0140l enumC0140l, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0130b c0130b = (C0130b) list.get(size);
                Method method = c0130b.f2141b;
                try {
                    int i3 = c0130b.f2140a;
                    if (i3 == 0) {
                        method.invoke(obj, null);
                    } else if (i3 == 1) {
                        method.invoke(obj, interfaceC0146s);
                    } else if (i3 == 2) {
                        method.invoke(obj, interfaceC0146s, enumC0140l);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to call observer method", e4.getCause());
                }
            }
        }
    }
}
