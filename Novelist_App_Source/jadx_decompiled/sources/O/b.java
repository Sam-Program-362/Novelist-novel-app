package O;

import I.f;
import I.g;
import I.j;
import K0.e;
import M.h;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements g1.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1192k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f1193l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N.c f1194m;

    public /* synthetic */ b(N.c cVar, CancellationSignal cancellationSignal, int i3) {
        this.f1192k = i3;
        this.f1194m = cVar;
        this.f1193l = cancellationSignal;
    }

    @Override // g1.c
    public final void b(Exception exc) {
        f dVar;
        f dVar2;
        switch (this.f1192k) {
            case 0:
                d dVar3 = (d) this.f1194m;
                String str = ((exc instanceof e) && N.c.f1182a.contains(Integer.valueOf(((e) exc).f635k.f2726k))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + exc.getMessage();
                int hashCode = str.hashCode();
                if (hashCode == -1567968963) {
                    if (str.equals("GET_CANCELED_TAG")) {
                        dVar = new I.d(str2);
                    }
                    dVar = new I.e(str2);
                } else if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        dVar = new j(str2);
                    }
                    dVar = new I.e(str2);
                } else {
                    if (str.equals("GET_INTERRUPTED")) {
                        dVar = new g(str2);
                    }
                    dVar = new I.e(str2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a(this.f1193l)) {
                    dVar3.d().execute(new a(dVar3, dVar, 0));
                    break;
                }
                break;
            default:
                Q.b bVar = (Q.b) this.f1194m;
                String str3 = ((exc instanceof e) && N.c.f1182a.contains(Integer.valueOf(((e) exc).f635k.f2726k))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str4 = "During get sign-in intent, failure response from one tap: " + exc.getMessage();
                int hashCode2 = str3.hashCode();
                if (hashCode2 == -1567968963) {
                    if (str3.equals("GET_CANCELED_TAG")) {
                        dVar2 = new I.d(str4);
                    }
                    dVar2 = new I.e(str4);
                } else if (hashCode2 != -154594663) {
                    if (hashCode2 == 1996705159 && str3.equals("GET_NO_CREDENTIALS")) {
                        dVar2 = new j(str4);
                    }
                    dVar2 = new I.e(str4);
                } else {
                    if (str3.equals("GET_INTERRUPTED")) {
                        dVar2 = new g(str4);
                    }
                    dVar2 = new I.e(str4);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!h.a(this.f1193l)) {
                    bVar.e().execute(new Q.a(bVar, dVar2, 1));
                    break;
                }
                break;
        }
    }
}
