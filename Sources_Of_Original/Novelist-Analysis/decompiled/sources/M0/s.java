package M0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends Exception {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J0.a f989k;

    public s(J0.a aVar) {
        r.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (aVar.f540l == 0 || aVar.f541m == null) ? false : true);
        this.f989k = aVar;
    }
}
