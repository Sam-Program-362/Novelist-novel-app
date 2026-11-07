package b;

import M1.P;
import android.os.Bundle;
import b1.C0192Q;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import d.C0227b;
import d.C0229d;
import d.InterfaceC0228c;
import g2.C0255a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2300a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2301b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2302c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2303d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f2304e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f2305f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2306g = new Bundle();

    public j(SignInHubActivity signInHubActivity) {
    }

    public final C0192Q a(String str, E2.a aVar, InterfaceC0228c interfaceC0228c) {
        a2.h.e(str, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        LinkedHashMap linkedHashMap = this.f2301b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            I1.l lVar = new I1.l(6);
            Iterator it2 = new C0255a(new g2.c(lVar, new P(lVar, 3))).iterator();
            while (it2.hasNext()) {
                Number number = (Number) it2.next();
                Integer valueOf = Integer.valueOf(number.intValue());
                LinkedHashMap linkedHashMap2 = this.f2300a;
                if (!linkedHashMap2.containsKey(valueOf)) {
                    int intValue = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.f2304e.put(str, new C0229d(interfaceC0228c, aVar));
        LinkedHashMap linkedHashMap3 = this.f2305f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            interfaceC0228c.e(obj);
        }
        Bundle bundle = this.f2306g;
        C0227b c0227b = (C0227b) H2.h.p(bundle, str, C0227b.class);
        if (c0227b != null) {
            bundle.remove(str);
            interfaceC0228c.e(aVar.F(c0227b.f2765l, c0227b.f2764k));
        }
        return new C0192Q(this, str, aVar);
    }
}
