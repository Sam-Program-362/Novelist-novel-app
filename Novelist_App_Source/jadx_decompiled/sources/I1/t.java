package I1;

import D.C0002c;
import android.app.Activity;
import java.util.HashSet;
import k.u0;
import y1.C0500a;
import z1.InterfaceC0508a;
import z1.InterfaceC0509b;

/* loaded from: classes.dex */
public class t implements y1.b, InterfaceC0508a {

    /* renamed from: k, reason: collision with root package name */
    public s f518k;

    /* renamed from: l, reason: collision with root package name */
    public C1.f f519l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0509b f520m;

    @Override // z1.InterfaceC0508a
    public final void onAttachedToActivity(InterfaceC0509b interfaceC0509b) {
        this.f520m = interfaceC0509b;
        u0 u0Var = (u0) interfaceC0509b;
        u0Var.a(this.f518k);
        this.f518k.f516o = (Activity) u0Var.f3794a;
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        C1.f fVar = c0500a.f4730c;
        s sVar = new s(c0500a.f4728a, new C0002c(2), new C0002c(3), new C0002c(4));
        this.f519l = fVar;
        this.f518k = sVar;
        o.f507b.getClass();
        n.b(fVar, sVar);
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivity() {
        InterfaceC0509b interfaceC0509b = this.f520m;
        ((HashSet) ((u0) interfaceC0509b).f3797d).remove(this.f518k);
        this.f518k.f516o = null;
        this.f520m = null;
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivityForConfigChanges() {
        InterfaceC0509b interfaceC0509b = this.f520m;
        ((HashSet) ((u0) interfaceC0509b).f3797d).remove(this.f518k);
        this.f518k.f516o = null;
        this.f520m = null;
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        this.f518k = null;
        C1.f fVar = this.f519l;
        if (fVar != null) {
            o.f507b.getClass();
            n.b(fVar, null);
            this.f519l = null;
        }
    }

    @Override // z1.InterfaceC0508a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0509b interfaceC0509b) {
        this.f520m = interfaceC0509b;
        u0 u0Var = (u0) interfaceC0509b;
        u0Var.a(this.f518k);
        this.f518k.f516o = (Activity) u0Var.f3794a;
    }
}
