package p052r1;

import A.l;
import C1.e;
import C1.f;
import E1.a;
import M0.E;
import X.j;
import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class s implements u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f4423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f4424l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f4425m;
    public final t n;

    public s(f fVar) {
        HashMap map = new HashMap();
        this.f4425m = map;
        this.n = new t();
        this.f4423k = fVar;
        a aVar = y.f4430a;
        x xVar = new x();
        xVar.f4429a = false;
        x xVar2 = new x[]{xVar}[0];
        xVar2.getClass();
        map.put(4294967556L, xVar2);
    }

    public final void a(p pVar, final E e3) {
        long j3;
        long j4;
        byte[] bytes = null;
        e eVar = e3 == null ? null : new e() { // from class: r1.q
            @Override // C1.e
            public final void a(ByteBuffer byteBuffer) {
                Boolean boolValueOf = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                e3.a(boolValueOf.booleanValue());
            }
        };
        try {
            String str = pVar.f4417g;
            if (str != null) {
                bytes = str.getBytes("UTF-8");
            }
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(pVar.f4411a);
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
            byteBufferAllocateDirect.putLong(j3);
            byteBufferAllocateDirect.putLong(pVar.f4413c);
            byteBufferAllocateDirect.putLong(pVar.f4414d);
            byteBufferAllocateDirect.putLong(pVar.f4415e ? 1L : 0L);
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
            byteBufferAllocateDirect.putLong(j4);
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            this.f4423k.f("flutter/keydata", byteBufferAllocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:142:0x02d6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052r1.u
    public final void b(final KeyEvent keyEvent, E e3) {
        Long lValueOf;
        boolean z3;
        Long l3;
        int i3;
        String str;
        int i4;
        int i5;
        x xVar;
        int i6;
        char cCharValue;
        String str2;
        HashMap map;
        int i7;
        final long j3;
        int i8;
        int i9;
        int i10;
        s sVar = this;
        if (keyEvent.getScanCode() != 0 || keyEvent.getKeyCode() != 0) {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                lValueOf = Long.valueOf((((long) keyEvent.getKeyCode()) & 4294967295L) | 73014444032L);
            } else {
                lValueOf = (Long) y.f4430a.get(Long.valueOf(scanCode));
                if (lValueOf == null) {
                    lValueOf = Long.valueOf((((long) keyEvent.getScanCode()) & 4294967295L) | 73014444032L);
                }
            }
            Long l4 = lValueOf;
            Long lValueOf2 = (Long) y.f4431b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf((((long) keyEvent.getKeyCode()) & 4294967295L) | 73014444032L);
            }
            Long l5 = lValueOf2;
            ArrayList arrayList = new ArrayList();
            l[] lVarArr = y.f4432c;
            int length = lVarArr.length;
            int i11 = 0;
            while (true) {
                int i12 = 2;
                HashMap map2 = sVar.f4424l;
                if (i11 >= length) {
                    HashMap map3 = map2;
                    Long l6 = l5;
                    HashMap map4 = sVar.f4425m;
                    for (x xVar2 : map4.values()) {
                        int metaState = keyEvent.getMetaState();
                        xVar2.getClass();
                        boolean z4 = (metaState & 1048576) != 0;
                        if (4294967556L == l6.longValue() || xVar2.f4429a == z4) {
                            map = map3;
                        } else {
                            map = map3;
                            boolean zContainsKey = map.containsKey(458809L);
                            boolean z5 = !zContainsKey;
                            if (!zContainsKey) {
                                xVar2.f4429a = !xVar2.f4429a;
                            }
                            sVar.c(z5, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (zContainsKey) {
                                xVar2.f4429a = !xVar2.f4429a;
                            }
                            c(zContainsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        sVar = this;
                        map3 = map;
                    }
                    HashMap map5 = map3;
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z3 = true;
                    } else {
                        if (action != 1) {
                            sVar = this;
                            break;
                        }
                        z3 = false;
                    }
                    Long l7 = (Long) map5.get(l4);
                    if (!z3) {
                        sVar = this;
                        l3 = l4;
                        if (l7 == null) {
                            break;
                        }
                        i3 = 2;
                        str = null;
                        i4 = 1;
                        i5 = 3;
                    } else {
                        if (l7 == null) {
                            i6 = 1;
                        } else {
                            if (keyEvent.getRepeatCount() > 0) {
                                i6 = 3;
                            } else {
                                sVar = this;
                                l3 = l4;
                                sVar.c(false, l7, l3, keyEvent.getEventTime());
                                i6 = 1;
                            }
                            cCharValue = sVar.n.a(keyEvent.getUnicodeChar()).charValue();
                            if (cCharValue != 0) {
                                str2 = StringUtils.EMPTY + cCharValue;
                            } else {
                                str2 = null;
                            }
                            i3 = i6;
                            str = str2;
                            i5 = 3;
                            i4 = 1;
                        }
                        sVar = this;
                        l3 = l4;
                        cCharValue = sVar.n.a(keyEvent.getUnicodeChar()).charValue();
                        if (cCharValue != 0) {
                            str2 = StringUtils.EMPTY + cCharValue;
                        } else {
                            str2 = null;
                        }
                        i3 = i6;
                        str = str2;
                        i5 = 3;
                        i4 = 1;
                    }
                    if (i3 != i5) {
                        sVar.d(l3, z3 ? l6 : null);
                    }
                    if (i3 == i4 && (xVar = (x) map4.get(l6)) != null) {
                        xVar.f4429a = (xVar.f4429a ? 1 : 0) ^ i4;
                    }
                    p pVar = new p();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        pVar.f4416f = 2;
                    } else if (source == 1025) {
                        pVar.f4416f = i5;
                    } else if (source == 16777232) {
                        pVar.f4416f = 4;
                    } else if (source != 33554433) {
                        pVar.f4416f = 1;
                    } else {
                        pVar.f4416f = 5;
                    }
                    pVar.f4411a = keyEvent.getEventTime();
                    pVar.f4412b = i3;
                    pVar.f4414d = l6.longValue();
                    pVar.f4413c = l3.longValue();
                    pVar.f4417g = str;
                    pVar.f4415e = false;
                    sVar.a(pVar, e3);
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        ((Runnable) obj).run();
                    }
                    return;
                }
                l lVar = lVarArr[i11];
                boolean z6 = (lVar.f33a & keyEvent.getMetaState()) != 0;
                long jLongValue = l5.longValue();
                long jLongValue2 = l4.longValue();
                w[] wVarArr = (w[]) lVar.f34b;
                boolean[] zArr = new boolean[2];
                Boolean[] boolArr = new Boolean[2];
                int i14 = 0;
                boolean z7 = false;
                while (i14 < i12) {
                    final w wVar = wVarArr[i14];
                    boolean[] zArr2 = zArr;
                    boolean zContainsKey2 = map2.containsKey(Long.valueOf(wVar.f4427a));
                    zArr2[i14] = zContainsKey2;
                    Long l8 = l5;
                    if (wVar.f4428b == jLongValue) {
                        boolean z8 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 != 0) {
                            i9 = 1;
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i10 = 2;
                        } else {
                            i9 = 1;
                            i10 = z8 ? 3 : 1;
                        }
                        int iA = j.a(i10);
                        if (iA == 0) {
                            map2 = map2;
                            boolArr = boolArr;
                            i7 = i14;
                            j3 = jLongValue2;
                            i8 = 2;
                            i11 = i11;
                            boolArr[i7] = Boolean.FALSE;
                            if (!z6) {
                                final int i15 = 0;
                                arrayList.add(new Runnable(this) { // from class: r1.r

                                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                                    public final /* synthetic */ s f4420l;

                                    {
                                        this.f4420l = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                s sVar2 = this.f4420l;
                                                sVar2.getClass();
                                                sVar2.c(false, Long.valueOf(wVar.f4428b), Long.valueOf(j3), keyEvent.getEventTime());
                                                break;
                                            default:
                                                s sVar3 = this.f4420l;
                                                sVar3.getClass();
                                                sVar3.c(false, Long.valueOf(wVar.f4428b), Long.valueOf(j3), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (iA != i9) {
                            i8 = 2;
                            if (iA != 2) {
                                i11 = i11;
                                i8 = 2;
                                map2 = map2;
                                boolArr = boolArr;
                                i7 = i14;
                                j3 = jLongValue2;
                            } else {
                                if (z6) {
                                    i7 = i14;
                                    j3 = jLongValue2;
                                } else {
                                    int i16 = i14;
                                    final int i17 = 1;
                                    i7 = i16;
                                    j3 = jLongValue2;
                                    arrayList.add(new Runnable(this) { // from class: r1.r

                                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                                        public final /* synthetic */ s f4420l;

                                        {
                                            this.f4420l = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i17) {
                                                case 0:
                                                    s sVar2 = this.f4420l;
                                                    sVar2.getClass();
                                                    sVar2.c(false, Long.valueOf(wVar.f4428b), Long.valueOf(j3), keyEvent.getEventTime());
                                                    break;
                                                default:
                                                    s sVar3 = this.f4420l;
                                                    sVar3.getClass();
                                                    sVar3.c(false, Long.valueOf(wVar.f4428b), Long.valueOf(j3), keyEvent.getEventTime());
                                                    break;
                                            }
                                        }
                                    });
                                }
                                boolArr[i7] = Boolean.valueOf(zArr2[i7]);
                            }
                        } else {
                            i11 = i11;
                            map2 = map2;
                            boolArr = boolArr;
                            i7 = i14;
                            j3 = jLongValue2;
                            i8 = 2;
                            boolArr[i7] = Boolean.valueOf(zArr2[i7]);
                        }
                        z7 = true;
                    } else {
                        i11 = i11;
                        map2 = map2;
                        boolArr = boolArr;
                        i7 = i14;
                        j3 = jLongValue2;
                        i8 = 2;
                        z7 = z7 || zContainsKey2;
                    }
                    i14 = i7 + 1;
                    jLongValue2 = j3;
                    i12 = i8;
                    boolArr = boolArr;
                    i11 = i11;
                    zArr = zArr2;
                    l5 = l8;
                    map2 = map2;
                }
                int i18 = i11;
                int i19 = i12;
                boolean[] zArr3 = zArr;
                Long l9 = l5;
                Boolean[] boolArr2 = boolArr;
                boolean z9 = keyEvent.getDeviceId() == -1;
                if (z6) {
                    for (int i20 = 0; i20 < i19; i20++) {
                        if (boolArr2[i20] == null) {
                            if (z7 || z9) {
                                boolArr2[i20] = Boolean.valueOf(zArr3[i20]);
                            } else {
                                boolArr2[i20] = Boolean.TRUE;
                                z7 = true;
                            }
                        }
                    }
                    if (!z7 && !z9) {
                        boolArr2[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i21 = 0; i21 < i19; i21++) {
                        if (boolArr2[i21] == null) {
                            boolArr2[i21] = Boolean.FALSE;
                        }
                    }
                }
                for (int i22 = 0; i22 < i19; i22++) {
                    if (zArr3[i22] != boolArr2[i22].booleanValue()) {
                        w wVar2 = wVarArr[i22];
                        c(boolArr2[i22].booleanValue(), Long.valueOf(wVar2.f4428b), Long.valueOf(wVar2.f4427a), keyEvent.getEventTime());
                    }
                }
                sVar = this;
                i11 = i18 + 1;
                l5 = l9;
            }
        }
        sVar.c(true, 0L, 0L, 0L);
        e3.a(true);
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
        HashMap map = this.f4424l;
        if (l4 != null) {
            if (((Long) map.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) map.remove(l3)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
