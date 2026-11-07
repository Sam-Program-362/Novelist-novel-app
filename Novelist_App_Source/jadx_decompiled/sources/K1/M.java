package K1;

import V.C0080d;
import V.S;
import V.T;
import android.content.Context;
import f2.InterfaceC0249c;
import i2.AbstractC0303u;
import i2.InterfaceC0301s;
import i2.c0;
import java.util.List;
import java.util.Set;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0249c[] f700a;

    /* renamed from: b, reason: collision with root package name */
    public static final X.c f701b;

    static {
        R1.b bVar;
        a2.k kVar = new a2.k(a2.b.f1697k, M.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        a2.p.f1714a.getClass();
        f700a = new InterfaceC0249c[]{kVar};
        p2.e eVar = i2.A.f2964a;
        R1.h hVar = p2.d.f4262m;
        c0 c0Var = new c0();
        hVar.getClass();
        R1.i iVar = R1.i.f1255k;
        if (c0Var != iVar) {
            R1.h j3 = hVar.j(c0Var.getKey());
            if (j3 == iVar) {
                hVar = c0Var;
            } else {
                R1.d dVar = R1.d.f1254k;
                R1.e eVar2 = (R1.e) j3.e(dVar);
                if (eVar2 == null) {
                    bVar = new R1.b(j3, c0Var);
                } else {
                    R1.h j4 = j3.j(dVar);
                    if (j4 == iVar) {
                        hVar = new R1.b(c0Var, eVar2);
                    } else {
                        bVar = new R1.b(new R1.b(j4, c0Var), eVar2);
                    }
                }
                hVar = bVar;
            }
        }
        f701b = new X.c(X.a.f1552l, AbstractC0303u.a(hVar));
    }

    public static final B1.g a(Context context) {
        B1.g gVar;
        a2.h.e(context, "<this>");
        X.c cVar = f701b;
        InterfaceC0249c interfaceC0249c = f700a[0];
        cVar.getClass();
        a2.h.e(interfaceC0249c, "property");
        B1.g gVar2 = cVar.f1558d;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (cVar.f1557c) {
            try {
                if (cVar.f1558d == null) {
                    Context applicationContext = context.getApplicationContext();
                    Z1.l lVar = cVar.f1555a;
                    a2.h.d(applicationContext, "applicationContext");
                    List list = (List) lVar.f(applicationContext);
                    InterfaceC0301s interfaceC0301s = cVar.f1556b;
                    X.b bVar = new X.b(applicationContext, cVar, 0);
                    a2.h.e(list, "migrations");
                    cVar.f1558d = new B1.g(new B1.g(new V.N(new T(new S(bVar, 1)), E2.a.B(new C0080d(list, null)), new M1.A(7), interfaceC0301s), 9), 9);
                }
                gVar = cVar.f1558d;
                a2.h.b(gVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static final boolean b(String str, Object obj, Set set) {
        a2.h.e(str, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object c(Object obj, B1.b bVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        a2.h.e(str, "<this>");
        if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                return obj;
            }
            String substring = str.substring(40);
            a2.h.d(substring, "substring(...)");
            return bVar.d(substring);
        }
        if (!str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return obj;
        }
        String substring2 = str.substring(40);
        a2.h.d(substring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(substring2));
    }
}
