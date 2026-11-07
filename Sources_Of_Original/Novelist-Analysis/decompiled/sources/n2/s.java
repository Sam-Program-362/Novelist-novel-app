package n2;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4177a = 0;

    static {
        Object objI;
        Object objI2;
        Exception exc = new Exception();
        String simpleName = p000a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objI = T1.a.class.getCanonicalName();
        } catch (Throwable th) {
            objI = H2.h.i(th);
        }
        if (O1.d.a(objI) != null) {
            objI = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objI2 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            objI2 = H2.h.i(th2);
        }
        if (O1.d.a(objI2) != null) {
            objI2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
