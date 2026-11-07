package org.apache.tika.detect;

import java.io.CharArrayWriter;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: classes.dex */
public class MagicDetector implements Detector {
    private final boolean isRegex;
    private final boolean isStringIgnoreCase;
    private final int length;
    private final byte[] mask;
    private final int offsetRangeBegin;
    private final int offsetRangeEnd;
    private final byte[] pattern;
    private final int patternLength;
    private final MediaType type;

    public MagicDetector(MediaType mediaType, byte[] bArr) {
        this(mediaType, bArr, 0);
    }

    private static byte[] decodeString(String str, String str2) {
        int i3 = 0;
        if (str.startsWith("0x")) {
            int length = (str.length() - 2) / 2;
            byte[] bArr = new byte[length];
            while (i3 < length) {
                int i4 = i3 * 2;
                bArr[i3] = (byte) Integer.parseInt(str.substring(i4 + 2, i4 + 4), 16);
                i3++;
            }
            return bArr;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int i5 = 0;
        while (i5 < str.length()) {
            if (str.charAt(i5) == '\\') {
                int i6 = i5 + 1;
                if (str.charAt(i6) == '\\') {
                    charArrayWriter.write(92);
                } else if (str.charAt(i6) == 'x') {
                    charArrayWriter.write(Integer.parseInt(str.substring(i5 + 2, i5 + 4), 16));
                    i5 += 3;
                } else if (str.charAt(i6) == 'r') {
                    charArrayWriter.write(13);
                } else if (str.charAt(i6) == 'n') {
                    charArrayWriter.write(10);
                } else {
                    int i7 = i6;
                    while (i7 < i5 + 4 && i7 < str.length() && Character.isDigit(str.charAt(i7))) {
                        i7++;
                    }
                    charArrayWriter.write(Short.decode("0" + str.substring(i6, i7)).byteValue());
                    i5 = i7 + (-1);
                }
                i5 = i6;
            } else {
                charArrayWriter.write(str.charAt(i5));
            }
            i5++;
        }
        char[] charArray = charArrayWriter.toCharArray();
        if ("unicodeLE".equals(str2)) {
            byte[] bArr2 = new byte[charArray.length * 2];
            while (i3 < charArray.length) {
                int i8 = i3 * 2;
                char c3 = charArray[i3];
                bArr2[i8] = (byte) (c3 & 255);
                bArr2[i8 + 1] = (byte) (c3 >> '\b');
                i3++;
            }
            return bArr2;
        }
        if (!"unicodeBE".equals(str2)) {
            int length2 = charArray.length;
            byte[] bArr3 = new byte[length2];
            while (i3 < length2) {
                bArr3[i3] = (byte) charArray[i3];
                i3++;
            }
            return bArr3;
        }
        byte[] bArr4 = new byte[charArray.length * 2];
        while (i3 < charArray.length) {
            int i9 = i3 * 2;
            char c4 = charArray[i3];
            bArr4[i9] = (byte) (c4 >> '\b');
            bArr4[i9 + 1] = (byte) (c4 & 255);
            i3++;
        }
        return bArr4;
    }

    private static byte[] decodeValue(String str, String str2) {
        String str3;
        int i3;
        if (str == null || str2 == null) {
            return null;
        }
        if (str.startsWith("0x")) {
            str3 = str.substring(2);
            i3 = 16;
        } else {
            str3 = str;
            i3 = 8;
        }
        switch (str2) {
            case "host16":
            case "little16":
                int parseInt = Integer.parseInt(str3, i3);
                return new byte[]{(byte) (parseInt & 255), (byte) (parseInt >> 8)};
            case "host32":
            case "little32":
                long parseLong = Long.parseLong(str3, i3);
                return new byte[]{(byte) (parseLong & 255), (byte) ((parseLong & 65280) >> 8), (byte) ((parseLong & 16711680) >> 16), (byte) ((parseLong & (-16777216)) >> 24)};
            case "unicodeBE":
            case "unicodeLE":
            case "string":
            case "regex":
                return decodeString(str, str2);
            case "stringignorecase":
                return decodeString(str.toLowerCase(Locale.ROOT), str2);
            case "byte":
                return str3.getBytes(StandardCharsets.UTF_8);
            case "big16":
                int parseInt2 = Integer.parseInt(str3, i3);
                return new byte[]{(byte) (parseInt2 >> 8), (byte) (parseInt2 & 255)};
            case "big32":
                long parseLong2 = Long.parseLong(str3, i3);
                return new byte[]{(byte) ((parseLong2 & (-16777216)) >> 24), (byte) ((parseLong2 & 16711680) >> 16), (byte) ((parseLong2 & 65280) >> 8), (byte) (parseLong2 & 255)};
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.apache.tika.detect.MagicDetector parse(org.apache.tika.mime.MediaType r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r0 = 0
            if (r11 == 0) goto L10
            r1 = 58
            int r1 = r11.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto L13
            int r0 = java.lang.Integer.parseInt(r11)
        L10:
            r7 = r0
            r8 = r7
            goto L27
        L13:
            java.lang.String r0 = r11.substring(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            int r1 = r1 + 1
            java.lang.String r11 = r11.substring(r1)
            int r11 = java.lang.Integer.parseInt(r11)
            r8 = r11
            r7 = r0
        L27:
            byte[] r3 = decodeValue(r12, r10)
            if (r13 == 0) goto L33
            byte[] r11 = decodeValue(r13, r10)
        L31:
            r4 = r11
            goto L35
        L33:
            r11 = 0
            goto L31
        L35:
            org.apache.tika.detect.MagicDetector r1 = new org.apache.tika.detect.MagicDetector
            java.lang.String r11 = "regex"
            boolean r5 = r10.equals(r11)
            java.lang.String r11 = "stringignorecase"
            boolean r6 = r10.equals(r11)
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.detect.MagicDetector.parse(org.apache.tika.mime.MediaType, java.lang.String, java.lang.String, java.lang.String, java.lang.String):org.apache.tika.detect.MagicDetector");
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        if (inputStream == null) {
            return MediaType.OCTET_STREAM;
        }
        inputStream.mark(this.offsetRangeEnd + this.length);
        int i3 = 0;
        while (true) {
            try {
                int i4 = this.offsetRangeBegin;
                if (i3 >= i4) {
                    int i5 = (this.offsetRangeEnd - i4) + this.length;
                    byte[] bArr = new byte[i5];
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        i3 += read;
                    }
                    while (read != -1 && i3 < this.offsetRangeEnd + this.length) {
                        int i6 = i3 - this.offsetRangeBegin;
                        read = inputStream.read(bArr, i6, i5 - i6);
                        if (read > 0) {
                            i3 += read;
                        }
                    }
                    if (this.isRegex) {
                        Matcher matcher = Pattern.compile(new String(this.pattern, StandardCharsets.UTF_8), this.isStringIgnoreCase ? 2 : 0).matcher(StandardCharsets.ISO_8859_1.decode(ByteBuffer.wrap(bArr)));
                        for (int i7 = 0; i7 <= this.offsetRangeEnd - this.offsetRangeBegin; i7++) {
                            matcher.region(i7, this.length + i7);
                            if (matcher.lookingAt()) {
                                return this.type;
                            }
                        }
                    } else {
                        if (i3 < this.offsetRangeBegin + this.length) {
                            return MediaType.OCTET_STREAM;
                        }
                        for (int i8 = 0; i8 <= this.offsetRangeEnd - this.offsetRangeBegin; i8++) {
                            boolean z3 = true;
                            for (int i9 = 0; z3 && i9 < this.length; i9++) {
                                int i10 = bArr[i8 + i9] & this.mask[i9];
                                if (this.isStringIgnoreCase) {
                                    i10 = Character.toLowerCase(i10);
                                }
                                z3 = i10 == this.pattern[i9];
                            }
                            if (z3) {
                                return this.type;
                            }
                        }
                    }
                    return MediaType.OCTET_STREAM;
                }
                long skip = inputStream.skip(i4 - i3);
                if (skip > 0) {
                    i3 = (int) (i3 + skip);
                } else {
                    if (inputStream.read() == -1) {
                        return MediaType.OCTET_STREAM;
                    }
                    i3++;
                }
            } finally {
                inputStream.reset();
            }
        }
    }

    public int getLength() {
        return this.patternLength;
    }

    public String toString() {
        String valueOf = String.valueOf(this.type);
        byte[] bArr = this.pattern;
        return "Magic Detection for " + valueOf + " looking for " + bArr.length + " bytes = " + Arrays.toString(bArr) + " mask = " + Arrays.toString(this.mask);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, int i3) {
        this(mediaType, bArr, null, i3, i3);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, int i3, int i4) {
        this(mediaType, bArr, bArr2, false, i3, i4);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, boolean z3, int i3, int i4) {
        this(mediaType, bArr, bArr2, z3, false, i3, i4);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, boolean z3, boolean z4, int i3, int i4) {
        if (mediaType == null) {
            throw new IllegalArgumentException("Matching media type is null");
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Magic match pattern is null");
        }
        if (i3 >= 0 && i4 >= i3) {
            this.type = mediaType;
            this.isRegex = z3;
            this.isStringIgnoreCase = z4;
            int max = Math.max(bArr.length, bArr2 != null ? bArr2.length : 0);
            this.patternLength = max;
            if (z3) {
                this.length = 8192;
            } else {
                this.length = max;
            }
            this.mask = new byte[max];
            this.pattern = new byte[max];
            for (int i5 = 0; i5 < this.patternLength; i5++) {
                if (bArr2 != null && i5 < bArr2.length) {
                    this.mask[i5] = bArr2[i5];
                } else {
                    this.mask[i5] = -1;
                }
                if (i5 < bArr.length) {
                    this.pattern[i5] = (byte) (bArr[i5] & this.mask[i5]);
                } else {
                    this.pattern[i5] = 0;
                }
            }
            this.offsetRangeBegin = i3;
            this.offsetRangeEnd = i4;
            return;
        }
        throw new IllegalArgumentException("Invalid offset range: [" + i3 + "," + i4 + "]");
    }
}
