package p042o;

import a2.h;
import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e extends j implements Map {
    public a0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f4191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f4192p;

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
        b bVar = this.f4191o;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f4191o = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f4209m;
        int i3 = this.f4209m;
        int[] iArr = this.f4207k;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            h.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f4207k = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4208l, size * 2);
            h.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4208l = objArrCopyOf;
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
        d dVar = this.f4192p;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f4192p = dVar2;
        return dVar2;
    }
}
