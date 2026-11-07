package L0;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: L0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0043c extends Z0.d {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            if (i3 != 2) {
                Log.wtf("BasePendingResult", B1.e.g("Don't know how to handle message: ", i3), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).N(Status.f2724r);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            throw new ClassCastException();
        }
        try {
            throw null;
        } catch (RuntimeException e3) {
            D d3 = BasePendingResult.f2729l;
            throw e3;
        }
    }
}
