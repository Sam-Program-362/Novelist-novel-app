package p031k;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class V implements TextWatcher {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SearchView f3653k;

    public V(SearchView searchView) {
        this.f3653k = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        SearchView searchView = this.f3653k;
        Editable text = searchView.f1832z.getText();
        searchView.f1824i0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.t(!zIsEmpty);
        int i6 = 8;
        if (searchView.f1823h0 && !searchView.f1816a0 && zIsEmpty) {
            searchView.f1799E.setVisibility(8);
            i6 = 0;
        }
        searchView.f1801G.setVisibility(i6);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
