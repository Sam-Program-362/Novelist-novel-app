package L1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* loaded from: classes.dex */
public final class g extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f876a;

    public g(WebViewActivity webViewActivity) {
        this.f876a = webViewActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("close action".equals(intent.getAction())) {
            this.f876a.finish();
        }
    }
}
