package h1;

import H.m;
import P1.o;
import a2.h;

/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: d, reason: collision with root package name */
    public final String f2895d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2896e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2897f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, String str3) {
        super(S0.a.J(str, str2, str3), S0.a.J(str, str2, str3), true, o.f1221k, 2000);
        h.e(str, "serverClientId");
        this.f2895d = str;
        this.f2896e = str2;
        this.f2897f = str3;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }
}
