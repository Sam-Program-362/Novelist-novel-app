package Z0;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class d extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Looper looper, int i3) {
        super(looper);
        switch (i3) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
