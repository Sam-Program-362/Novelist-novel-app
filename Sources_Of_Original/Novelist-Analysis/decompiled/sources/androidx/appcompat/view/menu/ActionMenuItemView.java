package androidx.appcompat.view.menu;

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
import p028j.a;
import p028j.b;
import p028j.i;
import p028j.j;
import p028j.k;
import p028j.q;
import p031k.C0242u;
import p031k.InterfaceC0232j;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0242u implements q, View.OnClickListener, InterfaceC0232j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f1715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f1716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f1717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f1718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f1719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f1720t;
    public boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1721v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1722w;
    public int x;
    public final int y;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.u = d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p013f.a.f2791c, 0, 0);
        this.f1722w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.y = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.x = -1;
        setSaveEnabled(false);
    }

    @Override // p028j.q
    public final void a(k kVar) {
        this.f1715o = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f3452a);
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f1719s == null) {
            this.f1719s = new a(this);
        }
    }

    @Override // p031k.InterfaceC0232j
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p031k.InterfaceC0232j
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
            E2.a.Q(z5 ? null : this.f1715o.f3456e, this);
        } else {
            E2.a.Q(charSequence2, this);
        }
    }

    @Override // p028j.q
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

    @Override // p031k.C0242u, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i5 = this.x) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f1722w;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i4);
        }
        if (!zIsEmpty || this.f1717q == null) {
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
        a aVar;
        if (this.f1715o.hasSubMenu() && (aVar = this.f1719s) != null && aVar.onTouch(this, motionEvent)) {
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
