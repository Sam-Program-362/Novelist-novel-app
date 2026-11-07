package Y;

import V.C0078b;
import V.l0;
import X.i;
import X.j;
import X.k;
import androidx.datastore.preferences.protobuf.AbstractC0122v;
import androidx.datastore.preferences.protobuf.AbstractC0124x;
import androidx.datastore.preferences.protobuf.C0108g;
import androidx.datastore.preferences.protobuf.C0113l;
import androidx.datastore.preferences.protobuf.C0126z;
import androidx.datastore.preferences.protobuf.InterfaceC0123w;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f1574a = new g();

    public final b a(FileInputStream fileInputStream) throws C0078b {
        byte[] bArr;
        try {
            X.f fVarO = X.f.o(fileInputStream);
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            a2.h.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map mapM = fVarO.m();
            a2.h.d(mapM, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                a2.h.d(str, "name");
                a2.h.d(kVar, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                int iC = kVar.C();
                switch (iC == 0 ? -1 : f.f1573a[j.a(iC)]) {
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
                        String strA = kVar.A();
                        a2.h.d(strA, "value.string");
                        bVar.d(dVar, strA);
                        break;
                    case 7:
                        d dVar2 = new d(str);
                        InterfaceC0123w interfaceC0123wN = kVar.B().n();
                        a2.h.d(interfaceC0123wN, "value.stringSet.stringsList");
                        bVar.d(dVar2, P1.e.n0(interfaceC0123wN));
                        break;
                    case 8:
                        d dVar3 = new d(str);
                        C0108g c0108gU = kVar.u();
                        int size = c0108gU.size();
                        if (size == 0) {
                            bArr = AbstractC0124x.f2115b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c0108gU.d(bArr2, size);
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
        } catch (C0126z e3) {
            throw new C0078b("Unable to parse preferences proto.", e3);
        }
    }

    public final void b(Object obj, l0 l0Var) throws IOException {
        AbstractC0122v abstractC0122vA;
        Map mapA = ((b) obj).a();
        X.d dVarN = X.f.n();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f1572a;
            if (value instanceof Boolean) {
                i iVarD = k.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                iVarD.c();
                k.q((k) iVarD.f2113l, zBooleanValue);
                abstractC0122vA = iVarD.a();
            } else if (value instanceof Float) {
                i iVarD2 = k.D();
                float fFloatValue = ((Number) value).floatValue();
                iVarD2.c();
                k.r((k) iVarD2.f2113l, fFloatValue);
                abstractC0122vA = iVarD2.a();
            } else if (value instanceof Double) {
                i iVarD3 = k.D();
                double dDoubleValue = ((Number) value).doubleValue();
                iVarD3.c();
                k.o((k) iVarD3.f2113l, dDoubleValue);
                abstractC0122vA = iVarD3.a();
            } else if (value instanceof Integer) {
                i iVarD4 = k.D();
                int iIntValue = ((Number) value).intValue();
                iVarD4.c();
                k.s((k) iVarD4.f2113l, iIntValue);
                abstractC0122vA = iVarD4.a();
            } else if (value instanceof Long) {
                i iVarD5 = k.D();
                long jLongValue = ((Number) value).longValue();
                iVarD5.c();
                k.l((k) iVarD5.f2113l, jLongValue);
                abstractC0122vA = iVarD5.a();
            } else if (value instanceof String) {
                i iVarD6 = k.D();
                iVarD6.c();
                k.m((k) iVarD6.f2113l, (String) value);
                abstractC0122vA = iVarD6.a();
            } else if (value instanceof Set) {
                i iVarD7 = k.D();
                X.g gVarO = X.h.o();
                a2.h.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                gVarO.c();
                X.h.l((X.h) gVarO.f2113l, (Set) value);
                iVarD7.c();
                k.n((k) iVarD7.f2113l, (X.h) gVarO.a());
                abstractC0122vA = iVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                i iVarD8 = k.D();
                byte[] bArr = (byte[]) value;
                C0108g c0108g = C0108g.f2044m;
                C0108g c0108gC = C0108g.c(bArr, 0, bArr.length);
                iVarD8.c();
                k.p((k) iVarD8.f2113l, c0108gC);
                abstractC0122vA = iVarD8.a();
            }
            dVarN.getClass();
            str.getClass();
            dVarN.c();
            X.f.l((X.f) dVarN.f2113l).put(str, (k) abstractC0122vA);
        }
        X.f fVar = (X.f) dVarN.a();
        int iA = fVar.a(null);
        Logger logger = C0113l.n;
        if (iA > 4096) {
            iA = 4096;
        }
        C0113l c0113l = new C0113l(l0Var, iA);
        fVar.b(c0113l);
        if (c0113l.f2081l > 0) {
            c0113l.c0();
        }
    }
}
