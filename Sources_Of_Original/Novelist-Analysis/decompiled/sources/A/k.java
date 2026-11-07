package A;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p042o.i f29a = new p042o.i(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f30b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f31c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042o.j f32d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new o());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f30b = threadPoolExecutor;
        f31c = new Object();
        f32d = new p042o.j(0);
    }

    public static String a(int i3, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            sb.append(((g) list.get(i4)).f20g);
            sb.append("-");
            sb.append(i3);
            if (i4 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static j b(String str, Context context, List list, int i3) {
        int i4;
        Typeface typefaceJ;
        p042o.i iVar = f29a;
        Trace.beginSection(E2.a.V("getFontSync"));
        try {
            Typeface typeface = (Typeface) iVar.a(str);
            if (typeface != null) {
                j jVar = new j(typeface);
                Trace.endSection();
                return jVar;
            }
            try {
                l lVarA = f.a(context, list);
                List list2 = (List) lVarA.f34b;
                int i5 = lVarA.f33a;
                if (i5 == 0) {
                    m[] mVarArr = (m[]) list2.get(0);
                    if (mVarArr == null || mVarArr.length == 0) {
                        i4 = 1;
                    } else {
                        int length = mVarArr.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                i4 = 0;
                                break;
                            }
                            int i7 = mVarArr[i6].f40f;
                            if (i7 != 0) {
                                if (i7 >= 0) {
                                    i4 = i7;
                                    break;
                                }
                                i4 = -3;
                                break;
                            }
                            i6++;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        i4 = -3;
                        break;
                    }
                    i4 = -2;
                }
                if (i4 != 0) {
                    j jVar2 = new j(i4);
                    Trace.endSection();
                    return jVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    m[] mVarArr2 = (m[]) list2.get(0);
                    S0.a aVar = w.e.f4640a;
                    Trace.beginSection(E2.a.V("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceJ = w.e.f4640a.j(context, mVarArr2, i3);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    S0.a aVar2 = w.e.f4640a;
                    Trace.beginSection(E2.a.V("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceJ = w.e.f4640a.k(context, list2, i3);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceJ == null) {
                    j jVar3 = new j(-3);
                    Trace.endSection();
                    return jVar3;
                }
                iVar.b(str, typefaceJ);
                j jVar4 = new j(typefaceJ);
                Trace.endSection();
                return jVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                j jVar5 = new j(-1);
                Trace.endSection();
                return jVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
