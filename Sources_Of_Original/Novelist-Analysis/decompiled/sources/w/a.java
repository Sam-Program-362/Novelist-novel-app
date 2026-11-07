package w;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4633a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(int i3, int i4) {
        int iAlpha = Color.alpha(i4);
        int iAlpha2 = Color.alpha(i3);
        int i5 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i5, b(Color.red(i3), iAlpha2, Color.red(i4), iAlpha, i5), b(Color.green(i3), iAlpha2, Color.green(i4), iAlpha, i5), b(Color.blue(i3), iAlpha2, Color.blue(i4), iAlpha, i5));
    }

    public static int b(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        return (((255 - i4) * (i5 * i6)) + ((i3 * 255) * i4)) / (i7 * 255);
    }
}
