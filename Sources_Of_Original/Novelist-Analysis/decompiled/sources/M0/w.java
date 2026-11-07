package M0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f995b;

    public w(com.google.android.gms.common.internal.a aVar, int i3) {
        this.f995b = aVar;
        this.f994a = i3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i3;
        int i4;
        com.google.android.gms.common.internal.a aVar = this.f995b;
        if (iBinder == null) {
            synchronized (aVar.f2744f) {
                i3 = aVar.f2751m;
            }
            if (i3 == 3) {
                aVar.f2757t = true;
                i4 = 5;
            } else {
                i4 = 4;
            }
            u uVar = aVar.f2743e;
            uVar.sendMessage(uVar.obtainMessage(i4, aVar.f2758v.get(), 16));
            return;
        }
        synchronized (aVar.f2745g) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar.f2746h = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q)) ? new q(iBinder) : (q) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar2 = this.f995b;
        int i5 = this.f994a;
        aVar2.getClass();
        y yVar = new y(aVar2, 0, null);
        u uVar2 = aVar2.f2743e;
        uVar2.sendMessage(uVar2.obtainMessage(7, i5, -1, yVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar = this.f995b;
        synchronized (aVar.f2745g) {
            aVar.f2746h = null;
        }
        com.google.android.gms.common.internal.a aVar2 = this.f995b;
        int i3 = this.f994a;
        u uVar = aVar2.f2743e;
        uVar.sendMessage(uVar.obtainMessage(6, i3, 1));
    }
}
