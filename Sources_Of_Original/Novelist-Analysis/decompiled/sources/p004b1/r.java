package p004b1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0185s implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f2636l = new r(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r f2637m = new r(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2638k;

    public /* synthetic */ r(int i3) {
        this.f2638k = i3;
    }

    @Override // p004b1.AbstractC0185s
    public final AbstractC0185s a() {
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
