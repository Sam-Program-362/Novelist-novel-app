package androidx.appcompat.widget;

import A0.j;
import T1.f;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import it.returntrue.novelist.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.apache.tika.utils.StringUtils;
import p031k.AbstractC0235m;
import p031k.H;
import p031k.I;
import p031k.V;
import p031k.W;
import p031k.X;
import p031k.Y;
import p031k.Z;
import p031k.a0;
import p031k.b0;
import p031k.c0;
import p031k.d0;
import p031k.e0;
import p031k.f0;
import p031k.h0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends H implements p025i.a {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final f f1794q0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final View f1795A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final View f1796B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final View f1797C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ImageView f1798D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageView f1799E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ImageView f1800F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ImageView f1801G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final View f1802H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public f0 f1803I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Rect f1804J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Rect f1805K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int[] f1806L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int[] f1807M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ImageView f1808N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Drawable f1809O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f1810P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f1811Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Intent f1812R;
    public final Intent S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final CharSequence f1813T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public View.OnFocusChangeListener f1814U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public View.OnClickListener f1815V;
    public boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1816a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public T.c f1817b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f1818c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public CharSequence f1819d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f1820e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f1821f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f1822g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f1823h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public CharSequence f1824i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f1825j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f1826k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public SearchableInfo f1827l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Bundle f1828m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final W f1829n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final W f1830o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final WeakHashMap f1831p0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SearchAutoComplete f1832z;

    public static class SearchAutoComplete extends AbstractC0235m {
        public int n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public SearchView f1833o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f1834p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final c f1835q;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1835q = new c(this);
            this.n = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i3 = configuration.screenWidthDp;
            int i4 = configuration.screenHeightDp;
            if (i3 >= 960 && i4 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i3 < 600) {
                return (i3 < 640 || i4 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            f fVar = SearchView.f1794q0;
            fVar.getClass();
            f.a();
            Method method = fVar.f1281c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.n <= 0 || super.enoughToFilter();
        }

        @Override // p031k.AbstractC0235m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1834p) {
                c cVar = this.f1835q;
                removeCallbacks(cVar);
                post(cVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z3, int i3, Rect rect) {
            super.onFocusChanged(z3, i3, rect);
            SearchView searchView = this.f1833o;
            searchView.u(searchView.f1816a0);
            searchView.post(searchView.f1829n0);
            if (searchView.f1832z.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1833o.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z3) {
            super.onWindowFocusChanged(z3);
            if (z3 && this.f1833o.hasFocus() && getVisibility() == 0) {
                this.f1834p = true;
                Context context = getContext();
                f fVar = SearchView.f1794q0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f1835q;
            if (!z3) {
                this.f1834p = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1834p = true;
                    return;
                }
                this.f1834p = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1833o = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.n = i3;
        }
    }

    static {
        f fVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            f fVar2 = new f();
            fVar2.f1279a = null;
            fVar2.f1280b = null;
            fVar2.f1281c = null;
            f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                fVar2.f1279a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                fVar2.f1280b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                fVar2.f1281c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            fVar = fVar2;
        }
        f1794q0 = fVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f1832z;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1821f0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1832z;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1821f0 = false;
    }

    public int getImeOptions() {
        return this.f1832z.getImeOptions();
    }

    public int getInputType() {
        return this.f1832z.getInputType();
    }

    public int getMaxWidth() {
        return this.f1822g0;
    }

    public CharSequence getQuery() {
        return this.f1832z.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1819d0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1827l0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1813T : getContext().getText(this.f1827l0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1811Q;
    }

    public int getSuggestionRowLayout() {
        return this.f1810P;
    }

    public T.c getSuggestionsAdapter() {
        return this.f1817b0;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1824i0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1828m0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1827l0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1828m0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int i3 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1832z;
        if (i3 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        f fVar = f1794q0;
        fVar.getClass();
        f.a();
        Method method = fVar.f1279a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        f.a();
        Method method2 = fVar.f1280b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f1832z;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText(StringUtils.EMPTY);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.W) {
            clearFocus();
            u(true);
        }
    }

    public final void l(int i3) {
        int position;
        String strH;
        Cursor cursor = this.f1817b0.f1268m;
        if (cursor != null && cursor.moveToPosition(i3)) {
            Intent intentH = null;
            try {
                int i4 = h0.f3680I;
                String strH2 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f1827l0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f1827l0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = h0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentH = h(strH2, strH3 == null ? null : Uri.parse(strH3), h0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), h0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e3) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e3);
            }
            if (intentH != null) {
                try {
                    getContext().startActivity(intentH);
                } catch (RuntimeException e4) {
                    Log.e("SearchView", "Failed launch activity: " + intentH, e4);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1832z;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i3) {
        Editable text = this.f1832z.getText();
        Cursor cursor = this.f1817b0.f1268m;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i3)) {
            setQuery(text);
            return;
        }
        String strC = this.f1817b0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f1832z;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1827l0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1829n0);
        post(this.f1830o0);
        super.onDetachedFromWindow();
    }

    @Override // p031k.H, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (z3) {
            SearchAutoComplete searchAutoComplete = this.f1832z;
            int[] iArr = this.f1806L;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f1807M;
            getLocationInWindow(iArr2);
            int i7 = iArr[1] - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i8;
            int height = searchAutoComplete.getHeight() + i7;
            Rect rect = this.f1804J;
            rect.set(i8, i7, width, height);
            int i9 = rect.left;
            int i10 = rect.right;
            int i11 = i6 - i4;
            Rect rect2 = this.f1805K;
            rect2.set(i9, 0, i10, i11);
            f0 f0Var = this.f1803I;
            if (f0Var == null) {
                f0 f0Var2 = new f0(rect2, rect, searchAutoComplete);
                this.f1803I = f0Var2;
                setTouchDelegate(f0Var2);
            } else {
                f0Var.f3668b.set(rect2);
                Rect rect3 = f0Var.f3670d;
                rect3.set(rect2);
                int i12 = -f0Var.f3671e;
                rect3.inset(i12, i12);
                f0Var.f3669c.set(rect);
            }
        }
    }

    @Override // p031k.H, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f1816a0) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            int i6 = this.f1822g0;
            size = i6 > 0 ? Math.min(i6, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1822g0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i5 = this.f1822g0) > 0) {
            size = Math.min(i5, size);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e0 e0Var = (e0) parcelable;
        super.onRestoreInstanceState(e0Var.f1286k);
        u(e0Var.f3664m);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e0 e0Var = new e0(super.onSaveInstanceState());
        e0Var.f3664m = this.f1816a0;
        return e0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        post(this.f1829n0);
    }

    public final void p() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f1832z.getText());
        int i3 = (!zIsEmpty || (this.W && !this.f1825j0)) ? 0 : 8;
        ImageView imageView = this.f1800F;
        imageView.setVisibility(i3);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void q() {
        int[] iArr = this.f1832z.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1796B.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1797C.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = StringUtils.EMPTY;
        }
        boolean z3 = this.W;
        SearchAutoComplete searchAutoComplete = this.f1832z;
        CharSequence charSequence2 = charSequence;
        if (z3 && (drawable = this.f1809O) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        if (this.f1821f0 || !isFocusable()) {
            return false;
        }
        if (this.f1816a0) {
            return super.requestFocus(i3, rect);
        }
        boolean zRequestFocus = this.f1832z.requestFocus(i3, rect);
        if (zRequestFocus) {
            u(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        this.f1797C.setVisibility(((this.f1818c0 || this.f1823h0) && !this.f1816a0 && (this.f1799E.getVisibility() == 0 || this.f1801G.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1828m0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f1832z;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1815V;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.W == z3) {
            return;
        }
        this.W = z3;
        u(z3);
        r();
    }

    public void setImeOptions(int i3) {
        this.f1832z.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.f1832z.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.f1822g0 = i3;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1814U = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1815V = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1819d0 = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        this.f1820e0 = z3;
        T.c cVar = this.f1817b0;
        if (cVar instanceof h0) {
            ((h0) cVar).f3681A = z3 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z3;
        this.f1827l0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f1832z;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1827l0.getImeOptions());
            int inputType = this.f1827l0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1827l0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            T.c cVar = this.f1817b0;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f1827l0.getSuggestAuthority() != null) {
                h0 h0Var = new h0(getContext(), this, this.f1827l0, this.f1831p0);
                this.f1817b0 = h0Var;
                searchAutoComplete.setAdapter(h0Var);
                ((h0) this.f1817b0).f3681A = this.f1820e0 ? 2 : 1;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f1827l0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1827l0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1812R;
            } else if (this.f1827l0.getVoiceSearchLaunchRecognizer()) {
                intent = this.S;
            }
            z3 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f1823h0 = z3;
        if (z3) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f1816a0);
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f1818c0 = z3;
        u(this.f1816a0);
    }

    public void setSuggestionsAdapter(T.c cVar) {
        this.f1817b0 = cVar;
        this.f1832z.setAdapter(cVar);
    }

    public final void t(boolean z3) {
        boolean z4 = this.f1818c0;
        this.f1799E.setVisibility((!z4 || !(z4 || this.f1823h0) || this.f1816a0 || !hasFocus() || (!z3 && this.f1823h0)) ? 8 : 0);
    }

    public final void u(boolean z3) {
        this.f1816a0 = z3;
        int i3 = 8;
        int i4 = z3 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f1832z.getText());
        this.f1798D.setVisibility(i4);
        t(!zIsEmpty);
        this.f1795A.setVisibility(z3 ? 8 : 0);
        ImageView imageView = this.f1808N;
        imageView.setVisibility((imageView.getDrawable() == null || this.W) ? 8 : 0);
        p();
        if (this.f1823h0 && !this.f1816a0 && zIsEmpty) {
            this.f1799E.setVisibility(8);
            i3 = 0;
        }
        this.f1801G.setVisibility(i3);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f1804J = new Rect();
        this.f1805K = new Rect();
        this.f1806L = new int[2];
        this.f1807M = new int[2];
        this.f1829n0 = new W(this, 0);
        this.f1830o0 = new W(this, 1);
        this.f1831p0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        Z z3 = new Z(this);
        a0 a0Var = new a0(this);
        I i4 = new I(this, 1);
        V v3 = new V(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p013f.a.f2805r, i3, 0);
        j jVar = new j(context, typedArrayObtainStyledAttributes);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1832z = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1795A = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f1796B = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f1797C = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1798D = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1799E = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1800F = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1801G = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1808N = imageView5;
        viewFindViewById.setBackground(jVar.y(10));
        viewFindViewById2.setBackground(jVar.y(14));
        imageView.setImageDrawable(jVar.y(13));
        imageView2.setImageDrawable(jVar.y(7));
        imageView3.setImageDrawable(jVar.y(4));
        imageView4.setImageDrawable(jVar.y(16));
        imageView5.setImageDrawable(jVar.y(13));
        this.f1809O = jVar.y(12);
        E2.a.Q(getResources().getString(R.string.abc_searchview_description_search), imageView);
        this.f1810P = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1811Q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(v3);
        searchAutoComplete.setOnEditorActionListener(z3);
        searchAutoComplete.setOnItemClickListener(a0Var);
        searchAutoComplete.setOnItemSelectedListener(i4);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new X(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f1813T = typedArrayObtainStyledAttributes.getText(6);
        this.f1819d0 = typedArrayObtainStyledAttributes.getText(11);
        int i5 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i5 != -1) {
            setImeOptions(i5);
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i6 != -1) {
            setInputType(i6);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        jVar.J();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1812R = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.S = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1802H = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new Y(this));
        }
        u(this.W);
        r();
    }

    public void setOnCloseListener(b0 b0Var) {
    }

    public void setOnQueryTextListener(c0 c0Var) {
    }

    public void setOnSuggestionListener(d0 d0Var) {
    }
}
