package b;

import android.os.Bundle;
import androidx.lifecycle.EnumC0140l;
import b0.C0173u;
import b0.I;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m0.InterfaceC0430d;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC0430d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2293b;

    public /* synthetic */ f(Object obj, int i3) {
        this.f2292a = i3;
        this.f2293b = obj;
    }

    @Override // m0.InterfaceC0430d
    public final Bundle a() {
        switch (this.f2292a) {
            case 0:
                SignInHubActivity signInHubActivity = (SignInHubActivity) this.f2293b;
                Bundle bundle = new Bundle();
                j jVar = signInHubActivity.f2314r;
                jVar.getClass();
                LinkedHashMap linkedHashMap = jVar.f2301b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.f2303d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.f2306g));
                return bundle;
            case 1:
                SignInHubActivity signInHubActivity2 = (SignInHubActivity) this.f2293b;
                while (SignInHubActivity.j(((C0173u) signInHubActivity2.f2707C.f443l).f2555p)) {
                }
                signInHubActivity2.f2708D.e(EnumC0140l.ON_STOP);
                return new Bundle();
            default:
                return ((I) this.f2293b).V();
        }
    }
}
