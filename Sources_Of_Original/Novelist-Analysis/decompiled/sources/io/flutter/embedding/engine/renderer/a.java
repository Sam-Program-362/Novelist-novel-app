package io.flutter.embedding.engine.renderer;

import android.os.Build;
import java.util.Iterator;
import p052r1.AbstractActivityC0262b;
import p052r1.C;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3040b;

    public /* synthetic */ a(Object obj, int i3) {
        this.f3039a = i3;
        this.f3040b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
        switch (this.f3039a) {
            case 0:
                ((k) this.f3040b).f3086d = false;
                break;
            case 1:
                p052r1.e eVar = (p052r1.e) this.f3040b;
                eVar.f4353a.getClass();
                eVar.f4360h = false;
                break;
            case 2:
                p052r1.n nVar = (p052r1.n) this.f3040b;
                nVar.f4405r = false;
                Iterator it2 = nVar.f4404q.iterator();
                while (it2.hasNext()) {
                    ((l) it2.next()).a();
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        switch (this.f3039a) {
            case 0:
                ((k) this.f3040b).f3086d = true;
                break;
            case 1:
                p052r1.e eVar = (p052r1.e) this.f3040b;
                AbstractActivityC0262b abstractActivityC0262b = eVar.f4353a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0262b.reportFullyDrawn();
                } else {
                    abstractActivityC0262b.getClass();
                }
                eVar.f4360h = true;
                eVar.f4361i = true;
                break;
            case 2:
                p052r1.n nVar = (p052r1.n) this.f3040b;
                nVar.f4405r = true;
                Iterator it2 = nVar.f4404q.iterator();
                while (it2.hasNext()) {
                    ((l) it2.next()).b();
                }
                break;
            default:
                C c3 = (C) this.f3040b;
                c3.f4336a.setAlpha(1.0f);
                k kVar = c3.f4337b;
                if (kVar != null) {
                    kVar.g(this);
                }
                break;
        }
    }

    private final void c() {
    }
}
