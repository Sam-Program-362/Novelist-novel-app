package c0;

import a2.h;
import p003b0.AbstractComponentCallbacksC0163s;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractComponentCallbacksC0163s f2652k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s, String str) {
        super(str);
        h.e(abstractComponentCallbacksC0163s, "fragment");
        this.f2652k = abstractComponentCallbacksC0163s;
    }
}
