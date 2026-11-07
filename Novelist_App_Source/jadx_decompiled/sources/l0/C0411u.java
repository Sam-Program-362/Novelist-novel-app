package l0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: l0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0411u extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f4024a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4025b;

    public C0411u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4024a = new Rect();
        this.f4025b = true;
    }

    public C0411u(int i3, int i4) {
        super(i3, i4);
        this.f4024a = new Rect();
        this.f4025b = true;
    }

    public C0411u(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4024a = new Rect();
        this.f4025b = true;
    }

    public C0411u(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4024a = new Rect();
        this.f4025b = true;
    }

    public C0411u(C0411u c0411u) {
        super((ViewGroup.LayoutParams) c0411u);
        this.f4024a = new Rect();
        this.f4025b = true;
    }
}
