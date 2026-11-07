package J1;

import android.app.Activity;
import android.media.MediaScannerConnection;
import android.net.Uri;
import io.flutter.plugin.platform.ViewOnSystemUiVisibilityChangeListenerC0222e;
import java.io.File;
import java.util.Arrays;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
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
                } else {
                    Uri uri = nVar.f613t;
                    B1.a aVar = nVar.f609p;
                    String path = StringUtils.EMPTY;
                    if (uri == null) {
                        uri = Uri.parse(nVar.n.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", StringUtils.EMPTY));
                    }
                    final k kVar = new k(nVar, 0);
                    Activity activity = (Activity) aVar.f80l;
                    if (uri != null) {
                        path = uri.getPath();
                    }
                    MediaScannerConnection.scanFile(activity, new String[]{path}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: J1.l
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str, Uri uri2) throws Throwable {
                            q qVar;
                            k kVar2 = kVar;
                            int i3 = kVar2.f600a;
                            n nVar2 = kVar2.f601b;
                            switch (i3) {
                                case 0:
                                    synchronized (nVar2.f614v) {
                                        A0.j jVar = nVar2.u;
                                        qVar = jVar != null ? (q) jVar.f57l : null;
                                        break;
                                    }
                                    if (qVar == null) {
                                        nVar2.e(str);
                                        return;
                                    }
                                    String strC = nVar2.f607m.c(str, qVar.f619a, qVar.f620b, (int) qVar.f621c);
                                    if (strC != null && !strC.equals(str)) {
                                        new File(str).delete();
                                    }
                                    nVar2.e(strC);
                                    return;
                                default:
                                    nVar2.e(str);
                                    return;
                            }
                        }
                    });
                }
                break;
            case 1:
                n nVar2 = (n) this.f598l;
                if (this.f599m != -1) {
                    nVar2.e(null);
                } else {
                    Uri uri2 = nVar2.f613t;
                    B1.a aVar2 = nVar2.f609p;
                    String path2 = StringUtils.EMPTY;
                    if (uri2 == null) {
                        uri2 = Uri.parse(nVar2.n.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", StringUtils.EMPTY));
                    }
                    final k kVar2 = new k(nVar2, 1);
                    Activity activity2 = (Activity) aVar2.f80l;
                    if (uri2 != null) {
                        path2 = uri2.getPath();
                    }
                    MediaScannerConnection.scanFile(activity2, new String[]{path2}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: J1.l
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str, Uri uri3) throws Throwable {
                            q qVar;
                            k kVar3 = kVar2;
                            int i3 = kVar3.f600a;
                            n nVar3 = kVar3.f601b;
                            switch (i3) {
                                case 0:
                                    synchronized (nVar3.f614v) {
                                        A0.j jVar = nVar3.u;
                                        qVar = jVar != null ? (q) jVar.f57l : null;
                                        break;
                                    }
                                    if (qVar == null) {
                                        nVar3.e(str);
                                        return;
                                    }
                                    String strC = nVar3.f607m.c(str, qVar.f619a, qVar.f620b, (int) qVar.f621c);
                                    if (strC != null && !strC.equals(str)) {
                                        new File(str).delete();
                                    }
                                    nVar3.e(strC);
                                    return;
                                default:
                                    nVar3.e(str);
                                    return;
                            }
                        }
                    });
                }
                break;
            default:
                A.c cVar = ((ViewOnSystemUiVisibilityChangeListenerC0222e) this.f598l).f3175b.f3177b;
                if ((this.f599m & 4) != 0) {
                    ((B1.s) cVar.f6l).s("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                } else {
                    ((B1.s) cVar.f6l).s("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                }
                break;
        }
    }
}
