package b1;

/* renamed from: b1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184I extends C0185J {
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2588o;

    public C0184I(byte[] bArr, int i3, int i4) {
        super(bArr);
        C0185J.g(i3, i3 + i4, bArr.length);
        this.n = i3;
        this.f2588o = i4;
    }

    @Override // b1.C0185J
    public final byte a(int i3) {
        int i4 = this.f2588o;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.f2591l[this.n + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(B1.e.g("Index < 0: ", i3));
        }
        throw new ArrayIndexOutOfBoundsException(B1.e.i("Index > length: ", i3, ", ", i4));
    }

    @Override // b1.C0185J
    public final byte b(int i3) {
        return this.f2591l[this.n + i3];
    }

    @Override // b1.C0185J
    public final int c() {
        return this.n;
    }

    @Override // b1.C0185J
    public final int d() {
        return this.f2588o;
    }

    @Override // b1.C0185J
    public final void e(byte[] bArr, int i3) {
        System.arraycopy(this.f2591l, this.n, bArr, 0, i3);
    }
}
