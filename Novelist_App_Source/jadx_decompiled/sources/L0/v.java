package L0;

import M0.C0048d;
import M0.C0051g;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class v implements g1.b {

    /* renamed from: k, reason: collision with root package name */
    public final C0044d f847k;

    /* renamed from: l, reason: collision with root package name */
    public final int f848l;

    /* renamed from: m, reason: collision with root package name */
    public final C0041a f849m;
    public final long n;

    /* renamed from: o, reason: collision with root package name */
    public final long f850o;

    public v(C0044d c0044d, int i3, C0041a c0041a, long j3, long j4) {
        this.f847k = c0044d;
        this.f848l = i3;
        this.f849m = c0041a;
        this.n = j3;
        this.f850o = j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static M0.C0048d b(L0.p r4, com.google.android.gms.common.internal.a r5, int r6) {
        /*
            M0.z r5 = r5.u
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            M0.d r5 = r5.n
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.f933l
            if (r1 == 0) goto L35
            int[] r1 = r5.n
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f936p
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.f834l
            int r6 = r5.f935o
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.v.b(L0.p, com.google.android.gms.common.internal.a, int):M0.d");
    }

    @Override // g1.b
    public final void a(g1.i iVar) {
        int i3;
        int i4;
        int i5;
        Exception exc;
        int i6;
        long j3;
        long j4;
        long j5 = this.n;
        C0044d c0044d = this.f847k;
        if (c0044d.b()) {
            M0.i iVar2 = (M0.i) M0.h.b().f959a;
            if (iVar2 == null || iVar2.f961l) {
                p pVar = (p) c0044d.f809j.get(this.f849m);
                if (pVar != null) {
                    K0.c cVar = pVar.f824b;
                    if (cVar instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                        int i7 = 0;
                        boolean z3 = j5 > 0;
                        int i8 = aVar.f2753p;
                        if (iVar2 != null) {
                            z3 &= iVar2.f962m;
                            i3 = iVar2.n;
                            i4 = iVar2.f963o;
                            i5 = iVar2.f960k;
                            if (aVar.u != null && !aVar.g()) {
                                C0048d b3 = b(pVar, aVar, this.f848l);
                                if (b3 == null) {
                                    return;
                                }
                                boolean z4 = b3.f934m && j5 > 0;
                                i4 = b3.f935o;
                                z3 = z4;
                            }
                        } else {
                            i3 = 5000;
                            i4 = 100;
                            i5 = 0;
                        }
                        int i9 = i3;
                        int i10 = -1;
                        if (iVar.d()) {
                            i6 = 0;
                        } else {
                            synchronized (iVar.f2845b) {
                                exc = (Exception) iVar.f2848e;
                            }
                            if (exc instanceof K0.e) {
                                Status status = ((K0.e) exc).f635k;
                                i7 = status.f2726k;
                                J0.a aVar2 = status.n;
                                if (aVar2 != null) {
                                    i6 = aVar2.f540l;
                                }
                            } else {
                                i7 = 101;
                            }
                            i6 = -1;
                        }
                        if (z3) {
                            long j6 = this.f850o;
                            long currentTimeMillis = System.currentTimeMillis();
                            i10 = (int) (SystemClock.elapsedRealtime() - j6);
                            j3 = j5;
                            j4 = currentTimeMillis;
                        } else {
                            j3 = 0;
                            j4 = 0;
                        }
                        w wVar = new w(new C0051g(this.f848l, i7, i6, j3, j4, null, null, i8, i10), i5, i9, i4);
                        Z0.d dVar = c0044d.f812m;
                        dVar.sendMessage(dVar.obtainMessage(18, wVar));
                    }
                }
            }
        }
    }
}
