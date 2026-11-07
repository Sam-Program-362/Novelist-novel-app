package i2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: i2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0200h extends C0207o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3006c = AtomicIntegerFieldUpdater.newUpdater(C0200h.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0200h(C0199g c0199g, Throwable th, boolean z3) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0199g + " was cancelled normally");
        }
        super(th, z3);
        this._resumed$volatile = 0;
    }
}
