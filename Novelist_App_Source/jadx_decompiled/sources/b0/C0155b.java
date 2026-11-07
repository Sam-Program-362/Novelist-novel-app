package b0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155b implements Parcelable {
    public static final Parcelable.Creator<C0155b> CREATOR = new V0.l(25);

    /* renamed from: k, reason: collision with root package name */
    public final int[] f2454k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2455l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f2456m;
    public final int[] n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2457o;

    /* renamed from: p, reason: collision with root package name */
    public final String f2458p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2459q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2460r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f2461s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2462t;
    public final CharSequence u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f2463v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f2464w;
    public final boolean x;

    public C0155b(C0154a c0154a) {
        int size = c0154a.f2437a.size();
        this.f2454k = new int[size * 6];
        if (!c0154a.f2443g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2455l = new ArrayList(size);
        this.f2456m = new int[size];
        this.n = new int[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            P p3 = (P) c0154a.f2437a.get(i4);
            int i5 = i3 + 1;
            this.f2454k[i3] = p3.f2422a;
            ArrayList arrayList = this.f2455l;
            AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = p3.f2423b;
            arrayList.add(abstractComponentCallbacksC0171s != null ? abstractComponentCallbacksC0171s.f2542o : null);
            int[] iArr = this.f2454k;
            iArr[i5] = p3.f2424c ? 1 : 0;
            iArr[i3 + 2] = p3.f2425d;
            iArr[i3 + 3] = p3.f2426e;
            int i6 = i3 + 5;
            iArr[i3 + 4] = p3.f2427f;
            i3 += 6;
            iArr[i6] = p3.f2428g;
            this.f2456m[i4] = p3.f2429h.ordinal();
            this.n[i4] = p3.f2430i.ordinal();
        }
        this.f2457o = c0154a.f2442f;
        this.f2458p = c0154a.f2444h;
        this.f2459q = c0154a.f2453r;
        this.f2460r = c0154a.f2445i;
        this.f2461s = c0154a.f2446j;
        this.f2462t = c0154a.f2447k;
        this.u = c0154a.f2448l;
        this.f2463v = c0154a.f2449m;
        this.f2464w = c0154a.n;
        this.x = c0154a.f2450o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f2454k);
        parcel.writeStringList(this.f2455l);
        parcel.writeIntArray(this.f2456m);
        parcel.writeIntArray(this.n);
        parcel.writeInt(this.f2457o);
        parcel.writeString(this.f2458p);
        parcel.writeInt(this.f2459q);
        parcel.writeInt(this.f2460r);
        TextUtils.writeToParcel(this.f2461s, parcel, 0);
        parcel.writeInt(this.f2462t);
        TextUtils.writeToParcel(this.u, parcel, 0);
        parcel.writeStringList(this.f2463v);
        parcel.writeStringList(this.f2464w);
        parcel.writeInt(this.x ? 1 : 0);
    }

    public C0155b(Parcel parcel) {
        this.f2454k = parcel.createIntArray();
        this.f2455l = parcel.createStringArrayList();
        this.f2456m = parcel.createIntArray();
        this.n = parcel.createIntArray();
        this.f2457o = parcel.readInt();
        this.f2458p = parcel.readString();
        this.f2459q = parcel.readInt();
        this.f2460r = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2461s = (CharSequence) creator.createFromParcel(parcel);
        this.f2462t = parcel.readInt();
        this.u = (CharSequence) creator.createFromParcel(parcel);
        this.f2463v = parcel.createStringArrayList();
        this.f2464w = parcel.createStringArrayList();
        this.x = parcel.readInt() != 0;
    }
}
