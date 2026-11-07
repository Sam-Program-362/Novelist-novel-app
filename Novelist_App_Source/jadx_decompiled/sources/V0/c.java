package V0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import b1.C0177B;
import b1.C0179D;
import b1.C0185J;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends f {
    public static final Parcelable.Creator<c> CREATOR = new l(3);

    /* renamed from: k, reason: collision with root package name */
    public final C0185J f1496k;

    /* renamed from: l, reason: collision with root package name */
    public final C0185J f1497l;

    /* renamed from: m, reason: collision with root package name */
    public final C0185J f1498m;
    public final C0185J n;

    /* renamed from: o, reason: collision with root package name */
    public final C0185J f1499o;

    public c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        r.f(bArr);
        C0185J i3 = C0185J.i(bArr, bArr.length);
        r.f(bArr2);
        C0185J i4 = C0185J.i(bArr2, bArr2.length);
        r.f(bArr3);
        C0185J i5 = C0185J.i(bArr3, bArr3.length);
        r.f(bArr4);
        C0185J i6 = C0185J.i(bArr4, bArr4.length);
        C0185J i7 = bArr5 == null ? null : C0185J.i(bArr5, bArr5.length);
        this.f1496k = i3;
        this.f1497l = i4;
        this.f1498m = i5;
        this.n = i6;
        this.f1499o = i7;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", E2.a.p(this.f1497l.j()));
            jSONObject.put("authenticatorData", E2.a.p(this.f1498m.j()));
            jSONObject.put("signature", E2.a.p(this.n.j()));
            C0185J c0185j = this.f1499o;
            if (c0185j == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", E2.a.p(c0185j == null ? null : c0185j.j()));
            return jSONObject;
        } catch (JSONException e3) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return r.i(this.f1496k, cVar.f1496k) && r.i(this.f1497l, cVar.f1497l) && r.i(this.f1498m, cVar.f1498m) && r.i(this.n, cVar.n) && r.i(this.f1499o, cVar.f1499o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f1496k})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f1497l})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f1498m})), Integer.valueOf(Arrays.hashCode(new Object[]{this.n})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f1499o}))});
    }

    public final String toString() {
        A0.j jVar = new A0.j(getClass().getSimpleName());
        C0177B c0177b = C0179D.f2579d;
        byte[] j3 = this.f1496k.j();
        jVar.N(c0177b.c(j3, j3.length), "keyHandle");
        byte[] j4 = this.f1497l.j();
        jVar.N(c0177b.c(j4, j4.length), "clientDataJSON");
        byte[] j5 = this.f1498m.j();
        jVar.N(c0177b.c(j5, j5.length), "authenticatorData");
        byte[] j6 = this.n.j();
        jVar.N(c0177b.c(j6, j6.length), "signature");
        C0185J c0185j = this.f1499o;
        byte[] j7 = c0185j == null ? null : c0185j.j();
        if (j7 != null) {
            jVar.N(c0177b.c(j7, j7.length), "userHandle");
        }
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.H(parcel, 2, this.f1496k.j());
        H2.h.H(parcel, 3, this.f1497l.j());
        H2.h.H(parcel, 4, this.f1498m.j());
        H2.h.H(parcel, 5, this.n.j());
        C0185J c0185j = this.f1499o;
        H2.h.H(parcel, 6, c0185j == null ? null : c0185j.j());
        H2.h.R(parcel, Q2);
    }
}
