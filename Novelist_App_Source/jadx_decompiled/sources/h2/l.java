package h2;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static boolean W(String str, String str2) {
        a2.h.e(str, "<this>");
        return str.endsWith(str2);
    }

    public static final boolean X(int i3, int i4, int i5, String str, String str2, boolean z3) {
        a2.h.e(str, "<this>");
        a2.h.e(str2, "other");
        return !z3 ? str.regionMatches(i3, str2, i4, i5) : str.regionMatches(z3, i3, str2, i4, i5);
    }
}
