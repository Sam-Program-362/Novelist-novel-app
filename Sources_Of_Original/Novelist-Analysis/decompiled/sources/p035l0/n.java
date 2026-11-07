package p035l0;

import android.view.View;
import android.view.ViewGroup;
import p008d0.b;

/* JADX INFO: loaded from: classes.dex */
public final class n extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(t tVar, int i3) {
        super(tVar);
        this.f4012b = i3;
    }

    @Override // p008d0.b
    public final int b(View view) {
        int right;
        int i3;
        switch (this.f4012b) {
            case 0:
                u uVar = (u) view.getLayoutParams();
                ((t) this.f2769a).getClass();
                right = view.getRight() + ((u) view.getLayoutParams()).f4024a.right;
                i3 = ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
                break;
            default:
                u uVar2 = (u) view.getLayoutParams();
                ((t) this.f2769a).getClass();
                right = view.getBottom() + ((u) view.getLayoutParams()).f4024a.bottom;
                i3 = ((ViewGroup.MarginLayoutParams) uVar2).bottomMargin;
                break;
        }
        return right + i3;
    }

    @Override // p008d0.b
    public final int c(View view) {
        int left;
        int i3;
        switch (this.f4012b) {
            case 0:
                u uVar = (u) view.getLayoutParams();
                ((t) this.f2769a).getClass();
                left = view.getLeft() - ((u) view.getLayoutParams()).f4024a.left;
                i3 = ((ViewGroup.MarginLayoutParams) uVar).leftMargin;
                break;
            default:
                u uVar2 = (u) view.getLayoutParams();
                ((t) this.f2769a).getClass();
                left = view.getTop() - ((u) view.getLayoutParams()).f4024a.top;
                i3 = ((ViewGroup.MarginLayoutParams) uVar2).topMargin;
                break;
        }
        return left - i3;
    }

    @Override // p008d0.b
    public final int d() {
        int i3;
        int iT;
        switch (this.f4012b) {
            case 0:
                t tVar = (t) this.f2769a;
                i3 = tVar.f4022f;
                iT = tVar.t();
                break;
            default:
                t tVar2 = (t) this.f2769a;
                i3 = tVar2.f4023g;
                iT = tVar2.r();
                break;
        }
        return i3 - iT;
    }

    @Override // p008d0.b
    public final int e() {
        switch (this.f4012b) {
            case 0:
                return ((t) this.f2769a).s();
            default:
                return ((t) this.f2769a).u();
        }
    }

    @Override // p008d0.b
    public final int f() {
        int iS;
        int iT;
        switch (this.f4012b) {
            case 0:
                t tVar = (t) this.f2769a;
                iS = tVar.f4022f - tVar.s();
                iT = tVar.t();
                break;
            default:
                t tVar2 = (t) this.f2769a;
                iS = tVar2.f4023g - tVar2.u();
                iT = tVar2.r();
                break;
        }
        return iS - iT;
    }
}
