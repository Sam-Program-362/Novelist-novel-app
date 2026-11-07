package M1;

import D.C0002c;
import android.webkit.DownloadListener;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class r implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0069s f1155a;

    public r(C0069s c0069s) {
        this.f1155a = c0069s;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j3) {
        this.f1155a.f1156a.e(new Runnable() { // from class: M1.p
            @Override // java.lang.Runnable
            public final void run() {
                r rVar = r.this;
                C0069s c0069s = rVar.f1155a;
                C0068q c0068q = new C0068q(0);
                String str5 = str;
                a2.h.e(str5, "urlArg");
                String str6 = str2;
                a2.h.e(str6, "userAgentArg");
                String str7 = str3;
                a2.h.e(str7, "contentDispositionArg");
                String str8 = str4;
                a2.h.e(str8, "mimetypeArg");
                O o2 = c0069s.f1156a;
                o2.getClass();
                if (!((C0055d) o2.f1032c).d(rVar)) {
                    B1.e.r("missing-instance-error", "Callback to `DownloadListener.onDownloadStart` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                } else {
                    new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", o2.a(), null).x(P1.f.d0(rVar, str5, str6, str7, str8, Long.valueOf(j3)), new C0002c(c0068q, 8));
                }
            }
        });
    }
}
