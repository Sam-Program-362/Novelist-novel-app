package K1;

import android.util.Log;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: K1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0027c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0027c f713a = new C0027c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O1.e f714b = new O1.e(new I1.l(2));

    public static C1.l a() {
        return (C1.l) f714b.a();
    }

    public static void b(C1.f fVar, final C0025a c0025a) {
        a2.h.e(fVar, "binaryMessenger");
        p057t1.a aVarA = fVar.a(new C1.k());
        B1.s sVar = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", StringUtils.EMPTY), a(), aVarA);
        if (c0025a != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: K1.b
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
                    switch (i3) {
                        case 0:
                            InterfaceC0028d interfaceC0028d = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD0 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d).f709k.edit().remove((String) obj2).commit()));
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0028d interfaceC0028d2 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                listD1 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d2).f709k.edit().putBoolean(str, ((Boolean) obj4).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0028d interfaceC0028d3 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d3).c(str2, (String) obj6)));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0028d interfaceC0028d4 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d4).f709k.edit().putLong(str3, ((Long) obj8).longValue()).commit()));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0028d interfaceC0028d5 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj10).doubleValue();
                            try {
                                C0025a c0025a2 = (C0025a) interfaceC0028d5;
                                c0025a2.getClass();
                                String string = Double.toString(dDoubleValue);
                                listD4 = E2.a.B(Boolean.valueOf(c0025a2.f709k.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0028d interfaceC0028d6 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD5 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d6).f709k.edit().putString(str5, (String) obj12).commit()));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0028d interfaceC0028d7 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list7 = (List) obj14;
                            try {
                                C0025a c0025a3 = (C0025a) interfaceC0028d7;
                                listD6 = E2.a.B(Boolean.valueOf(c0025a3.f709k.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0025a3.f710l.e(list7)).commit()));
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0028d interfaceC0028d8 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD7 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d8).a((String) obj15, (List) list8.get(1))));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        default:
                            InterfaceC0028d interfaceC0028d9 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD8 = E2.a.B(((C0025a) interfaceC0028d9).b((String) obj16, (List) list9.get(1)));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        B1.s sVar2 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", StringUtils.EMPTY), a(), aVarA);
        if (c0025a != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: K1.b
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
                    switch (i4) {
                        case 0:
                            InterfaceC0028d interfaceC0028d = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD0 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d).f709k.edit().remove((String) obj2).commit()));
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0028d interfaceC0028d2 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                listD1 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d2).f709k.edit().putBoolean(str, ((Boolean) obj4).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0028d interfaceC0028d3 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d3).c(str2, (String) obj6)));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0028d interfaceC0028d4 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d4).f709k.edit().putLong(str3, ((Long) obj8).longValue()).commit()));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0028d interfaceC0028d5 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj10).doubleValue();
                            try {
                                C0025a c0025a2 = (C0025a) interfaceC0028d5;
                                c0025a2.getClass();
                                String string = Double.toString(dDoubleValue);
                                listD4 = E2.a.B(Boolean.valueOf(c0025a2.f709k.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0028d interfaceC0028d6 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD5 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d6).f709k.edit().putString(str5, (String) obj12).commit()));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0028d interfaceC0028d7 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list7 = (List) obj14;
                            try {
                                C0025a c0025a3 = (C0025a) interfaceC0028d7;
                                listD6 = E2.a.B(Boolean.valueOf(c0025a3.f709k.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0025a3.f710l.e(list7)).commit()));
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0028d interfaceC0028d8 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD7 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d8).a((String) obj15, (List) list8.get(1))));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        default:
                            InterfaceC0028d interfaceC0028d9 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD8 = E2.a.B(((C0025a) interfaceC0028d9).b((String) obj16, (List) list9.get(1)));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        B1.s sVar3 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", StringUtils.EMPTY), a(), aVarA);
        if (c0025a != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: K1.b
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
                    switch (i5) {
                        case 0:
                            InterfaceC0028d interfaceC0028d = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD0 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d).f709k.edit().remove((String) obj2).commit()));
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0028d interfaceC0028d2 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                listD1 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d2).f709k.edit().putBoolean(str, ((Boolean) obj4).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0028d interfaceC0028d3 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d3).c(str2, (String) obj6)));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0028d interfaceC0028d4 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d4).f709k.edit().putLong(str3, ((Long) obj8).longValue()).commit()));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0028d interfaceC0028d5 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj10).doubleValue();
                            try {
                                C0025a c0025a2 = (C0025a) interfaceC0028d5;
                                c0025a2.getClass();
                                String string = Double.toString(dDoubleValue);
                                listD4 = E2.a.B(Boolean.valueOf(c0025a2.f709k.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0028d interfaceC0028d6 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD5 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d6).f709k.edit().putString(str5, (String) obj12).commit()));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0028d interfaceC0028d7 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list7 = (List) obj14;
                            try {
                                C0025a c0025a3 = (C0025a) interfaceC0028d7;
                                listD6 = E2.a.B(Boolean.valueOf(c0025a3.f709k.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0025a3.f710l.e(list7)).commit()));
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0028d interfaceC0028d8 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD7 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d8).a((String) obj15, (List) list8.get(1))));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        default:
                            InterfaceC0028d interfaceC0028d9 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD8 = E2.a.B(((C0025a) interfaceC0028d9).b((String) obj16, (List) list9.get(1)));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        B1.s sVar4 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", StringUtils.EMPTY), a(), aVarA);
        if (c0025a != null) {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: K1.b
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
                    switch (i6) {
                        case 0:
                            InterfaceC0028d interfaceC0028d = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD0 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d).f709k.edit().remove((String) obj2).commit()));
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0028d interfaceC0028d2 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                listD1 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d2).f709k.edit().putBoolean(str, ((Boolean) obj4).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0028d interfaceC0028d3 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d3).c(str2, (String) obj6)));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0028d interfaceC0028d4 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d4).f709k.edit().putLong(str3, ((Long) obj8).longValue()).commit()));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0028d interfaceC0028d5 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj10).doubleValue();
                            try {
                                C0025a c0025a2 = (C0025a) interfaceC0028d5;
                                c0025a2.getClass();
                                String string = Double.toString(dDoubleValue);
                                listD4 = E2.a.B(Boolean.valueOf(c0025a2.f709k.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0028d interfaceC0028d6 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD5 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d6).f709k.edit().putString(str5, (String) obj12).commit()));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0028d interfaceC0028d7 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list7 = (List) obj14;
                            try {
                                C0025a c0025a3 = (C0025a) interfaceC0028d7;
                                listD6 = E2.a.B(Boolean.valueOf(c0025a3.f709k.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0025a3.f710l.e(list7)).commit()));
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0028d interfaceC0028d8 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD7 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d8).a((String) obj15, (List) list8.get(1))));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        default:
                            InterfaceC0028d interfaceC0028d9 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD8 = E2.a.B(((C0025a) interfaceC0028d9).b((String) obj16, (List) list9.get(1)));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        B1.s sVar5 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", StringUtils.EMPTY), a(), aVarA);
        if (c0025a != null) {
            final int i7 = 4;
            sVar5.y(new C1.b() { // from class: K1.b
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
                    switch (i7) {
                        case 0:
                            InterfaceC0028d interfaceC0028d = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD0 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d).f709k.edit().remove((String) obj2).commit()));
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0028d interfaceC0028d2 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                listD1 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d2).f709k.edit().putBoolean(str, ((Boolean) obj4).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0028d interfaceC0028d3 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d3).c(str2, (String) obj6)));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0028d interfaceC0028d4 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d4).f709k.edit().putLong(str3, ((Long) obj8).longValue()).commit()));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0028d interfaceC0028d5 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj10).doubleValue();
                            try {
                                C0025a c0025a2 = (C0025a) interfaceC0028d5;
                                c0025a2.getClass();
                                String string = Double.toString(dDoubleValue);
                                listD4 = E2.a.B(Boolean.valueOf(c0025a2.f709k.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0028d interfaceC0028d6 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD5 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d6).f709k.edit().putString(str5, (String) obj12).commit()));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0028d interfaceC0028d7 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list7 = (List) obj14;
                            try {
                                C0025a c0025a3 = (C0025a) interfaceC0028d7;
                                listD6 = E2.a.B(Boolean.valueOf(c0025a3.f709k.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0025a3.f710l.e(list7)).commit()));
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0028d interfaceC0028d8 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD7 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d8).a((String) obj15, (List) list8.get(1))));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        default:
                            InterfaceC0028d interfaceC0028d9 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD8 = E2.a.B(((C0025a) interfaceC0028d9).b((String) obj16, (List) list9.get(1)));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                    }
                }
            });
        } else {
            sVar5.y(null);
        }
        B1.s sVar6 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", StringUtils.EMPTY), a(), aVarA);
        if (c0025a != null) {
            final int i8 = 5;
            sVar6.y(new C1.b() { // from class: K1.b
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
                    switch (i8) {
                        case 0:
                            InterfaceC0028d interfaceC0028d = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD0 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d).f709k.edit().remove((String) obj2).commit()));
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0028d interfaceC0028d2 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                listD1 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d2).f709k.edit().putBoolean(str, ((Boolean) obj4).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0028d interfaceC0028d3 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d3).c(str2, (String) obj6)));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0028d interfaceC0028d4 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d4).f709k.edit().putLong(str3, ((Long) obj8).longValue()).commit()));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0028d interfaceC0028d5 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj10).doubleValue();
                            try {
                                C0025a c0025a2 = (C0025a) interfaceC0028d5;
                                c0025a2.getClass();
                                String string = Double.toString(dDoubleValue);
                                listD4 = E2.a.B(Boolean.valueOf(c0025a2.f709k.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0028d interfaceC0028d6 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD5 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d6).f709k.edit().putString(str5, (String) obj12).commit()));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0028d interfaceC0028d7 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list7 = (List) obj14;
                            try {
                                C0025a c0025a3 = (C0025a) interfaceC0028d7;
                                listD6 = E2.a.B(Boolean.valueOf(c0025a3.f709k.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0025a3.f710l.e(list7)).commit()));
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0028d interfaceC0028d8 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD7 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d8).a((String) obj15, (List) list8.get(1))));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        default:
                            InterfaceC0028d interfaceC0028d9 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD8 = E2.a.B(((C0025a) interfaceC0028d9).b((String) obj16, (List) list9.get(1)));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                    }
                }
            });
        } else {
            sVar6.y(null);
        }
        B1.s sVar7 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", StringUtils.EMPTY), a(), aVarA);
        if (c0025a != null) {
            final int i9 = 6;
            sVar7.y(new C1.b() { // from class: K1.b
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
                    switch (i9) {
                        case 0:
                            InterfaceC0028d interfaceC0028d = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD0 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d).f709k.edit().remove((String) obj2).commit()));
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0028d interfaceC0028d2 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                listD1 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d2).f709k.edit().putBoolean(str, ((Boolean) obj4).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0028d interfaceC0028d3 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d3).c(str2, (String) obj6)));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0028d interfaceC0028d4 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d4).f709k.edit().putLong(str3, ((Long) obj8).longValue()).commit()));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0028d interfaceC0028d5 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj10).doubleValue();
                            try {
                                C0025a c0025a2 = (C0025a) interfaceC0028d5;
                                c0025a2.getClass();
                                String string = Double.toString(dDoubleValue);
                                listD4 = E2.a.B(Boolean.valueOf(c0025a2.f709k.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0028d interfaceC0028d6 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD5 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d6).f709k.edit().putString(str5, (String) obj12).commit()));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0028d interfaceC0028d7 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list7 = (List) obj14;
                            try {
                                C0025a c0025a3 = (C0025a) interfaceC0028d7;
                                listD6 = E2.a.B(Boolean.valueOf(c0025a3.f709k.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0025a3.f710l.e(list7)).commit()));
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0028d interfaceC0028d8 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD7 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d8).a((String) obj15, (List) list8.get(1))));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        default:
                            InterfaceC0028d interfaceC0028d9 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD8 = E2.a.B(((C0025a) interfaceC0028d9).b((String) obj16, (List) list9.get(1)));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                    }
                }
            });
        } else {
            sVar7.y(null);
        }
        B1.s sVar8 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", StringUtils.EMPTY), a(), aVarA);
        if (c0025a != null) {
            final int i10 = 7;
            sVar8.y(new C1.b() { // from class: K1.b
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
                    switch (i10) {
                        case 0:
                            InterfaceC0028d interfaceC0028d = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD0 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d).f709k.edit().remove((String) obj2).commit()));
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0028d interfaceC0028d2 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                listD1 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d2).f709k.edit().putBoolean(str, ((Boolean) obj4).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0028d interfaceC0028d3 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d3).c(str2, (String) obj6)));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0028d interfaceC0028d4 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d4).f709k.edit().putLong(str3, ((Long) obj8).longValue()).commit()));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0028d interfaceC0028d5 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj10).doubleValue();
                            try {
                                C0025a c0025a2 = (C0025a) interfaceC0028d5;
                                c0025a2.getClass();
                                String string = Double.toString(dDoubleValue);
                                listD4 = E2.a.B(Boolean.valueOf(c0025a2.f709k.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0028d interfaceC0028d6 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD5 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d6).f709k.edit().putString(str5, (String) obj12).commit()));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0028d interfaceC0028d7 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list7 = (List) obj14;
                            try {
                                C0025a c0025a3 = (C0025a) interfaceC0028d7;
                                listD6 = E2.a.B(Boolean.valueOf(c0025a3.f709k.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0025a3.f710l.e(list7)).commit()));
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0028d interfaceC0028d8 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD7 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d8).a((String) obj15, (List) list8.get(1))));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        default:
                            InterfaceC0028d interfaceC0028d9 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD8 = E2.a.B(((C0025a) interfaceC0028d9).b((String) obj16, (List) list9.get(1)));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                    }
                }
            });
        } else {
            sVar8.y(null);
        }
        B1.s sVar9 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", StringUtils.EMPTY), a(), aVarA);
        if (c0025a == null) {
            sVar9.y(null);
        } else {
            final int i11 = 8;
            sVar9.y(new C1.b() { // from class: K1.b
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
                    switch (i11) {
                        case 0:
                            InterfaceC0028d interfaceC0028d = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD0 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d).f709k.edit().remove((String) obj2).commit()));
                            } catch (Throwable th) {
                                listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            InterfaceC0028d interfaceC0028d2 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                listD1 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d2).f709k.edit().putBoolean(str, ((Boolean) obj4).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            InterfaceC0028d interfaceC0028d3 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d3).c(str2, (String) obj6)));
                            } catch (Throwable th3) {
                                listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            InterfaceC0028d interfaceC0028d4 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d4).f709k.edit().putLong(str3, ((Long) obj8).longValue()).commit()));
                            } catch (Throwable th4) {
                                listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            InterfaceC0028d interfaceC0028d5 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj10).doubleValue();
                            try {
                                C0025a c0025a2 = (C0025a) interfaceC0028d5;
                                c0025a2.getClass();
                                String string = Double.toString(dDoubleValue);
                                listD4 = E2.a.B(Boolean.valueOf(c0025a2.f709k.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit()));
                            } catch (Throwable th5) {
                                listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            InterfaceC0028d interfaceC0028d6 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD5 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d6).f709k.edit().putString(str5, (String) obj12).commit()));
                            } catch (Throwable th6) {
                                listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            InterfaceC0028d interfaceC0028d7 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj13 = list6.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj13;
                            Object obj14 = list6.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list7 = (List) obj14;
                            try {
                                C0025a c0025a3 = (C0025a) interfaceC0028d7;
                                listD6 = E2.a.B(Boolean.valueOf(c0025a3.f709k.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0025a3.f710l.e(list7)).commit()));
                            } catch (Throwable th7) {
                                listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            InterfaceC0028d interfaceC0028d8 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD7 = E2.a.B(Boolean.valueOf(((C0025a) interfaceC0028d8).a((String) obj15, (List) list8.get(1))));
                            } catch (Throwable th8) {
                                listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            cVar.e(listD7);
                            break;
                        default:
                            InterfaceC0028d interfaceC0028d9 = c0025a;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                listD8 = E2.a.B(((C0025a) interfaceC0028d9).b((String) obj16, (List) list9.get(1)));
                            } catch (Throwable th9) {
                                listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            cVar.e(listD8);
                            break;
                    }
                }
            });
        }
    }
}
