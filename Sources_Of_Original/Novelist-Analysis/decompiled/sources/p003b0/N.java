package p003b0;

import V0.l;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new l(29);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2408m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f2410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f2411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f2413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f2414t;
    public final int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2415v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2416w;
    public final boolean x;

    public N(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        this.f2406k = abstractComponentCallbacksC0163s.getClass().getName();
        this.f2407l = abstractComponentCallbacksC0163s.f2542o;
        this.f2408m = abstractComponentCallbacksC0163s.x;
        this.n = abstractComponentCallbacksC0163s.f2520G;
        this.f2409o = abstractComponentCallbacksC0163s.f2521H;
        this.f2410p = abstractComponentCallbacksC0163s.f2522I;
        this.f2411q = abstractComponentCallbacksC0163s.f2525L;
        this.f2412r = abstractComponentCallbacksC0163s.f2548v;
        this.f2413s = abstractComponentCallbacksC0163s.f2524K;
        this.f2414t = abstractComponentCallbacksC0163s.f2523J;
        this.u = abstractComponentCallbacksC0163s.f2534V.ordinal();
        this.f2415v = abstractComponentCallbacksC0163s.f2545r;
        this.f2416w = abstractComponentCallbacksC0163s.f2546s;
        this.x = abstractComponentCallbacksC0163s.f2530Q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2406k);
        sb.append(" (");
        sb.append(this.f2407l);
        sb.append(")}:");
        if (this.f2408m) {
            sb.append(" fromLayout");
        }
        int i3 = this.f2409o;
        if (i3 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i3));
        }
        String str = this.f2410p;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f2411q) {
            sb.append(" retainInstance");
        }
        if (this.f2412r) {
            sb.append(" removing");
        }
        if (this.f2413s) {
            sb.append(" detached");
        }
        if (this.f2414t) {
            sb.append(" hidden");
        }
        String str2 = this.f2415v;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f2416w);
        }
        if (this.x) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f2406k);
        parcel.writeString(this.f2407l);
        parcel.writeInt(this.f2408m ? 1 : 0);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f2409o);
        parcel.writeString(this.f2410p);
        parcel.writeInt(this.f2411q ? 1 : 0);
        parcel.writeInt(this.f2412r ? 1 : 0);
        parcel.writeInt(this.f2413s ? 1 : 0);
        parcel.writeInt(this.f2414t ? 1 : 0);
        parcel.writeInt(this.u);
        parcel.writeString(this.f2415v);
        parcel.writeInt(this.f2416w);
        parcel.writeInt(this.x ? 1 : 0);
    }

    public N(Parcel parcel) {
        this.f2406k = parcel.readString();
        this.f2407l = parcel.readString();
        this.f2408m = parcel.readInt() != 0;
        this.n = parcel.readInt();
        this.f2409o = parcel.readInt();
        this.f2410p = parcel.readString();
        this.f2411q = parcel.readInt() != 0;
        this.f2412r = parcel.readInt() != 0;
        this.f2413s = parcel.readInt() != 0;
        this.f2414t = parcel.readInt() != 0;
        this.u = parcel.readInt();
        this.f2415v = parcel.readString();
        this.f2416w = parcel.readInt();
        this.x = parcel.readInt() != 0;
    }
}
