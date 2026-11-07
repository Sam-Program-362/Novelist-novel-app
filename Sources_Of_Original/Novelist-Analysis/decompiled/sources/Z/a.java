package Z;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f1607l;

    public a(g gVar) {
        this.f1607l = gVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j4 = this.f1606k;
            g gVar = this.f1607l;
            if (j4 != j3) {
                if (j4 >= 0 && j3 >= j4 + ((long) gVar.f1608k.available())) {
                    return -1;
                }
                gVar.b(j3);
                this.f1606k = j3;
            }
            if (i4 > gVar.f1608k.available()) {
                i4 = gVar.f1608k.available();
            }
            int i5 = gVar.read(bArr, i3, i4);
            if (i5 >= 0) {
                this.f1606k += (long) i5;
                return i5;
            }
        } catch (IOException unused) {
        }
        this.f1606k = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
