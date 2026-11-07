package M1;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1034e;

    public O(Context context, p044o1.b bVar) {
        a2.h.e(context, "context");
        a2.h.e(bVar, "manager");
        this.f1030a = context;
        this.f1031b = null;
        this.f1032c = bVar;
        this.f1033d = new O1.e(new p002b.q(this, 1));
        this.f1034e = new O1.e(new I1.l(7));
    }

    public static String b(String str) {
        if (str == null || !p024h2.d.Y(str, "/")) {
            return "*";
        }
        String strSubstring = str.substring(0, p024h2.d.c0(str, "/", 0, 6));
        a2.h.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static void d(Throwable th) {
        Log.e("WebChromeClientImpl", th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public C1.l a() {
        if (((C0059h) this.f1033d) == null) {
            this.f1033d = new C0059h(this);
        }
        C0059h c0059h = (C0059h) this.f1033d;
        a2.h.b(c0059h);
        return c0059h;
    }

    public File c() {
        Context context = (Activity) this.f1031b;
        if (context == null) {
            context = this.f1030a;
        }
        return new File(context.getCacheDir(), "share_plus");
    }

    public void e(Runnable runnable) {
        Context context = this.f1030a;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x016a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.util.Map r19) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.O.f(java.util.Map):void");
    }

    public O(C1.f fVar, Context context, C0071u c0071u) {
        a2.h.e(fVar, "binaryMessenger");
        this.f1031b = fVar;
        this.f1032c = new C0055d(new B1.g(new C0057f(fVar), 6));
        this.f1030a = context;
        this.f1034e = c0071u;
    }
}
