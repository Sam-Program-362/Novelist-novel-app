package M1;

import android.hardware.display.DisplayManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: M1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0069s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f1156a;

    public C0069s(O o2, int i3) {
        switch (i3) {
            case 1:
                a2.h.e(o2, "pigeonRegistrar");
                this.f1156a = o2;
                break;
            case 2:
                a2.h.e(o2, "pigeonRegistrar");
                this.f1156a = o2;
                break;
            case 3:
                a2.h.e(o2, "pigeonRegistrar");
                this.f1156a = o2;
                break;
            case 4:
                a2.h.e(o2, "pigeonRegistrar");
                this.f1156a = o2;
                break;
            default:
                a2.h.e(o2, "pigeonRegistrar");
                this.f1156a = o2;
                break;
        }
    }

    public k0 a() {
        DisplayManager displayManager = (DisplayManager) this.f1156a.f1030a.getSystemService("display");
        ArrayList arrayListY = E2.a.Y(displayManager);
        k0 k0Var = new k0(this);
        ArrayList arrayListY2 = E2.a.Y(displayManager);
        arrayListY2.removeAll(arrayListY);
        if (!arrayListY2.isEmpty()) {
            int size = arrayListY2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListY2.get(i3);
                i3++;
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) obj);
                displayManager.registerDisplayListener(new C0066o(arrayListY2, displayManager, 0), null);
            }
        }
        return k0Var;
    }
}
