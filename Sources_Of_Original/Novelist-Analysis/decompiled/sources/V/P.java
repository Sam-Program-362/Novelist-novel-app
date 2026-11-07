package V;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class P implements InterfaceC0077a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f1355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1356b = new AtomicBoolean(false);

    public P(File file) {
        this.f1355a = file;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [V.P] */
    /* JADX WARN: Type inference failed for: r9v0, types: [V.P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [V.P] */
    public static Object a(P p3, T1.c cVar) throws IllegalAccessException, IOException, InvocationTargetException {
        O o2;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (cVar instanceof O) {
            o2 = (O) cVar;
            int i3 = o2.f1354r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o2.f1354r = i3 - Integer.MIN_VALUE;
            } else {
                o2 = new O(p3, cVar);
            }
        } else {
            o2 = new O(p3, cVar);
        }
        Object obj = o2.f1352p;
        ?? r3 = o2.f1354r;
        Y.g gVar = Y.g.f1574a;
        boolean z3 = true;
        S1.a aVar = S1.a.f1260k;
        try {
            if (r3 != 0) {
                if (r3 == 1) {
                    fileInputStream = o2.f1351o;
                    r3 = (P) o2.n;
                    try {
                        H2.h.E(obj);
                        p000a.a.m(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            p000a.a.m(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) o2.n;
                try {
                    H2.h.E(obj);
                    p000a.a.m(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        p000a.a.m(closeable, th);
                        throw th6;
                    }
                }
            }
            H2.h.E(obj);
            if (p3.f1356b.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(p3.f1355a);
                try {
                    o2.n = p3;
                    o2.f1351o = fileInputStream2;
                    o2.f1354r = 1;
                    Y.b bVarA = gVar.a(fileInputStream2);
                    if (bVarA != aVar) {
                        fileInputStream = fileInputStream2;
                        obj = bVarA;
                        p000a.a.m(fileInputStream, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r3 = p3;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (!p3.f1355a.exists()) {
                    return new Y.b(z3);
                }
                FileInputStream fileInputStream3 = new FileInputStream(p3.f1355a);
                try {
                    o2.n = fileInputStream3;
                    o2.f1351o = null;
                    o2.f1354r = 2;
                    Y.b bVarA2 = gVar.a(fileInputStream3);
                    if (bVarA2 != aVar) {
                        obj = bVarA2;
                        closeable = fileInputStream3;
                        p000a.a.m(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
            return aVar;
        } catch (FileNotFoundException unused2) {
            p3 = r3;
        }
    }

    @Override // V.InterfaceC0077a
    public final void close() {
        this.f1356b.set(true);
    }
}
