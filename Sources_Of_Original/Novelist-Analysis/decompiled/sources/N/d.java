package N;

import O1.g;
import R1.f;
import R1.i;
import Z1.p;
import a2.h;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import i2.d0;
import n2.v;
import org.apache.tika.fork.ContentHandlerProxy;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1185k;

    public /* synthetic */ d(int i3) {
        this.f1185k = i3;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        R1.b bVar;
        int i3 = this.f1185k;
        g gVar = g.f1211a;
        switch (i3) {
            case 0:
                Z1.a aVar = (Z1.a) obj2;
                h.e(aVar, "f");
                int i4 = c.f1184c;
                p000a.a.l((CancellationSignal) obj, aVar);
                return gVar;
            case 1:
                Z1.a aVar2 = (Z1.a) obj2;
                h.e(aVar2, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!M.h.a((CancellationSignal) obj)) {
                    aVar2.a();
                }
                return gVar;
            case 2:
                Z1.a aVar3 = (Z1.a) obj2;
                h.e(aVar3, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!M.h.a((CancellationSignal) obj)) {
                    aVar3.a();
                }
                return gVar;
            case 3:
                String str = (String) obj;
                f fVar = (f) obj2;
                h.e(str, "acc");
                h.e(fVar, "element");
                if (str.length() == 0) {
                    return fVar.toString();
                }
                return str + ", " + fVar;
            case 4:
                R1.h hVar = (R1.h) obj;
                f fVar2 = (f) obj2;
                h.e(hVar, "acc");
                h.e(fVar2, "element");
                R1.h hVarJ = hVar.j(fVar2.getKey());
                i iVar = i.f1255k;
                if (hVarJ == iVar) {
                    return fVar2;
                }
                R1.d dVar = R1.d.f1254k;
                R1.e eVar = (R1.e) hVarJ.e(dVar);
                if (eVar == null) {
                    bVar = new R1.b(hVarJ, fVar2);
                } else {
                    R1.h hVarJ2 = hVarJ.j(dVar);
                    if (hVarJ2 == iVar) {
                        return new R1.b(fVar2, eVar);
                    }
                    bVar = new R1.b(new R1.b(hVarJ2, fVar2), eVar);
                }
                return bVar;
            case 5:
                return ((R1.h) obj).i((f) obj2);
            case 6:
                return ((R1.h) obj).i((f) obj2);
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 8:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                f fVar3 = (f) obj2;
                if (!(fVar3 instanceof d0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? fVar3 : Integer.valueOf(iIntValue + 1);
            case 10:
                d0 d0Var = (d0) obj;
                f fVar4 = (f) obj2;
                if (d0Var != null) {
                    return d0Var;
                }
                if (fVar4 instanceof d0) {
                    return (d0) fVar4;
                }
                return null;
            default:
                return (v) obj;
        }
    }
}
