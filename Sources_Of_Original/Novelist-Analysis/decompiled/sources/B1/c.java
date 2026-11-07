package B1;

import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f82a;

    public c(p057t1.c cVar, int i3) {
        switch (i3) {
            case 1:
                b bVar = new b(3);
                s sVar = new s(cVar, "flutter/navigation", C1.k.f176a, null);
                this.f82a = sVar;
                sVar.z(bVar);
                break;
            default:
                b bVar2 = new b(0);
                s sVar2 = new s(cVar, "flutter/backgesture", C1.r.f180a, null);
                this.f82a = sVar2;
                sVar2.z(bVar2);
                break;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put("progress", Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }
}
