package C1;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class r implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f180a;

    static {
        q qVar = q.f177a;
        f180a = new r();
    }

    @Override // C1.n
    public final ByteBuffer a(Object obj) throws IOException {
        p pVar = new p();
        pVar.write(0);
        q.f177a.k(pVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(pVar.size());
        byteBufferAllocateDirect.put(pVar.a(), 0, pVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // C1.n
    public final ByteBuffer b(String str, String str2) throws IOException {
        p pVar = new p();
        pVar.write(1);
        q qVar = q.f177a;
        qVar.k(pVar, "error");
        qVar.k(pVar, str);
        qVar.k(pVar, null);
        qVar.k(pVar, str2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(pVar.size());
        byteBufferAllocateDirect.put(pVar.a(), 0, pVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // C1.n
    public final ByteBuffer c(String str, String str2, Object obj) throws IOException {
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
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(pVar.size());
        byteBufferAllocateDirect.put(pVar.a(), 0, pVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // C1.n
    public final A.c d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        q qVar = q.f177a;
        Object objE = qVar.e(byteBuffer);
        Object objE2 = qVar.e(byteBuffer);
        if (!(objE instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new A.c((String) objE, objE2, 11);
    }

    @Override // C1.n
    public final Object e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b3 = byteBuffer.get();
        if (b3 != 0) {
            if (b3 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objE = q.f177a.e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objE;
        }
        q qVar = q.f177a;
        Object objE2 = qVar.e(byteBuffer);
        Object objE3 = qVar.e(byteBuffer);
        Object objE4 = qVar.e(byteBuffer);
        if ((objE2 instanceof String) && ((objE3 == null || (objE3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new i((String) objE2, (String) objE3, objE4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // C1.n
    public final ByteBuffer f(A.c cVar) {
        p pVar = new p();
        q qVar = q.f177a;
        qVar.k(pVar, (String) cVar.f6l);
        qVar.k(pVar, cVar.f7m);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(pVar.size());
        byteBufferAllocateDirect.put(pVar.a(), 0, pVar.size());
        return byteBufferAllocateDirect;
    }
}
