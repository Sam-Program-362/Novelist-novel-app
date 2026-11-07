package J1;

import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
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
                    ArrayList arrayListF = nVar.f(intent, false);
                    if (arrayListF != null) {
                        nVar.h(arrayListF);
                    } else {
                        nVar.c("no_valid_image_uri", "Cannot find the selected image.");
                    }
                } else {
                    nVar.e(null);
                }
                break;
            case 1:
                n nVar2 = (n) this.f595l;
                Intent intent2 = (Intent) this.n;
                nVar2.getClass();
                if (this.f596m == -1 && intent2 != null) {
                    ArrayList arrayListF2 = nVar2.f(intent2, false);
                    if (arrayListF2 != null) {
                        nVar2.h(arrayListF2);
                    } else {
                        nVar2.c("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                    }
                } else {
                    nVar2.e(null);
                }
                break;
            case 2:
                n nVar3 = (n) this.f595l;
                Intent intent3 = (Intent) this.n;
                nVar3.getClass();
                if (this.f596m == -1 && intent3 != null) {
                    ArrayList arrayListF3 = nVar3.f(intent3, false);
                    if (arrayListF3 != null) {
                        nVar3.h(arrayListF3);
                    } else {
                        nVar3.c("missing_valid_video_uri", "Cannot find at least one of the selected videos.");
                    }
                } else {
                    nVar3.e(null);
                }
                break;
            case 3:
                n nVar4 = (n) this.f595l;
                Intent intent4 = (Intent) this.n;
                nVar4.getClass();
                if (this.f596m == -1 && intent4 != null) {
                    ArrayList arrayListF4 = nVar4.f(intent4, true);
                    if (arrayListF4 != null) {
                        nVar4.h(arrayListF4);
                    } else {
                        nVar4.c("no_valid_media_uri", "Cannot find the selected media.");
                    }
                } else {
                    nVar4.e(null);
                }
                break;
            case 4:
                n nVar5 = (n) this.f595l;
                Intent intent5 = (Intent) this.n;
                nVar5.getClass();
                if (this.f596m == -1 && intent5 != null) {
                    ArrayList arrayListF5 = nVar5.f(intent5, false);
                    if (arrayListF5 != null && arrayListF5.size() >= 1) {
                        nVar5.e(((m) arrayListF5.get(0)).f603a);
                    } else {
                        nVar5.c("no_valid_video_uri", "Cannot find the selected video.");
                    }
                } else {
                    nVar5.e(null);
                }
                break;
            default:
                ((p029j0.d) ((p029j0.a) this.f595l).f3506c).d(this.f596m, this.n);
                break;
        }
    }
}
