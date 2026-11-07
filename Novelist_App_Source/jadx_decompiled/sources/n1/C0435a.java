package n1;

import B1.s;
import C1.m;
import P1.d;
import a2.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.tika.fork.ForkServer;
import y1.C0500a;
import y1.b;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435a implements m, b {

    /* renamed from: k, reason: collision with root package name */
    public Context f4138k;

    /* renamed from: l, reason: collision with root package name */
    public s f4139l;

    public static String b(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        h.b(digest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i3 = 0; i3 < length; i3++) {
            byte b3 = digest[i3];
            int i4 = i3 * 2;
            cArr2[i4] = cArr[(b3 & ForkServer.ERROR) >>> 4];
            cArr2[i4 + 1] = cArr[b3 & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        try {
            if (Build.VERSION.SDK_INT < 28) {
                Context context = this.f4138k;
                h.b(context);
                Signature[] signatureArr = packageManager.getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && d.a0(signatureArr) != null) {
                    byte[] byteArray = ((Signature) d.a0(signatureArr)).toByteArray();
                    h.d(byteArray, "toByteArray(...)");
                    return b(byteArray);
                }
                return null;
            }
            Context context2 = this.f4138k;
            h.b(context2);
            signingInfo = packageManager.getPackageInfo(context2.getPackageName(), 134217728).signingInfo;
            if (signingInfo == null) {
                return null;
            }
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            if (hasMultipleSigners) {
                apkContentsSigners = signingInfo.getApkContentsSigners();
                h.d(apkContentsSigners, "getApkContentsSigners(...)");
                byte[] byteArray2 = ((Signature) d.a0(apkContentsSigners)).toByteArray();
                h.d(byteArray2, "toByteArray(...)");
                return b(byteArray2);
            }
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            h.d(signingCertificateHistory, "getSigningCertificateHistory(...)");
            byte[] byteArray3 = ((Signature) d.a0(signingCertificateHistory)).toByteArray();
            h.d(byteArray3, "toByteArray(...)");
            return b(byteArray3);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094 A[Catch: NameNotFoundException -> 0x006f, TryCatch #0 {NameNotFoundException -> 0x006f, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0044, B:8:0x0051, B:11:0x0062, B:13:0x0068, B:16:0x0072, B:19:0x008b, B:21:0x0094, B:22:0x009c, B:24:0x00a5, B:26:0x00ac, B:27:0x00b1, B:30:0x0099, B:33:0x004d, B:34:0x00c7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5 A[Catch: NameNotFoundException -> 0x006f, TryCatch #0 {NameNotFoundException -> 0x006f, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0044, B:8:0x0051, B:11:0x0062, B:13:0x0068, B:16:0x0072, B:19:0x008b, B:21:0x0094, B:22:0x009c, B:24:0x00a5, B:26:0x00ac, B:27:0x00b1, B:30:0x0099, B:33:0x004d, B:34:0x00c7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac A[Catch: NameNotFoundException -> 0x006f, TryCatch #0 {NameNotFoundException -> 0x006f, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0044, B:8:0x0051, B:11:0x0062, B:13:0x0068, B:16:0x0072, B:19:0x008b, B:21:0x0094, B:22:0x009c, B:24:0x00a5, B:26:0x00ac, B:27:0x00b1, B:30:0x0099, B:33:0x004d, B:34:0x00c7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: NameNotFoundException -> 0x006f, TryCatch #0 {NameNotFoundException -> 0x006f, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0044, B:8:0x0051, B:11:0x0062, B:13:0x0068, B:16:0x0072, B:19:0x008b, B:21:0x0094, B:22:0x009c, B:24:0x00a5, B:26:0x00ac, B:27:0x00b1, B:30:0x0099, B:33:0x004d, B:34:0x00c7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    @Override // C1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(A.c r13, B1.o r14) {
        /*
            r12 = this;
            java.lang.String r0 = "call"
            a2.h.e(r13, r0)
            java.lang.Object r13 = r13.f6l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r13 = (java.lang.String) r13     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r0 = "getAll"
            boolean r13 = a2.h.a(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r13 == 0) goto Lc7
            android.content.Context r13 = r12.f4138k     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            a2.h.b(r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.Context r0 = r12.f4138k     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            a2.h.b(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r1 = 0
            android.content.pm.PackageInfo r0 = r13.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r1 = r12.a(r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.Context r2 = r12.f4138k     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            a2.h.b(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.Context r3 = r12.f4138k     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            a2.h.b(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r5 = 30
            if (r4 < r5) goto L4d
            android.content.pm.InstallSourceInfo r2 = io.flutter.view.a.b(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r2 = io.flutter.view.a.f(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            goto L51
        L4d:
            java.lang.String r2 = r2.getInstallerPackageName(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
        L51:
            long r5 = r0.firstInstallTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            long r7 = r0.lastUpdateTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.util.HashMap r3 = new java.util.HashMap     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r9 = "appName"
            android.content.pm.ApplicationInfo r10 = r0.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r11 = ""
            if (r10 == 0) goto L71
            java.lang.CharSequence r13 = r10.loadLabel(r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r13 == 0) goto L71
            java.lang.String r13 = r13.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r13 != 0) goto L72
            goto L71
        L6f:
            r13 = move-exception
            goto Lcb
        L71:
            r13 = r11
        L72:
            r3.put(r9, r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r13 = "packageName"
            android.content.Context r9 = r12.f4138k     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            a2.h.b(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r9 = r9.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r3.put(r13, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r13 = "version"
            java.lang.String r9 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r9 != 0) goto L8a
            goto L8b
        L8a:
            r11 = r9
        L8b:
            r3.put(r13, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r13 = "buildNumber"
            r9 = 28
            if (r4 < r9) goto L99
            long r9 = j0.AbstractC0322h.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            goto L9c
        L99:
            int r0 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            long r9 = (long) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
        L9c:
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r3.put(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r1 == 0) goto Laa
            java.lang.String r13 = "buildSignature"
            r3.put(r13, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
        Laa:
            if (r2 == 0) goto Lb1
            java.lang.String r13 = "installerStore"
            r3.put(r13, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
        Lb1:
            java.lang.String r13 = "installTime"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r3.put(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r13 = "updateTime"
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r3.put(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r14.d(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            return
        Lc7:
            r14.b()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            return
        Lcb:
            java.lang.String r13 = r13.getMessage()
            r0 = 0
            java.lang.String r1 = "Name not found"
            r14.a(r1, r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C0435a.k(A.c, B1.o):void");
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        h.e(c0500a, "binding");
        this.f4138k = c0500a.f4728a;
        s sVar = new s(c0500a.f4730c, "dev.fluttercommunity.plus/package_info");
        this.f4139l = sVar;
        sVar.z(this);
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        h.e(c0500a, "binding");
        this.f4138k = null;
        s sVar = this.f4139l;
        h.b(sVar);
        sVar.z(null);
        this.f4139l = null;
    }
}
