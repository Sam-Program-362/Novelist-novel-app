package io.flutter.plugin.platform;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.ArrayList;
import java.util.Collections;
import l0.C0379B;

/* renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311c implements h {

    /* renamed from: k, reason: collision with root package name */
    public int f3168k;

    /* renamed from: l, reason: collision with root package name */
    public int f3169l;

    /* renamed from: m, reason: collision with root package name */
    public Object f3170m;
    public Object n;

    /* renamed from: o, reason: collision with root package name */
    public Object f3171o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f3172p;

    public C0311c(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f3168k = 0;
        this.f3169l = 0;
        this.f3171o = new Handler();
        this.f3172p = new C0310b(this);
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f3170m = textureRegistry$ImageTextureEntry;
    }

    public void a(int i3) {
        RecyclerView recyclerView = (RecyclerView) this.f3172p;
        C0379B c0379b = recyclerView.f2239h0;
        if (i3 < 0 || i3 >= c0379b.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i3 + "(" + i3 + "). Item count:" + c0379b.a() + recyclerView.h());
        }
        boolean z3 = c0379b.f3921c;
        ArrayList arrayList = (ArrayList) this.n;
        ArrayList arrayList2 = (ArrayList) this.f3170m;
        if (arrayList2.size() > 0) {
            arrayList2.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList3 = (ArrayList) recyclerView.n.n;
        if (arrayList3.size() > 0) {
            RecyclerView.j((View) arrayList3.get(0));
            throw null;
        }
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        int w3 = recyclerView.f2246m.w(i3, 0);
        if (w3 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i3 + "(offset:" + w3 + ").state:" + c0379b.a() + recyclerView.h());
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i3, int i4) {
        ImageReader newInstance;
        ImageReader imageReader = (ImageReader) this.n;
        if (imageReader != null && this.f3168k == i3 && this.f3169l == i4) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f3170m).pushImage(null);
            ((ImageReader) this.n).close();
            this.n = null;
        }
        this.f3168k = i3;
        this.f3169l = i4;
        Handler handler = (Handler) this.f3171o;
        C0310b c0310b = (C0310b) this.f3172p;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            E.c.r();
            ImageReader.Builder i6 = E.c.i(this.f3168k, this.f3169l);
            i6.setMaxImages(4);
            i6.setImageFormat(34);
            i6.setUsage(256L);
            newInstance = i6.build();
            newInstance.setOnImageAvailableListener(c0310b, handler);
        } else {
            if (i5 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            newInstance = ImageReader.newInstance(i3, i4, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(c0310b, handler);
        }
        this.n = newInstance;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.n;
        this.f3169l = this.f3168k;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f3169l) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f2207r0;
        throw null;
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return this.f3169l;
    }

    @Override // io.flutter.plugin.platform.h
    public long getId() {
        return ((TextureRegistry$ImageTextureEntry) this.f3170m).id();
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((ImageReader) this.n).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return this.f3168k;
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        if (((ImageReader) this.n) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f3170m).pushImage(null);
            ((ImageReader) this.n).close();
            this.n = null;
        }
        this.f3170m = null;
    }

    public C0311c(RecyclerView recyclerView) {
        this.f3172p = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3170m = arrayList;
        this.n = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f3168k = 2;
        this.f3169l = 2;
    }
}
