package T;

import B1.e;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import k.h0;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: k, reason: collision with root package name */
    public boolean f1266k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1267l;

    /* renamed from: m, reason: collision with root package name */
    public Cursor f1268m;
    public Context n;

    /* renamed from: o, reason: collision with root package name */
    public int f1269o;

    /* renamed from: p, reason: collision with root package name */
    public a f1270p;

    /* renamed from: q, reason: collision with root package name */
    public b f1271q;

    /* renamed from: r, reason: collision with root package name */
    public d f1272r;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1268m;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f1270p;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f1271q;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f1268m = cursor;
            if (cursor != null) {
                a aVar2 = this.f1270p;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f1271q;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f1269o = cursor.getColumnIndexOrThrow("_id");
                this.f1266k = true;
                notifyDataSetChanged();
            } else {
                this.f1269o = -1;
                this.f1266k = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f1266k || (cursor = this.f1268m) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f1266k) {
            return null;
        }
        this.f1268m.moveToPosition(i3);
        if (view == null) {
            h0 h0Var = (h0) this;
            view = h0Var.u.inflate(h0Var.f3690t, viewGroup, false);
        }
        a(view, this.f1268m);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1272r == null) {
            d dVar = new d();
            dVar.f1273a = this;
            this.f1272r = dVar;
        }
        return this.f1272r;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i3) {
        Cursor cursor;
        if (!this.f1266k || (cursor = this.f1268m) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f1268m;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        Cursor cursor;
        if (this.f1266k && (cursor = this.f1268m) != null && cursor.moveToPosition(i3)) {
            return this.f1268m.getLong(this.f1269o);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f1266k) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1268m.moveToPosition(i3)) {
            throw new IllegalStateException(e.g("couldn't move cursor to position ", i3));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f1268m);
        return view;
    }
}
