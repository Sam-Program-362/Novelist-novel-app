package u0;

import V.S;
import h2.AbstractC0273d;
import java.math.BigInteger;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: p, reason: collision with root package name */
    public static final h f4601p;

    /* renamed from: k, reason: collision with root package name */
    public final int f4602k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4603l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4604m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final O1.e f4605o = new O1.e(new S(this, 4));

    static {
        new h(0, 0, 0, StringUtils.EMPTY);
        f4601p = new h(0, 1, 0, StringUtils.EMPTY);
        new h(1, 0, 0, StringUtils.EMPTY);
    }

    public h(int i3, int i4, int i5, String str) {
        this.f4602k = i3;
        this.f4603l = i4;
        this.f4604m = i5;
        this.n = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        a2.h.e(hVar, "other");
        Object a3 = this.f4605o.a();
        a2.h.d(a3, "<get-bigInteger>(...)");
        Object a4 = hVar.f4605o.a();
        a2.h.d(a4, "<get-bigInteger>(...)");
        return ((BigInteger) a3).compareTo((BigInteger) a4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f4602k == hVar.f4602k && this.f4603l == hVar.f4603l && this.f4604m == hVar.f4604m;
    }

    public final int hashCode() {
        return ((((527 + this.f4602k) * 31) + this.f4603l) * 31) + this.f4604m;
    }

    public final String toString() {
        String str;
        String str2 = this.n;
        if (AbstractC0273d.d0(str2)) {
            str = StringUtils.EMPTY;
        } else {
            str = "-" + str2;
        }
        return this.f4602k + '.' + this.f4603l + '.' + this.f4604m + str;
    }
}
