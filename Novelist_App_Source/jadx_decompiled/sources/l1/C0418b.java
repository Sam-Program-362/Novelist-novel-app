package l1;

import B1.o;
import H0.i;
import a.AbstractC0102a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418b extends AbstractC0102a {

    /* renamed from: m, reason: collision with root package name */
    public final i f4030m;
    public final A.c n;

    public C0418b(A.c cVar, o oVar) {
        super(21);
        this.n = cVar;
        this.f4030m = new i(oVar, 24);
    }

    @Override // a.AbstractC0102a
    public final String A() {
        return (String) this.n.f6l;
    }

    @Override // a.AbstractC0102a
    public final InterfaceC0419c C() {
        return this.f4030m;
    }

    @Override // a.AbstractC0102a
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

    @Override // a.AbstractC0102a
    public final Object x(String str) {
        return this.n.i(str);
    }
}
