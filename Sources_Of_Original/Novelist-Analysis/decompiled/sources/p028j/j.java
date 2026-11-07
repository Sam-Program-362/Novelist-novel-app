package p028j;

import B1.a;
import B1.g;
import D.AbstractC0005f;
import D.H;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p031k.InterfaceC0234l;

/* JADX INFO: loaded from: classes.dex */
public class j implements Menu {
    public static final int[] u = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f3432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f3435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f3436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f3437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f3439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f3440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f3442l;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f3448s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3443m = false;
    public boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3444o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3445p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f3446q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f3447r = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3449t = false;

    public j(Context context) {
        boolean zQ;
        boolean z3 = false;
        this.f3431a = context;
        Resources resources = context.getResources();
        this.f3432b = resources;
        this.f3436f = new ArrayList();
        this.f3437g = new ArrayList();
        this.f3438h = true;
        this.f3439i = new ArrayList();
        this.f3440j = new ArrayList();
        this.f3441k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = H.f189a;
            if (Build.VERSION.SDK_INT >= 28) {
                zQ = AbstractC0005f.q(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zQ = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zQ) {
                z3 = true;
            }
        }
        this.f3434d = z3;
    }

    public final k a(int i3, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 < 0 || i7 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i8 = (u[i7] << 16) | (65535 & i5);
        k kVar = new k(this, i3, i4, i5, i8, charSequence);
        ArrayList arrayList = this.f3436f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((k) arrayList.get(size)).f3455d <= i8) {
                i6 = size + 1;
                arrayList.add(i6, kVar);
                o(true);
                return kVar;
            }
        }
        i6 = 0;
        arrayList.add(i6, kVar);
        o(true);
        return kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f3431a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            k kVarA = a(i3, i4, i5, resolveInfo.loadLabel(packageManager));
            kVarA.setIcon(resolveInfo.loadIcon(packageManager));
            kVarA.f3458g = intent2;
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = kVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f3447r.add(new WeakReference(pVar));
        pVar.f(context, this);
        this.f3441k = true;
    }

    public final void c(boolean z3) {
        if (this.f3445p) {
            return;
        }
        this.f3445p = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3447r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.b(this, z3);
            }
        }
        this.f3445p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        k kVar = this.f3448s;
        if (kVar != null) {
            d(kVar);
        }
        this.f3436f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f3442l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(k kVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3447r;
        boolean zI = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3448s == kVar) {
            s();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar != null) {
                    zI = pVar.i(kVar);
                    if (zI) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            r();
            if (zI) {
                this.f3448s = null;
            }
        }
        return zI;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        InterfaceC0234l interfaceC0234l;
        a aVar = this.f3435e;
        if (aVar == null || (interfaceC0234l = ((ActionMenuView) aVar.f80l).f1783H) == null) {
            return false;
        }
        ((Toolbar) ((g) interfaceC0234l).f90l).getClass();
        return false;
    }

    public boolean f(k kVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3447r;
        boolean zC = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar != null) {
                zC = pVar.c(kVar);
                if (zC) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        r();
        if (zC) {
            this.f3448s = kVar;
        }
        return zC;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f3436f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            k kVar = (k) arrayList.get(i4);
            if (kVar.f3452a == i3) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (menuItemFindItem = kVar.f3465o.findItem(i3)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final k g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3446q;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (k) arrayList.get(0);
        }
        boolean zM = m();
        for (int i4 = 0; i4 < size; i4++) {
            k kVar = (k) arrayList.get(i4);
            char c3 = zM ? kVar.f3461j : kVar.f3459h;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (zM && c3 == '\b' && i3 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f3436f.get(i3);
    }

    public final void h(List list, int i3, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList = this.f3436f;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                k kVar = (k) arrayList.get(i4);
                if (kVar.hasSubMenu()) {
                    kVar.f3465o.h(list, i3, keyEvent);
                }
                char c3 = zM ? kVar.f3461j : kVar.f3459h;
                if ((modifiers & 69647) == ((zM ? kVar.f3462k : kVar.f3460i) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (zM && c3 == '\b' && i3 == 67)) && kVar.isEnabled()) {
                        list.add(kVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f3436f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((k) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.f3441k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3447r;
            boolean zG = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= pVar.g();
                }
            }
            ArrayList arrayList = this.f3439i;
            ArrayList arrayList2 = this.f3440j;
            if (zG) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i3 = 0; i3 < size; i3++) {
                    k kVar = (k) arrayListK.get(i3);
                    if ((kVar.x & 32) == 32) {
                        arrayList.add(kVar);
                    } else {
                        arrayList2.add(kVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f3441k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z3 = this.f3438h;
        ArrayList arrayList = this.f3437g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3436f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList2.get(i3);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.f3438h = false;
        this.f3441k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f3449t;
    }

    public boolean m() {
        return this.f3433c;
    }

    public boolean n() {
        return this.f3434d;
    }

    public final void o(boolean z3) {
        if (this.f3443m) {
            this.n = true;
            if (z3) {
                this.f3444o = true;
                return;
            }
            return;
        }
        if (z3) {
            this.f3438h = true;
            this.f3441k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3447r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.d();
            }
        }
        r();
    }

    public final boolean p(MenuItem menuItem, l lVar, int i3) {
        boolean zExpandActionView;
        k kVar = (k) menuItem;
        boolean zK = false;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        j jVar = kVar.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = kVar.f3466p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(kVar)) && !jVar.e(jVar, kVar)) {
            Intent intent = kVar.f3458g;
            if (intent != null) {
                try {
                    jVar.f3431a.startActivity(intent);
                    zExpandActionView = true;
                } catch (ActivityNotFoundException e3) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
                    zExpandActionView = false;
                }
            }
            zExpandActionView = false;
        } else {
            zExpandActionView = true;
        }
        if ((kVar.y & 8) != 0 && kVar.f3473z != null) {
            zExpandActionView |= kVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (kVar.hasSubMenu()) {
            if ((i3 & 4) == 0) {
                c(false);
            }
            if (!kVar.hasSubMenu()) {
                t tVar = new t(this.f3431a, this, kVar);
                kVar.f3465o = tVar;
                tVar.setHeaderTitle(kVar.f3456e);
            }
            t tVar2 = kVar.f3465o;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f3447r;
            if (!copyOnWriteArrayList.isEmpty()) {
                zK = lVar != null ? lVar.k(tVar2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    p pVar = (p) weakReference.get();
                    if (pVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zK) {
                        zK = pVar.k(tVar2);
                    }
                }
            }
            zExpandActionView |= zK;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i3 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return p(findItem(i3), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        k kVarG = g(i3, keyEvent);
        boolean zP = kVarG != null ? p(kVarG, null, i4) : false;
        if ((i4 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i3, CharSequence charSequence, int i4, View view) {
        if (view != null) {
            this.f3442l = null;
        } else {
            if (i3 > 0) {
                this.f3442l = this.f3432b.getText(i3);
            } else if (charSequence != null) {
                this.f3442l = charSequence;
            }
            if (i4 > 0) {
                this.f3431a.getDrawable(i4);
            }
        }
        o(false);
    }

    public final void r() {
        this.f3443m = false;
        if (this.n) {
            this.n = false;
            o(this.f3444o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f3436f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((k) arrayList.get(i5)).f3453b == i3) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((k) arrayList.get(i5)).f3453b != i3) {
                    break;
                }
                if (i5 >= 0) {
                    ArrayList arrayList2 = this.f3436f;
                    if (i5 < arrayList2.size()) {
                        arrayList2.remove(i5);
                    }
                }
                i4 = i6;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f3436f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((k) arrayList.get(i4)).f3452a == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f3436f;
            if (i4 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i4);
            o(true);
        }
    }

    public final void s() {
        if (this.f3443m) {
            return;
        }
        this.f3443m = true;
        this.n = false;
        this.f3444o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z3, boolean z4) {
        ArrayList arrayList = this.f3436f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            k kVar = (k) arrayList.get(i4);
            if (kVar.f3453b == i3) {
                kVar.x = (kVar.x & (-5)) | (z4 ? 4 : 0);
                kVar.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f3449t = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z3) {
        ArrayList arrayList = this.f3436f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            k kVar = (k) arrayList.get(i4);
            if (kVar.f3453b == i3) {
                kVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z3) {
        ArrayList arrayList = this.f3436f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            k kVar = (k) arrayList.get(i4);
            if (kVar.f3453b == i3) {
                int i5 = kVar.x;
                int i6 = (i5 & (-9)) | (z3 ? 0 : 8);
                kVar.x = i6;
                if (i5 != i6) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f3433c = z3;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3436f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f3432b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f3432b.getString(i3));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        k kVarA = a(i3, i4, i5, charSequence);
        t tVar = new t(this.f3431a, this, kVarA);
        kVarA.f3465o = tVar;
        tVar.setHeaderTitle(kVarA.f3456e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return a(i3, i4, i5, this.f3432b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f3432b.getString(i6));
    }

    public j j() {
        return this;
    }
}
