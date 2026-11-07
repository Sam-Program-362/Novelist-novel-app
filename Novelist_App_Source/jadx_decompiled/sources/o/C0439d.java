package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439d implements Collection {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f4190k;

    public C0439d(e eVar) {
        this.f4190k = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f4190k.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4190k.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4190k.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0436a(this.f4190k, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f4190k;
        int a3 = eVar.a(obj);
        if (a3 < 0) {
            return false;
        }
        eVar.f(a3);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f4190k;
        int i3 = eVar.f4209m;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i3) {
            if (collection.contains(eVar.h(i4))) {
                eVar.f(i4);
                i4--;
                i3--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f4190k;
        int i3 = eVar.f4209m;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i3) {
            if (!collection.contains(eVar.h(i4))) {
                eVar.f(i4);
                i4--;
                i3--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4190k.f4209m;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f4190k;
        int i3 = eVar.f4209m;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = eVar.h(i4);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f4190k;
        int i3 = eVar.f4209m;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = eVar.h(i4);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
