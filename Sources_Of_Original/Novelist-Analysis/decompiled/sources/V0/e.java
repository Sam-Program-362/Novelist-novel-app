package V0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p004b1.C0169b;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public static final Parcelable.Creator<e> CREATOR = new l(5);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f1503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1505m;

    public e(int i3, String str, int i4) {
        try {
            this.f1503k = h.a(i3);
            this.f1504l = str;
            this.f1505m = i4;
        } catch (g e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return r.i(this.f1503k, eVar.f1503k) && r.i(this.f1504l, eVar.f1504l) && r.i(Integer.valueOf(this.f1505m), Integer.valueOf(eVar.f1505m));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1503k, this.f1504l, Integer.valueOf(this.f1505m)});
    }

    public final String toString() {
        A0.j jVar = new A0.j(getClass().getSimpleName());
        String strValueOf = String.valueOf(this.f1503k.f1516k);
        C0169b c0169b = new C0169b(11);
        ((A0.j) jVar.n).n = c0169b;
        jVar.n = c0169b;
        c0169b.f58m = strValueOf;
        c0169b.f57l = "errorCode";
        String str = this.f1504l;
        if (str != null) {
            jVar.N(str, "errorMessage");
        }
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        int i4 = this.f1503k.f1516k;
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(i4);
        H2.h.K(parcel, 3, this.f1504l);
        H2.h.P(parcel, 4, 4);
        parcel.writeInt(this.f1505m);
        H2.h.R(parcel, iQ);
    }
}
