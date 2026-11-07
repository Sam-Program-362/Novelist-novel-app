package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends E2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2072e;

    public /* synthetic */ j0(int i3) {
        this.f2072e = i3;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    @Override // E2.a
    public final String o(byte[] bArr, int i3, int i4) throws C0126z {
        int i5;
        byte b3;
        int i6;
        byte b4;
        byte b5;
        byte b6;
        switch (this.f2072e) {
            case 0:
                if ((i3 | i4 | ((bArr.length - i3) - i4)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i4)));
                }
                int i7 = i3 + i4;
                char[] cArr = new char[i4];
                int i8 = 0;
                while (i3 < i7) {
                    byte b7 = bArr[i3];
                    if (b7 < 0) {
                        while (i3 < i7) {
                            i5 = i3 + 1;
                            b3 = bArr[i3];
                            if (b3 < 0) {
                                i6 = i8 + 1;
                                cArr[i8] = (char) b3;
                                while (i5 < i7) {
                                    b4 = bArr[i5];
                                    if (b4 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b4;
                                        i6++;
                                    } else {
                                        i8 = i6;
                                        i3 = i5;
                                    }
                                }
                                i8 = i6;
                                i3 = i5;
                            } else if (b3 < -32) {
                                if (i5 < i7) {
                                    throw C0126z.a();
                                }
                                i3 += 2;
                                byte b8 = bArr[i5];
                                int i9 = i8 + 1;
                                if (b3 >= -62 || p000a.a.I(b8)) {
                                    throw C0126z.a();
                                }
                                cArr[i8] = (char) ((b8 & 63) | ((b3 & 31) << 6));
                                i8 = i9;
                            } else {
                                if (b3 >= -16) {
                                    if (i5 < i7 - 2) {
                                        throw C0126z.a();
                                    }
                                    b6 = bArr[i5];
                                    int i10 = i3 + 3;
                                    byte b9 = bArr[i3 + 2];
                                    i3 += 4;
                                    byte b10 = bArr[i10];
                                    int i11 = i8 + 1;
                                    if (!p000a.a.I(b6)) {
                                        if ((((b6 + 112) + (b3 << 28)) >> 30) != 0 && !p000a.a.I(b9) && !p000a.a.I(b10)) {
                                            int i12 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b9 & 63) << 6) | (b10 & 63);
                                            cArr[i8] = (char) ((i12 >>> 10) + 55232);
                                            cArr[i11] = (char) ((i12 & 1023) + 56320);
                                            i8 += 2;
                                        }
                                    }
                                    throw C0126z.a();
                                }
                                if (i5 < i7 - 1) {
                                    throw C0126z.a();
                                }
                                int i13 = i3 + 2;
                                b5 = bArr[i5];
                                i3 += 3;
                                byte b11 = bArr[i13];
                                int i14 = i8 + 1;
                                if (!p000a.a.I(b5) || ((b3 == -32 && b5 < -96) || ((b3 == -19 && b5 >= -96) || p000a.a.I(b11)))) {
                                    throw C0126z.a();
                                }
                                cArr[i8] = (char) (((b5 & 63) << 6) | ((b3 & 15) << 12) | (b11 & 63));
                                i8 = i14;
                            }
                        }
                        return new String(cArr, 0, i8);
                    }
                    i3++;
                    cArr[i8] = (char) b7;
                    i8++;
                }
                while (i3 < i7) {
                    i5 = i3 + 1;
                    b3 = bArr[i3];
                    if (b3 < 0) {
                        if (b3 < -32) {
                            if (i5 < i7) {
                                throw C0126z.a();
                            }
                            i3 += 2;
                            byte b12 = bArr[i5];
                            int i15 = i8 + 1;
                            if (b3 >= -62) {
                            }
                            throw C0126z.a();
                        }
                        if (b3 >= -16) {
                            if (i5 < i7 - 1) {
                                throw C0126z.a();
                            }
                            int i16 = i3 + 2;
                            b5 = bArr[i5];
                            i3 += 3;
                            byte b13 = bArr[i16];
                            int i17 = i8 + 1;
                            if (p000a.a.I(b5)) {
                            }
                            throw C0126z.a();
                        }
                        if (i5 < i7 - 2) {
                            throw C0126z.a();
                        }
                        b6 = bArr[i5];
                        int i18 = i3 + 3;
                        byte b14 = bArr[i3 + 2];
                        i3 += 4;
                        byte b15 = bArr[i18];
                        int i19 = i8 + 1;
                        if (!p000a.a.I(b6)) {
                            if ((((b6 + 112) + (b3 << 28)) >> 30) != 0) {
                            }
                        }
                        throw C0126z.a();
                    }
                    i6 = i8 + 1;
                    cArr[i8] = (char) b3;
                    while (i5 < i7) {
                        b4 = bArr[i5];
                        if (b4 >= 0) {
                            i5++;
                            cArr[i6] = (char) b4;
                            i6++;
                        } else {
                            i8 = i6;
                            i3 = i5;
                        }
                    }
                    i8 = i6;
                    i3 = i5;
                }
                return new String(cArr, 0, i8);
            default:
                Charset charset = AbstractC0124x.f2114a;
                String str = new String(bArr, i3, i4, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i3, i4 + i3))) {
                    throw C0126z.a();
                }
                return str;
        }
    }

    @Override // E2.a
    public final int q(String str, byte[] bArr, int i3, int i4) {
        int i5;
        int i6;
        char cCharAt;
        long j3;
        char c3;
        long j4;
        long j5;
        char c4;
        int i7;
        char cCharAt2;
        switch (this.f2072e) {
            case 0:
                int length = str.length();
                int i8 = i4 + i3;
                int i9 = 0;
                while (i9 < length && (i6 = i9 + i3) < i8 && (cCharAt = str.charAt(i9)) < 128) {
                    bArr[i6] = (byte) cCharAt;
                    i9++;
                }
                if (i9 == length) {
                    return i3 + length;
                }
                int i10 = i3 + i9;
                while (i9 < length) {
                    char cCharAt3 = str.charAt(i9);
                    if (cCharAt3 < 128 && i10 < i8) {
                        bArr[i10] = (byte) cCharAt3;
                        i10++;
                    } else if (cCharAt3 < 2048 && i10 <= i8 - 2) {
                        int i11 = i10 + 1;
                        bArr[i10] = (byte) ((cCharAt3 >>> 6) | 960);
                        i10 += 2;
                        bArr[i11] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i10 > i8 - 3) {
                            if (i10 > i8 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i5 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i5)))) {
                                    throw new k0(i9, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i10);
                            }
                            int i12 = i9 + 1;
                            if (i12 != str.length()) {
                                char cCharAt4 = str.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i10 + 3;
                                    bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i10 += 4;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i9 = i12;
                                } else {
                                    i9 = i12;
                                }
                            }
                            throw new k0(i9 - 1, length);
                        }
                        bArr[i10] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i14 = i10 + 2;
                        bArr[i10 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i10 += 3;
                        bArr[i14] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i9++;
                }
                return i10;
            default:
                long j6 = i3;
                long j7 = ((long) i4) + j6;
                int length2 = str.length();
                if (length2 > i4 || bArr.length - i4 < i3) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i3 + i4));
                }
                int i15 = 0;
                while (true) {
                    j3 = 1;
                    c3 = 128;
                    if (i15 < length2 && (cCharAt2 = str.charAt(i15)) < 128) {
                        i0.j(bArr, j6, (byte) cCharAt2);
                        i15++;
                        j6 = 1 + j6;
                    }
                }
                if (i15 == length2) {
                    return (int) j6;
                }
                while (i15 < length2) {
                    char cCharAt5 = str.charAt(i15);
                    if (cCharAt5 < c3 && j6 < j7) {
                        i0.j(bArr, j6, (byte) cCharAt5);
                        c4 = c3;
                        j4 = j3;
                        j5 = j6 + j3;
                    } else if (cCharAt5 >= 2048 || j6 > j7 - 2) {
                        j4 = j3;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j6 > j7 - 3) {
                            long j8 = j6;
                            if (j8 > j7 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i7 = i15 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i7)))) {
                                    throw new k0(i15, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j8);
                            }
                            int i16 = i15 + 1;
                            if (i16 != length2) {
                                char cCharAt6 = str.charAt(i16);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    i0.j(bArr, j8, (byte) ((codePoint2 >>> 18) | 240));
                                    c4 = 128;
                                    i0.j(bArr, j8 + j4, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    i0.j(bArr, j8 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    i0.j(bArr, j8 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j5 = j8 + 4;
                                    i15 = i16;
                                } else {
                                    i15 = i16;
                                }
                            }
                            throw new k0(i15 - 1, length2);
                        }
                        i0.j(bArr, j6, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j9 = j6;
                        i0.j(bArr, j6 + j4, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j5 = j9 + 3;
                        i0.j(bArr, j9 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c4 = 128;
                    } else {
                        j4 = j3;
                        i0.j(bArr, j6, (byte) ((cCharAt5 >>> 6) | 960));
                        i0.j(bArr, j6 + j4, (byte) ((cCharAt5 & '?') | c3));
                        j5 = j6 + 2;
                        c4 = c3;
                    }
                    i15++;
                    c3 = c4;
                    j6 = j5;
                    j3 = j4;
                }
                return (int) j6;
        }
    }
}
