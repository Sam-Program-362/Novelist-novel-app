package p028j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f3426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3427l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3428m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LayoutInflater f3429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3430p;

    public h(j jVar, LayoutInflater layoutInflater, boolean z3, int i3) {
        this.n = z3;
        this.f3429o = layoutInflater;
        this.f3426k = jVar;
        this.f3430p = i3;
        a();
    }

    public final void a() {
        j jVar = this.f3426k;
        k kVar = jVar.f3448s;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.f3440j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((k) arrayList.get(i3)) == kVar) {
                    this.f3427l = i3;
                    return;
                }
            }
        }
        this.f3427l = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k getItem(int i3) {
        ArrayList arrayListK;
        boolean z3 = this.n;
        j jVar = this.f3426k;
        if (z3) {
            jVar.i();
            arrayListK = jVar.f3440j;
        } else {
            arrayListK = jVar.k();
        }
        int i4 = this.f3427l;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (k) arrayListK.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        boolean z3 = this.n;
        j jVar = this.f3426k;
        if (z3) {
            jVar.i();
            arrayListK = jVar.f3440j;
        } else {
            arrayListK = jVar.k();
        }
        return this.f3427l < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f3429o.inflate(this.f3430p, viewGroup, false);
        }
        int i4 = getItem(i3).f3453b;
        int i5 = i3 - 1;
        int i6 = i5 >= 0 ? getItem(i5).f3453b : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3426k.l() && i4 != i6) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        q qVar = (q) view;
        if (this.f3428m) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.a(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
