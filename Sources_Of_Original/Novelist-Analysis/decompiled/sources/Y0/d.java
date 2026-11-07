package Y0;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements L0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p019g1.e f1587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(K0.i iVar, p019g1.e eVar, int i3) {
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
                boolean zB = status.b();
                p019g1.e eVar = this.f1587c;
                if (!zB) {
                    eVar.a(M0.r.j(status));
                } else {
                    eVar.b(null);
                }
                break;
            default:
                boolean zB2 = status.b();
                p019g1.e eVar2 = this.f1587c;
                if (!zB2) {
                    eVar2.a(M0.r.j(status));
                } else {
                    eVar2.b(null);
                }
                break;
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
