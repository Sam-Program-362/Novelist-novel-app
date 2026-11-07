package b1;

import java.util.Arrays;

/* renamed from: b1.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194T extends AbstractC0196V {

    /* renamed from: k, reason: collision with root package name */
    public final String f2603k;

    public C0194T(String str) {
        this.f2603k = str;
    }

    @Override // b1.AbstractC0196V
    public final int a() {
        return AbstractC0196V.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC0196V abstractC0196V = (AbstractC0196V) obj;
        int a3 = abstractC0196V.a();
        int d3 = AbstractC0196V.d((byte) 96);
        if (d3 != a3) {
            return d3 - abstractC0196V.a();
        }
        String str = ((C0194T) abstractC0196V).f2603k;
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
        if (obj != null && C0194T.class == obj.getClass()) {
            return this.f2603k.equals(((C0194T) obj).f2603k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC0196V.d((byte) 96)), this.f2603k});
    }

    public final String toString() {
        return B1.e.m(new StringBuilder("\""), this.f2603k, "\"");
    }
}
