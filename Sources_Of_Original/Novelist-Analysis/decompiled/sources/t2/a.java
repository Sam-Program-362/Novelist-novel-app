package t2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p000a.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f4581m;

    public a(byte[] bArr) {
        super(23);
        Objects.requireNonNull(bArr, "origin");
        this.f4581m = bArr;
    }

    @Override // p000a.a
    public final String toString() {
        return a.class.getSimpleName() + "[" + this.f4581m.toString() + "]";
    }
}
