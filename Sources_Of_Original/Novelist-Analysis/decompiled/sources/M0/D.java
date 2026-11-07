package M0;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f912g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static D f913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HandlerThread f914i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f915a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Z0.d f917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q0.a f918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f920f;

    public D(Context context, Looper looper) {
        C c3 = new C(this);
        this.f916b = context.getApplicationContext();
        Z0.d dVar = new Z0.d(looper, c3);
        Looper.getMainLooper();
        this.f917c = dVar;
        if (Q0.a.f1231b == null) {
            synchronized (Q0.a.f1230a) {
                try {
                    if (Q0.a.f1231b == null) {
                        Q0.a aVar = new Q0.a();
                        new ConcurrentHashMap();
                        Q0.a.f1231b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Q0.a aVar2 = Q0.a.f1231b;
        r.f(aVar2);
        this.f918d = aVar2;
        this.f919e = 5000L;
        this.f920f = 300000L;
    }

    public final J0.a a(A a3, w wVar, String str) {
        J0.a aVarA;
        HashMap map = this.f915a;
        synchronized (map) {
            try {
                B b3 = (B) map.get(a3);
                if (b3 == null) {
                    b3 = new B(this, a3);
                    b3.f904a.put(wVar, wVar);
                    aVarA = b3.a(str, null);
                    map.put(a3, b3);
                } else {
                    this.f917c.removeMessages(0, a3);
                    if (b3.f904a.containsKey(wVar)) {
                        String string = a3.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    b3.f904a.put(wVar, wVar);
                    int i3 = b3.f905b;
                    if (i3 == 1) {
                        wVar.onServiceConnected(b3.f909f, b3.f907d);
                    } else if (i3 == 2) {
                        aVarA = b3.a(str, null);
                    }
                    aVarA = null;
                }
                if (b3.f906c) {
                    return J0.a.f538p;
                }
                if (aVarA == null) {
                    aVarA = new J0.a(-1, null, null);
                }
                return aVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z3) {
        A a3 = new A(str, z3);
        r.g(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f915a;
        synchronized (map) {
            try {
                B b3 = (B) map.get(a3);
                if (b3 == null) {
                    String string = a3.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!b3.f904a.containsKey(serviceConnection)) {
                    String string2 = a3.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                b3.f904a.remove(serviceConnection);
                if (b3.f904a.isEmpty()) {
                    this.f917c.sendMessageDelayed(this.f917c.obtainMessage(0, a3), this.f919e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
