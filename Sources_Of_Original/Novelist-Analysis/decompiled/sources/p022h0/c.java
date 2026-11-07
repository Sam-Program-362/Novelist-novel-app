package p022h0;

import P1.f;
import P1.m;
import a2.h;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2865b;

    public c(int i3, List list) {
        this.f2864a = list;
        this.f2865b = i3;
        if (list.isEmpty() && i3 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i3 >= 0 && i3 < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i3 + "', bounds = '" + f.c0(list) + "'.").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2865b == cVar.f2865b && h.a(this.f2864a, cVar.f2864a);
    }

    public final int hashCode() {
        return this.f2864a.hashCode() + (this.f2865b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f2865b + ", mergedHistory=" + this.f2864a + ')';
    }

    public c() {
        this(-1, m.f1219k);
    }
}
