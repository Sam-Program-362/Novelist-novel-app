package p023h1;

import H.m;
import P1.o;
import S0.a;
import a2.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2897f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, String str3) {
        super(a.J(str, str2, str3), a.J(str, str2, str3), true, o.f1221k, 2000);
        h.e(str, "serverClientId");
        this.f2895d = str;
        this.f2896e = str2;
        this.f2897f = str3;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }
}
