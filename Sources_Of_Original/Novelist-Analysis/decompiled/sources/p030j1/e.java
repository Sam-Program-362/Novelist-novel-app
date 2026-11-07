package p030j1;

import A.c;
import A0.j;
import B1.g;
import B1.o;
import B1.s;
import C1.f;
import C1.m;
import a2.h;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.AbstractC0140n;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.tika.Tika;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypes;
import p024h2.d;
import p031k.u0;
import p067y1.b;
import p070z1.a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements m, b, a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p070z1.b f3561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f3562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Application f3563m;
    public p067y1.a n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC0140n f3564o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f3565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Activity f3566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f3567r;

    @Override // C1.m
    public final void k(c cVar, o oVar) {
        String strDetect;
        Context applicationContext;
        boolean z3;
        h.e(cVar, "call");
        Object objValueOf = null;
        if (this.f3566q == null) {
            oVar.a("no_activity", "file picker plugin requires a foreground activity", null);
            return;
        }
        o oVar2 = new o(oVar);
        Object obj = cVar.f7m;
        HashMap map = obj instanceof HashMap ? (HashMap) obj : null;
        String str = (String) cVar.f6l;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1349088399) {
                if (iHashCode != 3522941) {
                    if (iHashCode == 94746189 && str.equals("clear")) {
                        Activity activity = this.f3566q;
                        if (activity != null && (applicationContext = activity.getApplicationContext()) != null) {
                            try {
                                h.i(new File(applicationContext.getCacheDir().toString() + "/file_picker/"));
                                z3 = true;
                            } catch (Exception e3) {
                                Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e3);
                                z3 = false;
                            }
                            objValueOf = Boolean.valueOf(z3);
                        }
                        oVar2.d(objValueOf);
                        return;
                    }
                } else if (str.equals("save")) {
                    Object obj2 = map != null ? map.get("fileType") : null;
                    h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                    String strC = h.c((String) obj2);
                    String str2 = (String) (map != null ? map.get("initialDirectory") : null);
                    byte[] bArr = (byte[]) (map != null ? map.get("bytes") : null);
                    String strValueOf = String.valueOf(map != null ? map.get("fileName") : null);
                    if (strValueOf.length() > 0 && !d.Y(strValueOf, ".")) {
                        String strDetect2 = new Tika().detect(bArr);
                        h.b(strDetect2);
                        strValueOf = strValueOf + "." + d.g0(strDetect2, "/");
                    }
                    c cVar2 = this.f3562l;
                    if (cVar2 != null) {
                        Activity activity2 = cVar2.f3552k;
                        if (cVar2.f3553l != null) {
                            int i3 = c.f3551t;
                            oVar2.a("already_active", "File picker is already active", null);
                            return;
                        }
                        cVar2.f3553l = oVar2;
                        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        if (strValueOf != null && strValueOf.length() != 0) {
                            intent.putExtra("android.intent.extra.TITLE", strValueOf);
                        }
                        cVar2.f3559s = bArr;
                        if (!"dir".equals(strC)) {
                            try {
                                Tika tika = new Tika();
                                if (strValueOf == null || strValueOf.length() == 0) {
                                    strDetect = tika.detect(bArr);
                                } else {
                                    Detector detector = tika.getDetector();
                                    TikaInputStream tikaInputStream = TikaInputStream.get(bArr);
                                    Metadata metadata = new Metadata();
                                    metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, strValueOf);
                                    strDetect = detector.detect(tikaInputStream, metadata).toString();
                                }
                                if (h.a(strDetect, MimeTypes.PLAIN_TEXT)) {
                                    strDetect = "*/*";
                                } else {
                                    h.b(strDetect);
                                }
                                intent.setType(strDetect);
                            } catch (Throwable th) {
                                intent.setType("*/*");
                                Log.e("FilePickerDelegate", "Failed to detect mime type. " + th);
                            }
                        }
                        if (str2 != null && str2.length() != 0 && Build.VERSION.SDK_INT >= 26) {
                            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str2));
                        }
                        if (intent.resolveActivity(activity2.getPackageManager()) != null) {
                            activity2.startActivityForResult(intent, c.u);
                            return;
                        } else {
                            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
                            cVar2.c("invalid_format_type", "Can't handle the provided file type.");
                            return;
                        }
                    }
                    return;
                }
            } else if (str.equals("custom")) {
                ArrayList arrayListH = h.h((ArrayList) (map != null ? map.get("allowedExtensions") : null));
                c cVar3 = this.f3562l;
                if (cVar3 != null) {
                    h.j(cVar3, h.c(str), (Boolean) (map != null ? map.get("allowMultipleSelection") : null), (Boolean) (map != null ? map.get("withData") : null), arrayListH, (Integer) (map != null ? map.get("compressionQuality") : null), oVar2);
                    return;
                }
                return;
            }
        }
        h.b(str);
        String strC2 = h.c(str);
        if (strC2 == null) {
            oVar2.b();
            return;
        }
        c cVar4 = this.f3562l;
        if (cVar4 != null) {
            h.j(cVar4, strC2, (Boolean) (map != null ? map.get("allowMultipleSelection") : null), (Boolean) (map != null ? map.get("withData") : null), h.h((ArrayList) (map != null ? map.get("allowedExtensions") : null)), (Integer) (map != null ? map.get("compressionQuality") : null), oVar2);
        }
    }

    @Override // p070z1.a
    public final void onAttachedToActivity(p070z1.b bVar) {
        h.e(bVar, "binding");
        this.f3561k = bVar;
        p067y1.a aVar = this.n;
        if (aVar != null) {
            f fVar = aVar.f4730c;
            h.d(fVar, "getBinaryMessenger(...)");
            Context context = aVar.f4728a;
            h.c(context, "null cannot be cast to non-null type android.app.Application");
            p070z1.b bVar2 = this.f3561k;
            h.b(bVar2);
            Activity activity = (Activity) ((u0) bVar2).f3794a;
            h.d(activity, "getActivity(...)");
            p070z1.b bVar3 = this.f3561k;
            h.b(bVar3);
            this.f3566q = activity;
            this.f3563m = (Application) context;
            this.f3562l = new c(activity);
            s sVar = new s(fVar, "miguelruivo.flutter.plugins.filepicker");
            this.f3567r = sVar;
            sVar.z(this);
            c cVar = this.f3562l;
            if (cVar != null) {
                new j(fVar, "miguelruivo.flutter.plugins.filepickerevent").L(new g(cVar, 14));
                this.f3565p = new d(activity);
                u0 u0Var = (u0) bVar3;
                u0Var.a(cVar);
                AbstractC0140n lifecycle = ((HiddenLifecycleReference) u0Var.f3795b).getLifecycle();
                this.f3564o = lifecycle;
                d dVar = this.f3565p;
                if (dVar == null || lifecycle == null) {
                    return;
                }
                lifecycle.a(dVar);
            }
        }
    }

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        h.e(aVar, "binding");
        this.n = aVar;
    }

    @Override // p070z1.a
    public final void onDetachedFromActivity() {
        p070z1.b bVar;
        c cVar = this.f3562l;
        if (cVar != null && (bVar = this.f3561k) != null) {
            ((HashSet) ((u0) bVar).f3797d).remove(cVar);
        }
        this.f3561k = null;
        d dVar = this.f3565p;
        if (dVar != null) {
            AbstractC0140n abstractC0140n = this.f3564o;
            if (abstractC0140n != null) {
                abstractC0140n.b(dVar);
            }
            Application application = this.f3563m;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(dVar);
            }
        }
        this.f3564o = null;
        c cVar2 = this.f3562l;
        if (cVar2 != null) {
            cVar2.f3558r = null;
        }
        this.f3562l = null;
        s sVar = this.f3567r;
        if (sVar != null) {
            sVar.z(null);
        }
        this.f3567r = null;
        this.f3563m = null;
    }

    @Override // p070z1.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        h.e(aVar, "binding");
        this.n = null;
    }

    @Override // p070z1.a
    public final void onReattachedToActivityForConfigChanges(p070z1.b bVar) {
        h.e(bVar, "binding");
        onAttachedToActivity(bVar);
    }
}
