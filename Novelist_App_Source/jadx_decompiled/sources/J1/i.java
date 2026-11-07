package J1;

import android.content.Intent;
import j0.C0315a;
import j0.InterfaceC0318d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f594k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f595l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f596m;
    public final /* synthetic */ Object n;

    public /* synthetic */ i(Object obj, int i3, Object obj2, int i4) {
        this.f594k = i4;
        this.f595l = obj;
        this.f596m = i3;
        this.n = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f594k) {
            case 0:
                n nVar = (n) this.f595l;
                Intent intent = (Intent) this.n;
                nVar.getClass();
                if (this.f596m == -1 && intent != null) {
                    ArrayList f3 = nVar.f(intent, false);
                    if (f3 != null) {
                        nVar.h(f3);
                        break;
                    } else {
                        nVar.c("no_valid_image_uri", "Cannot find the selected image.");
                        break;
                    }
                } else {
                    nVar.e(null);
                    break;
                }
            case 1:
                n nVar2 = (n) this.f595l;
                Intent intent2 = (Intent) this.n;
                nVar2.getClass();
                if (this.f596m == -1 && intent2 != null) {
                    ArrayList f4 = nVar2.f(intent2, false);
                    if (f4 != null) {
                        nVar2.h(f4);
                        break;
                    } else {
                        nVar2.c("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                        break;
                    }
                } else {
                    nVar2.e(null);
                    break;
                }
            case 2:
                n nVar3 = (n) this.f595l;
                Intent intent3 = (Intent) this.n;
                nVar3.getClass();
                if (this.f596m == -1 && intent3 != null) {
                    ArrayList f5 = nVar3.f(intent3, false);
                    if (f5 != null) {
                        nVar3.h(f5);
                        break;
                    } else {
                        nVar3.c("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                        break;
                    }
                } else {
                    nVar3.e(null);
                    break;
                }
            case 3:
                n nVar4 = (n) this.f595l;
                Intent intent4 = (Intent) this.n;
                nVar4.getClass();
                if (this.f596m == -1 && intent4 != null) {
                    ArrayList f6 = nVar4.f(intent4, true);
                    if (f6 != null) {
                        nVar4.h(f6);
                        break;
                    } else {
                        nVar4.c("no_valid_media_uri", "Cannot find the selected media.");
                        break;
                    }
                } else {
                    nVar4.e(null);
                    break;
                }
            case 4:
                n nVar5 = (n) this.f595l;
                Intent intent5 = (Intent) this.n;
                nVar5.getClass();
                if (this.f596m == -1 && intent5 != null) {
                    ArrayList f7 = nVar5.f(intent5, false);
                    if (f7 != null && f7.size() >= 1) {
                        nVar5.e(((m) f7.get(0)).f603a);
                        break;
                    } else {
                        nVar5.c("no_valid_video_uri", "Cannot find the selected video.");
                        break;
                    }
                } else {
                    nVar5.e(null);
                    break;
                }
            default:
                ((InterfaceC0318d) ((C0315a) this.f595l).f3506c).d(this.f596m, this.n);
                break;
        }
    }
}
