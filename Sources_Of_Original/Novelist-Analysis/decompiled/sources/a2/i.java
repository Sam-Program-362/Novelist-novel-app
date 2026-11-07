package a2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements f, Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1708k;

    public i(int i3) {
        this.f1708k = i3;
    }

    @Override // a2.f
    public final int b() {
        return this.f1708k;
    }

    public final String toString() {
        p.f1714a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        h.d(string, "renderLambdaToString(...)");
        return string;
    }
}
