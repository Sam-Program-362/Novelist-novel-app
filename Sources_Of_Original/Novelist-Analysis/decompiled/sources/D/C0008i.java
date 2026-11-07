package D;

import java.util.Objects;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: D.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0008i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0007h f242a;

    static {
        new C0008i(0, StringUtils.EMPTY, 0);
    }

    public C0008i(int i3, String str, int i4) {
        this.f242a = new C0007h(i3, str, i4);
    }

    public static C0008i a(int i3, int i4, boolean z3, int i5, int i6, int i7, int i8) {
        String string;
        if (z3) {
            int i9 = i3 / 2;
            int i10 = i4 / 2;
            string = "M0," + i10 + " A" + i9 + "," + i10 + " 0 1,1 " + i3 + "," + i10 + " A" + i9 + "," + i10 + " 0 1,1 0," + i10 + " Z";
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i3 / 2, i4 / 2);
            int iMin2 = Math.min(iMin, i5);
            int iMin3 = Math.min(iMin, i6);
            int iMin4 = Math.min(iMin, i7);
            int iMin5 = Math.min(iMin, i8);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i3 - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                sb.append(" A ");
                sb.append(iMin3);
                sb.append(",");
                sb.append(iMin3);
                sb.append(" 0 0,1 ");
                sb.append(i3);
                sb.append(",");
                sb.append(iMin3);
            }
            sb.append(" L ");
            sb.append(i3);
            sb.append(",");
            sb.append(i4 - iMin4);
            if (iMin4 > 0) {
                sb.append(" A ");
                sb.append(iMin4);
                sb.append(",");
                sb.append(iMin4);
                sb.append(" 0 0,1 ");
                sb.append(i3 - iMin4);
                sb.append(",");
                sb.append(i4);
            }
            sb.append(" L ");
            sb.append(iMin5);
            sb.append(",");
            sb.append(i4);
            if (iMin5 > 0) {
                sb.append(" A ");
                sb.append(iMin5);
                sb.append(",");
                sb.append(iMin5);
                sb.append(" 0 0,1 0,");
                sb.append(i4 - iMin5);
            }
            if (iMin2 > 0) {
                sb.append(" L 0,");
                sb.append(iMin2);
                sb.append(" A ");
                sb.append(iMin2);
                sb.append(",");
                sb.append(iMin2);
                sb.append(" 0 0,1 ");
                sb.append(iMin2);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new C0008i(i3, string, i4);
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
