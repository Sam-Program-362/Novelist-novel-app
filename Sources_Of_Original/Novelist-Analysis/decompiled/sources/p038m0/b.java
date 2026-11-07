package p038m0;

import B1.p;
import a2.h;
import android.os.Bundle;
import androidx.lifecycle.EnumC0138l;
import androidx.lifecycle.InterfaceC0133g;
import androidx.lifecycle.InterfaceC0143q;
import androidx.lifecycle.InterfaceC0144s;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p003b0.AbstractComponentCallbacksC0163s;
import p055t.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0143q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f4098l;

    public /* synthetic */ b(Object obj, int i3) {
        this.f4097k = i3;
        this.f4098l = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0143q
    public final void d(InterfaceC0144s interfaceC0144s, EnumC0138l enumC0138l) {
        switch (this.f4097k) {
            case 0:
                e eVar = (e) this.f4098l;
                if (enumC0138l != EnumC0138l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0144s.h().b(this);
                Bundle bundleA = eVar.c().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    String str = stringArrayList.get(i3);
                    i3++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        h.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                h.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(eVar instanceof T)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                S sF = ((T) eVar).f();
                                p pVarC = eVar.c();
                                sF.getClass();
                                LinkedHashMap linkedHashMap = sF.f2137a;
                                for (String str3 : new HashSet(linkedHashMap.keySet())) {
                                    h.e(str3, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
                                    P p3 = (P) linkedHashMap.get(str3);
                                    h.b(p3);
                                    L.c(p3, pVarC, eVar.h());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    pVarC.d();
                                }
                            } catch (Exception e3) {
                                throw new RuntimeException(a.a("Failed to instantiate ", str2), e3);
                            }
                        } catch (NoSuchMethodException e4) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                        }
                    } catch (ClassNotFoundException e5) {
                        throw new RuntimeException(a.b("Class ", str2, " wasn't found"), e5);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC0133g[] interfaceC0133gArr = (InterfaceC0133g[]) this.f4098l;
                if (interfaceC0133gArr.length > 0) {
                    InterfaceC0133g interfaceC0133g = interfaceC0133gArr[0];
                    throw null;
                }
                if (interfaceC0133gArr.length <= 0) {
                    return;
                }
                InterfaceC0133g interfaceC0133g2 = interfaceC0133gArr[0];
                throw null;
            case 2:
                if (enumC0138l != EnumC0138l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0138l).toString());
                }
                interfaceC0144s.h().b(this);
                M m3 = (M) this.f4098l;
                if (m3.f2132b) {
                    return;
                }
                Bundle bundleA2 = m3.f2131a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = m3.f2133c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (bundleA2 != null) {
                    bundle.putAll(bundleA2);
                }
                m3.f2133c = bundle;
                m3.f2132b = true;
                return;
            case 3:
                SignInHubActivity signInHubActivity = (SignInHubActivity) this.f4098l;
                if (signInHubActivity.f2311o == null) {
                    p002b.h hVar = (p002b.h) signInHubActivity.getLastNonConfigurationInstance();
                    if (hVar != null) {
                        signInHubActivity.f2311o = hVar.f2296a;
                    }
                    if (signInHubActivity.f2311o == null) {
                        signInHubActivity.f2311o = new S();
                    }
                }
                signInHubActivity.f4439k.b(this);
                return;
            default:
                if (enumC0138l == EnumC0138l.ON_STOP) {
                    ((AbstractComponentCallbacksC0163s) this.f4098l).getClass();
                    return;
                }
                return;
        }
    }
}
