package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import it.returntrue.novelist.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class D extends ListView {

    /* renamed from: k, reason: collision with root package name */
    public final Rect f3581k;

    /* renamed from: l, reason: collision with root package name */
    public int f3582l;

    /* renamed from: m, reason: collision with root package name */
    public int f3583m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f3584o;

    /* renamed from: p, reason: collision with root package name */
    public int f3585p;

    /* renamed from: q, reason: collision with root package name */
    public final Field f3586q;

    /* renamed from: r, reason: collision with root package name */
    public C0337C f3587r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3588s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f3589t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public G.d f3590v;

    /* renamed from: w, reason: collision with root package name */
    public A.b f3591w;

    public D(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f3581k = new Rect();
        this.f3582l = 0;
        this.f3583m = 0;
        this.n = 0;
        this.f3584o = 0;
        this.f3589t = z3;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3586q = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
    }

    public final int a(int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i3, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i4) {
                return i4;
            }
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r18, android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.D.b(int, android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3581k;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3591w != null) {
            return;
        }
        super.drawableStateChanged();
        C0337C c0337c = this.f3587r;
        if (c0337c != null) {
            c0337c.f3580l = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.u && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f3589t || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f3589t || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f3589t || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f3589t && this.f3588s) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3591w = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3591w == null) {
            A.b bVar = new A.b(this, 10);
            this.f3591w = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            Drawable selector = getSelector();
            if (selector != null && this.u && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3585p = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        A.b bVar = this.f3591w;
        if (bVar != null) {
            D d3 = (D) bVar.f4l;
            d3.f3591w = null;
            d3.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f3588s = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0337C c0337c = null;
        if (drawable != null) {
            C0337C c0337c2 = new C0337C();
            Drawable drawable2 = c0337c2.f3579k;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0337c2.f3579k = drawable;
            drawable.setCallback(c0337c2);
            c0337c2.f3580l = true;
            c0337c = c0337c2;
        }
        this.f3587r = c0337c;
        super.setSelector(c0337c);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3582l = rect.left;
        this.f3583m = rect.top;
        this.n = rect.right;
        this.f3584o = rect.bottom;
    }
}
