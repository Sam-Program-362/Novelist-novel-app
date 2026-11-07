package k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import i.InterfaceC0278a;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class n0 implements j.p {

    /* renamed from: k, reason: collision with root package name */
    public j.j f3737k;

    /* renamed from: l, reason: collision with root package name */
    public j.k f3738l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3739m;

    public n0(Toolbar toolbar) {
        this.f3739m = toolbar;
    }

    @Override // j.p
    public final boolean c(j.k kVar) {
        Toolbar toolbar = this.f3739m;
        toolbar.c();
        ViewParent parent = toolbar.f1896r.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1896r);
            }
            toolbar.addView(toolbar.f1896r);
        }
        View view = kVar.f3473z;
        if (view == null) {
            view = null;
        }
        toolbar.f1897s = view;
        this.f3738l = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1897s);
            }
            o0 g3 = Toolbar.g();
            g3.f3743a = (toolbar.x & 112) | 8388611;
            g3.f3744b = 2;
            toolbar.f1897s.setLayoutParams(g3);
            toolbar.addView(toolbar.f1897s);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((o0) childAt.getLayoutParams()).f3744b != 2 && childAt != toolbar.f1890k) {
                toolbar.removeViewAt(childCount);
                toolbar.f1884O.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f3451B = true;
        kVar.n.o(false);
        KeyEvent.Callback callback = toolbar.f1897s;
        if (callback instanceof InterfaceC0278a) {
            SearchView searchView = (SearchView) ((InterfaceC0278a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1832z;
            if (!searchView.f1825j0) {
                searchView.f1825j0 = true;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f1826k0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText(StringUtils.EMPTY);
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // j.p
    public final void d() {
        if (this.f3738l != null) {
            j.j jVar = this.f3737k;
            if (jVar != null) {
                int size = jVar.f3436f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f3737k.getItem(i3) == this.f3738l) {
                        return;
                    }
                }
            }
            i(this.f3738l);
        }
    }

    @Override // j.p
    public final void f(Context context, j.j jVar) {
        j.k kVar;
        j.j jVar2 = this.f3737k;
        if (jVar2 != null && (kVar = this.f3738l) != null) {
            jVar2.d(kVar);
        }
        this.f3737k = jVar;
    }

    @Override // j.p
    public final boolean g() {
        return false;
    }

    @Override // j.p
    public final boolean i(j.k kVar) {
        Toolbar toolbar = this.f3739m;
        KeyEvent.Callback callback = toolbar.f1897s;
        if (callback instanceof InterfaceC0278a) {
            SearchView searchView = (SearchView) ((InterfaceC0278a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1832z;
            searchAutoComplete.setText(StringUtils.EMPTY);
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f1824i0 = StringUtils.EMPTY;
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f1826k0);
            searchView.f1825j0 = false;
        }
        toolbar.removeView(toolbar.f1897s);
        toolbar.removeView(toolbar.f1896r);
        toolbar.f1897s = null;
        ArrayList arrayList = toolbar.f1884O;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3738l = null;
        toolbar.requestLayout();
        kVar.f3451B = false;
        kVar.n.o(false);
        return true;
    }

    @Override // j.p
    public final boolean k(j.t tVar) {
        return false;
    }

    @Override // j.p
    public final void b(j.j jVar, boolean z3) {
    }
}
