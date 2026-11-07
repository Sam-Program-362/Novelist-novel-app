package p028j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t extends j implements SubMenu {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f3502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f3503w;

    public t(Context context, j jVar, k kVar) {
        super(context);
        this.f3502v = jVar;
        this.f3503w = kVar;
    }

    @Override // p028j.j
    public final boolean d(k kVar) {
        return this.f3502v.d(kVar);
    }

    @Override // p028j.j
    public final boolean e(j jVar, MenuItem menuItem) {
        super.e(jVar, menuItem);
        return this.f3502v.e(jVar, menuItem);
    }

    @Override // p028j.j
    public final boolean f(k kVar) {
        return this.f3502v.f(kVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3503w;
    }

    @Override // p028j.j
    public final j j() {
        return this.f3502v.j();
    }

    @Override // p028j.j
    public final boolean l() {
        return this.f3502v.l();
    }

    @Override // p028j.j
    public final boolean m() {
        return this.f3502v.m();
    }

    @Override // p028j.j
    public final boolean n() {
        return this.f3502v.n();
    }

    @Override // p028j.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f3502v.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3503w.setIcon(drawable);
        return this;
    }

    @Override // p028j.j, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f3502v.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        q(0, null, i3, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        q(i3, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.f3503w.setIcon(i3);
        return this;
    }
}
