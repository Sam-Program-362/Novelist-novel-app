package V0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import b1.AbstractC0197a;
import b1.C0185J;
import b1.a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends N0.a {
    public static final Parcelable.Creator<i> CREATOR = new F0.l(26);

    /* renamed from: k, reason: collision with root package name */
    public final String f1517k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1518l;

    /* renamed from: m, reason: collision with root package name */
    public final C0185J f1519m;
    public final d n;

    /* renamed from: o, reason: collision with root package name */
    public final c f1520o;

    /* renamed from: p, reason: collision with root package name */
    public final e f1521p;

    /* renamed from: q, reason: collision with root package name */
    public final a f1522q;

    /* renamed from: r, reason: collision with root package name */
    public final String f1523r;

    public i(String str, String str2, byte[] bArr, d dVar, c cVar, e eVar, a aVar, String str3) {
        C0185J i3 = bArr == null ? null : C0185J.i(bArr, bArr.length);
        boolean z3 = false;
        r.a("Must provide a response object.", (dVar != null && cVar == null && eVar == null) || (dVar == null && cVar != null && eVar == null) || (dVar == null && cVar == null && eVar != null));
        if (eVar != null || (str != null && i3 != null)) {
            z3 = true;
        }
        r.a("Must provide id and rawId if not an error response.", z3);
        this.f1517k = str;
        this.f1518l = str2;
        this.f1519m = i3;
        this.n = dVar;
        this.f1520o = cVar;
        this.f1521p = eVar;
        this.f1522q = aVar;
        this.f1523r = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return r.i(this.f1517k, iVar.f1517k) && r.i(this.f1518l, iVar.f1518l) && r.i(this.f1519m, iVar.f1519m) && r.i(this.n, iVar.n) && r.i(this.f1520o, iVar.f1520o) && r.i(this.f1521p, iVar.f1521p) && r.i(this.f1522q, iVar.f1522q) && r.i(this.f1523r, iVar.f1523r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1517k, this.f1518l, this.f1519m, this.f1520o, this.n, this.f1521p, this.f1522q, this.f1523r});
    }

    public final String toString() {
        C0185J c0185j = this.f1519m;
        return "PublicKeyCredential{\n id='" + this.f1517k + "', \n type='" + this.f1518l + "', \n rawId=" + E2.a.p(c0185j == null ? null : c0185j.j()) + ", \n registerResponse=" + String.valueOf(this.n) + ", \n signResponse=" + String.valueOf(this.f1520o) + ", \n errorResponse=" + String.valueOf(this.f1521p) + ", \n extensionsClientOutputs=" + String.valueOf(this.f1522q) + ", \n authenticatorAttachment='" + this.f1523r + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        a0.f2613a.getClass();
        if (AbstractC0197a.f2612b == null) {
            AbstractC0197a.f2612b = new K.c();
        }
        synchronized (AbstractC0197a.f2611a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
