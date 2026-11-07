package M0;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class C implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f911a;

    public /* synthetic */ C(D d3) {
        this.f911a = d3;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            D d3 = this.f911a;
            synchronized (d3.f915a) {
                try {
                    A a3 = (A) message.obj;
                    B b3 = (B) d3.f915a.get(a3);
                    if (b3 != null && b3.f904a.isEmpty()) {
                        if (b3.f906c) {
                            A a4 = b3.f908e;
                            D d4 = b3.f910g;
                            d4.f917c.removeMessages(1, a4);
                            d4.f918d.a(d4.f916b, b3);
                            b3.f906c = false;
                            b3.f905b = 2;
                        }
                        d3.f915a.remove(a3);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        D d5 = this.f911a;
        synchronized (d5.f915a) {
            try {
                A a5 = (A) message.obj;
                B b4 = (B) d5.f915a.get(a5);
                if (b4 != null && b4.f905b == 3) {
                    String valueOf = String.valueOf(a5);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = b4.f909f;
                    if (componentName == null) {
                        a5.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = a5.f902b;
                        r.f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    b4.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
