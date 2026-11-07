package B;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ Class B() {
        return AutofillManager.class;
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ AutofillManager f(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue g(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return BasicFileAttributes.class;
    }

    public static /* synthetic */ Locale.LanguageRange r(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void t() {
    }
}
