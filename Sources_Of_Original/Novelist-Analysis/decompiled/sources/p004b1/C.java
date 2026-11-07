package p004b1;

import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class C extends D {
    /* JADX WARN: Illegal instructions before constructor call */
    public C(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new A(str, charArray), (Character) '=');
        if (charArray.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // p004b1.D
    public final void a(StringBuilder sb, byte[] bArr, int i3) {
        int i4 = 0;
        AbstractC0168a.m(0, i3, bArr.length);
        for (int i5 = i3; i5 >= 3; i5 -= 3) {
            int i6 = ((bArr[i4 + 1] & ForkServer.ERROR) << 8) | ((bArr[i4] & ForkServer.ERROR) << 16) | (bArr[i4 + 2] & ForkServer.ERROR);
            A a3 = this.f2580a;
            char[] cArr = a3.f2571b;
            char[] cArr2 = a3.f2571b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
            i4 += 3;
        }
        if (i4 < i3) {
            b(sb, bArr, i4, i3 - i4);
        }
    }
}
