package m0;

import B1.p;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427a implements InterfaceC0430d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f4096a = new LinkedHashSet();

    public C0427a(p pVar) {
        pVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // m0.InterfaceC0430d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4096a));
        return bundle;
    }
}
