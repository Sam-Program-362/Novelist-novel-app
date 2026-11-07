package p003b0;

import android.util.Log;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class L extends P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final K f2399h = new K(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2403e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2400b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2401c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2402d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2404f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2405g = false;

    public L(boolean z3) {
        this.f2403e = z3;
    }

    @Override // androidx.lifecycle.P
    public final void b() {
        if (I.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2404f = true;
    }

    public final void c(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        if (I.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0163s);
        }
        e(abstractComponentCallbacksC0163s.f2542o, z3);
    }

    public final void d(String str, boolean z3) {
        if (I.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z3);
    }

    public final void e(String str, boolean z3) {
        HashMap map = this.f2401c;
        L l3 = (L) map.get(str);
        if (l3 != null) {
            if (z3) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l3.f2401c.keySet());
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    l3.d((String) obj, true);
                }
            }
            l3.b();
            map.remove(str);
        }
        HashMap map2 = this.f2402d;
        S s3 = (S) map2.get(str);
        if (s3 != null) {
            s3.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L.class == obj.getClass()) {
            L l3 = (L) obj;
            if (this.f2400b.equals(l3.f2400b) && this.f2401c.equals(l3.f2401c) && this.f2402d.equals(l3.f2402d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (this.f2405g) {
            if (I.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2400b.remove(abstractComponentCallbacksC0163s.f2542o) == null || !I.J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0163s);
        }
    }

    public final int hashCode() {
        return this.f2402d.hashCode() + ((this.f2401c.hashCode() + (this.f2400b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it2 = this.f2400b.values().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it3 = this.f2401c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it4 = this.f2402d.keySet().iterator();
        while (it4.hasNext()) {
            sb.append((String) it4.next());
            if (it4.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
