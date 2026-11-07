package Y0;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class d extends h implements L0.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.e f1587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(K0.i iVar, g1.e eVar, int i3) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 1);
        this.f1586b = i3;
        this.f1587c = eVar;
    }

    @Override // L0.e
    public final void i(Status status) {
        switch (this.f1586b) {
            case 0:
                H2.h.y(status, null, this.f1587c);
                break;
            case 1:
                boolean b3 = status.b();
                g1.e eVar = this.f1587c;
                if (!b3) {
                    eVar.a(M0.r.j(status));
                    break;
                } else {
                    eVar.b(null);
                    break;
                }
            default:
                boolean b4 = status.b();
                g1.e eVar2 = this.f1587c;
                if (!b4) {
                    eVar2.a(M0.r.j(status));
                    break;
                } else {
                    eVar2.b(null);
                    break;
                }
        }
    }

    @Override // Y0.h
    public final boolean l(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) Z0.a.a(parcel, Status.CREATOR);
        Z0.a.b(parcel);
        i(status);
        return true;
    }
}
