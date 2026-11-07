package s2;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e extends IOException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f4537l = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Serializable f4538k;

    public e(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f4538k = serializable;
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}
