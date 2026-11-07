package p064x0;

import Z1.a;
import a2.h;
import a2.i;
import a2.p;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f4694m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i3) {
        super(0);
        this.f4693l = i3;
        this.f4694m = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x017b  */
    @Override // Z1.a
    public final Object a() throws NoSuchMethodException, ClassNotFoundException {
        boolean z3;
        Class clsB;
        boolean z4;
        boolean z5;
        switch (this.f4693l) {
            case 0:
                Class<?> clsLoadClass = this.f4694m.f4695a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                h.d(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = clsLoadClass.getMethod("getBounds", null);
                Method method2 = clsLoadClass.getMethod("getType", null);
                Method method3 = clsLoadClass.getMethod("getState", null);
                h.d(method, "getBoundsMethod");
                if (method.getReturnType().equals(E2.a.t(p.a(Rect.class))) && Modifier.isPublic(method.getModifiers())) {
                    h.d(method2, "getTypeMethod");
                    Class cls = Integer.TYPE;
                    if (method2.getReturnType().equals(E2.a.t(p.a(cls))) && Modifier.isPublic(method2.getModifiers())) {
                        h.d(method3, "getStateMethod");
                        if (method3.getReturnType().equals(E2.a.t(p.a(cls))) && Modifier.isPublic(method3.getModifiers())) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 1:
                e eVar = this.f4694m;
                try {
                    clsB = eVar.f4696b.b();
                    break;
                } catch (ClassNotFoundException unused) {
                    clsB = null;
                }
                if (clsB == null) {
                    return Boolean.FALSE;
                }
                Class<?> clsLoadClass2 = eVar.f4695a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d(clsLoadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = clsLoadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, clsB);
                Method method5 = clsLoadClass2.getMethod("removeWindowLayoutInfoListener", clsB);
                h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 2:
                Class<?> clsLoadClass3 = this.f4694m.f4695a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d(clsLoadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = clsLoadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = clsLoadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            default:
                e eVar2 = this.f4694m;
                Class<?> clsLoadClass4 = eVar2.f4697c.f4546a.loadClass("androidx.window.extensions.WindowExtensions");
                h.d(clsLoadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = clsLoadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass5 = eVar2.f4695a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d(clsLoadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                h.d(method8, "getWindowLayoutComponentMethod");
                return Boolean.valueOf(Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(clsLoadClass5));
        }
    }
}
