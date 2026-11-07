package androidx.credentials.playservices.controllers.identitycredentials;

import M1.A;
import N.c;
import a2.h;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public class IdentityCredentialApiHiddenActivity extends Activity {

    /* renamed from: k, reason: collision with root package name */
    public ResultReceiver f1957k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1958l;

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        ResultReceiver resultReceiver = this.f1957k;
        if (resultReceiver != null) {
            int i5 = c.f1184c;
            A.i(resultReceiver, i3, i4, intent);
        }
        this.f1958l = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f1957k = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_ERROR_NAME");
        if (stringExtra == null) {
            finish();
            return;
        }
        if (bundle != null) {
            this.f1958l = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.f1958l) {
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("EXTRA_FLOW_PENDING_INTENT");
        if (pendingIntent != null) {
            this.f1958l = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), c.f1183b, null, 0, 0, 0, null);
            return;
        }
        ResultReceiver resultReceiver2 = this.f1957k;
        if (resultReceiver2 != null) {
            int i3 = c.f1184c;
            A.h(resultReceiver2, stringExtra, "Internal error");
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        h.e(bundle, "outState");
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f1958l);
        super.onSaveInstanceState(bundle);
    }
}
