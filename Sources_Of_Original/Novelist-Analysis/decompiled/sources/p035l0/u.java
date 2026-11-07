package p035l0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class u extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f4024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4025b;

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4024a = new Rect();
        this.f4025b = true;
    }

    public u(int i3, int i4) {
        super(i3, i4);
        this.f4024a = new Rect();
        this.f4025b = true;
    }

    public u(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4024a = new Rect();
        this.f4025b = true;
    }

    public u(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4024a = new Rect();
        this.f4025b = true;
    }

    public u(u uVar) {
        super((ViewGroup.LayoutParams) uVar);
        this.f4024a = new Rect();
        this.f4025b = true;
    }
}
