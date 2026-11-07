package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2089c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f2090a = X.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2091b;

    static {
        new C0118q(0);
    }

    public C0118q() {
    }

    public static void b(C0113l c0113l, q0 q0Var, int i3, Object obj) {
        if (q0Var == q0.n) {
            c0113l.s0(i3, 3);
            ((AbstractC0102a) obj).b(c0113l);
            c0113l.s0(i3, 4);
        }
        c0113l.s0(i3, q0Var.f2096l);
        switch (q0Var.ordinal()) {
            case 0:
                c0113l.m0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0113l.k0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0113l.w0(((Long) obj).longValue());
                break;
            case 3:
                c0113l.w0(((Long) obj).longValue());
                break;
            case 4:
                c0113l.o0(((Integer) obj).intValue());
                break;
            case 5:
                c0113l.m0(((Long) obj).longValue());
                break;
            case 6:
                c0113l.k0(((Integer) obj).intValue());
                break;
            case 7:
                c0113l.e0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0108g)) {
                    c0113l.r0((String) obj);
                } else {
                    c0113l.i0((C0108g) obj);
                }
                break;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                ((AbstractC0102a) obj).b(c0113l);
                break;
            case 10:
                AbstractC0102a abstractC0102a = (AbstractC0102a) obj;
                c0113l.getClass();
                c0113l.u0(((AbstractC0122v) abstractC0102a).a(null));
                abstractC0102a.b(c0113l);
                break;
            case 11:
                if (!(obj instanceof C0108g)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0113l.u0(length);
                    c0113l.f0(bArr, 0, length);
                } else {
                    c0113l.i0((C0108g) obj);
                }
                break;
            case 12:
                c0113l.u0(((Integer) obj).intValue());
                break;
            case 13:
                c0113l.o0(((Integer) obj).intValue());
                break;
            case 14:
                c0113l.k0(((Integer) obj).intValue());
                break;
            case 15:
                c0113l.m0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0113l.u0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                c0113l.w0((jLongValue >> 63) ^ (jLongValue << 1));
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
            Map.Entry entryC = x.c(i3);
            if (entryC.getValue() instanceof AbstractC0122v) {
                AbstractC0122v abstractC0122v = (AbstractC0122v) entryC.getValue();
                abstractC0122v.getClass();
                S s3 = S.f2003c;
                s3.getClass();
                s3.a(abstractC0122v.getClass()).d(abstractC0122v);
                abstractC0122v.h();
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
        C0118q c0118q = new C0118q();
        X x = this.f2090a;
        if (x.f2016k.size() > 0) {
            Map.Entry entryC = x.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it2 = x.d().iterator();
        if (!it2.hasNext()) {
            return c0118q;
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
        if (obj instanceof C0118q) {
            return this.f2090a.equals(((C0118q) obj).f2090a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2090a.hashCode();
    }

    public C0118q(int i3) {
        a();
        a();
    }
}
