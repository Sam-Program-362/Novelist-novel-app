package T;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.i;
import p031k.h0;
import p052r1.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i3) {
        super(handler);
        this.f1262a = i3;
        this.f1263b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f1262a) {
            case 0:
                return true;
            case 1:
            default:
                return super.deliverSelfNotifications();
            case 2:
                return true;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        Cursor cursor;
        switch (this.f1262a) {
            case 0:
                h0 h0Var = (h0) this.f1263b;
                if (h0Var.f1267l && (cursor = h0Var.f1268m) != null && !cursor.isClosed()) {
                    h0Var.f1266k = h0Var.f1268m.requery();
                    break;
                }
                break;
            case 1:
                onChange(z3, null);
                break;
            default:
                super.onChange(z3);
                n nVar = (n) this.f1263b;
                if (nVar.f4406s != null) {
                    nVar.d();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h0 h0Var) {
        super(new Handler());
        this.f1262a = 0;
        this.f1263b = h0Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3, Uri uri) {
        switch (this.f1262a) {
            case 1:
                i iVar = (i) this.f1263b;
                if (!iVar.u) {
                    if (Settings.Global.getFloat(iVar.f3349f, "transition_animation_scale", 1.0f) == 0.0f) {
                        iVar.f3355l |= 4;
                    } else {
                        iVar.f3355l &= -5;
                    }
                    ((FlutterJNI) iVar.f3345b.f58m).setAccessibilityFeatures(iVar.f3355l);
                    break;
                }
                break;
            default:
                super.onChange(z3, uri);
                break;
        }
    }
}
