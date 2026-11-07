package p031k;

import A0.j;
import E2.a;
import F0.b;
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

/* JADX INFO: renamed from: k.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0235m extends AutoCompleteTextView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f3726m = {R.attr.popupBackground};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0236n f3727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0241t f3728l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0235m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, it.returntrue.novelist.R.attr.autoCompleteTextViewStyle);
        k0.a(context);
        j0.a(this, getContext());
        j jVarF = j.F(getContext(), attributeSet, f3726m, it.returntrue.novelist.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) jVarF.f58m).hasValue(0)) {
            setDropDownBackgroundDrawable(jVarF.y(0));
        }
        jVarF.J();
        C0236n c0236n = new C0236n(this);
        this.f3727k = c0236n;
        c0236n.b(attributeSet, it.returntrue.novelist.R.attr.autoCompleteTextViewStyle);
        C0241t c0241t = new C0241t(this);
        this.f3728l = c0241t;
        c0241t.d(attributeSet, it.returntrue.novelist.R.attr.autoCompleteTextViewStyle);
        c0241t.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0236n c0236n = this.f3727k;
        if (c0236n != null) {
            c0236n.a();
        }
        C0241t c0241t = this.f3728l;
        if (c0241t != null) {
            c0241t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        b bVar;
        C0236n c0236n = this.f3727k;
        if (c0236n == null || (bVar = c0236n.f3735e) == null) {
            return null;
        }
        return (ColorStateList) bVar.f302c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b bVar;
        C0236n c0236n = this.f3727k;
        if (c0236n == null || (bVar = c0236n.f3735e) == null) {
            return null;
        }
        return (PorterDuff.Mode) bVar.f303d;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0236n c0236n = this.f3727k;
        if (c0236n != null) {
            c0236n.f3733c = -1;
            c0236n.d(null);
            c0236n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0236n c0236n = this.f3727k;
        if (c0236n != null) {
            c0236n.c(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.X(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(p017g.a.a(getContext(), i3));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0236n c0236n = this.f3727k;
        if (c0236n != null) {
            c0236n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0236n c0236n = this.f3727k;
        if (c0236n != null) {
            c0236n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0241t c0241t = this.f3728l;
        if (c0241t != null) {
            c0241t.e(context, i3);
        }
    }
}
