package A;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f14a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16c;

    /* renamed from: d, reason: collision with root package name */
    public final List f17d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18e;

    /* renamed from: f, reason: collision with root package name */
    public final String f19f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20g;

    public g(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f14a = str;
        str2.getClass();
        this.f15b = str2;
        this.f16c = str3;
        list.getClass();
        this.f17d = list;
        this.f18e = str4;
        this.f19f = str5;
        this.f20g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f14a + ", mProviderPackage: " + this.f15b + ", mQuery: " + this.f16c + ", mSystemFont: " + this.f18e + ", mVariationSettings: " + this.f19f + ", mCertificates:");
        int i3 = 0;
        while (true) {
            List list = this.f17d;
            if (i3 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i3);
            for (int i4 = 0; i4 < list2.size(); i4++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i3++;
        }
    }
}
