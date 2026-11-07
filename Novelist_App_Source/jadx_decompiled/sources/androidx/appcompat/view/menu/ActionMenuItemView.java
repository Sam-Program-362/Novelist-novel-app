package androidx.appcompat.view.menu;

import E2.a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import f.AbstractC0243a;
import j.ViewOnTouchListenerC0314a;
import j.b;
import j.i;
import j.j;
import j.k;
import j.q;
import k.C0357u;
import k.InterfaceC0347j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0357u implements q, View.OnClickListener, InterfaceC0347j {

    /* renamed from: o, reason: collision with root package name */
    public k f1715o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1716p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f1717q;

    /* renamed from: r, reason: collision with root package name */
    public i f1718r;

    /* renamed from: s, reason: collision with root package name */
    public ViewOnTouchListenerC0314a f1719s;

    /* renamed from: t, reason: collision with root package name */
    public b f1720t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1721v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1722w;
    public int x;
    public final int y;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.u = d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0243a.f2791c, 0, 0);
        this.f1722w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.y = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.x = -1;
        setSaveEnabled(false);
    }

    @Override // j.q
    public final void a(k kVar) {
        this.f1715o = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f3452a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f1719s == null) {
            this.f1719s = new ViewOnTouchListenerC0314a(this);
        }
    }

    @Override // k.InterfaceC0347j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.InterfaceC0347j
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f1715o.getIcon() == null;
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i3 < 480) {
            return (i3 >= 640 && i4 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void e() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f1716p);
        if (this.f1717q != null && ((this.f1715o.y & 4) != 4 || (!this.u && !this.f1721v))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f1716p : null);
        CharSequence charSequence = this.f1715o.f3467q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z5 ? null : this.f1715o.f3456e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1715o.f3468r;
        if (TextUtils.isEmpty(charSequence2)) {
            a.Q(z5 ? null : this.f1715o.f3456e, this);
        } else {
            a.Q(charSequence2, this);
        }
    }

    @Override // j.q
    public k getItemData() {
        return this.f1715o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f1718r;
        if (iVar != null) {
            iVar.a(this.f1715o);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.u = d();
        e();
    }

    @Override // k.C0357u, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i5 = this.x) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f1722w;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (!isEmpty || this.f1717q == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1717q.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0314a viewOnTouchListenerC0314a;
        if (this.f1715o.hasSubMenu() && (viewOnTouchListenerC0314a = this.f1719s) != null && viewOnTouchListenerC0314a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f1721v != z3) {
            this.f1721v = z3;
            k kVar = this.f1715o;
            if (kVar != null) {
                j jVar = kVar.n;
                jVar.f3441k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1717q = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.y;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(i iVar) {
        this.f1718r = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i4, int i5, int i6) {
        this.x = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(b bVar) {
        this.f1720t = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1716p = charSequence;
        e();
    }
}
