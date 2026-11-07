package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0102a f2008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f2010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2011d;

    public U(AbstractC0122v abstractC0122v, String str, Object[] objArr) {
        this.f2008a = abstractC0122v;
        this.f2009b = str;
        this.f2010c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2011d = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i4 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 55296) {
                this.f2011d = i3 | (cCharAt2 << i4);
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i4;
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
