package androidx.profileinstaller;

import M1.A;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import n0.InterfaceC0434b;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0434b {
    @Override // n0.InterfaceC0434b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // n0.InterfaceC0434b
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: j0.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0321g(applicationContext, 0), new Random().nextInt(Math.max(PipesIterator.DEFAULT_QUEUE_SIZE, 1)) + 5000);
            }
        });
        return new A(18);
    }
}
