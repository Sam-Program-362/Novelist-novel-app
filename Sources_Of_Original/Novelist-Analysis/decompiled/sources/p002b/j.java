package p002b;

import E2.a;
import I1.l;
import M1.P;
import a2.h;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p004b1.Q;
import p007d.b;
import p007d.c;
import p007d.d;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2300a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2301b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2302c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2303d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f2304e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f2305f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f2306g = new Bundle();

    public j(SignInHubActivity signInHubActivity) {
    }

    public final Q a(String str, a aVar, c cVar) {
        Number number;
        Integer numValueOf;
        LinkedHashMap linkedHashMap;
        h.e(str, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        LinkedHashMap linkedHashMap2 = this.f2301b;
        if (((Integer) linkedHashMap2.get(str)) == null) {
            l lVar = new l(6);
            Iterator it2 = new p020g2.a(new p020g2.c(lVar, new P(lVar, 3))).iterator();
            do {
                if (!it2.hasNext()) {
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                number = (Number) it2.next();
                numValueOf = Integer.valueOf(number.intValue());
                linkedHashMap = this.f2300a;
            } while (linkedHashMap.containsKey(numValueOf));
            int iIntValue = number.intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue), str);
            linkedHashMap2.put(str, Integer.valueOf(iIntValue));
        }
        this.f2304e.put(str, new d(cVar, aVar));
        LinkedHashMap linkedHashMap3 = this.f2305f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            cVar.e(obj);
        }
        Bundle bundle = this.f2306g;
        b bVar = (b) H2.h.p(bundle, str, b.class);
        if (bVar != null) {
            bundle.remove(str);
            cVar.e(aVar.F(bVar.f2765l, bVar.f2764k));
        }
        return new Q(this, str, aVar);
    }
}
