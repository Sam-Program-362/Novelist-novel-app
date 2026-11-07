package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120q {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2089c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final X f2090a = X.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2091b;

    static {
        new C0120q(0);
    }

    public C0120q() {
    }

    public static void b(C0115l c0115l, q0 q0Var, int i3, Object obj) {
        if (q0Var == q0.n) {
            c0115l.s0(i3, 3);
            ((AbstractC0104a) obj).b(c0115l);
            c0115l.s0(i3, 4);
        }
        c0115l.s0(i3, q0Var.f2096l);
        switch (q0Var.ordinal()) {
            case 0:
                c0115l.m0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0115l.k0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0115l.w0(((Long) obj).longValue());
                break;
            case 3:
                c0115l.w0(((Long) obj).longValue());
                break;
            case 4:
                c0115l.o0(((Integer) obj).intValue());
                break;
            case 5:
                c0115l.m0(((Long) obj).longValue());
                break;
            case 6:
                c0115l.k0(((Integer) obj).intValue());
                break;
            case 7:
                c0115l.e0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0110g)) {
                    c0115l.r0((String) obj);
                    break;
                } else {
                    c0115l.i0((C0110g) obj);
                    break;
                }
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                ((AbstractC0104a) obj).b(c0115l);
                break;
            case 10:
                AbstractC0104a abstractC0104a = (AbstractC0104a) obj;
                c0115l.getClass();
                c0115l.u0(((AbstractC0124v) abstractC0104a).a(null));
                abstractC0104a.b(c0115l);
                break;
            case 11:
                if (!(obj instanceof C0110g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0115l.u0(length);
                    c0115l.f0(bArr, 0, length);
                    break;
                } else {
                    c0115l.i0((C0110g) obj);
                    break;
                }
            case 12:
                c0115l.u0(((Integer) obj).intValue());
                break;
            case 13:
                c0115l.o0(((Integer) obj).intValue());
                break;
            case 14:
                c0115l.k0(((Integer) obj).intValue());
                break;
            case 15:
                c0115l.m0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0115l.u0((intValue >> 31) ^ (intValue << 1));
                break;
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                long longValue = ((Long) obj).longValue();
                c0115l.w0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f2091b) {
            return;
        }
        X x = this.f2090a;
        int size = x.f2016k.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry c3 = x.c(i3);
            if (c3.getValue() instanceof AbstractC0124v) {
                AbstractC0124v abstractC0124v = (AbstractC0124v) c3.getValue();
                abstractC0124v.getClass();
                S s3 = S.f2003c;
                s3.getClass();
                s3.a(abstractC0124v.getClass()).d(abstractC0124v);
                abstractC0124v.h();
            }
        }
        if (!x.f2018m) {
            if (x.f2016k.size() > 0) {
                x.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = x.d().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!x.f2018m) {
            x.f2017l = x.f2017l.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x.f2017l);
            x.f2019o = x.f2019o.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(x.f2019o);
            x.f2018m = true;
        }
        this.f2091b = true;
    }

    public final Object clone() {
        C0120q c0120q = new C0120q();
        X x = this.f2090a;
        if (x.f2016k.size() > 0) {
            Map.Entry c3 = x.c(0);
            if (c3.getKey() != null) {
                throw new ClassCastException();
            }
            c3.getValue();
            throw null;
        }
        Iterator it2 = x.d().iterator();
        if (!it2.hasNext()) {
            return c0120q;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0120q) {
            return this.f2090a.equals(((C0120q) obj).f2090a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2090a.hashCode();
    }

    public C0120q(int i3) {
        a();
        a();
    }
}
