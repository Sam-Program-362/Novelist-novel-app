package Y0;

import M0.C0047c;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class o extends com.google.android.gms.common.internal.a {
    public final E0.c y;

    public o(Context context, Looper looper, C0047c c0047c, E0.c cVar, L0.p pVar, L0.p pVar2) {
        super(context, looper, 68, c0047c, pVar, pVar2, 0);
        cVar = cVar == null ? E0.c.f287m : cVar;
        A.c cVar2 = new A.c(14, false);
        cVar2.f6l = Boolean.FALSE;
        cVar2.f6l = Boolean.valueOf(cVar.f288k);
        cVar2.f7m = cVar.f289l;
        cVar2.f7m = g.a();
        this.y = new E0.c(cVar2);
    }

    @Override // K0.c
    public final int e() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new p(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        E0.c cVar = this.y;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", cVar.f288k);
        bundle.putString("log_session_id", cVar.f289l);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
