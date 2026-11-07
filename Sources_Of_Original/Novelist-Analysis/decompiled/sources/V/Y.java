package V;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends P {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, T1.c cVar) throws IllegalAccessException, IOException, InvocationTargetException {
        X x;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof X) {
            x = (X) cVar;
            int i3 = x.f1383r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x.f1383r = i3 - Integer.MIN_VALUE;
            } else {
                x = new X(this, cVar);
            }
        } else {
            x = new X(this, cVar);
        }
        Object obj2 = x.f1381p;
        int i4 = x.f1383r;
        O1.g gVar = O1.g.f1211a;
        if (i4 == 0) {
            H2.h.E(obj2);
            if (this.f1356b.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f1355a);
            try {
                Y.g gVar2 = Y.g.f1574a;
                l0 l0Var = new l0(fileOutputStream3);
                x.n = fileOutputStream3;
                x.f1380o = fileOutputStream3;
                x.f1383r = 1;
                gVar2.b(obj, l0Var);
                S1.a aVar = S1.a.f1260k;
                if (gVar == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = x.f1380o;
            fileOutputStream = x.n;
            try {
                H2.h.E(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    p000a.a.m(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        p000a.a.m(fileOutputStream, null);
        return gVar;
    }
}
