package p057t1;

import M1.RunnableC0053b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f4568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f4569b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f4570c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f4568a = executorService;
    }

    @Override // p057t1.f
    public final void a(d dVar) {
        this.f4569b.add(dVar);
        this.f4568a.execute(new RunnableC0053b(this, 11));
    }
}
