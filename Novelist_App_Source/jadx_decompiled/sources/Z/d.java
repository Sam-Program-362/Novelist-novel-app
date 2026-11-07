package Z;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f1614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1615b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1616c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1617d;

    public d(byte[] bArr, int i3, int i4) {
        this(-1L, bArr, i3, i4);
    }

    public static d a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new d(new byte[]{(byte) (str.charAt(0) - '0')}, 1, 1);
        }
        byte[] bytes = str.getBytes(h.f1648a0);
        return new d(bytes, 1, bytes.length);
    }

    public static d b(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(h.f1648a0);
        return new d(bytes, 2, bytes.length);
    }

    public static d c(long j3, ByteOrder byteOrder) {
        return d(new long[]{j3}, byteOrder);
    }

    public static d d(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[h.f1641R[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j3 : jArr) {
            wrap.putInt((int) j3);
        }
        return new d(wrap.array(), 4, jArr.length);
    }

    public static d e(f[] fVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[h.f1641R[5] * fVarArr.length]);
        wrap.order(byteOrder);
        for (f fVar : fVarArr) {
            wrap.putInt((int) fVar.f1622a);
            wrap.putInt((int) fVar.f1623b);
        }
        return new d(wrap.array(), 5, fVarArr.length);
    }

    public static d f(int i3, ByteOrder byteOrder) {
        return g(new int[]{i3}, byteOrder);
    }

    public static d g(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[h.f1641R[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i3 : iArr) {
            wrap.putShort((short) i3);
        }
        return new d(wrap.array(), 3, iArr.length);
    }

    public final double h(ByteOrder byteOrder) {
        Object k3 = k(byteOrder);
        if (k3 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (k3 instanceof String) {
            return Double.parseDouble((String) k3);
        }
        if (k3 instanceof long[]) {
            if (((long[]) k3).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (k3 instanceof int[]) {
            if (((int[]) k3).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (k3 instanceof double[]) {
            double[] dArr = (double[]) k3;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(k3 instanceof f[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        f[] fVarArr = (f[]) k3;
        if (fVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        f fVar = fVarArr[0];
        return fVar.f1622a / fVar.f1623b;
    }

    public final int i(ByteOrder byteOrder) {
        Object k3 = k(byteOrder);
        if (k3 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (k3 instanceof String) {
            return Integer.parseInt((String) k3);
        }
        if (k3 instanceof long[]) {
            long[] jArr = (long[]) k3;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(k3 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) k3;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String j(ByteOrder byteOrder) {
        Object k3 = k(byteOrder);
        if (k3 == null) {
            return null;
        }
        if (k3 instanceof String) {
            return (String) k3;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        if (k3 instanceof long[]) {
            long[] jArr = (long[]) k3;
            while (i3 < jArr.length) {
                sb.append(jArr[i3]);
                i3++;
                if (i3 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (k3 instanceof int[]) {
            int[] iArr = (int[]) k3;
            while (i3 < iArr.length) {
                sb.append(iArr[i3]);
                i3++;
                if (i3 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (k3 instanceof double[]) {
            double[] dArr = (double[]) k3;
            while (i3 < dArr.length) {
                sb.append(dArr[i3]);
                i3++;
                if (i3 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(k3 instanceof f[])) {
            return null;
        }
        f[] fVarArr = (f[]) k3;
        while (i3 < fVarArr.length) {
            sb.append(fVarArr[i3].f1622a);
            sb.append('/');
            sb.append(fVarArr[i3].f1623b);
            i3++;
            if (i3 != fVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:100:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [Z.f[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [Z.f[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable k(java.nio.ByteOrder r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.d.k(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        return "(" + h.f1640Q[this.f1614a] + ", data length:" + this.f1617d.length + ")";
    }

    public d(long j3, byte[] bArr, int i3, int i4) {
        this.f1614a = i3;
        this.f1615b = i4;
        this.f1616c = j3;
        this.f1617d = bArr;
    }
}
