package m0;

import B1.p;
import a2.h;
import android.os.Bundle;
import androidx.lifecycle.EnumC0140l;
import androidx.lifecycle.InterfaceC0135g;
import androidx.lifecycle.InterfaceC0145q;
import androidx.lifecycle.InterfaceC0146s;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import b0.AbstractComponentCallbacksC0171s;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import t.AbstractC0468a;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428b implements InterfaceC0145q {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4097k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4098l;

    public /* synthetic */ C0428b(Object obj, int i3) {
        this.f4097k = i3;
        this.f4098l = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0145q
    public final void d(InterfaceC0146s interfaceC0146s, EnumC0140l enumC0140l) {
        switch (this.f4097k) {
            case 0:
                InterfaceC0431e interfaceC0431e = (InterfaceC0431e) this.f4098l;
                if (enumC0140l != EnumC0140l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0146s.h().b(this);
                Bundle a3 = interfaceC0431e.c().a("androidx.savedstate.Restarter");
                if (a3 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a3.getStringArrayList("classes_to_restore");
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
                        Class<? extends U> asSubclass = Class.forName(str2, false, C0428b.class.getClassLoader()).asSubclass(InterfaceC0429c.class);
                        h.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                h.d(newInstance, "{\n                constr…wInstance()\n            }");
                                if (!(interfaceC0431e instanceof T)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                S f3 = ((T) interfaceC0431e).f();
                                p c3 = interfaceC0431e.c();
                                f3.getClass();
                                LinkedHashMap linkedHashMap = f3.f2137a;
                                Iterator it2 = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it2.hasNext()) {
                                    String str3 = (String) it2.next();
                                    h.e(str3, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
                                    P p3 = (P) linkedHashMap.get(str3);
                                    h.b(p3);
                                    L.c(p3, c3, interfaceC0431e.h());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    c3.d();
                                }
                            } catch (Exception e3) {
                                throw new RuntimeException(AbstractC0468a.a("Failed to instantiate ", str2), e3);
                            }
                        } catch (NoSuchMethodException e4) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                        }
                    } catch (ClassNotFoundException e5) {
                        throw new RuntimeException(AbstractC0468a.b("Class ", str2, " wasn't found"), e5);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC0135g[] interfaceC0135gArr = (InterfaceC0135g[]) this.f4098l;
                if (interfaceC0135gArr.length > 0) {
                    InterfaceC0135g interfaceC0135g = interfaceC0135gArr[0];
                    throw null;
                }
                if (interfaceC0135gArr.length <= 0) {
                    return;
                }
                InterfaceC0135g interfaceC0135g2 = interfaceC0135gArr[0];
                throw null;
            case 2:
                if (enumC0140l != EnumC0140l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0140l).toString());
                }
                interfaceC0146s.h().b(this);
                M m3 = (M) this.f4098l;
                if (m3.f2132b) {
                    return;
                }
                Bundle a4 = m3.f2131a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = m3.f2133c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (a4 != null) {
                    bundle.putAll(a4);
                }
                m3.f2133c = bundle;
                m3.f2132b = true;
                return;
            case 3:
                SignInHubActivity signInHubActivity = (SignInHubActivity) this.f4098l;
                if (signInHubActivity.f2311o == null) {
                    b.h hVar = (b.h) signInHubActivity.getLastNonConfigurationInstance();
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
                if (enumC0140l == EnumC0140l.ON_STOP) {
                    ((AbstractComponentCallbacksC0171s) this.f4098l).getClass();
                    return;
                }
                return;
        }
    }
}
