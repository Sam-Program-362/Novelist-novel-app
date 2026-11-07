package p004b1;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B f2579d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f2580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f2581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile D f2582c;

    static {
        new C("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new C("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new D("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new D("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f2579d = new B(new A("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public D(A a3, Character ch) {
        this.f2580a = a3;
        if (ch != null) {
            byte[] bArr = a3.f2576g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(AbstractC0168a.d("Padding character %s was already in alphabet", ch));
            }
        }
        this.f2581b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i3) {
        int i4 = 0;
        AbstractC0168a.m(0, i3, bArr.length);
        while (i4 < i3) {
            A a3 = this.f2580a;
            b(sb, bArr, i4, Math.min(a3.f2575f, i3 - i4));
            i4 += a3.f2575f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i3, int i4) {
        AbstractC0168a.m(i3, i3 + i4, bArr.length);
        A a3 = this.f2580a;
        int i5 = a3.f2575f;
        int i6 = a3.f2573d;
        if (i4 > i5) {
            throw new IllegalArgumentException();
        }
        int i7 = 0;
        long j3 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            j3 = (j3 | ((long) (bArr[i3 + i8] & ForkServer.ERROR))) << 8;
        }
        int i9 = (i4 + 1) * 8;
        while (i7 < i4 * 8) {
            sb.append(a3.f2571b[((int) (j3 >>> ((i9 - i6) - i7))) & a3.f2572c]);
            i7 += i6;
        }
        if (this.f2581b != null) {
            while (i7 < a3.f2575f * 8) {
                sb.append('=');
                i7 += i6;
            }
        }
    }

    public final String c(byte[] bArr, int i3) {
        AbstractC0168a.m(0, i3, bArr.length);
        A a3 = this.f2580a;
        int i4 = a3.f2575f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(a3.f2574e * AbstractC0168a.a(i3, i4));
        try {
            a(sb, bArr, i3);
            return sb.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            D d3 = (D) obj;
            if (this.f2580a.equals(d3.f2580a) && Objects.equals(this.f2581b, d3.f2581b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2580a.hashCode() ^ Objects.hashCode(this.f2581b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        A a3 = this.f2580a;
        sb.append(a3);
        if (8 % a3.f2573d != 0) {
            Character ch = this.f2581b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public D(String str, String str2) {
        this(new A(str, str2.toCharArray()), (Character) '=');
    }
}
