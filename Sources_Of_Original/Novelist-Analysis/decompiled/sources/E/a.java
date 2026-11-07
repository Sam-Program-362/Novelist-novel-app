package E;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f276m;

    public a(int i3, h hVar, int i4) {
        this.f274k = i3;
        this.f275l = hVar;
        this.f276m = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f274k);
        this.f275l.f284a.performAction(this.f276m, bundle);
    }
}
