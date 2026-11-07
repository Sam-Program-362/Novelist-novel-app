package A0;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f51b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
            p064x0.c cVarE = e((SidecarDisplayFeature) it2.next(), sidecarDeviceState);
            if (cVarE != null) {
                arrayList.add(cVarE);
            }
        }
        return arrayList;
    }

    public final p064x0.j d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new p064x0.j(P1.m.f1219k);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        b.d(sidecarDeviceState2, b.b(sidecarDeviceState));
        return new p064x0.j(c(b.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final p064x0.c e(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        p064x0.b bVar;
        p064x0.b bVar2 = p064x0.b.f4684o;
        a2.h.e(sidecarDisplayFeature, "feature");
        int i3 = this.f52a;
        B1.e.q("verificationMode", i3);
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new p058u0.g(sidecarDisplayFeature, i3, p058u0.a.f4584a).L("Type must be either TYPE_FOLD or TYPE_HINGE", c.f47l).L("Feature bounds must not be 0", d.f48l).L("TYPE_FOLD must have 0 area", e.f49l).L("Feature be pinned to either left or top", f.f50l).e();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVar = p064x0.b.f4686q;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = p064x0.b.f4687r;
        }
        int iB = b.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            bVar2 = p064x0.b.f4685p;
        } else if (iB != 3 && iB == 4) {
            return null;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        a2.h.d(rect, "feature.rect");
        return new p064x0.c(new p058u0.b(rect), bVar, bVar2);
    }
}
