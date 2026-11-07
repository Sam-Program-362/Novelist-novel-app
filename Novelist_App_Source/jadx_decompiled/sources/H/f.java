package H;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f408a;

    public f(Activity activity, B1.b bVar) {
        this.f408a = activity;
    }

    public static e b(f fVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return fVar.f();
        }
        if (obj instanceof k) {
            for (m mVar : ((k) obj).f412a) {
            }
        }
        Context context = fVar.f408a;
        a2.h.e(context, "ctx");
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return fVar.f();
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            h hVar = new h(context);
            h hVar2 = hVar.isAvailableOnDevice() ? hVar : null;
            return hVar2 == null ? fVar.f() : hVar2;
        }
        if (i3 <= 33) {
            return fVar.f();
        }
        return null;
    }

    public void a() {
        this.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 int, still in use, count: 2, list:
          (r11v2 int) from 0x0031: IF  (r11v2 int) < (100 int)  -> B:9:0x0036 A[HIDDEN] (LINE:50)
          (r11v2 int) from 0x0036: PHI (r11v1 int) = (r11v2 int) binds: [B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8 A[Catch: IOException -> 0x0123, TRY_LEAVE, TryCatch #1 {IOException -> 0x0123, blocks: (B:10:0x0036, B:16:0x0050, B:18:0x0061, B:20:0x0076, B:24:0x0083, B:31:0x00b2, B:36:0x00df, B:40:0x00e8, B:43:0x011e, B:48:0x010b, B:49:0x00cc, B:50:0x00d2, B:52:0x00d6, B:54:0x00da, B:58:0x0099, B:60:0x00a1, B:61:0x00ac, B:42:0x00fc), top: B:9:0x0036, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6 A[Catch: IOException -> 0x0123, TryCatch #1 {IOException -> 0x0123, blocks: (B:10:0x0036, B:16:0x0050, B:18:0x0061, B:20:0x0076, B:24:0x0083, B:31:0x00b2, B:36:0x00df, B:40:0x00e8, B:43:0x011e, B:48:0x010b, B:49:0x00cc, B:50:0x00d2, B:52:0x00d6, B:54:0x00da, B:58:0x0099, B:60:0x00a1, B:61:0x00ac, B:42:0x00fc), top: B:9:0x0036, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c(java.lang.String r24, java.lang.Double r25, java.lang.Double r26, int r27) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.f.c(java.lang.String, java.lang.Double, java.lang.Double, int):java.lang.String");
    }

    public File d(Bitmap bitmap, Double d3, Double d4, int i3, String str) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, d3.intValue(), d4.intValue(), false);
        String a3 = AbstractC0468a.a("/scaled_", str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = createScaledBitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        createScaledBitmap.compress(hasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
        File file = new File(this.f408a.getCacheDir(), a3);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        return file;
    }

    public void e(ArrayList arrayList, String str, String str2) {
        SharedPreferences.Editor edit = this.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            edit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            edit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            edit.putString("flutter_image_picker_error_message", str2);
        }
        edit.apply();
    }

    public e f() {
        String string;
        Context context = this.f408a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List l02 = P1.e.l0(arrayList);
        if (l02.isEmpty()) {
            return null;
        }
        Iterator it2 = l02.iterator();
        e eVar = null;
        while (it2.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it2.next()).getConstructor(Context.class).newInstance(context);
                a2.h.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                e eVar2 = (e) newInstance;
                if (!eVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (eVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    eVar = eVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return eVar;
    }

    public f(Context context) {
        a2.h.e(context, "context");
        this.f408a = context;
    }

    public f(Activity activity) {
        this.f408a = activity;
    }
}
