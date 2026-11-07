package o;

import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends j implements Map {
    public a0 n;

    /* renamed from: o, reason: collision with root package name */
    public C0437b f4191o;

    /* renamed from: p, reason: collision with root package name */
    public C0439d f4192p;

    @Override // java.util.Map
    public final Set entrySet() {
        a0 a0Var = this.n;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(1, this);
        this.n = a0Var2;
        return a0Var2;
    }

    public final boolean i(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!super.containsKey(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i3 = this.f4209m;
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            super.remove(it2.next());
        }
        return i3 != this.f4209m;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0437b c0437b = this.f4191o;
        if (c0437b != null) {
            return c0437b;
        }
        C0437b c0437b2 = new C0437b(this);
        this.f4191o = c0437b2;
        return c0437b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f4209m;
        int i3 = this.f4209m;
        int[] iArr = this.f4207k;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            a2.h.d(copyOf, "copyOf(this, newSize)");
            this.f4207k = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4208l, size * 2);
            a2.h.d(copyOf2, "copyOf(this, newSize)");
            this.f4208l = copyOf2;
        }
        if (this.f4209m != i3) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0439d c0439d = this.f4192p;
        if (c0439d != null) {
            return c0439d;
        }
        C0439d c0439d2 = new C0439d(this);
        this.f4192p = c0439d2;
        return c0439d2;
    }
}
