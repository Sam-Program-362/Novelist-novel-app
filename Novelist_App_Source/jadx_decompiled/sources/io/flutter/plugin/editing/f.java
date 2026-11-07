package io.flutter.plugin.editing;

import B1.v;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: k, reason: collision with root package name */
    public int f3114k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3115l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3116m = new ArrayList();
    public final ArrayList n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f3117o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public String f3118p;

    /* renamed from: q, reason: collision with root package name */
    public String f3119q;

    /* renamed from: r, reason: collision with root package name */
    public int f3120r;

    /* renamed from: s, reason: collision with root package name */
    public int f3121s;

    /* renamed from: t, reason: collision with root package name */
    public int f3122t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public final d f3123v;

    public f(v vVar, View view) {
        this.f3123v = new d(view, this);
        if (vVar != null) {
            f(vVar);
        }
    }

    public final void a(e eVar) {
        if (this.f3115l > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f3114k <= 0) {
            this.f3116m.add(eVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.n.add(eVar);
        }
    }

    public final void b() {
        this.f3114k++;
        if (this.f3115l > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f3114k != 1 || this.f3116m.isEmpty()) {
            return;
        }
        this.f3119q = toString();
        this.f3120r = Selection.getSelectionStart(this);
        this.f3121s = Selection.getSelectionEnd(this);
        this.f3122t = BaseInputConnection.getComposingSpanStart(this);
        this.u = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i3 = this.f3114k;
        if (i3 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f3116m;
        ArrayList arrayList2 = this.n;
        if (i3 == 1) {
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                this.f3115l++;
                ((e) obj).a(true);
                this.f3115l--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f3119q), (this.f3120r == Selection.getSelectionStart(this) && this.f3121s == Selection.getSelectionEnd(this)) ? false : true, (this.f3122t == BaseInputConnection.getComposingSpanStart(this) && this.u == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f3114k--;
    }

    public final void d(boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            ArrayList arrayList = this.f3116m;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                this.f3115l++;
                ((e) obj).a(z3);
                this.f3115l--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f3115l > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f3116m.remove(eVar);
        if (this.f3114k > 0) {
            this.n.remove(eVar);
        }
    }

    public final void f(v vVar) {
        b();
        replace(0, length(), (CharSequence) vVar.f163a);
        int i3 = vVar.f164b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, vVar.f165c);
        } else {
            Selection.removeSelection(this);
        }
        int i4 = vVar.f166d;
        int i5 = vVar.f167e;
        if (i4 < 0 || i4 >= i5) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f3123v.setComposingRegion(i4, i5);
        }
        this.f3117o.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        super.setSpan(obj, i3, i4, i5);
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f3132e = selectionStart;
        hVar.f3133f = selectionEnd;
        hVar.f3134g = composingSpanStart;
        hVar.f3135h = composingSpanEnd;
        hVar.f3128a = fVar;
        hVar.f3129b = StringUtils.EMPTY;
        hVar.f3130c = -1;
        hVar.f3131d = -1;
        this.f3117o.add(hVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f3118p;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f3118p = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        if (this.f3115l > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i7 = i4 - i3;
        boolean z3 = i7 != i6 - i5;
        for (int i8 = 0; i8 < i7 && !z3; i8++) {
            z3 |= charAt(i3 + i8) != charSequence.charAt(i5 + i8);
        }
        if (z3) {
            this.f3118p = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i3, i4, charSequence, i5, i6);
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        h hVar = new h();
        hVar.f3132e = selectionStart2;
        hVar.f3133f = selectionEnd2;
        hVar.f3134g = composingSpanStart2;
        hVar.f3135h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        hVar.f3128a = fVar;
        hVar.f3129b = charSequence2;
        hVar.f3130c = i3;
        hVar.f3131d = i4;
        this.f3117o.add(hVar);
        if (this.f3114k > 0) {
            return replace;
        }
        d(z3, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
