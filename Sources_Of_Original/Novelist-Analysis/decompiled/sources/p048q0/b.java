package p048q0;

import android.os.Parcel;
import android.util.SparseIntArray;
import org.apache.tika.utils.StringUtils;
import p042o.e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f4302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f4303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4309k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), StringUtils.EMPTY, new e(0), new e(0), new e(0));
    }

    @Override // p048q0.a
    public final b a() {
        Parcel parcel = this.f4303e;
        int iDataPosition = parcel.dataPosition();
        int i3 = this.f4308j;
        if (i3 == this.f4304f) {
            i3 = this.f4305g;
        }
        return new b(parcel, iDataPosition, i3, B1.e.m(new StringBuilder(), this.f4306h, "  "), this.f4299a, this.f4300b, this.f4301c);
    }

    @Override // p048q0.a
    public final boolean e(int i3) {
        while (this.f4308j < this.f4305g) {
            int i4 = this.f4309k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f4308j;
            Parcel parcel = this.f4303e;
            parcel.setDataPosition(i5);
            int i6 = parcel.readInt();
            this.f4309k = parcel.readInt();
            this.f4308j += i6;
        }
        return this.f4309k == i3;
    }

    @Override // p048q0.a
    public final void h(int i3) {
        int i4 = this.f4307i;
        SparseIntArray sparseIntArray = this.f4302d;
        Parcel parcel = this.f4303e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(iDataPosition - i5);
            parcel.setDataPosition(iDataPosition);
        }
        this.f4307i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i4, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f4302d = new SparseIntArray();
        this.f4307i = -1;
        this.f4309k = -1;
        this.f4303e = parcel;
        this.f4304f = i3;
        this.f4305g = i4;
        this.f4308j = i3;
        this.f4306h = str;
    }
}
