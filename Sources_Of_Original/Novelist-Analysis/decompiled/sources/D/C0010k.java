package D;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: D.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0010k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f248e;

    public C0010k(ViewGroup viewGroup) {
        this.f246c = viewGroup;
    }

    public final boolean a(float f3, float f4, boolean z3) {
        ViewParent viewParentE;
        if (this.f247d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f246c, f3, f4, z3);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e3);
            }
        }
        return false;
    }

    public final boolean b(float f3, float f4) {
        ViewParent viewParentE;
        if (this.f247d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f246c, f3, f4);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e3);
            }
        }
        return false;
    }

    public final boolean c(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i6;
        int i7;
        if (!this.f247d || (viewParentE = e(i5)) == null) {
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
        if (viewParentE instanceof InterfaceC0011l) {
            ((InterfaceC0011l) viewParentE).d(i3, i4, iArr, i5);
        } else if (i5 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i3, i4, iArr);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e3);
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
        ViewParent viewParentE;
        int i8;
        int i9;
        int[] iArr3;
        if (this.f247d && (viewParentE = e(i7)) != null) {
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
                if (viewParentE instanceof InterfaceC0012m) {
                    ((InterfaceC0012m) viewParentE).e(viewGroup, i3, i4, i5, i6, i7, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i5;
                    iArr3[1] = iArr3[1] + i6;
                    if (viewParentE instanceof InterfaceC0011l) {
                        ((InterfaceC0011l) viewParentE).b(viewGroup, i3, i4, i5, i6, i7);
                    } else if (i7 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i3, i4, i5, i6);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e3);
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
        boolean zOnStartNestedScroll;
        if (!f(i4)) {
            if (this.f247d) {
                View view = this.f246c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z3 = parent instanceof InterfaceC0011l;
                    if (z3) {
                        zOnStartNestedScroll = ((InterfaceC0011l) parent).f(view2, view, i3, i4);
                    } else if (i4 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i3);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e3);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
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
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i3) {
        ViewParent viewParentE = e(i3);
        if (viewParentE != null) {
            boolean z3 = viewParentE instanceof InterfaceC0011l;
            ViewGroup viewGroup = this.f246c;
            if (z3) {
                ((InterfaceC0011l) viewParentE).c(viewGroup, i3);
            } else if (i3 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e3);
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
