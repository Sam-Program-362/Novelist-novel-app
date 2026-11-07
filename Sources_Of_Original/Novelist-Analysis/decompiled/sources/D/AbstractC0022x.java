package D;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: D.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0022x {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i3 = I.f190a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
