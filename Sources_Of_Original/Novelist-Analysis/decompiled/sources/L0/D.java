package L0;

import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class D extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f787a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f787a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return 0L;
            default:
                return new Random();
        }
    }
}
