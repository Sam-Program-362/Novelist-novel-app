package J1;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.util.Log;
import java.util.List;
import org.apache.tika.utils.StringUtils;
import p003b0.D;
import p031k.u0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f591a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O1.e f592b = new O1.e(new I1.l(1));

    public static void a(C1.f fVar, final p pVar) {
        a2.h.e(fVar, "binaryMessenger");
        p057t1.a aVarA = fVar.a(new C1.k());
        String strA = p055t.a.a("dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages", StringUtils.EMPTY);
        O1.e eVar = f592b;
        B1.s sVar = new B1.s(fVar, strA, (C1.l) eVar.a(), aVarA);
        p057t1.a aVar = null;
        if (pVar != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: J1.f
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    List listD0;
                    switch (i3) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar = (t) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                            q qVar = (q) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar2 = (e) obj4;
                            I1.k kVar = new I1.k(cVar, 7);
                            u0 u0Var = ((p) pVar).f618l;
                            n nVar = (u0Var == null || ((Activity) u0Var.f3795b) == null) ? null : (n) u0Var.f3796c;
                            if (nVar == null) {
                                S0.a.f(kVar, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity = nVar.f606l;
                                s sVar2 = tVar.f627b;
                                if (sVar2 != null) {
                                    nVar.f612s = sVar2.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z3 = eVar2.f586a;
                                boolean z4 = eVar2.f587b;
                                p009e.d dVar = p009e.d.f2774a;
                                p009e.c cVar2 = p009e.c.f2773a;
                                int pickImagesMaxLimit = Integer.MAX_VALUE;
                                p009e.b bVar = p009e.b.f2772a;
                                if (z3) {
                                    int iV = E2.a.v(eVar2);
                                    if (!nVar.l(qVar, null, kVar)) {
                                        n.b(kVar);
                                    } else {
                                        if (z4) {
                                            p009e.a aVar2 = new p009e.a(iV);
                                            int i4 = Build.VERSION.SDK_INT;
                                            if (i4 >= 33 || (i4 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                            }
                                            int i5 = pickImagesMaxLimit;
                                            G1.a aVar3 = new G1.a();
                                            aVar3.f398b = cVar2;
                                            if (i4 >= 33 || (i4 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                MediaStore.getPickImagesMaxLimit();
                                            }
                                            aVar3.f398b = dVar;
                                            aVar3.f397a = i5;
                                            aVar3.f399c = bVar;
                                            intent2 = aVar2.c0(activity, aVar3);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f626a.ordinal();
                                    if (iOrdinal == 0) {
                                        H0.i iVar = nVar.f608o;
                                        if (!nVar.l(qVar, null, kVar)) {
                                            n.b(kVar);
                                        } else if (nVar.k() && H2.h.d((Activity) iVar.f443l, "android.permission.CAMERA") != 0) {
                                            H2.h.x((Activity) iVar.f443l, new String[]{"android.permission.CAMERA"}, 2345);
                                        } else {
                                            nVar.i();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        if (!nVar.l(qVar, null, kVar)) {
                                            n.b(kVar);
                                        } else {
                                            if (z4) {
                                                D d3 = new D(1);
                                                int i6 = Build.VERSION.SDK_INT;
                                                if (i6 >= 33 || (i6 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                                }
                                                int i7 = pickImagesMaxLimit;
                                                G1.a aVar4 = new G1.a();
                                                aVar4.f398b = cVar2;
                                                if (i6 >= 33 || (i6 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    MediaStore.getPickImagesMaxLimit();
                                                }
                                                aVar4.f398b = dVar;
                                                aVar4.f397a = i7;
                                                aVar4.f399c = bVar;
                                                intent = d3.c0(activity, aVar4);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar2 = (t) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.VideoSelectionOptions");
                            v vVar = (v) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar3 = (e) obj7;
                            I1.k kVar2 = new I1.k(cVar, 5);
                            u0 u0Var2 = ((p) pVar).f618l;
                            n nVar2 = (u0Var2 == null || ((Activity) u0Var2.f3795b) == null) ? null : (n) u0Var2.f3796c;
                            if (nVar2 == null) {
                                S0.a.f(kVar2, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity2 = nVar2.f606l;
                                s sVar3 = tVar2.f627b;
                                if (sVar3 != null) {
                                    nVar2.f612s = sVar3.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z5 = eVar3.f586a;
                                boolean z6 = eVar3.f587b;
                                p009e.e eVar4 = p009e.e.f2775a;
                                p009e.c cVar3 = p009e.c.f2773a;
                                int pickImagesMaxLimit2 = Integer.MAX_VALUE;
                                p009e.b bVar2 = p009e.b.f2772a;
                                if (z5) {
                                    int iV2 = E2.a.v(eVar3);
                                    if (!nVar2.l(null, vVar, kVar2)) {
                                        n.b(kVar2);
                                    } else {
                                        if (z6) {
                                            p009e.a aVar5 = new p009e.a(iV2);
                                            int i8 = Build.VERSION.SDK_INT;
                                            if (i8 >= 33 || (i8 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit2 = MediaStore.getPickImagesMaxLimit();
                                            }
                                            int i9 = pickImagesMaxLimit2;
                                            G1.a aVar6 = new G1.a();
                                            aVar6.f398b = cVar3;
                                            if (i8 >= 33 || (i8 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                MediaStore.getPickImagesMaxLimit();
                                            }
                                            aVar6.f398b = eVar4;
                                            aVar6.f397a = i9;
                                            aVar6.f399c = bVar2;
                                            intent4 = aVar5.c0(activity2, aVar6);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f626a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        H0.i iVar2 = nVar2.f608o;
                                        if (!nVar2.l(null, vVar, kVar2)) {
                                            n.b(kVar2);
                                        } else if (nVar2.k() && H2.h.d((Activity) iVar2.f443l, "android.permission.CAMERA") != 0) {
                                            H2.h.x((Activity) iVar2.f443l, new String[]{"android.permission.CAMERA"}, 2355);
                                        } else {
                                            nVar2.j();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        if (!nVar2.l(null, vVar, kVar2)) {
                                            n.b(kVar2);
                                        } else {
                                            if (z6) {
                                                D d4 = new D(1);
                                                int i10 = Build.VERSION.SDK_INT;
                                                if (i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit2 = MediaStore.getPickImagesMaxLimit();
                                                }
                                                int i11 = pickImagesMaxLimit2;
                                                G1.a aVar7 = new G1.a();
                                                aVar7.f398b = cVar3;
                                                if (i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    MediaStore.getPickImagesMaxLimit();
                                                }
                                                aVar7.f398b = eVar4;
                                                aVar7.f397a = i11;
                                                aVar7.f399c = bVar2;
                                                intent3 = d4.c0(activity2, aVar7);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.MediaSelectionOptions");
                            r rVar = (r) obj8;
                            Object obj9 = list3.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar5 = (e) obj9;
                            I1.k kVar3 = new I1.k(cVar, 6);
                            u0 u0Var3 = ((p) pVar).f618l;
                            n nVar3 = (u0Var3 == null || ((Activity) u0Var3.f3795b) == null) ? null : (n) u0Var3.f3796c;
                            if (nVar3 == null) {
                                S0.a.f(kVar3, new d("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!nVar3.l(rVar.f622a, null, kVar3)) {
                                n.b(kVar3);
                            } else {
                                Activity activity3 = nVar3.f606l;
                                boolean z7 = eVar5.f587b;
                                boolean z8 = eVar5.f586a;
                                if (z7) {
                                    p009e.b bVar3 = p009e.b.f2772a;
                                    int pickImagesMaxLimit3 = Integer.MAX_VALUE;
                                    p009e.c cVar4 = p009e.c.f2773a;
                                    if (z8) {
                                        p009e.a aVar8 = new p009e.a(E2.a.v(eVar5));
                                        int i12 = Build.VERSION.SDK_INT;
                                        if (i12 >= 33 || (i12 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit3 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        G1.a aVar9 = new G1.a();
                                        aVar9.f398b = cVar4;
                                        if (i12 >= 33 || (i12 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            MediaStore.getPickImagesMaxLimit();
                                        }
                                        aVar9.f398b = cVar4;
                                        aVar9.f397a = pickImagesMaxLimit3;
                                        aVar9.f399c = bVar3;
                                        intent5 = aVar8.c0(activity3, aVar9);
                                    } else {
                                        D d5 = new D(1);
                                        int i13 = Build.VERSION.SDK_INT;
                                        if (i13 >= 33 || (i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit3 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        G1.a aVar10 = new G1.a();
                                        aVar10.f398b = cVar4;
                                        if (i13 >= 33 || (i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            MediaStore.getPickImagesMaxLimit();
                                        }
                                        aVar10.f398b = cVar4;
                                        aVar10.f397a = pickImagesMaxLimit3;
                                        aVar10.f399c = bVar3;
                                        intent5 = d5.c0(activity3, aVar10);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", z8);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            try {
                                listD0 = E2.a.B(((p) pVar).a());
                                break;
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar2 = th;
                                    listD0 = P1.f.d0(dVar2.f584k, dVar2.f585l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        B1.s sVar2 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos", StringUtils.EMPTY), (C1.l) eVar.a(), aVarA);
        if (pVar != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: J1.f
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    List listD0;
                    switch (i4) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar = (t) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                            q qVar = (q) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar2 = (e) obj4;
                            I1.k kVar = new I1.k(cVar, 7);
                            u0 u0Var = ((p) pVar).f618l;
                            n nVar = (u0Var == null || ((Activity) u0Var.f3795b) == null) ? null : (n) u0Var.f3796c;
                            if (nVar == null) {
                                S0.a.f(kVar, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity = nVar.f606l;
                                s sVar3 = tVar.f627b;
                                if (sVar3 != null) {
                                    nVar.f612s = sVar3.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z3 = eVar2.f586a;
                                boolean z4 = eVar2.f587b;
                                p009e.d dVar = p009e.d.f2774a;
                                p009e.c cVar2 = p009e.c.f2773a;
                                int pickImagesMaxLimit = Integer.MAX_VALUE;
                                p009e.b bVar = p009e.b.f2772a;
                                if (z3) {
                                    int iV = E2.a.v(eVar2);
                                    if (!nVar.l(qVar, null, kVar)) {
                                        n.b(kVar);
                                    } else {
                                        if (z4) {
                                            p009e.a aVar2 = new p009e.a(iV);
                                            int i5 = Build.VERSION.SDK_INT;
                                            if (i5 >= 33 || (i5 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                            }
                                            int i6 = pickImagesMaxLimit;
                                            G1.a aVar3 = new G1.a();
                                            aVar3.f398b = cVar2;
                                            if (i5 >= 33 || (i5 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                MediaStore.getPickImagesMaxLimit();
                                            }
                                            aVar3.f398b = dVar;
                                            aVar3.f397a = i6;
                                            aVar3.f399c = bVar;
                                            intent2 = aVar2.c0(activity, aVar3);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f626a.ordinal();
                                    if (iOrdinal == 0) {
                                        H0.i iVar = nVar.f608o;
                                        if (!nVar.l(qVar, null, kVar)) {
                                            n.b(kVar);
                                        } else if (nVar.k() && H2.h.d((Activity) iVar.f443l, "android.permission.CAMERA") != 0) {
                                            H2.h.x((Activity) iVar.f443l, new String[]{"android.permission.CAMERA"}, 2345);
                                        } else {
                                            nVar.i();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        if (!nVar.l(qVar, null, kVar)) {
                                            n.b(kVar);
                                        } else {
                                            if (z4) {
                                                D d3 = new D(1);
                                                int i7 = Build.VERSION.SDK_INT;
                                                if (i7 >= 33 || (i7 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                                }
                                                int i8 = pickImagesMaxLimit;
                                                G1.a aVar4 = new G1.a();
                                                aVar4.f398b = cVar2;
                                                if (i7 >= 33 || (i7 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    MediaStore.getPickImagesMaxLimit();
                                                }
                                                aVar4.f398b = dVar;
                                                aVar4.f397a = i8;
                                                aVar4.f399c = bVar;
                                                intent = d3.c0(activity, aVar4);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar2 = (t) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.VideoSelectionOptions");
                            v vVar = (v) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar3 = (e) obj7;
                            I1.k kVar2 = new I1.k(cVar, 5);
                            u0 u0Var2 = ((p) pVar).f618l;
                            n nVar2 = (u0Var2 == null || ((Activity) u0Var2.f3795b) == null) ? null : (n) u0Var2.f3796c;
                            if (nVar2 == null) {
                                S0.a.f(kVar2, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity2 = nVar2.f606l;
                                s sVar4 = tVar2.f627b;
                                if (sVar4 != null) {
                                    nVar2.f612s = sVar4.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z5 = eVar3.f586a;
                                boolean z6 = eVar3.f587b;
                                p009e.e eVar4 = p009e.e.f2775a;
                                p009e.c cVar3 = p009e.c.f2773a;
                                int pickImagesMaxLimit2 = Integer.MAX_VALUE;
                                p009e.b bVar2 = p009e.b.f2772a;
                                if (z5) {
                                    int iV2 = E2.a.v(eVar3);
                                    if (!nVar2.l(null, vVar, kVar2)) {
                                        n.b(kVar2);
                                    } else {
                                        if (z6) {
                                            p009e.a aVar5 = new p009e.a(iV2);
                                            int i9 = Build.VERSION.SDK_INT;
                                            if (i9 >= 33 || (i9 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit2 = MediaStore.getPickImagesMaxLimit();
                                            }
                                            int i10 = pickImagesMaxLimit2;
                                            G1.a aVar6 = new G1.a();
                                            aVar6.f398b = cVar3;
                                            if (i9 >= 33 || (i9 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                MediaStore.getPickImagesMaxLimit();
                                            }
                                            aVar6.f398b = eVar4;
                                            aVar6.f397a = i10;
                                            aVar6.f399c = bVar2;
                                            intent4 = aVar5.c0(activity2, aVar6);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f626a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        H0.i iVar2 = nVar2.f608o;
                                        if (!nVar2.l(null, vVar, kVar2)) {
                                            n.b(kVar2);
                                        } else if (nVar2.k() && H2.h.d((Activity) iVar2.f443l, "android.permission.CAMERA") != 0) {
                                            H2.h.x((Activity) iVar2.f443l, new String[]{"android.permission.CAMERA"}, 2355);
                                        } else {
                                            nVar2.j();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        if (!nVar2.l(null, vVar, kVar2)) {
                                            n.b(kVar2);
                                        } else {
                                            if (z6) {
                                                D d4 = new D(1);
                                                int i11 = Build.VERSION.SDK_INT;
                                                if (i11 >= 33 || (i11 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit2 = MediaStore.getPickImagesMaxLimit();
                                                }
                                                int i12 = pickImagesMaxLimit2;
                                                G1.a aVar7 = new G1.a();
                                                aVar7.f398b = cVar3;
                                                if (i11 >= 33 || (i11 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    MediaStore.getPickImagesMaxLimit();
                                                }
                                                aVar7.f398b = eVar4;
                                                aVar7.f397a = i12;
                                                aVar7.f399c = bVar2;
                                                intent3 = d4.c0(activity2, aVar7);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.MediaSelectionOptions");
                            r rVar = (r) obj8;
                            Object obj9 = list3.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar5 = (e) obj9;
                            I1.k kVar3 = new I1.k(cVar, 6);
                            u0 u0Var3 = ((p) pVar).f618l;
                            n nVar3 = (u0Var3 == null || ((Activity) u0Var3.f3795b) == null) ? null : (n) u0Var3.f3796c;
                            if (nVar3 == null) {
                                S0.a.f(kVar3, new d("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!nVar3.l(rVar.f622a, null, kVar3)) {
                                n.b(kVar3);
                            } else {
                                Activity activity3 = nVar3.f606l;
                                boolean z7 = eVar5.f587b;
                                boolean z8 = eVar5.f586a;
                                if (z7) {
                                    p009e.b bVar3 = p009e.b.f2772a;
                                    int pickImagesMaxLimit3 = Integer.MAX_VALUE;
                                    p009e.c cVar4 = p009e.c.f2773a;
                                    if (z8) {
                                        p009e.a aVar8 = new p009e.a(E2.a.v(eVar5));
                                        int i13 = Build.VERSION.SDK_INT;
                                        if (i13 >= 33 || (i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit3 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        G1.a aVar9 = new G1.a();
                                        aVar9.f398b = cVar4;
                                        if (i13 >= 33 || (i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            MediaStore.getPickImagesMaxLimit();
                                        }
                                        aVar9.f398b = cVar4;
                                        aVar9.f397a = pickImagesMaxLimit3;
                                        aVar9.f399c = bVar3;
                                        intent5 = aVar8.c0(activity3, aVar9);
                                    } else {
                                        D d5 = new D(1);
                                        int i14 = Build.VERSION.SDK_INT;
                                        if (i14 >= 33 || (i14 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit3 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        G1.a aVar10 = new G1.a();
                                        aVar10.f398b = cVar4;
                                        if (i14 >= 33 || (i14 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            MediaStore.getPickImagesMaxLimit();
                                        }
                                        aVar10.f398b = cVar4;
                                        aVar10.f397a = pickImagesMaxLimit3;
                                        aVar10.f399c = bVar3;
                                        intent5 = d5.c0(activity3, aVar10);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", z8);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            try {
                                listD0 = E2.a.B(((p) pVar).a());
                                break;
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar2 = th;
                                    listD0 = P1.f.d0(dVar2.f584k, dVar2.f585l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        B1.s sVar3 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia", StringUtils.EMPTY), (C1.l) eVar.a(), aVar);
        if (pVar != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: J1.f
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    List listD0;
                    switch (i5) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar = (t) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                            q qVar = (q) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar2 = (e) obj4;
                            I1.k kVar = new I1.k(cVar, 7);
                            u0 u0Var = ((p) pVar).f618l;
                            n nVar = (u0Var == null || ((Activity) u0Var.f3795b) == null) ? null : (n) u0Var.f3796c;
                            if (nVar == null) {
                                S0.a.f(kVar, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity = nVar.f606l;
                                s sVar4 = tVar.f627b;
                                if (sVar4 != null) {
                                    nVar.f612s = sVar4.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z3 = eVar2.f586a;
                                boolean z4 = eVar2.f587b;
                                p009e.d dVar = p009e.d.f2774a;
                                p009e.c cVar2 = p009e.c.f2773a;
                                int pickImagesMaxLimit = Integer.MAX_VALUE;
                                p009e.b bVar = p009e.b.f2772a;
                                if (z3) {
                                    int iV = E2.a.v(eVar2);
                                    if (!nVar.l(qVar, null, kVar)) {
                                        n.b(kVar);
                                    } else {
                                        if (z4) {
                                            p009e.a aVar2 = new p009e.a(iV);
                                            int i6 = Build.VERSION.SDK_INT;
                                            if (i6 >= 33 || (i6 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                            }
                                            int i7 = pickImagesMaxLimit;
                                            G1.a aVar3 = new G1.a();
                                            aVar3.f398b = cVar2;
                                            if (i6 >= 33 || (i6 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                MediaStore.getPickImagesMaxLimit();
                                            }
                                            aVar3.f398b = dVar;
                                            aVar3.f397a = i7;
                                            aVar3.f399c = bVar;
                                            intent2 = aVar2.c0(activity, aVar3);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f626a.ordinal();
                                    if (iOrdinal == 0) {
                                        H0.i iVar = nVar.f608o;
                                        if (!nVar.l(qVar, null, kVar)) {
                                            n.b(kVar);
                                        } else if (nVar.k() && H2.h.d((Activity) iVar.f443l, "android.permission.CAMERA") != 0) {
                                            H2.h.x((Activity) iVar.f443l, new String[]{"android.permission.CAMERA"}, 2345);
                                        } else {
                                            nVar.i();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        if (!nVar.l(qVar, null, kVar)) {
                                            n.b(kVar);
                                        } else {
                                            if (z4) {
                                                D d3 = new D(1);
                                                int i8 = Build.VERSION.SDK_INT;
                                                if (i8 >= 33 || (i8 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                                }
                                                int i9 = pickImagesMaxLimit;
                                                G1.a aVar4 = new G1.a();
                                                aVar4.f398b = cVar2;
                                                if (i8 >= 33 || (i8 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    MediaStore.getPickImagesMaxLimit();
                                                }
                                                aVar4.f398b = dVar;
                                                aVar4.f397a = i9;
                                                aVar4.f399c = bVar;
                                                intent = d3.c0(activity, aVar4);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar2 = (t) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.VideoSelectionOptions");
                            v vVar = (v) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar3 = (e) obj7;
                            I1.k kVar2 = new I1.k(cVar, 5);
                            u0 u0Var2 = ((p) pVar).f618l;
                            n nVar2 = (u0Var2 == null || ((Activity) u0Var2.f3795b) == null) ? null : (n) u0Var2.f3796c;
                            if (nVar2 == null) {
                                S0.a.f(kVar2, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity2 = nVar2.f606l;
                                s sVar5 = tVar2.f627b;
                                if (sVar5 != null) {
                                    nVar2.f612s = sVar5.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z5 = eVar3.f586a;
                                boolean z6 = eVar3.f587b;
                                p009e.e eVar4 = p009e.e.f2775a;
                                p009e.c cVar3 = p009e.c.f2773a;
                                int pickImagesMaxLimit2 = Integer.MAX_VALUE;
                                p009e.b bVar2 = p009e.b.f2772a;
                                if (z5) {
                                    int iV2 = E2.a.v(eVar3);
                                    if (!nVar2.l(null, vVar, kVar2)) {
                                        n.b(kVar2);
                                    } else {
                                        if (z6) {
                                            p009e.a aVar5 = new p009e.a(iV2);
                                            int i10 = Build.VERSION.SDK_INT;
                                            if (i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit2 = MediaStore.getPickImagesMaxLimit();
                                            }
                                            int i11 = pickImagesMaxLimit2;
                                            G1.a aVar6 = new G1.a();
                                            aVar6.f398b = cVar3;
                                            if (i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                MediaStore.getPickImagesMaxLimit();
                                            }
                                            aVar6.f398b = eVar4;
                                            aVar6.f397a = i11;
                                            aVar6.f399c = bVar2;
                                            intent4 = aVar5.c0(activity2, aVar6);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f626a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        H0.i iVar2 = nVar2.f608o;
                                        if (!nVar2.l(null, vVar, kVar2)) {
                                            n.b(kVar2);
                                        } else if (nVar2.k() && H2.h.d((Activity) iVar2.f443l, "android.permission.CAMERA") != 0) {
                                            H2.h.x((Activity) iVar2.f443l, new String[]{"android.permission.CAMERA"}, 2355);
                                        } else {
                                            nVar2.j();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        if (!nVar2.l(null, vVar, kVar2)) {
                                            n.b(kVar2);
                                        } else {
                                            if (z6) {
                                                D d4 = new D(1);
                                                int i12 = Build.VERSION.SDK_INT;
                                                if (i12 >= 33 || (i12 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit2 = MediaStore.getPickImagesMaxLimit();
                                                }
                                                int i13 = pickImagesMaxLimit2;
                                                G1.a aVar7 = new G1.a();
                                                aVar7.f398b = cVar3;
                                                if (i12 >= 33 || (i12 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    MediaStore.getPickImagesMaxLimit();
                                                }
                                                aVar7.f398b = eVar4;
                                                aVar7.f397a = i13;
                                                aVar7.f399c = bVar2;
                                                intent3 = d4.c0(activity2, aVar7);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.MediaSelectionOptions");
                            r rVar = (r) obj8;
                            Object obj9 = list3.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar5 = (e) obj9;
                            I1.k kVar3 = new I1.k(cVar, 6);
                            u0 u0Var3 = ((p) pVar).f618l;
                            n nVar3 = (u0Var3 == null || ((Activity) u0Var3.f3795b) == null) ? null : (n) u0Var3.f3796c;
                            if (nVar3 == null) {
                                S0.a.f(kVar3, new d("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!nVar3.l(rVar.f622a, null, kVar3)) {
                                n.b(kVar3);
                            } else {
                                Activity activity3 = nVar3.f606l;
                                boolean z7 = eVar5.f587b;
                                boolean z8 = eVar5.f586a;
                                if (z7) {
                                    p009e.b bVar3 = p009e.b.f2772a;
                                    int pickImagesMaxLimit3 = Integer.MAX_VALUE;
                                    p009e.c cVar4 = p009e.c.f2773a;
                                    if (z8) {
                                        p009e.a aVar8 = new p009e.a(E2.a.v(eVar5));
                                        int i14 = Build.VERSION.SDK_INT;
                                        if (i14 >= 33 || (i14 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit3 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        G1.a aVar9 = new G1.a();
                                        aVar9.f398b = cVar4;
                                        if (i14 >= 33 || (i14 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            MediaStore.getPickImagesMaxLimit();
                                        }
                                        aVar9.f398b = cVar4;
                                        aVar9.f397a = pickImagesMaxLimit3;
                                        aVar9.f399c = bVar3;
                                        intent5 = aVar8.c0(activity3, aVar9);
                                    } else {
                                        D d5 = new D(1);
                                        int i15 = Build.VERSION.SDK_INT;
                                        if (i15 >= 33 || (i15 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit3 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        G1.a aVar10 = new G1.a();
                                        aVar10.f398b = cVar4;
                                        if (i15 >= 33 || (i15 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            MediaStore.getPickImagesMaxLimit();
                                        }
                                        aVar10.f398b = cVar4;
                                        aVar10.f397a = pickImagesMaxLimit3;
                                        aVar10.f399c = bVar3;
                                        intent5 = d5.c0(activity3, aVar10);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", z8);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            try {
                                listD0 = E2.a.B(((p) pVar).a());
                                break;
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar2 = th;
                                    listD0 = P1.f.d0(dVar2.f584k, dVar2.f585l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        B1.s sVar4 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults", StringUtils.EMPTY), (C1.l) eVar.a(), aVarA);
        if (pVar == null) {
            sVar4.y(null);
        } else {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: J1.f
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    List listD0;
                    switch (i6) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar = (t) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                            q qVar = (q) obj3;
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar2 = (e) obj4;
                            I1.k kVar = new I1.k(cVar, 7);
                            u0 u0Var = ((p) pVar).f618l;
                            n nVar = (u0Var == null || ((Activity) u0Var.f3795b) == null) ? null : (n) u0Var.f3796c;
                            if (nVar == null) {
                                S0.a.f(kVar, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity = nVar.f606l;
                                s sVar5 = tVar.f627b;
                                if (sVar5 != null) {
                                    nVar.f612s = sVar5.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z3 = eVar2.f586a;
                                boolean z4 = eVar2.f587b;
                                p009e.d dVar = p009e.d.f2774a;
                                p009e.c cVar2 = p009e.c.f2773a;
                                int pickImagesMaxLimit = Integer.MAX_VALUE;
                                p009e.b bVar = p009e.b.f2772a;
                                if (z3) {
                                    int iV = E2.a.v(eVar2);
                                    if (!nVar.l(qVar, null, kVar)) {
                                        n.b(kVar);
                                    } else {
                                        if (z4) {
                                            p009e.a aVar2 = new p009e.a(iV);
                                            int i7 = Build.VERSION.SDK_INT;
                                            if (i7 >= 33 || (i7 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                            }
                                            int i8 = pickImagesMaxLimit;
                                            G1.a aVar3 = new G1.a();
                                            aVar3.f398b = cVar2;
                                            if (i7 >= 33 || (i7 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                MediaStore.getPickImagesMaxLimit();
                                            }
                                            aVar3.f398b = dVar;
                                            aVar3.f397a = i8;
                                            aVar3.f399c = bVar;
                                            intent2 = aVar2.c0(activity, aVar3);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f626a.ordinal();
                                    if (iOrdinal == 0) {
                                        H0.i iVar = nVar.f608o;
                                        if (!nVar.l(qVar, null, kVar)) {
                                            n.b(kVar);
                                        } else if (nVar.k() && H2.h.d((Activity) iVar.f443l, "android.permission.CAMERA") != 0) {
                                            H2.h.x((Activity) iVar.f443l, new String[]{"android.permission.CAMERA"}, 2345);
                                        } else {
                                            nVar.i();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        if (!nVar.l(qVar, null, kVar)) {
                                            n.b(kVar);
                                        } else {
                                            if (z4) {
                                                D d3 = new D(1);
                                                int i9 = Build.VERSION.SDK_INT;
                                                if (i9 >= 33 || (i9 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                                                }
                                                int i10 = pickImagesMaxLimit;
                                                G1.a aVar4 = new G1.a();
                                                aVar4.f398b = cVar2;
                                                if (i9 >= 33 || (i9 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    MediaStore.getPickImagesMaxLimit();
                                                }
                                                aVar4.f398b = dVar;
                                                aVar4.f397a = i10;
                                                aVar4.f399c = bVar;
                                                intent = d3.c0(activity, aVar4);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar2 = (t) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.VideoSelectionOptions");
                            v vVar = (v) obj6;
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar3 = (e) obj7;
                            I1.k kVar2 = new I1.k(cVar, 5);
                            u0 u0Var2 = ((p) pVar).f618l;
                            n nVar2 = (u0Var2 == null || ((Activity) u0Var2.f3795b) == null) ? null : (n) u0Var2.f3796c;
                            if (nVar2 == null) {
                                S0.a.f(kVar2, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                Activity activity2 = nVar2.f606l;
                                s sVar6 = tVar2.f627b;
                                if (sVar6 != null) {
                                    nVar2.f612s = sVar6.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z5 = eVar3.f586a;
                                boolean z6 = eVar3.f587b;
                                p009e.e eVar4 = p009e.e.f2775a;
                                p009e.c cVar3 = p009e.c.f2773a;
                                int pickImagesMaxLimit2 = Integer.MAX_VALUE;
                                p009e.b bVar2 = p009e.b.f2772a;
                                if (z5) {
                                    int iV2 = E2.a.v(eVar3);
                                    if (!nVar2.l(null, vVar, kVar2)) {
                                        n.b(kVar2);
                                    } else {
                                        if (z6) {
                                            p009e.a aVar5 = new p009e.a(iV2);
                                            int i11 = Build.VERSION.SDK_INT;
                                            if (i11 >= 33 || (i11 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                pickImagesMaxLimit2 = MediaStore.getPickImagesMaxLimit();
                                            }
                                            int i12 = pickImagesMaxLimit2;
                                            G1.a aVar6 = new G1.a();
                                            aVar6.f398b = cVar3;
                                            if (i11 >= 33 || (i11 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                MediaStore.getPickImagesMaxLimit();
                                            }
                                            aVar6.f398b = eVar4;
                                            aVar6.f397a = i12;
                                            aVar6.f399c = bVar2;
                                            intent4 = aVar5.c0(activity2, aVar6);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f626a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        H0.i iVar2 = nVar2.f608o;
                                        if (!nVar2.l(null, vVar, kVar2)) {
                                            n.b(kVar2);
                                        } else if (nVar2.k() && H2.h.d((Activity) iVar2.f443l, "android.permission.CAMERA") != 0) {
                                            H2.h.x((Activity) iVar2.f443l, new String[]{"android.permission.CAMERA"}, 2355);
                                        } else {
                                            nVar2.j();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        if (!nVar2.l(null, vVar, kVar2)) {
                                            n.b(kVar2);
                                        } else {
                                            if (z6) {
                                                D d4 = new D(1);
                                                int i13 = Build.VERSION.SDK_INT;
                                                if (i13 >= 33 || (i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    pickImagesMaxLimit2 = MediaStore.getPickImagesMaxLimit();
                                                }
                                                int i14 = pickImagesMaxLimit2;
                                                G1.a aVar7 = new G1.a();
                                                aVar7.f398b = cVar3;
                                                if (i13 >= 33 || (i13 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                                    MediaStore.getPickImagesMaxLimit();
                                                }
                                                aVar7.f398b = eVar4;
                                                aVar7.f397a = i14;
                                                aVar7.f399c = bVar2;
                                                intent3 = d4.c0(activity2, aVar7);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj8 = list3.get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.MediaSelectionOptions");
                            r rVar = (r) obj8;
                            Object obj9 = list3.get(1);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar5 = (e) obj9;
                            I1.k kVar3 = new I1.k(cVar, 6);
                            u0 u0Var3 = ((p) pVar).f618l;
                            n nVar3 = (u0Var3 == null || ((Activity) u0Var3.f3795b) == null) ? null : (n) u0Var3.f3796c;
                            if (nVar3 == null) {
                                S0.a.f(kVar3, new d("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!nVar3.l(rVar.f622a, null, kVar3)) {
                                n.b(kVar3);
                            } else {
                                Activity activity3 = nVar3.f606l;
                                boolean z7 = eVar5.f587b;
                                boolean z8 = eVar5.f586a;
                                if (z7) {
                                    p009e.b bVar3 = p009e.b.f2772a;
                                    int pickImagesMaxLimit3 = Integer.MAX_VALUE;
                                    p009e.c cVar4 = p009e.c.f2773a;
                                    if (z8) {
                                        p009e.a aVar8 = new p009e.a(E2.a.v(eVar5));
                                        int i15 = Build.VERSION.SDK_INT;
                                        if (i15 >= 33 || (i15 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit3 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        G1.a aVar9 = new G1.a();
                                        aVar9.f398b = cVar4;
                                        if (i15 >= 33 || (i15 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            MediaStore.getPickImagesMaxLimit();
                                        }
                                        aVar9.f398b = cVar4;
                                        aVar9.f397a = pickImagesMaxLimit3;
                                        aVar9.f399c = bVar3;
                                        intent5 = aVar8.c0(activity3, aVar9);
                                    } else {
                                        D d5 = new D(1);
                                        int i16 = Build.VERSION.SDK_INT;
                                        if (i16 >= 33 || (i16 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            pickImagesMaxLimit3 = MediaStore.getPickImagesMaxLimit();
                                        }
                                        G1.a aVar10 = new G1.a();
                                        aVar10.f398b = cVar4;
                                        if (i16 >= 33 || (i16 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                            MediaStore.getPickImagesMaxLimit();
                                        }
                                        aVar10.f398b = cVar4;
                                        aVar10.f397a = pickImagesMaxLimit3;
                                        aVar10.f399c = bVar3;
                                        intent5 = d5.c0(activity3, aVar10);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", z8);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            try {
                                listD0 = E2.a.B(((p) pVar).a());
                                break;
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar2 = th;
                                    listD0 = P1.f.d0(dVar2.f584k, dVar2.f585l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                    }
                }
            });
        }
    }
}
