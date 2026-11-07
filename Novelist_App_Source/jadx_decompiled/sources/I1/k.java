package I1;

import M1.C0052a;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Z1.l {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f500k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A.c f501l;

    public /* synthetic */ k(A.c cVar, int i3) {
        this.f500k = i3;
        this.f501l = cVar;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        List d02;
        List d03;
        List d04;
        List d05;
        List d06;
        List d07;
        List d08;
        List d09;
        List d010;
        List d011;
        O1.d dVar = (O1.d) obj;
        switch (this.f500k) {
            case 0:
                Throwable a3 = O1.d.a(dVar.f1206k);
                A.c cVar = this.f501l;
                if (a3 != null) {
                    if (a3 instanceof d) {
                        d dVar2 = (d) a3;
                        d02 = P1.f.d0(dVar2.f477k, dVar2.f478l, null);
                    } else {
                        d02 = P1.f.d0(a3.getClass().getSimpleName(), a3.toString(), B1.e.l("Cause: ", a3.getCause(), ", Stacktrace: ", Log.getStackTraceString(a3)));
                    }
                    cVar.e(d02);
                } else {
                    Object obj2 = dVar.f1206k;
                    cVar.e(E2.a.B((c) (obj2 instanceof O1.c ? null : obj2)));
                }
                break;
            case 1:
                Throwable a4 = O1.d.a(dVar.f1206k);
                A.c cVar2 = this.f501l;
                if (a4 != null) {
                    if (a4 instanceof d) {
                        d dVar3 = (d) a4;
                        d03 = P1.f.d0(dVar3.f477k, dVar3.f478l, null);
                    } else {
                        d03 = P1.f.d0(a4.getClass().getSimpleName(), a4.toString(), B1.e.l("Cause: ", a4.getCause(), ", Stacktrace: ", Log.getStackTraceString(a4)));
                    }
                    cVar2.e(d03);
                } else {
                    cVar2.e(E2.a.B(null));
                }
                break;
            case 2:
                Throwable a5 = O1.d.a(dVar.f1206k);
                A.c cVar3 = this.f501l;
                if (a5 != null) {
                    if (a5 instanceof d) {
                        d dVar4 = (d) a5;
                        d04 = P1.f.d0(dVar4.f477k, dVar4.f478l, null);
                    } else {
                        d04 = P1.f.d0(a5.getClass().getSimpleName(), a5.toString(), B1.e.l("Cause: ", a5.getCause(), ", Stacktrace: ", Log.getStackTraceString(a5)));
                    }
                    cVar3.e(d04);
                } else {
                    Object obj3 = dVar.f1206k;
                    cVar3.e(E2.a.B((i) (obj3 instanceof O1.c ? null : obj3)));
                }
                break;
            case 3:
                Throwable a6 = O1.d.a(dVar.f1206k);
                A.c cVar4 = this.f501l;
                if (a6 != null) {
                    if (a6 instanceof d) {
                        d dVar5 = (d) a6;
                        d05 = P1.f.d0(dVar5.f477k, dVar5.f478l, null);
                    } else {
                        d05 = P1.f.d0(a6.getClass().getSimpleName(), a6.toString(), B1.e.l("Cause: ", a6.getCause(), ", Stacktrace: ", Log.getStackTraceString(a6)));
                    }
                    cVar4.e(d05);
                } else {
                    cVar4.e(E2.a.B(null));
                }
                break;
            case 4:
                Throwable a7 = O1.d.a(dVar.f1206k);
                A.c cVar5 = this.f501l;
                if (a7 != null) {
                    if (a7 instanceof d) {
                        d dVar6 = (d) a7;
                        d06 = P1.f.d0(dVar6.f477k, dVar6.f478l, null);
                    } else {
                        d06 = P1.f.d0(a7.getClass().getSimpleName(), a7.toString(), B1.e.l("Cause: ", a7.getCause(), ", Stacktrace: ", Log.getStackTraceString(a7)));
                    }
                    cVar5.e(d06);
                } else {
                    cVar5.e(E2.a.B(null));
                }
                break;
            case 5:
                Throwable a8 = O1.d.a(dVar.f1206k);
                A.c cVar6 = this.f501l;
                if (a8 != null) {
                    if (a8 instanceof J1.d) {
                        J1.d dVar7 = (J1.d) a8;
                        d07 = P1.f.d0(dVar7.f584k, dVar7.f585l, null);
                    } else {
                        d07 = P1.f.d0(a8.getClass().getSimpleName(), a8.toString(), B1.e.l("Cause: ", a8.getCause(), ", Stacktrace: ", Log.getStackTraceString(a8)));
                    }
                    cVar6.e(d07);
                } else {
                    Object obj4 = dVar.f1206k;
                    cVar6.e(E2.a.B((List) (obj4 instanceof O1.c ? null : obj4)));
                }
                break;
            case 6:
                Throwable a9 = O1.d.a(dVar.f1206k);
                A.c cVar7 = this.f501l;
                if (a9 != null) {
                    if (a9 instanceof J1.d) {
                        J1.d dVar8 = (J1.d) a9;
                        d08 = P1.f.d0(dVar8.f584k, dVar8.f585l, null);
                    } else {
                        d08 = P1.f.d0(a9.getClass().getSimpleName(), a9.toString(), B1.e.l("Cause: ", a9.getCause(), ", Stacktrace: ", Log.getStackTraceString(a9)));
                    }
                    cVar7.e(d08);
                } else {
                    Object obj5 = dVar.f1206k;
                    cVar7.e(E2.a.B((List) (obj5 instanceof O1.c ? null : obj5)));
                }
                break;
            case 7:
                Throwable a10 = O1.d.a(dVar.f1206k);
                A.c cVar8 = this.f501l;
                if (a10 != null) {
                    if (a10 instanceof J1.d) {
                        J1.d dVar9 = (J1.d) a10;
                        d09 = P1.f.d0(dVar9.f584k, dVar9.f585l, null);
                    } else {
                        d09 = P1.f.d0(a10.getClass().getSimpleName(), a10.toString(), B1.e.l("Cause: ", a10.getCause(), ", Stacktrace: ", Log.getStackTraceString(a10)));
                    }
                    cVar8.e(d09);
                } else {
                    Object obj6 = dVar.f1206k;
                    cVar8.e(E2.a.B((List) (obj6 instanceof O1.c ? null : obj6)));
                }
                break;
            case 8:
                Throwable a11 = O1.d.a(dVar.f1206k);
                A.c cVar9 = this.f501l;
                if (a11 != null) {
                    if (a11 instanceof C0052a) {
                        C0052a c0052a = (C0052a) a11;
                        d010 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                    } else {
                        d010 = P1.f.d0(a11.getClass().getSimpleName(), a11.toString(), B1.e.l("Cause: ", a11.getCause(), ", Stacktrace: ", Log.getStackTraceString(a11)));
                    }
                    cVar9.e(d010);
                } else {
                    Object obj7 = dVar.f1206k;
                    if (obj7 instanceof O1.c) {
                        obj7 = null;
                    }
                    cVar9.e(E2.a.B((Boolean) obj7));
                }
                break;
            default:
                Throwable a12 = O1.d.a(dVar.f1206k);
                A.c cVar10 = this.f501l;
                if (a12 != null) {
                    if (a12 instanceof C0052a) {
                        C0052a c0052a2 = (C0052a) a12;
                        d011 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                    } else {
                        d011 = P1.f.d0(a12.getClass().getSimpleName(), a12.toString(), B1.e.l("Cause: ", a12.getCause(), ", Stacktrace: ", Log.getStackTraceString(a12)));
                    }
                    cVar10.e(d011);
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
