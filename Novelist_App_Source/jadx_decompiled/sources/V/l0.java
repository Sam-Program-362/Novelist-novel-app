package V;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class l0 extends OutputStream {

    /* renamed from: k, reason: collision with root package name */
    public final FileOutputStream f1448k;

    public l0(FileOutputStream fileOutputStream) {
        this.f1448k = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f1448k.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        this.f1448k.write(i3);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        a2.h.e(bArr, "b");
        this.f1448k.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        a2.h.e(bArr, "bytes");
        this.f1448k.write(bArr, i3, i4);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
