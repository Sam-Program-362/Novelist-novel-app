package D;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f236a;

    public C0006g(DisplayCutout displayCutout) {
        this.f236a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0006g.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f236a, ((C0006g) obj).f236a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f236a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f236a + "}";
    }
}
