package J1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class n implements C1.o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Activity f606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final H.f f607m;
    public final H.f n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final H0.i f608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B1.a f609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B1.b f610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ExecutorService f611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Uri f613t;
    public A0.j u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f614v;

    public n(Activity activity, H.f fVar, H.f fVar2) {
        H0.i iVar = new H0.i(activity, 11);
        B1.a aVar = new B1.a(activity, 10);
        B1.b bVar = new B1.b(14);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f614v = new Object();
        this.f606l = activity;
        this.f607m = fVar;
        this.f605k = activity.getPackageName() + ".flutter.image_provider";
        this.f608o = iVar;
        this.f609p = aVar;
        this.f610q = bVar;
        this.n = fVar2;
        this.f611r = executorServiceNewSingleThreadExecutor;
    }

    public static void b(Z1.l lVar) {
        S0.a.f(lVar, new d("already_active", "Image picker is already active"));
    }

    @Override // C1.o
    public final boolean a(int i3, int i4, Intent intent) {
        Runnable iVar;
        if (i3 == 2342) {
            iVar = new i(this, i4, intent, 0);
        } else if (i3 == 2343) {
            iVar = new j(this, i4, 0);
        } else if (i3 == 2352) {
            iVar = new i(this, i4, intent, 4);
        } else if (i3 != 2353) {
            switch (i3) {
                case 2346:
                    iVar = new i(this, i4, intent, 1);
                    break;
                case 2347:
                    iVar = new i(this, i4, intent, 3);
                    break;
                case 2348:
                    iVar = new i(this, i4, intent, 2);
                    break;
                default:
                    return false;
            }
        } else {
            iVar = new j(this, i4, 1);
        }
        this.f611r.execute(iVar);
        return true;
    }

    public final void c(String str, String str2) {
        Z1.l lVar;
        synchronized (this.f614v) {
            A0.j jVar = this.u;
            lVar = jVar != null ? (Z1.l) jVar.n : null;
            this.u = null;
        }
        if (lVar == null) {
            this.n.e(null, str, str2);
        } else {
            S0.a.f(lVar, new d(str, str2));
        }
    }

    public final void d(ArrayList arrayList) {
        Z1.l lVar;
        synchronized (this.f614v) {
            A0.j jVar = this.u;
            lVar = jVar != null ? (Z1.l) jVar.n : null;
            this.u = null;
        }
        if (lVar == null) {
            this.n.e(arrayList, null, null);
        } else {
            lVar.f(new O1.d(arrayList));
        }
    }

    public final void e(String str) {
        Z1.l lVar;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.f614v) {
            A0.j jVar = this.u;
            lVar = jVar != null ? (Z1.l) jVar.n : null;
            this.u = null;
        }
        if (lVar != null) {
            lVar.f(new O1.d(arrayList));
        } else {
            if (arrayList.isEmpty()) {
                return;
            }
            this.n.e(arrayList, null, null);
        }
    }

    public final ArrayList f(Intent intent, boolean z3) {
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        B1.b bVar = this.f610q;
        Activity activity = this.f606l;
        if (data != null) {
            bVar.getClass();
            String strH = B1.b.h(activity, data);
            if (strH != null) {
                arrayList.add(new m(strH, null));
                return arrayList;
            }
        } else if (intent.getClipData() != null) {
            for (int i3 = 0; i3 < intent.getClipData().getItemCount(); i3++) {
                Uri uri = intent.getClipData().getItemAt(i3).getUri();
                if (uri != null) {
                    bVar.getClass();
                    String strH2 = B1.b.h(activity, uri);
                    if (strH2 != null) {
                        arrayList.add(new m(strH2, z3 ? activity.getContentResolver().getType(uri) : null));
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public final void g(Intent intent, Uri uri) {
        List<ResolveInfo> listQueryIntentActivities;
        Activity activity = this.f606l;
        PackageManager packageManager = activity.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L));
        } else {
            try {
                listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            } catch (Exception e3) {
                Log.e("ImagePickerDelegate", "Fallback query for intent activities failed. Ensure the intent is properly formatted and check if Android 11+ package visibility restrictions require a specific <queries> declaration in your app's AndroidManifest.xml.", e3);
                listQueryIntentActivities = Collections.EMPTY_LIST;
            }
        }
        Iterator<ResolveInfo> it2 = listQueryIntentActivities.iterator();
        while (it2.hasNext()) {
            activity.grantUriPermission(it2.next().activityInfo.packageName, uri, 3);
        }
    }

    public final void h(ArrayList arrayList) {
        q qVar;
        synchronized (this.f614v) {
            A0.j jVar = this.u;
            qVar = jVar != null ? (q) jVar.f57l : null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        if (qVar == null) {
            while (i3 < arrayList.size()) {
                arrayList2.add(((m) arrayList.get(i3)).f603a);
                i3++;
            }
            d(arrayList2);
            return;
        }
        while (i3 < arrayList.size()) {
            m mVar = (m) arrayList.get(i3);
            String strC = mVar.f603a;
            String str = mVar.f604b;
            if (str == null || !str.startsWith("video/")) {
                strC = this.f607m.c(mVar.f603a, qVar.f619a, qVar.f620b, (int) qVar.f621c);
            }
            arrayList2.add(strC);
            i3++;
        }
        d(arrayList2);
    }

    public final void i() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f612s == 2) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (Build.VERSION.SDK_INT >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
        }
        String string = UUID.randomUUID().toString();
        Activity activity = this.f606l;
        File cacheDir = activity.getCacheDir();
        try {
            cacheDir.mkdirs();
            File fileCreateTempFile = File.createTempFile(string, ".jpg", cacheDir);
            this.f613t = Uri.parse("file:" + fileCreateTempFile.getAbsolutePath());
            Uri uriD = p055t.c.d((Activity) this.f609p.f80l, this.f605k, fileCreateTempFile);
            intent.putExtra("output", uriD);
            g(intent, uriD);
            try {
                try {
                    activity.startActivityForResult(intent, 2343);
                } catch (ActivityNotFoundException unused) {
                    fileCreateTempFile.delete();
                    c("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (SecurityException e3) {
                e3.printStackTrace();
                c("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final void j() {
        v vVar;
        Long l3;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.f614v) {
            A0.j jVar = this.u;
            vVar = jVar != null ? (v) jVar.f58m : null;
        }
        if (vVar != null && (l3 = vVar.f631a) != null) {
            intent.putExtra("android.intent.extra.durationLimit", l3.intValue());
        }
        if (this.f612s == 2) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (Build.VERSION.SDK_INT >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
        }
        String string = UUID.randomUUID().toString();
        File cacheDir = this.f606l.getCacheDir();
        try {
            cacheDir.mkdirs();
            File fileCreateTempFile = File.createTempFile(string, ".mp4", cacheDir);
            this.f613t = Uri.parse("file:" + fileCreateTempFile.getAbsolutePath());
            Uri uriD = p055t.c.d((Activity) this.f609p.f80l, this.f605k, fileCreateTempFile);
            intent.putExtra("output", uriD);
            g(intent, uriD);
            try {
                try {
                    this.f606l.startActivityForResult(intent, 2353);
                } catch (ActivityNotFoundException unused) {
                    fileCreateTempFile.delete();
                    c("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (SecurityException e3) {
                e3.printStackTrace();
                c("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final boolean k() {
        H0.i iVar = this.f608o;
        if (iVar == null) {
            return false;
        }
        Activity activity = (Activity) iVar.f443l;
        try {
            PackageManager packageManager = activity.getPackageManager();
            return Arrays.asList((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(activity.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(activity.getPackageName(), 4096)).requestedPermissions).contains("android.permission.CAMERA");
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public final boolean l(q qVar, v vVar, Z1.l lVar) {
        synchronized (this.f614v) {
            try {
                if (this.u != null) {
                    return false;
                }
                this.u = new A0.j(qVar, vVar, lVar, 6);
                this.n.a();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
