package d0;

import android.graphics.Rect;
import android.view.View;
import java.util.LinkedHashMap;
import l0.AbstractC0410t;
import l0.C0404n;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0231b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2769a;

    public AbstractC0231b() {
        this.f2769a = new LinkedHashMap();
    }

    public static AbstractC0231b a(AbstractC0410t abstractC0410t, int i3) {
        if (i3 == 0) {
            return new C0404n(abstractC0410t, 0);
        }
        if (i3 == 1) {
            return new C0404n(abstractC0410t, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public AbstractC0231b(AbstractC0410t abstractC0410t) {
        new Rect();
        this.f2769a = abstractC0410t;
    }
}
