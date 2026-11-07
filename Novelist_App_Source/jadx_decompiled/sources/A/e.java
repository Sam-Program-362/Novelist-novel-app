package A;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public String f9a;

    /* renamed from: b, reason: collision with root package name */
    public String f10b;

    /* renamed from: c, reason: collision with root package name */
    public List f11c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f9a, eVar.f9a) && Objects.equals(this.f10b, eVar.f10b) && Objects.equals(this.f11c, eVar.f11c);
    }

    public final int hashCode() {
        return Objects.hash(this.f9a, this.f10b, this.f11c);
    }
}
