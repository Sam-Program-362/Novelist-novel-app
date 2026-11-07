package A0;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u0.C0481a;
import x0.C0492b;
import x0.C0493c;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f51b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f52a;

    public g() {
        B1.e.q("verificationMode", 3);
        this.f52a = 3;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (a2.h.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return a2.h.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (a((SidecarDisplayFeature) list.get(i3), (SidecarDisplayFeature) list2.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    public final ArrayList c(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0493c e3 = e((SidecarDisplayFeature) it2.next(), sidecarDeviceState);
            if (e3 != null) {
                arrayList.add(e3);
            }
        }
        return arrayList;
    }

    public final x0.j d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new x0.j(P1.m.f1219k);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        b.d(sidecarDeviceState2, b.b(sidecarDeviceState));
        return new x0.j(c(b.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final C0493c e(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C0492b c0492b;
        C0492b c0492b2 = C0492b.f4684o;
        a2.h.e(sidecarDisplayFeature, "feature");
        int i3 = this.f52a;
        B1.e.q("verificationMode", i3);
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new u0.g(sidecarDisplayFeature, i3, C0481a.f4584a).L("Type must be either TYPE_FOLD or TYPE_HINGE", c.f47l).L("Feature bounds must not be 0", d.f48l).L("TYPE_FOLD must have 0 area", e.f49l).L("Feature be pinned to either left or top", f.f50l).e();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c0492b = C0492b.f4686q;
        } else {
            if (type != 2) {
                return null;
            }
            c0492b = C0492b.f4687r;
        }
        int b3 = b.b(sidecarDeviceState);
        if (b3 == 0 || b3 == 1) {
            return null;
        }
        if (b3 == 2) {
            c0492b2 = C0492b.f4685p;
        } else if (b3 != 3 && b3 == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        a2.h.d(rect, "feature.rect");
        return new C0493c(new u0.b(rect), c0492b, c0492b2);
    }
}
