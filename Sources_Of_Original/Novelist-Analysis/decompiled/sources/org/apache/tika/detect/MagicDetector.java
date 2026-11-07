package org.apache.tika.detect;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* JADX INFO: loaded from: classes.dex */
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
        String strSubstring;
        int i3;
        if (str == null || str2 == null) {
            return null;
        }
        if (str.startsWith("0x")) {
            strSubstring = str.substring(2);
            i3 = 16;
        } else {
            strSubstring = str;
            i3 = 8;
        }
        switch (str2) {
            case "host16":
            case "little16":
                int i4 = Integer.parseInt(strSubstring, i3);
                return new byte[]{(byte) (i4 & 255), (byte) (i4 >> 8)};
            case "host32":
            case "little32":
                long j3 = Long.parseLong(strSubstring, i3);
                return new byte[]{(byte) (j3 & 255), (byte) ((j3 & 65280) >> 8), (byte) ((j3 & 16711680) >> 16), (byte) ((j3 & (-16777216)) >> 24)};
            case "unicodeBE":
            case "unicodeLE":
            case "string":
            case "regex":
                return decodeString(str, str2);
            case "stringignorecase":
                return decodeString(str.toLowerCase(Locale.ROOT), str2);
            case "byte":
                return strSubstring.getBytes(StandardCharsets.UTF_8);
            case "big16":
                int i5 = Integer.parseInt(strSubstring, i3);
                return new byte[]{(byte) (i5 >> 8), (byte) (i5 & 255)};
            case "big32":
                long j4 = Long.parseLong(strSubstring, i3);
                return new byte[]{(byte) ((j4 & (-16777216)) >> 24), (byte) ((j4 & 16711680) >> 16), (byte) ((j4 & 65280) >> 8), (byte) (j4 & 255)};
            default:
                return null;
        }
    }

    public static MagicDetector parse(MediaType mediaType, String str, String str2, String str3, String str4) {
        int i3;
        int i4;
        int i5 = 0;
        if (str2 == null) {
            i3 = i5;
            i4 = i3;
        } else {
            int iIndexOf = str2.indexOf(58);
            if (iIndexOf == -1) {
                i5 = Integer.parseInt(str2);
                i3 = i5;
                i4 = i3;
            } else {
                int i6 = Integer.parseInt(str2.substring(0, iIndexOf));
                i4 = Integer.parseInt(str2.substring(iIndexOf + 1));
                i3 = i6;
            }
        }
        return new MagicDetector(mediaType, decodeValue(str3, str), str4 != null ? decodeValue(str4, str) : null, str.equals("regex"), str.equals("stringignorecase"), i3, i4);
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
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
                    int i6 = inputStream.read(bArr);
                    if (i6 > 0) {
                        i3 += i6;
                    }
                    while (i6 != -1 && i3 < this.offsetRangeEnd + this.length) {
                        int i7 = i3 - this.offsetRangeBegin;
                        i6 = inputStream.read(bArr, i7, i5 - i7);
                        if (i6 > 0) {
                            i3 += i6;
                        }
                    }
                    if (this.isRegex) {
                        Matcher matcher = Pattern.compile(new String(this.pattern, StandardCharsets.UTF_8), this.isStringIgnoreCase ? 2 : 0).matcher(StandardCharsets.ISO_8859_1.decode(ByteBuffer.wrap(bArr)));
                        for (int i8 = 0; i8 <= this.offsetRangeEnd - this.offsetRangeBegin; i8++) {
                            matcher.region(i8, this.length + i8);
                            if (matcher.lookingAt()) {
                                MediaType mediaType = this.type;
                                inputStream.reset();
                                return mediaType;
                            }
                        }
                    } else {
                        if (i3 < this.offsetRangeBegin + this.length) {
                            MediaType mediaType2 = MediaType.OCTET_STREAM;
                            inputStream.reset();
                            return mediaType2;
                        }
                        for (int i9 = 0; i9 <= this.offsetRangeEnd - this.offsetRangeBegin; i9++) {
                            boolean z3 = true;
                            for (int i10 = 0; z3 && i10 < this.length; i10++) {
                                int lowerCase = bArr[i9 + i10] & this.mask[i10];
                                if (this.isStringIgnoreCase) {
                                    lowerCase = Character.toLowerCase(lowerCase);
                                }
                                z3 = lowerCase == this.pattern[i10];
                            }
                            if (z3) {
                                MediaType mediaType3 = this.type;
                                inputStream.reset();
                                return mediaType3;
                            }
                        }
                    }
                    MediaType mediaType4 = MediaType.OCTET_STREAM;
                    inputStream.reset();
                    return mediaType4;
                }
                long jSkip = inputStream.skip(i4 - i3);
                if (jSkip > 0) {
                    i3 = (int) (((long) i3) + jSkip);
                } else {
                    if (inputStream.read() == -1) {
                        MediaType mediaType5 = MediaType.OCTET_STREAM;
                        inputStream.reset();
                        return mediaType5;
                    }
                    i3++;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
    }

    public int getLength() {
        return this.patternLength;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.type);
        byte[] bArr = this.pattern;
        return "Magic Detection for " + strValueOf + " looking for " + bArr.length + " bytes = " + Arrays.toString(bArr) + " mask = " + Arrays.toString(this.mask);
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
            int iMax = Math.max(bArr.length, bArr2 != null ? bArr2.length : 0);
            this.patternLength = iMax;
            if (z3) {
                this.length = 8192;
            } else {
                this.length = iMax;
            }
            this.mask = new byte[iMax];
            this.pattern = new byte[iMax];
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
