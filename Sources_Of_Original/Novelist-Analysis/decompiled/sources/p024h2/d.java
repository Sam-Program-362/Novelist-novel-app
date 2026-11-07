package p024h2;

import B1.e;
import E2.a;
import P1.g;
import a2.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p012e2.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends l {
    public static boolean Y(CharSequence charSequence, String str) {
        h.e(charSequence, "<this>");
        return c0(charSequence, str, 0, 2) >= 0;
    }

    public static String Z(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            throw new IllegalArgumentException(e.h("Requested character count ", length, " is less than zero.").toString());
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        String strSubstring = str.substring(0, length);
        h.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int a0(CharSequence charSequence) {
        h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int b0(CharSequence charSequence, String str, int i3, boolean z3) {
        h.e(charSequence, "<this>");
        h.e(str, "string");
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
        c cVar = new c(i3, length, 1);
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
        h.e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            char cCharAt = charSequence.charAt(i3);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean e0(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z3) {
        char upperCase;
        char upperCase2;
        h.e(charSequence, "<this>");
        h.e(charSequence2, "other");
        if (i3 >= 0 && charSequence.length() - i4 >= 0 && i3 <= charSequence2.length() - i4) {
            for (int i5 = 0; i5 < i4; i5++) {
                char cCharAt = charSequence.charAt(i5);
                char cCharAt2 = charSequence2.charAt(i3 + i5);
                if (cCharAt == cCharAt2 || (z3 && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static List f0(String str, String[] strArr) {
        h.e(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                int iB0 = b0(str, str2, 0, false);
                if (iB0 == -1) {
                    return a.B(str.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int length = 0;
                do {
                    arrayList.add(str.subSequence(length, iB0).toString());
                    length = str2.length() + iB0;
                    iB0 = b0(str, str2, length, false);
                } while (iB0 != -1);
                arrayList.add(str.subSequence(length, str.length()).toString());
                return arrayList;
            }
        }
        List listAsList = Arrays.asList(strArr);
        h.d(listAsList, "asList(...)");
        p020g2.h hVar = new p020g2.h(new p020g2.c(str, new m(listAsList, 0)));
        ArrayList arrayList2 = new ArrayList(g.e0(hVar));
        Iterator it2 = hVar.iterator();
        while (true) {
            b bVar = (b) it2;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            c cVar = (c) bVar.next();
            h.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f2783k, cVar.f2784l + 1).toString());
        }
    }

    public static String g0(String str, String str2) {
        h.e(str2, "delimiter");
        int iC0 = c0(str, str2, 0, 6);
        if (iC0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iC0, str.length());
        h.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String h0(String str, char c3, String str2) {
        int iLastIndexOf = str.lastIndexOf(c3, a0(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        h.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
