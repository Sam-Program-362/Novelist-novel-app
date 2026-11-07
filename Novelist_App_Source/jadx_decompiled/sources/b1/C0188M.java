package b1;

import java.util.Arrays;

/* renamed from: b1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188M extends AbstractC0196V {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2595k;

    public C0188M(boolean z3) {
        this.f2595k = z3;
    }

    @Override // b1.AbstractC0196V
    public final int a() {
        return AbstractC0196V.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC0196V abstractC0196V = (AbstractC0196V) obj;
        int a3 = abstractC0196V.a();
        int d3 = AbstractC0196V.d((byte) -32);
        if (d3 != a3) {
            return d3 - abstractC0196V.a();
        }
        return (true != this.f2595k ? 20 : 21) - (true != ((C0188M) abstractC0196V).f2595k ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0188M.class == obj.getClass() && this.f2595k == ((C0188M) obj).f2595k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC0196V.d((byte) -32)), Boolean.valueOf(this.f2595k)});
    }

    public final String toString() {
        return Boolean.toString(this.f2595k);
    }
}
