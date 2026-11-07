package C1;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f170c;

    public /* synthetic */ a(Object obj, Object obj2, int i3) {
        this.f168a = i3;
        this.f170c = obj;
        this.f169b = obj2;
    }

    @Override // C1.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f168a) {
            case 0:
                B1.s sVar = (B1.s) this.f170c;
                try {
                    ((c) this.f169b).e(((l) sVar.f146m).b(byteBuffer));
                } catch (RuntimeException e3) {
                    Log.e("BasicMessageChannel#" + ((String) sVar.f144k), "Failed to handle message reply", e3);
                    return;
                }
                break;
            default:
                B1.s sVar2 = (B1.s) this.f170c;
                B1.o oVar = (B1.o) this.f169b;
                try {
                    if (byteBuffer == null) {
                        oVar.b();
                    } else {
                        try {
                            oVar.d(((n) sVar2.f146m).e(byteBuffer));
                        } catch (i e4) {
                            oVar.a(e4.f173k, e4.getMessage(), e4.f174l);
                        }
                    }
                } catch (RuntimeException e5) {
                    Log.e("MethodChannel#" + ((String) sVar2.f144k), "Failed to handle method call result", e5);
                    return;
                }
                break;
        }
    }
}
