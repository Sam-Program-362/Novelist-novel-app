package Z;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class g extends b {
    public g(byte[] bArr) {
        super(bArr);
        this.f1608k.mark(Integer.MAX_VALUE);
    }

    public final void b(long j3) {
        int i3 = this.f1609l;
        if (i3 > j3) {
            this.f1609l = 0;
            this.f1608k.reset();
        } else {
            j3 -= i3;
        }
        a((int) j3);
    }

    public g(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f1608k.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
