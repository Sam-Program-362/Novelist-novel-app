package b1;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import org.apache.tika.fork.ForkServer;

/* renamed from: b1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0179D {

    /* renamed from: d, reason: collision with root package name */
    public static final C0177B f2579d;

    /* renamed from: a, reason: collision with root package name */
    public final C0176A f2580a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f2581b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0179D f2582c;

    static {
        new C0178C("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new C0178C("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new C0179D("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C0179D("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f2579d = new C0177B(new C0176A("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C0179D(C0176A c0176a, Character ch) {
        this.f2580a = c0176a;
        if (ch != null) {
            byte[] bArr = c0176a.f2576g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(AbstractC0197a.d("Padding character %s was already in alphabet", ch));
            }
        }
        this.f2581b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i3) {
        int i4 = 0;
        AbstractC0197a.m(0, i3, bArr.length);
        while (i4 < i3) {
            C0176A c0176a = this.f2580a;
            b(sb, bArr, i4, Math.min(c0176a.f2575f, i3 - i4));
            i4 += c0176a.f2575f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i3, int i4) {
        AbstractC0197a.m(i3, i3 + i4, bArr.length);
        C0176A c0176a = this.f2580a;
        int i5 = c0176a.f2575f;
        int i6 = c0176a.f2573d;
        if (i4 > i5) {
            throw new IllegalArgumentException();
        }
        int i7 = 0;
        long j3 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            j3 = (j3 | (bArr[i3 + i8] & ForkServer.ERROR)) << 8;
        }
        int i9 = (i4 + 1) * 8;
        while (i7 < i4 * 8) {
            sb.append(c0176a.f2571b[((int) (j3 >>> ((i9 - i6) - i7))) & c0176a.f2572c]);
            i7 += i6;
        }
        if (this.f2581b != null) {
            while (i7 < c0176a.f2575f * 8) {
                sb.append('=');
                i7 += i6;
            }
        }
    }

    public final String c(byte[] bArr, int i3) {
        AbstractC0197a.m(0, i3, bArr.length);
        C0176A c0176a = this.f2580a;
        int i4 = c0176a.f2575f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(c0176a.f2574e * AbstractC0197a.a(i3, i4));
        try {
            a(sb, bArr, i3);
            return sb.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0179D) {
            C0179D c0179d = (C0179D) obj;
            if (this.f2580a.equals(c0179d.f2580a) && Objects.equals(this.f2581b, c0179d.f2581b)) {
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
        C0176A c0176a = this.f2580a;
        sb.append(c0176a);
        if (8 % c0176a.f2573d != 0) {
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

    public C0179D(String str, String str2) {
        this(new C0176A(str, str2.toCharArray()), (Character) '=');
    }
}
