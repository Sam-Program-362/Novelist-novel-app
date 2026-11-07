package i;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0279b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f2915c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f2916a;

    /* renamed from: b, reason: collision with root package name */
    public Method f2917b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f2916a;
        Method method = this.f2917b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
