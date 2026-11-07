package V0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p004b1.AbstractC0168a;
import p004b1.B;
import p004b1.C0182o;
import p004b1.D;
import p004b1.I;
import p004b1.J;
import p004b1.N;
import p004b1.O;
import p004b1.P;
import p004b1.S;
import p004b1.T;
import p004b1.U;
import p004b1.V;
import p004b1.X;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f {
    public static final Parcelable.Creator<d> CREATOR = new l(4);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J f1500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final J f1501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final J f1502m;
    public final String[] n;

    public d(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        r.f(bArr);
        J jI = J.i(bArr, bArr.length);
        r.f(bArr2);
        J jI2 = J.i(bArr2, bArr2.length);
        r.f(bArr3);
        J jI3 = J.i(bArr3, bArr3.length);
        this.f1500k = jI;
        this.f1501l = jI2;
        this.f1502m = jI3;
        r.f(strArr);
        this.n = strArr;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0145 A[Catch: JSONException -> 0x0021, U -> 0x01a9, TRY_LEAVE, TryCatch #7 {U -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:127:0x0111, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d3 A[Catch: JSONException -> 0x0021, U -> 0x01a9, TryCatch #7 {U -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:127:0x0111, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e0 A[Catch: JSONException -> 0x0021, U -> 0x01a9, TryCatch #7 {U -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:127:0x0111, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01f5 A[Catch: JSONException -> 0x0021, U -> 0x01a9, TryCatch #7 {U -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:127:0x0111, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fb A[Catch: JSONException -> 0x0021, U -> 0x01a9, TryCatch #7 {U -> 0x01a9, blocks: (B:41:0x0111, B:47:0x0134, B:49:0x0145, B:54:0x015b, B:57:0x0177, B:59:0x018c, B:61:0x0191, B:64:0x01ac, B:65:0x01b1, B:66:0x01b2, B:67:0x01b9, B:72:0x01c6, B:74:0x01d3, B:76:0x01e0, B:77:0x01f5, B:78:0x01fa, B:79:0x01fb, B:80:0x0200, B:86:0x0222, B:87:0x0227), top: B:127:0x0111, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0221  */
    public final JSONObject b() {
        V v3;
        V v4;
        J j3;
        String[] strArr = this.n;
        try {
            JSONObject jSONObject = new JSONObject();
            J j4 = this.f1501l;
            if (j4 != null) {
                jSONObject.put("clientDataJSON", E2.a.p(j4.j()));
            }
            J j5 = this.f1502m;
            if (j5 != null) {
                jSONObject.put("attestationObject", E2.a.p(j5.j()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (strArr[i3].equals("cable")) {
                    jSONArray.put(i3, "hybrid");
                } else {
                    jSONArray.put(i3, strArr[i3]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    V v5 = (V) ((S) V.e(j5.j()).c(S.class)).f2602l.get(new T("authData"));
                    if (v5 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    J j6 = ((N) v5.c(N.class)).f2596k;
                    byte[] bArr = j6.f2591l;
                    ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, j6.d()).asReadOnlyBuffer();
                    try {
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                        if ((byteBufferAsReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                        try {
                            try {
                                int iPosition = byteBufferAsReadOnlyBuffer.position();
                                int iG = J.g(iPosition, bArr.length, j6.d());
                                X x = new X((iG == 0 ? J.f2589m : new I(bArr, iPosition, iG)).f());
                                try {
                                    V vK = AbstractC0168a.k(x);
                                    try {
                                        x.close();
                                    } catch (IOException unused) {
                                    }
                                    C0182o c0182o = ((S) vK.c(S.class)).f2602l;
                                    V v6 = (V) c0182o.get(new P(3L));
                                    V v7 = (V) c0182o.get(new P(1L));
                                    if (v6 == null || v7 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    try {
                                        long j7 = ((P) v6.c(P.class)).f2597k;
                                        long j8 = ((P) v7.c(P.class)).f2597k;
                                        byte[] bArrJ = null;
                                        if (j8 == 1) {
                                            v3 = (V) c0182o.get(new P(-1L));
                                            if (v3 != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j9 = ((P) v3.c(P.class)).f2597k;
                                            if (j8 != 2 && j9 == 1) {
                                                V v8 = (V) c0182o.get(new P(-2L));
                                                V v9 = (V) c0182o.get(new P(-3L));
                                                if (v8 == null || v9 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                J j10 = ((N) v8.c(N.class)).f2596k;
                                                J j11 = ((N) v9.c(N.class)).f2596k;
                                                if (j10.f2591l.length != 32 || j11.f2591l.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = AbstractC0168a.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), j10.j(), j11.j());
                                            } else if (j8 == 1 && j9 == 6) {
                                                v4 = (V) c0182o.get(new P(-2L));
                                                if (v4 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                j3 = ((N) v4.c(N.class)).f2596k;
                                                if (j3.f2591l.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = AbstractC0168a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), j3.j());
                                            }
                                        } else if (j8 == 2) {
                                            j8 = 2;
                                            v3 = (V) c0182o.get(new P(-1L));
                                            if (v3 != null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            long j12 = ((P) v3.c(P.class)).f2597k;
                                            if (j8 != 2) {
                                                if (j8 == 1) {
                                                    v4 = (V) c0182o.get(new P(-2L));
                                                    if (v4 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    j3 = ((N) v4.c(N.class)).f2596k;
                                                    if (j3.f2591l.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArrJ = AbstractC0168a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), j3.j());
                                                }
                                            } else if (j8 == 1) {
                                                v4 = (V) c0182o.get(new P(-2L));
                                                if (v4 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                j3 = ((N) v4.c(N.class)).f2596k;
                                                if (j3.f2591l.length != 32) {
                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                }
                                                bArrJ = AbstractC0168a.j(Base64.decode("MCowBQYDK2VwAyEA", 0), j3.j());
                                            }
                                        }
                                        byte[] bArr2 = bArrJ;
                                        jSONObject.put("authenticatorData", E2.a.p(j6.j()));
                                        jSONObject.put("publicKeyAlgorithm", j7);
                                        if (bArr2 != null) {
                                            jSONObject.put("publicKey", Base64.encodeToString(bArr2, 11));
                                        }
                                        return jSONObject;
                                    } catch (U e3) {
                                        throw new IllegalArgumentException("COSE key ill-formed", e3);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        x.close();
                                    } catch (IOException unused2) {
                                    }
                                    throw th;
                                }
                            } catch (O e4) {
                                e = e4;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (U e5) {
                            e = e5;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e6) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e6);
                    }
                } catch (U e7) {
                    throw new IllegalArgumentException("authData value has wrong type", e7);
                }
            } catch (O e8) {
                e = e8;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (U e9) {
                e = e9;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e10);
        }
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
        B b3 = D.f2579d;
        byte[] bArrJ = this.f1500k.j();
        jVar.N(b3.c(bArrJ, bArrJ.length), "keyHandle");
        byte[] bArrJ2 = this.f1501l.j();
        jVar.N(b3.c(bArrJ2, bArrJ2.length), "clientDataJSON");
        byte[] bArrJ3 = this.f1502m.j();
        jVar.N(b3.c(bArrJ3, bArrJ3.length), "attestationObject");
        jVar.N(Arrays.toString(this.n), "transports");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.H(parcel, 2, this.f1500k.j());
        H2.h.H(parcel, 3, this.f1501l.j());
        H2.h.H(parcel, 4, this.f1502m.j());
        String[] strArr = this.n;
        if (strArr != null) {
            int iQ2 = H2.h.Q(parcel, 5);
            parcel.writeStringArray(strArr);
            H2.h.R(parcel, iQ2);
        }
        H2.h.R(parcel, iQ);
    }
}
