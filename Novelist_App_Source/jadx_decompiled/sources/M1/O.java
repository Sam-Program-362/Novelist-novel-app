package M1;

import a.AbstractC0102a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import h2.AbstractC0273d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o1.C0442b;
import org.apache.tika.mime.MimeTypes;
import t.AbstractC0468a;
import t.AbstractC0470c;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public Context f1030a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1031b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1032c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1033d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1034e;

    public O(Context context, C0442b c0442b) {
        a2.h.e(context, "context");
        a2.h.e(c0442b, "manager");
        this.f1030a = context;
        this.f1031b = null;
        this.f1032c = c0442b;
        this.f1033d = new O1.e(new b.q(this, 1));
        this.f1034e = new O1.e(new I1.l(7));
    }

    public static String b(String str) {
        if (str == null || !AbstractC0273d.Y(str, "/")) {
            return "*";
        }
        String substring = str.substring(0, AbstractC0273d.c0(str, "/", 0, 6));
        a2.h.d(substring, "substring(...)");
        return substring;
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

    public void f(Map map) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<? extends Parcelable> arrayList3;
        String str;
        String str2;
        B1.o oVar;
        boolean z3;
        String str3;
        Context context = this.f1030a;
        a2.h.e(map, "arguments");
        File c3 = c();
        File[] listFiles = c3.listFiles();
        if (c3.exists() && listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                file.delete();
            }
            c3.delete();
        }
        String str4 = (String) map.get("text");
        String str5 = (String) map.get("uri");
        String str6 = (String) map.get("subject");
        String str7 = (String) map.get("title");
        List list = (List) map.get("paths");
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) map.get("mimeTypes");
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof String) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList != null) {
            arrayList3 = new ArrayList<>(arrayList.size());
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList.get(i3);
                i3++;
                File file2 = new File((String) obj3);
                try {
                    String canonicalPath = file2.getCanonicalPath();
                    a2.h.b(canonicalPath);
                    String canonicalPath2 = c().getCanonicalPath();
                    a2.h.d(canonicalPath2, "getCanonicalPath(...)");
                    z3 = canonicalPath.startsWith(canonicalPath2);
                } catch (IOException unused) {
                    z3 = false;
                }
                if (z3) {
                    throw new IOException(AbstractC0468a.b("Shared file can not be located in '", c().getCanonicalPath(), "'"));
                }
                File c4 = c();
                if (!c4.exists()) {
                    c4.mkdirs();
                }
                File file3 = new File(c4, file2.getName());
                if (!file2.exists()) {
                    throw new X1.a(file2, null, "The source file doesn't exist.");
                }
                if (file3.exists() && !file3.delete()) {
                    throw new X1.a(file2, file3, "Tried to overwrite the destination, but failed to delete it.");
                }
                if (!file2.isDirectory()) {
                    File parentFile = file3.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        try {
                            byte[] bArr = new byte[8192];
                            str3 = str5;
                            for (int read = fileInputStream.read(bArr); read >= 0; read = fileInputStream.read(bArr)) {
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.close();
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC0102a.m(fileOutputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC0102a.m(fileInputStream, th3);
                            throw th4;
                        }
                    }
                } else {
                    if (!file3.mkdirs()) {
                        throw new X1.b(file2, file3, "Failed to create target directory.");
                    }
                    str3 = str5;
                }
                Context context2 = (Activity) this.f1031b;
                if (context2 == null) {
                    context2 = context;
                }
                arrayList3.add(AbstractC0470c.d(context2, (String) ((O1.e) this.f1033d).a(), file3));
                str5 = str3;
            }
        } else {
            arrayList3 = null;
        }
        String str8 = str5;
        Intent intent = new Intent();
        if (arrayList3 == null) {
            intent.setAction("android.intent.action.SEND");
            intent.setType(MimeTypes.PLAIN_TEXT);
            if (str8 != null) {
                str4 = str8;
            }
            intent.putExtra("android.intent.extra.TEXT", str4);
            if (!(str6 == null || AbstractC0273d.d0(str6))) {
                intent.putExtra("android.intent.extra.SUBJECT", str6);
            }
            if (!(str7 == null || AbstractC0273d.d0(str7))) {
                intent.putExtra("android.intent.extra.TITLE", str7);
            }
        } else {
            if (arrayList3.isEmpty()) {
                throw new IOException("Error sharing files: No files found");
            }
            str = "*/*";
            if (arrayList3.size() == 1) {
                str = arrayList2 == null || arrayList2.isEmpty() ? "*/*" : (String) P1.e.g0(arrayList2);
                intent.setAction("android.intent.action.SEND");
                intent.setType(str);
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) P1.e.g0(arrayList3));
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    if (arrayList2.size() == 1) {
                        str = (String) P1.e.g0(arrayList2);
                    } else {
                        str2 = (String) P1.e.g0(arrayList2);
                        int size2 = arrayList2.size() - 1;
                        if (1 <= size2) {
                            int i4 = 1;
                            while (true) {
                                if (!a2.h.a(str2, arrayList2.get(i4))) {
                                    if (!b(str2).equals(b((String) arrayList2.get(i4)))) {
                                        break;
                                    } else {
                                        str2 = b((String) arrayList2.get(i4)).concat("/*");
                                    }
                                }
                                if (i4 == size2) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        intent.setType(str2);
                        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                    }
                }
                str2 = str;
                intent.setType(str2);
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
            }
            if (!(str4 == null || AbstractC0273d.d0(str4))) {
                intent.putExtra("android.intent.extra.TEXT", str4);
            }
            if (!(str6 == null || AbstractC0273d.d0(str6))) {
                intent.putExtra("android.intent.extra.SUBJECT", str6);
            }
            if (!(str7 == null || AbstractC0273d.d0(str7))) {
                intent.putExtra("android.intent.extra.TITLE", str7);
            }
            intent.addFlags(1);
        }
        Intent createChooser = Intent.createChooser(intent, str7, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((O1.e) this.f1034e).a()).intValue() | 134217728).getIntentSender());
        if (arrayList3 != null) {
            Context context3 = (Activity) this.f1031b;
            if (context3 == null) {
                context3 = context;
            }
            List<ResolveInfo> queryIntentActivities = context3.getPackageManager().queryIntentActivities(createChooser, 65536);
            a2.h.d(queryIntentActivities, "queryIntentActivities(...)");
            Iterator<T> it2 = queryIntentActivities.iterator();
            while (it2.hasNext()) {
                String str9 = ((ResolveInfo) it2.next()).activityInfo.packageName;
                int size3 = arrayList3.size();
                int i5 = 0;
                while (i5 < size3) {
                    Parcelable parcelable = arrayList3.get(i5);
                    i5++;
                    Uri uri = (Uri) parcelable;
                    Context context4 = (Activity) this.f1031b;
                    if (context4 == null) {
                        context4 = context;
                    }
                    context4.grantUriPermission(str9, uri, 3);
                }
            }
        }
        a2.h.b(createChooser);
        Activity activity = (Activity) this.f1031b;
        if (activity != null) {
            activity.startActivityForResult(createChooser, 22643);
            return;
        }
        createChooser.addFlags(268435456);
        C0442b c0442b = (C0442b) this.f1032c;
        if (c0442b.f4217l.compareAndSet(false, true) && (oVar = c0442b.f4216k) != null) {
            oVar.d("dev.fluttercommunity.plus/share/unavailable");
            c0442b.f4216k = null;
        }
        context.startActivity(createChooser);
    }

    public O(C1.f fVar, Context context, C0071u c0071u) {
        a2.h.e(fVar, "binaryMessenger");
        this.f1031b = fVar;
        this.f1032c = new C0055d(new B1.g(new C0057f(fVar), 6));
        this.f1030a = context;
        this.f1034e = c0071u;
    }
}
