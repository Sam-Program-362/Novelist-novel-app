package s;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f4463a;

    static {
        new HashSet();
    }

    public h(Context context) {
        this.f4463a = (NotificationManager) context.getSystemService("notification");
    }
}
