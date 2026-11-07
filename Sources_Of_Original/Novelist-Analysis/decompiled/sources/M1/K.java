package M1;

import android.util.Log;
import android.view.View;
import android.webkit.WebStorage;
import java.util.List;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K implements C1.c, C1.b, N1.c, p019g1.d, v2.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1024l;

    public /* synthetic */ K(Object obj, int i3) {
        this.f1023k = i3;
        this.f1024l = obj;
    }

    @Override // C1.b
    public void a(Object obj, A.c cVar) {
        List listD0;
        List listD1;
        switch (this.f1023k) {
            case 2:
                C0061j c0061j = (C0061j) this.f1024l;
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0055d) c0061j.f1123a.f1032c).a(((Long) obj2).longValue(), WebStorage.getInstance());
                    listD0 = E2.a.B(null);
                    break;
                } catch (Throwable th) {
                    if (th instanceof C0052a) {
                        C0052a c0052a = th;
                        listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                    } else {
                        listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                    }
                }
                cVar.e(listD0);
                break;
            default:
                C0065n c0065n = (C0065n) this.f1024l;
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0055d) c0065n.f1145a.f1032c).a(((Long) obj3).longValue(), new g0(c0065n));
                    listD1 = E2.a.B(null);
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
                break;
        }
    }

    @Override // N1.c
    public boolean b(View view) {
        for (Class cls : (Class[]) this.f1024l) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    @Override // p019g1.d
    public void c(Object obj) {
        switch (this.f1023k) {
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                ((X) this.f1024l).f(obj);
                break;
            case 10:
                ((X) this.f1024l).f(obj);
                break;
            default:
                ((R.a) this.f1024l).f(obj);
                break;
        }
    }

    @Override // v2.b
    public Object d(x2.b bVar) {
        return (x2.c) this.f1024l;
    }

    @Override // C1.c
    public void e(Object obj) {
        switch (this.f1023k) {
            case 0:
                Object obj2 = ((C0058g) this.f1024l).f1113l;
                if (!(obj instanceof List)) {
                    B1.e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", StringUtils.EMPTY, "WebSettings", obj2);
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj3 = list.get(0);
                        a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        B1.e.n(new C0052a((String) obj3, (String) obj4, (String) list.get(2)), "WebSettings", obj2);
                    }
                }
                break;
            case 1:
                Object obj5 = ((C0058g) this.f1024l).f1113l;
                if (!(obj instanceof List)) {
                    B1.e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", StringUtils.EMPTY, "WebStorage", obj5);
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj6 = list2.get(0);
                        a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list2.get(1);
                        a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        B1.e.n(new C0052a((String) obj6, (String) obj7, (String) list2.get(2)), "WebStorage", obj5);
                    }
                }
                break;
            case 2:
            case 5:
            default:
                Object obj8 = ((C0058g) this.f1024l).f1113l;
                if (!(obj instanceof List)) {
                    B1.e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", StringUtils.EMPTY, "X509Certificate", obj8);
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj9 = list3.get(0);
                        a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list3.get(1);
                        a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        B1.e.n(new C0052a((String) obj9, (String) obj10, (String) list3.get(2)), "X509Certificate", obj8);
                    }
                }
                break;
            case 3:
                Object obj11 = ((C0058g) this.f1024l).f1113l;
                if (!(obj instanceof List)) {
                    B1.e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", StringUtils.EMPTY, "WebView", obj11);
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj12 = list4.get(0);
                        a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list4.get(1);
                        a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        B1.e.n(new C0052a((String) obj12, (String) obj13, (String) list4.get(2)), "WebView", obj11);
                    }
                }
                break;
            case 4:
                Object obj14 = ((C0058g) this.f1024l).f1113l;
                if (!(obj instanceof List)) {
                    B1.e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", StringUtils.EMPTY, "WebViewClient", obj14);
                } else {
                    List list5 = (List) obj;
                    if (list5.size() > 1) {
                        Object obj15 = list5.get(0);
                        a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        Object obj16 = list5.get(1);
                        a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        B1.e.n(new C0052a((String) obj15, (String) obj16, (String) list5.get(2)), "WebViewClient", obj14);
                    }
                }
                break;
            case 6:
                Object obj17 = ((C0058g) this.f1024l).f1113l;
                if (!(obj instanceof List)) {
                    B1.e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", StringUtils.EMPTY, "WebViewPoint", obj17);
                } else {
                    List list6 = (List) obj;
                    if (list6.size() > 1) {
                        Object obj18 = list6.get(0);
                        a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list6.get(1);
                        a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        B1.e.n(new C0052a((String) obj18, (String) obj19, (String) list6.get(2)), "WebViewPoint", obj17);
                    }
                }
                break;
        }
    }
}
