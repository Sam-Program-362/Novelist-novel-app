package T1;

import a2.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends c implements a2.f {
    public final int n;

    public h(int i3, R1.c cVar) {
        super(cVar);
        this.n = i3;
    }

    @Override // a2.f
    public final int b() {
        return this.n;
    }

    @Override // T1.a
    public final String toString() {
        if (this.f1275k != null) {
            return super.toString();
        }
        p.f1714a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        a2.h.d(string, "renderLambdaToString(...)");
        return string;
    }
}
