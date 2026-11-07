package p062v1;

import android.media.MediaDataSource;

/* JADX INFO: loaded from: classes.dex */
public final class c extends MediaDataSource {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ byte[] f4624k;

    public c(byte[] bArr) {
        this.f4624k = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f4624k.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i3, int i4) {
        byte[] bArr2 = this.f4624k;
        if (j3 >= bArr2.length) {
            return -1;
        }
        if (((long) i4) + j3 > bArr2.length) {
            i4 = (int) (((long) bArr2.length) - j3);
        }
        System.arraycopy(bArr2, (int) j3, bArr, i3, i4);
        return i4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
