package z0;

import O1.g;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import j0.ExecutorC0317c;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import r1.k;
import y0.InterfaceC0499a;

/* renamed from: z0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507d implements InterfaceC0499a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f4741a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f4742b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4743c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4744d = new LinkedHashMap();

    public C0507d(WindowLayoutComponent windowLayoutComponent) {
        this.f4741a = windowLayoutComponent;
    }

    @Override // y0.InterfaceC0499a
    public final void a(Context context, ExecutorC0317c executorC0317c, k kVar) {
        g gVar;
        LinkedHashMap linkedHashMap = this.f4743c;
        ReentrantLock reentrantLock = this.f4742b;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f4744d;
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
                this.f4741a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // y0.InterfaceC0499a
    public final void b(k kVar) {
        LinkedHashMap linkedHashMap = this.f4743c;
        LinkedHashMap linkedHashMap2 = this.f4744d;
        ReentrantLock reentrantLock = this.f4742b;
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
                    this.f4741a.removeWindowLayoutInfoListener(fVar);
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
