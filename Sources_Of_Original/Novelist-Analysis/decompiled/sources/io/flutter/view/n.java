package io.flutter.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3376b;

    public n(View view, int i3) {
        this.f3375a = view;
        this.f3376b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3376b == nVar.f3376b && this.f3375a.equals(nVar.f3375a);
    }

    public final int hashCode() {
        return ((this.f3375a.hashCode() + 31) * 31) + this.f3376b;
    }
}
