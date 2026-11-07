package com.google.android.gms.common.api;

import A.c;
import H2.h;
import K0.n;
import K0.q;
import M0.r;
import N0.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.XMLReaderUtils;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* loaded from: classes.dex */
public final class Status extends a implements n, ReflectedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public final int f2726k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2727l;

    /* renamed from: m, reason: collision with root package name */
    public final PendingIntent f2728m;
    public final J0.a n;

    /* renamed from: o, reason: collision with root package name */
    public static final Status f2721o = new Status(0, null, null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f2722p = new Status(14, null, null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Status f2723q = new Status(8, null, null, null);

    /* renamed from: r, reason: collision with root package name */
    public static final Status f2724r = new Status(15, null, null, null);

    /* renamed from: s, reason: collision with root package name */
    public static final Status f2725s = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new q(3);

    public Status(int i3, String str, PendingIntent pendingIntent, J0.a aVar) {
        this.f2726k = i3;
        this.f2727l = str;
        this.f2728m = pendingIntent;
        this.n = aVar;
    }

    @Override // K0.n
    public final Status a() {
        return this;
    }

    public final boolean b() {
        return this.f2726k <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2726k == status.f2726k && r.i(this.f2727l, status.f2727l) && r.i(this.f2728m, status.f2728m) && r.i(this.n, status.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2726k), this.f2727l, this.f2728m, this.n});
    }

    public final String toString() {
        c cVar = new c(this);
        String str = this.f2727l;
        if (str == null) {
            int i3 = this.f2726k;
            switch (i3) {
                case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i3);
                    str = sb.toString();
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        cVar.h(str, "statusCode");
        cVar.h(this.f2728m, "resolution");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = h.Q(parcel, 20293);
        h.P(parcel, 1, 4);
        parcel.writeInt(this.f2726k);
        h.K(parcel, 2, this.f2727l);
        h.J(parcel, 3, this.f2728m, i3);
        h.J(parcel, 4, this.n, i3);
        h.R(parcel, Q2);
    }
}
