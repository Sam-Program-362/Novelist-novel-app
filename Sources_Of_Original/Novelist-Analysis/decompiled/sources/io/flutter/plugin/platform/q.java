package io.flutter.plugin.platform;

import android.graphics.Rect;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes.dex */
public final class q implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceView f3202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f3203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rect f3204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f3206e;

    public q(r rVar, SurfaceView surfaceView, float f3, Rect rect, int i3) {
        this.f3206e = rVar;
        this.f3202a = surfaceView;
        this.f3203b = f3;
        this.f3204c = rect;
        this.f3205d = i3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceView surfaceView = this.f3202a;
        SurfaceControl surfaceControl = surfaceView.getSurfaceControl();
        r rVar = this.f3206e;
        if (surfaceControl == null || !surfaceControl.isValid()) {
            surfaceView.getId();
        } else {
            rVar.getClass();
            SurfaceControl.Transaction transactionK = p.k();
            rVar.f3217v.add(transactionK);
            transactionK.setAlpha(surfaceControl, this.f3203b).setCrop(surfaceControl, this.f3204c);
        }
        rVar.f3211o.scheduleFrame();
        rVar.f3219z.remove(Integer.valueOf(this.f3205d));
        surfaceView.getHolder().removeCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f3206e.f3219z.remove(Integer.valueOf(this.f3205d));
        this.f3202a.getHolder().removeCallback(this);
    }
}
