package io.flutter.embedding.engine.renderer;

import io.flutter.view.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f3045l;

    public /* synthetic */ c(p pVar, int i3) {
        this.f3044k = i3;
        this.f3045l = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3044k) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f3045l).lambda$dequeueImage$0();
                break;
            default:
                ((h) this.f3045l).getClass();
                break;
        }
    }
}
