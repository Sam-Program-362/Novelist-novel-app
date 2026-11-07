package x2;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import w2.e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f4723p = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f4726m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4727o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f4724k = new ArrayList();
    public int n = -1;

    public c(e eVar) {
        a(8192);
    }

    public final void a(int i3) {
        int i4 = this.n;
        ArrayList arrayList = this.f4724k;
        if (i4 < arrayList.size() - 1) {
            this.f4727o += this.f4726m.length;
            int i5 = this.n + 1;
            this.n = i5;
            this.f4726m = (byte[]) arrayList.get(i5);
            return;
        }
        byte[] bArr = this.f4726m;
        if (bArr == null) {
            if (i3 <= 0) {
                i3 = 1024;
            }
            this.f4727o = 0;
        } else {
            i3 = Math.max(bArr.length << 1, i3 - this.f4727o);
            this.f4727o += this.f4726m.length;
        }
        this.n++;
        byte[] bArr2 = s2.c.f4533a;
        byte[] bArr3 = new byte[i3];
        this.f4726m = bArr3;
        arrayList.add(bArr3);
    }

    public final byte[] b() {
        int i3 = this.f4725l;
        if (i3 == 0) {
            return s2.c.f4533a;
        }
        byte[] bArr = s2.c.f4533a;
        byte[] bArr2 = new byte[i3];
        ArrayList arrayList = this.f4724k;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            byte[] bArr3 = (byte[]) obj;
            int iMin = Math.min(bArr3.length, i3);
            System.arraycopy(bArr3, 0, bArr2, i4, iMin);
            i4 += iMin;
            i3 -= iMin;
            if (i3 == 0) {
                break;
            }
        }
        return bArr2;
    }

    public final String toString() {
        return new String(b(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        int i5;
        if (i3 < 0 || i3 > bArr.length || i4 < 0 || (i5 = i3 + i4) > bArr.length || i5 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i3), Integer.valueOf(i4)));
        }
        if (i4 == 0) {
            return;
        }
        int i6 = this.f4725l;
        int i7 = i6 + i4;
        int i8 = i6 - this.f4727o;
        while (i4 > 0) {
            int iMin = Math.min(i4, this.f4726m.length - i8);
            System.arraycopy(bArr, i5 - i4, this.f4726m, i8, iMin);
            i4 -= iMin;
            if (i4 > 0) {
                a(i7);
                i8 = 0;
            }
        }
        this.f4725l = i7;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        int i4 = this.f4725l;
        int i5 = i4 - this.f4727o;
        if (i5 == this.f4726m.length) {
            a(i4 + 1);
            i5 = 0;
        }
        this.f4726m[i5] = (byte) i3;
        this.f4725l++;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
