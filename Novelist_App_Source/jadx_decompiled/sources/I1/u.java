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

/* loaded from: classes.dex */
public class u extends C1.q {

    /* renamed from: d, reason: collision with root package name */
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
    /* JADX WARN: Type inference failed for: r6v1, types: [I1.b] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [I1.f] */
    /* JADX WARN: Type inference failed for: r6v5, types: [J1.c] */
    /* JADX WARN: Type inference failed for: r6v6, types: [J1.u] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [J1.s] */
    @Override // C1.q
    public Object f(byte b3, ByteBuffer byteBuffer) {
        Object obj;
        Object obj2;
        switch (this.f521d) {
            case 0:
                a2.h.e(byteBuffer, "buffer");
                int i3 = 0;
                if (b3 == -127) {
                    Long l3 = (Long) e(byteBuffer);
                    if (l3 != null) {
                        int longValue = (int) l3.longValue();
                        f.f482l.getClass();
                        ?? values = f.values();
                        int length = values.length;
                        while (i3 < length) {
                            obj = values[i3];
                            if (obj.f491k != longValue) {
                                i3++;
                            }
                        }
                        break;
                    }
                } else if (b3 == -126) {
                    Long l4 = (Long) e(byteBuffer);
                    if (l4 != null) {
                        int longValue2 = (int) l4.longValue();
                        b.f470l.getClass();
                        ?? values2 = b.values();
                        int length2 = values2.length;
                        while (i3 < length2) {
                            obj = values2[i3];
                            if (obj.f476k != longValue2) {
                                i3++;
                            }
                        }
                        break;
                    }
                } else if (b3 == -125) {
                    Object e3 = e(byteBuffer);
                    List list = e3 instanceof List ? (List) e3 : null;
                    if (list != null) {
                        Object obj3 = list.get(0);
                        a2.h.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        break;
                    }
                } else if (b3 == -124) {
                    Object e4 = e(byteBuffer);
                    List list2 = e4 instanceof List ? (List) e4 : null;
                    if (list2 != null) {
                        Object obj4 = list2.get(0);
                        a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        Object obj5 = list2.get(1);
                        a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestGoogleIdOptionParams");
                        break;
                    }
                } else if (b3 == -123) {
                    Object e5 = e(byteBuffer);
                    List list3 = e5 instanceof List ? (List) e5 : null;
                    if (list3 != null) {
                        Object obj6 = list3.get(0);
                        a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                        Object obj7 = list3.get(1);
                        a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b3 == -122) {
                    Object e6 = e(byteBuffer);
                    List list4 = e6 instanceof List ? (List) e6 : null;
                    if (list4 != null) {
                        Object obj8 = list4.get(0);
                        a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        a2.h.c(obj9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        break;
                    }
                } else if (b3 == -121) {
                    Object e7 = e(byteBuffer);
                    List list5 = e7 instanceof List ? (List) e7 : null;
                    if (list5 != null) {
                        String str = (String) list5.get(0);
                        String str2 = (String) list5.get(1);
                        String str3 = (String) list5.get(2);
                        Object obj10 = list5.get(3);
                        a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        String str4 = (String) obj10;
                        Object obj11 = list5.get(4);
                        a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        break;
                    }
                } else if (b3 == -120) {
                    Object e8 = e(byteBuffer);
                    List list6 = e8 instanceof List ? (List) e8 : null;
                    if (list6 != null) {
                        Object obj12 = list6.get(0);
                        a2.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialFailureType");
                        break;
                    }
                } else if (b3 == -119) {
                    Object e9 = e(byteBuffer);
                    List list7 = e9 instanceof List ? (List) e9 : null;
                    if (list7 != null) {
                        Object obj13 = list7.get(0);
                        a2.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformGoogleIdTokenCredential");
                        break;
                    }
                } else if (b3 == -118) {
                    Object e10 = e(byteBuffer);
                    List list8 = e10 instanceof List ? (List) e10 : null;
                    if (list8 != null) {
                        Object obj14 = list8.get(0);
                        a2.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.AuthorizeFailureType");
                        break;
                    }
                } else if (b3 == -117) {
                    Object e11 = e(byteBuffer);
                    List list9 = e11 instanceof List ? (List) e11 : null;
                    if (list9 != null) {
                        String str5 = (String) list9.get(0);
                        String str6 = (String) list9.get(1);
                        Object obj15 = list9.get(2);
                        a2.h.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                a2.h.e(byteBuffer, "buffer");
                int i4 = 0;
                if (b3 == -127) {
                    Long l5 = (Long) e(byteBuffer);
                    if (l5 != null) {
                        int longValue3 = (int) l5.longValue();
                        J1.s.f623l.getClass();
                        ?? values3 = J1.s.values();
                        int length3 = values3.length;
                        while (i4 < length3) {
                            obj2 = values3[i4];
                            if (obj2.f625k != longValue3) {
                                i4++;
                            }
                        }
                        break;
                    }
                } else if (b3 == -126) {
                    Long l6 = (Long) e(byteBuffer);
                    if (l6 != null) {
                        int longValue4 = (int) l6.longValue();
                        J1.u.f628l.getClass();
                        ?? values4 = J1.u.values();
                        int length4 = values4.length;
                        while (i4 < length4) {
                            obj2 = values4[i4];
                            if (obj2.f630k != longValue4) {
                                i4++;
                            }
                        }
                        break;
                    }
                } else if (b3 == -125) {
                    Long l7 = (Long) e(byteBuffer);
                    if (l7 != null) {
                        int longValue5 = (int) l7.longValue();
                        J1.c.f580l.getClass();
                        ?? values5 = J1.c.values();
                        int length5 = values5.length;
                        while (i4 < length5) {
                            obj2 = values5[i4];
                            if (obj2.f583k != longValue5) {
                                i4++;
                            }
                        }
                        break;
                    }
                } else if (b3 == -124) {
                    Object e12 = e(byteBuffer);
                    List list10 = e12 instanceof List ? (List) e12 : null;
                    if (list10 != null) {
                        Object obj16 = list10.get(0);
                        a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue3 = ((Boolean) obj16).booleanValue();
                        Object obj17 = list10.get(1);
                        a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b3 == -123) {
                    Object e13 = e(byteBuffer);
                    List list11 = e13 instanceof List ? (List) e13 : null;
                    if (list11 != null) {
                        Double d3 = (Double) list11.get(0);
                        Double d4 = (Double) list11.get(1);
                        Object obj18 = list11.get(2);
                        a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Long");
                        break;
                    }
                } else if (b3 == -122) {
                    Object e14 = e(byteBuffer);
                    List list12 = e14 instanceof List ? (List) e14 : null;
                    if (list12 != null) {
                        Object obj19 = list12.get(0);
                        a2.h.c(obj19, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                        break;
                    }
                } else if (b3 == -121) {
                    Object e15 = e(byteBuffer);
                    List list13 = e15 instanceof List ? (List) e15 : null;
                    if (list13 != null) {
                        break;
                    }
                } else if (b3 == -120) {
                    Object e16 = e(byteBuffer);
                    List list14 = e16 instanceof List ? (List) e16 : null;
                    if (list14 != null) {
                        Object obj20 = list14.get(0);
                        a2.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceType");
                        break;
                    }
                } else if (b3 == -119) {
                    Object e17 = e(byteBuffer);
                    List list15 = e17 instanceof List ? (List) e17 : null;
                    if (list15 != null) {
                        Object obj21 = list15.get(0);
                        a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        break;
                    }
                } else if (b3 == -118) {
                    Object e18 = e(byteBuffer);
                    List list16 = e18 instanceof List ? (List) e18 : null;
                    if (list16 != null) {
                        Object obj22 = list16.get(0);
                        a2.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.CacheRetrievalType");
                        J1.a aVar = (J1.a) list16.get(1);
                        Object obj23 = list16.get(2);
                        a2.h.c(obj23, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 2:
                a2.h.e(byteBuffer, "buffer");
                if (b3 == -127) {
                    Long l8 = (Long) e(byteBuffer);
                    if (l8 != null) {
                        int longValue6 = (int) l8.longValue();
                        N.f702l.getClass();
                        N[] values6 = N.values();
                        int length6 = values6.length;
                        for (int i5 = 0; i5 < length6; i5++) {
                            N n = values6[i5];
                            if (n.f706k == longValue6) {
                                break;
                            }
                        }
                        break;
                    }
                } else if (b3 == -126) {
                    Object e19 = e(byteBuffer);
                    List list17 = e19 instanceof List ? (List) e19 : null;
                    if (list17 != null) {
                        String str7 = (String) list17.get(0);
                        Object obj24 = list17.get(1);
                        a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else if (b3 == -125) {
                    Object e20 = e(byteBuffer);
                    List list18 = e20 instanceof List ? (List) e20 : null;
                    if (list18 != null) {
                        String str8 = (String) list18.get(0);
                        Object obj25 = list18.get(1);
                        a2.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 3:
                a2.h.e(byteBuffer, "buffer");
                break;
            case 4:
                a2.h.e(byteBuffer, "buffer");
                if (b3 == -127) {
                    Object e21 = e(byteBuffer);
                    List list19 = e21 instanceof List ? (List) e21 : null;
                    if (list19 != null) {
                        Object obj26 = list19.get(0);
                        a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue4 = ((Boolean) obj26).booleanValue();
                        Object obj27 = list19.get(1);
                        a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean booleanValue5 = ((Boolean) obj27).booleanValue();
                        Object obj28 = list19.get(2);
                        a2.h.c(obj28, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                        break;
                    }
                } else if (b3 == -126) {
                    Object e22 = e(byteBuffer);
                    List list20 = e22 instanceof List ? (List) e22 : null;
                    if (list20 != null) {
                        Object obj29 = list20.get(0);
                        a2.h.c(obj29, "null cannot be cast to non-null type kotlin.Boolean");
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                a2.h.e(byteBuffer, "buffer");
                int i6 = 0;
                if (b3 == -127) {
                    Long l9 = (Long) e(byteBuffer);
                    if (l9 != null) {
                        int longValue7 = (int) l9.longValue();
                        EnumC0070t.f1157l.getClass();
                        EnumC0070t[] values7 = EnumC0070t.values();
                        int length7 = values7.length;
                        while (i6 < length7) {
                            EnumC0070t enumC0070t = values7[i6];
                            if (enumC0070t.f1162k == longValue7) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        break;
                    }
                } else if (b3 == -126) {
                    Long l10 = (Long) e(byteBuffer);
                    if (l10 != null) {
                        int longValue8 = (int) l10.longValue();
                        EnumC0062k.f1128l.getClass();
                        EnumC0062k[] values8 = EnumC0062k.values();
                        int length8 = values8.length;
                        while (i6 < length8) {
                            EnumC0062k enumC0062k = values8[i6];
                            if (enumC0062k.f1135k == longValue8) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        break;
                    }
                } else if (b3 == -125) {
                    Long l11 = (Long) e(byteBuffer);
                    if (l11 != null) {
                        int longValue9 = (int) l11.longValue();
                        EnumC0076z.f1173l.getClass();
                        EnumC0076z[] values9 = EnumC0076z.values();
                        int length9 = values9.length;
                        while (i6 < length9) {
                            EnumC0076z enumC0076z = values9[i6];
                            if (enumC0076z.f1175k == longValue9) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        break;
                    }
                } else if (b3 == -124) {
                    Long l12 = (Long) e(byteBuffer);
                    if (l12 != null) {
                        int longValue10 = (int) l12.longValue();
                        S.f1041l.getClass();
                        S[] values10 = S.values();
                        int length10 = values10.length;
                        while (i6 < length10) {
                            S s3 = values10[i6];
                            if (s3.f1049k == longValue10) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        break;
                    }
                } else if (b3 == -123) {
                    Long l13 = (Long) e(byteBuffer);
                    if (l13 != null) {
                        int longValue11 = (int) l13.longValue();
                        EnumC0075y.f1170l.getClass();
                        EnumC0075y[] values11 = EnumC0075y.values();
                        int length11 = values11.length;
                        while (i6 < length11) {
                            EnumC0075y enumC0075y = values11[i6];
                            if (enumC0075y.f1172k == longValue11) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        break;
                    }
                } else if (b3 == -122) {
                    Long l14 = (Long) e(byteBuffer);
                    if (l14 != null) {
                        int longValue12 = (int) l14.longValue();
                        l0.f1140l.getClass();
                        l0[] values12 = l0.values();
                        int length12 = values12.length;
                        while (i6 < length12) {
                            l0 l0Var = values12[i6];
                            if (l0Var.f1142k == longValue12) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.f(b3, byteBuffer);
    }

    @Override // C1.q
    public void k(C1.p pVar, Object obj) {
        switch (this.f521d) {
            case 0:
                if (!(obj instanceof f)) {
                    if (!(obj instanceof b)) {
                        if (!(obj instanceof v)) {
                            if (!(obj instanceof h)) {
                                if (!(obj instanceof g)) {
                                    if (!(obj instanceof y)) {
                                        if (!(obj instanceof x)) {
                                            if (!(obj instanceof e)) {
                                                if (!(obj instanceof j)) {
                                                    if (!(obj instanceof a)) {
                                                        if (!(obj instanceof w)) {
                                                            super.k(pVar, obj);
                                                            break;
                                                        } else {
                                                            pVar.write(139);
                                                            k(pVar, ((w) obj).a());
                                                            break;
                                                        }
                                                    } else {
                                                        pVar.write(138);
                                                        k(pVar, ((a) obj).a());
                                                        break;
                                                    }
                                                } else {
                                                    pVar.write(137);
                                                    k(pVar, E2.a.B(((j) obj).f499a));
                                                    break;
                                                }
                                            } else {
                                                pVar.write(136);
                                                k(pVar, ((e) obj).a());
                                                break;
                                            }
                                        } else {
                                            pVar.write(135);
                                            k(pVar, ((x) obj).a());
                                            break;
                                        }
                                    } else {
                                        pVar.write(134);
                                        y yVar = (y) obj;
                                        k(pVar, P1.f.d0(yVar.f535a, yVar.f536b));
                                        break;
                                    }
                                } else {
                                    pVar.write(133);
                                    k(pVar, ((g) obj).a());
                                    break;
                                }
                            } else {
                                pVar.write(132);
                                k(pVar, ((h) obj).a());
                                break;
                            }
                        } else {
                            pVar.write(131);
                            k(pVar, ((v) obj).a());
                            break;
                        }
                    } else {
                        pVar.write(130);
                        k(pVar, Long.valueOf(((b) obj).f476k));
                        break;
                    }
                } else {
                    pVar.write(129);
                    k(pVar, Long.valueOf(((f) obj).f491k));
                    break;
                }
            case 1:
                if (!(obj instanceof J1.s)) {
                    if (!(obj instanceof J1.u)) {
                        if (!(obj instanceof J1.c)) {
                            if (!(obj instanceof J1.e)) {
                                if (!(obj instanceof J1.q)) {
                                    if (!(obj instanceof J1.r)) {
                                        if (!(obj instanceof J1.v)) {
                                            if (!(obj instanceof J1.t)) {
                                                if (!(obj instanceof J1.a)) {
                                                    if (!(obj instanceof J1.b)) {
                                                        super.k(pVar, obj);
                                                        break;
                                                    } else {
                                                        pVar.write(138);
                                                        J1.b bVar = (J1.b) obj;
                                                        k(pVar, P1.f.d0(bVar.f577a, bVar.f578b, bVar.f579c));
                                                        break;
                                                    }
                                                } else {
                                                    pVar.write(137);
                                                    J1.a aVar = (J1.a) obj;
                                                    k(pVar, P1.f.d0(aVar.f575a, aVar.f576b));
                                                    break;
                                                }
                                            } else {
                                                pVar.write(136);
                                                J1.t tVar = (J1.t) obj;
                                                k(pVar, P1.f.d0(tVar.f626a, tVar.f627b));
                                                break;
                                            }
                                        } else {
                                            pVar.write(135);
                                            k(pVar, E2.a.B(((J1.v) obj).f631a));
                                            break;
                                        }
                                    } else {
                                        pVar.write(134);
                                        k(pVar, E2.a.B(((J1.r) obj).f622a));
                                        break;
                                    }
                                } else {
                                    pVar.write(133);
                                    J1.q qVar = (J1.q) obj;
                                    k(pVar, P1.f.d0(qVar.f619a, qVar.f620b, Long.valueOf(qVar.f621c)));
                                    break;
                                }
                            } else {
                                pVar.write(132);
                                J1.e eVar = (J1.e) obj;
                                k(pVar, P1.f.d0(Boolean.valueOf(eVar.f586a), Boolean.valueOf(eVar.f587b), eVar.f588c));
                                break;
                            }
                        } else {
                            pVar.write(131);
                            k(pVar, Long.valueOf(((J1.c) obj).f583k));
                            break;
                        }
                    } else {
                        pVar.write(130);
                        k(pVar, Long.valueOf(((J1.u) obj).f630k));
                        break;
                    }
                } else {
                    pVar.write(129);
                    k(pVar, Long.valueOf(((J1.s) obj).f625k));
                    break;
                }
            case 2:
                if (!(obj instanceof N)) {
                    if (!(obj instanceof C0032h)) {
                        if (!(obj instanceof P)) {
                            super.k(pVar, obj);
                            break;
                        } else {
                            pVar.write(131);
                            P p3 = (P) obj;
                            k(pVar, P1.f.d0(p3.f707a, p3.f708b));
                            break;
                        }
                    } else {
                        pVar.write(130);
                        C0032h c0032h = (C0032h) obj;
                        k(pVar, P1.f.d0(c0032h.f721a, Boolean.valueOf(c0032h.f722b)));
                        break;
                    }
                } else {
                    pVar.write(129);
                    k(pVar, Long.valueOf(((N) obj).f706k));
                    break;
                }
            case 3:
            default:
                super.k(pVar, obj);
                break;
            case 4:
                if (!(obj instanceof L1.k)) {
                    if (!(obj instanceof L1.a)) {
                        super.k(pVar, obj);
                        break;
                    } else {
                        pVar.write(130);
                        k(pVar, E2.a.B(Boolean.valueOf(((L1.a) obj).f867a)));
                        break;
                    }
                } else {
                    pVar.write(129);
                    L1.k kVar = (L1.k) obj;
                    k(pVar, P1.f.d0(Boolean.valueOf(kVar.f879a), Boolean.valueOf(kVar.f880b), kVar.f881c));
                    break;
                }
            case 5:
                if (!(obj instanceof EnumC0070t)) {
                    if (!(obj instanceof EnumC0062k)) {
                        if (!(obj instanceof EnumC0076z)) {
                            if (!(obj instanceof S)) {
                                if (!(obj instanceof EnumC0075y)) {
                                    if (!(obj instanceof l0)) {
                                        super.k(pVar, obj);
                                        break;
                                    } else {
                                        pVar.write(134);
                                        k(pVar, Long.valueOf(((l0) obj).f1142k));
                                        break;
                                    }
                                } else {
                                    pVar.write(133);
                                    k(pVar, Long.valueOf(((EnumC0075y) obj).f1172k));
                                    break;
                                }
                            } else {
                                pVar.write(132);
                                k(pVar, Long.valueOf(((S) obj).f1049k));
                                break;
                            }
                        } else {
                            pVar.write(131);
                            k(pVar, Long.valueOf(((EnumC0076z) obj).f1175k));
                            break;
                        }
                    } else {
                        pVar.write(130);
                        k(pVar, Long.valueOf(((EnumC0062k) obj).f1135k));
                        break;
                    }
                } else {
                    pVar.write(129);
                    k(pVar, Long.valueOf(((EnumC0070t) obj).f1162k));
                    break;
                }
        }
    }
}
