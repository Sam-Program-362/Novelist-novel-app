package p041n1;

import A.c;
import B1.o;
import B1.s;
import C1.m;
import P1.d;
import a2.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import p067y1.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m, b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f4138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f4139l;

    public static String b(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        h.b(bArrDigest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i3 = 0; i3 < length; i3++) {
            byte b3 = bArrDigest[i3];
            int i4 = i3 * 2;
            cArr2[i4] = cArr[(b3 & ForkServer.ERROR) >>> 4];
            cArr2[i4 + 1] = cArr[b3 & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
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
            SigningInfo signingInfo = packageManager.getPackageInfo(context2.getPackageName(), 134217728).signingInfo;
            if (signingInfo == null) {
                return null;
            }
            if (signingInfo.hasMultipleSigners()) {
                Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                h.d(apkContentsSigners, "getApkContentsSigners(...)");
                byte[] byteArray2 = ((Signature) d.a0(apkContentsSigners)).toByteArray();
                h.d(byteArray2, "toByteArray(...)");
                return b(byteArray2);
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            h.d(signingCertificateHistory, "getSigningCertificateHistory(...)");
            byte[] byteArray3 = ((Signature) d.a0(signingCertificateHistory)).toByteArray();
            h.d(byteArray3, "toByteArray(...)");
            return b(byteArray3);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @Override // C1.m
    public final void k(c cVar, o oVar) {
        String string;
        CharSequence charSequenceLoadLabel;
        h.e(cVar, "call");
        try {
            if (!h.a((String) cVar.f6l, "getAll")) {
                oVar.b();
                return;
            }
            Context context = this.f4138k;
            h.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f4138k;
            h.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            String strA = a(packageManager);
            Context context3 = this.f4138k;
            h.b(context3);
            PackageManager packageManager2 = context3.getPackageManager();
            Context context4 = this.f4138k;
            h.b(context4);
            String packageName = context4.getPackageName();
            int i3 = Build.VERSION.SDK_INT;
            String initiatingPackageName = i3 >= 30 ? packageManager2.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager2.getInstallerPackageName(packageName);
            long j3 = packageInfo.firstInstallTime;
            long j4 = packageInfo.lastUpdateTime;
            HashMap map = new HashMap();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str = StringUtils.EMPTY;
            if (applicationInfo == null || (charSequenceLoadLabel = applicationInfo.loadLabel(packageManager)) == null || (string = charSequenceLoadLabel.toString()) == null) {
                string = StringUtils.EMPTY;
            }
            map.put("appName", string);
            Context context5 = this.f4138k;
            h.b(context5);
            map.put("packageName", context5.getPackageName());
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                str = str2;
            }
            map.put("version", str);
            map.put("buildNumber", String.valueOf(i3 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            if (strA != null) {
                map.put("buildSignature", strA);
            }
            if (initiatingPackageName != null) {
                map.put("installerStore", initiatingPackageName);
            }
            map.put("installTime", String.valueOf(j3));
            map.put("updateTime", String.valueOf(j4));
            oVar.d(map);
        } catch (PackageManager.NameNotFoundException e3) {
            oVar.a("Name not found", e3.getMessage(), null);
        }
    }

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        h.e(aVar, "binding");
        this.f4138k = aVar.f4728a;
        s sVar = new s(aVar.f4730c, "dev.fluttercommunity.plus/package_info");
        this.f4139l = sVar;
        sVar.z(this);
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        h.e(aVar, "binding");
        this.f4138k = null;
        s sVar = this.f4139l;
        h.b(sVar);
        sVar.z(null);
        this.f4139l = null;
    }
}
