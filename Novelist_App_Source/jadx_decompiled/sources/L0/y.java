package L0;

import M0.C0047c;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import e1.AbstractC0241b;
import f1.C0246a;
import java.util.Set;

/* loaded from: classes.dex */
public final class y extends f1.c implements K0.j, K0.k {

    /* renamed from: i, reason: collision with root package name */
    public static final E0.b f858i = AbstractC0241b.f2782a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f859b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f860c;

    /* renamed from: d, reason: collision with root package name */
    public final E0.b f861d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f862e;

    /* renamed from: f, reason: collision with root package name */
    public final C0047c f863f;

    /* renamed from: g, reason: collision with root package name */
    public C0246a f864g;

    /* renamed from: h, reason: collision with root package name */
    public r f865h;

    public y(Context context, Z0.d dVar, C0047c c0047c) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 1);
        this.f859b = context;
        this.f860c = dVar;
        this.f863f = c0047c;
        this.f862e = (Set) c0047c.f926a;
        this.f861d = f858i;
    }

    @Override // K0.j
    public final void d(int i3) {
        r rVar = this.f865h;
        p pVar = (p) rVar.f843f.f809j.get(rVar.f839b);
        if (pVar != null) {
            if (pVar.f831i) {
                pVar.p(new J0.a(17, null, null));
            } else {
                pVar.d(i3);
            }
        }
    }

    @Override // K0.j
    public final void e() {
        C0246a c0246a = this.f864g;
        c0246a.getClass();
        try {
            c0246a.f2817z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount b3 = "<<default account>>".equals(account.name) ? H0.b.a(c0246a.f2741c).b() : null;
            Integer num = c0246a.f2816B;
            M0.r.f(num);
            M0.n nVar = new M0.n(2, account, num.intValue(), b3);
            f1.d dVar = (f1.d) c0246a.q();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(dVar.f1580c);
            int i3 = Z0.a.f1676a;
            obtain.writeInt(1);
            int Q2 = H2.h.Q(obtain, 20293);
            H2.h.P(obtain, 1, 4);
            obtain.writeInt(1);
            H2.h.J(obtain, 2, nVar, 0);
            H2.h.R(obtain, Q2);
            obtain.writeStrongBinder(this);
            Parcel obtain2 = Parcel.obtain();
            try {
                dVar.f1579b.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
            } catch (Throwable th) {
                obtain.recycle();
                obtain2.recycle();
                throw th;
            }
        } catch (RemoteException e3) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f860c.post(new A.a(this, new f1.f(1, new J0.a(8, null, null), null), 3, false));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e3);
            }
        }
    }

    @Override // K0.k
    public final void j(J0.a aVar) {
        this.f865h.b(aVar);
    }
}
