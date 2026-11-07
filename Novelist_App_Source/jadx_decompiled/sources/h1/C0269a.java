package h1;

import H.m;
import H2.h;
import P1.o;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269a extends m {

    /* renamed from: d, reason: collision with root package name */
    public final String f2891d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2892e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2893f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2894g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0269a(String str, String str2, boolean z3, boolean z4) {
        super(h.O(str, str2, z3, z4), h.O(str, str2, z3, z4), z4, o.f1221k, 500);
        a2.h.e(str, "serverClientId");
        this.f2891d = str;
        this.f2892e = str2;
        this.f2893f = z3;
        this.f2894g = z4;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }
}
