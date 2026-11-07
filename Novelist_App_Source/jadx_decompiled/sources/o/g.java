package o;

import java.util.Arrays;
import p.AbstractC0443a;

/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f4196k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ long[] f4197l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object[] f4198m;
    public /* synthetic */ int n;

    public g() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 80;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (80 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.f4197l = new long[i6];
        this.f4198m = new Object[i6];
    }

    public final void a(long j3, Object obj) {
        Object obj2 = h.f4199a;
        int b3 = AbstractC0443a.b(this.f4197l, this.n, j3);
        if (b3 >= 0) {
            this.f4198m[b3] = obj;
            return;
        }
        int i3 = ~b3;
        int i4 = this.n;
        if (i3 < i4) {
            Object[] objArr = this.f4198m;
            if (objArr[i3] == obj2) {
                this.f4197l[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f4196k) {
            long[] jArr = this.f4197l;
            if (i4 >= jArr.length) {
                Object[] objArr2 = this.f4198m;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj3 = objArr2[i6];
                    if (obj3 != obj2) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr2[i5] = obj3;
                            objArr2[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f4196k = false;
                this.n = i5;
                i3 = ~AbstractC0443a.b(this.f4197l, i5, j3);
            }
        }
        int i7 = this.n;
        if (i7 >= this.f4197l.length) {
            int i8 = (i7 + 1) * 8;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 8;
            long[] copyOf = Arrays.copyOf(this.f4197l, i11);
            a2.h.d(copyOf, "copyOf(this, newSize)");
            this.f4197l = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4198m, i11);
            a2.h.d(copyOf2, "copyOf(this, newSize)");
            this.f4198m = copyOf2;
        }
        int i12 = this.n - i3;
        if (i12 != 0) {
            long[] jArr2 = this.f4197l;
            int i13 = i3 + 1;
            a2.h.e(jArr2, "<this>");
            System.arraycopy(jArr2, i3, jArr2, i13, i12);
            Object[] objArr3 = this.f4198m;
            P1.d.X(i13, i3, this.n, objArr3, objArr3);
        }
        this.f4197l[i3] = j3;
        this.f4198m[i3] = obj;
        this.n++;
    }

    public final Object clone() {
        Object clone = super.clone();
        a2.h.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) clone;
        gVar.f4197l = (long[]) this.f4197l.clone();
        gVar.f4198m = (Object[]) this.f4198m.clone();
        return gVar;
    }

    public final String toString() {
        int i3;
        int i4;
        if (this.f4196k) {
            int i5 = this.n;
            long[] jArr = this.f4197l;
            Object[] objArr = this.f4198m;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != h.f4199a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f4196k = false;
            this.n = i6;
        }
        if (this.n <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.n * 28);
        sb.append('{');
        int i8 = this.n;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            if (i9 < 0 || i9 >= (i3 = this.n)) {
                throw new IllegalArgumentException(B1.e.g("Expected index to be within 0..size()-1, but was ", i9).toString());
            }
            if (this.f4196k) {
                long[] jArr2 = this.f4197l;
                Object[] objArr2 = this.f4198m;
                int i10 = 0;
                for (int i11 = 0; i11 < i3; i11++) {
                    Object obj2 = objArr2[i11];
                    if (obj2 != h.f4199a) {
                        if (i11 != i10) {
                            jArr2[i10] = jArr2[i11];
                            objArr2[i10] = obj2;
                            objArr2[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f4196k = false;
                this.n = i10;
            }
            sb.append(this.f4197l[i9]);
            sb.append('=');
            if (i9 < 0 || i9 >= (i4 = this.n)) {
                throw new IllegalArgumentException(B1.e.g("Expected index to be within 0..size()-1, but was ", i9).toString());
            }
            if (this.f4196k) {
                long[] jArr3 = this.f4197l;
                Object[] objArr3 = this.f4198m;
                int i12 = 0;
                for (int i13 = 0; i13 < i4; i13++) {
                    Object obj3 = objArr3[i13];
                    if (obj3 != h.f4199a) {
                        if (i13 != i12) {
                            jArr3[i12] = jArr3[i13];
                            objArr3[i12] = obj3;
                            objArr3[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f4196k = false;
                this.n = i12;
            }
            Object obj4 = this.f4198m[i9];
            if (obj4 != sb) {
                sb.append(obj4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        a2.h.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
