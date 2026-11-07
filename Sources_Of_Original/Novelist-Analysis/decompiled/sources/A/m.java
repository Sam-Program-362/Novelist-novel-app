package A;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f35a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40f;

    public m(Uri uri, int i3, int i4, boolean z3, String str, int i5) {
        uri.getClass();
        this.f35a = uri;
        this.f36b = i3;
        this.f37c = i4;
        this.f38d = z3;
        this.f39e = str;
        this.f40f = i5;
    }

    public m(String str, String str2) {
        this.f35a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f36b = 0;
        this.f37c = 400;
        this.f38d = false;
        this.f39e = str2;
        this.f40f = 0;
    }
}
