package H;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
          (r11v2 int) from 0x0031: IF  (r11v2 int) < (100 int)  -> B:72:0x0036 A[HIDDEN] (LINE:50)
          (r11v2 int) from 0x0036: PHI (r11 I:??) = (r11v2 int) binds: [B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:133)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.String c(java.lang.String r24, java.lang.Double r25, java.lang.Double r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.f.c(java.lang.String, java.lang.Double, java.lang.Double, int):java.lang.String");
    }

    public File d(Bitmap bitmap, Double d3, Double d4, int i3, String str) throws IOException {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, d3.intValue(), d4.intValue(), false);
        String strA = p055t.a.a("/scaled_", str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean zHasAlpha = bitmapCreateScaledBitmap.hasAlpha();
        if (zHasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmapCreateScaledBitmap.compress(zHasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i3, byteArrayOutputStream);
        File file = new File(this.f408a.getCacheDir(), strA);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        return file;
    }

    public void e(ArrayList arrayList, String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f408a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            editorEdit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            editorEdit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            editorEdit.putString("flutter_image_picker_error_message", str2);
        }
        editorEdit.apply();
    }

    public e f() throws PackageManager.NameNotFoundException {
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
        List listL0 = P1.e.l0(arrayList);
        if (listL0.isEmpty()) {
            return null;
        }
        Iterator it2 = listL0.iterator();
        e eVar = null;
        while (it2.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it2.next()).getConstructor(Context.class).newInstance(context);
                a2.h.c(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                e eVar2 = (e) objNewInstance;
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
