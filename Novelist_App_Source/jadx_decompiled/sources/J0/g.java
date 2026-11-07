package J0;

import M0.r;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static g f557b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f558a;

    public g(Context context, int i3) {
        switch (i3) {
            case 1:
                this.f558a = context;
                break;
            default:
                this.f558a = context.getApplicationContext();
                break;
        }
    }

    public static g a(Context context) {
        r.f(context);
        synchronized (g.class) {
            if (f557b == null) {
                j jVar = n.f572a;
                synchronized (n.class) {
                    if (n.f574c == null) {
                        n.f574c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f557b = new g(context, 0);
            }
        }
        return f557b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.g.b(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static k c(PackageInfo packageInfo, k... kVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            l lVar = new l(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < kVarArr.length; i3++) {
                if (kVarArr[i3].equals(lVar)) {
                    return kVarArr[i3];
                }
            }
        }
        return null;
    }
}
