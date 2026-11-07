package f1;

import K0.j;
import K0.k;
import M0.C0047c;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246a extends com.google.android.gms.common.internal.a implements K0.c {

    /* renamed from: A, reason: collision with root package name */
    public final Bundle f2815A;

    /* renamed from: B, reason: collision with root package name */
    public final Integer f2816B;
    public final boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final C0047c f2817z;

    public C0246a(Context context, Looper looper, C0047c c0047c, Bundle bundle, j jVar, k kVar) {
        super(context, looper, 44, c0047c, jVar, kVar, 0);
        this.y = true;
        this.f2817z = c0047c;
        this.f2815A = bundle;
        this.f2816B = (Integer) c0047c.f931f;
    }

    @Override // K0.c
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, K0.c
    public final boolean l() {
        return this.y;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        C0047c c0047c = this.f2817z;
        boolean equals = this.f2741c.getPackageName().equals((String) c0047c.f928c);
        Bundle bundle = this.f2815A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c0047c.f928c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
