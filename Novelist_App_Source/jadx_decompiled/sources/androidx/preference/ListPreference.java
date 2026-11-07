package androidx.preference;

import M1.A;
import a.AbstractC0102a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import i0.AbstractC0282a;
import it.returntrue.novelist.R;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence[] f2186r;

    /* renamed from: s, reason: collision with root package name */
    public final String f2187s;

    public ListPreference(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0282a.f2953d, i3, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f2186r = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (A.f1003m == null) {
                A.f1003m = new A(15);
            }
            this.f2193q = A.f1003m;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0282a.f2955f, i3, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.f2187s = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        A a3 = this.f2193q;
        if (a3 != null) {
            return a3.g(this);
        }
        CharSequence a4 = super.a();
        String str = this.f2187s;
        if (str != null) {
            String format = String.format(str, StringUtils.EMPTY);
            if (!TextUtils.equals(format, a4)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return a4;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0102a.y(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
