package p069z0;

import C.a;
import a2.h;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p052r1.k;
import p064x0.j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4745a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f4747c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f4746b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f4748d = new LinkedHashSet();

    public f(Context context) {
        this.f4745a = context;
    }

    @Override // C.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        ReentrantLock reentrantLock = this.f4746b;
        reentrantLock.lock();
        try {
            this.f4747c = e.b(this.f4745a, windowLayoutInfo);
            Iterator it2 = this.f4748d.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).accept(this.f4747c);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(k kVar) {
        ReentrantLock reentrantLock = this.f4746b;
        reentrantLock.lock();
        try {
            j jVar = this.f4747c;
            if (jVar != null) {
                kVar.accept(jVar);
            }
            this.f4748d.add(kVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
