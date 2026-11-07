package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f1907k;

    public c(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f1907k = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f1907k;
        if (searchAutoComplete.f1834p) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f1834p = false;
        }
    }
}
