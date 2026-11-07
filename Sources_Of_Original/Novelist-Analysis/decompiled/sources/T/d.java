package T;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import org.apache.tika.utils.StringUtils;
import p031k.h0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f1273a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((h0) this.f1273a).c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorG;
        h0 h0Var = (h0) this.f1273a;
        SearchView searchView = h0Var.f3691v;
        String string = charSequence == null ? StringUtils.EMPTY : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorG = h0Var.g(h0Var.f3692w, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException e3) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e3);
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        c cVar = this.f1273a;
        Cursor cursor = cVar.f1268m;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((h0) cVar).b((Cursor) obj);
    }
}
