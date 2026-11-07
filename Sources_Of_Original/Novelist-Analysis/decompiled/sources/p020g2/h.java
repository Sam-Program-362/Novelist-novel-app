package p020g2;

import b2.a;
import java.util.Iterator;
import p024h2.b;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterable, a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f2857k;

    public h(c cVar) {
        this.f2857k = cVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2857k);
    }
}
