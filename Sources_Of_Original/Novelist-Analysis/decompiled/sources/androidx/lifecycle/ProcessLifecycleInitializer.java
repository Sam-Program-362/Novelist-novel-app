package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements p040n0.b {
    @Override // p040n0.b
    public final List a() {
        return P1.m.f1219k;
    }

    @Override // p040n0.b
    public final Object b(Context context) {
        a2.h.e(context, "context");
        p040n0.a aVarC = p040n0.a.c(context);
        a2.h.d(aVarC, "getInstance(context)");
        if (!aVarC.f4136b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0142p.f2155a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            a2.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0141o());
        }
        E e3 = E.f2117s;
        e3.getClass();
        e3.f2121o = new Handler();
        e3.f2122p.e(EnumC0138l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        a2.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new D(e3));
        return e3;
    }
}
