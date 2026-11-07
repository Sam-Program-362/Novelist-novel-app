package w2;

import java.io.InputStream;
import java.util.Objects;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes.dex */
public final class h extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f4677o = 0;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f4678k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4679l;

    /* renamed from: m, reason: collision with root package name */
    public int f4680m;
    public int n;

    public h(g gVar) {
        int i3 = g.f4676o;
        t2.a aVar = gVar.f4582m;
        if (aVar == null) {
            throw new IllegalStateException("origin == null");
        }
        byte[] bArr = (byte[]) aVar.f4581m;
        int i4 = gVar.n;
        a(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, 0);
        a("length", i4);
        Objects.requireNonNull(bArr, "data");
        this.f4678k = bArr;
        a("defaultValue", 0);
        this.f4679l = Math.min(Math.min(0, bArr.length > 0 ? bArr.length : 0) + i4, bArr.length);
        a("defaultValue", 0);
        this.f4680m = Math.min(0, bArr.length > 0 ? bArr.length : 0);
        a("defaultValue", 0);
        this.n = Math.min(0, bArr.length > 0 ? bArr.length : 0);
    }

    public static void a(String str, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(str.concat(" cannot be negative"));
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        int i3 = this.f4680m;
        int i4 = this.f4679l;
        if (i3 < i4) {
            return i4 - i3;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final void mark(int i3) {
        this.n = this.f4680m;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i3 = this.f4680m;
        if (i3 >= this.f4679l) {
            return -1;
        }
        this.f4680m = i3 + 1;
        return this.f4678k[i3] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f4680m = this.n;
    }

    @Override // java.io.InputStream
    public final long skip(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException("Skipping backward is not supported");
        }
        int i3 = this.f4680m;
        long j4 = this.f4679l - i3;
        if (j3 < j4) {
            j4 = j3;
        }
        this.f4680m = Math.addExact(i3, Math.toIntExact(j3));
        return j4;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) {
        Objects.requireNonNull(bArr, "dest");
        if (i3 >= 0 && i4 >= 0 && i3 + i4 <= bArr.length) {
            int i5 = this.f4680m;
            int i6 = this.f4679l;
            if (i5 >= i6) {
                return -1;
            }
            int i7 = i6 - i5;
            if (i4 >= i7) {
                i4 = i7;
            }
            if (i4 <= 0) {
                return 0;
            }
            System.arraycopy(this.f4678k, i5, bArr, i3, i4);
            this.f4680m += i4;
            return i4;
        }
        throw new IndexOutOfBoundsException();
    }

    public h(byte[] bArr) {
        int length = bArr.length;
        this.f4678k = bArr;
        this.f4679l = length;
        this.f4680m = 0;
        this.n = 0;
    }
}
