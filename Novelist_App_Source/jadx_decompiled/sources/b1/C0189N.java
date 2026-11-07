package b1;

import java.util.Arrays;
import t.AbstractC0468a;

/* renamed from: b1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189N extends AbstractC0196V {

    /* renamed from: k, reason: collision with root package name */
    public final C0185J f2596k;

    public C0189N(C0185J c0185j) {
        this.f2596k = c0185j;
    }

    @Override // b1.AbstractC0196V
    public final int a() {
        return AbstractC0196V.d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC0196V abstractC0196V = (AbstractC0196V) obj;
        int a3 = abstractC0196V.a();
        int d3 = AbstractC0196V.d((byte) 64);
        if (d3 != a3) {
            return d3 - abstractC0196V.a();
        }
        C0185J c0185j = ((C0189N) abstractC0196V).f2596k;
        C0185J c0185j2 = this.f2596k;
        byte[] bArr = c0185j2.f2591l;
        int length = bArr.length;
        byte[] bArr2 = c0185j.f2591l;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return AbstractC0182G.f2586a.compare(c0185j2.j(), c0185j.j());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0189N.class == obj.getClass()) {
            return this.f2596k.equals(((C0189N) obj).f2596k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC0196V.d((byte) 64)), this.f2596k});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        C0176A c0176a;
        int i3;
        boolean z3;
        C0177B c0177b = C0179D.f2579d;
        C0179D c0179d = c0177b.f2582c;
        if (c0179d == null) {
            C0176A c0176a2 = c0177b.f2580a;
            char[] cArr = c0176a2.f2571b;
            int i4 = 0;
            while (true) {
                if (i4 >= cArr.length) {
                    c0176a = c0176a2;
                    break;
                }
                char c3 = cArr[i4];
                if (c3 < 'a' || c3 > 'z') {
                    i4++;
                } else {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= cArr.length) {
                            z3 = false;
                            break;
                        }
                        char c4 = cArr[i5];
                        if (c4 >= 'A' && c4 <= 'Z') {
                            z3 = true;
                            break;
                        }
                        i5++;
                    }
                    if (z3) {
                        throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i6 = 0; i6 < cArr.length; i6++) {
                        char c5 = cArr[i6];
                        if (c5 >= 97 && c5 <= 122) {
                            c5 ^= 32;
                        }
                        cArr2[i6] = (char) c5;
                    }
                    c0176a = new C0176A(c0176a2.f2570a.concat(".upperCase()"), cArr2);
                    byte[] bArr = c0176a.f2576g;
                    if (c0176a2.f2577h && !c0176a.f2577h) {
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i3 = 65; i3 <= 90; i3++) {
                            int i7 = i3 | 32;
                            byte b3 = bArr[i3];
                            byte b4 = bArr[i7];
                            if (b3 == -1) {
                                copyOf[i3] = b4;
                            } else {
                                char c6 = (char) i3;
                                char c7 = (char) i7;
                                if (b4 != -1) {
                                    throw new IllegalStateException(AbstractC0197a.d("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c6), Character.valueOf(c7)));
                                }
                                copyOf[i7] = b3;
                            }
                        }
                        c0176a = new C0176A(c0176a.f2570a.concat(".ignoreCase()"), c0176a.f2571b, copyOf, true);
                    }
                }
            }
            c0179d = c0176a == c0176a2 ? c0177b : new C0177B(c0176a);
            c0177b.f2582c = c0179d;
        }
        byte[] j3 = this.f2596k.j();
        return AbstractC0468a.b("h'", c0179d.c(j3, j3.length), "'");
    }
}
