package M0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class B implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f904a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f905b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f906c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f907d;

    /* renamed from: e, reason: collision with root package name */
    public final A f908e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D f910g;

    public B(D d3, A a3) {
        this.f910g = d3;
        this.f908e = a3;
    }

    public final J0.a a(String str, Executor executor) {
        D d3;
        Q0.a aVar;
        Context context;
        A a3;
        try {
            Intent a4 = t.a(this.f910g.f916b, this.f908e);
            this.f905b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(R0.a.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                d3 = this.f910g;
                aVar = d3.f918d;
                context = d3.f916b;
                a3 = this.f908e;
            } catch (Throwable th) {
                th = th;
            }
            try {
                boolean b3 = aVar.b(context, str, a4, this, executor);
                this.f906c = b3;
                if (b3) {
                    d3.f917c.sendMessageDelayed(d3.f917c.obtainMessage(1, a3), d3.f920f);
                    J0.a aVar2 = J0.a.f538p;
                    StrictMode.setVmPolicy(vmPolicy);
                    return aVar2;
                }
                this.f905b = 2;
                try {
                    d3.f918d.a(d3.f916b, this);
                } catch (IllegalArgumentException unused) {
                }
                J0.a aVar3 = new J0.a(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return aVar3;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th3;
            }
        } catch (s e3) {
            return e3.f989k;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        D d3 = this.f910g;
        synchronized (d3.f915a) {
            try {
                d3.f917c.removeMessages(1, this.f908e);
                this.f907d = iBinder;
                this.f909f = componentName;
                Iterator it2 = this.f904a.values().iterator();
                while (it2.hasNext()) {
                    ((ServiceConnection) it2.next()).onServiceConnected(componentName, iBinder);
                }
                this.f905b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        D d3 = this.f910g;
        synchronized (d3.f915a) {
            try {
                d3.f917c.removeMessages(1, this.f908e);
                this.f907d = null;
                this.f909f = componentName;
                Iterator it2 = this.f904a.values().iterator();
                while (it2.hasNext()) {
                    ((ServiceConnection) it2.next()).onServiceDisconnected(componentName);
                }
                this.f905b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
