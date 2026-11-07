package org.apache.tika.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaException;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public class EndianUtils {
    private static final int LONG_SIZE = 8;

    public static class BufferUnderrunException extends TikaException {
        private static final long serialVersionUID = 8358288231138076276L;

        public BufferUnderrunException() {
            super("Insufficient data left in stream for required read");
        }
    }

    public static int getIntBE(byte[] bArr) {
        return getIntBE(bArr, 0);
    }

    public static int getIntLE(byte[] bArr) {
        return getIntLE(bArr, 0);
    }

    public static long getLongLE(byte[] bArr, int i3) {
        long j3 = 0;
        for (int i4 = i3 + 7; i4 >= i3; i4--) {
            j3 = (j3 << 8) | ((long) (bArr[i4] & ForkServer.ERROR));
        }
        return j3;
    }

    public static short getShortBE(byte[] bArr) {
        return getShortBE(bArr, 0);
    }

    public static short getShortLE(byte[] bArr) {
        return getShortLE(bArr, 0);
    }

    public static short getUByte(byte[] bArr, int i3) {
        return (short) (bArr[i3] & ForkServer.ERROR);
    }

    public static long getUIntBE(byte[] bArr) {
        return getUIntBE(bArr, 0);
    }

    public static long getUIntLE(byte[] bArr) {
        return getUIntLE(bArr, 0);
    }

    public static int getUShortBE(byte[] bArr) {
        return getUShortBE(bArr, 0);
    }

    public static int getUShortLE(byte[] bArr) {
        return getUShortLE(bArr, 0);
    }

    public static int readIntBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        int i5 = inputStream.read();
        int i6 = inputStream.read();
        if ((i3 | i4 | i5 | i6) >= 0) {
            return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
        }
        throw new BufferUnderrunException();
    }

    public static int readIntLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        int i5 = inputStream.read();
        int i6 = inputStream.read();
        if ((i3 | i4 | i5 | i6) >= 0) {
            return (i6 << 24) + (i5 << 16) + (i4 << 8) + i3;
        }
        throw new BufferUnderrunException();
    }

    public static int readIntME(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        int i5 = inputStream.read();
        int i6 = inputStream.read();
        if ((i3 | i4 | i5 | i6) >= 0) {
            return (i4 << 24) + (i3 << 16) + (i6 << 8) + i5;
        }
        throw new BufferUnderrunException();
    }

    public static long readLongBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        int i5 = inputStream.read();
        int i6 = inputStream.read();
        int i7 = inputStream.read();
        int i8 = inputStream.read();
        int i9 = inputStream.read();
        int i10 = inputStream.read();
        if ((i3 | i4 | i5 | i6 | i7 | i8 | i9 | i10) >= 0) {
            return (((long) i3) << 56) + (((long) i4) << 48) + (((long) i5) << 40) + (((long) i6) << 32) + (((long) i7) << 24) + ((long) (i8 << 16)) + ((long) (i9 << 8)) + ((long) i10);
        }
        throw new BufferUnderrunException();
    }

    public static long readLongLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        int i5 = inputStream.read();
        int i6 = inputStream.read();
        int i7 = inputStream.read();
        int i8 = inputStream.read();
        int i9 = inputStream.read();
        int i10 = inputStream.read();
        if ((i3 | i4 | i5 | i6 | i7 | i8 | i9 | i10) >= 0) {
            return (((long) i10) << 56) + (((long) i9) << 48) + (((long) i8) << 40) + (((long) i7) << 32) + (((long) i6) << 24) + ((long) (i5 << 16)) + ((long) (i4 << 8)) + ((long) i3);
        }
        throw new BufferUnderrunException();
    }

    public static short readShortBE(InputStream inputStream) {
        return (short) readUShortBE(inputStream);
    }

    public static short readShortLE(InputStream inputStream) {
        return (short) readUShortLE(inputStream);
    }

    public static long readUE7(InputStream inputStream) throws IOException {
        int i3;
        long j3 = 0;
        int i4 = 0;
        while (true) {
            i3 = inputStream.read();
            if (i3 < 0) {
                break;
            }
            int i5 = i4 + 1;
            if (i4 >= 6) {
                break;
            }
            long j4 = j3 << 7;
            if ((i3 & 128) != 128) {
                j3 = j4 + ((long) i3);
                break;
            }
            j3 = j4 + ((long) (i3 & 127));
            i4 = i5;
        }
        if (i3 >= 0) {
            return j3;
        }
        throw new IOException("Buffer underun; expected one more byte");
    }

    public static long readUIntBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        int i5 = inputStream.read();
        int i6 = inputStream.read();
        if ((i3 | i4 | i5 | i6) >= 0) {
            return ((long) ((i3 << 24) + (i4 << 16) + (i5 << 8) + i6)) & 4294967295L;
        }
        throw new BufferUnderrunException();
    }

    public static long readUIntLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        int i5 = inputStream.read();
        int i6 = inputStream.read();
        if ((i3 | i4 | i5 | i6) >= 0) {
            return ((long) ((i6 << 24) + (i5 << 16) + (i4 << 8) + i3)) & 4294967295L;
        }
        throw new BufferUnderrunException();
    }

    public static int readUShortBE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        if ((i3 | i4) >= 0) {
            return (i3 << 8) + i4;
        }
        throw new BufferUnderrunException();
    }

    public static int readUShortLE(InputStream inputStream) throws BufferUnderrunException, IOException {
        int i3 = inputStream.read();
        int i4 = inputStream.read();
        if ((i3 | i4) >= 0) {
            return (i4 << 8) + i3;
        }
        throw new BufferUnderrunException();
    }

    public static int ubyteToInt(byte b3) {
        return b3 & ForkServer.ERROR;
    }

    public static int getIntBE(byte[] bArr, int i3) {
        int i4 = bArr[i3] & ForkServer.ERROR;
        int i5 = bArr[i3 + 1] & ForkServer.ERROR;
        int i6 = bArr[i3 + 2] & ForkServer.ERROR;
        return (i4 << 24) + (i5 << 16) + (i6 << 8) + (bArr[i3 + 3] & ForkServer.ERROR);
    }

    public static int getIntLE(byte[] bArr, int i3) {
        int i4 = bArr[i3] & ForkServer.ERROR;
        int i5 = bArr[i3 + 1] & ForkServer.ERROR;
        return ((bArr[i3 + 3] & ForkServer.ERROR) << 24) + ((bArr[i3 + 2] & ForkServer.ERROR) << 16) + (i5 << 8) + i4;
    }

    public static short getShortBE(byte[] bArr, int i3) {
        return (short) getUShortBE(bArr, i3);
    }

    public static short getShortLE(byte[] bArr, int i3) {
        return (short) getUShortLE(bArr, i3);
    }

    public static long getUIntBE(byte[] bArr, int i3) {
        return ((long) getIntBE(bArr, i3)) & 4294967295L;
    }

    public static long getUIntLE(byte[] bArr, int i3) {
        return ((long) getIntLE(bArr, i3)) & 4294967295L;
    }

    public static int getUShortBE(byte[] bArr, int i3) {
        int i4 = bArr[i3] & ForkServer.ERROR;
        return (i4 << 8) + (bArr[i3 + 1] & ForkServer.ERROR);
    }

    public static int getUShortLE(byte[] bArr, int i3) {
        return ((bArr[i3 + 1] & ForkServer.ERROR) << 8) + (bArr[i3] & ForkServer.ERROR);
    }
}
