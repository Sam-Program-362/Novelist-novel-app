package p004b1;

import B1.e;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class T extends V {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2603k;

    public T(String str) {
        this.f2603k = str;
    }

    @Override // p004b1.V
    public final int a() {
        return V.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        V v3 = (V) obj;
        int iA = v3.a();
        int iD = V.d((byte) 96);
        if (iD != iA) {
            return iD - v3.a();
        }
        String str = ((T) v3).f2603k;
        int length = str.length();
        String str2 = this.f2603k;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && T.class == obj.getClass()) {
            return this.f2603k.equals(((T) obj).f2603k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(V.d((byte) 96)), this.f2603k});
    }

    public final String toString() {
        return e.m(new StringBuilder("\""), this.f2603k, "\"");
    }
}
