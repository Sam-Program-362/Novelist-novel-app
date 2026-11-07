package a;

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
import D.h0;
import I1.u;
import M1.C0055d;
import M1.C0057f;
import M1.C0061j;
import M1.O;
import N.b;
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
import android.view.WindowMetrics;
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
import k1.C0376m;
import l1.InterfaceC0419c;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import s0.C0464b;
import s0.c;
import s0.d;
import s0.j;
import s1.C0467c;
import t1.C0473a;
import x0.m;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0102a implements InterfaceC0419c {

    /* renamed from: l, reason: collision with root package name */
    public static Boolean f1680l;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1681k;

    public /* synthetic */ AbstractC0102a(int i3) {
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
            if (file.createNewFile()) {
                return file;
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
        C0464b c0464b = j.f4474a;
        Set<d> unmodifiableSet = Collections.unmodifiableSet(c.f4467c);
        HashSet hashSet = new HashSet();
        for (d dVar : unmodifiableSet) {
            if (((c) dVar).f4468a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            c cVar = (c) ((d) it2.next());
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
        pVar.e(cancellationSignal, new b(lVar, oVar, 0));
        return true;
    }

    public static MappedByteBuffer K(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
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
        C0473a c0473a = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (C1.l) eVar.a(), c0473a);
        if (c0055d != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    switch (i3) {
                        case 0:
                            C0055d c0055d2 = c0055d;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            Long l3 = (Long) obj2;
                            long longValue = l3.longValue();
                            try {
                                c0055d2.f();
                                Object e3 = c0055d2.e(longValue);
                                if (e3 instanceof k0) {
                                    ((k0) e3).destroy();
                                }
                                c0055d2.f1089d.remove(l3);
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
                        default:
                            C0055d c0055d3 = c0055d;
                            try {
                                c0055d3.f1087b.clear();
                                c0055d3.f1088c.clear();
                                c0055d3.f1089d.clear();
                                c0055d3.f1091f.clear();
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
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (C1.l) eVar.a(), c0473a);
        if (c0055d == null) {
            sVar2.y(null);
        } else {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.e
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    switch (i4) {
                        case 0:
                            C0055d c0055d2 = c0055d;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            Long l3 = (Long) obj2;
                            long longValue = l3.longValue();
                            try {
                                c0055d2.f();
                                Object e3 = c0055d2.e(longValue);
                                if (e3 instanceof k0) {
                                    ((k0) e3).destroy();
                                }
                                c0055d2.f1089d.remove(l3);
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
                        default:
                            C0055d c0055d3 = c0055d;
                            try {
                                c0055d3.f1087b.clear();
                                c0055d3.f1088c.clear();
                                c0055d3.f1089d.clear();
                                c0055d3.f1091f.clear();
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
                    }
                }
            });
        }
    }

    public static void P(f fVar, final C0061j c0061j) {
        O o2;
        h.e(fVar, "binaryMessenger");
        C1.l uVar = (c0061j == null || (o2 = c0061j.f1123a) == null) ? new u(5) : o2.a();
        C0473a c0473a = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", uVar, c0473a);
        if (c0061j != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.D
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    switch (i3) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj2).longValue();
                            try {
                                O o3 = c0061j2.f1123a;
                                ((C0055d) o3.f1032c).a(longValue, (C0071u) o3.f1034e);
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
                                    d03 = E2.a.B(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3.getMessage());
                                }
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(((String) ((w1.c) c0071u2.f1164b.f443l).f4666e.f2846c) + File.separator + str2);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", uVar, c0473a);
        if (c0061j != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.D
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    switch (i4) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj2).longValue();
                            try {
                                O o3 = c0061j2.f1123a;
                                ((C0055d) o3.f1032c).a(longValue, (C0071u) o3.f1034e);
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
                                    d03 = E2.a.B(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3.getMessage());
                                }
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(((String) ((w1.c) c0071u2.f1164b.f443l).f4666e.f2846c) + File.separator + str2);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", uVar, c0473a);
        if (c0061j == null) {
            sVar3.y(null);
        } else {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: M1.D
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    switch (i5) {
                        case 0:
                            C0061j c0061j2 = c0061j;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj2).longValue();
                            try {
                                O o3 = c0061j2.f1123a;
                                ((C0055d) o3.f1032c).a(longValue, (C0071u) o3.f1034e);
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
                                    d03 = E2.a.B(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3.getMessage());
                                }
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
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
                                d04 = E2.a.B(((String) ((w1.c) c0071u2.f1164b.f443l).f4666e.f2846c) + File.separator + str2);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
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
        C0473a c0473a = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", uVar, c0473a);
        if (c0061j != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    List d08;
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
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                d04 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                                int ordinal = enumC0076z.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
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
                                            int i7 = Build.VERSION.SDK_INT;
                                            D.T s3 = i7 >= 36 ? new D.S(h0Var) : i7 >= 35 ? new D.Q(h0Var) : i7 >= 34 ? new D.P(h0Var) : i7 >= 31 ? new D.O(h0Var) : i7 >= 30 ? new D.N(h0Var) : i7 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            s3.d(i6, w.b.f4634e);
                                            return s3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", uVar, c0473a);
        if (c0061j != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    List d08;
                    int i42;
                    int i5 = i4;
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
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                d04 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                                int ordinal = enumC0076z.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
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
                                                i42 = i6 | 519;
                                                break;
                                            case 1:
                                                i42 = i6 | 128;
                                                break;
                                            case 2:
                                                i42 = i6 | 4;
                                                break;
                                            case 3:
                                                i42 = i6 | 8;
                                                break;
                                            case 4:
                                                i42 = i6 | 32;
                                                break;
                                            case 5:
                                                i42 = i6 | 2;
                                                break;
                                            case 6:
                                                i42 = i6 | 1;
                                                break;
                                            case 7:
                                                i42 = i6 | 16;
                                                break;
                                            case 8:
                                                i42 = i6 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i6 = i42;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            int i7 = Build.VERSION.SDK_INT;
                                            D.T s3 = i7 >= 36 ? new D.S(h0Var) : i7 >= 35 ? new D.Q(h0Var) : i7 >= 34 ? new D.P(h0Var) : i7 >= 31 ? new D.O(h0Var) : i7 >= 30 ? new D.N(h0Var) : i7 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            s3.d(i6, w.b.f4634e);
                                            return s3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", uVar, c0473a);
        if (c0061j != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    List d08;
                    int i42;
                    int i52 = i5;
                    final int i6 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i52) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                d04 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                                int ordinal = enumC0076z.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
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
                                                i42 = i6 | 519;
                                                break;
                                            case 1:
                                                i42 = i6 | 128;
                                                break;
                                            case 2:
                                                i42 = i6 | 4;
                                                break;
                                            case 3:
                                                i42 = i6 | 8;
                                                break;
                                            case 4:
                                                i42 = i6 | 32;
                                                break;
                                            case 5:
                                                i42 = i6 | 2;
                                                break;
                                            case 6:
                                                i42 = i6 | 1;
                                                break;
                                            case 7:
                                                i42 = i6 | 16;
                                                break;
                                            case 8:
                                                i42 = i6 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i6 = i42;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            int i7 = Build.VERSION.SDK_INT;
                                            D.T s3 = i7 >= 36 ? new D.S(h0Var) : i7 >= 35 ? new D.Q(h0Var) : i7 >= 34 ? new D.P(h0Var) : i7 >= 31 ? new D.O(h0Var) : i7 >= 30 ? new D.N(h0Var) : i7 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            s3.d(i6, w.b.f4634e);
                                            return s3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", uVar, c0473a);
        if (c0061j != null) {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    List d08;
                    int i42;
                    int i52 = i6;
                    final int i62 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i52) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                d04 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                                int ordinal = enumC0076z.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
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
                                                i42 = i62 | 519;
                                                break;
                                            case 1:
                                                i42 = i62 | 128;
                                                break;
                                            case 2:
                                                i42 = i62 | 4;
                                                break;
                                            case 3:
                                                i42 = i62 | 8;
                                                break;
                                            case 4:
                                                i42 = i62 | 32;
                                                break;
                                            case 5:
                                                i42 = i62 | 2;
                                                break;
                                            case 6:
                                                i42 = i62 | 1;
                                                break;
                                            case 7:
                                                i42 = i62 | 16;
                                                break;
                                            case 8:
                                                i42 = i62 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i62 = i42;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            int i7 = Build.VERSION.SDK_INT;
                                            D.T s3 = i7 >= 36 ? new D.S(h0Var) : i7 >= 35 ? new D.Q(h0Var) : i7 >= 34 ? new D.P(h0Var) : i7 >= 31 ? new D.O(h0Var) : i7 >= 30 ? new D.N(h0Var) : i7 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            s3.d(i62, w.b.f4634e);
                                            return s3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", uVar, c0473a);
        if (c0061j != null) {
            final int i7 = 4;
            sVar5.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    List d08;
                    int i42;
                    int i52 = i7;
                    final int i62 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i52) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                d04 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                                int ordinal = enumC0076z.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
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
                                                i42 = i62 | 519;
                                                break;
                                            case 1:
                                                i42 = i62 | 128;
                                                break;
                                            case 2:
                                                i42 = i62 | 4;
                                                break;
                                            case 3:
                                                i42 = i62 | 8;
                                                break;
                                            case 4:
                                                i42 = i62 | 32;
                                                break;
                                            case 5:
                                                i42 = i62 | 2;
                                                break;
                                            case 6:
                                                i42 = i62 | 1;
                                                break;
                                            case 7:
                                                i42 = i62 | 16;
                                                break;
                                            case 8:
                                                i42 = i62 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i62 = i42;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            int i72 = Build.VERSION.SDK_INT;
                                            D.T s3 = i72 >= 36 ? new D.S(h0Var) : i72 >= 35 ? new D.Q(h0Var) : i72 >= 34 ? new D.P(h0Var) : i72 >= 31 ? new D.O(h0Var) : i72 >= 30 ? new D.N(h0Var) : i72 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            s3.d(i62, w.b.f4634e);
                                            return s3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar5.y(null);
        }
        s sVar6 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", uVar, c0473a);
        if (c0061j != null) {
            final int i8 = 5;
            sVar6.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    List d08;
                    int i42;
                    int i52 = i8;
                    final int i62 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i52) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                d04 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                                int ordinal = enumC0076z.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
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
                                                i42 = i62 | 519;
                                                break;
                                            case 1:
                                                i42 = i62 | 128;
                                                break;
                                            case 2:
                                                i42 = i62 | 4;
                                                break;
                                            case 3:
                                                i42 = i62 | 8;
                                                break;
                                            case 4:
                                                i42 = i62 | 32;
                                                break;
                                            case 5:
                                                i42 = i62 | 2;
                                                break;
                                            case 6:
                                                i42 = i62 | 1;
                                                break;
                                            case 7:
                                                i42 = i62 | 16;
                                                break;
                                            case 8:
                                                i42 = i62 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i62 = i42;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            int i72 = Build.VERSION.SDK_INT;
                                            D.T s3 = i72 >= 36 ? new D.S(h0Var) : i72 >= 35 ? new D.Q(h0Var) : i72 >= 34 ? new D.P(h0Var) : i72 >= 31 ? new D.O(h0Var) : i72 >= 30 ? new D.N(h0Var) : i72 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            s3.d(i62, w.b.f4634e);
                                            return s3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
                            return;
                    }
                }
            });
        } else {
            sVar6.y(null);
        }
        s sVar7 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setInsetListenerToSetInsetsToZero", uVar, c0473a);
        if (c0061j == null) {
            sVar7.y(null);
        } else {
            final int i9 = 6;
            sVar7.y(new C1.b() { // from class: M1.H
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    List d08;
                    int i42;
                    int i52 = i9;
                    final int i62 = 0;
                    C0061j c0061j2 = c0061j;
                    switch (i52) {
                        case 0:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj2;
                            Object obj3 = list.get(1);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            Object obj4 = list.get(2);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long longValue2 = ((Long) obj4).longValue();
                            try {
                                c0061j2.getClass();
                                view.scrollTo((int) longValue, (int) longValue2);
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
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Long");
                            long longValue3 = ((Long) obj6).longValue();
                            Object obj7 = list2.get(2);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long longValue4 = ((Long) obj7).longValue();
                            try {
                                c0061j2.getClass();
                                view2.scrollBy((int) longValue3, (int) longValue4);
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
                            return;
                        case 2:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj8 = ((List) obj).get(0);
                            a2.h.c(obj8, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj8;
                            try {
                                c0061j2.getClass();
                                d04 = E2.a.B(new i0(view3.getScrollX(), view3.getScrollY()));
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj9 = list3.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj9;
                            Object obj10 = list3.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0061j2.getClass();
                                view4.setVerticalScrollBarEnabled(booleanValue);
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
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj11 = list4.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj11;
                            Object obj12 = list4.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                            try {
                                c0061j2.getClass();
                                view5.setHorizontalScrollBarEnabled(booleanValue2);
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
                                int ordinal = enumC0076z.ordinal();
                                if (ordinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (ordinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (ordinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (ordinal == 3) {
                                    O o3 = c0061j2.f1123a;
                                    EnumC0076z enumC0076z2 = EnumC0076z.f1174m;
                                    o3.getClass();
                                    throw new IllegalArgumentException(enumC0076z2 + " doesn't represent a native value.");
                                }
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
                                                i42 = i62 | 519;
                                                break;
                                            case 1:
                                                i42 = i62 | 128;
                                                break;
                                            case 2:
                                                i42 = i62 | 4;
                                                break;
                                            case 3:
                                                i42 = i62 | 8;
                                                break;
                                            case 4:
                                                i42 = i62 | 32;
                                                break;
                                            case 5:
                                                i42 = i62 | 2;
                                                break;
                                            case 6:
                                                i42 = i62 | 1;
                                                break;
                                            case 7:
                                                i42 = i62 | 16;
                                                break;
                                            case 8:
                                                i42 = i62 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i62 = i42;
                                    }
                                    InterfaceC0014o interfaceC0014o = new InterfaceC0014o() { // from class: M1.T
                                        @Override // D.InterfaceC0014o
                                        public final D.h0 c(D.h0 h0Var) {
                                            int i72 = Build.VERSION.SDK_INT;
                                            D.T s3 = i72 >= 36 ? new D.S(h0Var) : i72 >= 35 ? new D.Q(h0Var) : i72 >= 34 ? new D.P(h0Var) : i72 >= 31 ? new D.O(h0Var) : i72 >= 30 ? new D.N(h0Var) : i72 >= 29 ? new D.M(h0Var) : new D.K(h0Var);
                                            s3.d(i62, w.b.f4634e);
                                            return s3.b();
                                        }
                                    };
                                    Field field2 = D.G.f187a;
                                    AbstractC0024z.c(view7, interfaceC0014o);
                                }
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
        if (obj instanceof JSONArray) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
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
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public static void T(int i3, int i4) {
        String Z2;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                Z2 = E2.a.Z("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i4);
                    throw new IllegalArgumentException(sb.toString());
                }
                Z2 = E2.a.Z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(Z2);
        }
    }

    public static void U(int i3, int i4, int i5) {
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            throw new IndexOutOfBoundsException((i3 < 0 || i3 > i5) ? V(i3, "start index", i5) : (i4 < 0 || i4 > i5) ? V(i4, "end index", i5) : E2.a.Z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3)));
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
        String concat = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(aVar.f537a);
        h.e(concat, "type");
        K.a aVar2 = new K.a(str, concat);
        if (concat.length() > 0) {
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
        String sb2 = sb.toString();
        h.d(sb2, "toString(...)");
        return sb2;
    }

    public static void k(Context context, N1.b bVar) {
        Rect rect;
        h0 b3;
        WindowMetrics maximumWindowMetrics;
        Activity w3 = w(context);
        if (w3 != null) {
            x0.l.f4710a.getClass();
            int i3 = m.f4711b;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                maximumWindowMetrics = ((WindowManager) w3.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = w3.getSystemService("window");
                h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i4 < 30) {
                b3 = (i4 >= 36 ? new S() : i4 >= 35 ? new Q() : i4 >= 34 ? new P() : i4 >= 31 ? new D.O() : i4 >= 30 ? new N() : i4 >= 29 ? new M() : new K()).b();
                h.d(b3, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i4 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b3 = B0.b.f78a.a(w3);
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
            h.e(b3, "_windowInsetsCompat");
            ((C0467c) bVar).f4480a.updateDisplayMetrics(0, new Rect(i5, i6, i7, i8).width(), new Rect(i5, i6, i7, i8).height(), context.getResources().getDisplayMetrics().density);
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

    public static final void m(Closeable closeable, Throwable th) {
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

    public static boolean q(File file, Resources resources, int i3) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i3);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean r3 = r(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return r3;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean r(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0143, code lost:
    
        if (s(r1.getValue(), r4.getValue()) == false) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0102a.s(java.lang.Object, java.lang.Object):boolean");
    }

    public static int t(Object obj) {
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
                i4 = (i4 * 31) + t(objArr[i3]);
                i3++;
            }
            return i4;
        }
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i4 = (i4 * 31) + t(it2.next());
            }
            return i4;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i3 += t(entry.getValue()) ^ (t(entry.getKey()) * 31);
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

    public abstract InterfaceC0419c C();

    public C0376m D() {
        return new C0376m((String) x("sql"), (List) x("arguments"));
    }

    public abstract boolean F();

    public abstract View L(int i3);

    public abstract boolean M();

    @Override // l1.InterfaceC0419c
    public void a(Object obj, String str) {
        C().a(obj, str);
    }

    @Override // l1.InterfaceC0419c
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
