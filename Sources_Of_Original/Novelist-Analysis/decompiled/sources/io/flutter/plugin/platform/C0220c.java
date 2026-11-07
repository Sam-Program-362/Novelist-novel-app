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

/* JADX INFO: renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0220c implements h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f3170m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f3171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f3172p;

    public C0220c(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f3168k = 0;
        this.f3169l = 0;
        this.f3171o = new Handler();
        this.f3172p = new C0219b(this);
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f3170m = textureRegistry$ImageTextureEntry;
    }

    public void a(int i3) {
        RecyclerView recyclerView = (RecyclerView) this.f3172p;
        p035l0.B b3 = recyclerView.f2239h0;
        if (i3 < 0 || i3 >= b3.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i3 + "(" + i3 + "). Item count:" + b3.a() + recyclerView.h());
        }
        boolean z3 = b3.f3921c;
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
        int iW = recyclerView.f2246m.w(i3, 0);
        if (iW >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i3 + "(offset:" + iW + ").state:" + b3.a() + recyclerView.h());
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i3, int i4) {
        ImageReader imageReaderNewInstance;
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
        C0219b c0219b = (C0219b) this.f3172p;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            E.c.r();
            ImageReader.Builder builderI = E.c.i(this.f3168k, this.f3169l);
            builderI.setMaxImages(4);
            builderI.setImageFormat(34);
            builderI.setUsage(256L);
            imageReaderNewInstance = builderI.build();
            imageReaderNewInstance.setOnImageAvailableListener(c0219b, handler);
        } else {
            if (i5 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            imageReaderNewInstance = ImageReader.newInstance(i3, i4, 34, 4, 256L);
            imageReaderNewInstance.setOnImageAvailableListener(c0219b, handler);
        }
        this.n = imageReaderNewInstance;
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

    public C0220c(RecyclerView recyclerView) {
        this.f3172p = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3170m = arrayList;
        this.n = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f3168k = 2;
        this.f3169l = 2;
    }
}
