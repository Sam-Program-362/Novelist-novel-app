package i2;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class O extends CancellationException {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient W f2978k;

    public O(String str, Throwable th, W w3) {
        super(str);
        this.f2978k = w3;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o2 = (O) obj;
        return a2.h.a(o2.getMessage(), getMessage()) && a2.h.a(o2.f2978k, this.f2978k) && a2.h.a(o2.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        a2.h.b(message);
        int iHashCode = (this.f2978k.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f2978k;
    }
}
