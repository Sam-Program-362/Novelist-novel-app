package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i0.AbstractC0282a;
import it.returntrue.novelist.R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: r, reason: collision with root package name */
    public final int f2194r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2195s;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0282a.f2958i, R.attr.seekBarPreferenceStyle, 0);
        int i3 = obtainStyledAttributes.getInt(3, 0);
        int i4 = obtainStyledAttributes.getInt(1, 100);
        i4 = i4 < i3 ? i3 : i4;
        if (i4 != this.f2194r) {
            this.f2194r = i4;
        }
        int i5 = obtainStyledAttributes.getInt(4, 0);
        if (i5 != this.f2195s) {
            this.f2195s = Math.min(this.f2194r - i3, Math.abs(i5));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return Integer.valueOf(typedArray.getInt(i3, 0));
    }
}
