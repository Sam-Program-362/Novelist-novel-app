package s2;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4533a;

    static {
        char c3 = File.separatorChar;
        f4533a = new byte[0];
        System.lineSeparator();
        d.f4535l.getClass();
        d.f4534k.getClass();
        final int i3 = 0;
        final Supplier supplier = new Supplier() { // from class: s2.a
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i3) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
        final int i4 = 0;
        new ThreadLocal() { // from class: s2.b
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                switch (i4) {
                    case 0:
                        ((a) supplier).getClass();
                        return new byte[8192];
                    default:
                        ((a) supplier).getClass();
                        return new char[8192];
                }
            }
        };
        final int i5 = 1;
        final Supplier supplier2 = new Supplier() { // from class: s2.a
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i5) {
                    case 0:
                        return new byte[8192];
                    default:
                        return new char[8192];
                }
            }
        };
        final int i6 = 1;
        new ThreadLocal() { // from class: s2.b
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                switch (i6) {
                    case 0:
                        ((a) supplier2).getClass();
                        return new byte[8192];
                    default:
                        ((a) supplier2).getClass();
                        return new char[8192];
                }
            }
        };
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int b(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        Objects.requireNonNull(inputStream, "inputStream");
        Objects.requireNonNull(outputStream, "outputStream");
        long j3 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j3 += read;
        }
        if (j3 > 2147483647L) {
            return -1;
        }
        return (int) j3;
    }
}
