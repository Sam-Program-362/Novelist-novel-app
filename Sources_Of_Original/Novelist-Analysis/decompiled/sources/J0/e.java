package J0;

import M0.r;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import it.returntrue.novelist.R;
import java.util.Iterator;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f551a;

    static {
        int i3 = f.f556e;
        f551a = 12451000;
    }

    public Intent a(Context context, int i3, String str) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && H2.h.u(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f551a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                g gVarA = S0.b.a(context);
                sb.append(gVarA.f558a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0207  */
    /* JADX WARN: Code duplicated, block: B:102:0x0209  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0190  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    /* JADX WARN: Code duplicated, block: B:89:0x019c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x0190, please report this as an issue */
    public int b(Context context, int i3) {
        boolean z3;
        PackageInfo packageInfo;
        int i4;
        int i5;
        ApplicationInfo applicationInfo;
        int i6 = f.f556e;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z4 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f.f555d.get()) {
            synchronized (r.f986a) {
                try {
                    if (!r.f987b) {
                        r.f987b = true;
                        try {
                            Bundle bundle = S0.b.a(context).f558a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                r.f988c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e3);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i7 = r.f988c;
            if (i7 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i7 != 12451000) {
                int i8 = f551a;
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 104 + String.valueOf(i7).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i8);
                sb.append(" but found ");
                sb.append(i7);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (H2.h.u(context)) {
            z3 = false;
        } else {
            if (H2.h.f464g == null) {
                H2.h.f464g = Boolean.valueOf(S0.a.w() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (H2.h.f464g.booleanValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        r.b(i3 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i9 = 9;
        if (z3) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            g.a(context);
            if (!g.b(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z3) {
                r.f(packageInfo);
                if (!g.b(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z3 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i4 = packageInfo2.versionCode;
                    if (i4 == -1) {
                        i5 = -1;
                    } else {
                        i5 = i4 / PipesIterator.DEFAULT_QUEUE_SIZE;
                    }
                    if (i5 < (i3 != -1 ? i3 / PipesIterator.DEFAULT_QUEUE_SIZE : -1)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i3).length() + 11 + String.valueOf(i4).length());
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i3);
                        sb2.append(" but found ");
                        sb2.append(i4);
                        Log.w("GooglePlayServicesUtil", sb2.toString());
                        i9 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e4) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e4);
                                i9 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i9 = 0;
                        } else {
                            i9 = 3;
                        }
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z3) {
                i4 = packageInfo2.versionCode;
                if (i4 == -1) {
                    i5 = -1;
                } else {
                    i5 = i4 / PipesIterator.DEFAULT_QUEUE_SIZE;
                }
                if (i5 < (i3 != -1 ? i3 / PipesIterator.DEFAULT_QUEUE_SIZE : -1)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i3).length() + 11 + String.valueOf(i4).length());
                    sb3.append("Google Play services out of date for ");
                    sb3.append(packageName);
                    sb3.append(".  Requires ");
                    sb3.append(i3);
                    sb3.append(" but found ");
                    sb3.append(i4);
                    Log.w("GooglePlayServicesUtil", sb3.toString());
                    i9 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i9 = 3;
                    } else {
                        i9 = 0;
                    }
                }
            } else {
                i4 = packageInfo2.versionCode;
                if (i4 == -1) {
                    i5 = -1;
                } else {
                    i5 = i4 / PipesIterator.DEFAULT_QUEUE_SIZE;
                }
                if (i5 < (i3 != -1 ? i3 / PipesIterator.DEFAULT_QUEUE_SIZE : -1)) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i3).length() + 11 + String.valueOf(i4).length());
                    sb4.append("Google Play services out of date for ");
                    sb4.append(packageName);
                    sb4.append(".  Requires ");
                    sb4.append(i3);
                    sb4.append(" but found ");
                    sb4.append(i4);
                    Log.w("GooglePlayServicesUtil", sb4.toString());
                    i9 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i9 = 3;
                    } else {
                        i9 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i9 != 18) {
            if (i9 == 1) {
                try {
                    Iterator<PackageInstaller.SessionInfo> it2 = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                    while (it2.hasNext()) {
                        if ("com.google.android.gms".equals(it2.next().getAppPackageName())) {
                        }
                    }
                    z4 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                } catch (PackageManager.NameNotFoundException | Exception unused4) {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
        }
        if (z4) {
            return 18;
        }
        return i9;
    }
}
