package io.flutter.plugin.platform;

import android.view.MotionEvent;
import r1.C0459f;

/* renamed from: io.flutter.plugin.platform.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312d extends C0459f {

    /* renamed from: r, reason: collision with root package name */
    public C0309a f3173r;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0309a c0309a = this.f3173r;
        if (c0309a != null) {
            io.flutter.view.i iVar = c0309a.f3166a;
            if (iVar == null ? false : iVar.f(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
