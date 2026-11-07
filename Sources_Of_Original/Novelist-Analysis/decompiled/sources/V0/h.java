package V0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum h implements Parcelable {
    f1506l(9),
    f1507m(11),
    n(18),
    f1508o(19),
    f1509p(20),
    f1510q(23),
    f1511r(27),
    f1512s(28),
    f1513t(29),
    u(30),
    f1514v(35),
    f1515w(36);

    public static final Parcelable.Creator<h> CREATOR = new l(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1516k;

    h(int i3) {
        this.f1516k = i3;
    }

    public static h a(int i3) throws g {
        for (h hVar : values()) {
            if (i3 == hVar.f1516k) {
                return hVar;
            }
        }
        Locale locale = Locale.US;
        throw new g(B1.e.h("Error code ", i3, " is not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1516k);
    }
}
