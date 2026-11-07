package M0;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: M0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0049e extends N0.a {
    public static final Parcelable.Creator<C0049e> CREATOR = new F0.l(25);
    public static final Scope[] y = new Scope[0];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final J0.c[] f937z = new J0.c[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f940m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IBinder f941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Scope[] f942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Bundle f943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Account f944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public J0.c[] f945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public J0.c[] f946t;
    public final boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f948w;
    public final String x;

    public C0049e(int i3, int i4, int i5, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, J0.c[] cVarArr, J0.c[] cVarArr2, boolean z3, int i6, boolean z4, String str2) {
        scopeArr = scopeArr == null ? y : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        J0.c[] cVarArr3 = f937z;
        cVarArr = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr2 = cVarArr2 == null ? cVarArr3 : cVarArr2;
        this.f938k = i3;
        this.f939l = i4;
        this.f940m = i5;
        if ("com.google.android.gms".equals(str)) {
            this.n = "com.google.android.gms";
        } else {
            this.n = str;
        }
        if (i3 < 2) {
            Account accountD = null;
            if (iBinder != null) {
                int i7 = AbstractBinderC0045a.f925b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface f3 = iInterfaceQueryLocalInterface instanceof InterfaceC0050f ? (InterfaceC0050f) iInterfaceQueryLocalInterface : new F(iBinder);
                if (f3 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            accountD = ((F) f3).d();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f944r = accountD;
        } else {
            this.f941o = iBinder;
            this.f944r = account;
        }
        this.f942p = scopeArr;
        this.f943q = bundle;
        this.f945s = cVarArr;
        this.f946t = cVarArr2;
        this.u = z3;
        this.f947v = i6;
        this.f948w = z4;
        this.x = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        F0.l.a(this, parcel, i3);
    }
}
