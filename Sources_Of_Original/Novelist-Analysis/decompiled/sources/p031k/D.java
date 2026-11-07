package p031k;

import A.b;
import G.d;
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

/* JADX INFO: loaded from: classes.dex */
public abstract class D extends ListView {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f3581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3583m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Field f3586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C f3587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3589t;
    public boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f3590v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f3591w;

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
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = 0;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i3, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return i4;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x014f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0161  */
    /* JADX WARN: Code duplicated, block: B:79:0x0165  */
    /* JADX WARN: Code duplicated, block: B:81:0x0169  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(int i3, MotionEvent motionEvent) {
        boolean z3;
        View childAt;
        View childAt2;
        d dVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z3 = true;
            } else if (actionMasked != 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || z4) {
                this.u = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f3585p - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z3) {
                if (this.f3590v == null) {
                    this.f3590v = new d(this);
                }
                d dVar2 = this.f3590v;
                boolean z5 = dVar2.f376z;
                dVar2.f376z = true;
                dVar2.onTouch(this, motionEvent);
            } else {
                dVar = this.f3590v;
                if (dVar != null) {
                    if (dVar.f376z) {
                        dVar.d();
                    }
                    dVar.f376z = false;
                }
            }
            return z3;
        }
        z3 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i3);
        if (iFindPointerIndex < 0) {
            z3 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z4 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f3 = x;
                float f4 = y;
                this.u = true;
                drawableHotspotChanged(f3, f4);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f3585p;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f3585p = iPointToPosition;
                childAt3.drawableHotspotChanged(f3 - childAt3.getLeft(), f4 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z6 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z6) {
                    selector.setVisible(false, false);
                }
                Field field = this.f3586q;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f3581k;
                rect.set(left, top, right, bottom);
                rect.left -= this.f3582l;
                rect.top -= this.f3583m;
                rect.right += this.n;
                rect.bottom += this.f3584o;
                try {
                    boolean z7 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z7) {
                        field.set(this, Boolean.valueOf(!z7));
                        if (iPointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e3) {
                    e3.printStackTrace();
                }
                if (z6) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f3, f4);
                }
                C c3 = this.f3587r;
                if (c3 != null) {
                    c3.f3580l = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z4 = false;
                z3 = true;
            }
        }
        if (z3) {
            this.u = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f3585p - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.u = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f3585p - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z3) {
            if (this.f3590v == null) {
                this.f3590v = new d(this);
            }
            d dVar3 = this.f3590v;
            boolean z8 = dVar3.f376z;
            dVar3.f376z = true;
            dVar3.onTouch(this, motionEvent);
        } else {
            dVar = this.f3590v;
            if (dVar != null) {
                if (dVar.f376z) {
                    dVar.d();
                }
                dVar.f376z = false;
            }
        }
        return z3;
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
        C c3 = this.f3587r;
        if (c3 != null) {
            c3.f3580l = true;
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
            b bVar = new b(this, 10);
            this.f3591w = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
            }
            Drawable selector = getSelector();
            if (selector != null && this.u && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3585p = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f3591w;
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
        C c3 = null;
        if (drawable != null) {
            C c4 = new C();
            Drawable drawable2 = c4.f3579k;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c4.f3579k = drawable;
            drawable.setCallback(c4);
            c4.f3580l = true;
            c3 = c4;
        }
        this.f3587r = c3;
        super.setSelector(c3);
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
