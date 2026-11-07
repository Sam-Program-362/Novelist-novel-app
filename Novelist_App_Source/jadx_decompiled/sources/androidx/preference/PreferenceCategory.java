package androidx.preference;

import a.AbstractC0102a;
import android.content.Context;
import android.util.AttributeSet;
import it.returntrue.novelist.R;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC0102a.y(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }
}
