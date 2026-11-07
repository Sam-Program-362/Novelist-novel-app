package p058u0;

import B1.e;
import E2.a;
import Z1.l;
import a2.h;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f4600g;

    public g(Object obj, int i3, a aVar) {
        h.e(obj, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        e.q("verificationMode", i3);
        this.f4598e = obj;
        this.f4599f = i3;
        this.f4600g = aVar;
    }

    @Override // E2.a
    public final a L(String str, l lVar) {
        Object obj = this.f4598e;
        return ((Boolean) lVar.f(obj)).booleanValue() ? this : new f(obj, str, this.f4600g, this.f4599f);
    }

    @Override // E2.a
    public final Object e() {
        return this.f4598e;
    }
}
