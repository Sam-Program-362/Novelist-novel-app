package org.apache.tika.parser;

import org.apache.tika.utils.ProcessUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4220k;

    public /* synthetic */ a(int i3) {
        this.f4220k = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4220k) {
            case 0:
                AbstractExternalProcessParser.lambda$static$0();
                break;
            default:
                ProcessUtils.lambda$static$0();
                break;
        }
    }
}
