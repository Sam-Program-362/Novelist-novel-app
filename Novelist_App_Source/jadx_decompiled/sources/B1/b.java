package B1;

import D.InterfaceC0017s;
import K1.O;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.tika.pipes.PipesServer;
import t1.C0475c;

/* loaded from: classes.dex */
public final class b implements C1.m, InterfaceC0017s, F2.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f81k;

    public /* synthetic */ b(int i3) {
        this.f81k = i3;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x070b A[Catch: all -> 0x0714, Exception -> 0x0719, TryCatch #27 {Exception -> 0x0719, all -> 0x0714, blocks: (B:279:0x0707, B:281:0x070b, B:283:0x072d, B:296:0x071c), top: B:278:0x0707 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x071c A[Catch: all -> 0x0714, Exception -> 0x0719, TryCatch #27 {Exception -> 0x0719, all -> 0x0714, blocks: (B:279:0x0707, B:281:0x070b, B:283:0x072d, B:296:0x071c), top: B:278:0x0707 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(Z.h r109, Z.h r110) {
        /*
            Method dump skipped, instructions count: 1980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.b.c(Z.h, Z.h):void");
    }

    public static A.c f(Context context, String[] strArr, String str, s sVar) {
        String[] n = n(context);
        int length = n.length;
        int i3 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i3 >= length) {
                return null;
            }
            String str2 = n[i3];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i4 = i5;
                }
            }
            if (zipFile != null) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    if (i6 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c3 = File.separatorChar;
                            sb.append(c3);
                            sb.append(str3);
                            sb.append(c3);
                            sb.append(str);
                            String sb2 = sb.toString();
                            sVar.t("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                A.c cVar = new A.c(13, false);
                                cVar.f6l = zipFile;
                                cVar.f7m = entry;
                                return cVar;
                            }
                        }
                        i6 = i7;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i3++;
        }
    }

    public static String g(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType == null || extensionFromMimeType.isEmpty()) {
                return null;
            }
            return "." + m(extensionFromMimeType);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        r14.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:5:0x000d, B:54:0x004f, B:11:0x0065, B:13:0x006b, B:16:0x0084, B:17:0x00a7, B:26:0x00d3, B:40:0x00e5, B:39:0x00e2, B:42:0x008b, B:45:0x009d, B:46:0x0099, B:9:0x0061, B:65:0x005e, B:64:0x005b, B:34:0x00dc, B:48:0x0039, B:50:0x003f, B:53:0x0047, B:59:0x0055, B:20:0x00bf, B:21:0x00c1, B:23:0x00c8, B:25:0x00cc), top: B:4:0x000d, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8 A[Catch: all -> 0x00da, LOOP:0: B:21:0x00c1->B:23:0x00c8, LOOP_END, TryCatch #4 {all -> 0x00da, blocks: (B:20:0x00bf, B:21:0x00c1, B:23:0x00c8, B:25:0x00cc), top: B:19:0x00bf, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(android.content.Context r13, android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.b.h(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static String[] i(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c3 = File.separatorChar;
        sb.append(c3);
        sb.append("([^\\");
        sb.append(c3);
        sb.append("]*)");
        sb.append(c3);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : n(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static File l(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String str2 = str.split("/")[r4.length - 1];
        for (int i3 = 0; i3 < 2; i3++) {
            str2 = str2.replace(strArr[i3], "_");
        }
        return str2;
    }

    public static String[] n(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // F2.a
    public F2.b a(String str) {
        return H2.b.f444k;
    }

    public List d(String str) {
        switch (this.f81k) {
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                try {
                    return (List) new O(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                } catch (IOException | ClassNotFoundException e3) {
                    throw new RuntimeException(e3);
                }
            default:
                a2.h.e(str, "listString");
                Object readObject = new O(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
                a2.h.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) readObject) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }

    public String e(List list) {
        switch (this.f81k) {
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            default:
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                a2.h.d(encodeToString, "encodeToString(...)");
                return encodeToString;
        }
    }

    @Override // C1.m
    public void k(A.c cVar, o oVar) {
        switch (this.f81k) {
            case 0:
                oVar.d(null);
                break;
            case 1:
                break;
            default:
                oVar.d(null);
                break;
        }
    }

    public b(b bVar) {
        this.f81k = 1;
    }

    public b(C0475c c0475c) {
        this.f81k = 2;
        new s(c0475c, "flutter/deferredcomponent", C1.r.f180a, null).z(new b(this));
        A0.j.E().getClass();
        new HashMap();
    }

    private final void j(A.c cVar, o oVar) {
    }

    @Override // D.InterfaceC0017s
    public void onScrollLimit(int i3, int i4, int i5, boolean z3) {
    }

    @Override // D.InterfaceC0017s
    public void onScrollProgress(int i3, int i4, int i5, int i6) {
    }
}
