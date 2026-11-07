package p042o;

import P1.d;
import a2.h;
import java.util.Arrays;
import p045p.a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Cloneable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ int[] f4210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object[] f4211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
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
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f4210k, i8);
            h.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f4210k = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4211l, i8);
            h.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4211l = objArrCopyOf;
        }
        this.f4210k[i4] = i3;
        this.f4211l[i4] = obj;
        this.f4212m = i4 + 1;
    }

    public final Object b(int i3) {
        Object obj;
        int iA = a.a(this.f4212m, i3, this.f4210k);
        if (iA < 0 || (obj = this.f4211l[iA]) == h.f4200b) {
            return null;
        }
        return obj;
    }

    public final void c(int i3, Object obj) {
        int iA = a.a(this.f4212m, i3, this.f4210k);
        if (iA >= 0) {
            this.f4211l[iA] = obj;
            return;
        }
        int i4 = ~iA;
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
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f4210k, i9);
            h.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f4210k = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4211l, i9);
            h.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f4211l = objArrCopyOf;
        }
        int i10 = this.f4212m;
        if (i10 - i4 != 0) {
            int[] iArr = this.f4210k;
            int i11 = i4 + 1;
            d.W(i11, i4, i10, iArr, iArr);
            Object[] objArr2 = this.f4211l;
            d.X(i11, i4, this.f4212m, objArr2, objArr2);
        }
        this.f4210k[i4] = i3;
        this.f4211l[i4] = obj;
        this.f4212m++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        h.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) objClone;
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
        String string = sb.toString();
        h.d(string, "buffer.toString()");
        return string;
    }
}
