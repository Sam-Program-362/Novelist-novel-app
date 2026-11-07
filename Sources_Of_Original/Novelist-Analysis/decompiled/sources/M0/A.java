package M0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f903c;

    public A(String str, boolean z3) {
        r.d(str);
        this.f901a = str;
        r.d("com.google.android.gms");
        this.f902b = "com.google.android.gms";
        this.f903c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a3 = (A) obj;
        return r.i(this.f901a, a3.f901a) && r.i(this.f902b, a3.f902b) && r.i(null, null) && this.f903c == a3.f903c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f901a, this.f902b, null, 4225, Boolean.valueOf(this.f903c)});
    }

    public final String toString() {
        String str = this.f901a;
        if (str != null) {
            return str;
        }
        r.f(null);
        throw null;
    }
}
