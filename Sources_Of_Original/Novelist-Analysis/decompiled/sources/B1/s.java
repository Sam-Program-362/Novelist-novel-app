package B1;

import V.C0079c;
import V.C0085i;
import V.C0088l;
import V.N;
import V.c0;
import V.i0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.util.Log;
import i2.C0205m;
import i2.K;
import i2.W;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.utils.StringUtils;
import p003b0.AbstractComponentCallbacksC0163s;
import p003b0.H;
import p003b0.I;
import p003b0.L;
import p003b0.O;

/* JADX INFO: loaded from: classes.dex */
public final class s implements p036l1.c, C1.m, C1.h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f146m;
    public Object n;

    public /* synthetic */ s(C1.f fVar, String str, Object obj, p057t1.a aVar) {
        this.f145l = fVar;
        this.f144k = str;
        this.f146m = obj;
        this.n = aVar;
    }

    public Bundle A(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f146m;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    @Override // p036l1.c
    public void a(Object obj, String str) {
        this.f144k = "sqlite_error";
        this.f145l = str;
        this.n = obj;
    }

    public void b(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        if (((ArrayList) this.f144k).contains(abstractComponentCallbacksC0163s)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0163s);
        }
        synchronized (((ArrayList) this.f144k)) {
            ((ArrayList) this.f144k).add(abstractComponentCallbacksC0163s);
        }
        abstractComponentCallbacksC0163s.u = true;
    }

    public void c(p022h0.d dVar) {
        if (((LinkedHashSet) this.n).add(dVar)) {
            ((p022h0.e) this.f145l).a(this, dVar, -1);
        }
    }

    public void d(p022h0.i iVar, int i3) {
        if (i3 != 1 && i3 != 0) {
            throw new IllegalArgumentException(e.g("Unsupported priority value: ", i3).toString());
        }
        if (((LinkedHashSet) this.n).add(iVar)) {
            ((p022h0.e) this.f145l).a(this, iVar, i3);
        }
    }

    public SpannableString e() {
        if (((String) this.f144k) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f144k);
        List<io.flutter.view.l> list = (List) this.f146m;
        if (list != null) {
            for (io.flutter.view.l lVar : list) {
                int iA = X.j.a(lVar.f3368c);
                if (iA == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), lVar.f3366a, lVar.f3367b, 0);
                } else if (iA == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.j) lVar).f3365d)), lVar.f3366a, lVar.f3367b, 0);
                }
            }
        }
        String str = (String) this.n;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.n), 0, ((String) this.f144k).length(), 0);
        }
        String str2 = (String) this.f145l;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f145l)), 0, ((String) this.f144k).length(), 0);
        }
        return spannableString;
    }

    public void f(p022h0.d dVar, p022h0.b bVar) {
        p022h0.e eVar = (p022h0.e) this.f145l;
        eVar.getClass();
        if (eVar.f2874g != 0) {
            return;
        }
        p002b.o oVarC = eVar.c(-1);
        eVar.f2873f = oVarC;
        eVar.f2874g = -1;
        eVar.f2875h = dVar;
        if (bVar != null) {
            if (oVarC != null) {
                I i3 = oVarC.f2332d.f2569d;
                if (I.J(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + i3);
                }
                i3.x();
                i3.y(new H(i3), false);
            }
            l2.q qVar = eVar.f2868a;
            p022h0.g gVar = new p022h0.g(bVar);
            qVar.getClass();
            qVar.c(null, gVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object g(T1.c cVar) {
        C0085i c0085i;
        s sVar;
        C0079c c0079c;
        N n = (N) this.n;
        if (cVar instanceof C0085i) {
            c0085i = (C0085i) cVar;
            int i3 = c0085i.f1424q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0085i.f1424q = i3 - Integer.MIN_VALUE;
            } else {
                c0085i = new C0085i(this, cVar);
            }
        } else {
            c0085i = new C0085i(this, cVar);
        }
        Object objF = c0085i.f1422o;
        int i4 = c0085i.f1424q;
        if (i4 == 0) {
            H2.h.E(objF);
            List list = (List) this.f146m;
            S1.a aVar = S1.a.f1260k;
            if (list == null || list.isEmpty()) {
                c0085i.n = this;
                c0085i.f1424q = 1;
                objF = N.f(n, false, c0085i);
                if (objF != aVar) {
                    sVar = this;
                    c0079c = (C0079c) objF;
                }
            } else {
                i0 i0VarG = n.g();
                C0088l c0088l = new C0088l(n, this, null);
                c0085i.n = this;
                c0085i.f1424q = 2;
                objF = i0VarG.b(c0088l, c0085i);
                if (objF != aVar) {
                    sVar = this;
                    c0079c = (C0079c) objF;
                }
            }
            return aVar;
        }
        if (i4 == 1) {
            sVar = c0085i.n;
            H2.h.E(objF);
            c0079c = (C0079c) objF;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = c0085i.n;
            H2.h.E(objF);
            c0079c = (C0079c) objF;
        }
        ((N) sVar.n).f1347r.m(c0079c);
        return O1.g.f1211a;
    }

    public AbstractComponentCallbacksC0163s h(String str) {
        O o2 = (O) ((HashMap) this.f145l).get(str);
        if (o2 != null) {
            return o2.f2419c;
        }
        return null;
    }

    @Override // C1.h
    public void i(C1.g gVar) {
        this.f146m = gVar;
        if (((r2.a) this.n) != null) {
            return;
        }
        r2.a aVar = new r2.a(this);
        this.n = aVar;
        ((ClipboardManager) this.f145l).addPrimaryClipChangedListener(aVar);
    }

    public AbstractComponentCallbacksC0163s j(String str) {
        for (O o2 : ((HashMap) this.f145l).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163sJ = o2.f2419c;
                if (!str.equals(abstractComponentCallbacksC0163sJ.f2542o)) {
                    abstractComponentCallbacksC0163sJ = abstractComponentCallbacksC0163sJ.f2518E.f2371c.j(str);
                }
                if (abstractComponentCallbacksC0163sJ != null) {
                    return abstractComponentCallbacksC0163sJ;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01b2  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // C1.m
    public void k(A.c cVar, o oVar) {
        Uri uriR;
        Context context = (Context) this.f144k;
        ClipboardManager clipboardManager = (ClipboardManager) this.f145l;
        String str = (String) cVar.f6l;
        str.getClass();
        byte b3 = -1;
        switch (str.hashCode()) {
            case -1473678171:
                if (str.equals("copyMultiple")) {
                    b3 = 0;
                }
                break;
            case -1029400035:
                if (str.equals("getContentType")) {
                    b3 = 1;
                }
                break;
            case -542592438:
                if (str.equals("startMonitoring")) {
                    b3 = 2;
                }
                break;
            case -428041151:
                if (str.equals("getDataSize")) {
                    b3 = 3;
                }
                break;
            case -380899862:
                if (str.equals("stopMonitoring")) {
                    b3 = 4;
                }
                break;
            case -33188900:
                if (str.equals("pasteRichText")) {
                    b3 = 5;
                }
                break;
            case 3059573:
                if (str.equals("copy")) {
                    b3 = 6;
                }
                break;
            case 94746189:
                if (str.equals("clear")) {
                    b3 = 7;
                }
                break;
            case 106438291:
                if (str.equals("paste")) {
                    b3 = 8;
                }
                break;
            case 615916222:
                if (str.equals("copyRichText")) {
                    b3 = 9;
                }
                break;
            case 696457572:
                if (str.equals("hasData")) {
                    b3 = 10;
                }
                break;
            case 1485138662:
                if (str.equals("copyImage")) {
                    b3 = 11;
                }
                break;
            case 1629142664:
                if (str.equals("pasteImage")) {
                    b3 = 12;
                }
                break;
        }
        String string = StringUtils.EMPTY;
        switch (b3) {
            case 0:
                Map map = (Map) cVar.i("formats");
                if (map == null || map.isEmpty()) {
                    oVar.a("EMPTY_FORMATS", "At least one format must be provided", null);
                } else {
                    try {
                        if (map.get(MimeTypes.PLAIN_TEXT) != null) {
                            string = map.get(MimeTypes.PLAIN_TEXT).toString();
                        }
                        String string2 = map.get("text/html") != null ? map.get("text/html").toString() : null;
                        List list = map.get("image/png") instanceof List ? (List) map.get("image/png") : null;
                        if (list != null && !list.isEmpty()) {
                            int size = list.size();
                            byte[] bArr = new byte[size];
                            for (int i3 = 0; i3 < list.size(); i3++) {
                                bArr[i3] = ((Integer) list.get(i3)).byteValue();
                            }
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size);
                            if (bitmapDecodeByteArray != null && (uriR = r(bitmapDecodeByteArray)) != null) {
                                ClipData clipDataNewUri = ClipData.newUri(context.getContentResolver(), "image", uriR);
                                if (string != null && !string.isEmpty()) {
                                    clipDataNewUri.addItem(new ClipData.Item(string));
                                }
                                clipboardManager.setPrimaryClip(clipDataNewUri);
                                oVar.d(Boolean.TRUE);
                            }
                        }
                        if (string2 != null && !string2.isEmpty()) {
                            clipboardManager.setPrimaryClip(ClipData.newHtmlText("html", string, string2));
                        } else if (string != null && !string.isEmpty()) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("text", string));
                        }
                        oVar.d(Boolean.TRUE);
                    } catch (Exception e3) {
                        oVar.a("COPY_MULTIPLE_ERROR", e3.getMessage(), null);
                        return;
                    }
                }
                break;
            case 1:
                oVar.d("unknown");
                break;
            case 2:
                if (((r2.a) this.n) == null) {
                    r2.a aVar = new r2.a(this);
                    this.n = aVar;
                    clipboardManager.addPrimaryClipChangedListener(aVar);
                }
                oVar.d(Boolean.TRUE);
                break;
            case 3:
                oVar.d(0);
                break;
            case 4:
                r2.a aVar2 = (r2.a) this.n;
                if (aVar2 != null) {
                    clipboardManager.removePrimaryClipChangedListener(aVar2);
                    this.n = null;
                }
                oVar.d(Boolean.TRUE);
                break;
            case 5:
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    ClipData.Item itemAt = (primaryClip == null || primaryClip.getItemCount() <= 0) ? null : primaryClip.getItemAt(0);
                    if (itemAt != null && itemAt.getText() != null) {
                        string = itemAt.getText().toString();
                    }
                    String htmlText = itemAt != null ? itemAt.getHtmlText() : null;
                    ArrayList arrayListO = o(itemAt);
                    HashMap map2 = new HashMap();
                    map2.put("text", string);
                    map2.put("html", htmlText);
                    map2.put("imageBytes", arrayListO);
                    map2.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                    oVar.d(map2);
                } catch (Exception e4) {
                    oVar.a("PASTE_RICH_ERROR", e4.getMessage(), null);
                    return;
                }
                break;
            case 6:
                String str2 = (String) cVar.i("text");
                if (str2 == null || str2.isEmpty()) {
                    oVar.a("EMPTY_TEXT", "Text cannot be empty", null);
                } else {
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("text", str2));
                        oVar.d(Boolean.TRUE);
                    } catch (Exception e5) {
                        oVar.a("COPY_ERROR", e5.getMessage(), null);
                        return;
                    }
                }
                break;
            case 7:
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        clipboardManager.clearPrimaryClip();
                    } else {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(StringUtils.EMPTY, StringUtils.EMPTY));
                    }
                    oVar.d(Boolean.TRUE);
                } catch (Exception e6) {
                    oVar.a("CLEAR_ERROR", e6.getMessage(), null);
                    return;
                }
                break;
            case 8:
                try {
                    ClipData primaryClip2 = clipboardManager.getPrimaryClip();
                    if (primaryClip2 != null && primaryClip2.getItemCount() > 0) {
                        string = primaryClip2.getItemAt(0).getText().toString();
                    }
                    HashMap map3 = new HashMap();
                    map3.put("text", string);
                    oVar.d(map3);
                } catch (Exception e7) {
                    oVar.a("PASTE_ERROR", e7.getMessage(), null);
                    return;
                }
                break;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                String str3 = (String) cVar.i("text");
                String str4 = (String) cVar.i("html");
                if ((str3 == null || str3.isEmpty()) && (str4 == null || str4.isEmpty())) {
                    oVar.a("EMPTY_CONTENT", "Either text or html must be provided", null);
                } else {
                    if (str4 != null) {
                        try {
                            if (str4.isEmpty()) {
                                if (str3 != null) {
                                    string = str3;
                                }
                                clipboardManager.setPrimaryClip(ClipData.newPlainText("text", string));
                            } else {
                                if (str3 != null) {
                                    string = str3;
                                }
                                clipboardManager.setPrimaryClip(ClipData.newHtmlText("html", string, str4));
                            }
                        } catch (Exception e8) {
                            oVar.a("COPY_RICH_ERROR", e8.getMessage(), null);
                            return;
                        }
                    } else {
                        if (str3 != null) {
                            string = str3;
                        }
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("text", string));
                    }
                    oVar.d(Boolean.TRUE);
                }
                break;
            case 10:
                oVar.d(Boolean.FALSE);
                break;
            case 11:
                List list2 = (List) cVar.i("imageBytes");
                if (list2 == null || list2.isEmpty()) {
                    oVar.a("EMPTY_IMAGE", "Image bytes cannot be empty", null);
                } else {
                    try {
                        int size2 = list2.size();
                        byte[] bArr2 = new byte[size2];
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            bArr2[i4] = ((Integer) list2.get(i4)).byteValue();
                        }
                        Bitmap bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(bArr2, 0, size2);
                        if (bitmapDecodeByteArray2 == null) {
                            oVar.a("INVALID_IMAGE", "Failed to decode image", null);
                        } else {
                            Uri uriR2 = r(bitmapDecodeByteArray2);
                            if (uriR2 == null) {
                                oVar.a("SAVE_ERROR", "Failed to save image to MediaStore", null);
                            } else {
                                clipboardManager.setPrimaryClip(ClipData.newUri(context.getContentResolver(), "image", uriR2));
                                oVar.d(Boolean.TRUE);
                            }
                        }
                    } catch (Exception e9) {
                        oVar.a("COPY_IMAGE_ERROR", "Failed to copy image: " + e9.getMessage(), null);
                        return;
                    }
                }
                break;
            case 12:
                try {
                    ClipData primaryClip3 = clipboardManager.getPrimaryClip();
                    ArrayList arrayListO2 = o((primaryClip3 == null || primaryClip3.getItemCount() <= 0) ? null : primaryClip3.getItemAt(0));
                    HashMap map4 = new HashMap();
                    map4.put("imageBytes", arrayListO2);
                    oVar.d(map4);
                } catch (Exception e10) {
                    oVar.a("PASTE_IMAGE_ERROR", e10.getMessage(), null);
                    return;
                }
                break;
            default:
                oVar.b();
                break;
        }
    }

    public ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f145l).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList m() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f145l).values()) {
            if (o2 != null) {
                arrayList.add(o2.f2419c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List n() {
        ArrayList arrayList;
        if (((ArrayList) this.f144k).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f144k)) {
            arrayList = new ArrayList((ArrayList) this.f144k);
        }
        return arrayList;
    }

    public ArrayList o(ClipData.Item item) {
        InputStream inputStreamOpenInputStream;
        if (item == null || item.getUri() == null) {
            return null;
        }
        try {
            ContentResolver contentResolver = ((Context) this.f144k).getContentResolver();
            String type = contentResolver.getType(item.getUri());
            if (type != null && type.startsWith("image/") && (inputStreamOpenInputStream = contentResolver.openInputStream(item.getUri())) != null) {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                inputStreamOpenInputStream.close();
                if (bitmapDecodeStream == null) {
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapDecodeStream.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                ArrayList arrayList = new ArrayList();
                for (byte b3 : byteArray) {
                    arrayList.add(Integer.valueOf(b3 & ForkServer.ERROR));
                }
                return arrayList;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // C1.h
    public void onCancel() {
        this.f146m = null;
        r2.a aVar = (r2.a) this.n;
        if (aVar != null) {
            ((ClipboardManager) this.f145l).removePrimaryClipChangedListener(aVar);
            this.n = null;
        }
    }

    @Override // p036l1.c
    public void p(Object obj) {
        this.f146m = obj;
    }

    public File q(Context context) {
        ((b) this.f145l).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public Uri r(Bitmap bitmap) {
        Context context = (Context) this.f144k;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", "clipboard_image_" + System.currentTimeMillis() + ".png");
            contentValues.put("mime_type", "image/png");
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                contentValues.put("is_pending", (Integer) 1);
            }
            Uri uriInsert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert != null) {
                try {
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
                    if (outputStreamOpenOutputStream != null) {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
                        outputStreamOpenOutputStream.close();
                        if (i3 >= 29) {
                            contentValues.clear();
                            contentValues.put("is_pending", (Integer) 0);
                            context.getContentResolver().update(uriInsert, contentValues, null, null);
                        }
                        return uriInsert;
                    }
                } catch (Exception unused) {
                    context.getContentResolver().delete(uriInsert, null, null);
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public void s(String str, Object obj, o oVar) {
        ((C1.f) this.f145l).f((String) this.f144k, ((C1.n) this.f146m).f(new A.c(str, obj, 11)), oVar == null ? null : new C1.a(this, oVar, 1));
    }

    public void t(String str, Object... objArr) {
        String str2 = String.format(Locale.US, str, objArr);
        if (((M1.N) this.n) != null) {
            FlutterJNI.lambda$loadLibrary$0(str2);
        }
    }

    public void u(O o2) {
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = o2.f2419c;
        String str = abstractComponentCallbacksC0163s.f2542o;
        HashMap map = (HashMap) this.f145l;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0163s.f2542o, o2);
        if (I.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0163s);
        }
    }

    public void v(O o2) {
        HashMap map = (HashMap) this.f145l;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = o2.f2419c;
        if (abstractComponentCallbacksC0163s.f2525L) {
            ((L) this.n).f(abstractComponentCallbacksC0163s);
        }
        if (map.get(abstractComponentCallbacksC0163s.f2542o) == o2 && ((O) map.put(abstractComponentCallbacksC0163s.f2542o, null)) != null && I.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0163s);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public Object w(T1.c cVar) {
        c0 c0Var;
        s sVar;
        q2.a aVar;
        s sVar2;
        ?? r3;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i3 = c0Var.f1395r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0Var.f1395r = i3 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object obj = c0Var.f1393p;
        ?? r4 = c0Var.f1395r;
        O1.g gVar = O1.g.f1211a;
        S1.a aVar2 = S1.a.f1260k;
        try {
            if (r4 == 0) {
                H2.h.E(obj);
                C0205m c0205m = (C0205m) this.f145l;
                c0205m.getClass();
                if (!(W.f2990k.get(c0205m) instanceof K)) {
                    return gVar;
                }
                q2.c cVar2 = (q2.c) this.f144k;
                c0Var.n = this;
                c0Var.f1392o = cVar2;
                c0Var.f1395r = 1;
                if (cVar2.c(c0Var) != aVar2) {
                    sVar = this;
                    aVar = cVar2;
                }
                return aVar2;
            }
            if (r4 == 1) {
                q2.a aVar3 = c0Var.f1392o;
                sVar = c0Var.n;
                H2.h.E(obj);
                aVar = aVar3;
            } else {
                if (r4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.a aVar4 = c0Var.f1392o;
                sVar2 = c0Var.n;
                H2.h.E(obj);
                r4 = aVar4;
            }
            ((C0205m) sVar2.f145l).F(gVar);
            r3 = r4;
            ((q2.c) r3).e(null);
            return gVar;
            C0205m c0205m2 = (C0205m) sVar.f145l;
            c0205m2.getClass();
            r3 = aVar;
            if (W.f2990k.get(c0205m2) instanceof K) {
                c0Var.n = sVar;
                c0Var.f1392o = aVar;
                c0Var.f1395r = 2;
                if (sVar.g(c0Var) != aVar2) {
                    sVar2 = sVar;
                    r4 = aVar;
                    ((C0205m) sVar2.f145l).F(gVar);
                    r3 = r4;
                }
                return aVar2;
            }
            ((q2.c) r3).e(null);
            return gVar;
        } catch (Throwable th) {
            ((q2.c) r4).e(null);
            throw th;
        }
    }

    public void x(Object obj, C1.c cVar) {
        ((C1.f) this.f145l).f((String) this.f144k, ((C1.l) this.f146m).a(obj), cVar == null ? null : new C1.a(this, cVar, 0));
    }

    public void y(C1.b bVar) {
        String str = (String) this.f144k;
        C1.f fVar = (C1.f) this.f145l;
        p057t1.a aVar = (p057t1.a) this.n;
        if (aVar != null) {
            fVar.c(str, bVar != null ? new A.c(this, bVar, 10, false) : null, aVar);
        } else {
            fVar.b(str, bVar != null ? new A.c(this, bVar, 10, false) : null);
        }
    }

    public void z(C1.m mVar) {
        String str = (String) this.f144k;
        C1.f fVar = (C1.f) this.f145l;
        p057t1.a aVar = (p057t1.a) this.n;
        if (aVar != null) {
            fVar.c(str, mVar != null ? new A.c(this, mVar, 12, false) : null, aVar);
        } else {
            fVar.b(str, mVar != null ? new A.c(this, mVar, 12, false) : null);
        }
    }

    public s(int i3) {
        switch (i3) {
            case 6:
                this.f144k = new ArrayList();
                this.f145l = new HashMap();
                this.f146m = new HashMap();
                break;
            default:
                b bVar = new b(6);
                b bVar2 = new b(5);
                this.f144k = new HashSet();
                this.f145l = bVar;
                this.f146m = bVar2;
                break;
        }
    }

    public s(C1.f fVar, String str) {
        this(fVar, str, C1.r.f180a, null);
    }
}
