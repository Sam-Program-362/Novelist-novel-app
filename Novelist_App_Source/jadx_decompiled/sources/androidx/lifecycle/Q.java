package androidx.lifecycle;

/* loaded from: classes.dex */
public interface Q {
    default P a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default P b(Class cls, d0.c cVar) {
        return a(cls);
    }
}
