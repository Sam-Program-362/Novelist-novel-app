package I1;

import K1.C0032h;
import K1.N;
import K1.P;
import M1.EnumC0062k;
import M1.EnumC0070t;
import M1.EnumC0075y;
import M1.EnumC0076z;
import M1.S;
import M1.l0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class u extends C1.q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f521d;

    public /* synthetic */ u(int i3) {
        this.f521d = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v36, types: [I1.b[]] */
    /* JADX WARN: Type inference failed for: r2v38, types: [I1.f[]] */
    /* JADX WARN: Type inference failed for: r2v59, types: [J1.c[]] */
    /* JADX WARN: Type inference failed for: r2v61, types: [J1.u[]] */
    /* JADX WARN: Type inference failed for: r2v63, types: [J1.s[]] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [I1.b] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [I1.f] */
    /* JADX WARN: Type inference failed for: r6v5, types: [J1.c] */
    /* JADX WARN: Type inference failed for: r6v6, types: [J1.u] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [J1.s] */
    @Override // C1.q
    public Object f(byte b3, ByteBuffer byteBuffer) {
        ?? r6;
        ?? r7;
        switch (this.f521d) {
            case 0:
                a2.h.e(byteBuffer, "buffer");
                int i3 = 0;
                if (b3 == -127) {
                    Long l3 = (Long) e(byteBuffer);
                    if (l3 == null) {
                        return null;
                    }
                    int iLongValue = (int) l3.longValue();
                    f.f482l.getClass();
                    ?? Values = f.values();
                    int length = Values.length;
                    while (i3 < length) {
                        r6 = Values[i3];
                        if (r6.f491k != iLongValue) {
                            i3++;
                        }
                    }
                    return null;
                }
                if (b3 == -126) {
                    Long l4 = (Long) e(byteBuffer);
                    if (l4 == null) {
                        return null;
                    }
                    int iLongValue2 = (int) l4.longValue();
                    b.f470l.getClass();
                    ?? Values2 = b.values();
                    int length2 = Values2.length;
                    while (i3 < length2) {
                        r6 = Values2[i3];
                        if (r6.f476k != iLongValue2) {
                            i3++;
                        }
                    }
                    return null;
                }
                if (b3 == -125) {
                    Object objE = e(byteBuffer);
                    List list = objE instanceof List ? (List) objE : null;
                    if (list == null) {
                        return null;
                    }
                    Object obj = list.get(0);
                    a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    return new v((List) obj, (String) list.get(1), (String) list.get(2), (String) list.get(3));
                }
                if (b3 == -124) {
                    Object objE2 = e(byteBuffer);
                    List list2 = objE2 instanceof List ? (List) objE2 : null;
                    if (list2 == null) {
                        return null;
                    }
                    Object obj2 = list2.get(0);
                    a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    Object obj3 = list2.get(1);
                    a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestGoogleIdOptionParams");
                    return new h(zBooleanValue, (g) obj3, (String) list2.get(2), (String) list2.get(3), (String) list2.get(4));
                }
                if (b3 == -123) {
                    Object objE3 = e(byteBuffer);
                    List list3 = objE3 instanceof List ? (List) objE3 : null;
                    if (list3 == null) {
                        return null;
                    }
                    Object obj4 = list3.get(0);
                    a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                    Object obj5 = list3.get(1);
                    a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                    return new g(zBooleanValue2, ((Boolean) obj5).booleanValue());
                }
                if (b3 == -122) {
                    Object objE4 = e(byteBuffer);
                    List list4 = objE4 instanceof List ? (List) objE4 : null;
                    if (list4 == null) {
                        return null;
                    }
                    Object obj6 = list4.get(0);
                    a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                    Object obj7 = list4.get(1);
                    a2.h.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    return new y((String) obj6, (List) obj7);
                }
                if (b3 == -121) {
                    Object objE5 = e(byteBuffer);
                    List list5 = objE5 instanceof List ? (List) objE5 : null;
                    if (list5 == null) {
                        return null;
                    }
                    String str = (String) list5.get(0);
                    String str2 = (String) list5.get(1);
                    String str3 = (String) list5.get(2);
                    Object obj8 = list5.get(3);
                    a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                    String str4 = (String) obj8;
                    Object obj9 = list5.get(4);
                    a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                    return new x(str, str2, str3, str4, (String) obj9, (String) list5.get(5));
                }
                if (b3 == -120) {
                    Object objE6 = e(byteBuffer);
                    List list6 = objE6 instanceof List ? (List) objE6 : null;
                    if (list6 == null) {
                        return null;
                    }
                    Object obj10 = list6.get(0);
                    a2.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialFailureType");
                    return new e((f) obj10, (String) list6.get(1), (String) list6.get(2));
                }
                if (b3 == -119) {
                    Object objE7 = e(byteBuffer);
                    List list7 = objE7 instanceof List ? (List) objE7 : null;
                    if (list7 == null) {
                        return null;
                    }
                    Object obj11 = list7.get(0);
                    a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformGoogleIdTokenCredential");
                    return new j((x) obj11);
                }
                if (b3 == -118) {
                    Object objE8 = e(byteBuffer);
                    List list8 = objE8 instanceof List ? (List) objE8 : null;
                    if (list8 == null) {
                        return null;
                    }
                    Object obj12 = list8.get(0);
                    a2.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.AuthorizeFailureType");
                    return new a((b) obj12, (String) list8.get(1), (String) list8.get(2));
                }
                if (b3 != -117) {
                    return super.f(b3, byteBuffer);
                }
                Object objE9 = e(byteBuffer);
                List list9 = objE9 instanceof List ? (List) objE9 : null;
                if (list9 == null) {
                    return null;
                }
                String str5 = (String) list9.get(0);
                String str6 = (String) list9.get(1);
                Object obj13 = list9.get(2);
                a2.h.c(obj13, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                return new w(str5, (List) obj13, str6);
                return r6;
            case 1:
                a2.h.e(byteBuffer, "buffer");
                int i4 = 0;
                if (b3 == -127) {
                    Long l5 = (Long) e(byteBuffer);
                    if (l5 == null) {
                        return null;
                    }
                    int iLongValue3 = (int) l5.longValue();
                    J1.s.f623l.getClass();
                    ?? Values3 = J1.s.values();
                    int length3 = Values3.length;
                    while (i4 < length3) {
                        r7 = Values3[i4];
                        if (r7.f625k != iLongValue3) {
                            i4++;
                        }
                    }
                    return null;
                }
                if (b3 == -126) {
                    Long l6 = (Long) e(byteBuffer);
                    if (l6 == null) {
                        return null;
                    }
                    int iLongValue4 = (int) l6.longValue();
                    J1.u.f628l.getClass();
                    ?? Values4 = J1.u.values();
                    int length4 = Values4.length;
                    while (i4 < length4) {
                        r7 = Values4[i4];
                        if (r7.f630k != iLongValue4) {
                            i4++;
                        }
                    }
                    return null;
                }
                if (b3 == -125) {
                    Long l7 = (Long) e(byteBuffer);
                    if (l7 == null) {
                        return null;
                    }
                    int iLongValue5 = (int) l7.longValue();
                    J1.c.f580l.getClass();
                    ?? Values5 = J1.c.values();
                    int length5 = Values5.length;
                    while (i4 < length5) {
                        r7 = Values5[i4];
                        if (r7.f583k != iLongValue5) {
                            i4++;
                        }
                    }
                    return null;
                }
                if (b3 == -124) {
                    Object objE10 = e(byteBuffer);
                    List list10 = objE10 instanceof List ? (List) objE10 : null;
                    if (list10 == null) {
                        return null;
                    }
                    Object obj14 = list10.get(0);
                    a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue3 = ((Boolean) obj14).booleanValue();
                    Object obj15 = list10.get(1);
                    a2.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                    return new J1.e(zBooleanValue3, ((Boolean) obj15).booleanValue(), (Long) list10.get(2));
                }
                if (b3 == -123) {
                    Object objE11 = e(byteBuffer);
                    List list11 = objE11 instanceof List ? (List) objE11 : null;
                    if (list11 == null) {
                        return null;
                    }
                    Double d3 = (Double) list11.get(0);
                    Double d4 = (Double) list11.get(1);
                    Object obj16 = list11.get(2);
                    a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Long");
                    return new J1.q(d3, d4, ((Long) obj16).longValue());
                }
                if (b3 == -122) {
                    Object objE12 = e(byteBuffer);
                    List list12 = objE12 instanceof List ? (List) objE12 : null;
                    if (list12 == null) {
                        return null;
                    }
                    Object obj17 = list12.get(0);
                    a2.h.c(obj17, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                    return new J1.r((J1.q) obj17);
                }
                if (b3 == -121) {
                    Object objE13 = e(byteBuffer);
                    List list13 = objE13 instanceof List ? (List) objE13 : null;
                    if (list13 != null) {
                        return new J1.v((Long) list13.get(0));
                    }
                    return null;
                }
                if (b3 == -120) {
                    Object objE14 = e(byteBuffer);
                    List list14 = objE14 instanceof List ? (List) objE14 : null;
                    if (list14 == null) {
                        return null;
                    }
                    Object obj18 = list14.get(0);
                    a2.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceType");
                    return new J1.t((J1.u) obj18, (J1.s) list14.get(1));
                }
                if (b3 == -119) {
                    Object objE15 = e(byteBuffer);
                    List list15 = objE15 instanceof List ? (List) objE15 : null;
                    if (list15 == null) {
                        return null;
                    }
                    Object obj19 = list15.get(0);
                    a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                    return new J1.a((String) obj19, (String) list15.get(1));
                }
                if (b3 != -118) {
                    return super.f(b3, byteBuffer);
                }
                Object objE16 = e(byteBuffer);
                List list16 = objE16 instanceof List ? (List) objE16 : null;
                if (list16 == null) {
                    return null;
                }
                Object obj20 = list16.get(0);
                a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.CacheRetrievalType");
                J1.a aVar = (J1.a) list16.get(1);
                Object obj21 = list16.get(2);
                a2.h.c(obj21, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                return new J1.b((J1.c) obj20, aVar, (List) obj21);
                return r7;
            case 2:
                a2.h.e(byteBuffer, "buffer");
                if (b3 == -127) {
                    Long l8 = (Long) e(byteBuffer);
                    if (l8 == null) {
                        return null;
                    }
                    int iLongValue6 = (int) l8.longValue();
                    N.f702l.getClass();
                    for (N n : N.values()) {
                        if (n.f706k == iLongValue6) {
                            return n;
                        }
                    }
                    return null;
                }
                if (b3 == -126) {
                    Object objE17 = e(byteBuffer);
                    List list17 = objE17 instanceof List ? (List) objE17 : null;
                    if (list17 == null) {
                        return null;
                    }
                    String str7 = (String) list17.get(0);
                    Object obj22 = list17.get(1);
                    a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                    return new C0032h(str7, ((Boolean) obj22).booleanValue());
                }
                if (b3 != -125) {
                    return super.f(b3, byteBuffer);
                }
                Object objE18 = e(byteBuffer);
                List list18 = objE18 instanceof List ? (List) objE18 : null;
                if (list18 == null) {
                    return null;
                }
                String str8 = (String) list18.get(0);
                Object obj23 = list18.get(1);
                a2.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                return new P(str8, (N) obj23);
            case 3:
                a2.h.e(byteBuffer, "buffer");
                return super.f(b3, byteBuffer);
            case 4:
                a2.h.e(byteBuffer, "buffer");
                if (b3 != -127) {
                    if (b3 != -126) {
                        return super.f(b3, byteBuffer);
                    }
                    Object objE19 = e(byteBuffer);
                    List list19 = objE19 instanceof List ? (List) objE19 : null;
                    if (list19 == null) {
                        return null;
                    }
                    Object obj24 = list19.get(0);
                    a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                    return new L1.a(((Boolean) obj24).booleanValue());
                }
                Object objE20 = e(byteBuffer);
                List list20 = objE20 instanceof List ? (List) objE20 : null;
                if (list20 == null) {
                    return null;
                }
                Object obj25 = list20.get(0);
                a2.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue4 = ((Boolean) obj25).booleanValue();
                Object obj26 = list20.get(1);
                a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue5 = ((Boolean) obj26).booleanValue();
                Object obj27 = list20.get(2);
                a2.h.c(obj27, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                return new L1.k(zBooleanValue4, zBooleanValue5, (Map) obj27);
            default:
                a2.h.e(byteBuffer, "buffer");
                int i5 = 0;
                if (b3 == -127) {
                    Long l9 = (Long) e(byteBuffer);
                    if (l9 != null) {
                        int iLongValue7 = (int) l9.longValue();
                        EnumC0070t.f1157l.getClass();
                        EnumC0070t[] enumC0070tArrValues = EnumC0070t.values();
                        int length6 = enumC0070tArrValues.length;
                        while (i5 < length6) {
                            EnumC0070t enumC0070t = enumC0070tArrValues[i5];
                            if (enumC0070t.f1162k == iLongValue7) {
                                return enumC0070t;
                            }
                            i5++;
                        }
                    }
                } else if (b3 == -126) {
                    Long l10 = (Long) e(byteBuffer);
                    if (l10 != null) {
                        int iLongValue8 = (int) l10.longValue();
                        EnumC0062k.f1128l.getClass();
                        EnumC0062k[] enumC0062kArrValues = EnumC0062k.values();
                        int length7 = enumC0062kArrValues.length;
                        while (i5 < length7) {
                            EnumC0062k enumC0062k = enumC0062kArrValues[i5];
                            if (enumC0062k.f1135k == iLongValue8) {
                                return enumC0062k;
                            }
                            i5++;
                        }
                    }
                } else if (b3 == -125) {
                    Long l11 = (Long) e(byteBuffer);
                    if (l11 != null) {
                        int iLongValue9 = (int) l11.longValue();
                        EnumC0076z.f1173l.getClass();
                        EnumC0076z[] enumC0076zArrValues = EnumC0076z.values();
                        int length8 = enumC0076zArrValues.length;
                        while (i5 < length8) {
                            EnumC0076z enumC0076z = enumC0076zArrValues[i5];
                            if (enumC0076z.f1175k == iLongValue9) {
                                return enumC0076z;
                            }
                            i5++;
                        }
                    }
                } else if (b3 == -124) {
                    Long l12 = (Long) e(byteBuffer);
                    if (l12 != null) {
                        int iLongValue10 = (int) l12.longValue();
                        S.f1041l.getClass();
                        S[] sArrValues = S.values();
                        int length9 = sArrValues.length;
                        while (i5 < length9) {
                            S s3 = sArrValues[i5];
                            if (s3.f1049k == iLongValue10) {
                                return s3;
                            }
                            i5++;
                        }
                    }
                } else if (b3 == -123) {
                    Long l13 = (Long) e(byteBuffer);
                    if (l13 != null) {
                        int iLongValue11 = (int) l13.longValue();
                        EnumC0075y.f1170l.getClass();
                        EnumC0075y[] enumC0075yArrValues = EnumC0075y.values();
                        int length10 = enumC0075yArrValues.length;
                        while (i5 < length10) {
                            EnumC0075y enumC0075y = enumC0075yArrValues[i5];
                            if (enumC0075y.f1172k == iLongValue11) {
                                return enumC0075y;
                            }
                            i5++;
                        }
                    }
                } else {
                    if (b3 != -122) {
                        return super.f(b3, byteBuffer);
                    }
                    Long l14 = (Long) e(byteBuffer);
                    if (l14 != null) {
                        int iLongValue12 = (int) l14.longValue();
                        l0.f1140l.getClass();
                        l0[] l0VarArrValues = l0.values();
                        int length11 = l0VarArrValues.length;
                        while (i5 < length11) {
                            l0 l0Var = l0VarArrValues[i5];
                            if (l0Var.f1142k == iLongValue12) {
                                return l0Var;
                            }
                            i5++;
                        }
                    }
                }
                return null;
        }
    }

    @Override // C1.q
    public void k(C1.p pVar, Object obj) {
        switch (this.f521d) {
            case 0:
                if (obj instanceof f) {
                    pVar.write(129);
                    k(pVar, Long.valueOf(((f) obj).f491k));
                } else if (obj instanceof b) {
                    pVar.write(130);
                    k(pVar, Long.valueOf(((b) obj).f476k));
                } else if (obj instanceof v) {
                    pVar.write(131);
                    k(pVar, ((v) obj).a());
                } else if (obj instanceof h) {
                    pVar.write(132);
                    k(pVar, ((h) obj).a());
                } else if (obj instanceof g) {
                    pVar.write(133);
                    k(pVar, ((g) obj).a());
                } else if (obj instanceof y) {
                    pVar.write(134);
                    y yVar = (y) obj;
                    k(pVar, P1.f.d0(yVar.f535a, yVar.f536b));
                } else if (obj instanceof x) {
                    pVar.write(135);
                    k(pVar, ((x) obj).a());
                } else if (obj instanceof e) {
                    pVar.write(136);
                    k(pVar, ((e) obj).a());
                } else if (obj instanceof j) {
                    pVar.write(137);
                    k(pVar, E2.a.B(((j) obj).f499a));
                } else if (obj instanceof a) {
                    pVar.write(138);
                    k(pVar, ((a) obj).a());
                } else if (!(obj instanceof w)) {
                    super.k(pVar, obj);
                } else {
                    pVar.write(139);
                    k(pVar, ((w) obj).a());
                }
                break;
            case 1:
                if (obj instanceof J1.s) {
                    pVar.write(129);
                    k(pVar, Long.valueOf(((J1.s) obj).f625k));
                } else if (obj instanceof J1.u) {
                    pVar.write(130);
                    k(pVar, Long.valueOf(((J1.u) obj).f630k));
                } else if (obj instanceof J1.c) {
                    pVar.write(131);
                    k(pVar, Long.valueOf(((J1.c) obj).f583k));
                } else if (obj instanceof J1.e) {
                    pVar.write(132);
                    J1.e eVar = (J1.e) obj;
                    k(pVar, P1.f.d0(Boolean.valueOf(eVar.f586a), Boolean.valueOf(eVar.f587b), eVar.f588c));
                } else if (obj instanceof J1.q) {
                    pVar.write(133);
                    J1.q qVar = (J1.q) obj;
                    k(pVar, P1.f.d0(qVar.f619a, qVar.f620b, Long.valueOf(qVar.f621c)));
                } else if (obj instanceof J1.r) {
                    pVar.write(134);
                    k(pVar, E2.a.B(((J1.r) obj).f622a));
                } else if (obj instanceof J1.v) {
                    pVar.write(135);
                    k(pVar, E2.a.B(((J1.v) obj).f631a));
                } else if (obj instanceof J1.t) {
                    pVar.write(136);
                    J1.t tVar = (J1.t) obj;
                    k(pVar, P1.f.d0(tVar.f626a, tVar.f627b));
                } else if (obj instanceof J1.a) {
                    pVar.write(137);
                    J1.a aVar = (J1.a) obj;
                    k(pVar, P1.f.d0(aVar.f575a, aVar.f576b));
                } else if (!(obj instanceof J1.b)) {
                    super.k(pVar, obj);
                } else {
                    pVar.write(138);
                    J1.b bVar = (J1.b) obj;
                    k(pVar, P1.f.d0(bVar.f577a, bVar.f578b, bVar.f579c));
                }
                break;
            case 2:
                if (obj instanceof N) {
                    pVar.write(129);
                    k(pVar, Long.valueOf(((N) obj).f706k));
                } else if (obj instanceof C0032h) {
                    pVar.write(130);
                    C0032h c0032h = (C0032h) obj;
                    k(pVar, P1.f.d0(c0032h.f721a, Boolean.valueOf(c0032h.f722b)));
                } else if (!(obj instanceof P)) {
                    super.k(pVar, obj);
                } else {
                    pVar.write(131);
                    P p3 = (P) obj;
                    k(pVar, P1.f.d0(p3.f707a, p3.f708b));
                }
                break;
            case 3:
            default:
                super.k(pVar, obj);
                break;
            case 4:
                if (obj instanceof L1.k) {
                    pVar.write(129);
                    L1.k kVar = (L1.k) obj;
                    k(pVar, P1.f.d0(Boolean.valueOf(kVar.f879a), Boolean.valueOf(kVar.f880b), kVar.f881c));
                } else if (!(obj instanceof L1.a)) {
                    super.k(pVar, obj);
                } else {
                    pVar.write(130);
                    k(pVar, E2.a.B(Boolean.valueOf(((L1.a) obj).f867a)));
                }
                break;
            case 5:
                if (obj instanceof EnumC0070t) {
                    pVar.write(129);
                    k(pVar, Long.valueOf(((EnumC0070t) obj).f1162k));
                } else if (obj instanceof EnumC0062k) {
                    pVar.write(130);
                    k(pVar, Long.valueOf(((EnumC0062k) obj).f1135k));
                } else if (obj instanceof EnumC0076z) {
                    pVar.write(131);
                    k(pVar, Long.valueOf(((EnumC0076z) obj).f1175k));
                } else if (obj instanceof S) {
                    pVar.write(132);
                    k(pVar, Long.valueOf(((S) obj).f1049k));
                } else if (obj instanceof EnumC0075y) {
                    pVar.write(133);
                    k(pVar, Long.valueOf(((EnumC0075y) obj).f1172k));
                } else if (!(obj instanceof l0)) {
                    super.k(pVar, obj);
                } else {
                    pVar.write(134);
                    k(pVar, Long.valueOf(((l0) obj).f1142k));
                }
                break;
        }
    }
}
