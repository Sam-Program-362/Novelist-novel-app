package w1;

import M1.RunnableC0053b;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.apache.tika.utils.StringUtils;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0490a implements Callable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f4658k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f4659l;

    public CallableC0490a(c cVar, Context context) {
        this.f4659l = cVar;
        this.f4658k = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c cVar = this.f4659l;
        Context context = this.f4658k;
        N1.a.b("FlutterLoader initTask");
        int i3 = 0;
        try {
            try {
                FlutterJNI flutterJNI = cVar.f4667f;
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                cVar.f4668g.execute(new RunnableC0053b(this, 13));
                File filesDir = context.getFilesDir();
                if (filesDir == null) {
                    filesDir = new File(context.getDataDir().getPath(), "files");
                }
                String path = filesDir.getPath();
                File codeCacheDir = context.getCodeCacheDir();
                if (codeCacheDir == null) {
                    codeCacheDir = context.getCacheDir();
                }
                if (codeCacheDir == null) {
                    codeCacheDir = new File(context.getDataDir().getPath(), "cache");
                }
                String path2 = codeCacheDir.getPath();
                File dir = context.getDir("flutter", 0);
                if (dir == null) {
                    dir = new File(context.getDataDir().getPath(), "app_flutter");
                }
                dir.getPath();
                b bVar = new b(path, path2);
                Trace.endSection();
                return bVar;
            } catch (UnsatisfiedLinkError e3) {
                if (!e3.toString().contains("couldn't find \"libflutter.so\"") && !e3.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e3;
                }
                String property = System.getProperty("os.arch");
                File file = new File((String) cVar.f4666e.f2848e);
                String[] list = file.list();
                ArrayList arrayList = new ArrayList();
                String[] strArr = Build.SUPPORTED_ABIS;
                int length = strArr.length;
                int i4 = 0;
                while (i4 < length) {
                    String str = strArr[i4];
                    StringBuilder sb = new StringBuilder();
                    sb.append("!");
                    String str2 = File.separator;
                    sb.append(str2);
                    sb.append("lib");
                    sb.append(str2);
                    sb.append(str);
                    String sb2 = sb.toString();
                    String[] strArr2 = context.getApplicationInfo().splitSourceDirs;
                    ArrayList arrayList2 = new ArrayList();
                    if (strArr2 != null) {
                        int length2 = strArr2.length;
                        for (int i5 = i3; i5 < length2; i5++) {
                            arrayList2.add(strArr2[i5] + sb2);
                        }
                        arrayList.addAll(arrayList2);
                    }
                    String str3 = context.getApplicationInfo().sourceDir;
                    if (str3 != null && !str3.isEmpty()) {
                        arrayList.add(str3 + sb2);
                    }
                    i4++;
                    i3 = 0;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                sb3.append(property);
                sb3.append(", and the native libraries directory (with path ");
                sb3.append(file.getAbsolutePath());
                sb3.append(") ");
                sb3.append(file.exists() ? "contains the following files: " + Arrays.toString(list) : "does not exist");
                sb3.append(arrayList.isEmpty() ? StringUtils.EMPTY : ", and the split and source libraries directory (with path(s) " + arrayList + ")");
                sb3.append(".");
                throw new UnsupportedOperationException(sb3.toString(), e3);
            }
        } finally {
        }
    }
}
