package p031k;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import p013f.a;

/* JADX INFO: loaded from: classes.dex */
public class G extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3595b;

    public G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3595b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2799k);
        this.f3594a = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f3595b = typedArrayObtainStyledAttributes.getInt(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public G(int i3) {
        super(i3, -2);
        this.f3595b = -1;
        this.f3594a = 0.0f;
    }

    public G(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3595b = -1;
    }
}
