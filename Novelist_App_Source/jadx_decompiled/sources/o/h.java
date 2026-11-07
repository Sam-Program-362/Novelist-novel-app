package o;

import java.util.ConcurrentModificationException;
import p.AbstractC0443a;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4199a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4200b = new Object();

    public static final void a(f fVar, int i3) {
        fVar.f4193k = new int[i3];
        fVar.f4194l = new Object[i3];
    }

    public static final int b(f fVar, Object obj, int i3) {
        int i4 = fVar.f4195m;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0443a.a(i4, i3, fVar.f4193k);
            if (a3 < 0 || a2.h.a(obj, fVar.f4194l[a3])) {
                return a3;
            }
            int i5 = a3 + 1;
            while (i5 < i4 && fVar.f4193k[i5] == i3) {
                if (a2.h.a(obj, fVar.f4194l[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a3 - 1; i6 >= 0 && fVar.f4193k[i6] == i3; i6--) {
                if (a2.h.a(obj, fVar.f4194l[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
