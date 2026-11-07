package a2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class i implements f, Serializable {

    /* renamed from: k, reason: collision with root package name */
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
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
