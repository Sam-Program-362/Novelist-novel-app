package J1;

import android.app.Activity;
import android.media.MediaScannerConnection;
import android.net.Uri;
import io.flutter.plugin.platform.ViewOnSystemUiVisibilityChangeListenerC0313e;
import java.io.File;
import java.util.Arrays;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f597k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f599m;

    public /* synthetic */ j(Object obj, int i3, int i4) {
        this.f597k = i4;
        this.f598l = obj;
        this.f599m = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f597k) {
            case 0:
                n nVar = (n) this.f598l;
                if (this.f599m != -1) {
                    nVar.e(null);
                    break;
                } else {
                    Uri uri = nVar.f613t;
                    B1.a aVar = nVar.f609p;
                    String str = StringUtils.EMPTY;
                    if (uri == null) {
                        uri = Uri.parse(nVar.n.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", StringUtils.EMPTY));
                    }
                    final k kVar = new k(nVar, 0);
                    Activity activity = (Activity) aVar.f80l;
                    if (uri != null) {
                        str = uri.getPath();
                    }
                    MediaScannerConnection.scanFile(activity, new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: J1.l
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str2, Uri uri2) {
                            q qVar;
                            k kVar2 = k.this;
                            int i3 = kVar2.f600a;
                            n nVar2 = kVar2.f601b;
                            switch (i3) {
                                case 0:
                                    synchronized (nVar2.f614v) {
                                        A0.j jVar = nVar2.u;
                                        qVar = jVar != null ? (q) jVar.f57l : null;
                                    }
                                    if (qVar == null) {
                                        nVar2.e(str2);
                                        return;
                                    }
                                    String c3 = nVar2.f607m.c(str2, qVar.f619a, qVar.f620b, (int) qVar.f621c);
                                    if (c3 != null && !c3.equals(str2)) {
                                        new File(str2).delete();
                                    }
                                    nVar2.e(c3);
                                    return;
                                default:
                                    nVar2.e(str2);
                                    return;
                            }
                        }
                    });
                    break;
                }
            case 1:
                n nVar2 = (n) this.f598l;
                if (this.f599m != -1) {
                    nVar2.e(null);
                    break;
                } else {
                    Uri uri2 = nVar2.f613t;
                    B1.a aVar2 = nVar2.f609p;
                    String str2 = StringUtils.EMPTY;
                    if (uri2 == null) {
                        uri2 = Uri.parse(nVar2.n.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", StringUtils.EMPTY));
                    }
                    final k kVar2 = new k(nVar2, 1);
                    Activity activity2 = (Activity) aVar2.f80l;
                    if (uri2 != null) {
                        str2 = uri2.getPath();
                    }
                    MediaScannerConnection.scanFile(activity2, new String[]{str2}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: J1.l
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str22, Uri uri22) {
                            q qVar;
                            k kVar22 = k.this;
                            int i3 = kVar22.f600a;
                            n nVar22 = kVar22.f601b;
                            switch (i3) {
                                case 0:
                                    synchronized (nVar22.f614v) {
                                        A0.j jVar = nVar22.u;
                                        qVar = jVar != null ? (q) jVar.f57l : null;
                                    }
                                    if (qVar == null) {
                                        nVar22.e(str22);
                                        return;
                                    }
                                    String c3 = nVar22.f607m.c(str22, qVar.f619a, qVar.f620b, (int) qVar.f621c);
                                    if (c3 != null && !c3.equals(str22)) {
                                        new File(str22).delete();
                                    }
                                    nVar22.e(c3);
                                    return;
                                default:
                                    nVar22.e(str22);
                                    return;
                            }
                        }
                    });
                    break;
                }
            default:
                A.c cVar = ((ViewOnSystemUiVisibilityChangeListenerC0313e) this.f598l).f3175b.f3177b;
                if ((this.f599m & 4) != 0) {
                    ((B1.s) cVar.f6l).s("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                    break;
                } else {
                    ((B1.s) cVar.f6l).s("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    break;
                }
        }
    }
}
