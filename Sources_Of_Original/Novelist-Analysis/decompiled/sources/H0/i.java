package H0;

import B1.v;
import C1.m;
import D.A;
import D.C0013n;
import D.G;
import D.h0;
import Y0.n;
import Y0.s;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import io.flutter.plugin.platform.ViewOnSystemUiVisibilityChangeListenerC0222e;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003b0.AbstractComponentCallbacksC0163s;
import p003b0.C0165u;
import p003b0.E;
import p003b0.I;
import p004b1.Q;
import p028j.o;
import p028j.t;
import p031k.C0231i;
import p031k.N;
import p035l0.L;
import p035l0.u;
import p052r1.AbstractActivityC0262b;
import p052r1.B;
import p052r1.C;

/* JADX INFO: loaded from: classes.dex */
public final class i implements m, l2.d, L0.i, p007d.c, N, o, L, p036l1.c, B, p053s0.m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static i f441m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f443l;

    public /* synthetic */ i(Object obj, int i3) {
        this.f442k = i3;
        this.f443l = obj;
    }

    public static boolean t(int i3) {
        return (48 <= i3 && i3 <= 57) || i3 == 35 || i3 == 42;
    }

    private final void v(A.c cVar, B1.o oVar) {
        A.c cVar2 = (A.c) this.f443l;
        if (((F1.a) cVar2.f7m) == null) {
            return;
        }
        String str = (String) cVar.f6l;
        Object obj = cVar.f7m;
        str.getClass();
        if (!str.equals("ProcessText.processTextAction")) {
            if (!str.equals("ProcessText.queryTextActions")) {
                oVar.b();
                return;
            }
            try {
                oVar.d(((F1.a) cVar2.f7m).c());
                return;
            } catch (IllegalStateException e3) {
                oVar.a("error", e3.getMessage(), null);
                return;
            }
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            ((F1.a) cVar2.f7m).b((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), oVar);
        } catch (IllegalStateException e4) {
            oVar.a("error", e4.getMessage(), null);
        }
    }

    public static synchronized i w(Context context) {
        i iVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (i.class) {
            iVar = f441m;
            if (iVar == null) {
                iVar = new i(applicationContext);
                f441m = iVar;
            }
        }
        return iVar;
        return iVar;
    }

    @Override // p036l1.c
    public void a(Object obj, String str) {
        ((B1.o) this.f443l).a("sqlite_error", str, obj);
    }

    @Override // L0.i
    public void accept(Object obj, Object obj2) {
        switch (this.f442k) {
            case 13:
                p019g1.e eVar = (p019g1.e) obj2;
                O0.a aVar = (O0.a) ((O0.c) obj).q();
                M0.j jVar = (M0.j) this.f443l;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(aVar.f1580c);
                int i3 = Z0.a.f1676a;
                if (jVar == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    jVar.writeToParcel(parcelObtain, 0);
                }
                try {
                    aVar.f1579b.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    eVar.b(null);
                    return;
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            case 14:
            default:
                Y0.b bVar = (Y0.b) this.f443l;
                Y0.d dVar = new Y0.d(bVar, (p019g1.e) obj2, 0);
                s sVar = (s) ((Y0.e) obj).q();
                K0.f fVarA = Y0.f.a();
                String str = bVar.f1583k;
                Parcel parcelD = sVar.d();
                int i4 = n.f1605a;
                parcelD.writeStrongBinder(dVar);
                parcelD.writeString(str);
                n.b(parcelD, fVarA);
                sVar.e(parcelD, 2);
                return;
            case 15:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.f443l;
                X0.f fVar = new X0.f((p019g1.e) obj2, 1);
                X0.d dVar2 = (X0.d) ((X0.e) obj).q();
                K0.f fVar2 = new K0.f(new K0.g(-1, -1, 0, true), false);
                fVar2.f638m = false;
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i5 = p006c1.a.f2658a;
                parcelObtain2.writeStrongBinder(fVar);
                p006c1.a.b(parcelObtain2, getCredentialRequest);
                p006c1.a.b(parcelObtain2, fVar2);
                ((X0.b) dVar2).d(parcelObtain2, 1);
                return;
        }
    }

    @Override // p028j.o
    public void b(p028j.j jVar, boolean z3) {
        if (jVar instanceof t) {
            ((t) jVar).f3502v.j().c(false);
        }
        o oVar = ((C0231i) this.f443l).f3703o;
        if (oVar != null) {
            oVar.b(jVar, z3);
        }
    }

    @Override // p031k.N
    public void c(p028j.j jVar, MenuItem menuItem) {
        ((p028j.g) this.f443l).f3418p.removeCallbacksAndMessages(jVar);
    }

    @Override // p053s0.m
    public String[] d() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f443l).getSupportedFeatures();
    }

    @Override // p007d.c
    public void e(Object obj) {
        p007d.b bVar = (p007d.b) obj;
        I i3 = (I) this.f443l;
        E e3 = (E) i3.f2358E.pollFirst();
        if (e3 == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = e3.f2349k;
        int i4 = e3.f2350l;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163sJ = i3.f2371c.j(str);
        if (abstractComponentCallbacksC0163sJ != null) {
            abstractComponentCallbacksC0163sJ.p(i4, bVar.f2764k, bVar.f2765l);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // p035l0.L
    public int f() {
        p035l0.t tVar = (p035l0.t) this.f443l;
        return tVar.f4022f - tVar.t();
    }

    @Override // p052r1.B
    public void g() {
        C c3 = (C) this.f443l;
        c3.f4336a.setAlpha(0.0f);
        io.flutter.embedding.engine.renderer.k kVar = c3.f4337b;
        if (kVar != null) {
            kVar.g(c3.f4339d);
        }
        c3.f4337b = null;
    }

    @Override // p053s0.m
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) E2.a.d(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f443l).getStatics());
    }

    @Override // p053s0.m
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) E2.a.d(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f443l).getWebkitToCompatConverter());
    }

    @Override // l2.d
    public Object h(l2.e eVar, R1.c cVar) {
        switch (this.f442k) {
            case 12:
                Object objH = ((l2.d) this.f443l).h(new K1.B(eVar, 0), cVar);
                return objH == S1.a.f1260k ? objH : O1.g.f1211a;
            default:
                Object objH2 = ((Q) this.f443l).h(new K1.B(eVar, 1), cVar);
                return objH2 == S1.a.f1260k ? objH2 : O1.g.f1211a;
        }
    }

    @Override // p035l0.L
    public int i(View view) {
        return (view.getLeft() - ((u) view.getLayoutParams()).f4024a.left) - ((ViewGroup.MarginLayoutParams) ((u) view.getLayoutParams())).leftMargin;
    }

    @Override // p028j.o
    public boolean j(p028j.j jVar) {
        C0231i c0231i = (C0231i) this.f443l;
        if (jVar == c0231i.f3702m) {
            return false;
        }
        ((t) jVar).f3503w.getClass();
        c0231i.getClass();
        o oVar = c0231i.f3703o;
        if (oVar != null) {
            return oVar.j(jVar);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:198:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // C1.m
    public void k(A.c cVar, B1.o oVar) {
        B1.h hVarA;
        ClipDescription primaryClipDescription;
        Bundle bundle;
        byte b3 = 11;
        boolean zHasMimeType = false;
        zHasMimeType = false;
        switch (this.f442k) {
            case 3:
                B1.a aVar = (B1.a) this.f443l;
                if (((i) aVar.f80l) != null) {
                    String str = (String) cVar.f6l;
                    try {
                        if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                            try {
                                ((i) aVar.f80l).s((String) ((HashMap) cVar.f7m).get("kind"));
                                oVar.d(Boolean.TRUE);
                            } catch (Exception e3) {
                                oVar.a("error", "Error when setting cursors: " + e3.getMessage(), null);
                            }
                        }
                    } catch (Exception e4) {
                        oVar.a("error", "Unhandled error: " + e4.getMessage(), null);
                        return;
                    }
                    break;
                }
                break;
            case 4:
                A.c cVar2 = (A.c) this.f443l;
                if (((io.flutter.plugin.platform.o) cVar2.f7m) != null) {
                    String str2 = (String) cVar.f6l;
                    Object obj = cVar.f7m;
                    try {
                        switch (str2.hashCode()) {
                            case -1501580720:
                                if (str2.equals("SystemNavigator.setFrameworkHandlesBack")) {
                                    b3 = 9;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -931781241:
                                if (str2.equals("Share.invoke")) {
                                    b3 = 14;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -766342101:
                                if (str2.equals("SystemNavigator.pop")) {
                                    b3 = 10;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -720677196:
                                if (str2.equals("Clipboard.setData")) {
                                    b3 = 12;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -577225884:
                                if (str2.equals("SystemChrome.setSystemUIChangeListener")) {
                                    b3 = 6;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -548468504:
                                if (str2.equals("SystemChrome.setApplicationSwitcherDescription")) {
                                    b3 = 3;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -247230243:
                                if (str2.equals("HapticFeedback.vibrate")) {
                                    b3 = 1;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case -215273374:
                                if (str2.equals("SystemSound.play")) {
                                    b3 = 0;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 241845679:
                                if (str2.equals("SystemChrome.restoreSystemUIOverlays")) {
                                    b3 = 7;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 875995648:
                                if (str2.equals("Clipboard.hasStrings")) {
                                    b3 = 13;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1128339786:
                                if (str2.equals("SystemChrome.setEnabledSystemUIMode")) {
                                    b3 = 5;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1390477857:
                                if (str2.equals("SystemChrome.setSystemUIOverlayStyle")) {
                                    b3 = 8;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 1514180520:
                                if (!str2.equals("Clipboard.getData")) {
                                    b3 = -1;
                                }
                                break;
                            case 1674312266:
                                if (str2.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                    b3 = 4;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            case 2119655719:
                                if (str2.equals("SystemChrome.setPreferredOrientations")) {
                                    b3 = 2;
                                } else {
                                    b3 = -1;
                                }
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        switch (b3) {
                            case 0:
                                try {
                                    int iD = B1.e.d((String) obj);
                                    io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l;
                                    if (iD == 1) {
                                        fVar.f3176a.getWindow().getDecorView().playSoundEffect(0);
                                    }
                                    oVar.d(null);
                                } catch (NoSuchFieldException e5) {
                                    oVar.a("error", e5.getMessage(), null);
                                    return;
                                }
                                break;
                            case 1:
                                try {
                                    ((io.flutter.plugin.platform.o) cVar2.f7m).k(B1.e.c((String) obj));
                                    oVar.d(null);
                                } catch (NoSuchFieldException e6) {
                                    oVar.a("error", e6.getMessage(), null);
                                    return;
                                }
                                break;
                            case 2:
                                try {
                                    ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l).f3176a.setRequestedOrientation(A.c.c(cVar2, (JSONArray) obj));
                                    oVar.d(null);
                                } catch (NoSuchFieldException | JSONException e7) {
                                    oVar.a("error", e7.getMessage(), null);
                                    return;
                                }
                                break;
                            case 3:
                                try {
                                    JSONObject jSONObject = (JSONObject) obj;
                                    int i3 = jSONObject.getInt("primaryColor");
                                    if (i3 != 0) {
                                        i3 |= -16777216;
                                    }
                                    String string = jSONObject.getString("label");
                                    Activity activity = ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l).f3176a;
                                    if (Build.VERSION.SDK_INT < 28) {
                                        activity.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i3));
                                    } else {
                                        activity.setTaskDescription(B.b.c(string, i3));
                                    }
                                    oVar.d(null);
                                } catch (JSONException e8) {
                                    oVar.a("error", e8.getMessage(), null);
                                    return;
                                }
                                break;
                            case 4:
                                try {
                                    ((io.flutter.plugin.platform.o) cVar2.f7m).g(A.c.d(cVar2, (JSONArray) obj));
                                    oVar.d(null);
                                } catch (NoSuchFieldException | JSONException e9) {
                                    oVar.a("error", e9.getMessage(), null);
                                    return;
                                }
                                break;
                            case 5:
                                try {
                                    ((io.flutter.plugin.platform.o) cVar2.f7m).h(A.c.f(cVar2, (String) obj));
                                    oVar.d(null);
                                } catch (NoSuchFieldException | JSONException e10) {
                                    oVar.a("error", e10.getMessage(), null);
                                    return;
                                }
                                break;
                            case 6:
                                io.flutter.plugin.platform.f fVar2 = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l;
                                View decorView = fVar2.f3176a.getWindow().getDecorView();
                                decorView.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC0222e(fVar2, decorView));
                                oVar.d(null);
                                break;
                            case 7:
                                ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l).b();
                                oVar.d(null);
                                break;
                            case 8:
                                try {
                                    ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l).a(A.c.g(cVar2, (JSONObject) obj));
                                    oVar.d(null);
                                } catch (NoSuchFieldException | JSONException e11) {
                                    oVar.a("error", e11.getMessage(), null);
                                    return;
                                }
                                break;
                            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                p052r1.d dVar = ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l).f3178c;
                                if (dVar != null) {
                                    ((AbstractActivityC0262b) dVar).j(zBooleanValue);
                                }
                                oVar.d(null);
                                break;
                            case 10:
                                Activity activity2 = ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l).f3176a;
                                if (activity2 instanceof p002b.u) {
                                    ((p002b.u) activity2).b().a().a();
                                } else {
                                    activity2.finish();
                                }
                                oVar.d(null);
                                break;
                            case 11:
                                String str3 = (String) obj;
                                if (str3 != null) {
                                    try {
                                        hVarA = B1.h.a(str3);
                                    } catch (NoSuchFieldException unused) {
                                        oVar.a("error", "No such clipboard content format: ".concat(str3), null);
                                        hVarA = null;
                                    }
                                } else {
                                    hVarA = null;
                                }
                                CharSequence charSequenceC = ((io.flutter.plugin.platform.o) cVar2.f7m).c(hVarA);
                                if (charSequenceC != null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("text", charSequenceC);
                                    oVar.d(jSONObject2);
                                } else {
                                    oVar.d(null);
                                }
                                break;
                            case 12:
                                ((ClipboardManager) ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l).f3176a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                                oVar.d(null);
                                break;
                            case 13:
                                ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l).f3176a.getSystemService("clipboard");
                                if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, zHasMimeType);
                                oVar.d(jSONObject3);
                                break;
                            case 14:
                                io.flutter.plugin.platform.f fVar3 = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) cVar2.f7m).f3201l;
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.setType(MimeTypes.PLAIN_TEXT);
                                intent.putExtra("android.intent.extra.TEXT", (String) obj);
                                fVar3.f3176a.startActivity(Intent.createChooser(intent, null));
                                oVar.d(null);
                                break;
                            default:
                                oVar.b();
                                break;
                        }
                    } catch (JSONException e12) {
                        oVar.a("error", "JSON error: " + e12.getMessage(), null);
                        return;
                    }
                    oVar.a("error", "JSON error: " + e12.getMessage(), null);
                }
                break;
            case 5:
                v(cVar, oVar);
                break;
            case 6:
            default:
                A.c cVar3 = (A.c) this.f443l;
                if (((B1.g) cVar3.f7m) != null) {
                    String str4 = (String) cVar.f6l;
                    Object obj2 = cVar.f7m;
                    str4.getClass();
                    switch (str4) {
                        case "TextInput.setPlatformViewClient":
                            try {
                                JSONObject jSONObject4 = (JSONObject) obj2;
                                int i4 = jSONObject4.getInt("platformViewId");
                                boolean zOptBoolean = jSONObject4.optBoolean("usesVirtualDisplay", false);
                                io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) ((B1.g) cVar3.f7m).f90l;
                                View view = jVar.f3136a;
                                if (zOptBoolean) {
                                    view.requestFocus();
                                    jVar.f3140e = new C0013n(3, i4);
                                    jVar.f3137b.restartInput(view);
                                    jVar.f3144i = false;
                                } else {
                                    jVar.f3140e = new C0013n(4, i4);
                                    jVar.f3145j = null;
                                }
                                oVar.d(null);
                                break;
                            } catch (JSONException e13) {
                                oVar.a("error", e13.getMessage(), null);
                            }
                            break;
                        case "TextInput.setEditingState":
                            try {
                                ((B1.g) cVar3.f7m).p(v.a((JSONObject) obj2));
                                oVar.d(null);
                                break;
                            } catch (JSONException e14) {
                                oVar.a("error", e14.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.setClient":
                            try {
                                JSONArray jSONArray = (JSONArray) obj2;
                                ((B1.g) cVar3.f7m).n(jSONArray.getInt(0), B1.t.a(jSONArray.getJSONObject(1)));
                                oVar.d(null);
                                break;
                            } catch (NoSuchFieldException | JSONException e15) {
                                oVar.a("error", e15.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.hide":
                            io.flutter.plugin.editing.j jVar2 = (io.flutter.plugin.editing.j) ((B1.g) cVar3.f7m).f90l;
                            if (jVar2.f3140e.f252b == 4) {
                                jVar2.d();
                            } else {
                                View view2 = jVar2.f3136a;
                                jVar2.d();
                                jVar2.f3137b.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                            }
                            oVar.d(null);
                            break;
                        case "TextInput.show":
                            io.flutter.plugin.editing.j jVar3 = (io.flutter.plugin.editing.j) ((B1.g) cVar3.f7m).f90l;
                            InputMethodManager inputMethodManager = jVar3.f3137b;
                            View view3 = jVar3.f3136a;
                            B1.t tVar = jVar3.f3141f;
                            if (tVar == null || tVar.f153g.f160a != 11) {
                                view3.requestFocus();
                                inputMethodManager.showSoftInput(view3, 0);
                            } else {
                                jVar3.d();
                                inputMethodManager.hideSoftInputFromWindow(view3.getApplicationWindowToken(), 0);
                            }
                            oVar.d(null);
                            break;
                        case "TextInput.sendAppPrivateCommand":
                            try {
                                JSONObject jSONObject5 = (JSONObject) obj2;
                                String string2 = jSONObject5.getString("action");
                                String string3 = jSONObject5.getString("data");
                                if (string3 == null || string3.isEmpty()) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("data", string3);
                                }
                                io.flutter.plugin.editing.j jVar4 = (io.flutter.plugin.editing.j) ((B1.g) cVar3.f7m).f90l;
                                jVar4.f3137b.sendAppPrivateCommand(jVar4.f3136a, string2, bundle);
                                oVar.d(null);
                                break;
                            } catch (JSONException e16) {
                                oVar.a("error", e16.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.setEditableSizeAndTransform":
                            try {
                                JSONObject jSONObject6 = (JSONObject) obj2;
                                double d3 = jSONObject6.getDouble("width");
                                double d4 = jSONObject6.getDouble("height");
                                JSONArray jSONArray2 = jSONObject6.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int i5 = 0; i5 < 16; i5++) {
                                    dArr[i5] = jSONArray2.getDouble(i5);
                                }
                                ((B1.g) cVar3.f7m).o(d3, d4, dArr);
                                oVar.d(null);
                                break;
                            } catch (JSONException e17) {
                                oVar.a("error", e17.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.finishAutofillContext":
                            B1.g gVar = (B1.g) cVar3.f7m;
                            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = ((io.flutter.plugin.editing.j) gVar.f90l).f3138c;
                                if (autofillManager != null) {
                                    if (zBooleanValue2) {
                                        autofillManager.commit();
                                    } else {
                                        autofillManager.cancel();
                                    }
                                }
                            } else {
                                gVar.getClass();
                            }
                            oVar.d(null);
                            break;
                        case "TextInput.clearClient":
                            io.flutter.plugin.editing.j jVar5 = (io.flutter.plugin.editing.j) ((B1.g) cVar3.f7m).f90l;
                            View view4 = jVar5.f3136a;
                            if (jVar5.f3140e.f252b != 3) {
                                jVar5.f3143h.e(jVar5);
                                jVar5.d();
                                jVar5.f3141f = null;
                                jVar5.e(null);
                                jVar5.f3140e = new C0013n(1, 0);
                                jVar5.f3148m = null;
                                Field field = G.f187a;
                                h0 h0VarA = A.a(view4);
                                if (h0VarA != null && !h0VarA.f241a.s(8)) {
                                    jVar5.f3137b.restartInput(view4);
                                }
                            }
                            oVar.d(null);
                            break;
                        case "TextInput.requestAutofill":
                            io.flutter.plugin.editing.j jVar6 = (io.flutter.plugin.editing.j) ((B1.g) cVar3.f7m).f90l;
                            View view5 = jVar6.f3136a;
                            if (Build.VERSION.SDK_INT >= 26 && jVar6.f3138c != null && jVar6.f3142g != null) {
                                String str5 = (String) jVar6.f3141f.f156j.f144k;
                                int[] iArr = new int[2];
                                view5.getLocationOnScreen(iArr);
                                Rect rect = new Rect(jVar6.f3148m);
                                rect.offset(iArr[0], iArr[1]);
                                jVar6.f3138c.notifyViewEntered(view5, str5.hashCode(), rect);
                            }
                            oVar.d(null);
                            break;
                        default:
                            oVar.b();
                            break;
                    }
                }
                break;
            case 7:
                B1.a aVar2 = (B1.a) this.f443l;
                if (((io.flutter.plugin.editing.g) aVar2.f80l) != null) {
                    String str6 = (String) cVar.f6l;
                    Object obj3 = cVar.f7m;
                    str6.getClass();
                    if (!str6.equals("SpellCheck.initiateSpellCheck")) {
                        oVar.b();
                    } else {
                        try {
                            ArrayList arrayList = (ArrayList) obj3;
                            ((io.flutter.plugin.editing.g) aVar2.f80l).a((String) arrayList.get(0), (String) arrayList.get(1), oVar);
                        } catch (IllegalStateException e18) {
                            oVar.a("error", e18.getMessage(), null);
                            return;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // p031k.N
    public void l(p028j.j jVar, p028j.k kVar) {
        p028j.g gVar = (p028j.g) this.f443l;
        Handler handler = gVar.f3418p;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f3420r;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (jVar == ((p028j.f) arrayList.get(i3)).f3403b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i4 = i3 + 1;
        handler.postAtTime(new p028j.e(this, i4 < arrayList.size() ? (p028j.f) arrayList.get(i4) : null, kVar, jVar, 0), jVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // p052r1.B
    public void m() {
        C c3 = (C) this.f443l;
        io.flutter.embedding.engine.renderer.k kVar = c3.f4337b;
        if (kVar != null) {
            kVar.a(c3.f4339d);
        }
    }

    @Override // p035l0.L
    public View n(int i3) {
        return ((p035l0.t) this.f443l).o(i3);
    }

    @Override // p035l0.L
    public int o() {
        return ((p035l0.t) this.f443l).s();
    }

    @Override // p036l1.c
    public void p(Object obj) {
        ((B1.o) this.f443l).d(obj);
    }

    @Override // p035l0.L
    public int q(View view) {
        return view.getRight() + ((u) view.getLayoutParams()).f4024a.right + ((ViewGroup.MarginLayoutParams) ((u) view.getLayoutParams())).rightMargin;
    }

    @Override // p052r1.B
    public void r(io.flutter.embedding.engine.renderer.k kVar) {
        C c3 = (C) this.f443l;
        io.flutter.embedding.engine.renderer.k kVar2 = c3.f4337b;
        if (kVar2 != null) {
            kVar2.g(c3.f4339d);
        }
        c3.f4337b = kVar;
    }

    public void s(String str) {
        E1.b bVar = (E1.b) ((A.c) this.f443l).f6l;
        Integer numValueOf = Integer.valueOf(PipesIterator.DEFAULT_QUEUE_SIZE);
        if (A.c.n == null) {
            E1.a aVar = new E1.a();
            aVar.put(MimeTypesReaderMetKeys.ALIAS_TAG, 1010);
            aVar.put("allScroll", 1013);
            aVar.put("basic", numValueOf);
            aVar.put("cell", 1006);
            aVar.put("click", 1002);
            aVar.put("contextMenu", 1001);
            aVar.put("copy", 1011);
            aVar.put("forbidden", 1012);
            aVar.put("grab", 1020);
            aVar.put("grabbing", 1021);
            aVar.put("help", 1003);
            aVar.put("move", 1013);
            aVar.put("none", 0);
            aVar.put("noDrop", 1012);
            aVar.put("precise", 1007);
            aVar.put("text", 1008);
            aVar.put("resizeColumn", 1014);
            aVar.put("resizeDown", 1015);
            aVar.put("resizeUpLeft", 1016);
            aVar.put("resizeDownRight", 1017);
            aVar.put("resizeLeft", 1014);
            aVar.put("resizeLeftRight", 1014);
            aVar.put("resizeRight", 1014);
            aVar.put("resizeRow", 1015);
            aVar.put("resizeUp", 1015);
            aVar.put("resizeUpDown", 1015);
            aVar.put("resizeUpLeft", 1017);
            aVar.put("resizeUpRight", 1016);
            aVar.put("resizeUpLeftDownRight", 1017);
            aVar.put("resizeUpRightDownLeft", 1016);
            aVar.put("verticalText", 1009);
            aVar.put("wait", 1004);
            aVar.put("zoomIn", 1018);
            aVar.put("zoomOut", 1019);
            A.c.n = aVar;
        }
        bVar.setPointerIcon(PointerIcon.getSystemIcon(((p052r1.n) bVar).getContext(), ((Integer) A.c.n.getOrDefault(str, numValueOf)).intValue()));
    }

    public void u() {
        ((C0165u) this.f443l).f2555p.P();
    }

    public synchronized void x() {
        b bVar = (b) this.f443l;
        ReentrantLock reentrantLock = bVar.f422a;
        reentrantLock.lock();
        try {
            bVar.f423b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public i(Context context) {
        String strD;
        this.f442k = 0;
        b bVarA = b.a(context);
        this.f443l = bVarA;
        bVarA.b();
        String strD2 = bVarA.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(strD);
        } catch (JSONException unused) {
        }
    }

    public i() {
        this.f442k = 25;
        this.f443l = new LinkedHashMap(0, 0.75f, true);
    }

    public i(C1.f fVar) {
        this.f442k = 2;
        this.f443l = new B1.s(fVar, "flutter/keyevent", C1.j.f175a, null);
    }

    public i(p057t1.c cVar) {
        this.f442k = 6;
        new B1.s(cVar, "flutter/scribe", C1.k.f176a, null).z(new B1.g(this, 2));
    }
}
