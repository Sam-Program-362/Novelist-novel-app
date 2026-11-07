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
import P1.o;
import P1.p;
import a.AbstractC0102a;
import a2.h;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.datastore.preferences.protobuf.C0110g;
import d0.AbstractC0231b;
import e2.c;
import java.io.File;
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
import l0.AbstractC0410t;
import l0.C0379B;
import l0.C0411u;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.xmlpull.v1.XmlPullParser;
import q.g;
import t1.C0473a;
import v.C0484b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f1256a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f1257b;

    public a() {
        new ConcurrentHashMap();
    }

    public static List A(Resources resources, int i3) {
        if (i3 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
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
            obtainTypedArray.recycle();
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
            Set singleton = Collections.singleton(objArr[0]);
            h.d(singleton, "singleton(...)");
            return singleton;
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
        C0473a c0473a = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", uVar, c0473a);
        if (c0061j != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.G
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    switch (i3) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0061j2.getClass();
                                d02 = E2.a.B(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0061j3.getClass();
                                d03 = E2.a.B(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        case 2:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0061j4.getClass();
                                d04 = E2.a.B(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                        default:
                            C0061j c0061j5 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0061j5.getClass();
                                d05 = E2.a.B(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", uVar, c0473a);
        if (c0061j != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.G
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    switch (i4) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0061j2.getClass();
                                d02 = E2.a.B(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0061j3.getClass();
                                d03 = E2.a.B(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        case 2:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0061j4.getClass();
                                d04 = E2.a.B(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                        default:
                            C0061j c0061j5 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0061j5.getClass();
                                d05 = E2.a.B(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", uVar, c0473a);
        if (c0061j != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: M1.G
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    switch (i5) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0061j2.getClass();
                                d02 = E2.a.B(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0061j3.getClass();
                                d03 = E2.a.B(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        case 2:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0061j4.getClass();
                                d04 = E2.a.B(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                        default:
                            C0061j c0061j5 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0061j5.getClass();
                                d05 = E2.a.B(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", uVar, c0473a);
        if (c0061j == null) {
            sVar4.y(null);
        } else {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: M1.G
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    switch (i6) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj2;
                            try {
                                c0061j2.getClass();
                                d02 = E2.a.B(dName.getCName());
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj3;
                            try {
                                c0061j3.getClass();
                                d03 = E2.a.B(dName2.getDName());
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        case 2:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj4;
                            try {
                                c0061j4.getClass();
                                d04 = E2.a.B(dName3.getOName());
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                        default:
                            C0061j c0061j5 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj5;
                            try {
                                c0061j5.getClass();
                                d05 = E2.a.B(dName4.getUName());
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
        C0473a c0473a = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", uVar, c0473a);
        if (c0065n != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.C
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    switch (i3) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0065n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(cookieManager3.getCookie(str3));
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", uVar, c0473a);
        if (c0065n != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.C
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    switch (i4) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0065n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(cookieManager3.getCookie(str3));
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", uVar, c0473a);
        if (c0065n != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: M1.C
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    switch (i5) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0065n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(cookieManager3.getCookie(str3));
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", uVar, c0473a);
        if (c0065n != null) {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: M1.C
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    switch (i6) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0065n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(cookieManager3.getCookie(str3));
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.getCookies", uVar, c0473a);
        if (c0065n == null) {
            sVar5.y(null);
        } else {
            final int i7 = 4;
            sVar5.y(new C1.b() { // from class: M1.C
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    switch (i7) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), CookieManager.getInstance());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                            boolean booleanValue = ((Boolean) obj9).booleanValue();
                            try {
                                c0065n4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(cookieManager3.getCookie(str3));
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
        C0473a c0473a = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", uVar, c0473a);
        if (c0069s != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i3) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", uVar, c0473a);
        if (c0069s != null) {
            final int i4 = 2;
            sVar2.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i4) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", uVar, c0473a);
        if (c0069s != null) {
            final int i5 = 6;
            sVar3.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i5) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", uVar, c0473a);
        if (c0069s != null) {
            final int i6 = 7;
            sVar4.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i6) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", uVar, c0473a);
        if (c0069s != null) {
            final int i7 = 8;
            sVar5.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i7) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar5.y(null);
        }
        s sVar6 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", uVar, c0473a);
        if (c0069s != null) {
            final int i8 = 9;
            sVar6.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i8) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar6.y(null);
        }
        s sVar7 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", uVar, c0473a);
        if (c0069s != null) {
            final int i9 = 10;
            sVar7.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i9) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar7.y(null);
        }
        s sVar8 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", uVar, c0473a);
        if (c0069s != null) {
            final int i10 = 12;
            sVar8.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i10) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar8.y(null);
        }
        s sVar9 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", uVar, c0473a);
        if (c0069s != null) {
            final int i11 = 13;
            sVar9.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i11) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar9.y(null);
        }
        s sVar10 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", uVar, c0473a);
        if (c0069s != null) {
            final int i12 = 14;
            sVar10.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i12) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar10.y(null);
        }
        s sVar11 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", uVar, c0473a);
        if (c0069s != null) {
            final int i13 = 11;
            sVar11.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i13) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar11.y(null);
        }
        s sVar12 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", uVar, c0473a);
        if (c0069s != null) {
            final int i14 = 15;
            sVar12.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i14) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar12.y(null);
        }
        s sVar13 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", uVar, c0473a);
        if (c0069s != null) {
            final int i15 = 16;
            sVar13.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i15) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar13.y(null);
        }
        s sVar14 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", uVar, c0473a);
        if (c0069s != null) {
            final int i16 = 17;
            sVar14.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i16) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar14.y(null);
        }
        s sVar15 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", uVar, c0473a);
        if (c0069s != null) {
            final int i17 = 18;
            sVar15.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i17) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar15.y(null);
        }
        s sVar16 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", uVar, c0473a);
        if (c0069s != null) {
            final int i18 = 19;
            sVar16.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i18) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar16.y(null);
        }
        s sVar17 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", uVar, c0473a);
        if (c0069s != null) {
            final int i19 = 20;
            sVar17.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i19) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar17.y(null);
        }
        s sVar18 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", uVar, c0473a);
        if (c0069s != null) {
            final int i20 = 21;
            sVar18.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i20) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar18.y(null);
        }
        s sVar19 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", uVar, c0473a);
        if (c0069s != null) {
            final int i21 = 22;
            sVar19.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i21) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar19.y(null);
        }
        s sVar20 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", uVar, c0473a);
        if (c0069s != null) {
            final int i22 = 1;
            sVar20.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i22) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar20.y(null);
        }
        s sVar21 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", uVar, c0473a);
        if (c0069s != null) {
            final int i23 = 3;
            sVar21.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i23) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar21.y(null);
        }
        s sVar22 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", uVar, c0473a);
        if (c0069s != null) {
            final int i24 = 4;
            sVar22.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i24) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        } else {
            sVar22.y(null);
        }
        s sVar23 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", uVar, c0473a);
        if (c0069s == null) {
            sVar23.y(null);
        } else {
            final int i25 = 5;
            sVar23.y(new C1.b() { // from class: M1.M
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
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
                    List d012;
                    List d013;
                    List d014;
                    List d015;
                    List d016;
                    List d017;
                    List d018;
                    List d019;
                    List d020;
                    List d021;
                    List d022;
                    List d023;
                    switch (i25) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0069s2.f1156a.f1032c).a(((Long) obj2).longValue(), c0069s2.a());
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
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
                            long longValue = ((Long) obj8).longValue();
                            try {
                                c0069s6.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
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
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
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
                                d08 = E2.a.B(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C0052a) {
                                    C0052a c0052a7 = th7;
                                    d08 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                                } else {
                                    d08 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                                }
                            }
                            cVar.e(d08);
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
                                d09 = E2.a.B(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C0052a) {
                                    C0052a c0052a8 = th8;
                                    d09 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                                } else {
                                    d09 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                                }
                            }
                            cVar.e(d09);
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
                                d010 = E2.a.B(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C0052a) {
                                    C0052a c0052a9 = th9;
                                    d010 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                                } else {
                                    d010 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                                }
                            }
                            cVar.e(d010);
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
                                d011 = E2.a.B(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C0052a) {
                                    C0052a c0052a10 = th10;
                                    d011 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                                } else {
                                    d011 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                                }
                            }
                            cVar.e(d011);
                            break;
                        case 10:
                            C0069s c0069s12 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj20 = ((List) obj).get(0);
                            a2.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView10 = (WebView) obj20;
                            try {
                                c0069s12.getClass();
                                d012 = E2.a.B(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof C0052a) {
                                    C0052a c0052a11 = th11;
                                    d012 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                                } else {
                                    d012 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                                }
                            }
                            cVar.e(d012);
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
                                d013 = E2.a.B(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C0052a) {
                                    C0052a c0052a12 = th12;
                                    d013 = P1.f.d0(c0052a12.f1070k, c0052a12.f1071l, c0052a12.f1072m);
                                } else {
                                    d013 = P1.f.d0(th12.getClass().getSimpleName(), th12.toString(), B1.e.l("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                                }
                            }
                            cVar.e(d013);
                            break;
                        case 12:
                            C0069s c0069s14 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj22 = ((List) obj).get(0);
                            a2.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView12 = (WebView) obj22;
                            try {
                                c0069s14.getClass();
                                d014 = E2.a.B(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof C0052a) {
                                    C0052a c0052a13 = th13;
                                    d014 = P1.f.d0(c0052a13.f1070k, c0052a13.f1071l, c0052a13.f1072m);
                                } else {
                                    d014 = P1.f.d0(th13.getClass().getSimpleName(), th13.toString(), B1.e.l("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                                }
                            }
                            cVar.e(d014);
                            break;
                        case 13:
                            C0069s c0069s15 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj23 = ((List) obj).get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView13 = (WebView) obj23;
                            try {
                                c0069s15.getClass();
                                d015 = E2.a.B(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof C0052a) {
                                    C0052a c0052a14 = th14;
                                    d015 = P1.f.d0(c0052a14.f1070k, c0052a14.f1071l, c0052a14.f1072m);
                                } else {
                                    d015 = P1.f.d0(th14.getClass().getSimpleName(), th14.toString(), B1.e.l("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                                }
                            }
                            cVar.e(d015);
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
                                d016 = E2.a.B(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C0052a) {
                                    C0052a c0052a15 = th15;
                                    d016 = P1.f.d0(c0052a15.f1070k, c0052a15.f1071l, c0052a15.f1072m);
                                } else {
                                    d016 = P1.f.d0(th15.getClass().getSimpleName(), th15.toString(), B1.e.l("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                                }
                            }
                            cVar.e(d016);
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
                                d017 = E2.a.B(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C0052a) {
                                    C0052a c0052a16 = th16;
                                    d017 = P1.f.d0(c0052a16.f1070k, c0052a16.f1071l, c0052a16.f1072m);
                                } else {
                                    d017 = P1.f.d0(th16.getClass().getSimpleName(), th16.toString(), B1.e.l("Cause: ", th16.getCause(), ", Stacktrace: ", Log.getStackTraceString(th16)));
                                }
                            }
                            cVar.e(d017);
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
                            boolean booleanValue = ((Boolean) obj27).booleanValue();
                            try {
                                c0069s18.getClass();
                                webView16.clearCache(booleanValue);
                                d018 = E2.a.B(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C0052a) {
                                    C0052a c0052a17 = th17;
                                    d018 = P1.f.d0(c0052a17.f1070k, c0052a17.f1071l, c0052a17.f1072m);
                                } else {
                                    d018 = P1.f.d0(th17.getClass().getSimpleName(), th17.toString(), B1.e.l("Cause: ", th17.getCause(), ", Stacktrace: ", Log.getStackTraceString(th17)));
                                }
                            }
                            cVar.e(d018);
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
                                d019 = E2.a.B(webView17.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof C0052a) {
                                    C0052a c0052a18 = th18;
                                    d019 = P1.f.d0(c0052a18.f1070k, c0052a18.f1071l, c0052a18.f1072m);
                                } else {
                                    d019 = P1.f.d0(th18.getClass().getSimpleName(), th18.toString(), B1.e.l("Cause: ", th18.getCause(), ", Stacktrace: ", Log.getStackTraceString(th18)));
                                }
                            }
                            cVar.e(d019);
                            break;
                        case 19:
                            C0069s c0069s20 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj31 = ((List) obj).get(0);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s20.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                d020 = E2.a.B(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof C0052a) {
                                    C0052a c0052a19 = th19;
                                    d020 = P1.f.d0(c0052a19.f1070k, c0052a19.f1071l, c0052a19.f1072m);
                                } else {
                                    d020 = P1.f.d0(th19.getClass().getSimpleName(), th19.toString(), B1.e.l("Cause: ", th19.getCause(), ", Stacktrace: ", Log.getStackTraceString(th19)));
                                }
                            }
                            cVar.e(d020);
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
                                d021 = E2.a.B(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof C0052a) {
                                    C0052a c0052a20 = th20;
                                    d021 = P1.f.d0(c0052a20.f1070k, c0052a20.f1071l, c0052a20.f1072m);
                                } else {
                                    d021 = P1.f.d0(th20.getClass().getSimpleName(), th20.toString(), B1.e.l("Cause: ", th20.getCause(), ", Stacktrace: ", Log.getStackTraceString(th20)));
                                }
                            }
                            cVar.e(d021);
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
                                d022 = E2.a.B(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof C0052a) {
                                    C0052a c0052a21 = th21;
                                    d022 = P1.f.d0(c0052a21.f1070k, c0052a21.f1071l, c0052a21.f1072m);
                                } else {
                                    d022 = P1.f.d0(th21.getClass().getSimpleName(), th21.toString(), B1.e.l("Cause: ", th21.getCause(), ", Stacktrace: ", Log.getStackTraceString(th21)));
                                }
                            }
                            cVar.e(d022);
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
                                d023 = E2.a.B(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof C0052a) {
                                    C0052a c0052a22 = th22;
                                    d023 = P1.f.d0(c0052a22.f1070k, c0052a22.f1071l, c0052a22.f1072m);
                                } else {
                                    d023 = P1.f.d0(th22.getClass().getSimpleName(), th22.toString(), B1.e.l("Cause: ", th22.getCause(), ", Stacktrace: ", Log.getStackTraceString(th22)));
                                }
                            }
                            cVar.e(d023);
                            break;
                    }
                }
            });
        }
    }

    public static void G(XmlPullParser xmlPullParser) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i3});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final boolean I(String str, Z1.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.a()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.List r6, V.C0087k r7, T1.c r8) {
        /*
            boolean r0 = r8 instanceof V.C0081e
            if (r0 == 0) goto L13
            r0 = r8
            V.e r0 = (V.C0081e) r0
            int r1 = r0.f1403q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1403q = r1
            goto L18
        L13:
            V.e r0 = new V.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1402p
            int r1 = r0.f1403q
            r2 = 2
            r3 = 1
            S1.a r4 = S1.a.f1260k
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.util.Iterator r6 = r0.f1401o
            java.io.Serializable r7 = r0.n
            a2.o r7 = (a2.o) r7
            H2.h.E(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.n
            java.util.List r6 = (java.util.List) r6
            H2.h.E(r8)
            goto L5c
        L42:
            H2.h.E(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            V.g r1 = new V.g
            r5 = 0
            r1.<init>(r6, r8, r5)
            r0.n = r8
            r0.f1403q = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r4) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            a2.o r7 = new a2.o
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            Z1.l r8 = (Z1.l) r8
            r0.n = r7     // Catch: java.lang.Throwable -> L30
            r0.f1401o = r6     // Catch: java.lang.Throwable -> L30
            r0.f1403q = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.f(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r4) goto L65
            goto L93
        L7e:
            java.lang.Object r1 = r7.f1713k
            if (r1 != 0) goto L85
            r7.f1713k = r8
            goto L65
        L85:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            E2.a.b(r1, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f1713k
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            O1.g r4 = O1.g.f1211a
        L93:
            return r4
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.a.a(java.util.List, V.k, T1.c):java.lang.Object");
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

    public static int g(C0379B c0379b, AbstractC0231b abstractC0231b, View view, View view2, AbstractC0410t abstractC0410t, boolean z3) {
        if (abstractC0410t.p() == 0 || c0379b.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z3) {
            return Math.min(abstractC0231b.f(), abstractC0231b.b(view2) - abstractC0231b.c(view));
        }
        ((C0411u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int h(C0379B c0379b, AbstractC0231b abstractC0231b, View view, View view2, AbstractC0410t abstractC0410t, boolean z3) {
        if (abstractC0410t.p() == 0 || c0379b.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return c0379b.a();
        }
        abstractC0231b.b(view2);
        abstractC0231b.c(view);
        ((C0411u) view.getLayoutParams()).getClass();
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
                Iterable cVar = new c(0, objArr.length - 1, 1);
                if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                    Iterator it2 = cVar.iterator();
                    while (((e2.b) it2).f2788m) {
                        int nextInt = ((e2.b) it2).nextInt();
                        if (!m(objArr[nextInt], objArr2[nextInt])) {
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
                Iterable c02 = P1.f.c0((Collection) obj);
                if (!(c02 instanceof Collection) || !((Collection) c02).isEmpty()) {
                    Iterator it3 = c02.iterator();
                    while (((e2.b) it3).f2788m) {
                        int nextInt2 = ((e2.b) it3).nextInt();
                        if (!m(list.get(nextInt2), list2.get(nextInt2))) {
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
                    if (map2.containsKey(entry.getKey()) && m(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0143, code lost:
    
        if (n(r1.getValue(), r4.getValue()) == false) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.a.n(java.lang.Object, java.lang.Object):boolean");
    }

    public static int o(Object obj) {
        int i3 = 0;
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
        int i4 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (i3 < length) {
                double d3 = dArr[i3];
                int i5 = i4 * 31;
                if (d3 == 0.0d) {
                    d3 = 0.0d;
                }
                long doubleToLongBits = Double.doubleToLongBits(d3);
                i4 = i5 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                i3++;
            }
            return i4;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (i3 < length2) {
                float f3 = fArr[i3];
                int i6 = i4 * 31;
                if (f3 == 0.0f) {
                    f3 = 0.0f;
                }
                i4 = i6 + Float.floatToIntBits(f3);
                i3++;
            }
            return i4;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (i3 < length3) {
                i4 = (i4 * 31) + o(objArr[i3]);
                i3++;
            }
            return i4;
        }
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i4 = (i4 * 31) + o(it2.next());
            }
            return i4;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i3 += o(entry.getValue()) ^ (o(entry.getKey()) * 31);
            }
            return i3;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Number) obj).doubleValue();
            long doubleToLongBits2 = Double.doubleToLongBits(doubleValue != 0.0d ? doubleValue : 0.0d);
            return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        }
        if (!(obj instanceof Float)) {
            return obj.hashCode();
        }
        float floatValue = ((Number) obj).floatValue();
        return Float.floatToIntBits(floatValue != 0.0f ? floatValue : 0.0f);
    }

    public static N0.b p(byte[] bArr, Parcelable.Creator creator) {
        r.f(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        N0.b bVar = (N0.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }

    public static boolean q(double d3, double d4) {
        if ((d3 == 0.0d ? 0.0d : d3) == (d4 != 0.0d ? d4 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d3) && Double.isNaN(d4);
    }

    public static String r(C0110g c0110g) {
        StringBuilder sb = new StringBuilder(c0110g.size());
        for (int i3 = 0; i3 < c0110g.size(); i3++) {
            byte a3 = c0110g.a(i3);
            if (a3 == 34) {
                sb.append("\\\"");
            } else if (a3 == 39) {
                sb.append("\\'");
            } else if (a3 != 92) {
                switch (a3) {
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
                        if (a3 < 32 || a3 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a3 >>> 6) & 3) + 48));
                            sb.append((char) (((a3 >>> 3) & 7) + 48));
                            sb.append((char) ((a3 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a3);
                            break;
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
            int abs = (Math.abs(mVar2.f37c - i4) * 2) + (mVar2.f38d == z3 ? 0 : 1);
            if (mVar == null || i5 > abs) {
                mVar = mVar2;
                i5 = abs;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v.InterfaceC0483a x(android.content.res.XmlResourceParser r25, android.content.res.Resources r26) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.a.x(android.content.res.XmlResourceParser, android.content.res.Resources):v.a");
    }

    public abstract boolean b(g gVar, q.c cVar);

    public abstract boolean c(g gVar, Object obj, Object obj2);

    public abstract boolean d(g gVar, q.f fVar, q.f fVar2);

    public abstract Typeface i(Context context, C0484b c0484b, Resources resources, int i3);

    public abstract Typeface j(Context context, m[] mVarArr, int i3);

    public Typeface k(Context context, List list, int i3) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface l(Context context, Resources resources, int i3, String str, int i4) {
        File E3 = AbstractC0102a.E(context);
        if (E3 == null) {
            return null;
        }
        try {
            if (AbstractC0102a.q(E3, resources, i3)) {
                return Typeface.createFromFile(E3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            E3.delete();
        }
    }

    public abstract void y(q.f fVar, q.f fVar2);

    public abstract void z(q.f fVar, Thread thread);
}
