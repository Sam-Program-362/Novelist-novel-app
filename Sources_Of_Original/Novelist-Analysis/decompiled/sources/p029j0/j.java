package p029j0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3537d;

    public j(int i3, int i4, long j3, long j4) {
        this.f3534a = i3;
        this.f3535b = i4;
        this.f3536c = j3;
        this.f3537d = j4;
    }

    public static j a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(File file) throws IOException {
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
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            if (this.f3535b == jVar.f3535b && this.f3536c == jVar.f3536c && this.f3534a == jVar.f3534a && this.f3537d == jVar.f3537d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3535b), Long.valueOf(this.f3536c), Integer.valueOf(this.f3534a), Long.valueOf(this.f3537d));
    }
}
