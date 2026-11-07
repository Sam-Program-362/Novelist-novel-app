package io.flutter.plugin.editing;

import B1.t;
import B1.v;
import D.C0013n;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.platform.r;
import io.flutter.plugin.platform.s;

/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public final View f3136a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f3137b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f3138c;

    /* renamed from: d, reason: collision with root package name */
    public final A.c f3139d;

    /* renamed from: e, reason: collision with root package name */
    public C0013n f3140e = new C0013n(1, 0);

    /* renamed from: f, reason: collision with root package name */
    public t f3141f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f3142g;

    /* renamed from: h, reason: collision with root package name */
    public f f3143h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3144i;

    /* renamed from: j, reason: collision with root package name */
    public InputConnection f3145j;

    /* renamed from: k, reason: collision with root package name */
    public final s f3146k;

    /* renamed from: l, reason: collision with root package name */
    public final r f3147l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f3148m;
    public final ImeSyncDeferringInsetsCallback n;

    /* renamed from: o, reason: collision with root package name */
    public v f3149o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3150p;

    public j(View view, A.c cVar, H0.i iVar, s sVar, r rVar) {
        this.f3136a = view;
        this.f3143h = new f(null, view);
        this.f3137b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            this.f3138c = B.a.f(view.getContext().getSystemService(B.a.B()));
        } else {
            this.f3138c = null;
        }
        if (i3 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new B1.a(this, 17));
        }
        this.f3139d = cVar;
        cVar.f7m = new B1.g(this, 13);
        ((B1.s) cVar.f6l).s("TextInputClient.requestExistingInputState", null, null);
        this.f3146k = sVar;
        sVar.f3233q = this;
        this.f3147l = rVar;
        rVar.f3212p = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r7 == r0.f167e) goto L38;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r19) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.j.a(boolean):void");
    }

    public final void b(int i3) {
        C0013n c0013n = this.f3140e;
        int i4 = c0013n.f252b;
        if ((i4 == 3 || i4 == 4) && c0013n.f253c == i3) {
            this.f3140e = new C0013n(1, 0);
            d();
            View view = this.f3136a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f3137b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f3144i = false;
        }
    }

    public final void c() {
        this.f3146k.f3233q = null;
        this.f3147l.f3212p = null;
        this.f3139d.f7m = null;
        d();
        this.f3143h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        t tVar;
        B1.s sVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f3138c) == null || (tVar = this.f3141f) == null || (sVar = tVar.f156j) == null || this.f3142g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f3136a, ((String) sVar.f144k).hashCode());
    }

    public final void e(t tVar) {
        B1.s sVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (tVar == null || (sVar = tVar.f156j) == null) {
            this.f3142g = null;
            return;
        }
        t[] tVarArr = tVar.f158l;
        SparseArray sparseArray = new SparseArray();
        this.f3142g = sparseArray;
        if (tVarArr == null) {
            sparseArray.put(((String) sVar.f144k).hashCode(), tVar);
            return;
        }
        for (t tVar2 : tVarArr) {
            B1.s sVar2 = tVar2.f156j;
            if (sVar2 != null) {
                String str = (String) sVar2.f144k;
                this.f3142g.put(str.hashCode(), tVar2);
                AutofillManager autofillManager = this.f3138c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((v) sVar2.n).f163a);
                autofillManager.notifyValueChanged(this.f3136a, hashCode, forText);
            }
        }
    }
}
