package p031k;

import H0.i;
import android.content.Context;
import android.view.View;
import it.returntrue.novelist.R;
import p028j.j;
import p028j.l;
import p028j.n;
import p028j.t;

/* JADX INFO: renamed from: k.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0228f extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3665l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0231i f3666m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228f(C0231i c0231i, Context context, j jVar, View view) {
        super(context, jVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f3666m = c0231i;
        this.f3481f = 8388613;
        i iVar = c0231i.f3699F;
        this.f3483h = iVar;
        l lVar = this.f3484i;
        if (lVar != null) {
            lVar.j(iVar);
        }
    }

    @Override // p028j.n
    public final void c() {
        switch (this.f3665l) {
            case 0:
                C0231i c0231i = this.f3666m;
                c0231i.f3696C = null;
                c0231i.getClass();
                super.c();
                break;
            default:
                C0231i c0231i2 = this.f3666m;
                j jVar = c0231i2.f3702m;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0231i2.f3695B = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228f(C0231i c0231i, Context context, t tVar, View view) {
        super(context, tVar, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f3666m = c0231i;
        if ((tVar.f3503w.x & 32) != 32) {
            View view2 = c0231i.f3706r;
            this.f3480e = view2 == null ? c0231i.f3705q : view2;
        }
        i iVar = c0231i.f3699F;
        this.f3483h = iVar;
        l lVar = this.f3484i;
        if (lVar != null) {
            lVar.j(iVar);
        }
    }
}
