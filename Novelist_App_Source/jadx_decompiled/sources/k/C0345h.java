package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import it.returntrue.novelist.R;
import j.ViewOnTouchListenerC0314a;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345h extends C0354q implements InterfaceC0347j {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0346i f3679m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0345h(C0346i c0346i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f3679m = c0346i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        E2.a.Q(getContentDescription(), this);
        setOnTouchListener(new ViewOnTouchListenerC0314a(this, this));
    }

    @Override // k.InterfaceC0347j
    public final boolean b() {
        return false;
    }

    @Override // k.InterfaceC0347j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f3679m.h();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i3, i4, i5, i6);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
