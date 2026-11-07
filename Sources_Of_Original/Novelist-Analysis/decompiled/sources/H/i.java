package H;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class i extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, Bundle bundle) {
        super(str, bundle);
        a2.h.e(bundle, "data");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
