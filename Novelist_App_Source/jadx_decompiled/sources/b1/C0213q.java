package b1;

import java.util.NoSuchElementException;

/* renamed from: b1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213q extends AbstractC0222z {

    /* renamed from: l, reason: collision with root package name */
    public static final Object f2634l = new Object();

    /* renamed from: k, reason: collision with root package name */
    public Object f2635k;

    public C0213q(Object obj) {
        this.f2635k = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2635k != f2634l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f2635k;
        Object obj2 = f2634l;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f2635k = obj2;
        return obj;
    }
}
