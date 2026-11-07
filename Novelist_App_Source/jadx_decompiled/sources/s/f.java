package s;

import android.app.Notification;
import android.graphics.Insets;

/* loaded from: classes.dex */
public abstract class f {
    public static Insets a(int i3, int i4, int i5, int i6) {
        return Insets.of(i3, i4, i5, i6);
    }

    public static void b(Notification.Builder builder, boolean z3) {
        builder.setAllowSystemGeneratedContextualActions(z3);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void d(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
