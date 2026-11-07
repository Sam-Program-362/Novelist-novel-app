package X0;

import a2.h;
import android.os.IBinder;
import android.os.IInterface;
import c1.AbstractC0225b;

/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.a {
    @Override // K0.c
    public final int e() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        h.e(iBinder, "iBinder");
        int i3 = c.f1562b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new b(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final J0.c[] o() {
        return AbstractC0225b.f2661c;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.identitycredentials.service.START";
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
