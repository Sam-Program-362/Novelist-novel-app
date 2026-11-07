package A;

import D.C0002c;
import I1.x;
import Y0.r;
import Y0.s;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.animation.Animation;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.tika.fork.ContentHandlerProxy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003b0.AbstractComponentCallbacksC0163s;
import p003b0.I;
import p052r1.u;

/* JADX INFO: loaded from: classes.dex */
public final class c implements C1.m, C1.c, C1.d, H.d, p019g1.b, L0.i {
    public static E1.a n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f6l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f7m;

    public /* synthetic */ c(int i3, boolean z3) {
        this.f5k = i3;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0081 A[RETURN] */
    public static int c(c cVar, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        int i3;
        String str;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            String string = jSONArray.getString(i6);
            int[] iArrB = X.j.b(4);
            int length = iArrB.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    throw new NoSuchFieldException(p055t.a.a("No such DeviceOrientation: ", string));
                }
                i3 = iArrB[i7];
                if (i3 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i3 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i3 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i3 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    break;
                }
                i7++;
            }
            int iA = X.j.a(i3);
            if (iA == 0) {
                i4 |= 1;
            } else if (iA == 1) {
                i4 |= 4;
            } else if (iA == 2) {
                i4 |= 2;
            } else if (iA == 3) {
                i4 |= 8;
            }
            if (i5 == 0) {
                i5 = i4;
            }
        }
        if (i4 == 0) {
            return -1;
        }
        switch (i4) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
            case 12:
            case 13:
            case 14:
                if (i5 == 2) {
                    return 0;
                }
                if (i5 != 4) {
                    if (i5 != 8) {
                        return 1;
                    }
                    return 8;
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    public static ArrayList d(c cVar, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        B1.j jVar;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String string = jSONArray.getString(i3);
            B1.j[] jVarArrValues = B1.j.values();
            int length = jVarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    throw new NoSuchFieldException(p055t.a.a("No such SystemUiOverlay: ", string));
                }
                jVar = jVarArrValues[i4];
                if (jVar.f102k.equals(string)) {
                    break;
                }
                i4++;
            }
            int iOrdinal = jVar.ordinal();
            if (iOrdinal == 0) {
                arrayList.add(B1.j.TOP_OVERLAYS);
            } else if (iOrdinal == 1) {
                arrayList.add(B1.j.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public static int f(c cVar, String str) throws NoSuchFieldException {
        String str2;
        for (int i3 : X.j.b(4)) {
            if (i3 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i3 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i3 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i3 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int iA = X.j.a(i3);
                if (iA == 0) {
                    return 1;
                }
                if (iA != 1) {
                    return iA != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(p055t.a.a("No such SystemUiMode: ", str));
    }

    public static B1.i g(c cVar, JSONObject jSONObject) {
        return new B1.i(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? B1.e.b(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : B1.e.b(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap j(String str, int i3, int i4, int i5, int i6) {
        HashMap map = new HashMap();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i3));
        map.put("selectionExtent", Integer.valueOf(i4));
        map.put("composingBase", Integer.valueOf(i5));
        map.put("composingExtent", Integer.valueOf(i6));
        return map;
    }

    public void A(boolean z3, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f6l)) {
            map = new HashMap((Map) this.f6l);
        }
        synchronized (((Map) this.f7m)) {
            map2 = new HashMap((Map) this.f7m);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).N(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((p019g1.e) entry2.getKey()).c(new K0.e(status));
            }
        }
    }

    @Override // p019g1.b
    public void a(p019g1.i iVar) {
        ((Map) ((c) this.f7m).f7m).remove((p019g1.e) this.f6l);
    }

    @Override // L0.i
    public void accept(Object obj, Object obj2) {
        switch (this.f5k) {
            case 23:
                Y0.d dVar = new Y0.d((Y0.b) this.f6l, (p019g1.e) obj2, 1);
                r rVar = (r) ((Y0.q) obj).q();
                RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) this.f7m;
                K0.f fVarA = Y0.f.a();
                Parcel parcelD = rVar.d();
                int i3 = Y0.n.f1605a;
                parcelD.writeStrongBinder(dVar);
                Y0.n.b(parcelD, revokeAccessRequest);
                Y0.n.b(parcelD, fVarA);
                rVar.e(parcelD, 3);
                break;
            case 24:
                Y0.d dVar2 = new Y0.d((Y0.b) this.f6l, (p019g1.e) obj2, 2);
                r rVar2 = (r) ((Y0.q) obj).q();
                ClearTokenRequest clearTokenRequest = (ClearTokenRequest) this.f7m;
                K0.f fVarA2 = Y0.f.a();
                Parcel parcelD2 = rVar2.d();
                int i4 = Y0.n.f1605a;
                parcelD2.writeStrongBinder(dVar2);
                Y0.n.b(parcelD2, clearTokenRequest);
                Y0.n.b(parcelD2, fVarA2);
                rVar2.e(parcelD2, 4);
                break;
            case 25:
                Y0.c cVar = new Y0.c((Y0.b) this.f6l, (p019g1.e) obj2);
                r rVar3 = (r) ((Y0.q) obj).q();
                AuthorizationRequest authorizationRequest = (AuthorizationRequest) this.f7m;
                K0.f fVarA3 = Y0.f.a();
                Parcel parcelD3 = rVar3.d();
                int i5 = Y0.n.f1605a;
                parcelD3.writeStrongBinder(cVar);
                Y0.n.b(parcelD3, authorizationRequest);
                Y0.n.b(parcelD3, fVarA3);
                rVar3.e(parcelD3, 1);
                break;
            case 26:
                Y0.c cVar2 = new Y0.c((Y0.b) this.f6l, (p019g1.e) obj2, 1);
                s sVar = (s) ((Y0.e) obj).q();
                F0.i iVar = (F0.i) this.f7m;
                K0.f fVarA4 = Y0.f.a();
                Parcel parcelD4 = sVar.d();
                int i6 = Y0.n.f1605a;
                parcelD4.writeStrongBinder(cVar2);
                Y0.n.b(parcelD4, iVar);
                Y0.n.b(parcelD4, fVarA4);
                sVar.e(parcelD4, 3);
                break;
            default:
                Y0.c cVar3 = new Y0.c((Y0.b) this.f6l, (p019g1.e) obj2, 0);
                s sVar2 = (s) ((Y0.e) obj).q();
                F0.g gVar = (F0.g) this.f7m;
                K0.f fVarA5 = Y0.f.a();
                Parcel parcelD5 = sVar2.d();
                int i7 = Y0.n.f1605a;
                parcelD5.writeStrongBinder(cVar3);
                Y0.n.b(parcelD5, gVar);
                Y0.n.b(parcelD5, fVarA5);
                sVar2.e(parcelD5, 1);
                break;
        }
    }

    @Override // H.d
    public void b(Object obj) {
        I1.f fVar;
        I.f fVar2 = (I.f) obj;
        if (fVar2 instanceof I.d) {
            fVar = I1.f.f486q;
        } else if (fVar2 instanceof I.g) {
            fVar = I1.f.f485p;
        } else if (fVar2 instanceof I.h) {
            fVar = I1.f.f488s;
        } else if (fVar2 instanceof I.i) {
            fVar = I1.f.f489t;
        } else {
            fVar = fVar2 instanceof I.j ? I1.f.f487r : I1.f.u;
        }
        p000a.a.o((I1.k) this.f6l, new I1.e(fVar, fVar2.getMessage(), null));
    }

    @Override // C1.c
    public void e(Object obj) {
        switch (this.f5k) {
            case 7:
                A0.j jVar = (A0.j) this.f7m;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) jVar.f57l;
                B1.q qVar = (B1.q) this.f6l;
                concurrentLinkedQueue.remove(qVar);
                if (!((ConcurrentLinkedQueue) jVar.f57l).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + qVar.f140a);
                }
                break;
            default:
                ((p057t1.h) this.f6l).a(((C1.l) ((B1.s) ((c) this.f7m).f7m).f146m).a(obj));
                break;
        }
    }

    public void h(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + strValueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(strValueOf);
        ((ArrayList) this.f6l).add(sb.toString());
    }

    public Object i(String str) {
        Object obj = this.f7m;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    @Override // C1.m
    public void k(c cVar, B1.o oVar) {
        B1.a aVar = (B1.a) this.f7m;
        if (((A0.j) aVar.f80l) == null) {
            oVar.d((Map) this.f6l);
            return;
        }
        String str = (String) cVar.f6l;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            oVar.b();
            return;
        }
        try {
            this.f6l = Collections.unmodifiableMap(((p052r1.s) ((u[]) ((A0.j) aVar.f80l).f57l)[0]).f4424l);
        } catch (IllegalStateException e3) {
            oVar.a("error", e3.getMessage(), null);
        }
        oVar.d((Map) this.f6l);
    }

    public void l(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.l(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void m(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        I i3 = (I) this.f6l;
        SignInHubActivity signInHubActivity = i3.f2388v.n;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = i3.x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.m(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void n(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.n(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    @Override // C1.d
    public void o(ByteBuffer byteBuffer, p057t1.h hVar) {
        switch (this.f5k) {
            case 10:
                B1.s sVar = (B1.s) this.f7m;
                try {
                    ((C1.b) this.f6l).a(((C1.l) sVar.f146m).b(byteBuffer), new c(this, hVar, 9, false));
                } catch (RuntimeException e3) {
                    Log.e("BasicMessageChannel#" + ((String) sVar.f144k), "Failed to handle message", e3);
                    hVar.a(null);
                    return;
                }
                break;
            default:
                B1.s sVar2 = (B1.s) this.f7m;
                C1.n nVar = (C1.n) sVar2.f146m;
                try {
                    ((C1.m) this.f6l).k(nVar.d(byteBuffer), new B1.o(this, hVar, 1));
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + ((String) sVar2.f144k), "Failed to handle method call", e4);
                    hVar.a(nVar.b(e4.getMessage(), Log.getStackTraceString(e4)));
                }
                break;
        }
    }

    @Override // H.d
    public void onResult(Object obj) throws K.c {
        I1.k kVar = (I1.k) this.f6l;
        H.c cVar = ((H.l) obj).f413a;
        if (!(cVar instanceof H.i) || !cVar.f406a.equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
            p000a.a.o(kVar, new I1.e(I1.f.f483m, "Unexpected credential type: " + cVar, null));
            return;
        }
        C0002c c0002c = ((I1.s) this.f7m).n;
        Bundle bundle = cVar.f407b;
        a2.h.e(bundle, "data");
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            a2.h.b(string);
            a2.h.b(string2);
            p023h1.c cVar2 = new p023h1.c(string, string2, string3, string4, string5, uri, string6);
            Uri uri2 = cVar2.f2902g;
            p000a.a.o(kVar, new I1.j(new x(cVar2.f2899d, cVar2.f2900e, cVar2.f2901f, cVar2.f2903h, cVar2.f2898c, uri2 != null ? uri2.toString() : null)));
        } catch (Exception e3) {
            throw new K.c(e3);
        }
    }

    public void p(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.p(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void q(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.q(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void r(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.r(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void s(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        I i3 = (I) this.f6l;
        SignInHubActivity signInHubActivity = i3.f2388v.n;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = i3.x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.s(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void t(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.t(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f5k) {
            case 21:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f7m.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f6l;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb.append((String) arrayList.get(i3));
                    if (i3 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.u(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void v(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, Bundle bundle, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.v(abstractComponentCallbacksC0163s, bundle, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void w(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.w(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void x(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.x(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void y(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0163s, "f");
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0163s2 != null) {
            abstractComponentCallbacksC0163s2.j().n.y(abstractComponentCallbacksC0163s, true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f7m).iterator();
        if (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public void z(j jVar) {
        p pVar = (p) this.f7m;
        w.d dVar = (w.d) this.f6l;
        int i3 = jVar.f28b;
        if (i3 == 0) {
            pVar.execute(new a(dVar, jVar.f27a, 0));
        } else {
            pVar.execute(new b(dVar, i3));
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, int i3) {
        this.f5k = i3;
        this.f6l = obj;
        this.f7m = obj2;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i3, boolean z3) {
        this.f5k = i3;
        this.f7m = obj;
        this.f6l = obj2;
    }

    public c(int i3) {
        this.f5k = i3;
        switch (i3) {
            case 22:
                J0.d dVar = J0.d.f550c;
                this.f6l = new SparseIntArray();
                this.f7m = dVar;
                break;
            default:
                this.f6l = Collections.synchronizedMap(new WeakHashMap());
                this.f7m = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public /* synthetic */ c(Object obj) {
        this.f5k = 21;
        this.f7m = obj;
        this.f6l = new ArrayList();
    }

    public c(String str, H2.h hVar, K0.d dVar) {
        this.f5k = 17;
        this.f7m = str;
        this.f6l = hVar;
    }

    public c(E1.b bVar, B1.a aVar) {
        this.f5k = 15;
        this.f6l = bVar;
        this.f7m = aVar;
        aVar.f80l = new H0.i(this, 9);
    }

    public c(I i3) {
        this.f5k = 29;
        this.f6l = i3;
        this.f7m = new CopyOnWriteArrayList();
    }

    public c(B1.a aVar) {
        this.f5k = 1;
        this.f7m = aVar;
        this.f6l = new HashMap();
    }

    public c(p057t1.c cVar, int i3) {
        this.f5k = i3;
        switch (i3) {
            case 3:
                H0.i iVar = new H0.i(this, 4);
                B1.s sVar = new B1.s(cVar, "flutter/platform", C1.k.f176a, null);
                this.f6l = sVar;
                sVar.z(iVar);
                break;
            case 4:
                B1.g gVar = new B1.g(this, 1);
                B1.s sVar2 = new B1.s(cVar, "flutter/platform_views_2", C1.r.f180a, null);
                this.f6l = sVar2;
                sVar2.z(gVar);
                break;
            case 5:
                B1.a aVar = new B1.a(this, 3);
                B1.s sVar3 = new B1.s(cVar, "flutter/platform_views", C1.r.f180a, null);
                this.f6l = sVar3;
                sVar3.z(aVar);
                break;
            case 6:
            case 7:
            default:
                B1.g gVar2 = new B1.g(this, 0);
                B1.s sVar4 = new B1.s(cVar, "flutter/localization", C1.k.f176a, null);
                this.f6l = sVar4;
                sVar4.z(gVar2);
                break;
            case 8:
                H0.i iVar2 = new H0.i(this, 8);
                B1.s sVar5 = new B1.s(cVar, "flutter/textinput", C1.k.f176a, null);
                this.f6l = sVar5;
                sVar5.z(iVar2);
                break;
        }
    }

    public c(p057t1.c cVar, PackageManager packageManager) {
        this.f5k = 6;
        H0.i iVar = new H0.i(this, 5);
        this.f6l = packageManager;
        new B1.s(cVar, "flutter/processtext", C1.r.f180a, null).z(iVar);
    }

    public c(Animation animation) {
        this.f5k = 28;
        this.f6l = animation;
        this.f7m = null;
    }

    public c(Animator animator) {
        this.f5k = 28;
        this.f6l = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7m = animatorSet;
        animatorSet.play(animator);
    }
}
