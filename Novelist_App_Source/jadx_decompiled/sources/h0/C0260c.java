package h0;

import P1.m;
import java.util.List;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260c {

    /* renamed from: a, reason: collision with root package name */
    public final List f2864a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2865b;

    public C0260c(int i3, List list) {
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
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i3 + "', bounds = '" + P1.f.c0(list) + "'.").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0260c.class != obj.getClass()) {
            return false;
        }
        C0260c c0260c = (C0260c) obj;
        return this.f2865b == c0260c.f2865b && a2.h.a(this.f2864a, c0260c.f2864a);
    }

    public final int hashCode() {
        return this.f2864a.hashCode() + (this.f2865b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f2865b + ", mergedHistory=" + this.f2864a + ')';
    }

    public C0260c() {
        this(-1, m.f1219k);
    }
}
