package io.flutter.plugin.platform;

import M1.K;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p052r1.AbstractActivityC0262b;

/* JADX INFO: loaded from: classes.dex */
public final class o implements B1.n, h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f3201l;

    public /* synthetic */ o(Object obj, int i3) {
        this.f3200k = i3;
        this.f3201l = obj;
    }

    @Override // B1.n
    public void a(boolean z3) {
        ((s) this.f3201l).f3222B = z3;
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i3, int i4) {
        ((TextureRegistry$SurfaceProducer) this.f3201l).setSize(i3, i4);
    }

    public CharSequence c(B1.h hVar) {
        Activity activity = ((f) this.f3201l).f3176a;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (hVar != null) {
                            if (hVar == B1.h.f91k) {
                            }
                        }
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            return text;
                        }
                        try {
                            Uri uri = itemAt.getUri();
                            if (uri == null) {
                                Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence charSequenceCoerceToText = itemAt.coerceToText(activity);
                            if (assetFileDescriptorOpenTypedAssetFileDescriptor == null) {
                                return charSequenceCoerceToText;
                            }
                            try {
                                assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                return charSequenceCoerceToText;
                            } catch (IOException e3) {
                                charSequence = charSequenceCoerceToText;
                                e = e3;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            charSequence = text;
                        }
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return charSequence;
            } catch (SecurityException e6) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e6);
                return charSequence;
            }
        }
        return null;
    }

    @Override // B1.n
    public void d(int i3, double d3, double d4) {
        s sVar = (s) this.f3201l;
        if (sVar.g(i3)) {
            return;
        }
        j jVar = (j) sVar.y.get(i3);
        if (jVar == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i3);
            return;
        }
        int iM = sVar.m(d3);
        int iM2 = sVar.m(d4);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
        layoutParams.topMargin = iM;
        layoutParams.leftMargin = iM2;
        layoutParams.gravity = 51;
        jVar.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.n, java.lang.Runnable] */
    @Override // B1.n
    public void e(B1.m mVar, final B1.d dVar) {
        h hVar;
        s sVar = (s) this.f3201l;
        int iM = sVar.m(mVar.f128b);
        int iM2 = sVar.m(mVar.f129c);
        int i3 = mVar.f127a;
        if (!sVar.g(i3)) {
            g gVar = (g) sVar.f3237v.get(i3);
            j jVar = (j) sVar.y.get(i3);
            if (gVar == null || jVar == null) {
                Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i3);
                return;
            }
            if ((iM > jVar.getRenderTargetWidth() || iM2 > jVar.getRenderTargetHeight()) && (hVar = jVar.f3189p) != null) {
                hVar.b(iM, iM2);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = iM;
            layoutParams.height = iM2;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 51;
            }
            jVar.setLayoutParams(layoutParams);
            View view = gVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iM;
                layoutParams2.height = iM2;
                view.setLayoutParams(layoutParams2);
            }
            int iRound = (int) Math.round(((double) jVar.getRenderTargetWidth()) / ((double) sVar.f()));
            int iRound2 = (int) Math.round(((double) jVar.getRenderTargetHeight()) / ((double) sVar.f()));
            B1.o oVar = (B1.o) dVar.f84l;
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(iRound));
            map.put("height", Double.valueOf(iRound2));
            oVar.d(map);
            return;
        }
        final float f3 = sVar.f();
        final D d3 = (D) sVar.f3236t.get(Integer.valueOf(i3));
        io.flutter.plugin.editing.j jVar2 = sVar.f3233q;
        if (jVar2 != null) {
            if (jVar2.f3140e.f252b == 3) {
                jVar2.f3150p = true;
            }
            SingleViewPresentation singleViewPresentation = d3.f3156a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                d3.f3156a.getView().getClass();
            }
        }
        ?? r3 = new Runnable() { // from class: io.flutter.plugin.platform.n
            @Override // java.lang.Runnable
            public final void run() {
                s sVar2 = (s) this.f3197k.f3201l;
                io.flutter.plugin.editing.j jVar3 = sVar2.f3233q;
                D d4 = d3;
                if (jVar3 != null) {
                    if (jVar3.f3140e.f252b == 3) {
                        jVar3.f3150p = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = d4.f3156a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        d4.f3156a.getView().getClass();
                    }
                }
                double dF = sVar2.f3230m == null ? f3 : sVar2.f();
                int iRound3 = (int) Math.round(((double) d4.f3161f.getWidth()) / dF);
                int iRound4 = (int) Math.round(((double) d4.f3161f.getHeight()) / dF);
                B1.o oVar2 = (B1.o) dVar.f84l;
                HashMap map2 = new HashMap();
                map2.put("width", Double.valueOf(iRound3));
                map2.put("height", Double.valueOf(iRound4));
                oVar2.d(map2);
            }
        };
        h hVar2 = d3.f3161f;
        if (iM == hVar2.getWidth() && iM2 == d3.f3161f.getHeight()) {
            d3.a().postDelayed(r3, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View viewA = d3.a();
            hVar2.b(iM, iM2);
            d3.f3163h.resize(iM, iM2, d3.f3159d);
            d3.f3163h.setSurface(hVar2.getSurface());
            viewA.postDelayed(r3, 0L);
            return;
        }
        boolean zIsFocused = d3.a().isFocused();
        x xVarDetachState = d3.f3156a.detachState();
        d3.f3163h.setSurface(null);
        d3.f3163h.release();
        DisplayManager displayManager = (DisplayManager) d3.f3157b.getSystemService("display");
        hVar2.b(iM, iM2);
        d3.f3163h = displayManager.createVirtualDisplay("flutter-vd#" + d3.f3160e, iM, iM2, d3.f3159d, hVar2.getSurface(), 0, D.f3155i, null);
        View viewA2 = d3.a();
        viewA2.addOnAttachStateChangeListener(new A0.k(viewA2, (n) r3));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(d3.f3157b, d3.f3163h.getDisplay(), d3.f3158c, xVarDetachState, d3.f3162g, zIsFocused);
        singleViewPresentation2.show();
        d3.f3156a.cancel();
        d3.f3156a = singleViewPresentation2;
    }

    @Override // B1.n
    public void f(int i3, int i4) {
        View view;
        switch (this.f3200k) {
            case 0:
                s sVar = (s) this.f3201l;
                if (i4 != 0 && i4 != 1) {
                    throw new IllegalStateException("Trying to set unknown direction value: " + i4 + "(view id: " + i3 + ")");
                }
                if (sVar.g(i3)) {
                    view = ((D) sVar.f3236t.get(Integer.valueOf(i3))).a();
                } else {
                    g gVar = (g) sVar.f3237v.get(i3);
                    if (gVar == null) {
                        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i3);
                        return;
                    }
                    view = gVar.getView();
                }
                if (view != null) {
                    view.setLayoutDirection(i4);
                    return;
                }
                Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i3);
                return;
            default:
                g gVar2 = (g) ((r) this.f3201l).f3215s.get(i3);
                if (gVar2 == null) {
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + i3);
                    return;
                }
                View view2 = gVar2.getView();
                if (view2 != null) {
                    view2.setLayoutDirection(i4);
                    return;
                }
                Log.e("PlatformViewsController2", "Setting direction to a null view with id: " + i3);
                return;
        }
    }

    public void g(ArrayList arrayList) {
        f fVar = (f) this.f3201l;
        if (fVar.f3181f) {
            fVar.f3181f = false;
            S0.a.B(fVar.f3176a.getWindow(), true);
        }
        int i3 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            int iOrdinal = ((B1.j) arrayList.get(i4)).ordinal();
            if (iOrdinal == 0) {
                i3 &= -5;
            } else if (iOrdinal == 1) {
                i3 &= -515;
            }
        }
        fVar.f3180e = i3;
        fVar.b();
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f3201l).getHeight();
    }

    @Override // io.flutter.plugin.platform.h
    public long getId() {
        return ((TextureRegistry$SurfaceProducer) this.f3201l).id();
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f3201l).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f3201l).getWidth();
    }

    public void h(int i3) {
        int i4;
        f fVar = (f) this.f3201l;
        Activity activity = fVar.f3176a;
        if (i3 != 4 && fVar.f3181f) {
            fVar.f3181f = false;
            S0.a.B(activity.getWindow(), true);
        }
        if (i3 == 1) {
            i4 = 1798;
        } else if (i3 == 2) {
            i4 = 3846;
        } else {
            if (i3 != 3) {
                if (i3 != 4 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                fVar.f3181f = true;
                S0.a.B(activity.getWindow(), false);
                B1.i iVar = fVar.f3179d;
                if (iVar != null) {
                    fVar.a(iVar);
                    return;
                }
                return;
            }
            i4 = 5894;
        }
        fVar.f3180e = i4;
        fVar.b();
    }

    @Override // B1.n
    public void i(B1.l lVar) {
        switch (this.f3200k) {
            case 0:
                int i3 = lVar.f112a;
                s sVar = (s) this.f3201l;
                float f3 = sVar.f3230m.getResources().getDisplayMetrics().density;
                if (!sVar.g(i3)) {
                    g gVar = (g) sVar.f3237v.get(i3);
                    if (gVar == null) {
                        Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i3);
                    } else {
                        View view = gVar.getView();
                        if (view == null) {
                            Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i3);
                        } else {
                            view.dispatchTouchEvent(sVar.k(f3, lVar, false));
                        }
                    }
                    break;
                } else {
                    D d3 = (D) sVar.f3236t.get(Integer.valueOf(i3));
                    MotionEvent motionEventK = sVar.k(f3, lVar, true);
                    SingleViewPresentation singleViewPresentation = d3.f3156a;
                    if (singleViewPresentation != null) {
                        singleViewPresentation.dispatchTouchEvent(motionEventK);
                        break;
                    }
                }
                break;
            default:
                int i4 = lVar.f112a;
                r rVar = (r) this.f3201l;
                float f4 = rVar.f3210m.getResources().getDisplayMetrics().density;
                g gVar2 = (g) rVar.f3215s.get(i4);
                if (gVar2 == null) {
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + i4);
                } else {
                    View view2 = gVar2.getView();
                    if (view2 == null) {
                        Log.e("PlatformViewsController2", "Sending touch to a null view with id: " + i4);
                    } else {
                        long j3 = lVar.f126p;
                        int i5 = lVar.f116e;
                        MotionEvent motionEventX = rVar.u.x(new p052r1.z(j3));
                        List<List> list = (List) lVar.f118g;
                        ArrayList arrayList = new ArrayList();
                        for (List list2 : list) {
                            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
                            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
                            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
                            double d4 = f4;
                            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d4);
                            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d4);
                            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d4);
                            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d4);
                            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d4);
                            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d4);
                            arrayList.add(pointerCoords);
                        }
                        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i5]);
                        if (motionEventX == null) {
                            List<List> list3 = (List) lVar.f117f;
                            ArrayList arrayList2 = new ArrayList();
                            for (List list4 : list3) {
                                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                                arrayList2.add(pointerProperties);
                            }
                            motionEventX = MotionEvent.obtain(lVar.f113b.longValue(), lVar.f114c.longValue(), lVar.f115d, lVar.f116e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i5]), pointerCoordsArr, lVar.f119h, lVar.f120i, lVar.f121j, lVar.f122k, lVar.f123l, lVar.f124m, lVar.n, lVar.f125o);
                        } else if (pointerCoordsArr.length >= 1) {
                            motionEventX.offsetLocation(pointerCoordsArr[0].x - motionEventX.getX(), pointerCoordsArr[0].y - motionEventX.getY());
                        }
                        view2.dispatchTouchEvent(motionEventX);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [io.flutter.plugin.platform.m] */
    @Override // B1.n
    public long j(final B1.k kVar) {
        j jVar;
        long j3;
        final s sVar = (s) this.f3201l;
        s.a(sVar, kVar);
        double d3 = kVar.f106d;
        double d4 = kVar.f105c;
        int i3 = kVar.f103a;
        SparseArray sparseArray = sVar.y;
        if (sparseArray.get(i3) != null) {
            throw new IllegalStateException(B1.e.g("Trying to create an already created platform view, view id: ", i3));
        }
        if (sVar.f3232p == null) {
            throw new IllegalStateException(B1.e.g("Texture registry is null. This means that platform views controller was detached, view id: ", i3));
        }
        if (sVar.n == null) {
            throw new IllegalStateException(B1.e.g("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i3));
        }
        final int i4 = 1;
        g gVarB = sVar.b(kVar, true);
        View view = gVarB.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        if (p000a.a.R(view, new K(s.f3220H, 8))) {
            if (kVar.f110h == 2) {
                if (sVar.f3231o.IsSurfaceControlEnabled()) {
                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                return -2L;
            }
            if (!sVar.f3226F) {
                h hVarI = s.i(sVar.f3232p);
                int iM = sVar.m(d4);
                int iM2 = sVar.m(d3);
                AbstractActivityC0262b abstractActivityC0262b = sVar.f3230m;
                C0218a c0218a = sVar.f3235s;
                int i5 = kVar.f103a;
                ?? r6 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.m
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z3) {
                        switch (i4) {
                            case 0:
                                int i6 = kVar.f103a;
                                s sVar2 = sVar;
                                if (!z3) {
                                    io.flutter.plugin.editing.j jVar2 = sVar2.f3233q;
                                    if (jVar2 != null) {
                                        jVar2.b(i6);
                                    }
                                    break;
                                } else {
                                    B1.s sVar3 = (B1.s) sVar2.f3234r.f6l;
                                    if (sVar3 != null) {
                                        sVar3.s("viewFocused", Integer.valueOf(i6), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (z3) {
                                    A.c cVar = sVar.f3234r;
                                    int i7 = kVar.f103a;
                                    B1.s sVar4 = (B1.s) cVar.f6l;
                                    if (sVar4 != null) {
                                        sVar4.s("viewFocused", Integer.valueOf(i7), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                A a3 = D.f3155i;
                D d5 = null;
                if (iM != 0 && iM2 != 0) {
                    DisplayManager displayManager = (DisplayManager) abstractActivityC0262b.getSystemService("display");
                    DisplayMetrics displayMetrics = abstractActivityC0262b.getResources().getDisplayMetrics();
                    hVarI.b(iM, iM2);
                    VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(B1.e.g("flutter-vd#", i5), iM, iM2, displayMetrics.densityDpi, hVarI.getSurface(), 0, D.f3155i, null);
                    if (virtualDisplayCreateVirtualDisplay != null) {
                        d5 = new D(abstractActivityC0262b, c0218a, virtualDisplayCreateVirtualDisplay, gVarB, hVarI, r6, i5);
                    }
                }
                if (d5 != null) {
                    sVar.f3236t.put(Integer.valueOf(i3), d5);
                    View view2 = gVarB.getView();
                    sVar.u.put(view2.getContext(), view2);
                    return hVarI.getId();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + kVar.f104b + " with id: " + i3);
            }
        }
        int iM3 = sVar.m(d4);
        int iM4 = sVar.m(d3);
        if (sVar.f3226F) {
            jVar = new j(sVar.f3230m);
            j3 = -1;
        } else {
            h hVarI2 = s.i(sVar.f3232p);
            j jVar2 = new j(sVar.f3230m);
            jVar2.f3189p = hVarI2;
            Surface surface = hVarI2.getSurface();
            if (surface != null) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                } catch (Throwable th) {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            }
            long id = hVarI2.getId();
            jVar = jVar2;
            j3 = id;
        }
        jVar.setTouchProcessor(sVar.f3229l);
        h hVar = jVar.f3189p;
        if (hVar != null) {
            hVar.b(iM3, iM4);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM3, iM4, 51);
        int iM5 = sVar.m(kVar.f107e);
        int iM6 = sVar.m(kVar.f108f);
        layoutParams.topMargin = iM5;
        layoutParams.leftMargin = iM6;
        jVar.setLayoutParams(layoutParams);
        View view3 = gVarB.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(iM3, iM4));
        view3.setImportantForAccessibility(4);
        jVar.addView(view3);
        final int i6 = 0;
        jVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view4, boolean z3) {
                switch (i6) {
                    case 0:
                        int i7 = kVar.f103a;
                        s sVar2 = sVar;
                        if (!z3) {
                            io.flutter.plugin.editing.j jVar3 = sVar2.f3233q;
                            if (jVar3 != null) {
                                jVar3.b(i7);
                            }
                            break;
                        } else {
                            B1.s sVar3 = (B1.s) sVar2.f3234r.f6l;
                            if (sVar3 != null) {
                                sVar3.s("viewFocused", Integer.valueOf(i7), null);
                                break;
                            }
                        }
                        break;
                    default:
                        if (z3) {
                            A.c cVar = sVar.f3234r;
                            int i8 = kVar.f103a;
                            B1.s sVar4 = (B1.s) cVar.f6l;
                            if (sVar4 != null) {
                                sVar4.s("viewFocused", Integer.valueOf(i8), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        sVar.n.addView(jVar);
        sparseArray.append(i3, jVar);
        return j3;
    }

    public void k(int i3) {
        View decorView = ((f) this.f3201l).f3176a.getWindow().getDecorView();
        switch (X.j.a(i3)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case 2:
                decorView.performHapticFeedback(3);
                break;
            case 3:
                decorView.performHapticFeedback(6);
                break;
            case 4:
                decorView.performHapticFeedback(4);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                }
                break;
        }
    }

    @Override // B1.n
    public void m(int i3) {
        View view;
        switch (this.f3200k) {
            case 0:
                s sVar = (s) this.f3201l;
                if (sVar.g(i3)) {
                    view = ((D) sVar.f3236t.get(Integer.valueOf(i3))).a();
                } else {
                    g gVar = (g) sVar.f3237v.get(i3);
                    if (gVar == null) {
                        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i3);
                    } else {
                        view = gVar.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                } else {
                    Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i3);
                }
                break;
            default:
                g gVar2 = (g) ((r) this.f3201l).f3215s.get(i3);
                if (gVar2 != null) {
                    View view2 = gVar2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                    } else {
                        Log.e("PlatformViewsController2", "Clearing focus on a null view with id: " + i3);
                    }
                } else {
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i3);
                }
                break;
        }
    }

    @Override // B1.n
    public void n(B1.k kVar) {
        s sVar = (s) this.f3201l;
        s.a(sVar, kVar);
        if (sVar.f3231o.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        sVar.b(kVar, false);
        if (sVar.f3231o.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    @Override // B1.n
    public void p(int i3) {
        i iVar;
        switch (this.f3200k) {
            case 0:
                s sVar = (s) this.f3201l;
                SparseArray sparseArray = sVar.f3238w;
                SparseArray sparseArray2 = sVar.y;
                HashMap map = sVar.f3236t;
                SparseArray sparseArray3 = sVar.f3237v;
                g gVar = (g) sparseArray3.get(i3);
                if (gVar != null) {
                    if (gVar.getView() != null) {
                        View view = gVar.getView();
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    sparseArray3.remove(i3);
                    if (!sVar.g(i3)) {
                        j jVar = (j) sparseArray2.get(i3);
                        if (jVar == null) {
                            p065x1.a aVar = (p065x1.a) sparseArray.get(i3);
                            if (aVar != null) {
                                aVar.removeAllViews();
                                aVar.a();
                                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(aVar);
                                }
                                sparseArray.remove(i3);
                            }
                        } else {
                            jVar.removeAllViews();
                            h hVar = jVar.f3189p;
                            if (hVar != null) {
                                hVar.release();
                                jVar.f3189p = null;
                            }
                            ViewTreeObserver viewTreeObserver = jVar.getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && (iVar = jVar.f3190q) != null) {
                                jVar.f3190q = null;
                                viewTreeObserver.removeOnGlobalFocusChangeListener(iVar);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) jVar.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(jVar);
                            }
                            sparseArray2.remove(i3);
                        }
                    } else {
                        D d3 = (D) map.get(Integer.valueOf(i3));
                        View viewA = d3.a();
                        if (viewA != null) {
                            sVar.u.remove(viewA.getContext());
                        }
                        d3.f3156a.cancel();
                        d3.f3156a.detachState();
                        d3.f3163h.release();
                        d3.f3161f.release();
                        map.remove(Integer.valueOf(i3));
                    }
                } else {
                    Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i3);
                }
                break;
            default:
                r rVar = (r) this.f3201l;
                SparseArray sparseArray4 = rVar.f3216t;
                rVar.f3219z.remove(Integer.valueOf(i3));
                SparseArray sparseArray5 = rVar.f3215s;
                g gVar2 = (g) sparseArray5.get(i3);
                if (gVar2 != null) {
                    if (gVar2.getView() != null) {
                        View view2 = gVar2.getView();
                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view2);
                        }
                    }
                    sparseArray5.remove(i3);
                    p065x1.a aVar2 = (p065x1.a) sparseArray4.get(i3);
                    if (aVar2 != null) {
                        aVar2.removeAllViews();
                        aVar2.a();
                        ViewGroup viewGroup5 = (ViewGroup) aVar2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(aVar2);
                        }
                        sparseArray4.remove(i3);
                    }
                } else {
                    Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i3);
                }
                break;
        }
    }

    @Override // B1.n
    public void q(B1.k kVar) {
        throw new IllegalStateException("Trying to create an HC++ platform view from within PlatformViewsController1. Request: " + kVar);
    }

    @Override // B1.n
    public boolean r() {
        return false;
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f3201l).release();
        this.f3201l = null;
    }

    @Override // io.flutter.plugin.platform.h
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f3201l).scheduleFrame();
    }

    public o(int i3) {
        this.f3200k = i3;
        switch (i3) {
            case 4:
                break;
            default:
                this.f3201l = new HashMap();
                break;
        }
    }
}
