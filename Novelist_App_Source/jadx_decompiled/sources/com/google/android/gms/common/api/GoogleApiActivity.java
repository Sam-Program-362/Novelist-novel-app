package com.google.android.gms.common.api;

import J0.a;
import L0.C0044d;
import M0.r;
import Z0.d;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import t.AbstractC0468a;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f2717l = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2718k = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        if (i3 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2718k = 0;
            setResult(i4, intent);
            if (booleanExtra) {
                C0044d f3 = C0044d.f(this);
                if (i4 == -1) {
                    d dVar = f3.f812m;
                    dVar.sendMessage(dVar.obtainMessage(3));
                } else if (i4 == 0) {
                    f3.g(new a(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i3 == 2) {
            this.f2718k = 0;
            setResult(i4, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f2718k = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2718k = bundle.getInt("resolution");
        }
        if (this.f2718k == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            r.f(num);
            J0.d.f550c.c(this, num.intValue(), this);
            this.f2718k = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f2718k = 1;
            } catch (ActivityNotFoundException e3) {
                e = e3;
                if (extras.getBoolean("notify_manager", true)) {
                    C0044d.f(this).g(new a(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String b3 = AbstractC0468a.b("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        b3 = b3.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", b3, e);
                }
                googleApiActivity.f2718k = 1;
                finish();
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e5) {
            e = e5;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e6) {
            e = e6;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2718k);
        super.onSaveInstanceState(bundle);
    }
}
