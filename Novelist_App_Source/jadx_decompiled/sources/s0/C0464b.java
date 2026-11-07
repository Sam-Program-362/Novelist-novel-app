package s0;

import android.os.Build;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0464b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0464b(String str, int i3, String str2) {
        super(str, str2);
        this.f4466d = i3;
    }

    @Override // s0.c
    public final boolean a() {
        switch (this.f4466d) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Build.VERSION.SDK_INT >= 26;
            case 4:
                return Build.VERSION.SDK_INT >= 27;
            case 5:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
