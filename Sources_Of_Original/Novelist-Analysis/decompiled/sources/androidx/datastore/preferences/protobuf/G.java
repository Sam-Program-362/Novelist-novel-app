package androidx.datastore.preferences.protobuf;

import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f1977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1978b;

    public G(q0 q0Var, q0 q0Var2, X.k kVar) {
        this.f1977a = new F(q0Var, q0Var2, kVar);
        this.f1978b = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0120  */
    /* JADX WARN: Code duplicated, block: B:45:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:49:0x0141  */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0174  */
    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    /* JADX WARN: Code duplicated, block: B:60:0x018e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0199  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01be  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01db  */
    public static int a(F f3, Object obj, Object obj2) {
        int iB0;
        int size;
        int iA0;
        int i3;
        q0 q0Var;
        int iZ;
        int size2;
        int iA1;
        q0 q0Var2 = f3.f1974a;
        int i4 = C0118q.f2089c;
        int iB1 = 1;
        int iZ2 = C0113l.Z(1);
        n0 n0Var = q0.n;
        if (q0Var2 == n0Var) {
            iZ2 *= 2;
        }
        switch (q0Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iB0 = 8;
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue >> 31) ^ (iIntValue << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue >> 63) ^ (jLongValue << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iB0 = 4;
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iB0 = C0113l.b0(((Long) obj).longValue());
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iB0 = C0113l.b0(((Long) obj).longValue());
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iB0 = C0113l.b0(((Integer) obj).intValue());
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iB0 = 8;
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iB0 = 4;
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iB0 = 1;
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof C0108g) {
                    size = ((C0108g) obj).size();
                    iA0 = C0113l.a0(size);
                    iB0 = size + iA0;
                } else {
                    iB0 = C0113l.Y((String) obj);
                }
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                iB0 = ((AbstractC0122v) ((AbstractC0102a) obj)).a(null);
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                size = ((AbstractC0122v) ((AbstractC0102a) obj)).a(null);
                iA0 = C0113l.a0(size);
                iB0 = size + iA0;
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof C0108g) {
                    size = ((C0108g) obj).size();
                    iA0 = C0113l.a0(size);
                } else {
                    size = ((byte[]) obj).length;
                    iA0 = C0113l.a0(size);
                }
                iB0 = size + iA0;
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iB0 = C0113l.a0(((Integer) obj).intValue());
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iB0 = C0113l.b0(((Integer) obj).intValue());
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iB0 = 4;
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iB0 = 8;
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iB0 = C0113l.a0((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                long jLongValue18 = ((Long) obj).longValue();
                iB0 = C0113l.b0((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i3 = iB0 + iZ2;
                q0Var = f3.f1975b;
                iZ = C0113l.Z(2);
                if (q0Var == n0Var) {
                    iZ *= 2;
                }
                switch (q0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 2:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 3:
                        iB1 = C0113l.b0(((Long) obj2).longValue());
                        return iB1 + iZ + i3;
                    case 4:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 5:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 6:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iB1 + iZ + i3;
                    case 8:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                            iB1 = iA1 + size2;
                        } else {
                            iB1 = C0113l.Y((String) obj2);
                        }
                        return iB1 + iZ + i3;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        iB1 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        return iB1 + iZ + i3;
                    case 10:
                        size2 = ((AbstractC0122v) ((AbstractC0102a) obj2)).a(null);
                        iA1 = C0113l.a0(size2);
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 11:
                        if (obj2 instanceof C0108g) {
                            size2 = ((C0108g) obj2).size();
                            iA1 = C0113l.a0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            iA1 = C0113l.a0(size2);
                        }
                        iB1 = iA1 + size2;
                        return iB1 + iZ + i3;
                    case 12:
                        iB1 = C0113l.a0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 13:
                        iB1 = C0113l.b0(((Integer) obj2).intValue());
                        return iB1 + iZ + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB1 = 4;
                        return iB1 + iZ + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB1 = 8;
                        return iB1 + iZ + i3;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iB1 = C0113l.a0((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iB1 + iZ + i3;
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iB1 = C0113l.b0((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iB1 + iZ + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
