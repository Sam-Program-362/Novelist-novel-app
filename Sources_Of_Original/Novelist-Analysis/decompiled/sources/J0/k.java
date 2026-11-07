package J0;

import M0.G;
import M0.r;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends Y0.h implements G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f567b;

    public k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 2);
        r.b(bArr.length == 25);
        this.f567b = Arrays.hashCode(bArr);
    }

    public static byte[] p(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof G) {
            try {
                G g3 = (G) obj;
                if (((k) g3).f567b == this.f567b) {
                    return Arrays.equals(o(), (byte[]) new T0.a(((k) g3).o()).f1274b);
                }
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f567b;
    }

    @Override // Y0.h
    public final boolean n(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            if (i3 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f567b);
            return true;
        }
        T0.a aVar = new T0.a(o());
        parcel2.writeNoException();
        int i4 = a1.g.f1694a;
        parcel2.writeStrongBinder(aVar);
        return true;
    }

    public abstract byte[] o();
}
