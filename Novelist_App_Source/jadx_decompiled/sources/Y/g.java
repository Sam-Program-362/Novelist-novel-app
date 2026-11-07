package Y;

import V.C0078b;
import V.l0;
import X.i;
import X.j;
import X.k;
import androidx.datastore.preferences.protobuf.AbstractC0124v;
import androidx.datastore.preferences.protobuf.AbstractC0126x;
import androidx.datastore.preferences.protobuf.C0110g;
import androidx.datastore.preferences.protobuf.C0115l;
import androidx.datastore.preferences.protobuf.C0128z;
import androidx.datastore.preferences.protobuf.InterfaceC0125w;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1574a = new g();

    public final b a(FileInputStream fileInputStream) {
        byte[] bArr;
        try {
            X.f o2 = X.f.o(fileInputStream);
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            a2.h.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map m3 = o2.m();
            a2.h.d(m3, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m3.entrySet()) {
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                a2.h.d(str, "name");
                a2.h.d(kVar, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                int C2 = kVar.C();
                switch (C2 == 0 ? -1 : f.f1573a[j.a(C2)]) {
                    case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                        throw new C0078b("Value case is null.", null);
                    case 0:
                    default:
                        throw new D0.a();
                    case 1:
                        bVar.d(new d(str), Boolean.valueOf(kVar.t()));
                        break;
                    case 2:
                        bVar.d(new d(str), Float.valueOf(kVar.x()));
                        break;
                    case 3:
                        bVar.d(new d(str), Double.valueOf(kVar.w()));
                        break;
                    case 4:
                        bVar.d(new d(str), Integer.valueOf(kVar.y()));
                        break;
                    case 5:
                        bVar.d(new d(str), Long.valueOf(kVar.z()));
                        break;
                    case 6:
                        d dVar = new d(str);
                        String A2 = kVar.A();
                        a2.h.d(A2, "value.string");
                        bVar.d(dVar, A2);
                        break;
                    case 7:
                        d dVar2 = new d(str);
                        InterfaceC0125w n = kVar.B().n();
                        a2.h.d(n, "value.stringSet.stringsList");
                        bVar.d(dVar2, P1.e.n0(n));
                        break;
                    case 8:
                        d dVar3 = new d(str);
                        C0110g u = kVar.u();
                        int size = u.size();
                        if (size == 0) {
                            bArr = AbstractC0126x.f2115b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u.d(bArr2, size);
                            bArr = bArr2;
                        }
                        a2.h.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(dVar3, bArr);
                        break;
                    case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                        throw new C0078b("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (C0128z e3) {
            throw new C0078b("Unable to parse preferences proto.", e3);
        }
    }

    public final void b(Object obj, l0 l0Var) {
        AbstractC0124v a3;
        Map a4 = ((b) obj).a();
        X.d n = X.f.n();
        for (Map.Entry entry : a4.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f1572a;
            if (value instanceof Boolean) {
                i D2 = k.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D2.c();
                k.q((k) D2.f2113l, booleanValue);
                a3 = D2.a();
            } else if (value instanceof Float) {
                i D3 = k.D();
                float floatValue = ((Number) value).floatValue();
                D3.c();
                k.r((k) D3.f2113l, floatValue);
                a3 = D3.a();
            } else if (value instanceof Double) {
                i D4 = k.D();
                double doubleValue = ((Number) value).doubleValue();
                D4.c();
                k.o((k) D4.f2113l, doubleValue);
                a3 = D4.a();
            } else if (value instanceof Integer) {
                i D5 = k.D();
                int intValue = ((Number) value).intValue();
                D5.c();
                k.s((k) D5.f2113l, intValue);
                a3 = D5.a();
            } else if (value instanceof Long) {
                i D6 = k.D();
                long longValue = ((Number) value).longValue();
                D6.c();
                k.l((k) D6.f2113l, longValue);
                a3 = D6.a();
            } else if (value instanceof String) {
                i D7 = k.D();
                D7.c();
                k.m((k) D7.f2113l, (String) value);
                a3 = D7.a();
            } else if (value instanceof Set) {
                i D8 = k.D();
                X.g o2 = X.h.o();
                a2.h.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o2.c();
                X.h.l((X.h) o2.f2113l, (Set) value);
                D8.c();
                k.n((k) D8.f2113l, (X.h) o2.a());
                a3 = D8.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                i D9 = k.D();
                byte[] bArr = (byte[]) value;
                C0110g c0110g = C0110g.f2044m;
                C0110g c3 = C0110g.c(bArr, 0, bArr.length);
                D9.c();
                k.p((k) D9.f2113l, c3);
                a3 = D9.a();
            }
            n.getClass();
            str.getClass();
            n.c();
            X.f.l((X.f) n.f2113l).put(str, (k) a3);
        }
        X.f fVar = (X.f) n.a();
        int a5 = fVar.a(null);
        Logger logger = C0115l.n;
        if (a5 > 4096) {
            a5 = 4096;
        }
        C0115l c0115l = new C0115l(l0Var, a5);
        fVar.b(c0115l);
        if (c0115l.f2081l > 0) {
            c0115l.c0();
        }
    }
}
