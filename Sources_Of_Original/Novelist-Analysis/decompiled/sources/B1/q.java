package B1;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f139c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f141b;

    public q(DisplayMetrics displayMetrics) {
        int i3 = f139c;
        f139c = i3 + 1;
        this.f140a = i3;
        this.f141b = displayMetrics;
    }
}
