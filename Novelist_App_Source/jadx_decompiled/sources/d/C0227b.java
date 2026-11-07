package d;

import a2.h;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227b implements Parcelable {
    public static final Parcelable.Creator<C0227b> CREATOR = new C0226a(0);

    /* renamed from: k, reason: collision with root package name */
    public final int f2764k;

    /* renamed from: l, reason: collision with root package name */
    public final Intent f2765l;

    public C0227b(Intent intent, int i3) {
        this.f2764k = i3;
        this.f2765l = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f2764k;
        sb.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2765l);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        h.e(parcel, "dest");
        parcel.writeInt(this.f2764k);
        Intent intent = this.f2765l;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }
}
