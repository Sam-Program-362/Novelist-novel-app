package D;

import java.util.Objects;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h {

    /* renamed from: a, reason: collision with root package name */
    public final String f237a;

    /* renamed from: b, reason: collision with root package name */
    public final int f238b;

    /* renamed from: c, reason: collision with root package name */
    public final int f239c;

    public C0007h(int i3, String str, int i4) {
        this.f237a = str;
        this.f238b = i3;
        this.f239c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0007h)) {
            return false;
        }
        C0007h c0007h = (C0007h) obj;
        return Objects.equals(this.f237a, c0007h.f237a) && this.f238b == c0007h.f238b && this.f239c == c0007h.f239c;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f238b);
        Integer valueOf2 = Integer.valueOf(this.f239c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.f237a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f237a;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb.append(" displayWidth=");
        sb.append(this.f238b);
        sb.append(" displayHeight=");
        sb.append(this.f239c);
        sb.append(" physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
        return sb.toString();
    }
}
