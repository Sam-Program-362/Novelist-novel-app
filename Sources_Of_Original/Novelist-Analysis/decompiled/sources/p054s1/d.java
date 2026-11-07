package p054s1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4503c;

    public d(String str, int i3, String str2) {
        this(str, str2, "io.flutter.embedding.android.", false);
    }

    public d(String str, String str2) {
        this(str, str2, "io.flutter.embedding.android.", true);
    }

    public d(String str, String str2, String str3, boolean z3) {
        this.f4501a = str;
        this.f4502b = str3.concat(str2);
        this.f4503c = z3;
    }
}
