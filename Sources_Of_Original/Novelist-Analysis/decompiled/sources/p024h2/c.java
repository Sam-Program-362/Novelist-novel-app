package p024h2;

import b2.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2911m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2912o;

    public c(String str) {
        this.f2909k = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        int i4;
        int i5 = this.f2910l;
        if (i5 != 0) {
            return i5 == 1;
        }
        if (this.f2912o < 0) {
            this.f2910l = 2;
            return false;
        }
        String str = this.f2909k;
        int length = str.length();
        int length2 = str.length();
        for (int i6 = this.f2911m; i6 < length2; i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i3 = (cCharAt == '\r' && (i4 = i6 + 1) < str.length() && str.charAt(i4) == '\n') ? 2 : 1;
                length = i6;
                this.f2910l = 1;
                this.f2912o = i3;
                this.n = length;
                return true;
            }
        }
        i3 = -1;
        this.f2910l = 1;
        this.f2912o = i3;
        this.n = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2910l = 0;
        int i3 = this.n;
        int i4 = this.f2911m;
        this.f2911m = this.f2912o + i3;
        return this.f2909k.subSequence(i4, i3).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
