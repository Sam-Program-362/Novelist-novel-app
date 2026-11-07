package B1;

import M1.N;
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
import b0.AbstractComponentCallbacksC0171s;
import b0.H;
import b0.I;
import b0.L;
import b0.O;
import h0.AbstractC0261d;
import h0.C0259b;
import h0.C0262e;
import h0.C0264g;
import h0.C0266i;
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
import l1.InterfaceC0419c;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.utils.StringUtils;
import t1.C0473a;

/* loaded from: classes.dex */
public final class s implements InterfaceC0419c, C1.m, C1.h {

    /* renamed from: k, reason: collision with root package name */
    public Object f144k;

    /* renamed from: l, reason: collision with root package name */
    public Object f145l;

    /* renamed from: m, reason: collision with root package name */
    public Object f146m;
    public Object n;

    public /* synthetic */ s(C1.f fVar, String str, Object obj, C0473a c0473a) {
        this.f145l = fVar;
        this.f144k = str;
        this.f146m = obj;
        this.n = c0473a;
    }

    public Bundle A(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f146m;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    @Override // l1.InterfaceC0419c
    public void a(Object obj, String str) {
        this.f144k = "sqlite_error";
        this.f145l = str;
        this.n = obj;
    }

    public void b(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        if (((ArrayList) this.f144k).contains(abstractComponentCallbacksC0171s)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0171s);
        }
        synchronized (((ArrayList) this.f144k)) {
            ((ArrayList) this.f144k).add(abstractComponentCallbacksC0171s);
        }
        abstractComponentCallbacksC0171s.u = true;
    }

    public void c(AbstractC0261d abstractC0261d) {
        if (((LinkedHashSet) this.n).add(abstractC0261d)) {
            ((C0262e) this.f145l).a(this, abstractC0261d, -1);
        }
    }

    public void d(C0266i c0266i, int i3) {
        if (i3 != 1 && i3 != 0) {
            throw new IllegalArgumentException(e.g("Unsupported priority value: ", i3).toString());
        }
        if (((LinkedHashSet) this.n).add(c0266i)) {
            ((C0262e) this.f145l).a(this, c0266i, i3);
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
                int a3 = X.j.a(lVar.f3368c);
                if (a3 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), lVar.f3366a, lVar.f3367b, 0);
                } else if (a3 == 1) {
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

    public void f(AbstractC0261d abstractC0261d, C0259b c0259b) {
        C0262e c0262e = (C0262e) this.f145l;
        c0262e.getClass();
        if (c0262e.f2874g != 0) {
            return;
        }
        b.o c3 = c0262e.c(-1);
        c0262e.f2873f = c3;
        c0262e.f2874g = -1;
        c0262e.f2875h = abstractC0261d;
        if (c0259b != null) {
            if (c3 != null) {
                I i3 = c3.f2332d.f2569d;
                if (I.J(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + i3);
                }
                i3.x();
                i3.y(new H(i3), false);
            }
            l2.q qVar = c0262e.f2868a;
            C0264g c0264g = new C0264g(c0259b);
            qVar.getClass();
            qVar.c(null, c0264g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(T1.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.n
            V.N r0 = (V.N) r0
            boolean r1 = r7 instanceof V.C0085i
            if (r1 == 0) goto L17
            r1 = r7
            V.i r1 = (V.C0085i) r1
            int r2 = r1.f1424q
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f1424q = r2
            goto L1c
        L17:
            V.i r1 = new V.i
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f1422o
            int r2 = r1.f1424q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            B1.s r0 = r1.n
            H2.h.E(r7)
            goto L64
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            B1.s r0 = r1.n
            H2.h.E(r7)
            goto L74
        L3c:
            H2.h.E(r7)
            java.lang.Object r7 = r6.f146m
            java.util.List r7 = (java.util.List) r7
            S1.a r2 = S1.a.f1260k
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            V.i0 r7 = r0.g()
            V.l r4 = new V.l
            r5 = 0
            r4.<init>(r0, r6, r5)
            r1.n = r6
            r1.f1424q = r3
            java.lang.Object r7 = r7.b(r4, r1)
            if (r7 != r2) goto L63
            goto L72
        L63:
            r0 = r6
        L64:
            V.c r7 = (V.C0079c) r7
            goto L76
        L67:
            r1.n = r6
            r1.f1424q = r4
            r7 = 0
            java.lang.Object r7 = V.N.f(r0, r7, r1)
            if (r7 != r2) goto L73
        L72:
            return r2
        L73:
            r0 = r6
        L74:
            V.c r7 = (V.C0079c) r7
        L76:
            java.lang.Object r0 = r0.n
            V.N r0 = (V.N) r0
            B1.a r0 = r0.f1347r
            r0.m(r7)
            O1.g r7 = O1.g.f1211a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.s.g(T1.c):java.lang.Object");
    }

    public AbstractComponentCallbacksC0171s h(String str) {
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

    public AbstractComponentCallbacksC0171s j(String str) {
        for (O o2 : ((HashMap) this.f145l).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = o2.f2419c;
                if (!str.equals(abstractComponentCallbacksC0171s.f2542o)) {
                    abstractComponentCallbacksC0171s = abstractComponentCallbacksC0171s.f2518E.f2371c.j(str);
                }
                if (abstractComponentCallbacksC0171s != null) {
                    return abstractComponentCallbacksC0171s;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // C1.m
    public void k(A.c cVar, o oVar) {
        Uri r3;
        Context context = (Context) this.f144k;
        ClipboardManager clipboardManager = (ClipboardManager) this.f145l;
        String str = (String) cVar.f6l;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1473678171:
                if (str.equals("copyMultiple")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1029400035:
                if (str.equals("getContentType")) {
                    c3 = 1;
                    break;
                }
                break;
            case -542592438:
                if (str.equals("startMonitoring")) {
                    c3 = 2;
                    break;
                }
                break;
            case -428041151:
                if (str.equals("getDataSize")) {
                    c3 = 3;
                    break;
                }
                break;
            case -380899862:
                if (str.equals("stopMonitoring")) {
                    c3 = 4;
                    break;
                }
                break;
            case -33188900:
                if (str.equals("pasteRichText")) {
                    c3 = 5;
                    break;
                }
                break;
            case 3059573:
                if (str.equals("copy")) {
                    c3 = 6;
                    break;
                }
                break;
            case 94746189:
                if (str.equals("clear")) {
                    c3 = 7;
                    break;
                }
                break;
            case 106438291:
                if (str.equals("paste")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 615916222:
                if (str.equals("copyRichText")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 696457572:
                if (str.equals("hasData")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 1485138662:
                if (str.equals("copyImage")) {
                    c3 = 11;
                    break;
                }
                break;
            case 1629142664:
                if (str.equals("pasteImage")) {
                    c3 = '\f';
                    break;
                }
                break;
        }
        String str2 = StringUtils.EMPTY;
        switch (c3) {
            case 0:
                Map map = (Map) cVar.i("formats");
                if (map == null || map.isEmpty()) {
                    oVar.a("EMPTY_FORMATS", "At least one format must be provided", null);
                    break;
                } else {
                    try {
                        if (map.get(MimeTypes.PLAIN_TEXT) != null) {
                            str2 = map.get(MimeTypes.PLAIN_TEXT).toString();
                        }
                        String obj = map.get("text/html") != null ? map.get("text/html").toString() : null;
                        List list = map.get("image/png") instanceof List ? (List) map.get("image/png") : null;
                        if (list != null && !list.isEmpty()) {
                            int size = list.size();
                            byte[] bArr = new byte[size];
                            for (int i3 = 0; i3 < list.size(); i3++) {
                                bArr[i3] = ((Integer) list.get(i3)).byteValue();
                            }
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size);
                            if (decodeByteArray != null && (r3 = r(decodeByteArray)) != null) {
                                ClipData newUri = ClipData.newUri(context.getContentResolver(), "image", r3);
                                if (str2 != null && !str2.isEmpty()) {
                                    newUri.addItem(new ClipData.Item(str2));
                                }
                                clipboardManager.setPrimaryClip(newUri);
                                oVar.d(Boolean.TRUE);
                                break;
                            }
                        }
                        if (obj != null && !obj.isEmpty()) {
                            clipboardManager.setPrimaryClip(ClipData.newHtmlText("html", str2, obj));
                        } else if (str2 != null && !str2.isEmpty()) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("text", str2));
                        }
                        oVar.d(Boolean.TRUE);
                        break;
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
                        str2 = itemAt.getText().toString();
                    }
                    String htmlText = itemAt != null ? itemAt.getHtmlText() : null;
                    ArrayList o2 = o(itemAt);
                    HashMap hashMap = new HashMap();
                    hashMap.put("text", str2);
                    hashMap.put("html", htmlText);
                    hashMap.put("imageBytes", o2);
                    hashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                    oVar.d(hashMap);
                    break;
                } catch (Exception e4) {
                    oVar.a("PASTE_RICH_ERROR", e4.getMessage(), null);
                    return;
                }
                break;
            case 6:
                String str3 = (String) cVar.i("text");
                if (str3 == null || str3.isEmpty()) {
                    oVar.a("EMPTY_TEXT", "Text cannot be empty", null);
                    break;
                } else {
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("text", str3));
                        oVar.d(Boolean.TRUE);
                        break;
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
                    break;
                } catch (Exception e6) {
                    oVar.a("CLEAR_ERROR", e6.getMessage(), null);
                    return;
                }
            case '\b':
                try {
                    ClipData primaryClip2 = clipboardManager.getPrimaryClip();
                    if (primaryClip2 != null && primaryClip2.getItemCount() > 0) {
                        str2 = primaryClip2.getItemAt(0).getText().toString();
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("text", str2);
                    oVar.d(hashMap2);
                    break;
                } catch (Exception e7) {
                    oVar.a("PASTE_ERROR", e7.getMessage(), null);
                    return;
                }
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                String str4 = (String) cVar.i("text");
                String str5 = (String) cVar.i("html");
                if ((str4 == null || str4.isEmpty()) && (str5 == null || str5.isEmpty())) {
                    oVar.a("EMPTY_CONTENT", "Either text or html must be provided", null);
                    break;
                } else {
                    if (str5 != null) {
                        try {
                            if (!str5.isEmpty()) {
                                if (str4 != null) {
                                    str2 = str4;
                                }
                                clipboardManager.setPrimaryClip(ClipData.newHtmlText("html", str2, str5));
                                oVar.d(Boolean.TRUE);
                                break;
                            }
                        } catch (Exception e8) {
                            oVar.a("COPY_RICH_ERROR", e8.getMessage(), null);
                            return;
                        }
                    }
                    if (str4 != null) {
                        str2 = str4;
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("text", str2));
                    oVar.d(Boolean.TRUE);
                }
                break;
            case '\n':
                oVar.d(Boolean.FALSE);
                break;
            case 11:
                List list2 = (List) cVar.i("imageBytes");
                if (list2 == null || list2.isEmpty()) {
                    oVar.a("EMPTY_IMAGE", "Image bytes cannot be empty", null);
                    break;
                } else {
                    try {
                        int size2 = list2.size();
                        byte[] bArr2 = new byte[size2];
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            bArr2[i4] = ((Integer) list2.get(i4)).byteValue();
                        }
                        Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr2, 0, size2);
                        if (decodeByteArray2 == null) {
                            oVar.a("INVALID_IMAGE", "Failed to decode image", null);
                            break;
                        } else {
                            Uri r4 = r(decodeByteArray2);
                            if (r4 == null) {
                                oVar.a("SAVE_ERROR", "Failed to save image to MediaStore", null);
                                break;
                            } else {
                                clipboardManager.setPrimaryClip(ClipData.newUri(context.getContentResolver(), "image", r4));
                                oVar.d(Boolean.TRUE);
                                break;
                            }
                        }
                    } catch (Exception e9) {
                        oVar.a("COPY_IMAGE_ERROR", "Failed to copy image: " + e9.getMessage(), null);
                        return;
                    }
                }
            case '\f':
                try {
                    ClipData primaryClip3 = clipboardManager.getPrimaryClip();
                    ArrayList o3 = o((primaryClip3 == null || primaryClip3.getItemCount() <= 0) ? null : primaryClip3.getItemAt(0));
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("imageBytes", o3);
                    oVar.d(hashMap3);
                    break;
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
        InputStream openInputStream;
        if (item == null || item.getUri() == null) {
            return null;
        }
        try {
            ContentResolver contentResolver = ((Context) this.f144k).getContentResolver();
            String type = contentResolver.getType(item.getUri());
            if (type != null && type.startsWith("image/") && (openInputStream = contentResolver.openInputStream(item.getUri())) != null) {
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                openInputStream.close();
                if (decodeStream == null) {
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                decodeStream.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
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

    @Override // l1.InterfaceC0419c
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
            Uri insert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (insert != null) {
                try {
                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
                    if (openOutputStream != null) {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, openOutputStream);
                        openOutputStream.close();
                        if (i3 >= 29) {
                            contentValues.clear();
                            contentValues.put("is_pending", (Integer) 0);
                            context.getContentResolver().update(insert, contentValues, null, null);
                        }
                        return insert;
                    }
                } catch (Exception unused) {
                    context.getContentResolver().delete(insert, null, null);
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
        String format = String.format(Locale.US, str, objArr);
        if (((N) this.n) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    public void u(O o2) {
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = o2.f2419c;
        String str = abstractComponentCallbacksC0171s.f2542o;
        HashMap hashMap = (HashMap) this.f145l;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0171s.f2542o, o2);
        if (I.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0171s);
        }
    }

    public void v(O o2) {
        HashMap hashMap = (HashMap) this.f145l;
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = o2.f2419c;
        if (abstractComponentCallbacksC0171s.f2525L) {
            ((L) this.n).f(abstractComponentCallbacksC0171s);
        }
        if (hashMap.get(abstractComponentCallbacksC0171s.f2542o) == o2 && ((O) hashMap.put(abstractComponentCallbacksC0171s.f2542o, null)) != null && I.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0171s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0090, B:21:0x006b, B:23:0x0082), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [q2.a] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(T1.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof V.c0
            if (r0 == 0) goto L13
            r0 = r9
            V.c0 r0 = (V.c0) r0
            int r1 = r0.f1395r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1395r = r1
            goto L18
        L13:
            V.c0 r0 = new V.c0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f1393p
            int r1 = r0.f1395r
            r2 = 2
            r3 = 1
            O1.g r4 = O1.g.f1211a
            r5 = 0
            S1.a r6 = S1.a.f1260k
            if (r1 == 0) goto L43
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            q2.a r1 = r0.f1392o
            B1.s r0 = r0.n
            H2.h.E(r9)     // Catch: java.lang.Throwable -> L31
            goto L90
        L31:
            r9 = move-exception
            goto L98
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            q2.a r1 = r0.f1392o
            B1.s r3 = r0.n
            H2.h.E(r9)
            goto L6b
        L43:
            H2.h.E(r9)
            java.lang.Object r9 = r8.f145l
            i2.m r9 = (i2.C0296m) r9
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = i2.W.f2990k
            java.lang.Object r9 = r1.get(r9)
            boolean r9 = r9 instanceof i2.K
            if (r9 != 0) goto L58
            return r4
        L58:
            java.lang.Object r9 = r8.f144k
            q2.c r9 = (q2.c) r9
            r0.n = r8
            r0.f1392o = r9
            r0.f1395r = r3
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r6) goto L69
            goto L8e
        L69:
            r3 = r8
            r1 = r9
        L6b:
            java.lang.Object r9 = r3.f145l     // Catch: java.lang.Throwable -> L31
            i2.m r9 = (i2.C0296m) r9     // Catch: java.lang.Throwable -> L31
            r9.getClass()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = i2.W.f2990k     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r7.get(r9)     // Catch: java.lang.Throwable -> L31
            boolean r9 = r9 instanceof i2.K     // Catch: java.lang.Throwable -> L31
            if (r9 != 0) goto L82
        L7c:
            q2.c r1 = (q2.c) r1
            r1.e(r5)
            return r4
        L82:
            r0.n = r3     // Catch: java.lang.Throwable -> L31
            r0.f1392o = r1     // Catch: java.lang.Throwable -> L31
            r0.f1395r = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r3.g(r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != r6) goto L8f
        L8e:
            return r6
        L8f:
            r0 = r3
        L90:
            java.lang.Object r9 = r0.f145l     // Catch: java.lang.Throwable -> L31
            i2.m r9 = (i2.C0296m) r9     // Catch: java.lang.Throwable -> L31
            r9.F(r4)     // Catch: java.lang.Throwable -> L31
            goto L7c
        L98:
            q2.c r1 = (q2.c) r1
            r1.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.s.w(T1.c):java.lang.Object");
    }

    public void x(Object obj, C1.c cVar) {
        ((C1.f) this.f145l).f((String) this.f144k, ((C1.l) this.f146m).a(obj), cVar == null ? null : new C1.a(this, cVar, 0));
    }

    public void y(C1.b bVar) {
        String str = (String) this.f144k;
        C1.f fVar = (C1.f) this.f145l;
        C0473a c0473a = (C0473a) this.n;
        if (c0473a != null) {
            fVar.c(str, bVar != null ? new A.c(this, bVar, 10, false) : null, c0473a);
        } else {
            fVar.b(str, bVar != null ? new A.c(this, bVar, 10, false) : null);
        }
    }

    public void z(C1.m mVar) {
        String str = (String) this.f144k;
        C1.f fVar = (C1.f) this.f145l;
        C0473a c0473a = (C0473a) this.n;
        if (c0473a != null) {
            fVar.c(str, mVar != null ? new A.c(this, mVar, 12, false) : null, c0473a);
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
