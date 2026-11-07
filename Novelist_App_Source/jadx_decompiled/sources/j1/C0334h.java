package j1;

import B1.o;
import P1.m;
import a.AbstractC0102a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import h2.AbstractC0273d;
import h2.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import t.AbstractC0468a;

/* renamed from: j1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334h {
    /* JADX WARN: Removed duplicated region for block: B:27:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150 A[Catch: IOException -> 0x014b, TryCatch #6 {IOException -> 0x014b, blocks: (B:90:0x0141, B:92:0x0147, B:79:0x0150, B:81:0x0155), top: B:89:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155 A[Catch: IOException -> 0x014b, TRY_LEAVE, TryCatch #6 {IOException -> 0x014b, blocks: (B:90:0x0141, B:92:0x0147, B:79:0x0150, B:81:0x0155), top: B:89:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(android.app.Activity r12, android.net.Uri r13, boolean r14, java.util.ArrayList r15) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C0334h.a(android.app.Activity, android.net.Uri, boolean, java.util.ArrayList):void");
    }

    public static final Uri b(Activity activity, Uri uri, int i3) {
        if (i3 > 0) {
            Context applicationContext = activity.getApplicationContext();
            a2.h.d(applicationContext, "getApplicationContext(...)");
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(applicationContext.getContentResolver().getType(uri));
            if (extensionFromMimeType != null && (extensionFromMimeType.contentEquals("jpg") || extensionFromMimeType.contentEquals("jpeg") || extensionFromMimeType.contentEquals("png") || extensionFromMimeType.contentEquals("webp") || extensionFromMimeType.contentEquals("heic") || extensionFromMimeType.contentEquals("heif"))) {
                Context applicationContext2 = activity.getApplicationContext();
                a2.h.d(applicationContext2, "getApplicationContext(...)");
                try {
                    InputStream openInputStream = applicationContext2.getContentResolver().openInputStream(uri);
                    try {
                        Bitmap.CompressFormat e3 = e(applicationContext2, uri);
                        File d3 = d(applicationContext2, e3);
                        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                        FileOutputStream fileOutputStream = new FileOutputStream(d3);
                        decodeStream.compress(e3, i3, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Uri fromFile = Uri.fromFile(d3);
                        a2.h.d(fromFile, "fromFile(...)");
                        AbstractC0102a.m(openInputStream, null);
                        return fromFile;
                    } finally {
                    }
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return uri;
    }

    public static final String c(String str) {
        switch (str.hashCode()) {
            case -1349088399:
                if (str.equals("custom")) {
                    return "*/*";
                }
                return null;
            case 96748:
                if (str.equals("any")) {
                    return "*/*";
                }
                return null;
            case 99469:
                if (str.equals("dir")) {
                    return "dir";
                }
                return null;
            case 93166550:
                if (str.equals("audio")) {
                    return "audio/*";
                }
                return null;
            case 100313435:
                if (str.equals("image")) {
                    return "image/*";
                }
                return null;
            case 103772132:
                if (str.equals("media")) {
                    return "media";
                }
                return null;
            case 112202875:
                if (str.equals("video")) {
                    return "video/*";
                }
                return null;
            default:
                return null;
        }
    }

    public static File d(Context context, Bitmap.CompressFormat compressFormat) {
        String b3 = AbstractC0468a.b("IMAGE_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()), "_");
        File cacheDir = context.getCacheDir();
        int i3 = AbstractC0332f.f3568a[compressFormat.ordinal()];
        File createTempFile = File.createTempFile(b3, ".".concat(i3 != 1 ? i3 != 2 ? "jpeg" : "webp" : "png"), cacheDir);
        a2.h.d(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    public static Bitmap.CompressFormat e(Context context, Uri uri) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        a2.h.b(extensionFromMimeType);
        Locale locale = Locale.getDefault();
        a2.h.d(locale, "getDefault(...)");
        String upperCase = extensionFromMimeType.toUpperCase(locale);
        a2.h.d(upperCase, "toUpperCase(...)");
        return upperCase.equals("PNG") ? Bitmap.CompressFormat.PNG : upperCase.equals("WEBP") ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    public static final String f(Context context, Uri uri) {
        Exception exc;
        Uri uri2;
        String str;
        a2.h.e(uri, "uri");
        a2.h.e(context, "context");
        String str2 = null;
        try {
            if (a2.h.a(uri.getScheme(), "content")) {
                uri2 = uri;
                Cursor query = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                try {
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                                AbstractC0102a.m(query, null);
                            }
                        } finally {
                        }
                    }
                    AbstractC0102a.m(query, null);
                } catch (Exception e3) {
                    exc = e3;
                    str2 = str;
                    Log.e("FilePickerUtils", "Failed to handle file name: " + exc);
                    return str2;
                }
                str = null;
            } else {
                uri2 = uri;
                str = null;
            }
            if (str != null) {
                return str;
            }
            String path = uri2.getPath();
            if (path != null) {
                return AbstractC0273d.h0(path, '/', path);
            }
            return null;
        } catch (Exception e4) {
            exc = e4;
            Log.e("FilePickerUtils", "Failed to handle file name: " + exc);
            return str2;
        }
    }

    public static final String g(Context context, Uri uri) {
        String str;
        List list;
        String str2;
        List list2;
        a2.h.e(context, "context");
        int i3 = Build.VERSION.SDK_INT;
        Collection collection = m.f1219k;
        if (i3 < 30 && a2.h.a(uri.getAuthority(), "com.android.providers.downloads.documents")) {
            String documentId = DocumentsContract.getDocumentId(uri);
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            if (a2.h.a(documentId, "downloads")) {
                return path;
            }
            a2.h.b(documentId);
            Pattern compile = Pattern.compile("^ms[df]:.*");
            a2.h.d(compile, "compile(...)");
            if (compile.matcher(documentId).matches()) {
                return path + "/" + f(context, uri);
            }
            if (!documentId.startsWith("raw:")) {
                return null;
            }
            Pattern compile2 = Pattern.compile(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            a2.h.d(compile2, "compile(...)");
            Matcher matcher = compile2.matcher(documentId);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int i4 = 0;
                do {
                    arrayList.add(documentId.subSequence(i4, matcher.start()).toString());
                    i4 = matcher.end();
                } while (matcher.find());
                arrayList.add(documentId.subSequence(i4, documentId.length()).toString());
                list2 = arrayList;
            } else {
                list2 = E2.a.B(documentId.toString());
            }
            if (!list2.isEmpty()) {
                ListIterator listIterator = list2.listIterator(list2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = P1.e.j0(listIterator.nextIndex() + 1, list2);
                        break;
                    }
                }
            }
            return ((String[]) collection.toArray(new String[0]))[1];
        }
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        a2.h.b(treeDocumentId);
        List f02 = AbstractC0273d.f0(treeDocumentId, new String[]{TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER});
        if (f02.size() > 1) {
            String str3 = (String) f02.get(0);
            String str4 = (String) f02.get(1);
            if ("primary".equalsIgnoreCase(str3)) {
                str = Environment.getExternalStorageDirectory() + "/" + str4;
            } else {
                str = B1.e.k("/storage/", str3, "/", str4);
            }
        } else {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (f02.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            str = externalStorageDirectory + "/" + f02.get(f02.size() - 1);
        }
        String str5 = File.separator;
        a2.h.d(str5, "separator");
        if (l.W(str, str5)) {
            str = AbstractC0273d.Z(str);
        }
        String treeDocumentId2 = DocumentsContract.getTreeDocumentId(uri);
        a2.h.b(treeDocumentId2);
        Pattern compile3 = Pattern.compile(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        a2.h.d(compile3, "compile(...)");
        Matcher matcher2 = compile3.matcher(treeDocumentId2);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int i5 = 0;
            do {
                arrayList2.add(treeDocumentId2.subSequence(i5, matcher2.start()).toString());
                i5 = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(treeDocumentId2.subSequence(i5, treeDocumentId2.length()).toString());
            list = arrayList2;
        } else {
            list = E2.a.B(treeDocumentId2.toString());
        }
        if (!list.isEmpty()) {
            ListIterator listIterator2 = list.listIterator(list.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    collection = P1.e.j0(listIterator2.nextIndex() + 1, list);
                    break;
                }
            }
        }
        String[] strArr = (String[]) collection.toArray(new String[0]);
        if (strArr.length >= 2) {
            str2 = strArr[1];
        } else {
            str2 = File.separator;
            a2.h.d(str2, "separator");
        }
        String str6 = File.separator;
        a2.h.d(str6, "separator");
        if (l.W(str2, str6)) {
            str2 = AbstractC0273d.Z(str2);
        }
        if (str2.length() <= 0 || str.endsWith(str2)) {
            return str;
        }
        if (str2.startsWith(str6)) {
            return str.concat(str2);
        }
        return str + str6 + str2;
    }

    public static ArrayList h(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return new ArrayList(E2.a.B("*/*"));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i3));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type '" + arrayList.get(i3) + "' is unsupported and will not be filtered.");
                return new ArrayList(E2.a.B("*/*"));
            }
            arrayList2.add(mimeTypeFromExtension);
            if (a2.h.a(arrayList.get(i3), "csv")) {
                arrayList2.add("text/csv");
            }
        }
        Log.d("FilePickerUtils", "Custom file types are " + arrayList + ". The mime types were detected as " + arrayList2 + ".");
        return arrayList2;
    }

    public static void i(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.listFiles() != null && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                listFiles = new File[0];
            }
            for (File file2 : listFiles) {
                i(file2);
            }
        }
        file.delete();
    }

    public static void j(C0329c c0329c, String str, Boolean bool, Boolean bool2, ArrayList arrayList, Integer num, o oVar) {
        Intent intent;
        if (c0329c != null) {
            if (c0329c.f3553l != null) {
                int i3 = C0329c.f3551t;
                oVar.a("already_active", "File picker is already active", null);
                return;
            }
            c0329c.f3553l = oVar;
        }
        if (c0329c != null) {
            c0329c.f3555o = str;
        }
        if (bool != null && c0329c != null) {
            c0329c.f3554m = bool.booleanValue();
        }
        if (bool2 != null && c0329c != null) {
            c0329c.n = bool2.booleanValue();
        }
        if (c0329c != null) {
            c0329c.f3557q = arrayList;
        }
        if (num != null && c0329c != null) {
            c0329c.f3556p = num.intValue();
        }
        if (c0329c != null) {
            Activity activity = c0329c.f3552k;
            String str2 = c0329c.f3555o;
            if (str2 == null) {
                return;
            }
            if (str2.equals("dir")) {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            } else if (a2.h.a(c0329c.f3555o, "image/*")) {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setDataAndType(Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator), c0329c.f3555o);
                intent.setType(c0329c.f3555o);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", c0329c.f3554m);
                intent.putExtra("multi-pick", c0329c.f3554m);
                String str3 = c0329c.f3555o;
                if (str3 != null) {
                    String str4 = AbstractC0273d.Y(str3, ",") ? str3 : null;
                    if (str4 != null) {
                        List f02 = AbstractC0273d.f0(str4, new String[]{","});
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : f02) {
                            if (((String) obj).length() > 0) {
                                arrayList2.add(obj);
                            }
                        }
                        c0329c.f3557q = new ArrayList(arrayList2);
                    }
                }
                ArrayList arrayList3 = c0329c.f3557q;
                if (arrayList3 != null) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", arrayList3);
                }
            } else if (a2.h.a(c0329c.f3555o, "audio/*")) {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType(c0329c.f3555o);
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", c0329c.f3554m);
                intent.putExtra("multi-pick", c0329c.f3554m);
                if (Build.VERSION.SDK_INT >= 26) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", DocumentsContract.buildRootUri("com.android.providers.media.documents", "audio_root"));
                }
            } else if (a2.h.a(c0329c.f3555o, "video/*")) {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType(c0329c.f3555o);
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", c0329c.f3554m);
                intent.putExtra("multi-pick", c0329c.f3554m);
            } else if (a2.h.a(c0329c.f3555o, "media")) {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("*/*");
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*", "audio/*"});
                intent.addCategory("android.intent.category.OPENABLE");
                a2.h.b(intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", c0329c.f3554m));
            } else {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType(c0329c.f3555o);
                ArrayList arrayList4 = c0329c.f3557q;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", intent.getType());
                } else {
                    ArrayList arrayList5 = c0329c.f3557q;
                    a2.h.b(arrayList5);
                    intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList5.toArray(new String[0]));
                }
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", c0329c.f3554m);
                intent.putExtra("multi-pick", c0329c.f3554m);
            }
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivityForResult(intent, C0329c.f3551t);
            } else {
                Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
                c0329c.c("invalid_format_type", "Can't handle the provided file type.");
            }
        }
    }
}
