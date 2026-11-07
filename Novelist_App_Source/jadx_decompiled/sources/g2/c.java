package g2;

import I1.l;
import M1.P;
import h2.C0271b;
import h2.m;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2853a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2854b;

    /* renamed from: c, reason: collision with root package name */
    public final O1.a f2855c;

    public c(l lVar, P p3) {
        this.f2854b = lVar;
        this.f2855c = p3;
    }

    @Override // g2.d
    public final Iterator iterator() {
        switch (this.f2853a) {
            case 0:
                return new C0256b(this);
            default:
                return new C0271b(this);
        }
    }

    public c(CharSequence charSequence, m mVar) {
        a2.h.e(charSequence, "input");
        this.f2854b = charSequence;
        this.f2855c = mVar;
    }
}
