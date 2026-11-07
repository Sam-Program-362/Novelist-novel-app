package p023h1;

import H.m;
import H2.h;
import P1.o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2894g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, boolean z3, boolean z4) {
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
