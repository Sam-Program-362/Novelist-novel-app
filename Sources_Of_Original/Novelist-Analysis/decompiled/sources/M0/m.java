package M0;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f971c;

    public /* synthetic */ m(Intent intent, Object obj, int i3) {
        this.f969a = i3;
        this.f970b = intent;
        this.f971c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [L0.f, java.lang.Object] */
    public final void a() {
        switch (this.f969a) {
            case 0:
                Intent intent = this.f970b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f971c).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f970b;
                if (intent2 != null) {
                    this.f971c.a(intent2, 2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e3) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e3);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
