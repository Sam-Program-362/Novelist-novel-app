package A0;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class n implements p066y0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile n f70c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f71d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f72a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f73b = new CopyOnWriteArrayList();

    public n(l lVar) {
        this.f72a = lVar;
        if (lVar != null) {
            lVar.d(new H0.i(this, 1));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p066y0.a
    public final void a(Context context, p029j0.c cVar, p052r1.k kVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        O1.g gVar = null;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        P1.m mVar = P1.m.f1219k;
        if (activity != null) {
            ReentrantLock reentrantLock = f71d;
            reentrantLock.lock();
            try {
                a aVar = this.f72a;
                if (aVar == null) {
                    kVar.accept(new p064x0.j(mVar));
                    reentrantLock.unlock();
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f73b;
                boolean z3 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        if (((m) it2.next()).f67a.equals(activity)) {
                            z3 = true;
                            break;
                        }
                    }
                }
                m mVar2 = new m(activity, cVar, kVar);
                copyOnWriteArrayList.add(mVar2);
                if (z3) {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!activity.equals(((m) next).f67a));
                    m mVar3 = (m) next;
                    p064x0.j jVar = mVar3 != null ? mVar3.f69c : null;
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
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (gVar == null) {
            kVar.accept(new p064x0.j(mVar));
        }
    }

    @Override // p066y0.a
    public final void b(p052r1.k kVar) {
        synchronized (f71d) {
            try {
                if (this.f72a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (m mVar : this.f73b) {
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
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((m) it2.next()).f67a.equals(activity)) {
                                }
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
