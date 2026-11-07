package F0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends N0.a {
    public static final Parcelable.Creator<g> CREATOR = new l(2);

    /* renamed from: k, reason: collision with root package name */
    public final f f318k;

    /* renamed from: l, reason: collision with root package name */
    public final c f319l;

    /* renamed from: m, reason: collision with root package name */
    public final String f320m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final int f321o;

    /* renamed from: p, reason: collision with root package name */
    public final e f322p;

    /* renamed from: q, reason: collision with root package name */
    public final d f323q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f324r;

    public g(f fVar, c cVar, String str, boolean z3, int i3, e eVar, d dVar, boolean z4) {
        r.f(fVar);
        this.f318k = fVar;
        r.f(cVar);
        this.f319l = cVar;
        this.f320m = str;
        this.n = z3;
        this.f321o = i3;
        this.f322p = eVar == null ? new e(false, null, null) : eVar;
        this.f323q = dVar == null ? new d(null, false) : dVar;
        this.f324r = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return r.i(this.f318k, gVar.f318k) && r.i(this.f319l, gVar.f319l) && r.i(this.f322p, gVar.f322p) && r.i(this.f323q, gVar.f323q) && r.i(this.f320m, gVar.f320m) && this.n == gVar.n && this.f321o == gVar.f321o && this.f324r == gVar.f324r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f318k, this.f319l, this.f322p, this.f323q, this.f320m, Boolean.valueOf(this.n), Integer.valueOf(this.f321o), Boolean.valueOf(this.f324r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.J(parcel, 1, this.f318k, i3);
        H2.h.J(parcel, 2, this.f319l, i3);
        H2.h.K(parcel, 3, this.f320m);
        H2.h.P(parcel, 4, 4);
        parcel.writeInt(this.n ? 1 : 0);
        H2.h.P(parcel, 5, 4);
        parcel.writeInt(this.f321o);
        H2.h.J(parcel, 6, this.f322p, i3);
        H2.h.J(parcel, 7, this.f323q, i3);
        H2.h.P(parcel, 8, 4);
        parcel.writeInt(this.f324r ? 1 : 0);
        H2.h.R(parcel, Q2);
    }
}
