package L0;

import M0.C0048d;
import M0.C0051g;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class v implements p019g1.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0044d f847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0041a f849m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f850o;

    public v(C0044d c0044d, int i3, C0041a c0041a, long j3, long j4) {
        this.f847k = c0044d;
        this.f848l = i3;
        this.f849m = c0041a;
        this.n = j3;
        this.f850o = j4;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static C0048d b(p pVar, com.google.android.gms.common.internal.a aVar, int i3) {
        M0.z zVar = aVar.u;
        C0048d c0048d = zVar == null ? null : zVar.n;
        if (c0048d != null && c0048d.f933l) {
            int[] iArr = c0048d.n;
            int i4 = 0;
            if (iArr == null) {
                int[] iArr2 = c0048d.f936p;
                if (iArr2 != null) {
                    while (i4 < iArr2.length) {
                        if (iArr2[i4] != i3) {
                            i4++;
                        }
                    }
                    if (pVar.f834l < c0048d.f935o) {
                        return c0048d;
                    }
                } else if (pVar.f834l < c0048d.f935o) {
                    return c0048d;
                }
            } else {
                while (i4 < iArr.length) {
                    if (iArr[i4] != i3) {
                        i4++;
                    } else if (pVar.f834l < c0048d.f935o) {
                        return c0048d;
                    }
                }
            }
        }
        return null;
    }

    @Override // p019g1.b
    public final void a(p019g1.i iVar) {
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
                                C0048d c0048dB = b(pVar, aVar, this.f848l);
                                if (c0048dB == null) {
                                    return;
                                }
                                boolean z4 = c0048dB.f934m && j5 > 0;
                                i4 = c0048dB.f935o;
                                z3 = z4;
                            }
                        } else {
                            i3 = 5000;
                            i4 = 100;
                            i5 = 0;
                        }
                        int i9 = i3;
                        int iElapsedRealtime = -1;
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
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j6);
                            j3 = j5;
                            j4 = jCurrentTimeMillis;
                        } else {
                            j3 = 0;
                            j4 = 0;
                        }
                        w wVar = new w(new C0051g(this.f848l, i7, i6, j3, j4, null, null, i8, iElapsedRealtime), i5, i9, i4);
                        Z0.d dVar = c0044d.f812m;
                        dVar.sendMessage(dVar.obtainMessage(18, wVar));
                    }
                }
            }
        }
    }
}
