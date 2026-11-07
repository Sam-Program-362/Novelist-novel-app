package M1;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: M1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0074x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0069s f1169b;

    public C0074x(String str, C0069s c0069s) {
        this.f1168a = str;
        this.f1169b = c0069s;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        this.f1169b.f1156a.e(new M.c(this, str, 2));
    }
}
