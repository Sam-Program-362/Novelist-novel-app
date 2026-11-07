package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import it.returntrue.novelist.R;
import p026i0.a;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2195s;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2958i, R.attr.seekBarPreferenceStyle, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(1, 100);
        i4 = i4 < i3 ? i3 : i4;
        if (i4 != this.f2194r) {
            this.f2194r = i4;
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i5 != this.f2195s) {
            this.f2195s = Math.min(this.f2194r - i3, Math.abs(i5));
        }
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getBoolean(5, false);
        typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return Integer.valueOf(typedArray.getInt(i3, 0));
    }
}
