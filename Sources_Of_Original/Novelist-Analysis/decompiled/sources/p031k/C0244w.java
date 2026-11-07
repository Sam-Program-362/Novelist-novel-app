package p031k;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: k.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0244w extends C0243v {
    @Override // p031k.AbstractC0245x
    public boolean a(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // p031k.C0243v
    public void b(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}
