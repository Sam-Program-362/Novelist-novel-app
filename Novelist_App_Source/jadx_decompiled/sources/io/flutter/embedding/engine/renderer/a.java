package io.flutter.embedding.engine.renderer;

import android.os.Build;
import java.util.Iterator;
import r1.AbstractActivityC0455b;
import r1.C0458e;
import r1.SurfaceHolderCallback2C0453C;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3039a;

    /* renamed from: b, reason: collision with root package name */
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
                C0458e c0458e = (C0458e) this.f3040b;
                c0458e.f4353a.getClass();
                c0458e.f4360h = false;
                break;
            case 2:
                r1.n nVar = (r1.n) this.f3040b;
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
                C0458e c0458e = (C0458e) this.f3040b;
                AbstractActivityC0455b abstractActivityC0455b = c0458e.f4353a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0455b.reportFullyDrawn();
                } else {
                    abstractActivityC0455b.getClass();
                }
                c0458e.f4360h = true;
                c0458e.f4361i = true;
                break;
            case 2:
                r1.n nVar = (r1.n) this.f3040b;
                nVar.f4405r = true;
                Iterator it2 = nVar.f4404q.iterator();
                while (it2.hasNext()) {
                    ((l) it2.next()).b();
                }
                break;
            default:
                SurfaceHolderCallback2C0453C surfaceHolderCallback2C0453C = (SurfaceHolderCallback2C0453C) this.f3040b;
                surfaceHolderCallback2C0453C.f4336a.setAlpha(1.0f);
                k kVar = surfaceHolderCallback2C0453C.f4337b;
                if (kVar != null) {
                    kVar.g(this);
                    break;
                }
                break;
        }
    }

    private final void c() {
    }
}
