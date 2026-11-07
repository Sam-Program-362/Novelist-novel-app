package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0104a f2008a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2009b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2010c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2011d;

    public U(AbstractC0124v abstractC0124v, String str, Object[] objArr) {
        this.f2008a = abstractC0124v;
        this.f2009b = str;
        this.f2010c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2011d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i4 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 < 55296) {
                this.f2011d = i3 | (charAt2 << i4);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i5 = i6;
            }
        }
    }

    public final int a() {
        int i3 = this.f2011d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
