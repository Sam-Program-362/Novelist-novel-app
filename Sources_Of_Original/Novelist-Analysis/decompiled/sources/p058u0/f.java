package p058u0;

import B1.e;
import E2.a;
import K.c;
import P1.b;
import P1.m;
import X.j;
import Z1.l;
import a2.h;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f4597h;

    public f(Object obj, String str, a aVar, int i3) {
        Collection collectionB;
        h.e(obj, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        e.q("verificationMode", i3);
        this.f4594e = obj;
        this.f4595f = str;
        this.f4596g = i3;
        String strI = a.i(obj, str);
        h.e(strI, "message");
        c cVar = new c(strI);
        StackTraceElement[] stackTrace = cVar.getStackTrace();
        h.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(e.h("Requested element count ", length, " is less than zero.").toString());
        }
        if (length == 0) {
            collectionB = m.f1219k;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                collectionB = length3 != 0 ? length3 != 1 ? new ArrayList(new b(stackTrace, false)) : a.B(stackTrace[0]) : m.f1219k;
            } else if (length == 1) {
                collectionB = a.B(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i4 = length2 - length; i4 < length2; i4++) {
                    arrayList.add(stackTrace[i4]);
                }
                collectionB = arrayList;
            }
        }
        cVar.setStackTrace((StackTraceElement[]) collectionB.toArray(new StackTraceElement[0]));
        this.f4597h = cVar;
    }

    @Override // E2.a
    public final Object e() throws c {
        int iA = j.a(this.f4596g);
        if (iA == 0) {
            throw this.f4597h;
        }
        if (iA != 1) {
            if (iA == 2) {
                return null;
            }
            throw new D0.a();
        }
        String strI = a.i(this.f4594e, this.f4595f);
        h.e(strI, "message");
        Log.d("g", strI);
        return null;
    }

    @Override // E2.a
    public final a L(String str, l lVar) {
        return this;
    }
}
