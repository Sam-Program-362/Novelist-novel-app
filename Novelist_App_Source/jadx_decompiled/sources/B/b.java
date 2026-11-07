package B;

import android.app.ActivityManager;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ ActivityManager.TaskDescription c(String str, int i3) {
        return new ActivityManager.TaskDescription(str, 0, i3);
    }

    public static /* synthetic */ PrecomputedText.Params.Builder g(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }
}
