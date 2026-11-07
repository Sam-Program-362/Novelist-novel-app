package M1;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: M1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0066o implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayManager f1147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1148c;

    public /* synthetic */ C0066o(Object obj, DisplayManager displayManager, int i3) {
        this.f1146a = i3;
        this.f1148c = obj;
        this.f1147b = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i3) {
        switch (this.f1146a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f1148c;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((DisplayManager.DisplayListener) obj).onDisplayAdded(i3);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i3) {
        switch (this.f1146a) {
            case 0:
                if (this.f1147b.getDisplay(i3) != null) {
                    ArrayList arrayList = (ArrayList) this.f1148c;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((DisplayManager.DisplayListener) obj).onDisplayChanged(i3);
                    }
                    break;
                }
                break;
            default:
                if (i3 == 0) {
                    float refreshRate = this.f1147b.getDisplay(0).getRefreshRate();
                    io.flutter.view.s sVar = (io.flutter.view.s) this.f1148c;
                    sVar.f3381a = (long) (1.0E9d / ((double) refreshRate));
                    sVar.f3382b.setRefreshRateFPS(refreshRate);
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i3) {
        switch (this.f1146a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f1148c;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((DisplayManager.DisplayListener) obj).onDisplayRemoved(i3);
                }
                break;
        }
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }
}
