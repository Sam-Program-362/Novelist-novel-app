package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0127a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2138a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2139b;

    public C0127a(HashMap map) {
        this.f2139b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0138l enumC0138l = (EnumC0138l) entry.getValue();
            List arrayList = (List) this.f2138a.get(enumC0138l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2138a.put(enumC0138l, arrayList);
            }
            arrayList.add((C0128b) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0144s interfaceC0144s, EnumC0138l enumC0138l, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0128b c0128b = (C0128b) list.get(size);
                Method method = c0128b.f2141b;
                try {
                    int i3 = c0128b.f2140a;
                    if (i3 == 0) {
                        method.invoke(obj, null);
                    } else if (i3 == 1) {
                        method.invoke(obj, interfaceC0144s);
                    } else if (i3 == 2) {
                        method.invoke(obj, interfaceC0144s, enumC0138l);
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
