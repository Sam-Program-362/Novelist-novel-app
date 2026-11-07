package g2;

import h2.C0271b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Iterable, b2.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f2857k;

    public h(c cVar) {
        this.f2857k = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0271b(this.f2857k);
    }
}
