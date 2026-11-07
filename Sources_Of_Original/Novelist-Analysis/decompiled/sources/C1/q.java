package C1;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f177a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f179c;

    static {
        f178b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f179c = Charset.forName("UTF8");
    }

    public static void c(ByteBuffer byteBuffer, int i3) {
        int iPosition = byteBuffer.position() % i3;
        if (iPosition != 0) {
            byteBuffer.position((byteBuffer.position() + i3) - iPosition);
        }
    }

    public static int d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i3 = byteBuffer.get() & ForkServer.ERROR;
        if (i3 < 254) {
            return i3;
        }
        return i3 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static void g(p pVar, int i3) {
        int size = pVar.size() % i3;
        if (size != 0) {
            for (int i4 = 0; i4 < i3 - size; i4++) {
                pVar.write(0);
            }
        }
    }

    public static void h(p pVar, int i3) {
        if (f178b) {
            pVar.write(i3);
            pVar.write(i3 >>> 8);
            pVar.write(i3 >>> 16);
            pVar.write(i3 >>> 24);
            return;
        }
        pVar.write(i3 >>> 24);
        pVar.write(i3 >>> 16);
        pVar.write(i3 >>> 8);
        pVar.write(i3);
    }

    public static void i(p pVar, long j3) {
        if (f178b) {
            pVar.write((byte) j3);
            pVar.write((byte) (j3 >>> 8));
            pVar.write((byte) (j3 >>> 16));
            pVar.write((byte) (j3 >>> 24));
            pVar.write((byte) (j3 >>> 32));
            pVar.write((byte) (j3 >>> 40));
            pVar.write((byte) (j3 >>> 48));
            pVar.write((byte) (j3 >>> 56));
            return;
        }
        pVar.write((byte) (j3 >>> 56));
        pVar.write((byte) (j3 >>> 48));
        pVar.write((byte) (j3 >>> 40));
        pVar.write((byte) (j3 >>> 32));
        pVar.write((byte) (j3 >>> 24));
        pVar.write((byte) (j3 >>> 16));
        pVar.write((byte) (j3 >>> 8));
        pVar.write((byte) j3);
    }

    public static void j(p pVar, int i3) {
        if (i3 < 254) {
            pVar.write(i3);
            return;
        }
        if (i3 > 65535) {
            pVar.write(255);
            h(pVar, i3);
            return;
        }
        pVar.write(254);
        if (f178b) {
            pVar.write(i3);
            pVar.write(i3 >>> 8);
        } else {
            pVar.write(i3 >>> 8);
            pVar.write(i3);
        }
    }

    @Override // C1.l
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        k(pVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(pVar.size());
        byteBufferAllocateDirect.put(pVar.a(), 0, pVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // C1.l
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objE = e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return objE;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b3, ByteBuffer byteBuffer) {
        Charset charset = f179c;
        int i3 = 0;
        switch (b3) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                return new BigInteger(new String(bArr, charset), 16);
            case 6:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                return new String(bArr2, charset);
            case 8:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                int iD = d(byteBuffer);
                int[] iArr = new int[iD];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((iD * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int iD2 = d(byteBuffer);
                long[] jArr = new long[iD2];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((iD2 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int iD3 = d(byteBuffer);
                double[] dArr = new double[iD3];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((iD3 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int iD4 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(iD4);
                while (i3 < iD4) {
                    arrayList.add(e(byteBuffer));
                    i3++;
                }
                return arrayList;
            case 13:
                int iD5 = d(byteBuffer);
                HashMap map = new HashMap();
                while (i3 < iD5) {
                    map.put(e(byteBuffer), e(byteBuffer));
                    i3++;
                }
                return map;
            case 14:
                int iD6 = d(byteBuffer);
                float[] fArr = new float[iD6];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((iD6 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    public void k(p pVar, Object obj) {
        int i3 = 0;
        if (obj == null || obj.equals(null)) {
            pVar.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            pVar.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z3 = obj instanceof Number;
        Charset charset = f179c;
        if (z3) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                pVar.write(3);
                h(pVar, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                pVar.write(4);
                i(pVar, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                pVar.write(6);
                g(pVar, 8);
                i(pVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                pVar.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(pVar, bytes.length);
                pVar.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            pVar.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(pVar, bytes2.length);
            pVar.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            pVar.write(8);
            byte[] bArr = (byte[]) obj;
            j(pVar, bArr.length);
            pVar.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            pVar.write(9);
            int[] iArr = (int[]) obj;
            j(pVar, iArr.length);
            g(pVar, 4);
            int length = iArr.length;
            while (i3 < length) {
                h(pVar, iArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof long[]) {
            pVar.write(10);
            long[] jArr = (long[]) obj;
            j(pVar, jArr.length);
            g(pVar, 8);
            int length2 = jArr.length;
            while (i3 < length2) {
                i(pVar, jArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof double[]) {
            pVar.write(11);
            double[] dArr = (double[]) obj;
            j(pVar, dArr.length);
            g(pVar, 8);
            int length3 = dArr.length;
            while (i3 < length3) {
                i(pVar, Double.doubleToLongBits(dArr[i3]));
                i3++;
            }
            return;
        }
        if (obj instanceof List) {
            pVar.write(12);
            List list = (List) obj;
            j(pVar, list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                k(pVar, it2.next());
            }
            return;
        }
        if (obj instanceof Map) {
            pVar.write(13);
            Map map = (Map) obj;
            j(pVar, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(pVar, entry.getKey());
                k(pVar, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        pVar.write(14);
        float[] fArr = (float[]) obj;
        j(pVar, fArr.length);
        g(pVar, 4);
        int length4 = fArr.length;
        while (i3 < length4) {
            h(pVar, Float.floatToIntBits(fArr[i3]));
            i3++;
        }
    }
}
