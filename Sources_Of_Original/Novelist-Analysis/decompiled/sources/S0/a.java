package S0;

import A.m;
import B1.e;
import B1.s;
import C1.f;
import C1.l;
import D.J;
import F0.n;
import I1.u;
import J1.d;
import M0.r;
import M1.C0061j;
import M1.C0065n;
import M1.C0069s;
import M1.O;
import O1.g;
import P1.o;
import P1.p;
import T1.c;
import V.C0081e;
import V.C0083g;
import V.C0087k;
import a2.h;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.datastore.preferences.protobuf.C0108g;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.metadata.Font;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p035l0.B;
import p035l0.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f1256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f1257b;

    public a() {
        new ConcurrentHashMap();
    }

    public static List A(Resources resources, int i3) {
        if (i3 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i4 = 0; i4 < typedArrayObtainTypedArray.length(); i4++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i3);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void B(Window window, boolean z3) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            J.e(window, z3);
        } else {
            if (i3 >= 30) {
                J.d(window, z3);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static Set C(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return o.f1221k;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            h.d(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(p.S(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static void D(f fVar, final C0061j c0061j) {
        O o2;
        h.e(fVar, "binaryMessenger");
        l uVar = (c0061j == null || (o2 = c0061j.f1123a) == null) ? new u(5) : o2.a();
        p057t1.a aVar = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", uVar, aVar);
        if (c0061j != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.G
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    switch (i3) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0061j2.getClass();
                                listD0 = E2.a.B(dName.getCName());
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0061j3.getClass();
                                listD1 = E2.a.B(dName2.getDName());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0061j4.getClass();
                                listD2 = E2.a.B(dName3.getOName());
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        default:
                            C0061j c0061j5 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0061j5.getClass();
                                listD3 = E2.a.B(dName4.getUName());
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", uVar, aVar);
        if (c0061j != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.G
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    switch (i4) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0061j2.getClass();
                                listD0 = E2.a.B(dName.getCName());
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0061j3.getClass();
                                listD1 = E2.a.B(dName2.getDName());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0061j4.getClass();
                                listD2 = E2.a.B(dName3.getOName());
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        default:
                            C0061j c0061j5 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0061j5.getClass();
                                listD3 = E2.a.B(dName4.getUName());
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", uVar, aVar);
        if (c0061j != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: M1.G
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    switch (i5) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0061j2.getClass();
                                listD0 = E2.a.B(dName.getCName());
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0061j3.getClass();
                                listD1 = E2.a.B(dName2.getDName());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0061j4.getClass();
                                listD2 = E2.a.B(dName3.getOName());
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        default:
                            C0061j c0061j5 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0061j5.getClass();
                                listD3 = E2.a.B(dName4.getUName());
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", uVar, aVar);
        if (c0061j == null) {
            sVar4.y(null);
        } else {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: M1.G
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    switch (i6) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0061j2.getClass();
                                listD0 = E2.a.B(dName.getCName());
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0061j3.getClass();
                                listD1 = E2.a.B(dName2.getDName());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0061j4.getClass();
                                listD2 = E2.a.B(dName3.getOName());
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        default:
                            C0061j c0061j5 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0061j5.getClass();
                                listD3 = E2.a.B(dName4.getUName());
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                    }
                }
            });
        }
    }

    public static void E(f fVar, final C0065n c0065n) {
        O o2;
        h.e(fVar, "binaryMessenger");
        l uVar = (c0065n == null || (o2 = c0065n.f1145a) == null) ? new u(5) : o2.a();
        p057t1.a aVar = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", uVar, aVar);
        if (c0065n != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.C
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    switch (i3) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c0065n3.getClass();
                                cookieManager.setCookie(str, str2);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            I1.k kVar = new I1.k(cVar, 8);
                            c0065n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C0064m(kVar, 0));
                            break;
                        case 3:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0065n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        default:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj10 = list3.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj10;
                            Object obj11 = list3.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            try {
                                c0065n5.getClass();
                                listD3 = E2.a.B(cookieManager3.getCookie(str3));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", uVar, aVar);
        if (c0065n != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.C
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    switch (i4) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c0065n3.getClass();
                                cookieManager.setCookie(str, str2);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            I1.k kVar = new I1.k(cVar, 8);
                            c0065n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C0064m(kVar, 0));
                            break;
                        case 3:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0065n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        default:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj10 = list3.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj10;
                            Object obj11 = list3.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            try {
                                c0065n5.getClass();
                                listD3 = E2.a.B(cookieManager3.getCookie(str3));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", uVar, aVar);
        if (c0065n != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: M1.C
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    switch (i5) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c0065n3.getClass();
                                cookieManager.setCookie(str, str2);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            I1.k kVar = new I1.k(cVar, 8);
                            c0065n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C0064m(kVar, 0));
                            break;
                        case 3:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0065n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        default:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj10 = list3.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj10;
                            Object obj11 = list3.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            try {
                                c0065n5.getClass();
                                listD3 = E2.a.B(cookieManager3.getCookie(str3));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", uVar, aVar);
        if (c0065n != null) {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: M1.C
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    switch (i6) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c0065n3.getClass();
                                cookieManager.setCookie(str, str2);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            I1.k kVar = new I1.k(cVar, 8);
                            c0065n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C0064m(kVar, 0));
                            break;
                        case 3:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0065n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        default:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj10 = list3.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj10;
                            Object obj11 = list3.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            try {
                                c0065n5.getClass();
                                listD3 = E2.a.B(cookieManager3.getCookie(str3));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.getCookies", uVar, aVar);
        if (c0065n == null) {
            sVar5.y(null);
        } else {
            final int i7 = 4;
            sVar5.y(new C1.b() { // from class: M1.C
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    switch (i7) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list.get(2);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj5;
                            try {
                                c0065n3.getClass();
                                cookieManager.setCookie(str, str2);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.CookieManager");
                            I1.k kVar = new I1.k(cVar, 8);
                            c0065n.getClass();
                            ((CookieManager) obj6).removeAllCookies(new C0064m(kVar, 0));
                            break;
                        case 3:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj7 = list2.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj7;
                            Object obj8 = list2.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj8;
                            Object obj9 = list2.get(2);
                            a2.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0065n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        default:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj10 = list3.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj10;
                            Object obj11 = list3.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            try {
                                c0065n5.getClass();
                                listD3 = E2.a.B(cookieManager3.getCookie(str3));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                    }
                }
            });
        }
    }

    public static void F(f fVar, final C0069s c0069s) {
        O o2;
        h.e(fVar, "binaryMessenger");
        l uVar = (c0069s == null || (o2 = c0069s.f1156a) == null) ? new u(5) : o2.a();
        p057t1.a aVar = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", uVar, aVar);
        if (c0069s != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i3) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", uVar, aVar);
        if (c0069s != null) {
            final int i4 = 2;
            sVar2.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i4) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", uVar, aVar);
        if (c0069s != null) {
            final int i5 = 6;
            sVar3.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i5) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", uVar, aVar);
        if (c0069s != null) {
            final int i6 = 7;
            sVar4.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i6) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", uVar, aVar);
        if (c0069s != null) {
            final int i7 = 8;
            sVar5.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i7) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar5.y(null);
        }
        s sVar6 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", uVar, aVar);
        if (c0069s != null) {
            final int i8 = 9;
            sVar6.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i8) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar6.y(null);
        }
        s sVar7 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", uVar, aVar);
        if (c0069s != null) {
            final int i9 = 10;
            sVar7.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i9) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar7.y(null);
        }
        s sVar8 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", uVar, aVar);
        if (c0069s != null) {
            final int i10 = 12;
            sVar8.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i10) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar8.y(null);
        }
        s sVar9 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", uVar, aVar);
        if (c0069s != null) {
            final int i11 = 13;
            sVar9.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i11) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar9.y(null);
        }
        s sVar10 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", uVar, aVar);
        if (c0069s != null) {
            final int i12 = 14;
            sVar10.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i12) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar10.y(null);
        }
        s sVar11 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", uVar, aVar);
        if (c0069s != null) {
            final int i13 = 11;
            sVar11.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i13) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar11.y(null);
        }
        s sVar12 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", uVar, aVar);
        if (c0069s != null) {
            final int i14 = 15;
            sVar12.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i14) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar12.y(null);
        }
        s sVar13 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", uVar, aVar);
        if (c0069s != null) {
            final int i15 = 16;
            sVar13.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i15) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar13.y(null);
        }
        s sVar14 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", uVar, aVar);
        if (c0069s != null) {
            final int i16 = 17;
            sVar14.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i16) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar14.y(null);
        }
        s sVar15 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", uVar, aVar);
        if (c0069s != null) {
            final int i17 = 18;
            sVar15.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i17) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar15.y(null);
        }
        s sVar16 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", uVar, aVar);
        if (c0069s != null) {
            final int i18 = 19;
            sVar16.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i18) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar16.y(null);
        }
        s sVar17 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", uVar, aVar);
        if (c0069s != null) {
            final int i19 = 20;
            sVar17.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i19) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar17.y(null);
        }
        s sVar18 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", uVar, aVar);
        if (c0069s != null) {
            final int i20 = 21;
            sVar18.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i20) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar18.y(null);
        }
        s sVar19 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", uVar, aVar);
        if (c0069s != null) {
            final int i21 = 22;
            sVar19.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i21) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar19.y(null);
        }
        s sVar20 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", uVar, aVar);
        if (c0069s != null) {
            final int i22 = 1;
            sVar20.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i22) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar20.y(null);
        }
        s sVar21 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", uVar, aVar);
        if (c0069s != null) {
            final int i23 = 3;
            sVar21.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i23) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar21.y(null);
        }
        s sVar22 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", uVar, aVar);
        if (c0069s != null) {
            final int i24 = 4;
            sVar22.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i24) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        } else {
            sVar22.y(null);
        }
        s sVar23 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", uVar, aVar);
        if (c0069s == null) {
            sVar23.y(null);
        } else {
            final int i25 = 5;
            sVar23.y(new C1.b() { // from class: M1.M
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
                    List listD15;
                    List listD16;
                    List listD17;
                    List listD18;
                    List listD19;
                    List listD20;
                    List listD21;
                    switch (i25) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                listD0 = E2.a.B(null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    listD0 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            break;
                        case 1:
                            C0069s c0069s3 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj3;
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                c0069s3.getClass();
                                webView.setDownloadListener(downloadListener);
                                listD1 = E2.a.B(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            break;
                        case 2:
                            C0069s c0069s4 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView2 = (WebView) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s4.f1156a.f1032c).a(((Long) obj5).longValue(), webView2.getSettings());
                                listD2 = E2.a.B(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    listD2 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            break;
                        case 3:
                            C0069s c0069s5 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView3 = (WebView) obj6;
                            Z z3 = (Z) list3.get(1);
                            try {
                                c0069s5.getClass();
                                webView3.setWebChromeClient(z3);
                                listD3 = E2.a.B(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    listD3 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            break;
                        case 4:
                            C0069s c0069s6 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView4 = (WebView) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) jLongValue);
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    listD4 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            break;
                        case 5:
                            C0069s c0069s7 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj).get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView5 = (WebView) obj9;
                            try {
                                c0069s7.getClass();
                                webView5.destroy();
                                listD5 = E2.a.B(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            break;
                        case 6:
                            C0069s c0069s8 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView6 = (WebView) obj10;
                            Object obj11 = list5.get(1);
                            a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj11;
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                c0069s8.getClass();
                                webView6.loadData(str, str2, str3);
                                listD6 = E2.a.B(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    listD6 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    listD6 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(listD6);
                            break;
                        case 7:
                            C0069s c0069s9 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView7 = (WebView) obj12;
                            String str4 = (String) list6.get(1);
                            Object obj13 = list6.get(2);
                            a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj13;
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                c0069s9.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                listD7 = E2.a.B(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    listD7 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    listD7 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(listD7);
                            break;
                        case 8:
                            C0069s c0069s10 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView8 = (WebView) obj14;
                            Object obj15 = list7.get(1);
                            a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj15;
                            Object obj16 = list7.get(2);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map<String, String> map = (Map) obj16;
                            try {
                                c0069s10.getClass();
                                webView8.loadUrl(str9, map);
                                listD8 = E2.a.B(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    listD8 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    listD8 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(listD8);
                            break;
                        case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                            C0069s c0069s11 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj17 = list8.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView9 = (WebView) obj17;
                            Object obj18 = list8.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj18;
                            Object obj19 = list8.get(2);
                            a2.h.c(obj19, "null cannot be cast to non-null type kotlin.ByteArray");
                            byte[] bArr = (byte[]) obj19;
                            try {
                                c0069s11.getClass();
                                webView9.postUrl(str10, bArr);
                                listD9 = E2.a.B(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    listD9 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    listD9 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(listD9);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                listD10 = E2.a.B(webView10.getUrl());
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    listD10 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    listD10 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(listD10);
                            break;
                        case 11:
                            C0069s c0069s13 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj21 = ((List) obj).get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView11 = (WebView) obj21;
                            try {
                                c0069s13.getClass();
                                webView11.goForward();
                                listD11 = E2.a.B(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    listD11 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    listD11 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(listD11);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                listD12 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    listD12 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    listD12 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(listD12);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    listD13 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    listD13 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(listD13);
                            break;
                        case 14:
                            C0069s c0069s16 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj24 = ((List) obj).get(0);
                            a2.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView14 = (WebView) obj24;
                            try {
                                c0069s16.getClass();
                                webView14.goBack();
                                listD14 = E2.a.B(null);
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    listD14 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    listD14 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(listD14);
                            break;
                        case 15:
                            C0069s c0069s17 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj25 = ((List) obj).get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView15 = (WebView) obj25;
                            try {
                                c0069s17.getClass();
                                webView15.reload();
                                listD15 = E2.a.B(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    listD15 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    listD15 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(listD15);
                            break;
                        case 16:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj26 = list9.get(0);
                            a2.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView16 = (WebView) obj26;
                            Object obj27 = list9.get(1);
                            a2.h.c(obj27, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(zBooleanValue);
                                listD16 = E2.a.B(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    listD16 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    listD16 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(listD16);
                            break;
                        case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj28 = list10.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebView");
                            Object obj29 = list10.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            I1.k kVar = new I1.k(cVar, 9);
                            c0069s.getClass();
                            ((WebView) obj28).evaluateJavascript((String) obj29, new C0064m(kVar, 1));
                            break;
                        case 18:
                            C0069s c0069s19 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj30 = ((List) obj).get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView17 = (WebView) obj30;
                            try {
                                c0069s19.getClass();
                                listD17 = E2.a.B(webView17.getTitle());
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    listD17 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    listD17 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(listD17);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(zBooleanValue2);
                                listD18 = E2.a.B(null);
                                break;
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    listD18 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    listD18 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(listD18);
                            break;
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                            C0069s c0069s21 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            Object obj32 = list11.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView18 = (WebView) obj32;
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                c0069s21.getClass();
                                webView18.setWebViewClient(webViewClient);
                                listD19 = E2.a.B(null);
                                break;
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    listD19 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    listD19 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(listD19);
                            break;
                        case 21:
                            C0069s c0069s22 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj;
                            Object obj33 = list12.get(0);
                            a2.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView19 = (WebView) obj33;
                            Object obj34 = list12.get(1);
                            a2.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
                            C0074x c0074x = (C0074x) obj34;
                            try {
                                c0069s22.getClass();
                                webView19.addJavascriptInterface(c0074x, c0074x.f1168a);
                                listD20 = E2.a.B(null);
                                break;
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    listD20 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    listD20 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(listD20);
                            break;
                        default:
                            C0069s c0069s23 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            Object obj35 = list13.get(0);
                            a2.h.c(obj35, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView20 = (WebView) obj35;
                            Object obj36 = list13.get(1);
                            a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj36;
                            try {
                                c0069s23.getClass();
                                webView20.removeJavascriptInterface(str11);
                                listD21 = E2.a.B(null);
                                break;
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    listD21 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    listD21 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(listD21);
                            break;
                    }
                }
            });
        }
    }

    public static void G(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    public static int H(Context context, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i3});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final boolean I(String str, Z1.a aVar) {
        try {
            boolean zBooleanValue = ((Boolean) aVar.a()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static final Bundle J(String str, String str2, String str3) {
        h.e(str, "serverClientId");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", str2);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static void K(int i3, Object[] objArr) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (objArr[i4] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 9);
                sb.append("at index ");
                sb.append(i4);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    public static final Object a(List list, C0087k c0087k, c cVar) throws Throwable {
        C0081e c0081e;
        List list2;
        a2.o oVar;
        Iterator it2;
        Throwable th;
        Z1.l lVar;
        if (cVar instanceof C0081e) {
            c0081e = (C0081e) cVar;
            int i3 = c0081e.f1403q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0081e.f1403q = i3 - Integer.MIN_VALUE;
            } else {
                c0081e = new C0081e(cVar);
            }
        } else {
            c0081e = new C0081e(cVar);
        }
        Object obj = c0081e.f1402p;
        int i4 = c0081e.f1403q;
        Object obj2 = S1.a.f1260k;
        if (i4 != 0) {
            if (i4 == 1) {
                list2 = (List) c0081e.n;
                H2.h.E(obj);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = c0081e.f1401o;
                oVar = (a2.o) c0081e.n;
                try {
                    H2.h.E(obj);
                } catch (Throwable th2) {
                    Object obj3 = oVar.f1713k;
                    if (obj3 == null) {
                        oVar.f1713k = th2;
                    } else {
                        E2.a.b((Throwable) obj3, th2);
                    }
                }
            }
            while (it2.hasNext()) {
                lVar = (Z1.l) it2.next();
                c0081e.n = oVar;
                c0081e.f1401o = it2;
                c0081e.f1403q = 2;
                if (lVar.f(c0081e) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) oVar.f1713k;
            if (th == null) {
                return g.f1211a;
            }
            throw th;
        }
        H2.h.E(obj);
        ArrayList arrayList = new ArrayList();
        C0083g c0083g = new C0083g(list, arrayList, null);
        c0081e.n = arrayList;
        c0081e.f1403q = 1;
        if (c0087k.a(c0083g, c0081e) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        oVar = new a2.o();
        it2 = list2.iterator();
        while (it2.hasNext()) {
            lVar = (Z1.l) it2.next();
            c0081e.n = oVar;
            c0081e.f1401o = it2;
            c0081e.f1403q = 2;
            if (lVar.f(c0081e) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) oVar.f1713k;
        if (th == null) {
            return g.f1211a;
        }
        throw th;
    }

    public static void e(int i3, int i4, int i5) {
        if (i3 >= 0 && i4 <= i5) {
            if (i3 > i4) {
                throw new IllegalArgumentException(e.i("fromIndex: ", i3, " > toIndex: ", i4));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
    }

    public static final void f(Z1.l lVar, d dVar) {
        lVar.f(new O1.d(H2.h.i(dVar)));
    }

    public static int g(B b3, p008d0.b bVar, View view, View view2, t tVar, boolean z3) {
        if (tVar.p() == 0 || b3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z3) {
            return Math.min(bVar.f(), bVar.b(view2) - bVar.c(view));
        }
        ((p035l0.u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int h(B b3, p008d0.b bVar, View view, View view2, t tVar, boolean z3) {
        if (tVar.p() == 0 || b3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return b3.a();
        }
        bVar.b(view2);
        bVar.c(view);
        ((p035l0.u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static boolean m(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length == objArr2.length) {
                Iterable cVar = new p012e2.c(0, objArr.length - 1, 1);
                if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                    Iterator it2 = cVar.iterator();
                    while (((p012e2.b) it2).f2788m) {
                        int iNextInt = ((p012e2.b) it2).nextInt();
                        if (!m(objArr[iNextInt], objArr2[iNextInt])) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() == list2.size()) {
                Iterable iterableC0 = P1.f.c0((Collection) obj);
                if (!(iterableC0 instanceof Collection) || !((Collection) iterableC0).isEmpty()) {
                    Iterator it3 = iterableC0.iterator();
                    while (((p012e2.b) it3).f2788m) {
                        int iNextInt2 = ((p012e2.b) it3).nextInt();
                        if (!m(list.get(iNextInt2), list2.get(iNextInt2))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return h.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() == map2.size()) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!map2.containsKey(entry.getKey()) || !m(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                return Arrays.equals((byte[]) obj, (byte[]) obj2);
            }
            if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                return Arrays.equals((int[]) obj, (int[]) obj2);
            }
            if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                return Arrays.equals((long[]) obj, (long[]) obj2);
            }
            if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (dArr.length == dArr2.length) {
                    int length = dArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (q(dArr[i3], dArr2[i3])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (fArr.length == fArr2.length) {
                    int length2 = fArr.length;
                    for (int i4 = 0; i4 < length2; i4++) {
                        if (u(fArr[i4], fArr2[i4])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (objArr.length == objArr2.length) {
                    int length3 = objArr.length;
                    for (int i5 = 0; i5 < length3; i5++) {
                        if (n(objArr[i5], objArr2[i5])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof List) && (obj2 instanceof List)) {
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    Iterator it2 = list.iterator();
                    Iterator it3 = list2.iterator();
                    while (it2.hasNext() && it3.hasNext()) {
                        if (!n(it2.next(), it3.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        return q(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? u(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (n(key, entry2.getKey())) {
                                if (!n(entry.getValue(), entry2.getValue())) {
                                    break loop4;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static int o(Object obj) {
        int iO = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.hashCode((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.hashCode((long[]) obj);
        }
        int iO2 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (iO < length) {
                double d3 = dArr[iO];
                int i3 = iO2 * 31;
                if (d3 == 0.0d) {
                    d3 = 0.0d;
                }
                long jDoubleToLongBits = Double.doubleToLongBits(d3);
                iO2 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                iO++;
            }
            return iO2;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (iO < length2) {
                float f3 = fArr[iO];
                int i4 = iO2 * 31;
                if (f3 == 0.0f) {
                    f3 = 0.0f;
                }
                iO2 = i4 + Float.floatToIntBits(f3);
                iO++;
            }
            return iO2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (iO < length3) {
                iO2 = (iO2 * 31) + o(objArr[iO]);
                iO++;
            }
            return iO2;
        }
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iO2 = (iO2 * 31) + o(it2.next());
            }
            return iO2;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                iO += o(entry.getValue()) ^ (o(entry.getKey()) * 31);
            }
            return iO;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Number) obj).doubleValue();
            long jDoubleToLongBits2 = Double.doubleToLongBits(dDoubleValue != 0.0d ? dDoubleValue : 0.0d);
            return (int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32));
        }
        if (!(obj instanceof Float)) {
            return obj.hashCode();
        }
        float fFloatValue = ((Number) obj).floatValue();
        return Float.floatToIntBits(fFloatValue != 0.0f ? fFloatValue : 0.0f);
    }

    public static N0.b p(byte[] bArr, Parcelable.Creator creator) {
        r.f(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        N0.b bVar = (N0.b) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return bVar;
    }

    public static boolean q(double d3, double d4) {
        if ((d3 == 0.0d ? 0.0d : d3) == (d4 != 0.0d ? d4 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d3) && Double.isNaN(d4);
    }

    public static String r(C0108g c0108g) {
        StringBuilder sb = new StringBuilder(c0108g.size());
        for (int i3 = 0; i3 < c0108g.size(); i3++) {
            byte bA = c0108g.a(i3);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static InvocationHandler s() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static m t(m[] mVarArr, int i3) {
        int i4 = (i3 & 1) == 0 ? 400 : 700;
        boolean z3 = (i3 & 2) != 0;
        m mVar = null;
        int i5 = Integer.MAX_VALUE;
        for (m mVar2 : mVarArr) {
            int iAbs = (Math.abs(mVar2.f37c - i4) * 2) + (mVar2.f38d == z3 ? 0 : 1);
            if (mVar == null || i5 > iAbs) {
                mVar = mVar2;
                i5 = iAbs;
            }
        }
        return mVar;
    }

    public static boolean u(float f3, float f4) {
        if ((f3 == 0.0f ? 0.0f : f3) == (f4 != 0.0f ? f4 : 0.0f)) {
            return true;
        }
        return Float.isNaN(f3) && Float.isNaN(f4);
    }

    public static Y0.b v(Context context) {
        r.f(context);
        return new Y0.b(context, new n());
    }

    public static boolean w() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011b A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x011f A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014c A[Catch: all -> 0x0157, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0150 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #3 {all -> 0x0157, blocks: (B:66:0x0117, B:68:0x011b, B:70:0x011f, B:72:0x0128, B:74:0x012e, B:77:0x0134, B:82:0x0144, B:80:0x013d, B:83:0x014c, B:84:0x0150), top: B:156:0x0117, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    public static p060v.a x(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i3;
        int i4;
        ?? r3;
        long j3;
        Throwable th;
        ?? r4;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        do {
            next = xmlResourceParser.next();
            i3 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            G(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p050r.a.f4330a);
        int i5 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals(Font.PREFIX_FONT_META)) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p050r.a.f4331b);
                        int i7 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z3 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = typedArrayObtainAttributes2.getInt(i8, 0);
                        int i10 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i10, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i10);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            G(xmlResourceParser);
                        }
                        arrayList.add(new p060v.c(i7, i9, resourceId2, string7, string6, z3));
                    } else {
                        G(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new p060v.b((p060v.c[]) arrayList.toArray(new p060v.c[0]));
        }
        List listA = A(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i3) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p050r.a.f4332c);
                    int i11 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i5);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i3);
                        if (string8 == null) {
                            r3 = typedArrayObtainAttributes3;
                            j3 = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                G(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r4 = typedArrayObtainAttributes3;
                                j3 = 1;
                            }
                        }
                        try {
                            r3 = typedArrayObtainAttributes3;
                            i4 = i11;
                            j3 = 1;
                            try {
                                A.g gVar = new A.g(string, string2, string8, listA, string9, string10);
                                if (r3 instanceof AutoCloseable) {
                                    ((AutoCloseable) r3).close();
                                } else if (r3 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r3;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z4 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z4) {
                                                    executorService2.shutdownNow();
                                                    z4 = true;
                                                }
                                            }
                                        }
                                        if (z4) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r3.recycle();
                                }
                                arrayList2.add(gVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r3 = typedArrayObtainAttributes3;
                            j3 = 1;
                            th = th;
                            r4 = r3;
                            if (r4 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r4 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r4).close();
                                    throw th;
                                }
                                if (r4 instanceof ExecutorService) {
                                    r4.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r4;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r3 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r4 = r3;
                    if (r4 != 0) {
                        throw th;
                    }
                    if (!(r4 instanceof AutoCloseable)) {
                        ((AutoCloseable) r4).close();
                        throw th;
                    }
                    if (r4 instanceof ExecutorService) {
                        r4.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r4;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z5 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j3, TimeUnit.DAYS);
                        } catch (InterruptedException unused2) {
                            if (!z5) {
                                executorService.shutdownNow();
                                z5 = true;
                            }
                        }
                    }
                    if (!z5) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i4 = integer;
                G(xmlResourceParser);
                integer = i4;
                string3 = string3;
                string4 = string4;
                i3 = 2;
                i5 = 0;
                i6 = 3;
            }
        }
        int i12 = integer;
        String str = string3;
        String str2 = string4;
        if (!arrayList2.isEmpty()) {
            return new p060v.d(arrayList2, i12, integer2, string5);
        }
        if (str == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new A.g(string, string2, str, listA, null, null));
        if (str2 != null) {
            arrayList2.add(new A.g(string, string2, str2, listA, null, null));
        }
        return new p060v.d(arrayList2, i12, integer2, string5);
    }

    public abstract boolean b(p047q.g gVar, p047q.c cVar);

    public abstract boolean c(p047q.g gVar, Object obj, Object obj2);

    public abstract boolean d(p047q.g gVar, p047q.f fVar, p047q.f fVar2);

    public abstract Typeface i(Context context, p060v.b bVar, Resources resources, int i3);

    public abstract Typeface j(Context context, m[] mVarArr, int i3);

    public Typeface k(Context context, List list, int i3) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface l(Context context, Resources resources, int i3, String str, int i4) {
        File fileE = p000a.a.E(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (p000a.a.q(fileE, resources, i3)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public abstract void y(p047q.f fVar, p047q.f fVar2);

    public abstract void z(p047q.f fVar, Thread thread);
}
