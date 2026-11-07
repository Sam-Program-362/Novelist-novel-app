package M1;

import D.InterfaceC0014o;
import android.util.Log;
import android.view.View;
import android.webkit.WebViewClient;
import java.io.IOException;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N implements C1.c, C1.b, InterfaceC0014o, N1.c, v2.a, v2.c, v2.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1029k;

    public /* synthetic */ N(int i3) {
        this.f1029k = i3;
    }

    @Override // C1.b
    public void a(Object obj, A.c cVar) {
        List listD0;
        List listD1;
        switch (this.f1029k) {
            case 10:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebViewClient");
                WebViewClient webViewClient = (WebViewClient) obj2;
                Object obj3 = list.get(1);
                a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                try {
                    if (!(webViewClient instanceof g0)) {
                        throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                    }
                    ((g0) webViewClient).f1116b = zBooleanValue;
                    listD0 = E2.a.B(null);
                    cVar.e(listD0);
                    return;
                } catch (Throwable th) {
                    if (th instanceof C0052a) {
                        C0052a c0052a = th;
                        listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                    } else {
                        listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                    }
                }
                break;
            default:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    listD1 = E2.a.B(Boolean.valueOf(p000a.a.H((String) obj4)));
                    break;
                } catch (Throwable th2) {
                    if (th2 instanceof C0052a) {
                        C0052a c0052a2 = th2;
                        listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                    } else {
                        listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                    }
                }
                cVar.e(listD1);
                return;
        }
    }

    @Override // v2.a
    public void accept(Object obj) throws IOException {
        switch (this.f1029k) {
            case 15:
                throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", Integer.MAX_VALUE));
            default:
                throw ((IOException) obj);
        }
    }

    @Override // N1.c
    public boolean b(View view) {
        return view.hasFocus();
    }

    @Override // D.InterfaceC0014o
    public D.h0 c(D.h0 h0Var) {
        return h0Var;
    }

    @Override // v2.b
    public Object d(x2.b bVar) {
        return x2.a.f4718k;
    }

    @Override // C1.c
    public void e(Object obj) {
        switch (this.f1029k) {
            case 0:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", StringUtils.EMPTY);
                    int i3 = g0.f1114c;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        int i4 = g0.f1114c;
                    } else {
                        Object obj2 = list.get(0);
                        a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i5 = g0.f1114c;
                    }
                }
                break;
            case 1:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", StringUtils.EMPTY);
                    int i6 = g0.f1114c;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i7 = g0.f1114c;
                    } else {
                        Object obj4 = list2.get(0);
                        a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i8 = g0.f1114c;
                    }
                }
                break;
            case 2:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", StringUtils.EMPTY);
                    int i9 = g0.f1114c;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i10 = g0.f1114c;
                    } else {
                        Object obj6 = list3.get(0);
                        a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i11 = g0.f1114c;
                    }
                }
                break;
            case 3:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", StringUtils.EMPTY);
                    int i12 = g0.f1114c;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i13 = g0.f1114c;
                    } else {
                        Object obj8 = list4.get(0);
                        a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i14 = g0.f1114c;
                    }
                }
                break;
            case 4:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", StringUtils.EMPTY);
                    int i15 = g0.f1114c;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i16 = g0.f1114c;
                    } else {
                        Object obj10 = list5.get(0);
                        a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i17 = g0.f1114c;
                    }
                }
                break;
            case 5:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", StringUtils.EMPTY);
                    int i18 = g0.f1114c;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i19 = g0.f1114c;
                    } else {
                        Object obj12 = list6.get(0);
                        a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i20 = g0.f1114c;
                    }
                }
                break;
            case 6:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", StringUtils.EMPTY);
                    int i21 = g0.f1114c;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i22 = g0.f1114c;
                    } else {
                        Object obj14 = list7.get(0);
                        a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i23 = g0.f1114c;
                    }
                }
                break;
            case 7:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", StringUtils.EMPTY);
                    int i24 = g0.f1114c;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        int i25 = g0.f1114c;
                    } else {
                        Object obj16 = list8.get(0);
                        a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        a2.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i26 = g0.f1114c;
                    }
                }
                break;
            case 8:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", StringUtils.EMPTY);
                    int i27 = g0.f1114c;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i28 = g0.f1114c;
                    } else {
                        Object obj18 = list9.get(0);
                        a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i29 = g0.f1114c;
                    }
                }
                break;
            default:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", StringUtils.EMPTY);
                    int i30 = g0.f1114c;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        int i31 = g0.f1114c;
                    } else {
                        Object obj20 = list10.get(0);
                        a2.h.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj20, (String) obj21, (String) list10.get(2)));
                        int i32 = g0.f1114c;
                    }
                }
                break;
        }
    }

    public /* synthetic */ N(Object obj, int i3) {
        this.f1029k = i3;
    }
}
