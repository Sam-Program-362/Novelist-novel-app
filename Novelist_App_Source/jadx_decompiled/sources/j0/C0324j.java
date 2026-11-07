package j0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: j0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3535b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3536c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3537d;

    public C0324j(int i3, int i4, long j3, long j4) {
        this.f3534a = i3;
        this.f3535b = i4;
        this.f3536c = j3;
        this.f3537d = j4;
    }

    public static C0324j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0324j c0324j = new C0324j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0324j;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3534a);
            dataOutputStream.writeInt(this.f3535b);
            dataOutputStream.writeLong(this.f3536c);
            dataOutputStream.writeLong(this.f3537d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0324j)) {
            C0324j c0324j = (C0324j) obj;
            if (this.f3535b == c0324j.f3535b && this.f3536c == c0324j.f3536c && this.f3534a == c0324j.f3534a && this.f3537d == c0324j.f3537d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3535b), Long.valueOf(this.f3536c), Integer.valueOf(this.f3534a), Long.valueOf(this.f3537d));
    }
}
