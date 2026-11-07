package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109f extends C0110g {

    /* renamed from: o, reason: collision with root package name */
    public final int f2041o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2042p;

    public C0109f(byte[] bArr, int i3, int i4) {
        super(bArr);
        C0110g.b(i3, i3 + i4, bArr.length);
        this.f2041o = i3;
        this.f2042p = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.C0110g
    public final byte a(int i3) {
        int i4 = this.f2042p;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.f2046l[this.f2041o + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(B1.e.g("Index < 0: ", i3));
        }
        throw new ArrayIndexOutOfBoundsException(B1.e.i("Index > length: ", i3, ", ", i4));
    }

    @Override // androidx.datastore.preferences.protobuf.C0110g
    public final void d(byte[] bArr, int i3) {
        System.arraycopy(this.f2046l, this.f2041o, bArr, 0, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C0110g
    public final int e() {
        return this.f2041o;
    }

    @Override // androidx.datastore.preferences.protobuf.C0110g
    public final byte f(int i3) {
        return this.f2046l[this.f2041o + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.C0110g
    public final int size() {
        return this.f2042p;
    }
}
