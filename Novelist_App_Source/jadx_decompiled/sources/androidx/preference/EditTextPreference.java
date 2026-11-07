package androidx.preference;

import android.content.res.TypedArray;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968718(0x7f04008e, float:1.7546098E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = a.AbstractC0102a.y(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = i0.AbstractC0282a.f2952c
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L2f
            M1.A r5 = M1.A.f1002l
            if (r5 != 0) goto L2b
            M1.A r5 = new M1.A
            r0 = 14
            r5.<init>(r0)
            M1.A.f1002l = r5
        L2b:
            M1.A r5 = M1.A.f1002l
            r3.f2193q = r5
        L2f:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }
}
