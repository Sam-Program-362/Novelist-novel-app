package p036l1;

import A.c;
import B1.o;
import H0.i;
import java.util.Map;
import org.json.JSONObject;
import p000a.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f4030m;
    public final c n;

    public b(c cVar, o oVar) {
        super(21);
        this.n = cVar;
        this.f4030m = new i(oVar, 24);
    }

    @Override // p000a.a
    public final String A() {
        return (String) this.n.f6l;
    }

    @Override // p000a.a
    public final c C() {
        return this.f4030m;
    }

    @Override // p000a.a
    public final boolean F() {
        Object obj = this.n.f7m;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey("transactionId");
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has("transactionId");
        }
        throw new ClassCastException();
    }

    @Override // p000a.a
    public final Object x(String str) {
        return this.n.i(str);
    }
}
