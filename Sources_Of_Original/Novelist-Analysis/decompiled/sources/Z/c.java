package Z;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterOutputStream {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DataOutputStream f1612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ByteOrder f1613l;

    public c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f1612k = new DataOutputStream(outputStream);
        this.f1613l = byteOrder;
    }

    public final void a(int i3) throws IOException {
        this.f1612k.write(i3);
    }

    public final void b(int i3) throws IOException {
        ByteOrder byteOrder = this.f1613l;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        DataOutputStream dataOutputStream = this.f1612k;
        if (byteOrder == byteOrder2) {
            dataOutputStream.write(i3 & 255);
            dataOutputStream.write((i3 >>> 8) & 255);
            dataOutputStream.write((i3 >>> 16) & 255);
            dataOutputStream.write((i3 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            dataOutputStream.write((i3 >>> 24) & 255);
            dataOutputStream.write((i3 >>> 16) & 255);
            dataOutputStream.write((i3 >>> 8) & 255);
            dataOutputStream.write(i3 & 255);
        }
    }

    public final void c(short s3) throws IOException {
        ByteOrder byteOrder = this.f1613l;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        DataOutputStream dataOutputStream = this.f1612k;
        if (byteOrder == byteOrder2) {
            dataOutputStream.write(s3 & 255);
            dataOutputStream.write((s3 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            dataOutputStream.write((s3 >>> 8) & 255);
            dataOutputStream.write(s3 & 255);
        }
    }

    public final void d(long j3) throws IOException {
        if (j3 > 4294967295L) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }
        b((int) j3);
    }

    public final void e(int i3) throws IOException {
        if (i3 > 65535) {
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }
        c((short) i3);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f1612k.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) throws IOException {
        this.f1612k.write(bArr, i3, i4);
    }
}
