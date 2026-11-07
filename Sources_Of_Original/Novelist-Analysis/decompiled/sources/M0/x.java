package M0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class x extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f997h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.google.android.gms.common.internal.a aVar, int i3, IBinder iBinder, Bundle bundle) {
        super(aVar, i3, bundle);
        this.f997h = aVar;
        this.f996g = iBinder;
    }

    @Override // M0.p
    public final boolean a() {
        IBinder iBinder = this.f996g;
        try {
            r.f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f997h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                String strR = aVar.r();
                StringBuilder sb = new StringBuilder(strR.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(strR);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceN = aVar.n(iBinder);
            if (iInterfaceN == null || !(aVar.v(2, 4, iInterfaceN) || aVar.v(3, 4, iInterfaceN))) {
                return false;
            }
            aVar.f2756s = null;
            h hVar = aVar.n;
            if (hVar == null) {
                return true;
            }
            ((K0.j) hVar.f959a).e();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // M0.p
    public final void b(J0.a aVar) {
        h hVar = this.f997h.f2752o;
        if (hVar != null) {
            ((K0.k) hVar.f959a).j(aVar);
        }
        System.currentTimeMillis();
    }
}
