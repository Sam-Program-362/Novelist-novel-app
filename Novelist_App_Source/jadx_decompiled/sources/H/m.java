package H;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f414a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f415b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f416c;

    public m(Bundle bundle, Bundle bundle2, boolean z3, Set set, int i3) {
        a2.h.e(set, "allowedProviders");
        a2.h.e(set, "allowedProviders");
        this.f414a = bundle;
        this.f415b = bundle2;
        this.f416c = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z3);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z3);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i3);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i3);
        if (i3 == 100) {
            throw new IllegalArgumentException("Custom types should not have passkey level priority.");
        }
    }
}
