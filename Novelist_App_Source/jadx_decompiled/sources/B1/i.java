package B1;

import android.os.HandlerThread;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import k1.C0369f;
import k1.C0370g;
import k1.InterfaceC0371h;

/* loaded from: classes.dex */
public final class i implements InterfaceC0371h {

    /* renamed from: a, reason: collision with root package name */
    public final int f93a;

    /* renamed from: b, reason: collision with root package name */
    public final int f94b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f95c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f96d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f97e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f98f;

    /* renamed from: g, reason: collision with root package name */
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

    @Override // k1.InterfaceC0371h
    public synchronized void a() {
        try {
            Iterator it2 = ((HashSet) this.f97e).iterator();
            while (it2.hasNext()) {
                C0370g c0370g = (C0370g) it2.next();
                synchronized (c0370g) {
                    HandlerThread handlerThread = c0370g.f3838c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        c0370g.f3838c = null;
                        c0370g.f3839d = null;
                    }
                }
            }
            Iterator it3 = ((HashSet) this.f98f).iterator();
            while (it3.hasNext()) {
                C0370g c0370g2 = (C0370g) it3.next();
                synchronized (c0370g2) {
                    HandlerThread handlerThread2 = c0370g2.f3838c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        c0370g2.f3838c = null;
                        c0370g2.f3839d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // k1.InterfaceC0371h
    public synchronized void b(C0369f c0369f) {
        ((LinkedList) this.f96d).add(c0369f);
        Iterator it2 = new HashSet((HashSet) this.f97e).iterator();
        while (it2.hasNext()) {
            e((C0370g) it2.next());
        }
    }

    public synchronized C0369f d(C0370g c0370g) {
        C0369f c0369f;
        C0370g c0370g2;
        try {
            ListIterator listIterator = ((LinkedList) this.f96d).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                c0369f = (C0369f) listIterator.next();
                c0370g2 = c0369f.a() != null ? (C0370g) ((HashMap) this.f99g).get(c0369f.a()) : null;
                if (c0370g2 == null) {
                    break;
                }
            } while (c0370g2 != c0370g);
            listIterator.remove();
            return c0369f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(C0370g c0370g) {
        try {
            C0369f d3 = d(c0370g);
            if (d3 != null) {
                ((HashSet) this.f98f).add(c0370g);
                ((HashSet) this.f97e).remove(c0370g);
                if (d3.a() != null) {
                    ((HashMap) this.f99g).put(d3.a(), c0370g);
                }
                c0370g.f3839d.post(new M.c(c0370g, d3, 15));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // k1.InterfaceC0371h
    public synchronized void start() {
        for (int i3 = 0; i3 < this.f93a; i3++) {
            C0370g c0370g = new C0370g(((String) this.f95c) + i3, this.f94b);
            c0370g.a(new M.c(this, c0370g, 16));
            ((HashSet) this.f97e).add(c0370g);
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
