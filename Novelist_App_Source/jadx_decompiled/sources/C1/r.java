package C1;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class r implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final r f180a;

    static {
        q qVar = q.f177a;
        f180a = new r();
    }

    @Override // C1.n
    public final ByteBuffer a(Object obj) {
        p pVar = new p();
        pVar.write(0);
        q.f177a.k(pVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pVar.size());
        allocateDirect.put(pVar.a(), 0, pVar.size());
        return allocateDirect;
    }

    @Override // C1.n
    public final ByteBuffer b(String str, String str2) {
        p pVar = new p();
        pVar.write(1);
        q qVar = q.f177a;
        qVar.k(pVar, "error");
        qVar.k(pVar, str);
        qVar.k(pVar, null);
        qVar.k(pVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pVar.size());
        allocateDirect.put(pVar.a(), 0, pVar.size());
        return allocateDirect;
    }

    @Override // C1.n
    public final ByteBuffer c(String str, String str2, Object obj) {
        p pVar = new p();
        pVar.write(1);
        q qVar = q.f177a;
        qVar.k(pVar, str);
        qVar.k(pVar, str2);
        if (obj instanceof Throwable) {
            qVar.k(pVar, Log.getStackTraceString((Throwable) obj));
        } else {
            qVar.k(pVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pVar.size());
        allocateDirect.put(pVar.a(), 0, pVar.size());
        return allocateDirect;
    }

    @Override // C1.n
    public final A.c d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        q qVar = q.f177a;
        Object e3 = qVar.e(byteBuffer);
        Object e4 = qVar.e(byteBuffer);
        if (!(e3 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new A.c((String) e3, e4, 11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // C1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L46
            goto L1e
        L11:
            C1.q r0 = C1.q.f177a
            java.lang.Object r0 = r0.e(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            C1.q r0 = C1.q.f177a
            java.lang.Object r1 = r0.e(r5)
            java.lang.Object r2 = r0.e(r5)
            java.lang.Object r0 = r0.e(r5)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L46
            if (r2 == 0) goto L36
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L46
        L36:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L46
            C1.i r5 = new C1.i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            r5.<init>(r1, r2, r0)
            throw r5
        L46:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.r.e(java.nio.ByteBuffer):java.lang.Object");
    }

    @Override // C1.n
    public final ByteBuffer f(A.c cVar) {
        p pVar = new p();
        q qVar = q.f177a;
        qVar.k(pVar, (String) cVar.f6l);
        qVar.k(pVar, cVar.f7m);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pVar.size());
        allocateDirect.put(pVar.a(), 0, pVar.size());
        return allocateDirect;
    }
}
