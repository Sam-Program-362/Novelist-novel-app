package p063w1;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.s;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p019g1.i;
import p054s1.d;
import p054s1.e;
import p057t1.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f4664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f4666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FlutterJNI f4667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ExecutorService f4668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Future f4669h;

    public static String b(Context context, String str) throws IOException {
        File file = new File(str);
        try {
            String canonicalPath = file.getCanonicalPath();
            boolean zStartsWith = canonicalPath.startsWith(context.getApplicationContext().getFilesDir().getCanonicalPath() + File.separator);
            boolean zEndsWith = canonicalPath.endsWith(".so");
            if (zStartsWith && zEndsWith) {
                return canonicalPath;
            }
            Log.e("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e("FlutterLoader", "External path " + file.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public static void c(Context context, String str, ArrayList arrayList) {
        String strB;
        try {
            strB = b(context, str);
        } catch (IOException e3) {
            Log.e("FlutterLoader", "Error while validating AOT shared library name flag: " + str, e3);
            strB = null;
        }
        if (strB != null) {
            arrayList.add(0, e.f4504a.f4501a + strB);
            return;
        }
        Log.e("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
    }

    public final void a(Context context, String[] strArr) {
        boolean z3;
        boolean z4;
        Iterator it2;
        if (this.f4663b) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f4664c == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            N1.a.b("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = (b) this.f4669h.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + ((String) this.f4666e.f2848e) + File.separator + "libflutter.so");
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    z3 = false;
                    z4 = false;
                    for (Iterator it3 = e.f4514k.iterator(); it3.hasNext(); it3 = it2) {
                        d dVar = (d) it3.next();
                        String str = dVar.f4502b;
                        if (!bundle.containsKey(str)) {
                            it2 = it3;
                        } else if (dVar == e.f4512i) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified in the manifest was loaded by the FlutterLoader.");
                            it2 = it3;
                        } else {
                            if (e.f4515l.contains(dVar)) {
                                throw new IllegalArgumentException(str + " is disabled and no longer allowed. Please remove this flag from your application manifest.");
                            }
                            E1.a aVar = e.f4516m;
                            if (((d) aVar.get(dVar)) != null) {
                                StringBuilder sb = new StringBuilder();
                                it2 = it3;
                                sb.append("If you are trying to specify ");
                                sb.append(str);
                                sb.append(" in your application manifest, please make sure to use the new metadata key name: ");
                                sb.append(((d) aVar.get(dVar)).f4502b);
                                Log.w("FlutterLoader", sb.toString());
                            } else {
                                it2 = it3;
                                if (!dVar.f4503c) {
                                    Log.e("FlutterLoader", "Flag with metadata key " + str + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                                }
                            }
                            if (dVar == e.f4508e) {
                                z3 = true;
                            } else if (dVar == e.f4513j) {
                                z4 = true;
                            } else {
                                d dVar2 = e.f4511h;
                                if (dVar == dVar2) {
                                    this.f4662a = bundle.getBoolean(dVar2.f4502b, false);
                                } else if (dVar == e.f4504a || dVar == e.f4505b) {
                                    String string = bundle.getString(str);
                                    if (string == null) {
                                        Log.e("FlutterLoader", "Flag " + str + " was specified with an empty path. Please specify a path to the desired AOT shared library.");
                                    } else {
                                        c(context, string, arrayList);
                                    }
                                }
                            }
                            String str2 = dVar.f4501a;
                            if (str2.endsWith("=")) {
                                Object obj = bundle.get(str);
                                String string2 = obj != null ? obj.toString() : null;
                                if (string2 == null) {
                                    Log.e("FlutterLoader", "Flag with metadata key " + str + " requires a value, but no value was found. Please specify a value.");
                                } else {
                                    arrayList.add(str2 + string2);
                                }
                            } else if (bundle.getBoolean(str, false)) {
                                arrayList.add(str2);
                            }
                        }
                    }
                } else {
                    z3 = false;
                    z4 = false;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        d dVarA = e.a(str3);
                        if (dVarA == null) {
                            arrayList.add(str3);
                        } else if (dVarA.equals(e.f4512i)) {
                            Log.w("FlutterLoader", "For testing purposes only: test flag specified on the command line was loaded by the FlutterLoader.");
                        } else {
                            d dVar3 = e.f4504a;
                            if (dVarA.equals(dVar3) || dVarA.equals(e.f4505b)) {
                                c(context, str3.substring(dVar3.f4501a.length()), arrayList);
                            } else if (dVarA.f4503c) {
                                arrayList.add(str3);
                            } else {
                                Log.e("FlutterLoader", "Command line argument " + str3 + " is not allowed in release builds and will be ignored if specified in the application manifest or via the command line.");
                            }
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                d dVar4 = e.f4504a;
                sb2.append(dVar4.f4501a);
                sb2.append((String) this.f4666e.f2845b);
                arrayList.add(sb2.toString());
                arrayList.add(dVar4.f4501a + ((String) this.f4666e.f2848e) + File.separator + ((String) this.f4666e.f2845b));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("--cache-dir-path=");
                sb3.append(bVar.f4661b);
                arrayList.add(sb3.toString());
                Object obj2 = this.f4666e.f2847d;
                arrayList.add("--domain-network-policy=" + ((String) this.f4666e.f2847d));
                this.f4664c.getClass();
                if (!z3) {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    arrayList.add(e.f4508e.f4501a + String.valueOf((int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d)));
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (!z4) {
                    arrayList.add(e.f4513j.f4501a + "true");
                }
                this.f4667f.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f4660a, bVar.f4661b, SystemClock.uptimeMillis() - this.f4665d, Build.VERSION.SDK_INT);
                this.f4663b = true;
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e3);
            throw new RuntimeException(e3);
        }
    }

    public final void d(Context context) {
        a aVar = new a();
        if (this.f4664c != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        N1.a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f4664c = aVar;
            this.f4665d = SystemClock.uptimeMillis();
            this.f4666e = E2.a.C(applicationContext);
            s sVarA = s.a((DisplayManager) applicationContext.getSystemService("display"), this.f4667f);
            sVarA.f3382b.setAsyncWaitForVsyncDelegate(sVarA.f3384d);
            this.f4669h = this.f4668g.submit(new a(this, applicationContext));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
