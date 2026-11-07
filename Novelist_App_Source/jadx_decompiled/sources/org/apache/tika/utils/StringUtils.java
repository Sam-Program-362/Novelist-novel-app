package org.apache.tika.utils;

import java.util.List;

/* loaded from: classes.dex */
public class StringUtils {
    public static final String EMPTY = "";
    static int PAD_LIMIT = 10000;
    public static final String SPACE = " ";

    public static boolean isBlank(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int codePointAt = str.codePointAt(i3);
            if (!Character.isWhitespace(codePointAt)) {
                return false;
            }
            i3 += Character.charCount(codePointAt);
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String joinWith(String str, List<String> list) {
        if (list.size() == 0) {
            return EMPTY;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        for (String str2 : list) {
            int i4 = i3 + 1;
            if (i3 > 0) {
                sb.append(str);
            }
            sb.append(str2);
            i3 = i4;
        }
        return sb.toString();
    }

    public static String leftPad(String str, int i3, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = SPACE;
        }
        int length = str2.length();
        int length2 = i3 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= PAD_LIMIT) {
            return leftPad(str, i3, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i4 = 0; i4 < length2; i4++) {
            cArr[i4] = charArray[i4 % length];
        }
        return new String(cArr).concat(str);
    }

    public static String repeat(char c3, int i3) {
        if (i3 <= 0) {
            return EMPTY;
        }
        char[] cArr = new char[i3];
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            cArr[i4] = c3;
        }
        return new String(cArr);
    }

    public static String repeat(String str, int i3) {
        if (str == null) {
            return null;
        }
        if (i3 <= 0) {
            return EMPTY;
        }
        int length = str.length();
        if (i3 == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i3 <= PAD_LIMIT) {
            return repeat(str.charAt(0), i3);
        }
        int i4 = length * i3;
        if (length == 1) {
            return repeat(str.charAt(0), i3);
        }
        if (length != 2) {
            StringBuilder sb = new StringBuilder(i4);
            for (int i5 = 0; i5 < i3; i5++) {
                sb.append(str);
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        char[] cArr = new char[i4];
        for (int i6 = (i3 * 2) - 2; i6 >= 0; i6 -= 2) {
            cArr[i6] = charAt;
            cArr[i6 + 1] = charAt2;
        }
        return new String(cArr);
    }

    public static String leftPad(String str, int i3, char c3) {
        if (str == null) {
            return null;
        }
        int length = i3 - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > PAD_LIMIT) {
            return leftPad(str, i3, String.valueOf(c3));
        }
        return repeat(c3, length).concat(str);
    }
}
