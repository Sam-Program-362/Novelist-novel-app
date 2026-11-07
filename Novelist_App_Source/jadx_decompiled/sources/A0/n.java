package A0;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import j0.ExecutorC0317c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import y0.InterfaceC0499a;

/* loaded from: classes.dex */
public final class n implements InterfaceC0499a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile n f70c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f71d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final a f72a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f73b = new CopyOnWriteArrayList();

    public n(l lVar) {
        this.f72a = lVar;
        if (lVar != null) {
            lVar.d(new H0.i(this, 1));
        }
    }

    @Override // y0.InterfaceC0499a
    public final void a(Context context, ExecutorC0317c executorC0317c, r1.k kVar) {
        Object obj;
        WindowManager.LayoutParams attributes;
        O1.g gVar = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        P1.m mVar = P1.m.f1219k;
        if (activity != null) {
            ReentrantLock reentrantLock = f71d;
            reentrantLock.lock();
            try {
                a aVar = this.f72a;
                if (aVar == null) {
                    kVar.accept(new x0.j(mVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f73b;
                boolean z3 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (((m) it2.next()).f67a.equals(activity)) {
                            z3 = true;
                            break;
                        }
                    }
                }
                m mVar2 = new m(activity, executorC0317c, kVar);
                copyOnWriteArrayList.add(mVar2);
                if (z3) {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it3.next();
                            if (activity.equals(((m) obj).f67a)) {
                                break;
                            }
                        }
                    }
                    m mVar3 = (m) obj;
                    x0.j jVar = mVar3 != null ? mVar3.f69c : null;
                    if (jVar != null) {
                        mVar2.f69c = jVar;
                        mVar2.f68b.accept(jVar);
                    }
                } else {
                    l lVar = (l) aVar;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        lVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new k(lVar, activity));
                    }
                }
                reentrantLock.unlock();
                gVar = O1.g.f1211a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (gVar == null) {
            kVar.accept(new x0.j(mVar));
        }
    }

    @Override // y0.InterfaceC0499a
    public final void b(r1.k kVar) {
        synchronized (f71d) {
            try {
                if (this.f72a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f73b.iterator();
                while (it2.hasNext()) {
                    m mVar = (m) it2.next();
                    if (mVar.f68b == kVar) {
                        arrayList.add(mVar);
                    }
                }
                this.f73b.removeAll(arrayList);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    Activity activity = ((m) obj).f67a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f73b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((m) it3.next()).f67a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    a aVar = this.f72a;
                    if (aVar != null) {
                        ((l) aVar).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
