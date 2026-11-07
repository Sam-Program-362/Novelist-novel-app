package V;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends a2.i implements Z1.l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Q f1357l = new Q(1);

    @Override // Z1.l
    public final Object f(Object obj) {
        File file = (File) obj;
        a2.h.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        a2.h.d(absolutePath, "file.canonicalFile.absolutePath");
        return new i0(absolutePath);
    }
}
