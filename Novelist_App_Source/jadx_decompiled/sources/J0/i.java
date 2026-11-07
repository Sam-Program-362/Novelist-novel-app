package J0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class i extends Z0.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f562a;

    /* renamed from: b, reason: collision with root package name */
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
        int b3 = dVar.b(context, i4);
        int i5 = f.f556e;
        if (b3 == 1 || b3 == 2 || b3 == 3 || b3 == 9) {
            Intent a3 = dVar.a(context, b3, "n");
            dVar.f(context, b3, a3 == null ? null : PendingIntent.getActivity(context, 0, a3, 201326592));
        }
    }
}
