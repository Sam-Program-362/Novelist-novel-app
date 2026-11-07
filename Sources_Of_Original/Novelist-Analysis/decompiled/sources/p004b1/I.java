package p004b1;

import B1.e;

/* JADX INFO: loaded from: classes.dex */
public final class I extends J {
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2588o;

    public I(byte[] bArr, int i3, int i4) {
        super(bArr);
        J.g(i3, i3 + i4, bArr.length);
        this.n = i3;
        this.f2588o = i4;
    }

    @Override // p004b1.J
    public final byte a(int i3) {
        int i4 = this.f2588o;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.f2591l[this.n + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(e.g("Index < 0: ", i3));
        }
        throw new ArrayIndexOutOfBoundsException(e.i("Index > length: ", i3, ", ", i4));
    }

    @Override // p004b1.J
    public final byte b(int i3) {
        return this.f2591l[this.n + i3];
    }

    @Override // p004b1.J
    public final int c() {
        return this.n;
    }

    @Override // p004b1.J
    public final int d() {
        return this.f2588o;
    }

    @Override // p004b1.J
    public final void e(byte[] bArr, int i3) {
        System.arraycopy(this.f2591l, this.n, bArr, 0, i3);
    }
}
