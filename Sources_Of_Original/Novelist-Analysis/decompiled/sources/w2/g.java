package w2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g extends t2.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f4676o = 0;
    public int n;

    public final void W(byte[] bArr) {
        Objects.requireNonNull(bArr, "origin");
        this.n = bArr.length;
        this.f4582m = new t2.a(bArr);
    }
}
