package p030j1;

import B1.e;
import B1.o;
import P1.m;
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
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
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
import p000a.a;
import p024h2.d;
import p024h2.l;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[Catch: IOException -> 0x0117, TryCatch #0 {IOException -> 0x0117, blocks: (B:43:0x010d, B:45:0x0113, B:49:0x011c, B:51:0x0121), top: B:90:0x010d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0121 A[Catch: IOException -> 0x0117, TRY_LEAVE, TryCatch #0 {IOException -> 0x0117, blocks: (B:43:0x010d, B:45:0x0113, B:49:0x011c, B:51:0x0121), top: B:90:0x010d }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0147 A[Catch: IOException -> 0x014b, TryCatch #6 {IOException -> 0x014b, blocks: (B:57:0x0141, B:59:0x0147, B:63:0x0150, B:65:0x0155), top: B:93:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0150 A[Catch: IOException -> 0x014b, TryCatch #6 {IOException -> 0x014b, blocks: (B:57:0x0141, B:59:0x0147, B:63:0x0150, B:65:0x0155), top: B:93:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0155 A[Catch: IOException -> 0x014b, TRY_LEAVE, TryCatch #6 {IOException -> 0x014b, blocks: (B:57:0x0141, B:59:0x0147, B:63:0x0150, B:65:0x0155), top: B:93:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final void a(Activity activity, Uri uri, boolean z3, ArrayList arrayList) throws Throwable {
        Throwable th;
        InputStream inputStream;
        Exception exc;
        FileOutputStream fileOutputStream;
        FileDescriptor fd;
        a2.h.e(activity, "context");
        a2.h.e(uri, "uri");
        String strF = f(activity, uri);
        String str = activity.getCacheDir().getAbsolutePath() + "/file_picker/" + System.currentTimeMillis() + "/" + (strF == null ? "unamed" : strF);
        File file = new File(str);
        String canonicalPath = new File(e.j(activity.getCacheDir().getAbsolutePath(), "/file_picker/")).getCanonicalPath();
        String canonicalPath2 = file.getCanonicalPath();
        a2.h.d(canonicalPath2, "getCanonicalPath(...)");
        a2.h.b(canonicalPath);
        if (!canonicalPath2.startsWith(canonicalPath)) {
            throw new SecurityException("Path traversal detected. Escaping the intended cache directory is not allowed.");
        }
        FileOutputStream fileOutputStream2 = null;
        bArr = null;
        byte[] bArr = null;
        fileOutputStream2 = null;
        aVar = null;
        aVar = null;
        a aVar = null;
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        byte[] bArr2 = new byte[8192];
                        while (true) {
                            a2.h.b(inputStreamOpenInputStream);
                            int i3 = inputStreamOpenInputStream.read(bArr2);
                            if (i3 < 0) {
                                break;
                            } else {
                                bufferedOutputStream.write(bArr2, 0, i3);
                            }
                        }
                        bufferedOutputStream.flush();
                        try {
                            FileDescriptor fd2 = fileOutputStream.getFD();
                            if (fd2 != null) {
                                fd2.sync();
                            }
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                        } catch (IOException e3) {
                            Log.e("FilePickerUtils", "Failed to close file streams: " + e3.getMessage(), e3);
                        }
                    } catch (Exception e4) {
                        inputStream = inputStreamOpenInputStream;
                        exc = e4;
                        try {
                            Log.e("FilePickerUtils", "Failed to retrieve and cache file: " + exc.getMessage(), exc);
                            if (fileOutputStream != null) {
                                try {
                                    FileDescriptor fd3 = fileOutputStream.getFD();
                                    if (fd3 != null) {
                                        fd3.sync();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                } catch (IOException e5) {
                                    Log.e("FilePickerUtils", "Failed to close file streams: " + e5.getMessage(), e5);
                                }
                            } else {
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream2 = fileOutputStream;
                            if (fileOutputStream2 != null) {
                                try {
                                    fd = fileOutputStream2.getFD();
                                    if (fd != null) {
                                        fd.sync();
                                    }
                                } catch (IOException e6) {
                                    Log.e("FilePickerUtils", "Failed to close file streams: " + e6.getMessage(), e6);
                                    throw th;
                                }
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            if (inputStream == null) {
                                throw th;
                            }
                            inputStream.close();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        inputStream = inputStreamOpenInputStream;
                        th = th3;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            fd = fileOutputStream2.getFD();
                            if (fd != null) {
                                fd.sync();
                            }
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        if (inputStream == null) {
                            throw th;
                        }
                        inputStream.close();
                        throw th;
                    }
                } catch (Exception e7) {
                    inputStream = inputStreamOpenInputStream;
                    exc = e7;
                    fileOutputStream = null;
                } catch (Throwable th4) {
                    inputStream = inputStreamOpenInputStream;
                    th = th4;
                    if (fileOutputStream2 != null) {
                        fd = fileOutputStream2.getFD();
                        if (fd != null) {
                            fd.sync();
                        }
                    }
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    inputStream.close();
                    throw th;
                }
            } catch (Exception e8) {
                exc = e8;
                inputStream = null;
                fileOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
            }
        }
        if (z3) {
            try {
                int length = (int) file.length();
                byte[] bArr3 = new byte[length];
                try {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        bufferedInputStream.read(bArr3, 0, length);
                        bufferedInputStream.close();
                    } catch (IOException e9) {
                        Log.e("FilePickerUtils", "Failed to close file streams: " + e9.getMessage(), null);
                    }
                } catch (FileNotFoundException e10) {
                    Log.e("FilePickerUtils", "File not found: " + e10.getMessage(), null);
                }
                bArr = bArr3;
            } catch (Exception e11) {
                Log.e("FilePickerUtils", "Failed to load bytes into memory with error " + e11 + ". Probably the file is too big to fit device memory. Bytes won't be added to the file this time.");
            }
        }
        aVar = new a(str, strF, uri, file.length(), bArr);
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public static final Uri b(Activity activity, Uri uri, int i3) throws IllegalAccessException, InvocationTargetException {
        if (i3 > 0) {
            Context applicationContext = activity.getApplicationContext();
            a2.h.d(applicationContext, "getApplicationContext(...)");
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(applicationContext.getContentResolver().getType(uri));
            if (extensionFromMimeType != null && (extensionFromMimeType.contentEquals("jpg") || extensionFromMimeType.contentEquals("jpeg") || extensionFromMimeType.contentEquals("png") || extensionFromMimeType.contentEquals("webp") || extensionFromMimeType.contentEquals("heic") || extensionFromMimeType.contentEquals("heif"))) {
                Context applicationContext2 = activity.getApplicationContext();
                a2.h.d(applicationContext2, "getApplicationContext(...)");
                try {
                    InputStream inputStreamOpenInputStream = applicationContext2.getContentResolver().openInputStream(uri);
                    try {
                        Bitmap.CompressFormat compressFormatE = e(applicationContext2, uri);
                        File fileD = d(applicationContext2, compressFormatE);
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                        FileOutputStream fileOutputStream = new FileOutputStream(fileD);
                        bitmapDecodeStream.compress(compressFormatE, i3, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Uri uriFromFile = Uri.fromFile(fileD);
                        a2.h.d(uriFromFile, "fromFile(...)");
                        a.m(inputStreamOpenInputStream, null);
                        return uriFromFile;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            a.m(inputStreamOpenInputStream, th);
                            throw th2;
                        }
                    }
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
        return uri;
    }

    public static final String c(String str) {
        switch (str) {
            case "custom":
                return "*/*";
            case "any":
                return "*/*";
            case "dir":
                return "dir";
            case "audio":
                return "audio/*";
            case "image":
                return "image/*";
            case "media":
                return "media";
            case "video":
                return "video/*";
            default:
                return null;
        }
    }

    public static File d(Context context, Bitmap.CompressFormat compressFormat) throws IOException {
        String str;
        String strB = p055t.a.b("IMAGE_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()), "_");
        File cacheDir = context.getCacheDir();
        int i3 = f.f3568a[compressFormat.ordinal()];
        if (i3 != 1) {
            str = i3 != 2 ? "jpeg" : "webp";
        } else {
            str = "png";
        }
        File fileCreateTempFile = File.createTempFile(strB, ".".concat(str), cacheDir);
        a2.h.d(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static Bitmap.CompressFormat e(Context context, Uri uri) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        a2.h.b(extensionFromMimeType);
        Locale locale = Locale.getDefault();
        a2.h.d(locale, "getDefault(...)");
        String upperCase = extensionFromMimeType.toUpperCase(locale);
        a2.h.d(upperCase, "toUpperCase(...)");
        if (upperCase.equals("PNG")) {
            return Bitmap.CompressFormat.PNG;
        }
        return upperCase.equals("WEBP") ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    public static final String f(Context context, Uri uri) {
        Exception exc;
        Uri uri2;
        String string;
        a2.h.e(uri, "uri");
        a2.h.e(context, "context");
        String str = null;
        try {
            if (a2.h.a(uri.getScheme(), "content")) {
                uri2 = uri;
                Cursor cursorQuery = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                        } else {
                            string = null;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            a.m(cursorQuery, th);
                            throw th2;
                        }
                    }
                } else {
                    string = null;
                }
                try {
                    a.m(cursorQuery, null);
                } catch (Exception e3) {
                    exc = e3;
                    str = string;
                    Log.e("FilePickerUtils", "Failed to handle file name: " + exc);
                    return str;
                }
            } else {
                uri2 = uri;
                string = null;
            }
            if (string != null) {
                return string;
            }
            String path = uri2.getPath();
            if (path != null) {
                return d.h0(path, '/', path);
            }
            return null;
        } catch (Exception e4) {
            exc = e4;
            Log.e("FilePickerUtils", "Failed to handle file name: " + exc);
            return str;
        }
    }

    public static final String g(Context context, Uri uri) {
        String strZ;
        List listB;
        String strZ2;
        List listB2;
        a2.h.e(context, "context");
        int i3 = Build.VERSION.SDK_INT;
        Collection collectionJ0 = m.f1219k;
        if (i3 < 30 && a2.h.a(uri.getAuthority(), "com.android.providers.downloads.documents")) {
            String documentId = DocumentsContract.getDocumentId(uri);
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            if (a2.h.a(documentId, "downloads")) {
                return path;
            }
            a2.h.b(documentId);
            Pattern patternCompile = Pattern.compile("^ms[df]:.*");
            a2.h.d(patternCompile, "compile(...)");
            if (patternCompile.matcher(documentId).matches()) {
                return path + "/" + f(context, uri);
            }
            if (!documentId.startsWith("raw:")) {
                return null;
            }
            Pattern patternCompile2 = Pattern.compile(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            a2.h.d(patternCompile2, "compile(...)");
            Matcher matcher = patternCompile2.matcher(documentId);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(documentId.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(documentId.subSequence(iEnd, documentId.length()).toString());
                listB2 = arrayList;
            } else {
                listB2 = E2.a.B(documentId.toString());
            }
            if (!listB2.isEmpty()) {
                ListIterator listIterator = listB2.listIterator(listB2.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionJ0 = P1.e.j0(listIterator.nextIndex() + 1, listB2);
                        break;
                    }
                }
            }
            return ((String[]) collectionJ0.toArray(new String[0]))[1];
        }
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        a2.h.b(treeDocumentId);
        List listF0 = d.f0(treeDocumentId, new String[]{TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER});
        if (listF0.size() > 1) {
            String str = (String) listF0.get(0);
            String str2 = (String) listF0.get(1);
            if ("primary".equalsIgnoreCase(str)) {
                strZ = Environment.getExternalStorageDirectory() + "/" + str2;
            } else {
                strZ = e.k("/storage/", str, "/", str2);
            }
        } else {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (listF0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            strZ = externalStorageDirectory + "/" + listF0.get(listF0.size() - 1);
        }
        String str3 = File.separator;
        a2.h.d(str3, "separator");
        if (l.W(strZ, str3)) {
            strZ = d.Z(strZ);
        }
        String treeDocumentId2 = DocumentsContract.getTreeDocumentId(uri);
        a2.h.b(treeDocumentId2);
        Pattern patternCompile3 = Pattern.compile(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        a2.h.d(patternCompile3, "compile(...)");
        Matcher matcher2 = patternCompile3.matcher(treeDocumentId2);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd2 = 0;
            do {
                arrayList2.add(treeDocumentId2.subSequence(iEnd2, matcher2.start()).toString());
                iEnd2 = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(treeDocumentId2.subSequence(iEnd2, treeDocumentId2.length()).toString());
            listB = arrayList2;
        } else {
            listB = E2.a.B(treeDocumentId2.toString());
        }
        if (!listB.isEmpty()) {
            ListIterator listIterator2 = listB.listIterator(listB.size());
            while (listIterator2.hasPrevious()) {
                if (((String) listIterator2.previous()).length() != 0) {
                    collectionJ0 = P1.e.j0(listIterator2.nextIndex() + 1, listB);
                    break;
                }
            }
        }
        String[] strArr = (String[]) collectionJ0.toArray(new String[0]);
        if (strArr.length >= 2) {
            strZ2 = strArr[1];
        } else {
            strZ2 = File.separator;
            a2.h.d(strZ2, "separator");
        }
        String str4 = File.separator;
        a2.h.d(str4, "separator");
        if (l.W(strZ2, str4)) {
            strZ2 = d.Z(strZ2);
        }
        if (strZ2.length() <= 0 || strZ.endsWith(strZ2)) {
            return strZ;
        }
        if (strZ2.startsWith(str4)) {
            return strZ.concat(strZ2);
        }
        return strZ + str4 + strZ2;
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
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            for (File file2 : fileArrListFiles) {
                i(file2);
            }
        }
        file.delete();
    }

    public static void j(c cVar, String str, Boolean bool, Boolean bool2, ArrayList arrayList, Integer num, o oVar) {
        Intent intent;
        if (cVar != null) {
            if (cVar.f3553l != null) {
                int i3 = c.f3551t;
                oVar.a("already_active", "File picker is already active", null);
                return;
            }
            cVar.f3553l = oVar;
        }
        if (cVar != null) {
            cVar.f3555o = str;
        }
        if (bool != null && cVar != null) {
            cVar.f3554m = bool.booleanValue();
        }
        if (bool2 != null && cVar != null) {
            cVar.n = bool2.booleanValue();
        }
        if (cVar != null) {
            cVar.f3557q = arrayList;
        }
        if (num != null && cVar != null) {
            cVar.f3556p = num.intValue();
        }
        if (cVar != null) {
            Activity activity = cVar.f3552k;
            String str2 = cVar.f3555o;
            if (str2 == null) {
                return;
            }
            if (str2.equals("dir")) {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            } else if (a2.h.a(cVar.f3555o, "image/*")) {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setDataAndType(Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator), cVar.f3555o);
                intent.setType(cVar.f3555o);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", cVar.f3554m);
                intent.putExtra("multi-pick", cVar.f3554m);
                String str3 = cVar.f3555o;
                if (str3 != null) {
                    String str4 = d.Y(str3, ",") ? str3 : null;
                    if (str4 != null) {
                        List listF0 = d.f0(str4, new String[]{","});
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : listF0) {
                            if (((String) obj).length() > 0) {
                                arrayList2.add(obj);
                            }
                        }
                        cVar.f3557q = new ArrayList(arrayList2);
                    }
                }
                ArrayList arrayList3 = cVar.f3557q;
                if (arrayList3 != null) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", arrayList3);
                }
            } else if (a2.h.a(cVar.f3555o, "audio/*")) {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType(cVar.f3555o);
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", cVar.f3554m);
                intent.putExtra("multi-pick", cVar.f3554m);
                if (Build.VERSION.SDK_INT >= 26) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", DocumentsContract.buildRootUri("com.android.providers.media.documents", "audio_root"));
                }
            } else if (a2.h.a(cVar.f3555o, "video/*")) {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType(cVar.f3555o);
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", cVar.f3554m);
                intent.putExtra("multi-pick", cVar.f3554m);
            } else if (a2.h.a(cVar.f3555o, "media")) {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType("*/*");
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*", "audio/*"});
                intent.addCategory("android.intent.category.OPENABLE");
                a2.h.b(intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", cVar.f3554m));
            } else {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType(cVar.f3555o);
                ArrayList arrayList4 = cVar.f3557q;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", intent.getType());
                } else {
                    ArrayList arrayList5 = cVar.f3557q;
                    a2.h.b(arrayList5);
                    intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList5.toArray(new String[0]));
                }
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", cVar.f3554m);
                intent.putExtra("multi-pick", cVar.f3554m);
            }
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivityForResult(intent, c.f3551t);
            } else {
                Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
                cVar.c("invalid_format_type", "Can't handle the provided file type.");
            }
        }
    }
}
