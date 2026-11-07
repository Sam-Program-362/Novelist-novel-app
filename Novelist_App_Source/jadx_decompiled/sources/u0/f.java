package u0;

import P1.m;
import X.j;
import Z1.l;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes.dex */
public final class f extends E2.a {

    /* renamed from: e, reason: collision with root package name */
    public final Object f4594e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4595f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4596g;

    /* renamed from: h, reason: collision with root package name */
    public final K.c f4597h;

    public f(Object obj, String str, C0481a c0481a, int i3) {
        Collection collection;
        a2.h.e(obj, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        B1.e.q("verificationMode", i3);
        this.f4594e = obj;
        this.f4595f = str;
        this.f4596g = i3;
        String i4 = E2.a.i(obj, str);
        a2.h.e(i4, "message");
        K.c cVar = new K.c(i4);
        StackTraceElement[] stackTrace = cVar.getStackTrace();
        a2.h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(B1.e.h("Requested element count ", length, " is less than zero.").toString());
        }
        if (length == 0) {
            collection = m.f1219k;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                collection = length3 != 0 ? length3 != 1 ? new ArrayList(new P1.b(stackTrace, false)) : E2.a.B(stackTrace[0]) : m.f1219k;
            } else if (length == 1) {
                collection = E2.a.B(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i5 = length2 - length; i5 < length2; i5++) {
                    arrayList.add(stackTrace[i5]);
                }
                collection = arrayList;
            }
        }
        cVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f4597h = cVar;
    }

    @Override // E2.a
    public final Object e() {
        int a3 = j.a(this.f4596g);
        if (a3 == 0) {
            throw this.f4597h;
        }
        if (a3 != 1) {
            if (a3 == 2) {
                return null;
            }
            throw new D0.a();
        }
        String i3 = E2.a.i(this.f4594e, this.f4595f);
        a2.h.e(i3, "message");
        Log.d("g", i3);
        return null;
    }

    @Override // E2.a
    public final E2.a L(String str, l lVar) {
        return this;
    }
}
