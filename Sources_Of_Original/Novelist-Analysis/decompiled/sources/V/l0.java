package V;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends OutputStream {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FileOutputStream f1448k;

    public l0(FileOutputStream fileOutputStream) {
        this.f1448k = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f1448k.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i3) throws IOException {
        this.f1448k.write(i3);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        a2.h.e(bArr, "b");
        this.f1448k.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) throws IOException {
        a2.h.e(bArr, "bytes");
        this.f1448k.write(bArr, i3, i4);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
