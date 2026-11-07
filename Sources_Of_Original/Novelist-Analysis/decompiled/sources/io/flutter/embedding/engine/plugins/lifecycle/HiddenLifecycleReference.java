package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC0140n;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class HiddenLifecycleReference {
    private final AbstractC0140n lifecycle;

    public HiddenLifecycleReference(AbstractC0140n abstractC0140n) {
        this.lifecycle = abstractC0140n;
    }

    public AbstractC0140n getLifecycle() {
        return this.lifecycle;
    }
}
