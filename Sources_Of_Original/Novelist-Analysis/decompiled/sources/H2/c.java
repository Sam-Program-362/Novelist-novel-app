package H2;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F2.a f446b;

    public c(int i3) {
        this.f445a = i3;
        switch (i3) {
            case 1:
                this.f446b = new f();
                new ConcurrentHashMap();
                new ThreadLocal();
                new a();
                break;
            default:
                this.f446b = new B1.b(8);
                new ConcurrentHashMap();
                break;
        }
    }
}
