package l0;

import android.view.View;
import android.view.ViewGroup;
import d0.AbstractC0231b;

/* renamed from: l0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404n extends AbstractC0231b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0404n(AbstractC0410t abstractC0410t, int i3) {
        super(abstractC0410t);
        this.f4012b = i3;
    }

    @Override // d0.AbstractC0231b
    public final int b(View view) {
        int right;
        int i3;
        switch (this.f4012b) {
            case 0:
                C0411u c0411u = (C0411u) view.getLayoutParams();
                ((AbstractC0410t) this.f2769a).getClass();
                right = view.getRight() + ((C0411u) view.getLayoutParams()).f4024a.right;
                i3 = ((ViewGroup.MarginLayoutParams) c0411u).rightMargin;
                break;
            default:
                C0411u c0411u2 = (C0411u) view.getLayoutParams();
                ((AbstractC0410t) this.f2769a).getClass();
                right = view.getBottom() + ((C0411u) view.getLayoutParams()).f4024a.bottom;
                i3 = ((ViewGroup.MarginLayoutParams) c0411u2).bottomMargin;
                break;
        }
        return right + i3;
    }

    @Override // d0.AbstractC0231b
    public final int c(View view) {
        int left;
        int i3;
        switch (this.f4012b) {
            case 0:
                C0411u c0411u = (C0411u) view.getLayoutParams();
                ((AbstractC0410t) this.f2769a).getClass();
                left = view.getLeft() - ((C0411u) view.getLayoutParams()).f4024a.left;
                i3 = ((ViewGroup.MarginLayoutParams) c0411u).leftMargin;
                break;
            default:
                C0411u c0411u2 = (C0411u) view.getLayoutParams();
                ((AbstractC0410t) this.f2769a).getClass();
                left = view.getTop() - ((C0411u) view.getLayoutParams()).f4024a.top;
                i3 = ((ViewGroup.MarginLayoutParams) c0411u2).topMargin;
                break;
        }
        return left - i3;
    }

    @Override // d0.AbstractC0231b
    public final int d() {
        int i3;
        int t3;
        switch (this.f4012b) {
            case 0:
                AbstractC0410t abstractC0410t = (AbstractC0410t) this.f2769a;
                i3 = abstractC0410t.f4022f;
                t3 = abstractC0410t.t();
                break;
            default:
                AbstractC0410t abstractC0410t2 = (AbstractC0410t) this.f2769a;
                i3 = abstractC0410t2.f4023g;
                t3 = abstractC0410t2.r();
                break;
        }
        return i3 - t3;
    }

    @Override // d0.AbstractC0231b
    public final int e() {
        switch (this.f4012b) {
            case 0:
                return ((AbstractC0410t) this.f2769a).s();
            default:
                return ((AbstractC0410t) this.f2769a).u();
        }
    }

    @Override // d0.AbstractC0231b
    public final int f() {
        int s3;
        int t3;
        switch (this.f4012b) {
            case 0:
                AbstractC0410t abstractC0410t = (AbstractC0410t) this.f2769a;
                s3 = abstractC0410t.f4022f - abstractC0410t.s();
                t3 = abstractC0410t.t();
                break;
            default:
                AbstractC0410t abstractC0410t2 = (AbstractC0410t) this.f2769a;
                s3 = abstractC0410t2.f4023g - abstractC0410t2.u();
                t3 = abstractC0410t2.r();
                break;
        }
        return s3 - t3;
    }
}
