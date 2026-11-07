package x0;

import a2.p;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494d extends a2.i implements Z1.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4693l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0495e f4694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0494d(C0495e c0495e, int i3) {
        super(0);
        this.f4693l = i3;
        this.f4694m = c0495e;
    }

    @Override // Z1.a
    public final Object a() {
        boolean z3;
        Class cls;
        boolean z4;
        boolean z5;
        switch (this.f4693l) {
            case 0:
                Class<?> loadClass = this.f4694m.f4695a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                a2.h.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                a2.h.d(method, "getBoundsMethod");
                if (method.getReturnType().equals(E2.a.t(p.a(Rect.class))) && Modifier.isPublic(method.getModifiers())) {
                    a2.h.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (method2.getReturnType().equals(E2.a.t(p.a(cls2))) && Modifier.isPublic(method2.getModifiers())) {
                        a2.h.d(method3, "getStateMethod");
                        if (method3.getReturnType().equals(E2.a.t(p.a(cls2))) && Modifier.isPublic(method3.getModifiers())) {
                            z3 = true;
                            return Boolean.valueOf(z3);
                        }
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case 1:
                C0495e c0495e = this.f4694m;
                try {
                    cls = c0495e.f4696b.b();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = c0495e.f4695a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                a2.h.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                a2.h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    a2.h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            case 2:
                Class<?> loadClass3 = this.f4694m.f4695a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                a2.h.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                a2.h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    a2.h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z5 = true;
                        return Boolean.valueOf(z5);
                    }
                }
                z5 = false;
                return Boolean.valueOf(z5);
            default:
                C0495e c0495e2 = this.f4694m;
                Class<?> loadClass4 = c0495e2.f4697c.f4546a.loadClass("androidx.window.extensions.WindowExtensions");
                a2.h.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = c0495e2.f4695a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                a2.h.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                a2.h.d(method8, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5));
        }
    }
}
