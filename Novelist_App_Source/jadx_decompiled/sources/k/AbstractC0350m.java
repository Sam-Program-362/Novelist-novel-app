package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import g.AbstractC0250a;

/* renamed from: k.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0350m extends AutoCompleteTextView {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f3726m = {R.attr.popupBackground};

    /* renamed from: k, reason: collision with root package name */
    public final C0351n f3727k;

    /* renamed from: l, reason: collision with root package name */
    public final C0356t f3728l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0350m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, it.returntrue.novelist.R.attr.autoCompleteTextViewStyle);
        k0.a(context);
        j0.a(this, getContext());
        A0.j F3 = A0.j.F(getContext(), attributeSet, f3726m, it.returntrue.novelist.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) F3.f58m).hasValue(0)) {
            setDropDownBackgroundDrawable(F3.y(0));
        }
        F3.J();
        C0351n c0351n = new C0351n(this);
        this.f3727k = c0351n;
        c0351n.b(attributeSet, it.returntrue.novelist.R.attr.autoCompleteTextViewStyle);
        C0356t c0356t = new C0356t(this);
        this.f3728l = c0356t;
        c0356t.d(attributeSet, it.returntrue.novelist.R.attr.autoCompleteTextViewStyle);
        c0356t.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0351n c0351n = this.f3727k;
        if (c0351n != null) {
            c0351n.a();
        }
        C0356t c0356t = this.f3728l;
        if (c0356t != null) {
            c0356t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        F0.b bVar;
        C0351n c0351n = this.f3727k;
        if (c0351n == null || (bVar = c0351n.f3735e) == null) {
            return null;
        }
        return (ColorStateList) bVar.f302c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        F0.b bVar;
        C0351n c0351n = this.f3727k;
        if (c0351n == null || (bVar = c0351n.f3735e) == null) {
            return null;
        }
        return (PorterDuff.Mode) bVar.f303d;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0351n c0351n = this.f3727k;
        if (c0351n != null) {
            c0351n.f3733c = -1;
            c0351n.d(null);
            c0351n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0351n c0351n = this.f3727k;
        if (c0351n != null) {
            c0351n.c(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E2.a.X(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(AbstractC0250a.a(getContext(), i3));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0351n c0351n = this.f3727k;
        if (c0351n != null) {
            c0351n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0351n c0351n = this.f3727k;
        if (c0351n != null) {
            c0351n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0356t c0356t = this.f3728l;
        if (c0356t != null) {
            c0356t.e(context, i3);
        }
    }
}
