package androidx.appcompat.view.menu;

import A0.j;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p028j.i;
import p028j.k;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f1723k = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        j jVarF = j.F(context, attributeSet, f1723k, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) jVarF.f58m;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(jVarF.y(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(jVarF.y(1));
        }
        jVarF.J();
    }

    @Override // p028j.i
    public final boolean a(k kVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        throw null;
    }
}
