package P1;

import a.AbstractC0102a;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends AbstractC0102a {
    public static void W(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        a2.h.e(iArr, "<this>");
        a2.h.e(iArr2, "destination");
        System.arraycopy(iArr, i4, iArr2, i3, i5 - i4);
    }

    public static void X(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        a2.h.e(objArr, "<this>");
        a2.h.e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
    }

    public static /* synthetic */ void Y(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        X(0, i3, i4, objArr, objArr2);
    }

    public static Object[] Z(Object[] objArr, int i3, int i4) {
        a2.h.e(objArr, "<this>");
        int length = objArr.length;
        if (i4 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i3, i4);
            a2.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + length + ").");
    }

    public static Object a0(Object[] objArr) {
        a2.h.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }
}
