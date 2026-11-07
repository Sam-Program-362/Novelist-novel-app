package K1;

import android.util.Log;
import java.util.List;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: K1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0030f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0030f f718a = new C0030f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O1.e f719b = new O1.e(new I1.l(3));

    public static C1.l a() {
        return (C1.l) f719b.a();
    }

    public static void b(C1.f fVar, final InterfaceC0031g interfaceC0031g, String str) {
        a2.h.e(fVar, "binaryMessenger");
        String strConcat = str.length() > 0 ? ".".concat(str) : StringUtils.EMPTY;
        p057t1.a aVarA = fVar.a(new C1.k());
        B1.s sVar = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i3 = 6;
            sVar.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i3) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        B1.s sVar2 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i4 = 12;
            sVar2.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i4) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        B1.s sVar3 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i5 = 13;
            sVar3.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i5) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        B1.s sVar4 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i6 = 14;
            sVar4.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i6) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        B1.s sVar5 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i7 = 0;
            sVar5.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i7) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar5.y(null);
        }
        B1.s sVar6 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i8 = 1;
            sVar6.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i8) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar6.y(null);
        }
        B1.s sVar7 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i9 = 2;
            sVar7.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i9) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar7.y(null);
        }
        B1.s sVar8 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i10 = 3;
            sVar8.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i10) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar8.y(null);
        }
        B1.s sVar9 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i11 = 4;
            sVar9.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i11) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar9.y(null);
        }
        B1.s sVar10 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i12 = 5;
            sVar10.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i12) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar10.y(null);
        }
        B1.s sVar11 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i13 = 7;
            sVar11.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i13) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar11.y(null);
        }
        B1.s sVar12 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i14 = 8;
            sVar12.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i14) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar12.y(null);
        }
        B1.s sVar13 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i15 = 9;
            sVar13.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i15) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar13.y(null);
        }
        B1.s sVar14 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", strConcat), a(), aVarA);
        if (interfaceC0031g != null) {
            final int i16 = 10;
            sVar14.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i16) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        } else {
            sVar14.y(null);
        }
        B1.s sVar15 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", strConcat), a(), aVarA);
        if (interfaceC0031g == null) {
            sVar15.y(null);
        } else {
            final int i17 = 11;
            sVar15.y(new C1.b() { // from class: K1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    switch (i17) {
                        case 0:
                            InterfaceC0031g interfaceC0031g2 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g2.n(str2, str3, (C0032h) obj4);
                                listD0 = E2.a.B(null);
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0031g interfaceC0031g3 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g3.e(str4, list3, (C0032h) obj7);
                                listD1 = E2.a.B(null);
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0031g interfaceC0031g4 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD2 = E2.a.B(interfaceC0031g4.m(str5, (C0032h) obj9));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0031g interfaceC0031g5 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD3 = E2.a.B(interfaceC0031g5.p(str6, (C0032h) obj11));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0031g interfaceC0031g6 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD4 = E2.a.B(interfaceC0031g6.r(str7, (C0032h) obj13));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0031g interfaceC0031g7 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD5 = E2.a.B(interfaceC0031g7.a(str8, (C0032h) obj15));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0031g interfaceC0031g8 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g8.j(str9, zBooleanValue, (C0032h) obj18);
                                listD6 = E2.a.B(null);
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0031g interfaceC0031g9 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD7 = E2.a.B(interfaceC0031g9.d(str10, (C0032h) obj20));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            InterfaceC0031g interfaceC0031g10 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD8 = E2.a.B(interfaceC0031g10.i(str11, (C0032h) obj22));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            InterfaceC0031g interfaceC0031g11 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g11.c(list12, (C0032h) obj23);
                                listD9 = E2.a.B(null);
                            } catch (Throwable th10) {
                                listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            InterfaceC0031g interfaceC0031g12 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD10 = E2.a.B(interfaceC0031g12.g(list14, (C0032h) obj24));
                            } catch (Throwable th11) {
                                listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            InterfaceC0031g interfaceC0031g13 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listD11 = E2.a.B(interfaceC0031g13.q(list16, (C0032h) obj25));
                            } catch (Throwable th12) {
                                listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            InterfaceC0031g interfaceC0031g14 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            a2.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g14.l(str12, str13, (C0032h) obj28);
                                listD12 = E2.a.B(null);
                            } catch (Throwable th13) {
                                listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            InterfaceC0031g interfaceC0031g15 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            a2.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            a2.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g15.f(str14, jLongValue, (C0032h) obj31);
                                listD13 = E2.a.B(null);
                            } catch (Throwable th14) {
                                listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            cVar.e(listD13);
                            break;
                        default:
                            InterfaceC0031g interfaceC0031g16 = interfaceC0031g;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0031g16.b(str15, dDoubleValue, (C0032h) obj34);
                                listD14 = E2.a.B(null);
                            } catch (Throwable th15) {
                                listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            cVar.e(listD14);
                            break;
                    }
                }
            });
        }
    }
}
