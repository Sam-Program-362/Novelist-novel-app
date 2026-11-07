package p027i1;

import A0.j;
import C1.g;
import C1.h;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import p031k.u0;
import p067y1.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements b, p070z1.a, h, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f2961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f2962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2963m;

    @Override // C1.h
    public final void i(g gVar) {
        this.f2961k = gVar;
    }

    @Override // p070z1.a
    public final void onAttachedToActivity(p070z1.b bVar) {
        View viewFindViewById = ((Activity) ((u0) bVar).f3794a).findViewById(R.id.content);
        this.f2962l = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        new j(aVar.f4730c, "flutter_keyboard_visibility").L(this);
    }

    @Override // C1.h
    public final void onCancel() {
        this.f2961k = null;
    }

    @Override // p070z1.a
    public final void onDetachedFromActivity() {
        View view = this.f2962l;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f2962l = null;
        }
    }

    @Override // p070z1.a
    public final void onDetachedFromActivityForConfigChanges() {
        View view = this.f2962l;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f2962l = null;
        }
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
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
            ?? r3 = ((double) rect.height()) / ((double) this.f2962l.getRootView().getHeight()) < 0.85d ? 1 : 0;
            if (r3 != this.f2963m) {
                this.f2963m = r3;
                g gVar = this.f2961k;
                if (gVar != null) {
                    gVar.a(Integer.valueOf((int) r3));
                }
            }
        }
    }

    @Override // p070z1.a
    public final void onReattachedToActivityForConfigChanges(p070z1.b bVar) {
        View viewFindViewById = ((Activity) ((u0) bVar).f3794a).findViewById(R.id.content);
        this.f2962l = viewFindViewById;
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
