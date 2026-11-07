package p000a;

import B1.e;
import B1.s;
import C1.f;
import D.AbstractC0024z;
import D.InterfaceC0014o;
import D.K;
import D.M;
import D.N;
import D.P;
import D.Q;
import D.S;
import D.T;
import D.h0;
import I1.u;
import M1.C0055d;
import M1.C0057f;
import M1.C0061j;
import M1.O;
import Z1.l;
import Z1.p;
import a2.h;
import a2.o;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EdgeEffect;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p036l1.c;
import p053s0.b;
import p053s0.d;
import p053s0.j;
import p064x0.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Boolean f1680l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1681k;

    public /* synthetic */ a(int i3) {
        this.f1681k = i3;
    }

    public static File E(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i3 = 0; i3 < 100; i3++) {
            File file = new File(cacheDir, str + i3);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static int G(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 4) {
            return 2;
        }
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            return 4;
        }
        if (i3 == 32) {
            return 5;
        }
        if (i3 == 64) {
            return 6;
        }
        if (i3 == 128) {
            return 7;
        }
        if (i3 == 256) {
            return 8;
        }
        if (i3 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(e.g("type needs to be >= FIRST and <= LAST, type=", i3));
    }

    public static boolean H(String str) {
        b bVar = j.f4474a;
        Set<d> setUnmodifiableSet = Collections.unmodifiableSet(p053s0.c.f4467c);
        HashSet hashSet = new HashSet();
        for (d dVar : setUnmodifiableSet) {
            if (((p053s0.c) dVar).f4468a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            p053s0.c cVar = (p053s0.c) ((d) it2.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean I(byte b3) {
        return b3 > -65;
    }

    public static boolean J(int i3, p pVar, l lVar, CancellationSignal cancellationSignal) {
        if (i3 == -1) {
            return false;
        }
        o oVar = new o();
        oVar.f1713k = new I.e(e.h("activity with result code: ", i3, " indicating not RESULT_OK"));
        if (i3 == 0) {
            oVar.f1713k = new I.d("activity is cancelled by the user.");
        }
        pVar.e(cancellationSignal, new N.b(lVar, oVar, 0));
        return true;
    }

    public static MappedByteBuffer K(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static float N(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return G.c.c(edgeEffect, f3, f4);
        }
        edgeEffect.onPull(f3, f4);
        return f3;
    }

    public static void O(f fVar, final C0055d c0055d) {
        h.e(fVar, "binaryMessenger");
        O1.e eVar = C0057f.f1107b;
        p057t1.a aVar = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (C1.l) eVar.a(), aVar);
        if (c0055d != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    switch (i3) {
                        case 0:
                            C0055d c0055d2 = c0055d;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            Long l3 = (Long) obj2;
                            long jLongValue = l3.longValue();
                            try {
                                c0055d2.f();
                                Object objE = c0055d2.e(jLongValue);
                                if (objE instanceof k0) {
                                    ((k0) objE).destroy();
                                }
                                c0055d2.f1089d.remove(l3);
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
                        default:
                            C0055d c0055d3 = c0055d;
                            try {
                                c0055d3.f1087b.clear();
                                c0055d3.f1088c.clear();
                                c0055d3.f1089d.clear();
                                c0055d3.f1091f.clear();
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
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (C1.l) eVar.a(), aVar);
        if (c0055d == null) {
            sVar2.y(null);
        } else {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    switch (i4) {
                        case 0:
                            C0055d c0055d2 = c0055d;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            Long l3 = (Long) obj2;
                            long jLongValue = l3.longValue();
                            try {
                                c0055d2.f();
                                Object objE = c0055d2.e(jLongValue);
                                if (objE instanceof k0) {
                                    ((k0) objE).destroy();
                                }
                                c0055d2.f1089d.remove(l3);
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
                        default:
                            C0055d c0055d3 = c0055d;
                            try {
                                c0055d3.f1087b.clear();
                                c0055d3.f1088c.clear();
                                c0055d3.f1089d.clear();
                                c0055d3.f1091f.clear();
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
                    }
                }
            });
        }
    }

    public static void P(f fVar, final C0061j c0061j) {
        O o2;
        h.e(fVar, "binaryMessenger");
        C1.l uVar = (c0061j == null || (o2 = c0061j.f1123a) == null) ? new u(5) : o2.a();
        p057t1.a aVar = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", uVar, aVar);
        if (c0061j != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.D
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
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj2).longValue();
                            try {
                                O o3 = c0061j2.f1123a;
                                ((C0055d) o3.f1032c).a(jLongValue, (C0071u) o3.f1034e);
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
                            return;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0071u c0071u = (C0071u) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c0061j3.getClass();
                                try {
                                    String[] list2 = c0071u.f1163a.list(str);
                                    listD1 = E2.a.B(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3.getMessage());
                                }
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            return;
                        default:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0071u c0071u2 = (C0071u) obj5;
                            Object obj6 = list3.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0061j4.getClass();
                                listD2 = E2.a.B(((String) ((p063w1.c) c0071u2.f1164b.f443l).f4666e.f2846c) + File.separator + str2);
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
                            return;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", uVar, aVar);
        if (c0061j != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.D
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
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj2).longValue();
                            try {
                                O o3 = c0061j2.f1123a;
                                ((C0055d) o3.f1032c).a(jLongValue, (C0071u) o3.f1034e);
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
                            return;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0071u c0071u = (C0071u) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c0061j3.getClass();
                                try {
                                    String[] list2 = c0071u.f1163a.list(str);
                                    listD1 = E2.a.B(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3.getMessage());
                                }
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            return;
                        default:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0071u c0071u2 = (C0071u) obj5;
                            Object obj6 = list3.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0061j4.getClass();
                                listD2 = E2.a.B(((String) ((p063w1.c) c0071u2.f1164b.f443l).f4666e.f2846c) + File.separator + str2);
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
                            return;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", uVar, aVar);
        if (c0061j == null) {
            sVar3.y(null);
        } else {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: M1.D
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
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj2).longValue();
                            try {
                                O o3 = c0061j2.f1123a;
                                ((C0055d) o3.f1032c).a(jLongValue, (C0071u) o3.f1034e);
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
                            return;
                        case 1:
                            C0061j c0061j3 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0071u c0071u = (C0071u) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            try {
                                c0061j3.getClass();
                                try {
                                    String[] list2 = c0071u.f1163a.list(str);
                                    listD1 = E2.a.B(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3.getMessage());
                                }
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    listD1 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(listD1);
                            return;
                        default:
                            C0061j c0061j4 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj5 = list3.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0071u c0071u2 = (C0071u) obj5;
                            Object obj6 = list3.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0061j4.getClass();
                                listD2 = E2.a.B(((String) ((p063w1.c) c0071u2.f1164b.f443l).f4666e.f2846c) + File.separator + str2);
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
                            return;
                    }
                }
            });
        }
    }

    public static void Q(f fVar, final C0061j c0061j) {
        O o2;
        h.e(fVar, "binaryMessenger");
        C1.l uVar = (c0061j == null || (o2 = c0061j.f1123a) == null) ? new u(5) : o2.a();
        p057t1.a aVar = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", uVar, aVar);
        if (c0061j != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    int i4;
                    int i5 = i3;
                    final int i6 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i5) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                listD2 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0076z enumC0076z = (EnumC0076z) obj14;
                            try {
                                c0061j2.getClass();
                                int iOrdinal = enumC0076z.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
                                listD5 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            return;
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0061j2.getClass();
                                if (list7.isEmpty()) {
                                    N n = new N(12);
                                    Field field = D.G.f187a;
                                    AbstractC0024z.c(view7, n);
                                } else {
                                    Iterator it2 = list7.iterator();
                                    while (it2.hasNext()) {
                                        switch (((l0) it2.next()).ordinal()) {
                                            case 0:
                                                i4 = i6 | 519;
                                                break;
                                            case 1:
                                                i4 = i6 | 128;
                                                break;
                                            case 2:
                                                i4 = i6 | 4;
                                                break;
                                            case 3:
                                                i4 = i6 | 8;
                                                break;
                                            case 4:
                                                i4 = i6 | 32;
                                                break;
                                            case 5:
                                                i4 = i6 | 2;
                                                break;
                                            case 6:
                                                i4 = i6 | 1;
                                                break;
                                            case 7:
                                                i4 = i6 | 16;
                                                break;
                                            case 8:
                                                i4 = i6 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i6 = i4;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            D.T m3;
                                            int i7 = Build.VERSION.SDK_INT;
                                            if (i7 >= 36) {
                                                m3 = new D.S(h0Var);
                                            } else if (i7 >= 35) {
                                                m3 = new D.Q(h0Var);
                                            } else if (i7 >= 34) {
                                                m3 = new D.P(h0Var);
                                            } else if (i7 >= 31) {
                                                m3 = new D.O(h0Var);
                                            } else if (i7 >= 30) {
                                                m3 = new D.N(h0Var);
                                            } else {
                                                m3 = i7 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            }
                                            m3.d(i6, w.b.f4634e);
                                            return m3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", uVar, aVar);
        if (c0061j != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    int i5;
                    int i6 = i4;
                    final int i7 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i6) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                listD2 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0076z enumC0076z = (EnumC0076z) obj14;
                            try {
                                c0061j2.getClass();
                                int iOrdinal = enumC0076z.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
                                listD5 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            return;
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0061j2.getClass();
                                if (list7.isEmpty()) {
                                    N n = new N(12);
                                    Field field = D.G.f187a;
                                    AbstractC0024z.c(view7, n);
                                } else {
                                    Iterator it2 = list7.iterator();
                                    while (it2.hasNext()) {
                                        switch (((l0) it2.next()).ordinal()) {
                                            case 0:
                                                i5 = i7 | 519;
                                                break;
                                            case 1:
                                                i5 = i7 | 128;
                                                break;
                                            case 2:
                                                i5 = i7 | 4;
                                                break;
                                            case 3:
                                                i5 = i7 | 8;
                                                break;
                                            case 4:
                                                i5 = i7 | 32;
                                                break;
                                            case 5:
                                                i5 = i7 | 2;
                                                break;
                                            case 6:
                                                i5 = i7 | 1;
                                                break;
                                            case 7:
                                                i5 = i7 | 16;
                                                break;
                                            case 8:
                                                i5 = i7 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i7 = i5;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            D.T m3;
                                            int i8 = Build.VERSION.SDK_INT;
                                            if (i8 >= 36) {
                                                m3 = new D.S(h0Var);
                                            } else if (i8 >= 35) {
                                                m3 = new D.Q(h0Var);
                                            } else if (i8 >= 34) {
                                                m3 = new D.P(h0Var);
                                            } else if (i8 >= 31) {
                                                m3 = new D.O(h0Var);
                                            } else if (i8 >= 30) {
                                                m3 = new D.N(h0Var);
                                            } else {
                                                m3 = i8 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            }
                                            m3.d(i7, w.b.f4634e);
                                            return m3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", uVar, aVar);
        if (c0061j != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    int i6;
                    int i7 = i5;
                    final int i8 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i7) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                listD2 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0076z enumC0076z = (EnumC0076z) obj14;
                            try {
                                c0061j2.getClass();
                                int iOrdinal = enumC0076z.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
                                listD5 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            return;
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0061j2.getClass();
                                if (list7.isEmpty()) {
                                    N n = new N(12);
                                    Field field = D.G.f187a;
                                    AbstractC0024z.c(view7, n);
                                } else {
                                    Iterator it2 = list7.iterator();
                                    while (it2.hasNext()) {
                                        switch (((l0) it2.next()).ordinal()) {
                                            case 0:
                                                i6 = i8 | 519;
                                                break;
                                            case 1:
                                                i6 = i8 | 128;
                                                break;
                                            case 2:
                                                i6 = i8 | 4;
                                                break;
                                            case 3:
                                                i6 = i8 | 8;
                                                break;
                                            case 4:
                                                i6 = i8 | 32;
                                                break;
                                            case 5:
                                                i6 = i8 | 2;
                                                break;
                                            case 6:
                                                i6 = i8 | 1;
                                                break;
                                            case 7:
                                                i6 = i8 | 16;
                                                break;
                                            case 8:
                                                i6 = i8 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i8 = i6;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            D.T m3;
                                            int i9 = Build.VERSION.SDK_INT;
                                            if (i9 >= 36) {
                                                m3 = new D.S(h0Var);
                                            } else if (i9 >= 35) {
                                                m3 = new D.Q(h0Var);
                                            } else if (i9 >= 34) {
                                                m3 = new D.P(h0Var);
                                            } else if (i9 >= 31) {
                                                m3 = new D.O(h0Var);
                                            } else if (i9 >= 30) {
                                                m3 = new D.N(h0Var);
                                            } else {
                                                m3 = i9 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            }
                                            m3.d(i8, w.b.f4634e);
                                            return m3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", uVar, aVar);
        if (c0061j != null) {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    int i7;
                    int i8 = i6;
                    final int i9 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i8) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                listD2 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0076z enumC0076z = (EnumC0076z) obj14;
                            try {
                                c0061j2.getClass();
                                int iOrdinal = enumC0076z.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
                                listD5 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            return;
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0061j2.getClass();
                                if (list7.isEmpty()) {
                                    N n = new N(12);
                                    Field field = D.G.f187a;
                                    AbstractC0024z.c(view7, n);
                                } else {
                                    Iterator it2 = list7.iterator();
                                    while (it2.hasNext()) {
                                        switch (((l0) it2.next()).ordinal()) {
                                            case 0:
                                                i7 = i9 | 519;
                                                break;
                                            case 1:
                                                i7 = i9 | 128;
                                                break;
                                            case 2:
                                                i7 = i9 | 4;
                                                break;
                                            case 3:
                                                i7 = i9 | 8;
                                                break;
                                            case 4:
                                                i7 = i9 | 32;
                                                break;
                                            case 5:
                                                i7 = i9 | 2;
                                                break;
                                            case 6:
                                                i7 = i9 | 1;
                                                break;
                                            case 7:
                                                i7 = i9 | 16;
                                                break;
                                            case 8:
                                                i7 = i9 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i9 = i7;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            D.T m3;
                                            int i10 = Build.VERSION.SDK_INT;
                                            if (i10 >= 36) {
                                                m3 = new D.S(h0Var);
                                            } else if (i10 >= 35) {
                                                m3 = new D.Q(h0Var);
                                            } else if (i10 >= 34) {
                                                m3 = new D.P(h0Var);
                                            } else if (i10 >= 31) {
                                                m3 = new D.O(h0Var);
                                            } else if (i10 >= 30) {
                                                m3 = new D.N(h0Var);
                                            } else {
                                                m3 = i10 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            }
                                            m3.d(i9, w.b.f4634e);
                                            return m3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", uVar, aVar);
        if (c0061j != null) {
            final int i7 = 4;
            sVar5.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    int i8;
                    int i9 = i7;
                    final int i10 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i9) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                listD2 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0076z enumC0076z = (EnumC0076z) obj14;
                            try {
                                c0061j2.getClass();
                                int iOrdinal = enumC0076z.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
                                listD5 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            return;
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0061j2.getClass();
                                if (list7.isEmpty()) {
                                    N n = new N(12);
                                    Field field = D.G.f187a;
                                    AbstractC0024z.c(view7, n);
                                } else {
                                    Iterator it2 = list7.iterator();
                                    while (it2.hasNext()) {
                                        switch (((l0) it2.next()).ordinal()) {
                                            case 0:
                                                i8 = i10 | 519;
                                                break;
                                            case 1:
                                                i8 = i10 | 128;
                                                break;
                                            case 2:
                                                i8 = i10 | 4;
                                                break;
                                            case 3:
                                                i8 = i10 | 8;
                                                break;
                                            case 4:
                                                i8 = i10 | 32;
                                                break;
                                            case 5:
                                                i8 = i10 | 2;
                                                break;
                                            case 6:
                                                i8 = i10 | 1;
                                                break;
                                            case 7:
                                                i8 = i10 | 16;
                                                break;
                                            case 8:
                                                i8 = i10 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i10 = i8;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            D.T m3;
                                            int i11 = Build.VERSION.SDK_INT;
                                            if (i11 >= 36) {
                                                m3 = new D.S(h0Var);
                                            } else if (i11 >= 35) {
                                                m3 = new D.Q(h0Var);
                                            } else if (i11 >= 34) {
                                                m3 = new D.P(h0Var);
                                            } else if (i11 >= 31) {
                                                m3 = new D.O(h0Var);
                                            } else if (i11 >= 30) {
                                                m3 = new D.N(h0Var);
                                            } else {
                                                m3 = i11 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            }
                                            m3.d(i10, w.b.f4634e);
                                            return m3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar5.y(null);
        }
        s sVar6 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", uVar, aVar);
        if (c0061j != null) {
            final int i8 = 5;
            sVar6.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    int i9;
                    int i10 = i8;
                    final int i11 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i10) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                listD2 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0076z enumC0076z = (EnumC0076z) obj14;
                            try {
                                c0061j2.getClass();
                                int iOrdinal = enumC0076z.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
                                listD5 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            return;
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0061j2.getClass();
                                if (list7.isEmpty()) {
                                    N n = new N(12);
                                    Field field = D.G.f187a;
                                    AbstractC0024z.c(view7, n);
                                } else {
                                    Iterator it2 = list7.iterator();
                                    while (it2.hasNext()) {
                                        switch (((l0) it2.next()).ordinal()) {
                                            case 0:
                                                i9 = i11 | 519;
                                                break;
                                            case 1:
                                                i9 = i11 | 128;
                                                break;
                                            case 2:
                                                i9 = i11 | 4;
                                                break;
                                            case 3:
                                                i9 = i11 | 8;
                                                break;
                                            case 4:
                                                i9 = i11 | 32;
                                                break;
                                            case 5:
                                                i9 = i11 | 2;
                                                break;
                                            case 6:
                                                i9 = i11 | 1;
                                                break;
                                            case 7:
                                                i9 = i11 | 16;
                                                break;
                                            case 8:
                                                i9 = i11 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i11 = i9;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            D.T m3;
                                            int i12 = Build.VERSION.SDK_INT;
                                            if (i12 >= 36) {
                                                m3 = new D.S(h0Var);
                                            } else if (i12 >= 35) {
                                                m3 = new D.Q(h0Var);
                                            } else if (i12 >= 34) {
                                                m3 = new D.P(h0Var);
                                            } else if (i12 >= 31) {
                                                m3 = new D.O(h0Var);
                                            } else if (i12 >= 30) {
                                                m3 = new D.N(h0Var);
                                            } else {
                                                m3 = i12 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            }
                                            m3.d(i11, w.b.f4634e);
                                            return m3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar6.y(null);
        }
        s sVar7 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setInsetListenerToSetInsetsToZero", uVar, aVar);
        if (c0061j == null) {
            sVar7.y(null);
        } else {
            final int i9 = 6;
            sVar7.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    int i10;
                    int i11 = i9;
                    final int i12 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i11) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                listD2 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj13 = list5.get(0);
                            a2.h.c(obj13, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj13;
                            Object obj14 = list5.get(1);
                            a2.h.c(obj14, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0076z enumC0076z = (EnumC0076z) obj14;
                            try {
                                c0061j2.getClass();
                                int iOrdinal = enumC0076z.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
                                listD5 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    listD5 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    listD5 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(listD5);
                            return;
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj15 = list6.get(0);
                            a2.h.c(obj15, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj15;
                            Object obj16 = list6.get(1);
                            a2.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj16;
                            try {
                                c0061j2.getClass();
                                if (list7.isEmpty()) {
                                    N n = new N(12);
                                    Field field = D.G.f187a;
                                    AbstractC0024z.c(view7, n);
                                } else {
                                    Iterator it2 = list7.iterator();
                                    while (it2.hasNext()) {
                                        switch (((l0) it2.next()).ordinal()) {
                                            case 0:
                                                i10 = i12 | 519;
                                                break;
                                            case 1:
                                                i10 = i12 | 128;
                                                break;
                                            case 2:
                                                i10 = i12 | 4;
                                                break;
                                            case 3:
                                                i10 = i12 | 8;
                                                break;
                                            case 4:
                                                i10 = i12 | 32;
                                                break;
                                            case 5:
                                                i10 = i12 | 2;
                                                break;
                                            case 6:
                                                i10 = i12 | 1;
                                                break;
                                            case 7:
                                                i10 = i12 | 16;
                                                break;
                                            case 8:
                                                i10 = i12 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i12 = i10;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            D.T m3;
                                            int i13 = Build.VERSION.SDK_INT;
                                            if (i13 >= 36) {
                                                m3 = new D.S(h0Var);
                                            } else if (i13 >= 35) {
                                                m3 = new D.Q(h0Var);
                                            } else if (i13 >= 34) {
                                                m3 = new D.P(h0Var);
                                            } else if (i13 >= 31) {
                                                m3 = new D.O(h0Var);
                                            } else if (i13 >= 30) {
                                                m3 = new D.N(h0Var);
                                            } else {
                                                m3 = i13 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            }
                                            m3.d(i12, w.b.f4634e);
                                            return m3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        }
    }

    public static boolean R(View view, N1.c cVar) {
        if (view != null) {
            if (cVar.b(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    if (R(viewGroup.getChildAt(i3), cVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static Object S(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    jSONArray.put(S(it2.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                for (int i3 = 0; i3 < length; i3++) {
                    jSONArray2.put(S(Array.get(obj, i3)));
                }
                return jSONArray2;
            }
            if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jSONObject.put((String) entry.getKey(), S(entry.getValue()));
                }
                return jSONObject;
            }
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                return obj;
            }
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public static void T(int i3, int i4) {
        String strZ;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                strZ = E2.a.Z("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i4);
                    throw new IllegalArgumentException(sb.toString());
                }
                strZ = E2.a.Z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(strZ);
        }
    }

    public static void U(int i3, int i4, int i5) {
        String strV;
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            if (i3 < 0 || i3 > i5) {
                strV = V(i3, "start index", i5);
            } else {
                strV = (i4 < 0 || i4 > i5) ? V(i4, "end index", i5) : E2.a.Z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strV);
        }
    }

    public static String V(int i3, String str, int i4) {
        if (i3 < 0) {
            return E2.a.Z("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return E2.a.Z("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 15);
        sb.append("negative size: ");
        sb.append(i4);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final Exception i(J.a aVar, String str, Exception exc) {
        if (!(exc instanceof K.a)) {
            if (exc instanceof K.b) {
                return new K.b(aVar, str);
            }
            throw new L.a();
        }
        String strConcat = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(aVar.f537a);
        h.e(strConcat, "type");
        K.a aVar2 = new K.a(str, strConcat);
        if (strConcat.length() > 0) {
            return aVar2;
        }
        throw new IllegalArgumentException("type must not be empty");
    }

    public static final String j(Object[] objArr, int i3, int i4, P1.a aVar) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i3 + i5];
            if (obj == aVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        h.d(string, "toString(...)");
        return string;
    }

    public static void k(Context context, N1.b bVar) throws Exception {
        Rect rect;
        T m3;
        h0 h0VarB;
        Activity activityW = w(context);
        if (activityW != null) {
            p064x0.l.f4710a.getClass();
            int i3 = m.f4711b;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                rect = ((WindowManager) activityW.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
                h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = activityW.getSystemService("window");
                h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i4 < 30) {
                if (i4 >= 36) {
                    m3 = new S();
                } else if (i4 >= 35) {
                    m3 = new Q();
                } else if (i4 >= 34) {
                    m3 = new P();
                } else if (i4 >= 31) {
                    m3 = new D.O();
                } else if (i4 >= 30) {
                    m3 = new N();
                } else {
                    m3 = i4 >= 29 ? new M() : new K();
                }
                h0VarB = m3.b();
                h.d(h0VarB, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i4 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                h0VarB = B0.b.f78a.a(activityW);
            }
            int i5 = rect.left;
            int i6 = rect.top;
            int i7 = rect.right;
            int i8 = rect.bottom;
            if (i5 > i7) {
                throw new IllegalArgumentException(e.i("Left must be less than or equal to right, left: ", i5, ", right: ", i7).toString());
            }
            if (i6 > i8) {
                throw new IllegalArgumentException(e.i("top must be less than or equal to bottom, top: ", i6, ", bottom: ", i8).toString());
            }
            h.e(h0VarB, "_windowInsetsCompat");
            ((p054s1.c) bVar).f4480a.updateDisplayMetrics(0, new Rect(i5, i6, i7, i8).width(), new Rect(i5, i6, i7, i8).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static void l(CancellationSignal cancellationSignal, Z1.a aVar) {
        h.e(aVar, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (M.h.a(cancellationSignal)) {
            return;
        }
        aVar.a();
    }

    public static final void m(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                E2.a.b(th, th2);
            }
        }
    }

    public static final void n(l lVar, I1.d dVar) {
        lVar.f(new O1.d(H2.h.i(dVar)));
    }

    public static final void o(l lVar, Object obj) {
        h.e(lVar, "callback");
        lVar.f(new O1.d(obj));
    }

    public static boolean q(File file, Resources resources, int i3) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i3);
            try {
                boolean zR = r(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zR;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean r(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i3 = inputStream.read(bArr);
                        if (i3 != -1) {
                            fileOutputStream2.write(bArr, 0, i3);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean s(Object obj, Object obj2) {
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
                        if (u(dArr[i3], dArr2[i3])) {
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
                        if (v(fArr[i4], fArr2[i4])) {
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
                        if (s(objArr[i5], objArr2[i5])) {
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
                        if (!s(it2.next(), it3.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        return u(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? v(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (s(key, entry2.getKey())) {
                                if (!s(entry.getValue(), entry2.getValue())) {
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

    public static int t(Object obj) {
        int iT = 0;
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
        int iT2 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (iT < length) {
                double d3 = dArr[iT];
                int i3 = iT2 * 31;
                if (d3 == 0.0d) {
                    d3 = 0.0d;
                }
                long jDoubleToLongBits = Double.doubleToLongBits(d3);
                iT2 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                iT++;
            }
            return iT2;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (iT < length2) {
                float f3 = fArr[iT];
                int i4 = iT2 * 31;
                if (f3 == 0.0f) {
                    f3 = 0.0f;
                }
                iT2 = i4 + Float.floatToIntBits(f3);
                iT++;
            }
            return iT2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (iT < length3) {
                iT2 = (iT2 * 31) + t(objArr[iT]);
                iT++;
            }
            return iT2;
        }
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                iT2 = (iT2 * 31) + t(it2.next());
            }
            return iT2;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                iT += t(entry.getValue()) ^ (t(entry.getKey()) * 31);
            }
            return iT;
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

    public static boolean u(double d3, double d4) {
        if ((d3 == 0.0d ? 0.0d : d3) == (d4 != 0.0d ? d4 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d3) && Double.isNaN(d4);
    }

    public static boolean v(float f3, float f4) {
        if ((f3 == 0.0f ? 0.0f : f3) == (f4 != 0.0f ? f4 : 0.0f)) {
            return true;
        }
        return Float.isNaN(f3) && Float.isNaN(f4);
    }

    public static Activity w(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return w(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static int y(Context context, int i3, int i4) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i3, typedValue, true);
        return typedValue.resourceId != 0 ? i3 : i4;
    }

    public static float z(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return G.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public abstract String A();

    public boolean B() {
        return Boolean.TRUE.equals(x("noResult"));
    }

    public abstract c C();

    public p033k1.m D() {
        return new p033k1.m((String) x("sql"), (List) x("arguments"));
    }

    public abstract boolean F();

    public abstract View L(int i3);

    public abstract boolean M();

    @Override // p036l1.c
    public void a(Object obj, String str) {
        C().a(obj, str);
    }

    @Override // p036l1.c
    public void p(Object obj) {
        C().p(obj);
    }

    public String toString() {
        switch (this.f1681k) {
            case 21:
                return A() + StringUtils.SPACE + ((String) x("sql")) + StringUtils.SPACE + ((List) x("arguments"));
            default:
                return super.toString();
        }
    }

    public abstract Object x(String str);
}
