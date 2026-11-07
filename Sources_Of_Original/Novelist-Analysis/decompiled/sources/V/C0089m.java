package V;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: V.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0089m extends a2.i implements Z1.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f1450m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0089m(N n, int i3) {
        super(0);
        this.f1449l = i3;
        this.f1450m = n;
    }

    @Override // Z1.a
    public final Object a() throws IOException {
        switch (this.f1449l) {
            case 0:
                return ((W) this.f1450m.f1349t.a()).f1376b;
            default:
                T t3 = this.f1450m.f1341k;
                File canonicalFile = ((File) t3.f1363b.a()).getCanonicalFile();
                synchronized (T.f1361d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = T.f1360c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    a2.h.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new W(canonicalFile, (i0) t3.f1362a.f(canonicalFile), new S(canonicalFile, 0));
        }
    }
}
