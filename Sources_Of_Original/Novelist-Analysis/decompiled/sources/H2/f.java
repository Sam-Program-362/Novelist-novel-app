package H2;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class f implements F2.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f455k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f456l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedBlockingQueue f457m = new LinkedBlockingQueue();

    @Override // F2.a
    public final synchronized F2.b a(String str) {
        e eVar;
        eVar = (e) this.f456l.get(str);
        if (eVar == null) {
            eVar = new e(str, this.f457m, this.f455k);
            this.f456l.put(str, eVar);
        }
        return eVar;
    }
}
