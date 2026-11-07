package p029j0;

import M1.A;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p047q.g;
import p047q.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f3538a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f3539b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static A f3540c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static A b() {
        A a3 = new A(19);
        f3540c = a3;
        h hVar = f3538a;
        hVar.getClass();
        if (g.f4294p.c(hVar, null, a3)) {
            g.b(hVar);
        }
        return f3540c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    public static void c(Context context, boolean z3) {
        int i3;
        boolean z4;
        int i4;
        File file;
        boolean z5;
        File file2;
        long length;
        boolean z6;
        File file3;
        j jVarA;
        j jVar;
        int i5;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z3 || f3540c == null) {
            synchronized (f3539b) {
                if (z3) {
                    i3 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        long jA = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            jVarA = j.a(file3);
                        } else {
                            jVarA = null;
                        }
                        if (jVarA == null) {
                            if (!z4) {
                                i3 = 327680;
                            } else if (z5) {
                                i3 = 1;
                            } else if (z6) {
                                i3 = 2;
                            }
                        } else if (!z4) {
                            i3 = 327680;
                        } else if (z5) {
                            i3 = 1;
                        } else if (z6) {
                            i3 = 2;
                        }
                        if (z3) {
                            i3 = 2;
                        }
                        if (jVarA != null) {
                            i3 = 3;
                        }
                        jVar = new j(1, i3, jA, length);
                        if (jVarA != null) {
                            jVar.b(file3);
                        } else {
                            jVar.b(file3);
                        }
                        b();
                        return;
                    }
                    b();
                    return;
                }
                if (f3540c != null) {
                    return;
                }
                i3 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z4 = false;
                }
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28 && i4 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    try {
                        long jA2 = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                jVarA = j.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            jVarA = null;
                        }
                        if (jVarA == null && jVarA.f3536c == jA2 && (i5 = jVarA.f3535b) != 2) {
                            i3 = i5;
                        } else if (!z4) {
                            i3 = 327680;
                        } else if (z5) {
                            i3 = 1;
                        } else if (z6) {
                            i3 = 2;
                        }
                        if (z3 && z6 && i3 != 1) {
                            i3 = 2;
                        }
                        if (jVarA != null && jVarA.f3535b == 2 && i3 == 1 && length3 < jVarA.f3537d) {
                            i3 = 3;
                        }
                        jVar = new j(1, i3, jA2, length);
                        if (jVarA != null || !jVarA.equals(jVar)) {
                            try {
                                jVar.b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        b();
                        return;
                    }
                }
                b();
                return;
                throw th;
            }
        }
    }
}
