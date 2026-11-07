package i1;

import A0.j;
import C1.g;
import C1.h;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import k.u0;
import y1.C0500a;
import y1.b;
import z1.InterfaceC0508a;
import z1.InterfaceC0509b;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC0283a implements b, InterfaceC0508a, h, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: k, reason: collision with root package name */
    public g f2961k;

    /* renamed from: l, reason: collision with root package name */
    public View f2962l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2963m;

    @Override // C1.h
    public final void i(g gVar) {
        this.f2961k = gVar;
    }

    @Override // z1.InterfaceC0508a
    public final void onAttachedToActivity(InterfaceC0509b interfaceC0509b) {
        View findViewById = ((Activity) ((u0) interfaceC0509b).f3794a).findViewById(R.id.content);
        this.f2962l = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        new j(c0500a.f4730c, "flutter_keyboard_visibility").L(this);
    }

    @Override // C1.h
    public final void onCancel() {
        this.f2961k = null;
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivity() {
        View view = this.f2962l;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f2962l = null;
        }
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivityForConfigChanges() {
        View view = this.f2962l;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f2962l = null;
        }
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        View view = this.f2962l;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f2962l = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.f2962l != null) {
            Rect rect = new Rect();
            this.f2962l.getWindowVisibleDisplayFrame(rect);
            ?? r02 = ((double) rect.height()) / ((double) this.f2962l.getRootView().getHeight()) < 0.85d ? 1 : 0;
            if (r02 != this.f2963m) {
                this.f2963m = r02;
                g gVar = this.f2961k;
                if (gVar != null) {
                    gVar.a(Integer.valueOf((int) r02));
                }
            }
        }
    }

    @Override // z1.InterfaceC0508a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0509b interfaceC0509b) {
        View findViewById = ((Activity) ((u0) interfaceC0509b).f3794a).findViewById(R.id.content);
        this.f2962l = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
