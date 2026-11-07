package I1;

import M1.C0052a;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Z1.l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A.c f501l;

    public /* synthetic */ k(A.c cVar, int i3) {
        this.f500k = i3;
        this.f501l = cVar;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        List listD0;
        List listD1;
        List listD2;
        List listD3;
        List listD4;
        List listD5;
        List listD6;
        List listD7;
        List listD8;
        List listD9;
        O1.d dVar = (O1.d) obj;
        switch (this.f500k) {
            case 0:
                Throwable thA = O1.d.a(dVar.f1206k);
                A.c cVar = this.f501l;
                if (thA != null) {
                    if (thA instanceof d) {
                        d dVar2 = (d) thA;
                        listD0 = P1.f.d0(dVar2.f477k, dVar2.f478l, null);
                    } else {
                        listD0 = P1.f.d0(thA.getClass().getSimpleName(), thA.toString(), B1.e.l("Cause: ", thA.getCause(), ", Stacktrace: ", Log.getStackTraceString(thA)));
                    }
                    cVar.e(listD0);
                } else {
                    Object obj2 = dVar.f1206k;
                    cVar.e(E2.a.B((c) (obj2 instanceof O1.c ? null : obj2)));
                }
                break;
            case 1:
                Throwable thA2 = O1.d.a(dVar.f1206k);
                A.c cVar2 = this.f501l;
                if (thA2 != null) {
                    if (thA2 instanceof d) {
                        d dVar3 = (d) thA2;
                        listD1 = P1.f.d0(dVar3.f477k, dVar3.f478l, null);
                    } else {
                        listD1 = P1.f.d0(thA2.getClass().getSimpleName(), thA2.toString(), B1.e.l("Cause: ", thA2.getCause(), ", Stacktrace: ", Log.getStackTraceString(thA2)));
                    }
                    cVar2.e(listD1);
                } else {
                    cVar2.e(E2.a.B(null));
                }
                break;
            case 2:
                Throwable thA3 = O1.d.a(dVar.f1206k);
                A.c cVar3 = this.f501l;
                if (thA3 != null) {
                    if (thA3 instanceof d) {
                        d dVar4 = (d) thA3;
                        listD2 = P1.f.d0(dVar4.f477k, dVar4.f478l, null);
                    } else {
                        listD2 = P1.f.d0(thA3.getClass().getSimpleName(), thA3.toString(), B1.e.l("Cause: ", thA3.getCause(), ", Stacktrace: ", Log.getStackTraceString(thA3)));
                    }
                    cVar3.e(listD2);
                } else {
                    Object obj3 = dVar.f1206k;
                    cVar3.e(E2.a.B((i) (obj3 instanceof O1.c ? null : obj3)));
                }
                break;
            case 3:
                Throwable thA4 = O1.d.a(dVar.f1206k);
                A.c cVar4 = this.f501l;
                if (thA4 != null) {
                    if (thA4 instanceof d) {
                        d dVar5 = (d) thA4;
                        listD3 = P1.f.d0(dVar5.f477k, dVar5.f478l, null);
                    } else {
                        listD3 = P1.f.d0(thA4.getClass().getSimpleName(), thA4.toString(), B1.e.l("Cause: ", thA4.getCause(), ", Stacktrace: ", Log.getStackTraceString(thA4)));
                    }
                    cVar4.e(listD3);
                } else {
                    cVar4.e(E2.a.B(null));
                }
                break;
            case 4:
                Throwable thA5 = O1.d.a(dVar.f1206k);
                A.c cVar5 = this.f501l;
                if (thA5 != null) {
                    if (thA5 instanceof d) {
                        d dVar6 = (d) thA5;
                        listD4 = P1.f.d0(dVar6.f477k, dVar6.f478l, null);
                    } else {
                        listD4 = P1.f.d0(thA5.getClass().getSimpleName(), thA5.toString(), B1.e.l("Cause: ", thA5.getCause(), ", Stacktrace: ", Log.getStackTraceString(thA5)));
                    }
                    cVar5.e(listD4);
                } else {
                    cVar5.e(E2.a.B(null));
                }
                break;
            case 5:
                Throwable thA6 = O1.d.a(dVar.f1206k);
                A.c cVar6 = this.f501l;
                if (thA6 != null) {
                    if (thA6 instanceof J1.d) {
                        J1.d dVar7 = (J1.d) thA6;
                        listD5 = P1.f.d0(dVar7.f584k, dVar7.f585l, null);
                    } else {
                        listD5 = P1.f.d0(thA6.getClass().getSimpleName(), thA6.toString(), B1.e.l("Cause: ", thA6.getCause(), ", Stacktrace: ", Log.getStackTraceString(thA6)));
                    }
                    cVar6.e(listD5);
                } else {
                    Object obj4 = dVar.f1206k;
                    cVar6.e(E2.a.B((List) (obj4 instanceof O1.c ? null : obj4)));
                }
                break;
            case 6:
                Throwable thA7 = O1.d.a(dVar.f1206k);
                A.c cVar7 = this.f501l;
                if (thA7 != null) {
                    if (thA7 instanceof J1.d) {
                        J1.d dVar8 = (J1.d) thA7;
                        listD6 = P1.f.d0(dVar8.f584k, dVar8.f585l, null);
                    } else {
                        listD6 = P1.f.d0(thA7.getClass().getSimpleName(), thA7.toString(), B1.e.l("Cause: ", thA7.getCause(), ", Stacktrace: ", Log.getStackTraceString(thA7)));
                    }
                    cVar7.e(listD6);
                } else {
                    Object obj5 = dVar.f1206k;
                    cVar7.e(E2.a.B((List) (obj5 instanceof O1.c ? null : obj5)));
                }
                break;
            case 7:
                Throwable thA8 = O1.d.a(dVar.f1206k);
                A.c cVar8 = this.f501l;
                if (thA8 != null) {
                    if (thA8 instanceof J1.d) {
                        J1.d dVar9 = (J1.d) thA8;
                        listD7 = P1.f.d0(dVar9.f584k, dVar9.f585l, null);
                    } else {
                        listD7 = P1.f.d0(thA8.getClass().getSimpleName(), thA8.toString(), B1.e.l("Cause: ", thA8.getCause(), ", Stacktrace: ", Log.getStackTraceString(thA8)));
                    }
                    cVar8.e(listD7);
                } else {
                    Object obj6 = dVar.f1206k;
                    cVar8.e(E2.a.B((List) (obj6 instanceof O1.c ? null : obj6)));
                }
                break;
            case 8:
                Throwable thA9 = O1.d.a(dVar.f1206k);
                A.c cVar9 = this.f501l;
                if (thA9 != null) {
                    if (thA9 instanceof C0052a) {
                        C0052a c0052a = (C0052a) thA9;
                        listD8 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                    } else {
                        listD8 = P1.f.d0(thA9.getClass().getSimpleName(), thA9.toString(), B1.e.l("Cause: ", thA9.getCause(), ", Stacktrace: ", Log.getStackTraceString(thA9)));
                    }
                    cVar9.e(listD8);
                } else {
                    Object obj7 = dVar.f1206k;
                    if (obj7 instanceof O1.c) {
                        obj7 = null;
                    }
                    cVar9.e(E2.a.B((Boolean) obj7));
                }
                break;
            default:
                Throwable thA10 = O1.d.a(dVar.f1206k);
                A.c cVar10 = this.f501l;
                if (thA10 != null) {
                    if (thA10 instanceof C0052a) {
                        C0052a c0052a2 = (C0052a) thA10;
                        listD9 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                    } else {
                        listD9 = P1.f.d0(thA10.getClass().getSimpleName(), thA10.toString(), B1.e.l("Cause: ", thA10.getCause(), ", Stacktrace: ", Log.getStackTraceString(thA10)));
                    }
                    cVar10.e(listD9);
                } else {
                    Object obj8 = dVar.f1206k;
                    if (obj8 instanceof O1.c) {
                        obj8 = null;
                    }
                    cVar10.e(E2.a.B((String) obj8));
                }
                break;
        }
        return O1.g.f1211a;
    }
}
