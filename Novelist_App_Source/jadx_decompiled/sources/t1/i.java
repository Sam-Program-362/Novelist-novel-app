package t1;

import M1.RunnableC0053b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements InterfaceC0478f {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f4568a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f4569b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f4570c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f4568a = executorService;
    }

    @Override // t1.InterfaceC0478f
    public final void a(RunnableC0476d runnableC0476d) {
        this.f4569b.add(runnableC0476d);
        this.f4568a.execute(new RunnableC0053b(this, 11));
    }
}
