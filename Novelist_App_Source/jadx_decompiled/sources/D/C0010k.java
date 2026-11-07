package D;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: D.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010k {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f244a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f245b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f246c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f247d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f248e;

    public C0010k(ViewGroup viewGroup) {
        this.f246c = viewGroup;
    }

    public final boolean a(float f3, float f4, boolean z3) {
        ViewParent e3;
        if (this.f247d && (e3 = e(0)) != null) {
            try {
                return e3.onNestedFling(this.f246c, f3, f4, z3);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedFling", e4);
            }
        }
        return false;
    }

    public final boolean b(float f3, float f4) {
        ViewParent e3;
        if (this.f247d && (e3 = e(0)) != null) {
            try {
                return e3.onNestedPreFling(this.f246c, f3, f4);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedPreFling", e4);
            }
        }
        return false;
    }

    public final boolean c(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        ViewParent e3;
        int i6;
        int i7;
        if (!this.f247d || (e3 = e(i5)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f246c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            if (this.f248e == null) {
                this.f248e = new int[2];
            }
            iArr = this.f248e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (e3 instanceof InterfaceC0011l) {
            ((InterfaceC0011l) e3).d(i3, i4, iArr, i5);
        } else if (i5 == 0) {
            try {
                e3.onNestedPreScroll(viewGroup, i3, i4, iArr);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedPreScroll", e4);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean d(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent e3;
        int i8;
        int i9;
        int[] iArr3;
        if (this.f247d && (e3 = e(i7)) != null) {
            if (i3 != 0 || i4 != 0 || i5 != 0 || i6 != 0) {
                ViewGroup viewGroup = this.f246c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i8 = iArr[0];
                    i9 = iArr[1];
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                if (iArr2 == null) {
                    if (this.f248e == null) {
                        this.f248e = new int[2];
                    }
                    int[] iArr4 = this.f248e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e3 instanceof InterfaceC0012m) {
                    ((InterfaceC0012m) e3).e(viewGroup, i3, i4, i5, i6, i7, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i5;
                    iArr3[1] = iArr3[1] + i6;
                    if (e3 instanceof InterfaceC0011l) {
                        ((InterfaceC0011l) e3).b(viewGroup, i3, i4, i5, i6, i7);
                    } else if (i7 == 0) {
                        try {
                            e3.onNestedScroll(viewGroup, i3, i4, i5, i6);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedScroll", e4);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i8;
                    iArr[1] = iArr[1] - i9;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i3) {
        if (i3 == 0) {
            return this.f244a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f245b;
    }

    public final boolean f(int i3) {
        return e(i3) != null;
    }

    public final boolean g(int i3, int i4) {
        boolean onStartNestedScroll;
        if (!f(i4)) {
            if (this.f247d) {
                View view = this.f246c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z3 = parent instanceof InterfaceC0011l;
                    if (z3) {
                        onStartNestedScroll = ((InterfaceC0011l) parent).f(view2, view, i3, i4);
                    } else {
                        if (i4 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i3);
                            } catch (AbstractMethodError e3) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e3);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i4 == 0) {
                            this.f244a = parent;
                        } else if (i4 == 1) {
                            this.f245b = parent;
                        }
                        if (z3) {
                            ((InterfaceC0011l) parent).a(view2, view, i3, i4);
                        } else if (i4 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i3);
                            } catch (AbstractMethodError e4) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e4);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i3) {
        ViewParent e3 = e(i3);
        if (e3 != null) {
            boolean z3 = e3 instanceof InterfaceC0011l;
            ViewGroup viewGroup = this.f246c;
            if (z3) {
                ((InterfaceC0011l) e3).c(viewGroup, i3);
            } else if (i3 == 0) {
                try {
                    e3.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i3 == 0) {
                this.f244a = null;
            } else {
                if (i3 != 1) {
                    return;
                }
                this.f245b = null;
            }
        }
    }
}
