package n2;

import a.AbstractC0102a;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4177a = 0;

    static {
        Object i3;
        Object i4;
        Exception exc = new Exception();
        String simpleName = AbstractC0102a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            i3 = T1.a.class.getCanonicalName();
        } catch (Throwable th) {
            i3 = H2.h.i(th);
        }
        if (O1.d.a(i3) != null) {
            i3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            i4 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            i4 = H2.h.i(th2);
        }
        if (O1.d.a(i4) != null) {
            i4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
