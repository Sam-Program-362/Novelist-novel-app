package A;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class h implements Callable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f21k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f22l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f23m;
    public final /* synthetic */ int n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f24o;

    public /* synthetic */ h(String str, Context context, Object obj, int i3, int i4) {
        this.f21k = i4;
        this.f22l = str;
        this.f23m = context;
        this.f24o = obj;
        this.n = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f21k) {
            case 0:
                Object[] objArr = {(g) this.f24o};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return k.b(this.f22l, this.f23m, Collections.unmodifiableList(arrayList), this.n);
            default:
                try {
                    return k.b(this.f22l, this.f23m, (ArrayList) this.f24o, this.n);
                } catch (Throwable unused) {
                    return new j(-3);
                }
        }
    }
}
