package J0;

import M0.r;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import b0.C0154a;
import b0.C0173u;
import b0.I;
import b1.C0192Q;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f549b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final d f550c = new d();

    public static AlertDialog d(Activity activity, int i3, M0.m mVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(M0.l.b(activity, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i3 != 1 ? i3 != 2 ? i3 != 3 ? resources.getString(R.string.ok) : resources.getString(it.returntrue.novelist.R.string.common_google_play_services_enable_button) : resources.getString(it.returntrue.novelist.R.string.common_google_play_services_update_button) : resources.getString(it.returntrue.novelist.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, mVar);
        }
        String c3 = M0.l.c(activity, i3);
        if (c3 != null) {
            builder.setTitle(c3);
        }
        Log.w("GoogleApiAvailability", B1.e.g("Creating dialog for Google Play services availability issue. ConnectionResult=", i3), new IllegalArgumentException());
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof SignInHubActivity) {
                I i3 = ((C0173u) ((SignInHubActivity) activity).f2707C.f443l).f2555p;
                h hVar = new h();
                r.g(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                hVar.f559q0 = alertDialog;
                if (onCancelListener != null) {
                    hVar.f560r0 = onCancelListener;
                }
                hVar.f2499n0 = false;
                hVar.f2500o0 = true;
                i3.getClass();
                C0154a c0154a = new C0154a(i3);
                c0154a.f2450o = true;
                c0154a.e(0, hVar, str);
                c0154a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        r.g(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f543k = alertDialog;
        if (onCancelListener != null) {
            bVar.f544l = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i3, GoogleApiActivity googleApiActivity2) {
        AlertDialog d3 = d(googleApiActivity, i3, new M0.m(super.a(googleApiActivity, i3, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d3 == null) {
            return;
        }
        e(googleApiActivity, d3, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i3, PendingIntent pendingIntent) {
        int i4;
        Bundle bundle;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", B1.e.h("GMS core API Availability. ConnectionResult=", i3, ", tag=null"), new IllegalArgumentException());
        if (i3 == 18) {
            new i(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e3 = i3 == 6 ? M0.l.e(context, "common_google_play_services_resolution_required_title") : M0.l.c(context, i3);
        if (e3 == null) {
            e3 = context.getResources().getString(it.returntrue.novelist.R.string.common_google_play_services_notification_ticker);
        }
        String d3 = (i3 == 6 || i3 == 19) ? M0.l.d(context, "common_google_play_services_resolution_required_text", M0.l.a(context)) : M0.l.b(context, i3);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        r.f(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        s.e eVar = new s.e();
        ArrayList arrayList = new ArrayList();
        eVar.f4449b = arrayList;
        eVar.f4450c = new ArrayList();
        eVar.f4451d = new ArrayList();
        eVar.f4456i = true;
        eVar.f4458k = false;
        Notification notification = new Notification();
        eVar.f4461o = notification;
        eVar.f4448a = context;
        eVar.f4460m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        eVar.f4455h = 0;
        eVar.f4462p = new ArrayList();
        eVar.n = true;
        eVar.f4458k = true;
        notification.flags |= 16;
        eVar.f4452e = s.e.a(e3);
        C0192Q c0192q = new C0192Q(14, false);
        c0192q.f2600m = s.e.a(d3);
        eVar.b(c0192q);
        PackageManager packageManager = context.getPackageManager();
        if (H2.h.f462e == null) {
            H2.h.f462e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (H2.h.f462e.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            eVar.f4455h = 2;
            if (H2.h.u(context)) {
                arrayList.add(new s.d(resources.getString(it.returntrue.novelist.R.string.common_open_on_phone), pendingIntent));
            } else {
                eVar.f4454g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = s.e.a(resources.getString(it.returntrue.novelist.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            eVar.f4454g = pendingIntent;
            eVar.f4453f = s.e.a(d3);
        }
        if (S0.a.w()) {
            if (!S0.a.w()) {
                throw new IllegalStateException();
            }
            synchronized (f549b) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(it.returntrue.novelist.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(B.a.c(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVar.f4460m = "com.google.android.gms.availability";
        }
        A0.j jVar = new A0.j(eVar);
        Notification.Builder builder = (Notification.Builder) jVar.f57l;
        s.e eVar2 = (s.e) jVar.f58m;
        C0192Q c0192q2 = eVar2.f4457j;
        if (c0192q2 != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) c0192q2.f2600m);
        }
        Notification build = Build.VERSION.SDK_INT >= 26 ? builder.build() : builder.build();
        if (c0192q2 != null) {
            eVar2.f4457j.getClass();
        }
        if (c0192q2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            f.f552a.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, build);
    }

    public final void g(Activity activity, L0.f fVar, int i3, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d3 = d(activity, i3, new M0.m(super.a(activity, i3, "d"), fVar, 1), onCancelListener);
        if (d3 == null) {
            return;
        }
        e(activity, d3, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
