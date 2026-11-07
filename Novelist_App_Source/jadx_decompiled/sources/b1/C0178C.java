package b1;

import org.apache.tika.fork.ForkServer;

/* renamed from: b1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178C extends C0179D {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0178C(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            b1.A r0 = new b1.A
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r2 = 61
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r1.<init>(r0, r2)
            int r2 = r3.length
            r3 = 64
            if (r2 != r3) goto L18
            return
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0178C.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // b1.C0179D
    public final void a(StringBuilder sb, byte[] bArr, int i3) {
        int i4 = 0;
        AbstractC0197a.m(0, i3, bArr.length);
        for (int i5 = i3; i5 >= 3; i5 -= 3) {
            int i6 = ((bArr[i4 + 1] & ForkServer.ERROR) << 8) | ((bArr[i4] & ForkServer.ERROR) << 16) | (bArr[i4 + 2] & ForkServer.ERROR);
            C0176A c0176a = this.f2580a;
            char[] cArr = c0176a.f2571b;
            char[] cArr2 = c0176a.f2571b;
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
