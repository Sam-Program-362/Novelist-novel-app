package Z;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DataInputStream f1608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteOrder f1610m;
    public byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1611o;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f1611o = bArr.length;
    }

    public final void a(int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i3 - i4;
            DataInputStream dataInputStream = this.f1608k;
            int iSkip = (int) dataInputStream.skip(i5);
            if (iSkip <= 0) {
                if (this.n == null) {
                    this.n = new byte[8192];
                }
                iSkip = dataInputStream.read(this.n, 0, Math.min(8192, i5));
                if (iSkip == -1) {
                    throw new EOFException(B1.e.h("Reached EOF while skipping ", i3, " bytes."));
                }
            }
            i4 += iSkip;
        }
        this.f1609l += i4;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1608k.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i3) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1609l++;
        return this.f1608k.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1609l++;
        return this.f1608k.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f1609l++;
        int i3 = this.f1608k.read();
        if (i3 >= 0) {
            return (byte) i3;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1609l += 2;
        return this.f1608k.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i3, int i4) throws IOException {
        this.f1609l += i4;
        this.f1608k.readFully(bArr, i3, i4);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f1609l += 4;
        DataInputStream dataInputStream = this.f1608k;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        if ((i3 | i4 | i5 | i6) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1610m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i6 << 24) + (i5 << 16) + (i4 << 8) + i3;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
        }
        throw new IOException("Invalid byte order: " + this.f1610m);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j3;
        long j4;
        this.f1609l += 8;
        DataInputStream dataInputStream = this.f1608k;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i3 | i4 | i5 | i6 | i7 | i8 | i9 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1610m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j3 = (((long) i10) << 56) + (((long) i9) << 48) + (((long) i8) << 40) + (((long) i7) << 32) + (((long) i6) << 24) + (((long) i5) << 16) + (((long) i4) << 8);
            j4 = i3;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f1610m);
            }
            j3 = (((long) i3) << 56) + (((long) i4) << 48) + (((long) i5) << 40) + (((long) i6) << 32) + (((long) i7) << 24) + (((long) i8) << 16) + (((long) i9) << 8);
            j4 = i10;
        }
        return j3 + j4;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f1609l += 2;
        DataInputStream dataInputStream = this.f1608k;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1610m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i4 << 8) + i3);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i3 << 8) + i4);
        }
        throw new IOException("Invalid byte order: " + this.f1610m);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f1609l += 2;
        return this.f1608k.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1609l++;
        return this.f1608k.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f1609l += 2;
        DataInputStream dataInputStream = this.f1608k;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1610m;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 8) + i3;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.f1610m);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i3) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) throws IOException {
        int i5 = this.f1608k.read(bArr, i3, i4);
        this.f1609l += i5;
        return i5;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f1609l += bArr.length;
        this.f1608k.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1608k = dataInputStream;
        dataInputStream.mark(0);
        this.f1609l = 0;
        this.f1610m = byteOrder;
        this.f1611o = inputStream instanceof b ? ((b) inputStream).f1611o : -1;
    }
}
