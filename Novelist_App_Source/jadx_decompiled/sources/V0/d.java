package V0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import b1.C0177B;
import b1.C0179D;
import b1.C0185J;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends f {
    public static final Parcelable.Creator<d> CREATOR = new l(4);

    /* renamed from: k, reason: collision with root package name */
    public final C0185J f1500k;

    /* renamed from: l, reason: collision with root package name */
    public final C0185J f1501l;

    /* renamed from: m, reason: collision with root package name */
    public final C0185J f1502m;
    public final String[] n;

    public d(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        r.f(bArr);
        C0185J i3 = C0185J.i(bArr, bArr.length);
        r.f(bArr2);
        C0185J i4 = C0185J.i(bArr2, bArr2.length);
        r.f(bArr3);
        C0185J i5 = C0185J.i(bArr3, bArr3.length);
        this.f1500k = i3;
        this.f1501l = i4;
        this.f1502m = i5;
        r.f(strArr);
        this.n = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0215 A[Catch: JSONException -> 0x0021, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0021, blocks: (B:3:0x000a, B:5:0x0013, B:8:0x0028, B:9:0x0035, B:10:0x003c, B:12:0x003f, B:14:0x0049, B:16:0x0054, B:17:0x004f, B:20:0x0057, B:22:0x0060, B:24:0x006a, B:26:0x007b, B:27:0x0083, B:29:0x0091, B:31:0x00a3, B:33:0x00c1, B:35:0x00d0, B:36:0x00d9, B:40:0x00e6, B:41:0x00e9, B:42:0x00ef, B:47:0x0111, B:53:0x0201, B:55:0x0215, B:58:0x0134, B:60:0x0145, B:65:0x015b, B:68:0x0177, B:70:0x018c, B:72:0x0191, B:73:0x01ac, B:74:0x01b1, B:75:0x01b2, B:76:0x01b9, B:81:0x01c6, B:83:0x01d3, B:85:0x01e0, B:86:0x01f5, B:87:0x01fa, B:88:0x01fb, B:89:0x0200, B:91:0x0222, B:92:0x0227, B:95:0x0228, B:96:0x022f, B:97:0x0230, B:98:0x0236, B:104:0x0238, B:105:0x023b, B:108:0x00d3, B:110:0x023f, B:111:0x0246, B:113:0x0249, B:114:0x0250, B:116:0x0251, B:117:0x0258, B:118:0x025b, B:119:0x0262, B:121:0x0263, B:122:0x026a, B:126:0x026e, B:127:0x0275), top: B:2:0x000a, inners: #7, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject b() {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.d.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return r.i(this.f1500k, dVar.f1500k) && r.i(this.f1501l, dVar.f1501l) && r.i(this.f1502m, dVar.f1502m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f1500k})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f1501l})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f1502m}))});
    }

    public final String toString() {
        A0.j jVar = new A0.j(getClass().getSimpleName());
        C0177B c0177b = C0179D.f2579d;
        byte[] j3 = this.f1500k.j();
        jVar.N(c0177b.c(j3, j3.length), "keyHandle");
        byte[] j4 = this.f1501l.j();
        jVar.N(c0177b.c(j4, j4.length), "clientDataJSON");
        byte[] j5 = this.f1502m.j();
        jVar.N(c0177b.c(j5, j5.length), "attestationObject");
        jVar.N(Arrays.toString(this.n), "transports");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.H(parcel, 2, this.f1500k.j());
        H2.h.H(parcel, 3, this.f1501l.j());
        H2.h.H(parcel, 4, this.f1502m.j());
        String[] strArr = this.n;
        if (strArr != null) {
            int Q3 = H2.h.Q(parcel, 5);
            parcel.writeStringArray(strArr);
            H2.h.R(parcel, Q3);
        }
        H2.h.R(parcel, Q2);
    }
}
