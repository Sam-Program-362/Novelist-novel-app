package p069z0;

import O1.g;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import p029j0.c;
import p052r1.k;
import p066y0.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f4741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f4742b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f4743c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4744d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f4741a = windowLayoutComponent;
    }

    @Override // p066y0.a
    public final void a(Context context, c cVar, k kVar) {
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
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p066y0.a
    public final void b(k kVar) {
        LinkedHashMap linkedHashMap = this.f4743c;
        LinkedHashMap linkedHashMap2 = this.f4744d;
        ReentrantLock reentrantLock = this.f4742b;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(kVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            f fVar = (f) linkedHashMap.get(context);
            if (fVar == null) {
                reentrantLock.unlock();
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
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
