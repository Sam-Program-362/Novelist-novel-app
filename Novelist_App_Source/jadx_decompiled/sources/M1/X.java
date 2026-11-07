package M1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import android.webkit.JsPromptResult;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class X implements Z1.l {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1057k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1058l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1059m;

    public /* synthetic */ X(Object obj, Object obj2, int i3) {
        this.f1057k = i3;
        this.f1058l = obj;
        this.f1059m = obj2;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        switch (this.f1057k) {
            case 0:
                Z z3 = (Z) this.f1058l;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f1059m;
                Q q3 = (Q) obj;
                if (!q3.f1040d) {
                    String str = (String) q3.f1038b;
                    if (str == null) {
                        jsPromptResult.cancel();
                        break;
                    } else {
                        jsPromptResult.confirm(str);
                        break;
                    }
                } else {
                    O o2 = z3.f1064b.f1145a;
                    Throwable th = q3.f1039c;
                    Objects.requireNonNull(th);
                    o2.getClass();
                    O.d(th);
                    break;
                }
            case 1:
                Executor executor = (Executor) this.f1058l;
                H.d dVar = (H.d) this.f1059m;
                I.f fVar = (I.f) obj;
                a2.h.e(fVar, "e");
                executor.execute(new N.e(dVar, fVar, 0));
                break;
            case 2:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1058l;
                O.d dVar2 = (O.d) this.f1059m;
                Context context = dVar2.f1197d;
                F0.h hVar = (F0.h) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!M.h.a(cancellationSignal)) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    N.c.a(dVar2.f1201h, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", hVar.f325k);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!M.h.a(cancellationSignal)) {
                            dVar2.d().execute(new RunnableC0053b(dVar2, 1));
                        }
                    }
                }
                break;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1058l;
                Q.b bVar = (Q.b) this.f1059m;
                Context context2 = bVar.f1225d;
                PendingIntent pendingIntent = (PendingIntent) obj;
                a2.h.e(pendingIntent, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!M.h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    N.c.a(bVar.f1229h, intent2, "SIGN_IN_INTENT");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!M.h.a(cancellationSignal2)) {
                            bVar.e().execute(new RunnableC0053b(bVar, 2));
                        }
                    }
                }
                break;
        }
        return O1.g.f1211a;
    }
}
