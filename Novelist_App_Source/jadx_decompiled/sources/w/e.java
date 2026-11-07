package w;

import A.q;
import D.AbstractC0004e;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.plugin.platform.p;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.C0355s;
import org.apache.tika.utils.StringUtils;
import v.C0484b;
import v.C0486d;
import v.InterfaceC0483a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.a f4640a;

    /* renamed from: b, reason: collision with root package name */
    public static final o.i f4641b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f4642c;

    static {
        Trace.beginSection(E2.a.V("TypefaceCompat static init"));
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            f4640a = new k();
        } else if (i3 >= 29) {
            f4640a = new j();
        } else if (i3 >= 28) {
            f4640a = new i();
        } else if (i3 >= 26) {
            f4640a = new h();
        } else {
            Method method = g.f4650e;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f4640a = new g();
            } else {
                f4640a = new f();
            }
        }
        f4641b = new o.i(16);
        f4642c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, InterfaceC0483a interfaceC0483a, Resources resources, int i3, String str, int i4, int i5, C0355s c0355s) {
        Typeface i6;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i7 = 19;
        if (interfaceC0483a instanceof C0486d) {
            C0486d c0486d = (C0486d) interfaceC0483a;
            String str2 = c0486d.f4617d;
            i6 = null;
            int i8 = 1;
            int i9 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = c0486d.f4614a;
                if (arrayList.size() == 1) {
                    build = c(((A.g) arrayList.get(0)).f18e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= arrayList.size()) {
                                        break;
                                    }
                                    A.g gVar = (A.g) arrayList.get(i11);
                                    if (i11 == arrayList.size() - 1 && TextUtils.isEmpty(gVar.f19f)) {
                                        customFallbackBuilder.setSystemFallback(gVar.f18e);
                                        break;
                                    }
                                    String str3 = gVar.f18e;
                                    String str4 = gVar.f19f;
                                    Font d3 = d(c(str3));
                                    if (d3 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + gVar.f18e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build3 = p.f(d3).build();
                                    } else {
                                        try {
                                            p.o();
                                            c.d();
                                            fontVariationSettings = AbstractC0004e.e(d3).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = p.f(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = p.d(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i11++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((A.g) arrayList.get(i10)).f18e) == null) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                new Handler(Looper.getMainLooper()).post(new M.c(c0355s, build, i7));
                f4641b.b(b(resources, i3, str, i4, i5), build);
                return build;
            }
            boolean z3 = c0486d.f4616c == 0;
            int i12 = c0486d.f4615b;
            Handler handler = new Handler(Looper.getMainLooper());
            d dVar = new d();
            dVar.f4639a = c0355s;
            ArrayList arrayList2 = c0486d.f4614a;
            A.p pVar = new A.p(handler, 0);
            A.c cVar = new A.c(dVar, pVar, i9);
            if (!z3) {
                String a3 = A.k.a(i5, arrayList2);
                Typeface typeface = (Typeface) A.k.f29a.a(a3);
                if (typeface != null) {
                    pVar.execute(new A.a(dVar, typeface, i9));
                    i6 = typeface;
                } else {
                    A.i iVar = new A.i(cVar, i9);
                    synchronized (A.k.f31c) {
                        try {
                            o.j jVar = A.k.f32d;
                            ArrayList arrayList3 = (ArrayList) jVar.get(a3);
                            if (arrayList3 != null) {
                                arrayList3.add(iVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(iVar);
                                jVar.put(a3, arrayList4);
                                A.h hVar = new A.h(a3, context, arrayList2, i5, 1);
                                ThreadPoolExecutor threadPoolExecutor = A.k.f30b;
                                A.i iVar2 = new A.i(a3, i8);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                q qVar = new q();
                                qVar.f45l = hVar;
                                qVar.f46m = iVar2;
                                qVar.n = handler2;
                                threadPoolExecutor.execute(qVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                A.g gVar2 = (A.g) arrayList2.get(0);
                o.i iVar3 = A.k.f29a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{gVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a4 = A.k.a(i5, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) A.k.f29a.a(a4);
                if (typeface2 != null) {
                    pVar.execute(new A.a(dVar, typeface2, i9));
                    i6 = typeface2;
                } else if (i12 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{gVar2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    A.j b3 = A.k.b(a4, context, Collections.unmodifiableList(arrayList6), i5);
                    cVar.z(b3);
                    i6 = b3.f27a;
                } else {
                    try {
                        try {
                            try {
                                A.j jVar2 = (A.j) A.k.f30b.submit(new A.h(a4, context, gVar2, i5, 0)).get(i12, TimeUnit.MILLISECONDS);
                                cVar.z(jVar2);
                                i6 = jVar2.f27a;
                            } catch (InterruptedException e3) {
                                throw e3;
                            }
                        } catch (ExecutionException e4) {
                            throw new RuntimeException(e4);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((A.p) cVar.f7m).execute(new A.b((d) cVar.f6l, -3));
                    }
                }
            }
        } else {
            i6 = f4640a.i(context, (C0484b) interfaceC0483a, resources, i5);
            if (i6 != null) {
                new Handler(Looper.getMainLooper()).post(new M.c(c0355s, i6, i7));
            } else {
                c0355s.a();
            }
        }
        if (i6 != null) {
            f4641b.b(b(resources, i3, str, i4, i5), i6);
        }
        return i6;
    }

    public static String b(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (f4642c == null) {
            f4642c = new Paint();
        }
        f4642c.setTextSize(10.0f);
        f4642c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) StringUtils.SPACE, 0, 1, 0, 1, 0.0f, 0.0f, false, f4642c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
