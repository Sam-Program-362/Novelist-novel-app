package j;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.C0343f;
import k.C0344g;
import k.C0345h;
import k.F;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0314a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final float f3385k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3386l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3387m;
    public final View n;

    /* renamed from: o, reason: collision with root package name */
    public F f3388o;

    /* renamed from: p, reason: collision with root package name */
    public F f3389p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3390q;

    /* renamed from: r, reason: collision with root package name */
    public int f3391r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f3392s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f3393t;
    public final /* synthetic */ View u;

    public ViewOnTouchListenerC0314a(View view) {
        this.f3392s = new int[2];
        this.n = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3385k = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3386l = tapTimeout;
        this.f3387m = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        F f3 = this.f3389p;
        View view = this.n;
        if (f3 != null) {
            view.removeCallbacks(f3);
        }
        F f4 = this.f3388o;
        if (f4 != null) {
            view.removeCallbacks(f4);
        }
    }

    public final l b() {
        C0343f c0343f;
        switch (this.f3393t) {
            case 0:
                b bVar = ((ActionMenuItemView) this.u).f1720t;
                if (bVar == null || (c0343f = ((C0344g) bVar).f3673a.f3696C) == null) {
                    return null;
                }
                return c0343f.a();
            default:
                C0343f c0343f2 = ((C0345h) this.u).f3679m.f3695B;
                if (c0343f2 == null) {
                    return null;
                }
                return c0343f2.a();
        }
    }

    public final boolean c() {
        l b3;
        switch (this.f3393t) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.u;
                i iVar = actionMenuItemView.f1718r;
                return iVar != null && iVar.a(actionMenuItemView.f1715o) && (b3 = b()) != null && b3.h();
            default:
                ((C0345h) this.u).f3679m.h();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.ViewOnTouchListenerC0314a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3390q = false;
        this.f3391r = -1;
        F f3 = this.f3388o;
        if (f3 != null) {
            this.n.removeCallbacks(f3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0314a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f3393t = 0;
        this.u = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0314a(C0345h c0345h, C0345h c0345h2) {
        this(c0345h2);
        this.f3393t = 1;
        this.u = c0345h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
