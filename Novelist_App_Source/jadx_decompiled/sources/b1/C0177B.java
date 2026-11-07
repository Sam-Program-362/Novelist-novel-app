package b1;

import org.apache.tika.fork.ForkServer;

/* renamed from: b1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177B extends C0179D {

    /* renamed from: e, reason: collision with root package name */
    public final char[] f2578e;

    public C0177B(C0176A c0176a) {
        super(c0176a, (Character) null);
        this.f2578e = new char[512];
        char[] cArr = c0176a.f2571b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i3 = 0; i3 < 256; i3++) {
            char[] cArr2 = this.f2578e;
            cArr2[i3] = cArr[i3 >>> 4];
            cArr2[i3 | 256] = cArr[i3 & 15];
        }
    }

    @Override // b1.C0179D
    public final void a(StringBuilder sb, byte[] bArr, int i3) {
        AbstractC0197a.m(0, i3, bArr.length);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = bArr[i4] & ForkServer.ERROR;
            char[] cArr = this.f2578e;
            sb.append(cArr[i5]);
            sb.append(cArr[i5 | 256]);
        }
    }
}
