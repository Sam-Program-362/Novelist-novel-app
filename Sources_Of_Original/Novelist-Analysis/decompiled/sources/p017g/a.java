package p017g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import p031k.S;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f2826a = null;

    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    public static Drawable a(Context context, int i3) {
        return S.b().c(context, i3);
    }
}
