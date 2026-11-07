package k;

import android.content.Context;
import android.view.View;
import it.returntrue.novelist.R;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343f extends j.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3665l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0346i f3666m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0343f(C0346i c0346i, Context context, j.j jVar, View view) {
        super(context, jVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f3666m = c0346i;
        this.f3481f = 8388613;
        H0.i iVar = c0346i.f3699F;
        this.f3483h = iVar;
        j.l lVar = this.f3484i;
        if (lVar != null) {
            lVar.j(iVar);
        }
    }

    @Override // j.n
    public final void c() {
        switch (this.f3665l) {
            case 0:
                C0346i c0346i = this.f3666m;
                c0346i.f3696C = null;
                c0346i.getClass();
                super.c();
                break;
            default:
                C0346i c0346i2 = this.f3666m;
                j.j jVar = c0346i2.f3702m;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0346i2.f3695B = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0343f(C0346i c0346i, Context context, j.t tVar, View view) {
        super(context, tVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f3666m = c0346i;
        if ((tVar.f3503w.x & 32) != 32) {
            View view2 = c0346i.f3706r;
            this.f3480e = view2 == null ? c0346i.f3705q : view2;
        }
        H0.i iVar = c0346i.f3699F;
        this.f3483h = iVar;
        j.l lVar = this.f3484i;
        if (lVar != null) {
            lVar.j(iVar);
        }
    }
}
