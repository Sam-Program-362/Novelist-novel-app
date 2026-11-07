package G0;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ c f394l = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f395k;

    public /* synthetic */ c(int i3) {
        this.f395k = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f395k) {
        }
        return ((Scope) obj).f2720l.compareTo(((Scope) obj2).f2720l);
    }
}
