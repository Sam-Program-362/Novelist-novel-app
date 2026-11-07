package p004b1;

import java.util.Arrays;
import p055t.a;

/* JADX INFO: loaded from: classes.dex */
public final class N extends V {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J f2596k;

    public N(J j3) {
        this.f2596k = j3;
    }

    @Override // p004b1.V
    public final int a() {
        return V.d((byte) 64);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        V v3 = (V) obj;
        int iA = v3.a();
        int iD = V.d((byte) 64);
        if (iD != iA) {
            return iD - v3.a();
        }
        J j3 = ((N) v3).f2596k;
        J j4 = this.f2596k;
        byte[] bArr = j4.f2591l;
        int length = bArr.length;
        byte[] bArr2 = j3.f2591l;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return G.f2586a.compare(j4.j(), j3.j());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N.class == obj.getClass()) {
            return this.f2596k.equals(((N) obj).f2596k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(V.d((byte) 64)), this.f2596k});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        A a3;
        int i3;
        boolean z3;
        B b3 = D.f2579d;
        D b4 = b3.f2582c;
        if (b4 == null) {
            A a4 = b3.f2580a;
            char[] cArr = a4.f2571b;
            int i4 = 0;
            while (true) {
                if (i4 >= cArr.length) {
                    a3 = a4;
                    break;
                }
                char c3 = cArr[i4];
                if (c3 >= 'a' && c3 <= 'z') {
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
                    if (!z3) {
                        char[] cArr2 = new char[cArr.length];
                        for (int i6 = 0; i6 < cArr.length; i6++) {
                            char c5 = cArr[i6];
                            if (c5 >= 97 && c5 <= 122) {
                                c5 ^= 32;
                            }
                            cArr2[i6] = (char) c5;
                        }
                        a3 = new A(a4.f2570a.concat(".upperCase()"), cArr2);
                        byte[] bArr = a3.f2576g;
                        if (!a4.f2577h || a3.f2577h) {
                            break;
                            break;
                        }
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i3 = 65; i3 <= 90; i3++) {
                            int i7 = i3 | 32;
                            byte b5 = bArr[i3];
                            byte b6 = bArr[i7];
                            if (b5 == -1) {
                                bArrCopyOf[i3] = b6;
                            } else {
                                char c6 = (char) i3;
                                char c7 = (char) i7;
                                if (b6 != -1) {
                                    throw new IllegalStateException(AbstractC0168a.d("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c6), Character.valueOf(c7)));
                                }
                                bArrCopyOf[i7] = b5;
                            }
                        }
                        a3 = new A(a3.f2570a.concat(".ignoreCase()"), a3.f2571b, bArrCopyOf, true);
                        break;
                    }
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                i4++;
            }
            b4 = a3 == a4 ? b3 : new B(a3);
            b3.f2582c = b4;
        }
        byte[] bArrJ = this.f2596k.j();
        return a.b("h'", b4.c(bArrJ, bArrJ.length), "'");
    }
}
