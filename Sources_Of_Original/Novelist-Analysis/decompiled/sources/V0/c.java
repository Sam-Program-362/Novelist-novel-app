package V0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p004b1.B;
import p004b1.D;
import p004b1.J;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {
    public static final Parcelable.Creator<c> CREATOR = new l(3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J f1496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final J f1497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final J f1498m;
    public final J n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J f1499o;

    public c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        r.f(bArr);
        J jI = J.i(bArr, bArr.length);
        r.f(bArr2);
        J jI2 = J.i(bArr2, bArr2.length);
        r.f(bArr3);
        J jI3 = J.i(bArr3, bArr3.length);
        r.f(bArr4);
        J jI4 = J.i(bArr4, bArr4.length);
        J jI5 = bArr5 == null ? null : J.i(bArr5, bArr5.length);
        this.f1496k = jI;
        this.f1497l = jI2;
        this.f1498m = jI3;
        this.n = jI4;
        this.f1499o = jI5;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", E2.a.p(this.f1497l.j()));
            jSONObject.put("authenticatorData", E2.a.p(this.f1498m.j()));
            jSONObject.put("signature", E2.a.p(this.n.j()));
            J j3 = this.f1499o;
            if (j3 == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", E2.a.p(j3 == null ? null : j3.j()));
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
        B b3 = D.f2579d;
        byte[] bArrJ = this.f1496k.j();
        jVar.N(b3.c(bArrJ, bArrJ.length), "keyHandle");
        byte[] bArrJ2 = this.f1497l.j();
        jVar.N(b3.c(bArrJ2, bArrJ2.length), "clientDataJSON");
        byte[] bArrJ3 = this.f1498m.j();
        jVar.N(b3.c(bArrJ3, bArrJ3.length), "authenticatorData");
        byte[] bArrJ4 = this.n.j();
        jVar.N(b3.c(bArrJ4, bArrJ4.length), "signature");
        J j3 = this.f1499o;
        byte[] bArrJ5 = j3 == null ? null : j3.j();
        if (bArrJ5 != null) {
            jVar.N(b3.c(bArrJ5, bArrJ5.length), "userHandle");
        }
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.H(parcel, 2, this.f1496k.j());
        H2.h.H(parcel, 3, this.f1497l.j());
        H2.h.H(parcel, 4, this.f1498m.j());
        H2.h.H(parcel, 5, this.n.j());
        J j3 = this.f1499o;
        H2.h.H(parcel, 6, j3 == null ? null : j3.j());
        H2.h.R(parcel, iQ);
    }
}
