package q;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public abstract class g implements Future {
    public static final boolean n = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f4293o = Logger.getLogger(g.class.getName());

    /* renamed from: p, reason: collision with root package name */
    public static final S0.a f4294p;

    /* renamed from: q, reason: collision with root package name */
    public static final Object f4295q;

    /* renamed from: k, reason: collision with root package name */
    public volatile Object f4296k;

    /* renamed from: l, reason: collision with root package name */
    public volatile c f4297l;

    /* renamed from: m, reason: collision with root package name */
    public volatile f f4298m;

    static {
        S0.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "m"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "l"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "k"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f4294p = eVar;
        if (th != null) {
            f4293o.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4295q = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f4298m;
        } while (!f4294p.d(gVar, fVar, f.f4290c));
        while (fVar != null) {
            Thread thread = fVar.f4291a;
            if (thread != null) {
                fVar.f4291a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f4292b;
        }
        do {
            cVar = gVar.f4297l;
        } while (!f4294p.b(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f4284a;
            cVar.f4284a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f4284a;
            try {
                throw null;
            } catch (RuntimeException e3) {
                f4293o.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e3);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0445a) {
            Throwable th = ((C0445a) obj).f4282a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0446b) {
            ((AbstractC0446b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f4295q) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d3 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d3 == this ? "this future" : String.valueOf(d3));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f4296k;
        if (obj != null) {
            return false;
        }
        if (!f4294p.c(this, obj, n ? new C0445a(new CancellationException("Future.cancel() was called."), z3) : z3 ? C0445a.f4280b : C0445a.f4281c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f4291a = null;
        while (true) {
            f fVar2 = this.f4298m;
            if (fVar2 == f.f4290c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f4292b;
                if (fVar2.f4291a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f4292b = fVar4;
                    if (fVar3.f4291a == null) {
                        break;
                    }
                } else if (!f4294p.d(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        f fVar = f.f4290c;
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4296k;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f4298m;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    S0.a aVar = f4294p;
                    aVar.y(fVar3, fVar2);
                    if (aVar.d(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4296k;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar2 = this.f4298m;
                    }
                } while (fVar2 != fVar);
            }
            return c(this.f4296k);
        }
        while (nanos > 0) {
            Object obj3 = this.f4296k;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j3 + StringUtils.SPACE + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String j4 = B1.e.j(str, " (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z3 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = j4 + convert + StringUtils.SPACE + lowerCase;
                if (z3) {
                    str2 = B1.e.j(str2, ",");
                }
                j4 = B1.e.j(str2, StringUtils.SPACE);
            }
            if (z3) {
                j4 = j4 + nanos2 + " nanoseconds ";
            }
            str = B1.e.j(j4, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(B1.e.j(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4296k instanceof C0445a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4296k != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4296k instanceof C0445a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        f fVar = f.f4290c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4296k;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar2 = this.f4298m;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    S0.a aVar = f4294p;
                    aVar.y(fVar3, fVar2);
                    if (aVar.d(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4296k;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar2 = this.f4298m;
                } while (fVar2 != fVar);
            }
            return c(this.f4296k);
        }
        throw new InterruptedException();
    }
}
