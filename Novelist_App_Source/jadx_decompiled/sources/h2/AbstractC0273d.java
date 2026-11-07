package h2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: h2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0273d extends l {
    public static boolean Y(CharSequence charSequence, String str) {
        a2.h.e(charSequence, "<this>");
        return c0(charSequence, str, 0, 2) >= 0;
    }

    public static String Z(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(B1.e.h("Requested character count ", length, " is less than zero.").toString());
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        String substring = str.substring(0, length);
        a2.h.d(substring, "substring(...)");
        return substring;
    }

    public static final int a0(CharSequence charSequence) {
        a2.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int b0(CharSequence charSequence, String str, int i3, boolean z3) {
        a2.h.e(charSequence, "<this>");
        a2.h.e(str, "string");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i3);
        }
        int length = charSequence.length();
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        e2.c cVar = new e2.c(i3, length, 1);
        boolean z4 = charSequence instanceof String;
        int i4 = cVar.f2785m;
        int i5 = cVar.f2784l;
        int i6 = cVar.f2783k;
        if (!z4 || !(str instanceof String)) {
            if ((i4 <= 0 || i6 > i5) && (i4 >= 0 || i5 > i6)) {
                return -1;
            }
            while (!e0(str, charSequence, i6, str.length(), z3)) {
                if (i6 == i5) {
                    return -1;
                }
                i6 += i4;
            }
            return i6;
        }
        if ((i4 <= 0 || i6 > i5) && (i4 >= 0 || i5 > i6)) {
            return -1;
        }
        int i7 = i6;
        while (true) {
            String str2 = str;
            boolean z5 = z3;
            if (l.X(0, i7, str.length(), str2, (String) charSequence, z5)) {
                return i7;
            }
            if (i7 == i5) {
                return -1;
            }
            i7 += i4;
            str = str2;
            z3 = z5;
        }
    }

    public static /* synthetic */ int c0(CharSequence charSequence, String str, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return b0(charSequence, str, i3, false);
    }

    public static boolean d0(CharSequence charSequence) {
        a2.h.e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            char charAt = charSequence.charAt(i3);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean e0(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z3) {
        int i5;
        char upperCase;
        char upperCase2;
        a2.h.e(charSequence, "<this>");
        a2.h.e(charSequence2, "other");
        if (i3 >= 0 && charSequence.length() - i4 >= 0 && i3 <= charSequence2.length() - i4) {
            for (0; i5 < i4; i5 + 1) {
                char charAt = charSequence.charAt(i5);
                char charAt2 = charSequence2.charAt(i3 + i5);
                i5 = (charAt == charAt2 || (z3 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i5 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static List f0(String str, String[] strArr) {
        a2.h.e(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                int b02 = b0(str, str2, 0, false);
                if (b02 == -1) {
                    return E2.a.B(str.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int i3 = 0;
                do {
                    arrayList.add(str.subSequence(i3, b02).toString());
                    i3 = str2.length() + b02;
                    b02 = b0(str, str2, i3, false);
                } while (b02 != -1);
                arrayList.add(str.subSequence(i3, str.length()).toString());
                return arrayList;
            }
        }
        List asList = Arrays.asList(strArr);
        a2.h.d(asList, "asList(...)");
        g2.h hVar = new g2.h(new g2.c(str, new m(asList, 0)));
        ArrayList arrayList2 = new ArrayList(P1.g.e0(hVar));
        Iterator it2 = hVar.iterator();
        while (true) {
            C0271b c0271b = (C0271b) it2;
            if (!c0271b.hasNext()) {
                return arrayList2;
            }
            e2.c cVar = (e2.c) c0271b.next();
            a2.h.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f2783k, cVar.f2784l + 1).toString());
        }
    }

    public static String g0(String str, String str2) {
        a2.h.e(str2, "delimiter");
        int c02 = c0(str, str2, 0, 6);
        if (c02 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + c02, str.length());
        a2.h.d(substring, "substring(...)");
        return substring;
    }

    public static String h0(String str, char c3, String str2) {
        int lastIndexOf = str.lastIndexOf(c3, a0(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        a2.h.d(substring, "substring(...)");
        return substring;
    }
}
