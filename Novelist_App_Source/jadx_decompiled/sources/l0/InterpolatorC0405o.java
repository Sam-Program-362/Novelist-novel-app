package l0;

import android.view.animation.Interpolator;

/* renamed from: l0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC0405o implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        float f4 = f3 - 1.0f;
        return (f4 * f4 * f4 * f4 * f4) + 1.0f;
    }
}
