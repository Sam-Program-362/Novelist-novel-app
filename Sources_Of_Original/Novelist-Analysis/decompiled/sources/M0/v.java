package M0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class v extends Y0.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f993c;

    public v(com.google.android.gms.common.internal.a aVar, int i3) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 2);
        this.f992b = aVar;
        this.f993c = i3;
    }

    @Override // Y0.h
    public final boolean n(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            int i4 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) a1.g.a(parcel, Bundle.CREATOR);
            a1.g.b(parcel);
            r.g(this.f992b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f992b;
            int i5 = this.f993c;
            aVar.getClass();
            x xVar = new x(aVar, i4, strongBinder, bundle);
            u uVar = aVar.f2743e;
            uVar.sendMessage(uVar.obtainMessage(1, i5, -1, xVar));
            this.f992b = null;
        } else if (i3 == 2) {
            parcel.readInt();
            a1.g.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i3 != 3) {
                return false;
            }
            int i6 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            z zVar = (z) a1.g.a(parcel, z.CREATOR);
            a1.g.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f992b;
            r.g(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            r.f(zVar);
            aVar2.u = zVar;
            if (aVar2.u()) {
                C0048d c0048d = zVar.n;
                h hVarB = h.b();
                i iVar = c0048d == null ? null : c0048d.f932k;
                synchronized (hVarB) {
                    try {
                        if (iVar == null) {
                            iVar = h.f958c;
                        } else {
                            i iVar2 = (i) hVarB.f959a;
                            if (iVar2 == null || iVar2.f960k < iVar.f960k) {
                            }
                        }
                        hVarB.f959a = iVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = zVar.f999k;
            r.g(this.f992b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f992b;
            int i7 = this.f993c;
            aVar3.getClass();
            x xVar2 = new x(aVar3, i6, strongBinder2, bundle2);
            u uVar2 = aVar3.f2743e;
            uVar2.sendMessage(uVar2.obtainMessage(1, i7, -1, xVar2));
            this.f992b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
