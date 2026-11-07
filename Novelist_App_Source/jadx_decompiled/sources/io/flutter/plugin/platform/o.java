package io.flutter.plugin.platform;

import M1.K;
import a.AbstractC0102a;
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
import r1.AbstractActivityC0455b;
import x1.C0498a;

/* loaded from: classes.dex */
public final class o implements B1.n, h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3200k;

    /* renamed from: l, reason: collision with root package name */
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
                            AssetFileDescriptor openTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(activity);
                            if (openTypedAssetFileDescriptor == null) {
                                return coerceToText;
                            }
                            try {
                                openTypedAssetFileDescriptor.close();
                                return coerceToText;
                            } catch (IOException e3) {
                                charSequence = coerceToText;
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
        int m3 = sVar.m(d3);
        int m4 = sVar.m(d4);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
        layoutParams.topMargin = m3;
        layoutParams.leftMargin = m4;
        layoutParams.gravity = 51;
        jVar.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [io.flutter.plugin.platform.n, java.lang.Runnable] */
    @Override // B1.n
    public void e(B1.m mVar, final B1.d dVar) {
        h hVar;
        s sVar = (s) this.f3201l;
        int m3 = sVar.m(mVar.f128b);
        int m4 = sVar.m(mVar.f129c);
        int i3 = mVar.f127a;
        if (!sVar.g(i3)) {
            g gVar = (g) sVar.f3237v.get(i3);
            j jVar = (j) sVar.y.get(i3);
            if (gVar == null || jVar == null) {
                Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i3);
                return;
            }
            if ((m3 > jVar.getRenderTargetWidth() || m4 > jVar.getRenderTargetHeight()) && (hVar = jVar.f3189p) != null) {
                hVar.b(m3, m4);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = m3;
            layoutParams.height = m4;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 51;
            }
            jVar.setLayoutParams(layoutParams);
            View view = gVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = m3;
                layoutParams2.height = m4;
                view.setLayoutParams(layoutParams2);
            }
            int round = (int) Math.round(jVar.getRenderTargetWidth() / sVar.f());
            int round2 = (int) Math.round(jVar.getRenderTargetHeight() / sVar.f());
            B1.o oVar = (B1.o) dVar.f84l;
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(round));
            hashMap.put("height", Double.valueOf(round2));
            oVar.d(hashMap);
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
                s sVar2 = (s) o.this.f3201l;
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
                double f4 = sVar2.f3230m == null ? f3 : sVar2.f();
                int round3 = (int) Math.round(d4.f3161f.getWidth() / f4);
                int round4 = (int) Math.round(d4.f3161f.getHeight() / f4);
                B1.o oVar2 = (B1.o) dVar.f84l;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("width", Double.valueOf(round3));
                hashMap2.put("height", Double.valueOf(round4));
                oVar2.d(hashMap2);
            }
        };
        h hVar2 = d3.f3161f;
        if (m3 == hVar2.getWidth() && m4 == d3.f3161f.getHeight()) {
            d3.a().postDelayed(r3, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View a3 = d3.a();
            hVar2.b(m3, m4);
            d3.f3163h.resize(m3, m4, d3.f3159d);
            d3.f3163h.setSurface(hVar2.getSurface());
            a3.postDelayed(r3, 0L);
            return;
        }
        boolean isFocused = d3.a().isFocused();
        x detachState = d3.f3156a.detachState();
        d3.f3163h.setSurface(null);
        d3.f3163h.release();
        DisplayManager displayManager = (DisplayManager) d3.f3157b.getSystemService("display");
        hVar2.b(m3, m4);
        d3.f3163h = displayManager.createVirtualDisplay("flutter-vd#" + d3.f3160e, m3, m4, d3.f3159d, hVar2.getSurface(), 0, D.f3155i, null);
        View a4 = d3.a();
        a4.addOnAttachStateChangeListener(new A0.k(a4, (n) r3));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(d3.f3157b, d3.f3163h.getDisplay(), d3.f3158c, detachState, d3.f3162g, isFocused);
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
            int ordinal = ((B1.j) arrayList.get(i4)).ordinal();
            if (ordinal == 0) {
                i3 &= -5;
            } else if (ordinal == 1) {
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
                        break;
                    } else {
                        View view = gVar.getView();
                        if (view == null) {
                            Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i3);
                            break;
                        } else {
                            view.dispatchTouchEvent(sVar.k(f3, lVar, false));
                            break;
                        }
                    }
                } else {
                    D d3 = (D) sVar.f3236t.get(Integer.valueOf(i3));
                    MotionEvent k3 = sVar.k(f3, lVar, true);
                    SingleViewPresentation singleViewPresentation = d3.f3156a;
                    if (singleViewPresentation != null) {
                        singleViewPresentation.dispatchTouchEvent(k3);
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
                    break;
                } else {
                    View view2 = gVar2.getView();
                    if (view2 == null) {
                        Log.e("PlatformViewsController2", "Sending touch to a null view with id: " + i4);
                        break;
                    } else {
                        long j3 = lVar.f126p;
                        int i5 = lVar.f116e;
                        MotionEvent x = rVar.u.x(new r1.z(j3));
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
                        if (x == null) {
                            List<List> list3 = (List) lVar.f117f;
                            ArrayList arrayList2 = new ArrayList();
                            for (List list4 : list3) {
                                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                                arrayList2.add(pointerProperties);
                            }
                            x = MotionEvent.obtain(lVar.f113b.longValue(), lVar.f114c.longValue(), lVar.f115d, lVar.f116e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i5]), pointerCoordsArr, lVar.f119h, lVar.f120i, lVar.f121j, lVar.f122k, lVar.f123l, lVar.f124m, lVar.n, lVar.f125o);
                        } else if (pointerCoordsArr.length >= 1) {
                            x.offsetLocation(pointerCoordsArr[0].x - x.getX(), pointerCoordsArr[0].y - x.getY());
                        }
                        view2.dispatchTouchEvent(x);
                        break;
                    }
                }
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
        g b3 = sVar.b(kVar, true);
        View view = b3.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        if (AbstractC0102a.R(view, new K(s.f3220H, 8))) {
            if (kVar.f110h == 2) {
                if (sVar.f3231o.IsSurfaceControlEnabled()) {
                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                return -2L;
            }
            if (!sVar.f3226F) {
                h i5 = s.i(sVar.f3232p);
                int m3 = sVar.m(d4);
                int m4 = sVar.m(d3);
                AbstractActivityC0455b abstractActivityC0455b = sVar.f3230m;
                C0309a c0309a = sVar.f3235s;
                int i6 = kVar.f103a;
                ?? r6 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.m
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z3) {
                        switch (i4) {
                            case 0:
                                int i7 = kVar.f103a;
                                s sVar2 = sVar;
                                if (!z3) {
                                    io.flutter.plugin.editing.j jVar2 = sVar2.f3233q;
                                    if (jVar2 != null) {
                                        jVar2.b(i7);
                                        break;
                                    }
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
                };
                A a3 = D.f3155i;
                D d5 = null;
                if (m3 != 0 && m4 != 0) {
                    DisplayManager displayManager = (DisplayManager) abstractActivityC0455b.getSystemService("display");
                    DisplayMetrics displayMetrics = abstractActivityC0455b.getResources().getDisplayMetrics();
                    i5.b(m3, m4);
                    VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(B1.e.g("flutter-vd#", i6), m3, m4, displayMetrics.densityDpi, i5.getSurface(), 0, D.f3155i, null);
                    if (createVirtualDisplay != null) {
                        d5 = new D(abstractActivityC0455b, c0309a, createVirtualDisplay, b3, i5, r6, i6);
                    }
                }
                if (d5 != null) {
                    sVar.f3236t.put(Integer.valueOf(i3), d5);
                    View view2 = b3.getView();
                    sVar.u.put(view2.getContext(), view2);
                    return i5.getId();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + kVar.f104b + " with id: " + i3);
            }
        }
        int m5 = sVar.m(d4);
        int m6 = sVar.m(d3);
        if (sVar.f3226F) {
            jVar = new j(sVar.f3230m);
            j3 = -1;
        } else {
            h i7 = s.i(sVar.f3232p);
            j jVar2 = new j(sVar.f3230m);
            jVar2.f3189p = i7;
            Surface surface = i7.getSurface();
            if (surface != null) {
                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                } finally {
                    surface.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            long id = i7.getId();
            jVar = jVar2;
            j3 = id;
        }
        jVar.setTouchProcessor(sVar.f3229l);
        h hVar = jVar.f3189p;
        if (hVar != null) {
            hVar.b(m5, m6);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m5, m6, 51);
        int m7 = sVar.m(kVar.f107e);
        int m8 = sVar.m(kVar.f108f);
        layoutParams.topMargin = m7;
        layoutParams.leftMargin = m8;
        jVar.setLayoutParams(layoutParams);
        View view3 = b3.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(m5, m6));
        view3.setImportantForAccessibility(4);
        jVar.addView(view3);
        final int i8 = 0;
        jVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view22, boolean z3) {
                switch (i8) {
                    case 0:
                        int i72 = kVar.f103a;
                        s sVar2 = sVar;
                        if (!z3) {
                            io.flutter.plugin.editing.j jVar22 = sVar2.f3233q;
                            if (jVar22 != null) {
                                jVar22.b(i72);
                                break;
                            }
                        } else {
                            B1.s sVar3 = (B1.s) sVar2.f3234r.f6l;
                            if (sVar3 != null) {
                                sVar3.s("viewFocused", Integer.valueOf(i72), null);
                                break;
                            }
                        }
                        break;
                    default:
                        if (z3) {
                            A.c cVar = sVar.f3234r;
                            int i82 = kVar.f103a;
                            B1.s sVar4 = (B1.s) cVar.f6l;
                            if (sVar4 != null) {
                                sVar4.s("viewFocused", Integer.valueOf(i82), null);
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
                    break;
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
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
                        break;
                    } else {
                        view = gVar.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                    break;
                } else {
                    Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i3);
                    break;
                }
            default:
                g gVar2 = (g) ((r) this.f3201l).f3215s.get(i3);
                if (gVar2 != null) {
                    View view2 = gVar2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                        break;
                    } else {
                        Log.e("PlatformViewsController2", "Clearing focus on a null view with id: " + i3);
                        break;
                    }
                } else {
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i3);
                    break;
                }
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
                HashMap hashMap = sVar.f3236t;
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
                            C0498a c0498a = (C0498a) sparseArray.get(i3);
                            if (c0498a != null) {
                                c0498a.removeAllViews();
                                c0498a.a();
                                ViewGroup viewGroup2 = (ViewGroup) c0498a.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(c0498a);
                                }
                                sparseArray.remove(i3);
                                break;
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
                            break;
                        }
                    } else {
                        D d3 = (D) hashMap.get(Integer.valueOf(i3));
                        View a3 = d3.a();
                        if (a3 != null) {
                            sVar.u.remove(a3.getContext());
                        }
                        d3.f3156a.cancel();
                        d3.f3156a.detachState();
                        d3.f3163h.release();
                        d3.f3161f.release();
                        hashMap.remove(Integer.valueOf(i3));
                        break;
                    }
                } else {
                    Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i3);
                    break;
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
                    C0498a c0498a2 = (C0498a) sparseArray4.get(i3);
                    if (c0498a2 != null) {
                        c0498a2.removeAllViews();
                        c0498a2.a();
                        ViewGroup viewGroup5 = (ViewGroup) c0498a2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(c0498a2);
                        }
                        sparseArray4.remove(i3);
                        break;
                    }
                } else {
                    Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i3);
                    break;
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
