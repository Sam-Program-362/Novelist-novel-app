package p015f1;

import L0.y;
import Y0.h;
import Z0.a;
import android.os.Parcel;
import org.apache.tika.fork.ContentHandlerProxy;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends h {
    @Override // Y0.h
    public final boolean l(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 3:
                a.b(parcel);
                break;
            case 4:
                a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                a.b(parcel);
                break;
            case 7:
                a.b(parcel);
                break;
            case 8:
                f fVar = (f) a.a(parcel, f.CREATOR);
                a.b(parcel);
                y yVar = (y) this;
                yVar.f860c.post(new A.a(yVar, fVar, 3, false));
                break;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
