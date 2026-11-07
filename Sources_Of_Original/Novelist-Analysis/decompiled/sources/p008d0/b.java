package p008d0;

import android.graphics.Rect;
import android.view.View;
import java.util.LinkedHashMap;
import p035l0.n;
import p035l0.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2769a;

    public b() {
        this.f2769a = new LinkedHashMap();
    }

    public static b a(t tVar, int i3) {
        if (i3 == 0) {
            return new n(tVar, 0);
        }
        if (i3 == 1) {
            return new n(tVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public b(t tVar) {
        new Rect();
        this.f2769a = tVar;
    }
}
