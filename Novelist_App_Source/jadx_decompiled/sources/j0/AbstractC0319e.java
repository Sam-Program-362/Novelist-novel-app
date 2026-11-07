package j0;

import M1.A;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: j0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0319e {

    /* renamed from: a, reason: collision with root package name */
    public static final A f3521a = new A(16);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3522b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f3523c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f3524d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3525e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f3526f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f3527g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f3528h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f3529i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f3530j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(C0316b[] c0316bArr, byte[] bArr) {
        int i3 = 0;
        int i4 = 0;
        for (C0316b c0316b : c0316bArr) {
            i4 += ((((c0316b.f3518g * 2) + 7) & (-8)) / 8) + (c0316b.f3516e * 2) + d(bArr, c0316b.f3512a, c0316b.f3513b).getBytes(StandardCharsets.UTF_8).length + 16 + c0316b.f3517f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i4);
        if (Arrays.equals(bArr, f3526f)) {
            int length = c0316bArr.length;
            while (i3 < length) {
                C0316b c0316b2 = c0316bArr[i3];
                q(byteArrayOutputStream, c0316b2, d(bArr, c0316b2.f3512a, c0316b2.f3513b));
                p(byteArrayOutputStream, c0316b2);
                i3++;
            }
        } else {
            for (C0316b c0316b3 : c0316bArr) {
                q(byteArrayOutputStream, c0316b3, d(bArr, c0316b3.f3512a, c0316b3.f3513b));
            }
            int length2 = c0316bArr.length;
            while (i3 < length2) {
                p(byteArrayOutputStream, c0316bArr[i3]);
                i3++;
            }
        }
        if (byteArrayOutputStream.size() == i4) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i4);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : listFiles) {
            z3 = c(file2) && z3;
        }
        return z3;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f3528h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f3527g;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, "!");
            }
            if (TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER.equals(obj)) {
                return str2.replace("!", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
                if ("!".equals(obj)) {
                    return str2.replace(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, "!");
                }
                if (TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER.equals(obj)) {
                    return str2.replace("!", TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return B1.e.m(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER : "!", str2);
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i3) {
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int read = inputStream.read(bArr, i4, i3 - i4);
            if (read < 0) {
                throw new IllegalStateException(B1.e.g("Not enough bytes to read: ", i3));
            }
            i4 += read;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += (int) m(byteArrayInputStream, 2);
            iArr[i5] = i4;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC0319e.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static C0316b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0316b[] c0316bArr) {
        byte[] bArr3 = f3529i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f3530j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m3 = (int) m(fileInputStream, 2);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
            try {
                C0316b[] k3 = k(byteArrayInputStream, bArr2, m3, c0316bArr);
                byteArrayInputStream.close();
                return k3;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f3524d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m4 = (int) m(fileInputStream, 1);
        byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h4);
        try {
            C0316b[] j3 = j(byteArrayInputStream2, m4, c0316bArr);
            byteArrayInputStream2.close();
            return j3;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C0316b[] j(ByteArrayInputStream byteArrayInputStream, int i3, C0316b[] c0316bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0316b[0];
        }
        if (i3 != c0316bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int m3 = (int) m(byteArrayInputStream, 2);
            iArr[i4] = (int) m(byteArrayInputStream, 2);
            strArr[i4] = new String(f(byteArrayInputStream, m3), StandardCharsets.UTF_8);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C0316b c0316b = c0316bArr[i5];
            if (!c0316b.f3513b.equals(strArr[i5])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i6 = iArr[i5];
            c0316b.f3516e = i6;
            c0316b.f3519h = g(byteArrayInputStream, i6);
        }
        return c0316bArr;
    }

    public static C0316b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, C0316b[] c0316bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0316b[0];
        }
        if (i3 != c0316bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m3 = m(byteArrayInputStream, 4);
            int m4 = (int) m(byteArrayInputStream, 2);
            C0316b c0316b = null;
            if (c0316bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i5 = 0;
                while (true) {
                    if (i5 >= c0316bArr.length) {
                        break;
                    }
                    if (c0316bArr[i5].f3513b.equals(substring)) {
                        c0316b = c0316bArr[i5];
                        break;
                    }
                    i5++;
                }
            }
            if (c0316b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0316b.f3515d = m3;
            int[] g3 = g(byteArrayInputStream, m4);
            if (Arrays.equals(bArr, f3528h)) {
                c0316b.f3516e = m4;
                c0316b.f3519h = g3;
            }
        }
        return c0316bArr;
    }

    public static C0316b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f3525e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m3 = (int) m(fileInputStream, 1);
        byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
        try {
            C0316b[] n = n(byteArrayInputStream, str, m3);
            byteArrayInputStream.close();
            return n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i3) {
        byte[] f3 = f(inputStream, i3);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 += (f3[i4] & ForkServer.ERROR) << (i4 * 8);
        }
        return j3;
    }

    public static C0316b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        int i4 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0316b[0];
        }
        C0316b[] c0316bArr = new C0316b[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            int m3 = (int) m(byteArrayInputStream, 2);
            int m4 = (int) m(byteArrayInputStream, 2);
            c0316bArr[i5] = new C0316b(str, new String(f(byteArrayInputStream, m3), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m4, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m4], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i3) {
            C0316b c0316b = c0316bArr[i6];
            int available = byteArrayInputStream.available();
            int i7 = c0316b.f3517f;
            int i8 = c0316b.f3518g;
            TreeMap treeMap = c0316b.f3520i;
            int i9 = available - i7;
            int i10 = i4;
            while (byteArrayInputStream.available() > i9) {
                i10 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i10), 1);
                int m5 = (int) m(byteArrayInputStream, 2);
                while (m5 > 0) {
                    m(byteArrayInputStream, 2);
                    int m6 = (int) m(byteArrayInputStream, 1);
                    if (m6 != 6 && m6 != 7) {
                        while (m6 > 0) {
                            m(byteArrayInputStream, 1);
                            int i11 = i4;
                            int i12 = i6;
                            for (int m7 = (int) m(byteArrayInputStream, 1); m7 > 0; m7--) {
                                m(byteArrayInputStream, 2);
                            }
                            m6--;
                            i4 = i11;
                            i6 = i12;
                        }
                    }
                    m5--;
                    i4 = i4;
                    i6 = i6;
                }
            }
            int i13 = i4;
            int i14 = i6;
            if (byteArrayInputStream.available() != i9) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0316b.f3519h = g(byteArrayInputStream, c0316b.f3516e);
            BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
            for (int i15 = i13; i15 < i8; i15++) {
                int i16 = valueOf.get(i15) ? 2 : i13;
                if (valueOf.get(i15 + i8)) {
                    i16 |= 4;
                }
                if (i16 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                    if (num == null) {
                        num = Integer.valueOf(i13);
                    }
                    treeMap.put(Integer.valueOf(i15), Integer.valueOf(i16 | num.intValue()));
                }
            }
            i6 = i14 + 1;
            i4 = i13;
        }
        return c0316bArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0316b[] c0316bArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f3524d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f3525e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] b3 = b(c0316bArr, bArr3);
                u(byteArrayOutputStream, c0316bArr.length, 1);
                u(byteArrayOutputStream, b3.length, 4);
                byte[] a3 = a(b3);
                u(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = f3527g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, c0316bArr.length, 1);
                for (C0316b c0316b : c0316bArr) {
                    int size = c0316b.f3520i.size() * 4;
                    String d3 = d(bArr4, c0316b.f3512a, c0316b.f3513b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, d3.getBytes(charset).length);
                    v(byteArrayOutputStream, c0316b.f3519h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, c0316b.f3514c, 4);
                    byteArrayOutputStream.write(d3.getBytes(charset));
                    Iterator it2 = c0316b.f3520i.keySet().iterator();
                    while (it2.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i4 : c0316b.f3519h) {
                        v(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr5 = f3526f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] b4 = b(c0316bArr, bArr5);
                u(byteArrayOutputStream, c0316bArr.length, 1);
                u(byteArrayOutputStream, b4.length, 4);
                byte[] a4 = a(b4);
                u(byteArrayOutputStream, a4.length, 4);
                byteArrayOutputStream.write(a4);
                return true;
            }
            byte[] bArr6 = f3528h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, c0316bArr.length);
            for (C0316b c0316b2 : c0316bArr) {
                String str = c0316b2.f3512a;
                TreeMap treeMap = c0316b2.f3520i;
                String d4 = d(bArr6, str, c0316b2.f3513b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d4.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, c0316b2.f3519h.length);
                u(byteArrayOutputStream, c0316b2.f3514c, 4);
                byteArrayOutputStream.write(d4.getBytes(charset2));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i5 : c0316b2.f3519h) {
                    v(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, c0316bArr.length);
            int i6 = 2;
            int i7 = 2;
            for (C0316b c0316b3 : c0316bArr) {
                u(byteArrayOutputStream2, c0316b3.f3514c, 4);
                u(byteArrayOutputStream2, c0316b3.f3515d, 4);
                u(byteArrayOutputStream2, c0316b3.f3518g, 4);
                String d5 = d(bArr2, c0316b3.f3512a, c0316b3.f3513b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = d5.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(d5.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            C0326l c0326l = new C0326l(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0326l);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < c0316bArr.length) {
                try {
                    C0316b c0316b4 = c0316bArr[i8];
                    v(byteArrayOutputStream3, i8);
                    v(byteArrayOutputStream3, c0316b4.f3516e);
                    i9 = i9 + 4 + (c0316b4.f3516e * i6);
                    int[] iArr = c0316b4.f3519h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    int i11 = i6;
                    int i12 = i10;
                    while (i12 < length3) {
                        int i13 = iArr[i12];
                        v(byteArrayOutputStream3, i13 - i10);
                        i12++;
                        i10 = i13;
                    }
                    i8++;
                    i6 = i11;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            C0326l c0326l2 = new C0326l(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0326l2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (i14 < c0316bArr.length) {
                try {
                    C0316b c0316b5 = c0316bArr[i14];
                    Iterator it4 = c0316b5.f3520i.entrySet().iterator();
                    int i16 = 0;
                    while (it4.hasNext()) {
                        i16 |= ((Integer) ((Map.Entry) it4.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream4, i16, c0316b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream4, c0316b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            v(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i17 = i15 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream3, length4, 4);
                            v(byteArrayOutputStream3, i16);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i15 = i17 + length4;
                            i14++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray5.length);
            }
            C0326l c0326l3 = new C0326l(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0326l3);
            long j4 = 4;
            long size2 = j4 + j4 + 4 + (arrayList2.size() * 16);
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i18 = 0;
            while (i18 < arrayList2.size()) {
                C0326l c0326l4 = (C0326l) arrayList2.get(i18);
                int i19 = c0326l4.f3541a;
                byte[] bArr7 = c0326l4.f3542b;
                if (i19 == 1) {
                    j3 = 0;
                } else if (i19 == 2) {
                    j3 = 1;
                } else if (i19 == 3) {
                    j3 = 2;
                } else if (i19 == 4) {
                    j3 = 3;
                } else {
                    if (i19 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                u(byteArrayOutputStream, j3, 4);
                u(byteArrayOutputStream, size2, 4);
                if (c0326l4.f3543c) {
                    long length5 = bArr7.length;
                    byte[] a5 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a5);
                    u(byteArrayOutputStream, a5.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = a5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i18++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C0316b c0316b) {
        s(byteArrayOutputStream, c0316b);
        int i3 = c0316b.f3518g;
        int[] iArr = c0316b.f3519h;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            v(byteArrayOutputStream, i6 - i5);
            i4++;
            i5 = i6;
        }
        byte[] bArr = new byte[(((i3 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0316b.f3520i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i7 = intValue / 8;
                bArr[i7] = (byte) (bArr[i7] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i8 = intValue + i3;
                int i9 = i8 / 8;
                bArr[i9] = (byte) ((1 << (i8 % 8)) | bArr[i9]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C0316b c0316b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, c0316b.f3516e);
        u(byteArrayOutputStream, c0316b.f3517f, 4);
        u(byteArrayOutputStream, c0316b.f3514c, 4);
        u(byteArrayOutputStream, c0316b.f3518g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i3, C0316b c0316b) {
        int i4 = c0316b.f3518g;
        byte[] bArr = new byte[(((Integer.bitCount(i3 & (-2)) * i4) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0316b.f3520i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i5 = 0;
            for (int i6 = 1; i6 <= 4; i6 <<= 1) {
                if (i6 != 1 && (i6 & i3) != 0) {
                    if ((i6 & intValue2) == i6) {
                        int i7 = (i5 * i4) + intValue;
                        int i8 = i7 / 8;
                        bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
                    }
                    i5++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, C0316b c0316b) {
        int i3 = 0;
        for (Map.Entry entry : c0316b.f3520i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i3);
                v(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, j0.InterfaceC0318d r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.AbstractC0319e.t(android.content.Context, java.util.concurrent.Executor, j0.d, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) ((j3 >> (i4 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        u(byteArrayOutputStream, i3, 2);
    }
}
