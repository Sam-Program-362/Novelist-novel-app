package M;

import B1.s;
import D.C0002c;
import H.l;
import H0.i;
import M1.C0055d;
import M1.C0068q;
import M1.C0069s;
import M1.C0074x;
import M1.O;
import a2.o;
import android.graphics.Typeface;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.tika.embedder.ExternalEmbedder;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.pipes.async.AsyncProcessor;
import org.apache.tika.pipes.pipesiterator.TotalCounter;
import org.apache.tika.utils.StringUtils;
import p002b.t;
import p031k.C0240s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f886m;

    public /* synthetic */ c(Object obj, Object obj2, int i3) {
        this.f884k = i3;
        this.f885l = obj;
        this.f886m = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        switch (this.f884k) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0((H.d) this.f885l, (Exception) this.f886m);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0((H.d) this.f885l, (o) this.f886m);
                return;
            case 2:
                C0074x c0074x = (C0074x) this.f885l;
                String str = (String) this.f886m;
                C0069s c0069s = c0074x.f1169b;
                C0068q c0068q = new C0068q(0);
                a2.h.e(str, "messageArg");
                O o2 = c0069s.f1156a;
                o2.getClass();
                if (((C0055d) o2.f1032c).d(c0074x)) {
                    new s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", o2.a(), null).x(P1.f.d0(c0074x, str), new C0002c(c0068q, 10));
                    return;
                } else {
                    B1.e.r("missing-instance-error", "Callback to `JavaScriptChannel.postMessage` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                    return;
                }
            case 3:
                ((H.d) this.f885l).b(this.f886m);
                return;
            case 4:
                ((H.d) this.f885l).onResult((l) this.f886m);
                return;
            case 5:
                ((O.d) this.f885l).c().b((I.e) this.f886m);
                return;
            case 6:
                ((O.d) this.f885l).c().onResult((l) this.f886m);
                return;
            case 7:
                ((O.d) this.f885l).c().b(((o) this.f886m).f1713k);
                return;
            case 8:
                ((Q.b) this.f885l).d().b((I.e) this.f886m);
                return;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                ((Q.b) this.f885l).d().b(((o) this.f886m).f1713k);
                return;
            case 10:
                ((Q.b) this.f885l).d().onResult((l) this.f886m);
                return;
            case 11:
                ((Q.b) this.f885l).d().b((I.i) this.f886m);
                return;
            case 12:
                SignInHubActivity signInHubActivity = (SignInHubActivity) this.f885l;
                signInHubActivity.f4439k.a(new p002b.c((t) this.f886m, signInHubActivity));
                return;
            case 13:
                ViewGroup viewGroup = (ViewGroup) this.f885l;
                a2.h.e(viewGroup, "$container");
                viewGroup.endViewTransition(null);
                throw null;
            case 14:
                ((B1.o) ((B1.o) this.f885l).f131b).d(this.f886m);
                return;
            case 15:
                p033k1.g gVar = (p033k1.g) this.f885l;
                p033k1.f fVar = (p033k1.f) this.f886m;
                gVar.getClass();
                fVar.f3835b.run();
                gVar.f3841f = fVar;
                gVar.f3840e.run();
                return;
            case 16:
                B1.i iVar2 = (B1.i) this.f885l;
                p033k1.g gVar2 = (p033k1.g) this.f886m;
                synchronized (iVar2) {
                    try {
                        HashSet hashSet = new HashSet((HashSet) iVar2.f97e);
                        ((HashSet) iVar2.f98f).remove(gVar2);
                        ((HashSet) iVar2.f97e).add(gVar2);
                        p033k1.f fVar2 = gVar2.f3841f;
                        if (fVar2 == null || (iVar = fVar2.f3834a) == null || !((p033k1.e) iVar.f443l).k()) {
                            p033k1.f fVar3 = gVar2.f3841f;
                            if ((fVar3 != null ? fVar3.a() : null) != null) {
                                HashMap map = (HashMap) iVar2.f99g;
                                p033k1.f fVar4 = gVar2.f3841f;
                                map.remove(fVar4 != null ? fVar4.a() : null);
                            }
                        }
                        iVar2.e(gVar2);
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            iVar2.e((p033k1.g) it2.next());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                ExternalParser.lambda$sendInput$1((Process) this.f885l, (InputStream) this.f886m);
                return;
            case 18:
                ((AsyncProcessor) this.f885l).lambda$startCounter$1((TotalCounter) this.f886m);
                return;
            case 19:
                ((C0240s) this.f885l).b((Typeface) this.f886m);
                return;
            default:
                ExternalEmbedder.lambda$multiThreadedStreamCopy$2((InputStream) this.f885l, (OutputStream) this.f886m);
                return;
        }
    }
}
