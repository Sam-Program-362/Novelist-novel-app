package p031k;

import E2.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import it.returntrue.novelist.R;

/* JADX INFO: renamed from: k.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0230h extends C0239q implements InterfaceC0232j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0231i f3679m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230h(C0231i c0231i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f3679m = c0231i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        a.Q(getContentDescription(), this);
        setOnTouchListener(new p028j.a(this, this));
    }

    @Override // p031k.InterfaceC0232j
    public final boolean b() {
        return false;
    }

    @Override // p031k.InterfaceC0232j
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
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
