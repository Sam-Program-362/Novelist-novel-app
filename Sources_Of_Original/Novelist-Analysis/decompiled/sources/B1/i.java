package B1;

import android.os.HandlerThread;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p033k1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f95c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f96d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f97e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Serializable f98f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Serializable f99g;

    public i(int i3, int i4) {
        this.f96d = new LinkedList();
        this.f97e = new HashSet();
        this.f98f = new HashSet();
        this.f99g = new HashMap();
        this.f95c = "Sqflite";
        this.f93a = i3;
        this.f94b = i4;
    }

    @Override // p033k1.h
    public synchronized void a() {
        try {
            for (p033k1.g gVar : (HashSet) this.f97e) {
                synchronized (gVar) {
                    HandlerThread handlerThread = gVar.f3838c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        gVar.f3838c = null;
                        gVar.f3839d = null;
                    }
                }
            }
            for (p033k1.g gVar2 : (HashSet) this.f98f) {
                synchronized (gVar2) {
                    HandlerThread handlerThread2 = gVar2.f3838c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        gVar2.f3838c = null;
                        gVar2.f3839d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p033k1.h
    public synchronized void b(p033k1.f fVar) {
        ((LinkedList) this.f96d).add(fVar);
        Iterator it2 = new HashSet((HashSet) this.f97e).iterator();
        while (it2.hasNext()) {
            e((p033k1.g) it2.next());
        }
    }

    public synchronized p033k1.f d(p033k1.g gVar) {
        p033k1.f fVar;
        p033k1.g gVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f96d).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                fVar = (p033k1.f) listIterator.next();
                gVar2 = fVar.a() != null ? (p033k1.g) ((HashMap) this.f99g).get(fVar.a()) : null;
                if (gVar2 == null) {
                    break;
                }
            } while (gVar2 != gVar);
            listIterator.remove();
            return fVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(p033k1.g gVar) {
        try {
            p033k1.f fVarD = d(gVar);
            if (fVarD != null) {
                ((HashSet) this.f98f).add(gVar);
                ((HashSet) this.f97e).remove(gVar);
                if (fVarD.a() != null) {
                    ((HashMap) this.f99g).put(fVarD.a(), gVar);
                }
                gVar.f3839d.post(new M.c(gVar, fVarD, 15));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p033k1.h
    public synchronized void start() {
        for (int i3 = 0; i3 < this.f93a; i3++) {
            p033k1.g gVar = new p033k1.g(((String) this.f95c) + i3, this.f94b);
            gVar.a(new M.c(this, gVar, 16));
            ((HashSet) this.f97e).add(gVar);
        }
    }

    public i(Integer num, int i3, Boolean bool, Integer num2, int i4, Integer num3, Boolean bool2) {
        this.f95c = num;
        this.f93a = i3;
        this.f98f = bool;
        this.f96d = num2;
        this.f94b = i4;
        this.f97e = num3;
        this.f99g = bool2;
    }
}
