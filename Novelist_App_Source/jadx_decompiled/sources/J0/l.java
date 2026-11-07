package J0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f568c;

    public l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f568c = bArr;
    }

    @Override // J0.k
    public final byte[] o() {
        return this.f568c;
    }
}
