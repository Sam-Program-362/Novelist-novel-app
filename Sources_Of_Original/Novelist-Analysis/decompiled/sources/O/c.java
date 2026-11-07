package O;

import D.AbstractC0019u;
import H.l;
import I.f;
import K0.e;
import M1.A;
import M1.P;
import M1.X;
import O1.g;
import a2.h;
import a2.o;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ResultReceiver {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N.c f1196l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(N.c cVar, Handler handler, int i3) {
        super(handler);
        this.f1195k = i3;
        this.f1196l = cVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i3, Bundle bundle) {
        boolean z3;
        String string;
        Bundle bundle2;
        final l lVar;
        int i4 = this.f1195k;
        N.c cVar = this.f1196l;
        final int i5 = 0;
        h.e(bundle, "resultData");
        switch (i4) {
            case 0:
                d dVar = (d) cVar;
                int i6 = N.c.f1184c;
                final Executor executorD = dVar.d();
                final H.d dVarC = dVar.c();
                CancellationSignal cancellationSignal = dVar.f1200g;
                if (bundle.getBoolean("FAILURE_RESPONSE")) {
                    final f fVarA = A.a(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"));
                    p000a.a.l(cancellationSignal, new Z1.a() { // from class: N.a
                        @Override // Z1.a
                        public final Object a() {
                            switch (i5) {
                                case 0:
                                    executorD.execute(new M.c(dVarC, fVarA, 3));
                                    break;
                                case 1:
                                    executorD.execute(new M.c(dVarC, (l) fVarA, 4));
                                    break;
                                default:
                                    executorD.execute(new e(dVarC, (f) fVarA, 1));
                                    break;
                            }
                            return g.f1211a;
                        }
                    });
                    i5 = 1;
                }
                if (i5 != 0) {
                    return;
                }
                int i7 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                int i8 = N.c.f1183b;
                if (i7 != i8) {
                    Log.w("BeginSignIn", "Returned request code " + i8 + " which  does not match what was given " + i7);
                    return;
                }
                if (p000a.a.J(i3, new N.d(1), new P(dVar, 1), dVar.f1200g)) {
                    return;
                }
                try {
                    p000a.a.l(dVar.f1200g, new N.b(dVar, dVar.b(S0.a.v(dVar.f1197d).e(intent)), 2));
                    return;
                } catch (f e3) {
                    CancellationSignal cancellationSignal2 = dVar.f1200g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (M.h.a(cancellationSignal2)) {
                        return;
                    }
                    dVar.d().execute(new a(dVar, e3, 2));
                    return;
                } catch (e e4) {
                    o oVar = new o();
                    oVar.f1713k = new I.e(e4.getMessage());
                    int i9 = e4.f635k.f2726k;
                    if (i9 == 16) {
                        oVar.f1713k = new I.d(e4.getMessage());
                    } else if (N.c.f1182a.contains(Integer.valueOf(i9))) {
                        oVar.f1713k = new I.g(e4.getMessage());
                    }
                    CancellationSignal cancellationSignal3 = dVar.f1200g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (M.h.a(cancellationSignal3)) {
                        return;
                    }
                    dVar.d().execute(new M.c(dVar, oVar, 7));
                    return;
                } catch (Throwable th) {
                    I.e eVar = new I.e(th.getMessage());
                    CancellationSignal cancellationSignal4 = dVar.f1200g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (M.h.a(cancellationSignal4)) {
                        return;
                    }
                    dVar.d().execute(new M.c(dVar, eVar, 5));
                    return;
                }
            case 1:
                Q.b bVar = (Q.b) cVar;
                int i10 = N.c.f1184c;
                final Executor executorE = bVar.e();
                final H.d dVarD = bVar.d();
                CancellationSignal cancellationSignal5 = bVar.f1228g;
                if (bundle.getBoolean("FAILURE_RESPONSE")) {
                    final f fVarA2 = A.a(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"));
                    p000a.a.l(cancellationSignal5, new Z1.a() { // from class: N.a
                        @Override // Z1.a
                        public final Object a() {
                            switch (i5) {
                                case 0:
                                    executorE.execute(new M.c(dVarD, fVarA2, 3));
                                    break;
                                case 1:
                                    executorE.execute(new M.c(dVarD, (l) fVarA2, 4));
                                    break;
                                default:
                                    executorE.execute(new e(dVarD, (f) fVarA2, 1));
                                    break;
                            }
                            return g.f1211a;
                        }
                    });
                    i5 = 1;
                }
                if (i5 != 0) {
                    return;
                }
                int i11 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                int i12 = N.c.f1183b;
                if (i11 != i12) {
                    Log.w("GetSignInIntent", "Returned request code " + i12 + " which  does not match what was given " + i11);
                    return;
                }
                if (p000a.a.J(i3, new N.d(2), new P(bVar, 2), bVar.f1228g)) {
                    return;
                }
                try {
                    p000a.a.l(bVar.f1228g, new N.b(bVar, bVar.c(S0.a.v(bVar.f1225d).e(intent2)), 3));
                    return;
                } catch (f e5) {
                    CancellationSignal cancellationSignal6 = bVar.f1228g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (M.h.a(cancellationSignal6)) {
                        return;
                    }
                    bVar.e().execute(new Q.a(bVar, e5, 2));
                    return;
                } catch (e e6) {
                    o oVar2 = new o();
                    oVar2.f1713k = new I.e(e6.getMessage());
                    int i13 = e6.f635k.f2726k;
                    if (i13 == 16) {
                        oVar2.f1713k = new I.d(e6.getMessage());
                    } else if (N.c.f1182a.contains(Integer.valueOf(i13))) {
                        oVar2.f1713k = new I.g(e6.getMessage());
                    }
                    CancellationSignal cancellationSignal7 = bVar.f1228g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (M.h.a(cancellationSignal7)) {
                        return;
                    }
                    bVar.e().execute(new M.c(bVar, oVar2, 9));
                    return;
                } catch (Throwable th2) {
                    I.e eVar2 = new I.e(th2.getMessage());
                    CancellationSignal cancellationSignal8 = bVar.f1228g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (M.h.a(cancellationSignal8)) {
                        return;
                    }
                    bVar.e().execute(new M.c(bVar, eVar2, 8));
                    return;
                }
            default:
                R.b bVar2 = (R.b) cVar;
                int i14 = N.c.f1184c;
                final Executor executor = bVar2.f1248f;
                f fVarU = null;
                if (executor == null) {
                    h.g("executor");
                    throw null;
                }
                final H.d dVar2 = bVar2.f1247e;
                if (dVar2 == null) {
                    h.g("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal9 = bVar2.f1249g;
                if (bundle.getBoolean("FAILURE_RESPONSE")) {
                    final f fVarA3 = A.a(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"));
                    p000a.a.l(cancellationSignal9, new Z1.a() { // from class: N.a
                        @Override // Z1.a
                        public final Object a() {
                            switch (i5) {
                                case 0:
                                    executor.execute(new M.c(dVar2, fVarA3, 3));
                                    break;
                                case 1:
                                    executor.execute(new M.c(dVar2, (l) fVarA3, 4));
                                    break;
                                default:
                                    executor.execute(new e(dVar2, (f) fVarA3, 1));
                                    break;
                            }
                            return g.f1211a;
                        }
                    });
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    return;
                }
                int i15 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent3 = (Intent) H2.h.p(bundle, "RESULT_DATA", Intent.class);
                final Executor executor2 = bVar2.f1248f;
                if (executor2 == null) {
                    h.g("executor");
                    throw null;
                }
                final H.d dVar3 = bVar2.f1247e;
                if (dVar3 == null) {
                    h.g("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal10 = bVar2.f1249g;
                int i16 = N.c.f1183b;
                if (i15 != i16) {
                    Log.w("GetCredentialController", "Returned request code " + i16 + " which  does not match what was given " + i15);
                    return;
                }
                int i17 = 1;
                if (p000a.a.J(i3, new N.d(0), new X(executor2, dVar3, i17), cancellationSignal10)) {
                    return;
                }
                if (intent3 == null) {
                    p000a.a.l(cancellationSignal10, new N.b(executor2, dVar3, i17));
                    return;
                }
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 34) {
                    lVar = AbstractC0019u.b(intent3);
                } else {
                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    lVar = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new l(H2.h.j(string, bundle2));
                }
                if (lVar != null) {
                    final int i19 = 1;
                    p000a.a.l(cancellationSignal10, new Z1.a() { // from class: N.a
                        @Override // Z1.a
                        public final Object a() {
                            switch (i19) {
                                case 0:
                                    executor2.execute(new M.c(dVar3, lVar, 3));
                                    break;
                                case 1:
                                    executor2.execute(new M.c(dVar3, (l) lVar, 4));
                                    break;
                                default:
                                    executor2.execute(new e(dVar3, (f) lVar, 1));
                                    break;
                            }
                            return g.f1211a;
                        }
                    });
                    return;
                }
                if (i18 >= 34) {
                    fVarU = AbstractC0019u.a(intent3);
                } else {
                    int i20 = f.f466k;
                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 != null) {
                        String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string2 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        fVarU = E2.a.U(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                    }
                }
                final f fVar = fVarU;
                final int i21 = 2;
                p000a.a.l(cancellationSignal10, new Z1.a() { // from class: N.a
                    @Override // Z1.a
                    public final Object a() {
                        switch (i21) {
                            case 0:
                                executor2.execute(new M.c(dVar3, fVar, 3));
                                break;
                            case 1:
                                executor2.execute(new M.c(dVar3, (l) fVar, 4));
                                break;
                            default:
                                executor2.execute(new e(dVar3, (f) fVar, 1));
                                break;
                        }
                        return g.f1211a;
                    }
                });
                return;
        }
    }
}
