package L0;

import M0.C0047c;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p015f1.c implements K0.j, K0.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final E0.b f858i = p011e1.b.f2782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E0.b f861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0047c f863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p015f1.a f864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
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
        p015f1.a aVar = this.f864g;
        aVar.getClass();
        try {
            aVar.f2817z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? H0.b.a(aVar.f2741c).b() : null;
            Integer num = aVar.f2816B;
            M0.r.f(num);
            M0.n nVar = new M0.n(2, account, num.intValue(), googleSignInAccountB);
            p015f1.d dVar = (p015f1.d) aVar.q();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(dVar.f1580c);
            int i3 = Z0.a.f1676a;
            parcelObtain.writeInt(1);
            int iQ = H2.h.Q(parcelObtain, 20293);
            H2.h.P(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            H2.h.J(parcelObtain, 2, nVar, 0);
            H2.h.R(parcelObtain, iQ);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                dVar.f1579b.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e3) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f860c.post(new A.a(this, new p015f1.f(1, new J0.a(8, null, null), null), 3, false));
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
