package l1;

import B1.s;
import a.AbstractC0102a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417a extends AbstractC0102a {

    /* renamed from: m, reason: collision with root package name */
    public final Map f4028m;
    public final s n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4029o;

    public C0417a(Map map, boolean z3) {
        super(21);
        this.n = new s();
        this.f4028m = map;
        this.f4029o = z3;
    }

    @Override // a.AbstractC0102a
    public final String A() {
        return (String) this.f4028m.get("method");
    }

    @Override // a.AbstractC0102a
    public final boolean B() {
        return this.f4029o;
    }

    @Override // a.AbstractC0102a
    public final InterfaceC0419c C() {
        return this.n;
    }

    @Override // a.AbstractC0102a
    public final boolean F() {
        return this.f4028m.containsKey("transactionId");
    }

    public final void W(ArrayList arrayList) {
        if (this.f4029o) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        s sVar = this.n;
        hashMap2.put("code", (String) sVar.f144k);
        hashMap2.put("message", (String) sVar.f145l);
        hashMap2.put("data", sVar.n);
        hashMap.put("error", hashMap2);
        arrayList.add(hashMap);
    }

    public final void X(ArrayList arrayList) {
        if (this.f4029o) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.n.f146m);
        arrayList.add(hashMap);
    }

    @Override // a.AbstractC0102a
    public final Object x(String str) {
        return this.f4028m.get(str);
    }
}
