package p003b0;

import A.c;
import P1.e;
import P1.k;
import a2.h;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: b0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0157l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f2480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2484e;

    public C0157l(ViewGroup viewGroup) {
        h.e(viewGroup, "container");
        this.f2480a = viewGroup;
        this.f2481b = new ArrayList();
        this.f2482c = new ArrayList();
    }

    public final void a(U u) {
        h.e(u, "operation");
        if (u.f2435b) {
            throw null;
        }
    }

    public final void b(ArrayList arrayList, boolean z3) {
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((U) it2.next()).getClass();
            throw null;
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (listIterator.hasPrevious()) {
            ((U) listIterator.previous()).getClass();
            throw null;
        }
        if (I.J(2)) {
            Log.v("FragmentManager", "Executing operations from " + ((Object) null) + " to " + ((Object) null));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        ((U) arrayList.get(arrayList.size() - 1)).getClass();
        if (arrayList.size() > 0) {
            ((U) arrayList.get(0)).getClass();
            throw null;
        }
        if (arrayList.size() > 0) {
            U u = (U) arrayList.get(0);
            arrayList2.add(new C0151f(u, z3));
            u.getClass();
            new C0156k(u);
            if (!z3) {
                throw null;
            }
            throw null;
        }
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList3.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList3.get(i3);
            i3++;
            if (!((C0156k) obj).t()) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList4.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList4.get(i4);
            i4++;
            ((C0156k) obj2).getClass();
        }
        int size3 = arrayList5.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList5.get(i5);
            i5++;
            ((C0156k) obj3).getClass();
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        if (arrayList2.size() > 0) {
            ((C0151f) arrayList2.get(0)).getClass();
            throw null;
        }
        arrayList7.isEmpty();
        int size4 = arrayList2.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayList2.get(i6);
            i6++;
            C0151f c0151f = (C0151f) obj4;
            Context context = this.f2480a.getContext();
            c0151f.getClass();
            h.d(context, "context");
            c cVarS = c0151f.S(context);
            if (cVarS != null) {
                if (((AnimatorSet) cVarS.f7m) != null) {
                    throw null;
                }
                arrayList6.add(c0151f);
            }
        }
        if (arrayList6.size() <= 0) {
            return;
        }
        ((C0151f) arrayList6.get(0)).getClass();
        throw null;
    }

    public final void c() {
        if (this.f2484e) {
            return;
        }
        int i3 = 0;
        if (!this.f2480a.isAttachedToWindow()) {
            d();
            this.f2483d = false;
            return;
        }
        synchronized (this.f2481b) {
            try {
                if (this.f2481b.isEmpty()) {
                    ArrayList arrayListM0 = e.m0(this.f2482c);
                    this.f2482c.clear();
                    int size = arrayListM0.size();
                    while (i3 < size) {
                        Object obj = arrayListM0.get(i3);
                        i3++;
                        U u = (U) obj;
                        if (I.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u + " with no incoming pendingOperations");
                        }
                        ViewGroup viewGroup = this.f2480a;
                        u.getClass();
                        h.e(viewGroup, "container");
                        u.a(viewGroup);
                        this.f2482c.add(u);
                    }
                } else {
                    ArrayList arrayListM1 = e.m0(this.f2482c);
                    this.f2482c.clear();
                    if (arrayListM1.size() > 0) {
                        U u3 = (U) arrayListM1.get(0);
                        if (I.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u3);
                        }
                        u3.getClass();
                        throw null;
                    }
                    f();
                    ArrayList arrayListM2 = e.m0(this.f2481b);
                    if (arrayListM2.isEmpty()) {
                        return;
                    }
                    this.f2481b.clear();
                    this.f2482c.addAll(arrayListM2);
                    if (I.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListM2, this.f2483d);
                    if (arrayListM2.size() > 0) {
                        ((U) arrayListM2.get(0)).getClass();
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size2 = arrayListM2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayListM2.get(i4);
                        i4++;
                        ((U) obj2).getClass();
                        k.f0(arrayList, null);
                    }
                    if (!arrayList.isEmpty()) {
                        e(arrayListM2);
                        int size3 = arrayListM2.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            a((U) arrayListM2.get(i5));
                        }
                    }
                    this.f2483d = false;
                    if (I.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str;
        String str2;
        if (I.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f2480a.isAttachedToWindow();
        synchronized (this.f2481b) {
            try {
                f();
                e(this.f2481b);
                ArrayList arrayListM0 = e.m0(this.f2482c);
                int size = arrayListM0.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayListM0.get(i4);
                    i4++;
                    U u = (U) obj;
                    if (I.J(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = StringUtils.EMPTY;
                        } else {
                            str2 = "Container " + this.f2480a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + u);
                    }
                    u.a(this.f2480a);
                }
                ArrayList arrayListM1 = e.m0(this.f2481b);
                int size2 = arrayListM1.size();
                while (i3 < size2) {
                    Object obj2 = arrayListM1.get(i3);
                    i3++;
                    U u3 = (U) obj2;
                    if (I.J(2)) {
                        if (zIsAttachedToWindow) {
                            str = StringUtils.EMPTY;
                        } else {
                            str = "Container " + this.f2480a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + u3);
                    }
                    u3.a(this.f2480a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(List list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            U u = (U) list.get(i3);
            u.getClass();
            if (!u.f2434a) {
                u.f2434a = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((U) it2.next()).getClass();
            k.f0(arrayList, null);
        }
        List listL0 = e.l0(e.n0(arrayList));
        int size2 = listL0.size();
        for (int i4 = 0; i4 < size2; i4++) {
            T t3 = (T) listL0.get(i4);
            t3.getClass();
            ViewGroup viewGroup = this.f2480a;
            h.e(viewGroup, "container");
            if (!t3.f2433a) {
                t3.c(viewGroup);
            }
            t3.f2433a = true;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f2481b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((U) obj).getClass();
        }
    }
}
