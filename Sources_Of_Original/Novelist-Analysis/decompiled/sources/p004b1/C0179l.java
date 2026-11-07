package p004b1;

import java.util.Comparator;

/* JADX INFO: renamed from: b1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0179l implements Comparator {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2628k;

    public /* synthetic */ C0179l(int i3) {
        this.f2628k = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return 1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r5.f2628k
            switch(r0) {
                case 0: goto L3c;
                default: goto L5;
            }
        L5:
            l0.i r6 = (p035l0.C0256i) r6
            l0.i r7 = (p035l0.C0256i) r7
            androidx.recyclerview.widget.RecyclerView r0 = r6.f3997d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r1
        L12:
            androidx.recyclerview.widget.RecyclerView r4 = r7.f3997d
            if (r4 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r1
        L19:
            if (r3 == r4) goto L1e
            if (r0 != 0) goto L26
            goto L28
        L1e:
            boolean r0 = r6.f3994a
            boolean r3 = r7.f3994a
            if (r0 == r3) goto L2a
            if (r0 == 0) goto L28
        L26:
            r1 = -1
            goto L3b
        L28:
            r1 = r2
            goto L3b
        L2a:
            int r0 = r7.f3995b
            int r2 = r6.f3995b
            int r0 = r0 - r2
            if (r0 == 0) goto L33
            r1 = r0
            goto L3b
        L33:
            int r6 = r6.f3996c
            int r7 = r7.f3996c
            int r6 = r6 - r7
            if (r6 == 0) goto L3b
            r1 = r6
        L3b:
            return r1
        L3c:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.util.Objects.requireNonNull(r6)
            java.util.Objects.requireNonNull(r7)
            java.lang.Object r6 = r6.getKey()
            java.lang.Object r7 = r7.getKey()
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            r6.getClass()
            r7.getClass()
            int r6 = r6.compareTo(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p004b1.C0179l.compare(java.lang.Object, java.lang.Object):int");
    }
}
