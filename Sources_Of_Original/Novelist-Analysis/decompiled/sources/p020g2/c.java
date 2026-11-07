package p020g2;

import I1.l;
import M1.P;
import O1.a;
import a2.h;
import java.util.Iterator;
import p024h2.b;
import p024h2.m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2853a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f2855c;

    public c(l lVar, P p3) {
        this.f2854b = lVar;
        this.f2855c = p3;
    }

    @Override // p020g2.d
    public final Iterator iterator() {
        switch (this.f2853a) {
            case 0:
                return new b(this);
            default:
                return new b(this);
        }
    }

    public c(CharSequence charSequence, m mVar) {
        h.e(charSequence, "input");
        this.f2854b = charSequence;
        this.f2855c = mVar;
    }
}
