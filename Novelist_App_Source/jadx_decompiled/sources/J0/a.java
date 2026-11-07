package J0;

import M0.r;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.XMLReaderUtils;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* loaded from: classes.dex */
public final class a extends N0.a {

    /* renamed from: k, reason: collision with root package name */
    public final int f539k;

    /* renamed from: l, reason: collision with root package name */
    public final int f540l;

    /* renamed from: m, reason: collision with root package name */
    public final PendingIntent f541m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f542o;

    /* renamed from: p, reason: collision with root package name */
    public static final a f538p = new a(0, null, null);
    public static final Parcelable.Creator<a> CREATOR = new F0.l(16);

    public a(int i3, int i4, PendingIntent pendingIntent, String str, Integer num) {
        this.f539k = i3;
        this.f540l = i4;
        this.f541m = pendingIntent;
        this.n = str;
        this.f542o = num;
    }

    public static String b(int i3) {
        if (i3 == 99) {
            return "UNFINISHED";
        }
        if (i3 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i3) {
            case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i3) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i3);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f540l == aVar.f540l && r.i(this.f541m, aVar.f541m) && r.i(this.n, aVar.n) && r.i(this.f542o, aVar.f542o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f540l), this.f541m, this.n, this.f542o});
    }

    public final String toString() {
        A.c cVar = new A.c(this);
        cVar.h(b(this.f540l), "statusCode");
        cVar.h(this.f541m, "resolution");
        cVar.h(this.n, "message");
        cVar.h(this.f542o, "clientMethodKey");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f539k);
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(this.f540l);
        H2.h.J(parcel, 3, this.f541m, i3);
        H2.h.K(parcel, 4, this.n);
        Integer num = this.f542o;
        if (num != null) {
            H2.h.P(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        H2.h.R(parcel, Q2);
    }

    public a(int i3, PendingIntent pendingIntent, String str) {
        this(1, i3, pendingIntent, str, null);
    }
}
