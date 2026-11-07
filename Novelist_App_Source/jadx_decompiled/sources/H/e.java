package H;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface e {
    boolean isAvailableOnDevice();

    void onClearCredential(a aVar, CancellationSignal cancellationSignal, Executor executor, d dVar);

    void onGetCredential(Context context, k kVar, CancellationSignal cancellationSignal, Executor executor, d dVar);
}
