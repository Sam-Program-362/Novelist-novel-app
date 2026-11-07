package V;

import D.AbstractC0009j;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class W implements InterfaceC0077a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f1375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f1376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S f1377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f1378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q2.c f1379e;

    public W(File file, i0 i0Var, S s3) {
        a2.h.e(i0Var, "coordinator");
        this.f1375a = file;
        this.f1376b = i0Var;
        this.f1377c = s3;
        this.f1378d = new AtomicBoolean(false);
        this.f1379e = new q2.c();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0078, blocks: (B:34:0x0077, B:43:0x0087, B:42:0x0084, B:39:0x007f), top: B:55:0x001e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [V.W] */
    /* JADX WARN: Type inference failed for: r0v14, types: [V.W] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [V.U, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [V.W] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [V.q] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final Object a(C0093q c0093q, T1.c cVar) throws Throwable {
        ?? u;
        P p3;
        Throwable th;
        ?? r6;
        ?? r3;
        if (cVar instanceof U) {
            U u3 = (U) cVar;
            int i3 = u3.f1368s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u3.f1368s = i3 - Integer.MIN_VALUE;
                u = u3;
            } else {
                u = new U(this, cVar);
            }
        } else {
            u = new U(this, cVar);
        }
        Object obj = u.f1366q;
        int i4 = u.f1368s;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0093q = u.f1365p;
                p3 = u.f1364o;
                u = u.n;
                try {
                    H2.h.E(obj);
                    r3 = u;
                    r6 = c0093q;
                    try {
                        p3.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r6 != 0) {
                        r3.f1379e.e(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        p3.close();
                    } catch (Throwable th4) {
                        E2.a.b(th, th4);
                    }
                    throw th;
                }
            }
            H2.h.E(obj);
            if (this.f1378d.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zD = this.f1379e.d();
            try {
                p3 = new P(this.f1375a);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zD);
                    u.n = this;
                    u.f1364o = p3;
                    u.f1365p = zD;
                    u.f1368s = 1;
                    Object objD = c0093q.d(p3, boolValueOf, u);
                    S1.a aVar = S1.a.f1260k;
                    if (objD == aVar) {
                        return aVar;
                    }
                    obj = objD;
                    r6 = zD;
                    r3 = this;
                    p3.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r6 != 0) {
                        r3.f1379e.e(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    c0093q = zD;
                    u = this;
                    p3.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                c0093q = zD;
                u = this;
                if (c0093q != 0) {
                    u.f1379e.e(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (c0093q != 0) {
                u.f1379e.e(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d9 A[Catch: all -> 0x0114, IOException -> 0x0117, TRY_ENTER, TryCatch #8 {IOException -> 0x0117, all -> 0x0114, blocks: (B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:51:0x00f3, B:52:0x0113, B:48:0x00ec, B:59:0x0122, B:66:0x012f, B:65:0x012c), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00df A[Catch: all -> 0x0114, IOException -> 0x0117, TryCatch #8 {IOException -> 0x0117, all -> 0x0114, blocks: (B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:51:0x00f3, B:52:0x0113, B:48:0x00ec, B:59:0x0122, B:66:0x012f, B:65:0x012c), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7 A[Catch: all -> 0x0114, IOException -> 0x0117, TryCatch #8 {IOException -> 0x0117, all -> 0x0114, blocks: (B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:51:0x00f3, B:52:0x0113, B:48:0x00ec, B:59:0x0122, B:66:0x012f, B:65:0x012c), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec A[Catch: all -> 0x0114, IOException -> 0x0117, TryCatch #8 {IOException -> 0x0117, all -> 0x0114, blocks: (B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:51:0x00f3, B:52:0x0113, B:48:0x00ec, B:59:0x0122, B:66:0x012f, B:65:0x012c), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3 A[Catch: all -> 0x0114, IOException -> 0x0117, TryCatch #8 {IOException -> 0x0117, all -> 0x0114, blocks: (B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:51:0x00f3, B:52:0x0113, B:48:0x00ec, B:59:0x0122, B:66:0x012f, B:65:0x012c), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0122 A[Catch: all -> 0x0114, IOException -> 0x0117, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x0117, all -> 0x0114, blocks: (B:43:0x00d9, B:45:0x00df, B:47:0x00e7, B:51:0x00f3, B:52:0x0113, B:48:0x00ec, B:59:0x0122, B:66:0x012f, B:65:0x012c), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00f3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.File, java.lang.Object] */
    public final Object b(M m3, T1.c cVar) throws Throwable {
        V v3;
        W w3;
        q2.a aVar;
        Z1.p pVar;
        Y y;
        Throwable th;
        Y y3;
        q2.a aVar2;
        W w4;
        File file;
        File file2;
        boolean zRenameTo;
        if (cVar instanceof V) {
            v3 = (V) cVar;
            int i3 = v3.f1374t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v3.f1374t = i3 - Integer.MIN_VALUE;
            } else {
                v3 = new V(this, cVar);
            }
        } else {
            v3 = new V(this, cVar);
        }
        Object obj = v3.f1372r;
        File file3 = v3.f1374t;
        S1.a aVar3 = S1.a.f1260k;
        try {
            try {
                try {
                    try {
                        if (file3 == 0) {
                            H2.h.E(obj);
                            if (this.f1378d.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file4 = this.f1375a;
                            File parentFile = file4.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file4);
                                }
                            }
                            v3.n = this;
                            v3.f1369o = m3;
                            q2.c cVar2 = this.f1379e;
                            v3.f1370p = cVar2;
                            v3.f1374t = 1;
                            if (cVar2.c(v3) != aVar3) {
                                w3 = this;
                                pVar = m3;
                                aVar = cVar2;
                            }
                            return aVar3;
                        }
                        if (file3 != 1) {
                            if (file3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y3 = v3.f1371q;
                            File file5 = (File) v3.f1370p;
                            q2.a aVar4 = (q2.a) v3.f1369o;
                            w4 = v3.n;
                            try {
                                H2.h.E(obj);
                                file = file5;
                                aVar2 = aVar4;
                                try {
                                    y3.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file.exists()) {
                                    file2 = w4.f1375a;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = AbstractC0009j.e(file, file2);
                                    } else {
                                        zRenameTo = file.renameTo(file2);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + file + " to " + w4.f1375a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                ((q2.c) aVar2).e(null);
                                return O1.g.f1211a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    y3.close();
                                } catch (Throwable th4) {
                                    E2.a.b(th, th4);
                                }
                                throw th;
                            }
                        }
                        q2.a aVar5 = (q2.a) v3.f1370p;
                        Z1.p pVar2 = (Z1.p) v3.f1369o;
                        w3 = v3.n;
                        H2.h.E(obj);
                        aVar = aVar5;
                        pVar = pVar2;
                        v3.n = w3;
                        v3.f1369o = aVar;
                        v3.f1370p = file3;
                        v3.f1371q = y;
                        v3.f1374t = 2;
                        if (pVar.e(y, v3) != aVar3) {
                            aVar2 = aVar;
                            w4 = w3;
                            y3 = y;
                            file = file3;
                            y3.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file.exists()) {
                                file2 = w4.f1375a;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zRenameTo = AbstractC0009j.e(file, file2);
                                } else {
                                    zRenameTo = file.renameTo(file2);
                                }
                                if (zRenameTo) {
                                    throw new IOException("Unable to rename " + file + " to " + w4.f1375a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            ((q2.c) aVar2).e(null);
                            return O1.g.f1211a;
                        }
                        return aVar3;
                    } catch (Throwable th5) {
                        th = th5;
                        y3 = y;
                        y3.close();
                        throw th;
                    }
                    y = new Y(file3);
                } catch (IOException e3) {
                    e = e3;
                    if (file3.exists()) {
                        file3.delete();
                    }
                    throw e;
                }
                file3 = new File(w3.f1375a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                ((q2.c) obj).e(null);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (Throwable th7) {
            th = th7;
            obj = 2;
            ((q2.c) obj).e(null);
            throw th;
        }
    }

    @Override // V.InterfaceC0077a
    public final void close() throws NoSuchMethodException, ClassNotFoundException {
        this.f1378d.set(true);
        this.f1377c.a();
    }
}
