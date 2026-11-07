package J0;

import M0.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g f557b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public static final boolean b(PackageInfo packageInfo, boolean z3) {
        a1.f fVar;
        int i3;
        if (packageInfo != null) {
            if (z3 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z3 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                a1.f fVar2 = z3 ? m.f571c : m.f570b;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        a1.b bVar = a1.e.f1691l;
                        Object[] objArr = {byteArray};
                        S0.a.K(1, objArr);
                        fVar = new a1.f(1, objArr);
                    } else {
                        a1.b bVar2 = a1.e.f1691l;
                        fVar = a1.f.f1692o;
                    }
                } else {
                    if (i4 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        a1.b bVar3 = a1.e.f1691l;
                        fVar = a1.f.f1692o;
                    } else {
                        a1.b bVar4 = a1.e.f1691l;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i5].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i7 = i6 + 1;
                            if (i7 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i7 <= length2) {
                                i3 = length2;
                            } else {
                                i3 = (length2 >> 1) + length2 + 1;
                                if (i3 < i7) {
                                    int iHighestOneBit = Integer.highestOneBit(i6);
                                    i3 = iHighestOneBit + iHighestOneBit;
                                }
                                if (i3 < 0) {
                                    i3 = Integer.MAX_VALUE;
                                }
                            }
                            if (i3 > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                            }
                            objArrCopyOf[i6] = byteArray2;
                            i5++;
                            i6 = i7;
                        }
                        fVar = i6 == 0 ? a1.f.f1692o : new a1.f(i6, objArrCopyOf);
                    }
                }
                if (fVar.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                a1.e eVarE = fVar.e();
                int size = eVarE.size();
                int i8 = 0;
                while (i8 < size) {
                    byte[] bArr = (byte[]) eVarE.get(i8);
                    a1.b bVarListIterator = fVar2.listIterator(0);
                    do {
                        int i9 = i8 + 1;
                        if (!bVarListIterator.hasNext()) {
                            i8 = i9;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) bVarListIterator.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z3 ? c(packageInfo, m.f569a) : c(packageInfo, m.f569a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
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
