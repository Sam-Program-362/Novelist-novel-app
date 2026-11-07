package z0;

import O1.g;
import P1.m;
import a2.p;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import j0.ExecutorC0317c;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import r1.k;
import t0.C0472a;
import y0.InterfaceC0499a;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506c implements InterfaceC0499a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f4735a;

    /* renamed from: b, reason: collision with root package name */
    public final C0472a f4736b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f4737c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4738d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f4739e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f4740f = new LinkedHashMap();

    public C0506c(WindowLayoutComponent windowLayoutComponent, C0472a c0472a) {
        this.f4735a = windowLayoutComponent;
        this.f4736b = c0472a;
    }

    @Override // y0.InterfaceC0499a
    public final void a(Context context, ExecutorC0317c executorC0317c, k kVar) {
        g gVar;
        LinkedHashMap linkedHashMap = this.f4738d;
        ReentrantLock reentrantLock = this.f4737c;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f4739e;
            if (fVar != null) {
                fVar.b(kVar);
                linkedHashMap2.put(kVar, context);
                gVar = g.f1211a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(kVar, context);
                fVar2.b(kVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(m.f1219k));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f4740f.put(fVar2, this.f4736b.a(this.f4735a, p.a(WindowLayoutInfo.class), (Activity) context, new C0505b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0, 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // y0.InterfaceC0499a
    public final void b(k kVar) {
        LinkedHashMap linkedHashMap = this.f4738d;
        LinkedHashMap linkedHashMap2 = this.f4739e;
        ReentrantLock reentrantLock = this.f4737c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(kVar);
            if (context == null) {
                return;
            }
            f fVar = (f) linkedHashMap.get(context);
            if (fVar == null) {
                return;
            }
            LinkedHashSet linkedHashSet = fVar.f4748d;
            ReentrantLock reentrantLock2 = fVar.f4746b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(kVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(kVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    u0.d dVar = (u0.d) this.f4740f.remove(fVar);
                    if (dVar != null) {
                        dVar.f4591a.invoke(dVar.f4592b, dVar.f4593c);
                    }
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
