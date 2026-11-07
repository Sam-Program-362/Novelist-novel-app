package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC0142n;

@Keep
/* loaded from: classes.dex */
public class HiddenLifecycleReference {
    private final AbstractC0142n lifecycle;

    public HiddenLifecycleReference(AbstractC0142n abstractC0142n) {
        this.lifecycle = abstractC0142n;
    }

    public AbstractC0142n getLifecycle() {
        return this.lifecycle;
    }
}
