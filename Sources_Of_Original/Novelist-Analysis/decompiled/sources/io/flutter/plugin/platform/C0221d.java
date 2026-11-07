package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* JADX INFO: renamed from: io.flutter.plugin.platform.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0221d extends p052r1.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0218a f3173r;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0218a c0218a = this.f3173r;
        if (c0218a != null) {
            io.flutter.view.i iVar = c0218a.f3166a;
            if (iVar == null ? false : iVar.f(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
