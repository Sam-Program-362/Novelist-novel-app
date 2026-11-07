package D;

import java.util.Objects;
import org.apache.tika.utils.StringUtils;

/* renamed from: D.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008i {

    /* renamed from: a, reason: collision with root package name */
    public final C0007h f242a;

    static {
        new C0008i(0, StringUtils.EMPTY, 0);
    }

    public C0008i(int i3, String str, int i4) {
        this.f242a = new C0007h(i3, str, i4);
    }

    public static C0008i a(int i3, int i4, boolean z3, int i5, int i6, int i7, int i8) {
        String sb;
        if (z3) {
            int i9 = i3 / 2;
            int i10 = i4 / 2;
            sb = "M0," + i10 + " A" + i9 + "," + i10 + " 0 1,1 " + i3 + "," + i10 + " A" + i9 + "," + i10 + " 0 1,1 0," + i10 + " Z";
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i3 / 2, i4 / 2);
            int min2 = Math.min(min, i5);
            int min3 = Math.min(min, i6);
            int min4 = Math.min(min, i7);
            int min5 = Math.min(min, i8);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i3 - min3);
            sb2.append(",0");
            if (min3 > 0) {
                sb2.append(" A ");
                sb2.append(min3);
                sb2.append(",");
                sb2.append(min3);
                sb2.append(" 0 0,1 ");
                sb2.append(i3);
                sb2.append(",");
                sb2.append(min3);
            }
            sb2.append(" L ");
            sb2.append(i3);
            sb2.append(",");
            sb2.append(i4 - min4);
            if (min4 > 0) {
                sb2.append(" A ");
                sb2.append(min4);
                sb2.append(",");
                sb2.append(min4);
                sb2.append(" 0 0,1 ");
                sb2.append(i3 - min4);
                sb2.append(",");
                sb2.append(i4);
            }
            sb2.append(" L ");
            sb2.append(min5);
            sb2.append(",");
            sb2.append(i4);
            if (min5 > 0) {
                sb2.append(" A ");
                sb2.append(min5);
                sb2.append(",");
                sb2.append(min5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i4 - min5);
            }
            if (min2 > 0) {
                sb2.append(" L 0,");
                sb2.append(min2);
                sb2.append(" A ");
                sb2.append(min2);
                sb2.append(",");
                sb2.append(min2);
                sb2.append(" 0 0,1 ");
                sb2.append(min2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new C0008i(i3, sb, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0008i) {
            return Objects.equals(this.f242a, ((C0008i) obj).f242a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f242a);
    }

    public final String toString() {
        return this.f242a.toString();
    }
}
