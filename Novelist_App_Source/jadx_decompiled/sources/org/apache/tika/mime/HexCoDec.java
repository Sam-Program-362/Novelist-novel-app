package org.apache.tika.mime;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public class HexCoDec {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    private static int hexCharToNibble(char c3) {
        if (c3 >= '0' && c3 <= '9') {
            return c3 - '0';
        }
        if (c3 >= 'a' && c3 <= 'f') {
            return c3 - 'W';
        }
        if (c3 >= 'A' && c3 <= 'F') {
            return c3 - '7';
        }
        throw new IllegalArgumentException("Not a hex char - '" + c3 + "'");
    }

    public static byte[] decode(char[] cArr) {
        return decode(cArr, 0, cArr.length);
    }

    public static char[] encode(byte[] bArr, int i3, int i4) {
        char[] cArr = new char[i4 * 2];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int i7 = i3 + 1;
            byte b3 = bArr[i3];
            int i8 = b3 & ForkServer.ERROR;
            int i9 = i6 + 1;
            char[] cArr2 = HEX_CHARS;
            cArr[i6] = cArr2[i8 >> 4];
            i6 += 2;
            cArr[i9] = cArr2[b3 & 15];
            i5++;
            i3 = i7;
        }
        return cArr;
    }

    public static byte[] decode(char[] cArr, int i3, int i4) {
        if ((i4 & 1) == 0) {
            int i5 = i4 / 2;
            byte[] bArr = new byte[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = i3 + 1;
                int hexCharToNibble = hexCharToNibble(cArr[i3]) * 16;
                i3 += 2;
                bArr[i6] = (byte) (hexCharToNibble + hexCharToNibble(cArr[i7]));
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length must be even");
    }
}
