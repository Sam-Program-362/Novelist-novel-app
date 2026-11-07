package b1;

import java.io.Serializable;

/* renamed from: b1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214r extends AbstractC0215s implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final C0214r f2636l = new C0214r(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C0214r f2637m = new C0214r(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2638k;

    public /* synthetic */ C0214r(int i3) {
        this.f2638k = i3;
    }

    @Override // b1.AbstractC0215s
    public final AbstractC0215s a() {
        switch (this.f2638k) {
            case 0:
                return f2637m;
            default:
                return f2636l;
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f2638k) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f2638k) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
