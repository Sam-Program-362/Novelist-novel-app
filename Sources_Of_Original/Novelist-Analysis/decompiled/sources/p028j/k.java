package p028j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p017g.a;

/* JADX INFO: loaded from: classes.dex */
public final class k implements MenuItem {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3450A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f3456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f3457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f3458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f3459h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f3461j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f3463l;
    public final j n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t f3465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f3467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f3468r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f3473z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3460i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3462k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3464m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f3469s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3470t = null;
    public boolean u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3471v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3472w = false;
    public int x = 16;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f3451B = false;
    public int y = 0;

    public k(j jVar, int i3, int i4, int i5, int i6, CharSequence charSequence) {
        this.n = jVar;
        this.f3452a = i4;
        this.f3453b = i3;
        this.f3454c = i5;
        this.f3455d = i6;
        this.f3456e = charSequence;
    }

    public static void a(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f3472w && (this.u || this.f3471v)) {
            drawable = drawable.mutate();
            if (this.u) {
                drawable.setTintList(this.f3469s);
            }
            if (this.f3471v) {
                drawable.setTintMode(this.f3470t);
            }
            this.f3472w = false;
        }
        return drawable;
    }

    public final k c(CharSequence charSequence) {
        this.f3467q = charSequence;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f3473z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3450A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final void d(boolean z3) {
        if (z3) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    public final k e(CharSequence charSequence) {
        this.f3468r = charSequence;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.y & 8) == 0 || this.f3473z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3450A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f3473z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3462k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3461j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3467q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f3453b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f3463l;
        if (drawable != null) {
            return b(drawable);
        }
        int i3 = this.f3464m;
        if (i3 == 0) {
            return null;
        }
        Drawable drawableA = a.a(this.n.f3431a, i3);
        this.f3464m = 0;
        this.f3463l = drawableA;
        return b(drawableA);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3469s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3470t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3458g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f3452a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3460i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3459h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f3454c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f3465o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3456e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3457f;
        return charSequence != null ? charSequence : this.f3456e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3468r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f3465o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f3451B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.f3473z = view;
        if (view != null && view.getId() == -1 && (i3 = this.f3452a) > 0) {
            view.setId(i3);
        }
        j jVar = this.n;
        jVar.f3441k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f3461j == c3) {
            return this;
        }
        this.f3461j = Character.toLowerCase(c3);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i3 = this.x;
        int i4 = (z3 ? 1 : 0) | (i3 & (-2));
        this.x = i4;
        if (i3 != i4) {
            this.n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i3 = this.x;
        if ((i3 & 4) == 0) {
            int i4 = (i3 & (-3)) | (z3 ? 2 : 0);
            this.x = i4;
            if (i3 != i4) {
                this.n.o(false);
            }
            return this;
        }
        j jVar = this.n;
        ArrayList arrayList = jVar.f3436f;
        int size = arrayList.size();
        jVar.s();
        for (int i5 = 0; i5 < size; i5++) {
            k kVar = (k) arrayList.get(i5);
            if (kVar.f3453b == this.f3453b && (kVar.x & 4) != 0 && kVar.isCheckable()) {
                boolean z4 = kVar == this;
                int i6 = kVar.x;
                int i7 = (z4 ? 2 : 0) | (i6 & (-3));
                kVar.x = i7;
                if (i6 != i7) {
                    kVar.n.o(false);
                }
            }
        }
        jVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3464m = 0;
        this.f3463l = drawable;
        this.f3472w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3469s = colorStateList;
        this.u = true;
        this.f3472w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3470t = mode;
        this.f3471v = true;
        this.f3472w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3458g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f3459h == c3) {
            return this;
        }
        this.f3459h = c3;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3450A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3466p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f3459h = c3;
        this.f3461j = Character.toLowerCase(c4);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i3;
        j jVar = this.n;
        jVar.f3441k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3456e = charSequence;
        this.n.o(false);
        t tVar = this.f3465o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3457f = charSequence;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i3 = this.x;
        int i4 = (z3 ? 0 : 8) | (i3 & (-9));
        this.x = i4;
        if (i3 != i4) {
            j jVar = this.n;
            jVar.f3438h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f3456e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i3) {
        if (this.f3461j == c3 && this.f3462k == i3) {
            return this;
        }
        this.f3461j = Character.toLowerCase(c3);
        this.f3462k = KeyEvent.normalizeMetaState(i3);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i3) {
        if (this.f3459h == c3 && this.f3460i == i3) {
            return this;
        }
        this.f3459h = c3;
        this.f3460i = KeyEvent.normalizeMetaState(i3);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f3459h = c3;
        this.f3460i = KeyEvent.normalizeMetaState(i3);
        this.f3461j = Character.toLowerCase(c4);
        this.f3462k = KeyEvent.normalizeMetaState(i4);
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f3463l = null;
        this.f3464m = i3;
        this.f3472w = true;
        this.n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.n.f3431a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i4;
        Context context = this.n.f3431a;
        View viewInflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f3473z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i4 = this.f3452a) > 0) {
            viewInflate.setId(i4);
        }
        j jVar = this.n;
        jVar.f3441k = true;
        jVar.o(true);
        return this;
    }
}
