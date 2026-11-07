package M1;

import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements C1.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f1020l;

    public /* synthetic */ I(P p3, int i3) {
        this.f1019k = i3;
        this.f1020l = p3;
    }

    @Override // C1.c
    public final void e(Object obj) {
        switch (this.f1019k) {
            case 0:
                Z1.l lVar = (Z1.l) this.f1020l.f1036l;
                if (!(obj instanceof List)) {
                    lVar.f(new Q(H2.h.i(new C0052a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", StringUtils.EMPTY))));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        lVar.f(new Q((String) list.get(0)));
                    } else {
                        Object obj2 = list.get(0);
                        a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        lVar.f(new Q(H2.h.i(new C0052a((String) obj2, (String) obj3, (String) list.get(2)))));
                    }
                }
                break;
            case 1:
                Z1.l lVar2 = (Z1.l) this.f1020l.f1036l;
                if (!(obj instanceof List)) {
                    lVar2.f(new Q(H2.h.i(new C0052a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", StringUtils.EMPTY))));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        lVar2.f(new Q(O1.g.f1211a));
                    } else {
                        Object obj4 = list2.get(0);
                        a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        lVar2.f(new Q(H2.h.i(new C0052a((String) obj4, (String) obj5, (String) list2.get(2)))));
                    }
                }
                break;
            case 2:
                Z1.l lVar3 = (Z1.l) this.f1020l.f1036l;
                if (!(obj instanceof List)) {
                    lVar3.f(new Q(H2.h.i(new C0052a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", StringUtils.EMPTY))));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        lVar3.f(new Q(H2.h.i(new C0052a((String) obj6, (String) obj7, (String) list3.get(2)))));
                    } else if (list3.get(0) != null) {
                        Object obj8 = list3.get(0);
                        a2.h.c(obj8, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        lVar3.f(new Q((List) obj8));
                    } else {
                        lVar3.f(new Q(H2.h.i(new C0052a("null-error", "Flutter api returned null value for non-null return value.", StringUtils.EMPTY))));
                    }
                }
                break;
            default:
                Z1.l lVar4 = (Z1.l) this.f1020l.f1036l;
                if (!(obj instanceof List)) {
                    lVar4.f(new Q(H2.h.i(new C0052a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", StringUtils.EMPTY))));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj9 = list4.get(0);
                        a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        lVar4.f(new Q(H2.h.i(new C0052a((String) obj9, (String) obj10, (String) list4.get(2)))));
                    } else if (list4.get(0) != null) {
                        Object obj11 = list4.get(0);
                        a2.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                        lVar4.f(new Q((Boolean) obj11));
                    } else {
                        lVar4.f(new Q(H2.h.i(new C0052a("null-error", "Flutter api returned null value for non-null return value.", StringUtils.EMPTY))));
                    }
                }
                break;
        }
    }
}
