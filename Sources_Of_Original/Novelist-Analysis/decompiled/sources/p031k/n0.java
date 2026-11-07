package p031k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import p025i.a;
import p028j.j;
import p028j.k;
import p028j.p;
import p028j.t;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f3737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f3738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3739m;

    public n0(Toolbar toolbar) {
        this.f3739m = toolbar;
    }

    @Override // p028j.p
    public final boolean c(k kVar) {
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
            o0 o0VarG = Toolbar.g();
            o0VarG.f3743a = (toolbar.x & 112) | 8388611;
            o0VarG.f3744b = 2;
            toolbar.f1897s.setLayoutParams(o0VarG);
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
        if (callback instanceof a) {
            SearchView searchView = (SearchView) ((a) callback);
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

    @Override // p028j.p
    public final void d() {
        if (this.f3738l != null) {
            j jVar = this.f3737k;
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

    @Override // p028j.p
    public final void f(Context context, j jVar) {
        k kVar;
        j jVar2 = this.f3737k;
        if (jVar2 != null && (kVar = this.f3738l) != null) {
            jVar2.d(kVar);
        }
        this.f3737k = jVar;
    }

    @Override // p028j.p
    public final boolean g() {
        return false;
    }

    @Override // p028j.p
    public final boolean i(k kVar) {
        Toolbar toolbar = this.f3739m;
        KeyEvent.Callback callback = toolbar.f1897s;
        if (callback instanceof a) {
            SearchView searchView = (SearchView) ((a) callback);
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

    @Override // p028j.p
    public final boolean k(t tVar) {
        return false;
    }

    @Override // p028j.p
    public final void b(j jVar, boolean z3) {
    }
}
