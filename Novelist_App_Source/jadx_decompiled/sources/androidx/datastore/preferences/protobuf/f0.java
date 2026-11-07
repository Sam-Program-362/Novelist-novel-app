package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class f0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2043b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f2043b = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean c(long j3, Object obj) {
        switch (this.f2043b) {
            case 0:
                if (!i0.f2069g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!i0.f2069g) {
                    break;
                } else {
                    break;
                }
        }
        return i0.c(j3, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final double d(long j3, Object obj) {
        switch (this.f2043b) {
        }
        return Double.longBitsToDouble(g(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final float e(long j3, Object obj) {
        switch (this.f2043b) {
        }
        return Float.intBitsToFloat(f(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj, long j3, boolean z3) {
        switch (this.f2043b) {
            case 0:
                if (!i0.f2069g) {
                    i0.l(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i0.k(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!i0.f2069g) {
                    i0.l(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    i0.k(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void k(Object obj, long j3, byte b3) {
        switch (this.f2043b) {
            case 0:
                if (!i0.f2069g) {
                    i0.l(obj, j3, b3);
                    break;
                } else {
                    i0.k(obj, j3, b3);
                    break;
                }
            default:
                if (!i0.f2069g) {
                    i0.l(obj, j3, b3);
                    break;
                } else {
                    i0.k(obj, j3, b3);
                    break;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void l(Object obj, long j3, double d3) {
        switch (this.f2043b) {
            case 0:
                o(obj, j3, Double.doubleToLongBits(d3));
                break;
            default:
                o(obj, j3, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void m(Object obj, long j3, float f3) {
        switch (this.f2043b) {
            case 0:
                n(obj, j3, Float.floatToIntBits(f3));
                break;
            default:
                n(obj, j3, Float.floatToIntBits(f3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final boolean r() {
        switch (this.f2043b) {
        }
        return false;
    }
}
