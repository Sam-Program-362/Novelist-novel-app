package s;

import D.F;
import D.G;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0144s;
import androidx.lifecycle.u;
import it.returntrue.novelist.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Activity implements InterfaceC0144s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f4439k = new u(this);

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zBooleanValue;
        a2.h.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        a2.h.d(decorView, "getDecorView(...)");
        if (H2.h.m(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z3 = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!H2.h.f460c) {
                    try {
                        H2.h.f461d = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    H2.h.f460c = true;
                }
                Method method = H2.h.f461d;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, keyEvent);
                        if (objInvoke == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        Field field = G.f187a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = F.f183d;
            F f3 = (F) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (f3 == null) {
                f3 = new F();
                f3.f184a = null;
                f3.f185b = null;
                f3.f186c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, f3);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = f3.f184a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = F.f183d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (f3.f184a == null) {
                                f3.f184a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = F.f183d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    f3.f184a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        f3.f184a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            View viewA = f3.a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (f3.f185b == null) {
                        f3.f185b = new SparseArray();
                    }
                    f3.f185b.put(keyCode, new WeakReference(viewA));
                }
            }
            if (viewA != null) {
                z3 = true;
            }
        }
        if (z3) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        a2.h.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        a2.h.d(decorView, "getDecorView(...)");
        if (H2.h.m(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = H.f2125l;
        androidx.lifecycle.F.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        a2.h.e(bundle, "outState");
        this.f4439k.g();
        super.onSaveInstanceState(bundle);
    }
}
