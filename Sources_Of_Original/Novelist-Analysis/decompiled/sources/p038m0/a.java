package p038m0;

import B1.p;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f4096a = new LinkedHashSet();

    public a(p pVar) {
        pVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // p038m0.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4096a));
        return bundle;
    }
}
