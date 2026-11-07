package androidx.preference;

import M1.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import it.returntrue.novelist.R;
import p000a.a;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iY = a.y(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iY);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p026i0.a.f2952c, iY, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (A.f1002l == null) {
                A.f1002l = new A(14);
            }
            this.f2193q = A.f1002l;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }
}
