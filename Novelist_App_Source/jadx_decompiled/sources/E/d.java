package E;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f277c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f278d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f279e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f280f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f281a;

    /* renamed from: b, reason: collision with root package name */
    public final int f282b;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0203, code lost:
    
        if ((r4 < 36 ? r4 * 100000 : android.os.Build.VERSION.SDK_INT_FULL) >= 3600001) goto L67;
     */
    static {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E.d.<clinit>():void");
    }

    public d(Object obj, int i3, Class cls) {
        this.f282b = i3;
        if (obj == null) {
            this.f281a = new AccessibilityNodeInfo.AccessibilityAction(i3, null);
        } else {
            this.f281a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f281a;
        Object obj3 = this.f281a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f281a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String b3 = h.b(this.f282b);
        if (b3.equals("ACTION_UNKNOWN")) {
            Object obj = this.f281a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                b3 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(b3);
        return sb.toString();
    }
}
