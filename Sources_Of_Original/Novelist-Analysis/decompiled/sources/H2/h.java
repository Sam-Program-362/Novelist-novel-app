package H2;

import B1.s;
import C1.l;
import D.F;
import D.G;
import I.j;
import I1.u;
import K0.k;
import M0.C0047c;
import M1.C0061j;
import M1.C0065n;
import M1.C0069s;
import M1.O;
import R1.i;
import Z1.p;
import a2.r;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.WebSettings;
import com.google.android.gms.common.api.Status;
import i2.AbstractC0209q;
import i2.AbstractC0212u;
import i2.C0207o;
import it.returntrue.novelist.R;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n2.q;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;
import p003b0.U;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static g f458a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f459b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f460c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f465h;

    public h(U u) {
        a2.h.e(u, "operation");
    }

    public static void A(C1.f fVar, final C0065n c0065n) {
        O o2;
        a2.h.e(fVar, "binaryMessenger");
        l uVar = (c0065n == null || (o2 = c0065n.f1145a) == null) ? new u(5) : o2.a();
        p057t1.a aVar = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", uVar, aVar);
        if (c0065n != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.F
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    X509Certificate x509Certificate;
                    switch (i3) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c0065n2.getClass();
                                listD0 = E2.a.B(sslCertificate.getIssuedBy());
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
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c0065n3.getClass();
                                listD1 = E2.a.B(sslCertificate2.getIssuedTo());
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
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c0065n4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listD2 = E2.a.B(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c0065n5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listD3 = E2.a.B(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c0065n6.f1145a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listD4 = E2.a.B(x509Certificate);
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
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", uVar, aVar);
        if (c0065n != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.F
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    X509Certificate x509Certificate;
                    switch (i4) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c0065n2.getClass();
                                listD0 = E2.a.B(sslCertificate.getIssuedBy());
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
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c0065n3.getClass();
                                listD1 = E2.a.B(sslCertificate2.getIssuedTo());
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
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c0065n4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listD2 = E2.a.B(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c0065n5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listD3 = E2.a.B(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c0065n6.f1145a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listD4 = E2.a.B(x509Certificate);
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
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", uVar, aVar);
        if (c0065n != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: M1.F
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    X509Certificate x509Certificate;
                    switch (i5) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c0065n2.getClass();
                                listD0 = E2.a.B(sslCertificate.getIssuedBy());
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
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c0065n3.getClass();
                                listD1 = E2.a.B(sslCertificate2.getIssuedTo());
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
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c0065n4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listD2 = E2.a.B(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c0065n5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listD3 = E2.a.B(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c0065n6.f1145a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listD4 = E2.a.B(x509Certificate);
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
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", uVar, aVar);
        if (c0065n != null) {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: M1.F
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    X509Certificate x509Certificate;
                    switch (i6) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c0065n2.getClass();
                                listD0 = E2.a.B(sslCertificate.getIssuedBy());
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
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c0065n3.getClass();
                                listD1 = E2.a.B(sslCertificate2.getIssuedTo());
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
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c0065n4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listD2 = E2.a.B(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c0065n5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listD3 = E2.a.B(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c0065n6.f1145a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listD4 = E2.a.B(x509Certificate);
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
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", uVar, aVar);
        if (c0065n == null) {
            sVar5.y(null);
        } else {
            final int i7 = 4;
            sVar5.y(new C1.b() { // from class: M1.F
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    X509Certificate x509Certificate;
                    switch (i7) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj2;
                            try {
                                c0065n2.getClass();
                                listD0 = E2.a.B(sslCertificate.getIssuedBy());
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
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj3;
                            try {
                                c0065n3.getClass();
                                listD1 = E2.a.B(sslCertificate2.getIssuedTo());
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
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj).get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj4;
                            try {
                                c0065n4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listD2 = E2.a.B(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj).get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj5;
                            try {
                                c0065n5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listD3 = E2.a.B(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj6;
                            try {
                                c0065n6.f1145a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listD4 = E2.a.B(x509Certificate);
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
                    }
                }
            });
        }
    }

    public static void B(C1.f fVar, final C0069s c0069s) {
        O o2;
        a2.h.e(fVar, "binaryMessenger");
        l uVar = (c0069s == null || (o2 = c0069s.f1156a) == null) ? new u(5) : o2.a();
        p057t1.a aVar = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", uVar, aVar);
        if (c0069s != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.L
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
                    switch (i3) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", uVar, aVar);
        if (c0069s != null) {
            final int i4 = 15;
            sVar2.y(new C1.b() { // from class: M1.L
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
                    switch (i4) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", uVar, aVar);
        if (c0069s != null) {
            final int i5 = 16;
            sVar3.y(new C1.b() { // from class: M1.L
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
                    switch (i5) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", uVar, aVar);
        if (c0069s != null) {
            final int i6 = 1;
            sVar4.y(new C1.b() { // from class: M1.L
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
                    switch (i6) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", uVar, aVar);
        if (c0069s != null) {
            final int i7 = 2;
            sVar5.y(new C1.b() { // from class: M1.L
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
                    switch (i7) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar5.y(null);
        }
        s sVar6 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", uVar, aVar);
        if (c0069s != null) {
            final int i8 = 3;
            sVar6.y(new C1.b() { // from class: M1.L
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
                    switch (i8) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar6.y(null);
        }
        s sVar7 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", uVar, aVar);
        if (c0069s != null) {
            final int i9 = 4;
            sVar7.y(new C1.b() { // from class: M1.L
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
                    switch (i9) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar7.y(null);
        }
        s sVar8 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", uVar, aVar);
        if (c0069s != null) {
            final int i10 = 5;
            sVar8.y(new C1.b() { // from class: M1.L
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
                    switch (i10) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar8.y(null);
        }
        s sVar9 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", uVar, aVar);
        if (c0069s != null) {
            final int i11 = 6;
            sVar9.y(new C1.b() { // from class: M1.L
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
                    switch (i11) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar9.y(null);
        }
        s sVar10 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", uVar, aVar);
        if (c0069s != null) {
            final int i12 = 7;
            sVar10.y(new C1.b() { // from class: M1.L
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
                    switch (i12) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar10.y(null);
        }
        s sVar11 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", uVar, aVar);
        if (c0069s != null) {
            final int i13 = 8;
            sVar11.y(new C1.b() { // from class: M1.L
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
                    switch (i13) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar11.y(null);
        }
        s sVar12 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", uVar, aVar);
        if (c0069s != null) {
            final int i14 = 9;
            sVar12.y(new C1.b() { // from class: M1.L
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
                    switch (i14) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar12.y(null);
        }
        s sVar13 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", uVar, aVar);
        if (c0069s != null) {
            final int i15 = 10;
            sVar13.y(new C1.b() { // from class: M1.L
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
                    switch (i15) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar13.y(null);
        }
        s sVar14 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", uVar, aVar);
        if (c0069s != null) {
            final int i16 = 11;
            sVar14.y(new C1.b() { // from class: M1.L
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
                    switch (i16) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar14.y(null);
        }
        s sVar15 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", uVar, aVar);
        if (c0069s != null) {
            final int i17 = 12;
            sVar15.y(new C1.b() { // from class: M1.L
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
                    switch (i17) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar15.y(null);
        }
        s sVar16 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", uVar, aVar);
        if (c0069s != null) {
            final int i18 = 13;
            sVar16.y(new C1.b() { // from class: M1.L
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
                    switch (i18) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        } else {
            sVar16.y(null);
        }
        s sVar17 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", uVar, aVar);
        if (c0069s == null) {
            sVar17.y(null);
        } else {
            final int i19 = 14;
            sVar17.y(new C1.b() { // from class: M1.L
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
                    switch (i19) {
                        case 0:
                            C0069s c0069s2 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            try {
                                c0069s2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj4;
                            Object obj5 = list2.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                            try {
                                c0069s3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj6;
                            String str = (String) list3.get(1);
                            try {
                                c0069s4.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            Object obj7 = list4.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj7;
                            Object obj8 = list4.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0069s5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
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
                            List list5 = (List) obj;
                            Object obj9 = list5.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj9;
                            Object obj10 = list5.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0069s6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
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
                            List list6 = (List) obj;
                            Object obj11 = list6.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj11;
                            Object obj12 = list6.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0069s7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
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
                            List list7 = (List) obj;
                            Object obj13 = list7.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj13;
                            Object obj14 = list7.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj14).booleanValue();
                            try {
                                c0069s8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
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
                            List list8 = (List) obj;
                            Object obj15 = list8.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj15;
                            Object obj16 = list8.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj16).booleanValue();
                            try {
                                c0069s9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
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
                            List list9 = (List) obj;
                            Object obj17 = list9.get(0);
                            a2.h.c(obj17, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj17;
                            Object obj18 = list9.get(1);
                            a2.h.c(obj18, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj18).booleanValue();
                            try {
                                c0069s10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
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
                            List list10 = (List) obj;
                            Object obj19 = list10.get(0);
                            a2.h.c(obj19, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj19;
                            Object obj20 = list10.get(1);
                            a2.h.c(obj20, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj20).booleanValue();
                            try {
                                c0069s11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
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
                            List list11 = (List) obj;
                            Object obj21 = list11.get(0);
                            a2.h.c(obj21, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj21;
                            Object obj22 = list11.get(1);
                            a2.h.c(obj22, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj22).booleanValue();
                            try {
                                c0069s12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD10 = E2.a.B(null);
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
                            List list12 = (List) obj;
                            Object obj23 = list12.get(0);
                            a2.h.c(obj23, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj23;
                            Object obj24 = list12.get(1);
                            a2.h.c(obj24, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj24).booleanValue();
                            try {
                                c0069s13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
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
                            List list13 = (List) obj;
                            Object obj25 = list13.get(0);
                            a2.h.c(obj25, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj25;
                            Object obj26 = list13.get(1);
                            a2.h.c(obj26, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj26).longValue();
                            try {
                                c0069s14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD12 = E2.a.B(null);
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
                            Object obj27 = ((List) obj).get(0);
                            a2.h.c(obj27, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj27;
                            try {
                                c0069s15.getClass();
                                listD13 = E2.a.B(webSettings14.getUserAgentString());
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
                            List list14 = (List) obj;
                            Object obj28 = list14.get(0);
                            a2.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj28;
                            Object obj29 = list14.get(1);
                            a2.h.c(obj29, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0075y enumC0075y = (EnumC0075y) obj29;
                            try {
                                c0069s16.getClass();
                                int iOrdinal = enumC0075y.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
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
                            List list15 = (List) obj;
                            Object obj30 = list15.get(0);
                            a2.h.c(obj30, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj30;
                            Object obj31 = list15.get(1);
                            a2.h.c(obj31, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj31).booleanValue();
                            try {
                                c0069s17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
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
                        default:
                            C0069s c0069s18 = c0069s;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj;
                            Object obj32 = list16.get(0);
                            a2.h.c(obj32, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj32;
                            Object obj33 = list16.get(1);
                            a2.h.c(obj33, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj33).booleanValue();
                            try {
                                c0069s18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
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
                    }
                }
            });
        }
    }

    public static final Object C(q qVar, q qVar2, p pVar) throws Throwable {
        Object c0207o;
        Object objG;
        try {
            r.a(2, pVar);
            c0207o = pVar.e(qVar2, qVar);
        } catch (Throwable th) {
            c0207o = new C0207o(th, false);
        }
        S1.a aVar = S1.a.f1260k;
        if (c0207o == aVar || (objG = qVar.G(c0207o)) == AbstractC0212u.f3029d) {
            return aVar;
        }
        if (objG instanceof C0207o) {
            throw ((C0207o) objG).f3017a;
        }
        return AbstractC0212u.l(objG);
    }

    public static boolean D(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                if (bArr[i3] == bArr2[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void E(Object obj) {
        if (obj instanceof O1.c) {
            throw ((O1.c) obj).f1205k;
        }
    }

    public static Object F(p pVar, Object obj, R1.c cVar) {
        Object cVar2;
        a2.h.e(pVar, "<this>");
        R1.h context = cVar.getContext();
        if (context == i.f1255k) {
            cVar2 = new S1.b(cVar);
            if (cVar.getContext() != i.f1255k) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
            }
        } else {
            cVar2 = new S1.c(cVar, context);
        }
        r.a(2, pVar);
        return pVar.e(obj, cVar2);
    }

    public static void G(Parcel parcel, int i3, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iQ = Q(parcel, i3);
        parcel.writeBundle(bundle);
        R(parcel, iQ);
    }

    public static void H(Parcel parcel, int i3, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iQ = Q(parcel, i3);
        parcel.writeByteArray(bArr);
        R(parcel, iQ);
    }

    public static void J(Parcel parcel, int i3, Parcelable parcelable, int i4) {
        if (parcelable == null) {
            return;
        }
        int iQ = Q(parcel, i3);
        parcelable.writeToParcel(parcel, i4);
        R(parcel, iQ);
    }

    public static void K(Parcel parcel, int i3, String str) {
        if (str == null) {
            return;
        }
        int iQ = Q(parcel, i3);
        parcel.writeString(str);
        R(parcel, iQ);
    }

    public static void L(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int iQ = Q(parcel, i3);
        parcel.writeStringList(list);
        R(parcel, iQ);
    }

    public static void M(Parcel parcel, int i3, Parcelable[] parcelableArr, int i4) {
        if (parcelableArr == null) {
            return;
        }
        int iQ = Q(parcel, i3);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i4);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        R(parcel, iQ);
    }

    public static void N(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int iQ = Q(parcel, i3);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            Parcelable parcelable = (Parcelable) list.get(i4);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        R(parcel, iQ);
    }

    public static final Bundle O(String str, String str2, boolean z3, boolean z4) {
        a2.h.e(str, "serverClientId");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str2);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", z3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", z4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        return bundle;
    }

    public static void P(Parcel parcel, int i3, int i4) {
        parcel.writeInt(i3 | (i4 << 16));
    }

    public static int Q(Parcel parcel, int i3) {
        parcel.writeInt(i3 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void R(Parcel parcel, int i3) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i3 - 4);
        parcel.writeInt(iDataPosition - i3);
        parcel.setDataPosition(iDataPosition);
    }

    public static void c(float f3, String str) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException(str.concat(" must not be NaN"));
        }
        if (Float.isInfinite(f3)) {
            throw new IllegalArgumentException(str.concat(" must not be infinite"));
        }
    }

    public static int d(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new s.h(context).f4463a.areNotificationsEnabled() ? 0 : -1;
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] f(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            jArr[i3] = iArr[i3];
        }
        return jArr;
    }

    public static void g(Z.b bVar, Z.c cVar, int i3) throws IOException {
        byte[] bArr = new byte[8192];
        while (i3 > 0) {
            int iMin = Math.min(i3, 8192);
            int i4 = bVar.read(bArr, 0, iMin);
            if (i4 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i3 -= i4;
            cVar.write(bArr, 0, i4);
        }
    }

    public static void h(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i3);
            }
        }
    }

    public static final O1.c i(Throwable th) {
        a2.h.e(th, "exception");
        return new O1.c(th);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static H.c j(String str, Bundle bundle) throws j {
        a2.h.e(bundle, "data");
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            a2.h.b(obj);
                            return obj instanceof byte[] ? new H.j(new String((byte[]) obj, p024h2.a.f2904a), bundle, 0) : new H.j((String) obj, bundle, 0);
                        } catch (Exception unused) {
                            throw new L.a();
                        }
                    }
                    throw new L.a();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string == null) {
                            throw new j("The device does not contain a restore credential.");
                        }
                        H.j jVar = new H.j("androidx.credentials.TYPE_RESTORE_CREDENTIAL", bundle);
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                                return jVar;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new L.a();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            a2.h.b(string2);
                            a2.h.b(string3);
                            return new H.j(string3, bundle, 1);
                        } catch (Exception unused3) {
                            throw new L.a();
                        }
                    }
                    throw new L.a();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            a2.h.b(string4);
                            return new H.j(string4, bundle, 2);
                        } catch (Exception unused4) {
                            throw new L.a();
                        }
                    }
                    throw new L.a();
                default:
                    throw new L.a();
            }
        } catch (L.a unused5) {
            return new H.i(str, bundle);
        }
    }

    public static boolean k(Object obj, Object obj2) {
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
                        if (n(dArr[i3], dArr2[i3])) {
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
                        if (o(fArr[i4], fArr2[i4])) {
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
                        if (k(objArr[i5], objArr2[i5])) {
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
                        if (!k(it2.next(), it3.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        return n(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? o(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (k(key, entry2.getKey())) {
                                if (!k(entry.getValue(), entry2.getValue())) {
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

    public static int l(Object obj) {
        int iL = 0;
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
        int iL2 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (iL < length) {
                double d3 = dArr[iL];
                int i3 = iL2 * 31;
                if (d3 == 0.0d) {
                    d3 = 0.0d;
                }
                long jDoubleToLongBits = Double.doubleToLongBits(d3);
                iL2 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                iL++;
            }
            return iL2;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (iL < length2) {
                float f3 = fArr[iL];
                int i4 = iL2 * 31;
                if (f3 == 0.0f) {
                    f3 = 0.0f;
                }
                iL2 = i4 + Float.floatToIntBits(f3);
                iL++;
            }
            return iL2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (iL < length3) {
                iL2 = (iL2 * 31) + l(objArr[iL]);
                iL++;
            }
            return iL2;
        }
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iL2 = (iL2 * 31) + l(it2.next());
            }
            return iL2;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                iL += l(entry.getValue()) ^ (l(entry.getKey()) * 31);
            }
            return iL;
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

    public static boolean m(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        Field field = G.f187a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = F.f183d;
        F f3 = (F) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (f3 == null) {
            f3 = new F();
            f3.f184a = null;
            f3.f185b = null;
            f3.f186c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, f3);
        }
        WeakReference weakReference2 = f3.f186c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        f3.f186c = new WeakReference(keyEvent);
        if (f3.f185b == null) {
            f3.f185b = new SparseArray();
        }
        SparseArray sparseArray = f3.f185b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean n(double d3, double d4) {
        if ((d3 == 0.0d ? 0.0d : d3) == (d4 != 0.0d ? d4 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d3) && Double.isNaN(d4);
    }

    public static boolean o(float f3, float f4) {
        if ((f3 == 0.0f ? 0.0f : f3) == (f4 != 0.0f ? f4 : 0.0f)) {
            return true;
        }
        return Float.isNaN(f3) && Float.isNaN(f4);
    }

    public static Object p(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return E.e.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ResolveInfo q(Context context) {
        a2.h.e(context, "context");
        return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    public static String r(p009e.f fVar) {
        a2.h.e(fVar, "input");
        if (fVar instanceof p009e.d) {
            return "image/*";
        }
        if (fVar instanceof p009e.e) {
            return "video/*";
        }
        if (fVar instanceof p009e.c) {
            return null;
        }
        throw new D0.a();
    }

    public static R1.c s(R1.c cVar) {
        a2.h.e(cVar, "<this>");
        T1.c cVar2 = cVar instanceof T1.c ? (T1.c) cVar : null;
        if (cVar2 == null || (cVar = cVar2.f1278m) != null) {
            return cVar;
        }
        R1.e eVar = (R1.e) cVar2.getContext().e(R1.d.f1254k);
        R1.c fVar = eVar != null ? new n2.f((AbstractC0209q) eVar, cVar2) : cVar2;
        cVar2.f1278m = fVar;
        return fVar;
    }

    public static boolean u(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f462e == null) {
            f462e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f462e.booleanValue();
        if (f463f == null) {
            f463f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f463f.booleanValue()) {
            return !S0.a.w() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static p058u0.h v(String str) {
        String strGroup;
        if (str == null || p024h2.d.d0(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
            return null;
        }
        int i3 = Integer.parseInt(strGroup);
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            return null;
        }
        int i4 = Integer.parseInt(strGroup2);
        String strGroup3 = matcher.group(3);
        if (strGroup3 == null) {
            return null;
        }
        int i5 = Integer.parseInt(strGroup3);
        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : StringUtils.EMPTY;
        a2.h.d(strGroup4, "description");
        return new p058u0.h(i3, i4, i5, strGroup4);
    }

    public static void w(p062v1.d dVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i3 = 0; i3 < trackCount; i3++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i4 = dVar.f4631g;
                    int i5 = dVar.f4630f;
                    if (integer != 90 && integer != 270) {
                        i5 = i4;
                        i4 = i5;
                    }
                    dVar.f4626b = i4;
                    dVar.f4625a = i5;
                    dVar.f4627c = integer;
                    return;
                }
            }
        } catch (Exception e3) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void x(Activity activity, String[] strArr, int i3) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (TextUtils.isEmpty(strArr[i4])) {
                throw new IllegalArgumentException(B1.e.m(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < strArr.length; i6++) {
                if (!hashSet.contains(Integer.valueOf(i6))) {
                    strArr2[i5] = strArr[i6];
                    i5++;
                }
            }
        }
        if (activity instanceof s.a) {
            ((s.a) activity).getClass();
        }
        activity.requestPermissions(strArr, i3);
    }

    public static void y(Status status, Object obj, p019g1.e eVar) {
        if (status.b()) {
            eVar.b(obj);
        } else {
            eVar.a(M0.r.j(status));
        }
    }

    public static void z(C1.f fVar, final C0061j c0061j) {
        O o2;
        a2.h.e(fVar, "binaryMessenger");
        l uVar = (c0061j == null || (o2 = c0061j.f1123a) == null) ? new u(5) : o2.a();
        p057t1.a aVar = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", uVar, aVar);
        if (c0061j != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.B
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    switch (i3) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c0061j2.getClass();
                                clientCertRequest.cancel();
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
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c0061j3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c0061j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", uVar, aVar);
        if (c0061j != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.B
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    switch (i4) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c0061j2.getClass();
                                clientCertRequest.cancel();
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
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c0061j3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c0061j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", uVar, aVar);
        if (c0061j == null) {
            sVar3.y(null);
        } else {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: M1.B
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    switch (i5) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj2;
                            try {
                                c0061j2.getClass();
                                clientCertRequest.cancel();
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
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj3;
                            try {
                                c0061j3.getClass();
                                clientCertRequest2.ignore();
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
                        default:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj5;
                            Object obj6 = list.get(2);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj6;
                            try {
                                c0061j4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
                    }
                }
            });
        }
    }

    public abstract void I(byte[] bArr, int i3, int i4);

    public K0.c a(Context context, Looper looper, C0047c c0047c, Object obj, K0.j jVar, k kVar) {
        return b(context, looper, c0047c, obj, (L0.p) jVar, (L0.p) kVar);
    }

    public K0.c b(Context context, Looper looper, C0047c c0047c, Object obj, L0.p pVar, L0.p pVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public boolean t() {
        throw null;
    }
}
