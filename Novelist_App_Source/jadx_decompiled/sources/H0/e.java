package H0;

import L0.p;
import M0.C0047c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.a {
    public final GoogleSignInOptions y;

    public e(Context context, Looper looper, C0047c c0047c, GoogleSignInOptions googleSignInOptions, p pVar, p pVar2) {
        super(context, looper, 91, c0047c, pVar, pVar2, 0);
        G0.b bVar;
        Set<Scope> set = (Set) c0047c.f927b;
        if (googleSignInOptions != null) {
            bVar = new G0.b();
            bVar.f385a = new HashSet();
            bVar.f392h = new HashMap();
            bVar.f385a = new HashSet(googleSignInOptions.f2693l);
            bVar.f386b = googleSignInOptions.f2695o;
            bVar.f387c = googleSignInOptions.f2696p;
            bVar.f388d = googleSignInOptions.n;
            bVar.f389e = googleSignInOptions.f2697q;
            bVar.f390f = googleSignInOptions.f2694m;
            bVar.f391g = googleSignInOptions.f2698r;
            bVar.f392h = GoogleSignInOptions.c(googleSignInOptions.f2699s);
            bVar.f393i = googleSignInOptions.f2700t;
        } else {
            bVar = new G0.b();
            bVar.f385a = new HashSet();
            bVar.f392h = new HashMap();
        }
        bVar.f393i = Y0.g.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.f385a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = bVar.f385a;
        if (hashSet2.contains(GoogleSignInOptions.x)) {
            Scope scope2 = GoogleSignInOptions.f2691w;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (bVar.f388d && (bVar.f390f == null || !hashSet2.isEmpty())) {
            bVar.f385a.add(GoogleSignInOptions.f2690v);
        }
        this.y = new GoogleSignInOptions(3, new ArrayList(hashSet2), bVar.f390f, bVar.f388d, bVar.f386b, bVar.f387c, bVar.f389e, bVar.f391g, bVar.f392h, bVar.f393i);
    }

    @Override // K0.c
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
