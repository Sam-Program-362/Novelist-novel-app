package o;

import java.util.Arrays;
import p.AbstractC0443a;

/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ int[] f4210k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object[] f4211l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ int f4212m;

    public k() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.f4210k = new int[i6];
        this.f4211l = new Object[i6];
    }

    public final void a(int i3, Object obj) {
        int i4 = this.f4212m;
        if (i4 != 0 && i3 <= this.f4210k[i4 - 1]) {
            c(i3, obj);
            return;
        }
        if (i4 >= this.f4210k.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] copyOf = Arrays.copyOf(this.f4210k, i8);
            a2.h.d(copyOf, "copyOf(this, newSize)");
            this.f4210k = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4211l, i8);
            a2.h.d(copyOf2, "copyOf(this, newSize)");
            this.f4211l = copyOf2;
        }
        this.f4210k[i4] = i3;
        this.f4211l[i4] = obj;
        this.f4212m = i4 + 1;
    }

    public final Object b(int i3) {
        Object obj;
        int a3 = AbstractC0443a.a(this.f4212m, i3, this.f4210k);
        if (a3 < 0 || (obj = this.f4211l[a3]) == h.f4200b) {
            return null;
        }
        return obj;
    }

    public final void c(int i3, Object obj) {
        int a3 = AbstractC0443a.a(this.f4212m, i3, this.f4210k);
        if (a3 >= 0) {
            this.f4211l[a3] = obj;
            return;
        }
        int i4 = ~a3;
        int i5 = this.f4212m;
        if (i4 < i5) {
            Object[] objArr = this.f4211l;
            if (objArr[i4] == h.f4200b) {
                this.f4210k[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (i5 >= this.f4210k.length) {
            int i6 = (i5 + 1) * 4;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 4;
            int[] copyOf = Arrays.copyOf(this.f4210k, i9);
            a2.h.d(copyOf, "copyOf(this, newSize)");
            this.f4210k = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4211l, i9);
            a2.h.d(copyOf2, "copyOf(this, newSize)");
            this.f4211l = copyOf2;
        }
        int i10 = this.f4212m;
        if (i10 - i4 != 0) {
            int[] iArr = this.f4210k;
            int i11 = i4 + 1;
            P1.d.W(i11, i4, i10, iArr, iArr);
            Object[] objArr2 = this.f4211l;
            P1.d.X(i11, i4, this.f4212m, objArr2, objArr2);
        }
        this.f4210k[i4] = i3;
        this.f4211l[i4] = obj;
        this.f4212m++;
    }

    public final Object clone() {
        Object clone = super.clone();
        a2.h.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f4210k = (int[]) this.f4210k.clone();
        kVar.f4211l = (Object[]) this.f4211l.clone();
        return kVar;
    }

    public final String toString() {
        int i3 = this.f4212m;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        int i4 = this.f4212m;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(this.f4210k[i5]);
            sb.append('=');
            Object obj = this.f4211l[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        a2.h.d(sb2, "buffer.toString()");
        return sb2;
    }
}
