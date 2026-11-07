package r1;

import M0.E;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class s implements u {

    /* renamed from: k, reason: collision with root package name */
    public final C1.f f4423k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f4424l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f4425m;
    public final t n;

    public s(C1.f fVar) {
        HashMap hashMap = new HashMap();
        this.f4425m = hashMap;
        this.n = new t();
        this.f4423k = fVar;
        E1.a aVar = y.f4430a;
        x xVar = new x();
        xVar.f4429a = false;
        x xVar2 = new x[]{xVar}[0];
        xVar2.getClass();
        hashMap.put(4294967556L, xVar2);
    }

    public final void a(p pVar, final E e3) {
        long j3;
        long j4;
        byte[] bArr = null;
        C1.e eVar = e3 == null ? null : new C1.e() { // from class: r1.q
            @Override // C1.e
            public final void a(ByteBuffer byteBuffer) {
                Boolean bool = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        bool = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                E.this.a(bool.booleanValue());
            }
        };
        try {
            String str = pVar.f4417g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(pVar.f4411a);
            int i3 = pVar.f4412b;
            if (i3 == 1) {
                j3 = 0;
            } else if (i3 == 2) {
                j3 = 1;
            } else {
                if (i3 != 3) {
                    throw null;
                }
                j3 = 2;
            }
            allocateDirect.putLong(j3);
            allocateDirect.putLong(pVar.f4413c);
            allocateDirect.putLong(pVar.f4414d);
            allocateDirect.putLong(pVar.f4415e ? 1L : 0L);
            int i4 = pVar.f4416f;
            if (i4 == 1) {
                j4 = 0;
            } else if (i4 == 2) {
                j4 = 1;
            } else if (i4 == 3) {
                j4 = 2;
            } else if (i4 == 4) {
                j4 = 3;
            } else {
                if (i4 != 5) {
                    throw null;
                }
                j4 = 4;
            }
            allocateDirect.putLong(j4);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f4423k.f("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e5  */
    @Override // r1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final android.view.KeyEvent r30, M0.E r31) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.s.b(android.view.KeyEvent, M0.E):void");
    }

    public final void c(boolean z3, Long l3, Long l4, long j3) {
        p pVar = new p();
        pVar.f4411a = j3;
        pVar.f4412b = z3 ? 1 : 2;
        pVar.f4414d = l3.longValue();
        pVar.f4413c = l4.longValue();
        pVar.f4417g = null;
        pVar.f4415e = true;
        pVar.f4416f = 1;
        if (l4.longValue() != 0 && l3.longValue() != 0) {
            if (!z3) {
                l3 = null;
            }
            d(l4, l3);
        }
        a(pVar, null);
    }

    public final void d(Long l3, Long l4) {
        HashMap hashMap = this.f4424l;
        if (l4 != null) {
            if (((Long) hashMap.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l3)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
