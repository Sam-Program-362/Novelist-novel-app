package t2;

import a.AbstractC0102a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends AbstractC0102a {

    /* renamed from: m, reason: collision with root package name */
    public final Object f4581m;

    public a(byte[] bArr) {
        super(23);
        Objects.requireNonNull(bArr, "origin");
        this.f4581m = bArr;
    }

    @Override // a.AbstractC0102a
    public final String toString() {
        return a.class.getSimpleName() + "[" + this.f4581m.toString() + "]";
    }
}
