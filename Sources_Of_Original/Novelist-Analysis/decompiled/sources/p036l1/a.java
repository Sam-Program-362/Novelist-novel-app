package p036l1;

import B1.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p000a.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f4028m;
    public final s n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f4029o;

    public a(Map map, boolean z3) {
        super(21);
        this.n = new s();
        this.f4028m = map;
        this.f4029o = z3;
    }

    @Override // p000a.a
    public final String A() {
        return (String) this.f4028m.get("method");
    }

    @Override // p000a.a
    public final boolean B() {
        return this.f4029o;
    }

    @Override // p000a.a
    public final c C() {
        return this.n;
    }

    @Override // p000a.a
    public final boolean F() {
        return this.f4028m.containsKey("transactionId");
    }

    public final void W(ArrayList arrayList) {
        if (this.f4029o) {
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        s sVar = this.n;
        map2.put("code", (String) sVar.f144k);
        map2.put("message", (String) sVar.f145l);
        map2.put("data", sVar.n);
        map.put("error", map2);
        arrayList.add(map);
    }

    public final void X(ArrayList arrayList) {
        if (this.f4029o) {
            return;
        }
        HashMap map = new HashMap();
        map.put("result", this.n.f146m);
        arrayList.add(map);
    }

    @Override // p000a.a
    public final Object x(String str) {
        return this.f4028m.get(str);
    }
}
