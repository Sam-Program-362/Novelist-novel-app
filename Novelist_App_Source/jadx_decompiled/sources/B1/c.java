package B1;

import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;
import t1.C0475c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final s f82a;

    public c(C0475c c0475c, int i3) {
        switch (i3) {
            case 1:
                b bVar = new b(3);
                s sVar = new s(c0475c, "flutter/navigation", C1.k.f176a, null);
                this.f82a = sVar;
                sVar.z(bVar);
                break;
            default:
                b bVar2 = new b(0);
                s sVar2 = new s(c0475c, "flutter/backgesture", C1.r.f180a, null);
                this.f82a = sVar2;
                sVar2.z(bVar2);
                break;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
