package M0;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class u extends Z0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 1);
        this.f991a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        p pVar;
        com.google.android.gms.common.internal.a aVar = this.f991a;
        if (aVar.f2758v.get() != message.arg1) {
            int i3 = message.what;
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (pVar = (p) message.obj) != null) {
                synchronized (pVar) {
                    pVar.f979a = null;
                }
                com.google.android.gms.common.internal.a aVar2 = pVar.f981c;
                synchronized (aVar2.f2749k) {
                    aVar2.f2749k.remove(pVar);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if ((i4 == 1 || i4 == 7 || i4 == 4 || i4 == 5) && !aVar.g()) {
            p pVar2 = (p) message.obj;
            if (pVar2 != null) {
                synchronized (pVar2) {
                    pVar2.f979a = null;
                }
                com.google.android.gms.common.internal.a aVar3 = pVar2.f981c;
                synchronized (aVar3.f2749k) {
                    aVar3.f2749k.remove(pVar2);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 == 4) {
            aVar.f2756s = new J0.a(message.arg2, null, null);
            if (!aVar.f2757t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    if (!aVar.f2757t) {
                        aVar.w(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            J0.a aVar4 = aVar.f2756s;
            if (aVar4 == null) {
                aVar4 = new J0.a(8, null, null);
            }
            aVar.f2747i.a(aVar4);
            System.currentTimeMillis();
            return;
        }
        if (i5 == 5) {
            J0.a aVar5 = aVar.f2756s;
            if (aVar5 == null) {
                aVar5 = new J0.a(8, null, null);
            }
            aVar.f2747i.a(aVar5);
            System.currentTimeMillis();
            return;
        }
        if (i5 == 3) {
            Object obj = message.obj;
            aVar.f2747i.a(new J0.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i5 == 6) {
            aVar.w(5, null);
            h hVar = aVar.n;
            if (hVar != null) {
                ((K0.j) hVar.f959a).d(message.arg2);
            }
            System.currentTimeMillis();
            aVar.v(5, 1, null);
            return;
        }
        if (i5 == 2 && !aVar.a()) {
            p pVar3 = (p) message.obj;
            if (pVar3 != null) {
                synchronized (pVar3) {
                    pVar3.f979a = null;
                }
                com.google.android.gms.common.internal.a aVar6 = pVar3.f981c;
                synchronized (aVar6.f2749k) {
                    aVar6.f2749k.remove(pVar3);
                }
                return;
            }
            return;
        }
        int i6 = message.what;
        if (i6 != 2 && i6 != 1 && i6 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i6);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        p pVar4 = (p) message.obj;
        synchronized (pVar4) {
            try {
                bool = pVar4.f979a;
                if (pVar4.f980b) {
                    String obj2 = pVar4.toString();
                    StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(obj2);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar7 = pVar4.f984f;
            int i7 = pVar4.f982d;
            if (i7 != 0) {
                aVar7.w(1, null);
                Bundle bundle = pVar4.f983e;
                pVar4.b(new J0.a(i7, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!pVar4.a()) {
                aVar7.w(1, null);
                pVar4.b(new J0.a(8, null, null));
            }
        }
        synchronized (pVar4) {
            pVar4.f980b = true;
        }
        synchronized (pVar4) {
            pVar4.f979a = null;
        }
        com.google.android.gms.common.internal.a aVar8 = pVar4.f981c;
        synchronized (aVar8.f2749k) {
            aVar8.f2749k.remove(pVar4);
        }
    }
}
