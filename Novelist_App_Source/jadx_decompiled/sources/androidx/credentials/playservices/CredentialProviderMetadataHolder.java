package androidx.credentials.playservices;

import M.a;
import a2.h;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* renamed from: k, reason: collision with root package name */
    public final a f1954k = new a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h.e(intent, "intent");
        return this.f1954k;
    }
}
