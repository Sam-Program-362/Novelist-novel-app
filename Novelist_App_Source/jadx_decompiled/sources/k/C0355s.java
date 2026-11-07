package k;

import M1.RunnableC0053b;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3764b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f3765c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0356t f3766d;

    public C0355s(C0356t c0356t, int i3, int i4, WeakReference weakReference) {
        this.f3766d = c0356t;
        this.f3763a = i3;
        this.f3764b = i4;
        this.f3765c = weakReference;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new RunnableC0053b(this, 12));
    }

    public final void b(Typeface typeface) {
        int i3;
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f3763a) != -1) {
            typeface = Typeface.create(typeface, i3, (this.f3764b & 2) != 0);
        }
        C0356t c0356t = this.f3766d;
        if (c0356t.f3781m) {
            c0356t.f3780l = typeface;
            TextView textView = (TextView) this.f3765c.get();
            if (textView != null) {
                textView.setTypeface(typeface, c0356t.f3778j);
            }
        }
    }
}
