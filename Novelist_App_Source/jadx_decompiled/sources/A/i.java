package A;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements C.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26b;

    public /* synthetic */ i(Object obj, int i3) {
        this.f25a = i3;
        this.f26b = obj;
    }

    @Override // C.a
    public final void accept(Object obj) {
        switch (this.f25a) {
            case 0:
                j jVar = (j) obj;
                if (jVar == null) {
                    jVar = new j(-3);
                }
                ((c) this.f26b).z(jVar);
                return;
            default:
                j jVar2 = (j) obj;
                synchronized (k.f31c) {
                    try {
                        o.j jVar3 = k.f32d;
                        ArrayList arrayList = (ArrayList) jVar3.get((String) this.f26b);
                        if (arrayList == null) {
                            return;
                        }
                        jVar3.remove((String) this.f26b);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ((C.a) arrayList.get(i3)).accept(jVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
