package A;

import D.C0002c;
import I1.x;
import Y0.r;
import Y0.s;
import a.AbstractC0102a;
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
import b0.AbstractComponentCallbacksC0171s;
import b0.I;
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
import org.json.JSONArray;
import org.json.JSONObject;
import r1.u;
import t.AbstractC0468a;
import t1.C0475c;
import t1.C0480h;

/* loaded from: classes.dex */
public final class c implements C1.m, C1.c, C1.d, H.d, g1.b, L0.i {
    public static E1.a n;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6l;

    /* renamed from: m, reason: collision with root package name */
    public Object f7m;

    public /* synthetic */ c(int i3, boolean z3) {
        this.f5k = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(A.c r11, org.json.JSONArray r12) {
        /*
            r11 = 0
            r0 = r11
            r1 = r0
            r2 = r1
        L4:
            int r3 = r12.length()
            r4 = 4
            r5 = 2
            r6 = 1
            if (r0 >= r3) goto L68
            java.lang.String r3 = r12.getString(r0)
            int[] r4 = X.j.b(r4)
            int r7 = r4.length
            r8 = r11
        L17:
            if (r8 >= r7) goto L5c
            r9 = r4[r8]
            r10 = 1
            if (r9 == r10) goto L32
            r10 = 2
            if (r9 == r10) goto L2f
            r10 = 3
            if (r9 == r10) goto L2c
            r10 = 4
            if (r9 != r10) goto L2a
            java.lang.String r10 = "DeviceOrientation.landscapeRight"
            goto L34
        L2a:
            r11 = 0
            throw r11
        L2c:
            java.lang.String r10 = "DeviceOrientation.landscapeLeft"
            goto L34
        L2f:
            java.lang.String r10 = "DeviceOrientation.portraitDown"
            goto L34
        L32:
            java.lang.String r10 = "DeviceOrientation.portraitUp"
        L34:
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L59
            int r3 = X.j.a(r9)
            if (r3 == 0) goto L51
            if (r3 == r6) goto L4e
            if (r3 == r5) goto L4b
            r4 = 3
            if (r3 == r4) goto L48
            goto L53
        L48:
            r1 = r1 | 8
            goto L53
        L4b:
            r1 = r1 | 2
            goto L53
        L4e:
            r1 = r1 | 4
            goto L53
        L51:
            r1 = r1 | 1
        L53:
            if (r2 != 0) goto L56
            r2 = r1
        L56:
            int r0 = r0 + 1
            goto L4
        L59:
            int r8 = r8 + 1
            goto L17
        L5c:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            java.lang.String r12 = "No such DeviceOrientation: "
            java.lang.String r12 = t.AbstractC0468a.a(r12, r3)
            r11.<init>(r12)
            throw r11
        L68:
            if (r1 == 0) goto L85
            r12 = 8
            switch(r1) {
                case 2: goto L84;
                case 3: goto L7a;
                case 4: goto L82;
                case 5: goto L77;
                case 6: goto L7a;
                case 7: goto L7a;
                case 8: goto L81;
                case 9: goto L7a;
                case 10: goto L74;
                case 11: goto L73;
                case 12: goto L7a;
                case 13: goto L7a;
                case 14: goto L7a;
                case 15: goto L70;
                default: goto L6f;
            }
        L6f:
            goto L80
        L70:
            r11 = 13
            return r11
        L73:
            return r5
        L74:
            r11 = 11
            return r11
        L77:
            r11 = 12
            return r11
        L7a:
            if (r2 == r5) goto L84
            if (r2 == r4) goto L82
            if (r2 == r12) goto L81
        L80:
            return r6
        L81:
            return r12
        L82:
            r11 = 9
        L84:
            return r11
        L85:
            r11 = -1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: A.c.c(A.c, org.json.JSONArray):int");
    }

    public static ArrayList d(c cVar, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String string = jSONArray.getString(i3);
            for (B1.j jVar : B1.j.values()) {
                if (jVar.f102k.equals(string)) {
                    int ordinal = jVar.ordinal();
                    if (ordinal == 0) {
                        arrayList.add(B1.j.TOP_OVERLAYS);
                    } else if (ordinal == 1) {
                        arrayList.add(B1.j.BOTTOM_OVERLAYS);
                    }
                }
            }
            throw new NoSuchFieldException(AbstractC0468a.a("No such SystemUiOverlay: ", string));
        }
        return arrayList;
    }

    public static int f(c cVar, String str) {
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
                int a3 = X.j.a(i3);
                if (a3 == 0) {
                    return 1;
                }
                if (a3 != 1) {
                    return a3 != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(AbstractC0468a.a("No such SystemUiMode: ", str));
    }

    public static B1.i g(c cVar, JSONObject jSONObject) {
        return new B1.i(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? B1.e.b(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : B1.e.b(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static HashMap j(String str, int i3, int i4, int i5, int i6) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i3));
        hashMap.put("selectionExtent", Integer.valueOf(i4));
        hashMap.put("composingBase", Integer.valueOf(i5));
        hashMap.put("composingExtent", Integer.valueOf(i6));
        return hashMap;
    }

    public void A(boolean z3, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f6l)) {
            hashMap = new HashMap((Map) this.f6l);
        }
        synchronized (((Map) this.f7m)) {
            hashMap2 = new HashMap((Map) this.f7m);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).N(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((g1.e) entry2.getKey()).c(new K0.e(status));
            }
        }
    }

    @Override // g1.b
    public void a(g1.i iVar) {
        ((Map) ((c) this.f7m).f7m).remove((g1.e) this.f6l);
    }

    @Override // L0.i
    public void accept(Object obj, Object obj2) {
        switch (this.f5k) {
            case 23:
                Y0.d dVar = new Y0.d((Y0.b) this.f6l, (g1.e) obj2, 1);
                r rVar = (r) ((Y0.q) obj).q();
                RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) this.f7m;
                K0.f a3 = Y0.f.a();
                Parcel d3 = rVar.d();
                int i3 = Y0.n.f1605a;
                d3.writeStrongBinder(dVar);
                Y0.n.b(d3, revokeAccessRequest);
                Y0.n.b(d3, a3);
                rVar.e(d3, 3);
                break;
            case 24:
                Y0.d dVar2 = new Y0.d((Y0.b) this.f6l, (g1.e) obj2, 2);
                r rVar2 = (r) ((Y0.q) obj).q();
                ClearTokenRequest clearTokenRequest = (ClearTokenRequest) this.f7m;
                K0.f a4 = Y0.f.a();
                Parcel d4 = rVar2.d();
                int i4 = Y0.n.f1605a;
                d4.writeStrongBinder(dVar2);
                Y0.n.b(d4, clearTokenRequest);
                Y0.n.b(d4, a4);
                rVar2.e(d4, 4);
                break;
            case 25:
                Y0.c cVar = new Y0.c((Y0.b) this.f6l, (g1.e) obj2);
                r rVar3 = (r) ((Y0.q) obj).q();
                AuthorizationRequest authorizationRequest = (AuthorizationRequest) this.f7m;
                K0.f a5 = Y0.f.a();
                Parcel d5 = rVar3.d();
                int i5 = Y0.n.f1605a;
                d5.writeStrongBinder(cVar);
                Y0.n.b(d5, authorizationRequest);
                Y0.n.b(d5, a5);
                rVar3.e(d5, 1);
                break;
            case 26:
                Y0.c cVar2 = new Y0.c((Y0.b) this.f6l, (g1.e) obj2, 1);
                s sVar = (s) ((Y0.e) obj).q();
                F0.i iVar = (F0.i) this.f7m;
                K0.f a6 = Y0.f.a();
                Parcel d6 = sVar.d();
                int i6 = Y0.n.f1605a;
                d6.writeStrongBinder(cVar2);
                Y0.n.b(d6, iVar);
                Y0.n.b(d6, a6);
                sVar.e(d6, 3);
                break;
            default:
                Y0.c cVar3 = new Y0.c((Y0.b) this.f6l, (g1.e) obj2, 0);
                s sVar2 = (s) ((Y0.e) obj).q();
                F0.g gVar = (F0.g) this.f7m;
                K0.f a7 = Y0.f.a();
                Parcel d7 = sVar2.d();
                int i7 = Y0.n.f1605a;
                d7.writeStrongBinder(cVar3);
                Y0.n.b(d7, gVar);
                Y0.n.b(d7, a7);
                sVar2.e(d7, 1);
                break;
        }
    }

    @Override // H.d
    public void b(Object obj) {
        I.f fVar = (I.f) obj;
        AbstractC0102a.o((I1.k) this.f6l, new I1.e(fVar instanceof I.d ? I1.f.f486q : fVar instanceof I.g ? I1.f.f485p : fVar instanceof I.h ? I1.f.f488s : fVar instanceof I.i ? I1.f.f489t : fVar instanceof I.j ? I1.f.f487r : I1.f.u, fVar.getMessage(), null));
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
                    break;
                }
                break;
            default:
                ((C0480h) this.f6l).a(((C1.l) ((B1.s) ((c) this.f7m).f7m).f146m).a(obj));
                break;
        }
    }

    public void h(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + valueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
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
            this.f6l = Collections.unmodifiableMap(((r1.s) ((u[]) ((A0.j) aVar.f80l).f57l)[0]).f4424l);
        } catch (IllegalStateException e3) {
            oVar.a("error", e3.getMessage(), null);
        }
        oVar.d((Map) this.f6l);
    }

    public void l(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.l(abstractComponentCallbacksC0171s, true);
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

    public void m(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        I i3 = (I) this.f6l;
        SignInHubActivity signInHubActivity = i3.f2388v.n;
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = i3.x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.m(abstractComponentCallbacksC0171s, true);
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

    public void n(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.n(abstractComponentCallbacksC0171s, true);
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
    public void o(ByteBuffer byteBuffer, C0480h c0480h) {
        switch (this.f5k) {
            case 10:
                B1.s sVar = (B1.s) this.f7m;
                try {
                    ((C1.b) this.f6l).a(((C1.l) sVar.f146m).b(byteBuffer), new c(this, c0480h, 9, false));
                    break;
                } catch (RuntimeException e3) {
                    Log.e("BasicMessageChannel#" + ((String) sVar.f144k), "Failed to handle message", e3);
                    c0480h.a(null);
                    return;
                }
            default:
                B1.s sVar2 = (B1.s) this.f7m;
                C1.n nVar = (C1.n) sVar2.f146m;
                try {
                    ((C1.m) this.f6l).k(nVar.d(byteBuffer), new B1.o(this, c0480h, 1));
                    break;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + ((String) sVar2.f144k), "Failed to handle method call", e4);
                    c0480h.a(nVar.b(e4.getMessage(), Log.getStackTraceString(e4)));
                }
        }
    }

    @Override // H.d
    public void onResult(Object obj) {
        Uri uri;
        Object parcelable;
        I1.k kVar = (I1.k) this.f6l;
        H.c cVar = ((H.l) obj).f413a;
        if (!(cVar instanceof H.i) || !cVar.f406a.equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
            AbstractC0102a.o(kVar, new I1.e(I1.f.f483m, "Unexpected credential type: " + cVar, null));
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
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class);
                uri = (Uri) parcelable;
            } else {
                uri = (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            }
            Uri uri2 = uri;
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            a2.h.b(string);
            a2.h.b(string2);
            h1.c cVar2 = new h1.c(string, string2, string3, string4, string5, uri2, string6);
            Uri uri3 = cVar2.f2902g;
            AbstractC0102a.o(kVar, new I1.j(new x(cVar2.f2899d, cVar2.f2900e, cVar2.f2901f, cVar2.f2903h, cVar2.f2898c, uri3 != null ? uri3.toString() : null)));
        } catch (Exception e3) {
            throw new K.c(e3);
        }
    }

    public void p(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.p(abstractComponentCallbacksC0171s, true);
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

    public void q(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.q(abstractComponentCallbacksC0171s, true);
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

    public void r(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.r(abstractComponentCallbacksC0171s, true);
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

    public void s(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        I i3 = (I) this.f6l;
        SignInHubActivity signInHubActivity = i3.f2388v.n;
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = i3.x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.s(abstractComponentCallbacksC0171s, true);
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

    public void t(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.t(abstractComponentCallbacksC0171s, true);
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

    public void u(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.u(abstractComponentCallbacksC0171s, true);
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

    public void v(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, Bundle bundle, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.v(abstractComponentCallbacksC0171s, bundle, true);
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

    public void w(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.w(abstractComponentCallbacksC0171s, true);
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

    public void x(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.x(abstractComponentCallbacksC0171s, true);
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

    public void y(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, boolean z3) {
        a2.h.e(abstractComponentCallbacksC0171s, "f");
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = ((I) this.f6l).x;
        if (abstractComponentCallbacksC0171s2 != null) {
            abstractComponentCallbacksC0171s2.j().n.y(abstractComponentCallbacksC0171s, true);
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

    public c(C0475c c0475c, int i3) {
        this.f5k = i3;
        switch (i3) {
            case 3:
                H0.i iVar = new H0.i(this, 4);
                B1.s sVar = new B1.s(c0475c, "flutter/platform", C1.k.f176a, null);
                this.f6l = sVar;
                sVar.z(iVar);
                break;
            case 4:
                B1.g gVar = new B1.g(this, 1);
                B1.s sVar2 = new B1.s(c0475c, "flutter/platform_views_2", C1.r.f180a, null);
                this.f6l = sVar2;
                sVar2.z(gVar);
                break;
            case 5:
                B1.a aVar = new B1.a(this, 3);
                B1.s sVar3 = new B1.s(c0475c, "flutter/platform_views", C1.r.f180a, null);
                this.f6l = sVar3;
                sVar3.z(aVar);
                break;
            case 6:
            case 7:
            default:
                B1.g gVar2 = new B1.g(this, 0);
                B1.s sVar4 = new B1.s(c0475c, "flutter/localization", C1.k.f176a, null);
                this.f6l = sVar4;
                sVar4.z(gVar2);
                break;
            case 8:
                H0.i iVar2 = new H0.i(this, 8);
                B1.s sVar5 = new B1.s(c0475c, "flutter/textinput", C1.k.f176a, null);
                this.f6l = sVar5;
                sVar5.z(iVar2);
                break;
        }
    }

    public c(C0475c c0475c, PackageManager packageManager) {
        this.f5k = 6;
        H0.i iVar = new H0.i(this, 5);
        this.f6l = packageManager;
        new B1.s(c0475c, "flutter/processtext", C1.r.f180a, null).z(iVar);
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
