package x2;

import M1.K;
import M1.N;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: k, reason: collision with root package name */
    public final int f4719k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public final v2.a f4720l;

    /* renamed from: m, reason: collision with root package name */
    public final v2.b f4721m;
    public long n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4722o;

    public b(N n, K k3) {
        this.f4720l = n;
        this.f4721m = k3;
    }

    public final void a(int i3) {
        if (this.f4722o || this.n + i3 <= this.f4719k) {
            return;
        }
        this.f4722o = true;
        this.f4720l.accept(this);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
        ((OutputStream) this.f4721m.d(this)).close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        ((OutputStream) this.f4721m.d(this)).flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        a(bArr.length);
        ((OutputStream) this.f4721m.d(this)).write(bArr);
        this.n += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        a(i4);
        ((OutputStream) this.f4721m.d(this)).write(bArr, i3, i4);
        this.n += i4;
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        a(1);
        ((OutputStream) this.f4721m.d(this)).write(i3);
        this.n++;
    }
}
