package n2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4166e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4167f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final B1.g f4168g = new B1.g("REMOVE_FROZEN", 18);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4172d;

    public m(int i3, boolean z3) {
        this.f4169a = i3;
        this.f4170b = z3;
        int i4 = i3 - 1;
        this.f4171c = i4;
        this.f4172d = new AtomicReferenceArray(i3);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i3 & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4167f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) != 0) {
                return (2305843009213693952L & j3) != 0 ? 2 : 1;
            }
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            int i5 = this.f4171c;
            if (((i4 + 2) & i5) == (i3 & i5)) {
                return 1;
            }
            boolean z3 = this.f4170b;
            AtomicReferenceArray atomicReferenceArray = this.f4172d;
            if (z3 || atomicReferenceArray.get(i4 & i5) == null) {
                if (f4167f.compareAndSet(this, j3, ((-1152921503533105153L) & j3) | (((long) ((i4 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i4 & i5, obj);
                    m mVarC = this;
                    while ((atomicLongFieldUpdater.get(mVarC) & 1152921504606846976L) != 0) {
                        mVarC = mVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = mVarC.f4172d;
                        int i6 = mVarC.f4171c & i4;
                        Object obj2 = atomicReferenceArray2.get(i6);
                        if ((obj2 instanceof l) && ((l) obj2).f4165a == i4) {
                            atomicReferenceArray2.set(i6, obj);
                        } else {
                            mVarC = null;
                        }
                        if (mVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i7 = this.f4169a;
                if (i7 < 1024 || ((i4 - i3) & 1073741823) > (i7 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        do {
            atomicLongFieldUpdater = f4167f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f4167f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j4 = 1152921504606846976L | j3;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j3, j4)) {
                j3 = j4;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4166e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f4169a * 2, mVar.f4170b);
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i5 = mVar.f4171c;
                int i6 = i3 & i5;
                if (i6 == (i5 & i4)) {
                    break;
                }
                Object lVar = mVar.f4172d.get(i6);
                if (lVar == null) {
                    lVar = new l(i3);
                }
                mVar3.f4172d.set(mVar3.f4171c & i3, lVar);
                i3++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4167f;
            long j3 = atomicLongFieldUpdater.get(mVarC);
            if ((j3 & 1152921504606846976L) != 0) {
                return f4168g;
            }
            int i3 = (int) (j3 & 1073741823);
            int i4 = mVarC.f4171c;
            int i5 = i3 & i4;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i4) != i5) {
                AtomicReferenceArray atomicReferenceArray = mVarC.f4172d;
                Object obj = atomicReferenceArray.get(i5);
                boolean z3 = mVarC.f4170b;
                if (obj == null) {
                    if (z3) {
                    }
                } else if (!(obj instanceof l)) {
                    long j4 = (i3 + 1) & 1073741823;
                    if (f4167f.compareAndSet(mVarC, j3, (j3 & (-1073741824)) | j4)) {
                        atomicReferenceArray.set(i5, null);
                        return obj;
                    }
                    mVarC = this;
                    if (z3) {
                        while (true) {
                            long j5 = atomicLongFieldUpdater.get(mVarC);
                            int i6 = (int) (j5 & 1073741823);
                            if ((j5 & 1152921504606846976L) != 0) {
                                mVarC = mVarC.c();
                            } else {
                                m mVar = mVarC;
                                if (f4167f.compareAndSet(mVar, j5, (j5 & (-1073741824)) | j4)) {
                                    mVar.f4172d.set(i6 & mVar.f4171c, null);
                                    mVarC = null;
                                } else {
                                    mVarC = mVar;
                                }
                            }
                            if (mVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
