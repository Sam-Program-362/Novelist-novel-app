package Y0;

import M0.C0047c;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class q extends com.google.android.gms.common.internal.a {
    public final Bundle y;

    public q(Context context, Looper looper, C0047c c0047c, L0.p pVar, L0.p pVar2) {
        super(context, looper, 219, c0047c, pVar, pVar2, 0);
        Bundle bundle = new Bundle();
        bundle.putString("session_id", null);
        this.y = bundle;
    }

    @Override // K0.c
    public final int e() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return iInterfaceQueryLocalInterface instanceof r ? (r) iInterfaceQueryLocalInterface : new r(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final J0.c[] o() {
        return f.f1593f;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        return this.y;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean u() {
        return true;
    }
}
