package u0;

import Z1.l;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes.dex */
public final class g extends E2.a {

    /* renamed from: e, reason: collision with root package name */
    public final Object f4598e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4599f;

    /* renamed from: g, reason: collision with root package name */
    public final C0481a f4600g;

    public g(Object obj, int i3, C0481a c0481a) {
        a2.h.e(obj, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        B1.e.q("verificationMode", i3);
        this.f4598e = obj;
        this.f4599f = i3;
        this.f4600g = c0481a;
    }

    @Override // E2.a
    public final E2.a L(String str, l lVar) {
        Object obj = this.f4598e;
        return ((Boolean) lVar.f(obj)).booleanValue() ? this : new f(obj, str, this.f4600g, this.f4599f);
    }

    @Override // E2.a
    public final Object e() {
        return this.f4598e;
    }
}
