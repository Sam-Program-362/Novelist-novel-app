package J0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Z0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f563b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f563b = dVar;
        this.f562a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i3);
            return;
        }
        int i4 = e.f551a;
        d dVar = this.f563b;
        Context context = this.f562a;
        int iB = dVar.b(context, i4);
        int i5 = f.f556e;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = dVar.a(context, iB, "n");
            dVar.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
