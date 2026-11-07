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
import org.apache.tika.utils.StringUtils;
import p031k.C0240s;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S0.a f4640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p042o.i f4641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
        f4641b = new p042o.i(16);
        f4642c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, p060v.a aVar, Resources resources, int i3, String str, int i4, int i5, C0240s c0240s) {
        Typeface typefaceI;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i6 = 19;
        if (aVar instanceof p060v.d) {
            p060v.d dVar = (p060v.d) aVar;
            String str2 = dVar.f4617d;
            typefaceI = null;
            int i7 = 1;
            int i8 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = dVar.f4614a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i9 = 0;
                        while (true) {
                            if (i9 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilderD = null;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < arrayList.size()) {
                                        A.g gVar = (A.g) arrayList.get(i10);
                                        if (i10 == arrayList.size() - 1 && TextUtils.isEmpty(gVar.f19f)) {
                                            customFallbackBuilderD.setSystemFallback(gVar.f18e);
                                        } else {
                                            String str3 = gVar.f18e;
                                            String str4 = gVar.f19f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + gVar.f18e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = p.f(fontD).build();
                                                } else {
                                                    try {
                                                        p.o();
                                                        c.d();
                                                        fontFamilyBuild = p.f(AbstractC0004e.e(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilderD == null) {
                                                    customFallbackBuilderD = p.d(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderD.addCustomFallback(fontFamilyBuild);
                                                }
                                                i10++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderD.build();
                                    break;
                                }
                            }
                            if (c(((A.g) arrayList.get(i9)).f18e) != null) {
                                i9++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((A.g) arrayList.get(0)).f18e);
            }
            if (typefaceBuild != null) {
                new Handler(Looper.getMainLooper()).post(new M.c(c0240s, typefaceBuild, i6));
                f4641b.b(b(resources, i3, str, i4, i5), typefaceBuild);
                return typefaceBuild;
            }
            boolean z3 = dVar.f4616c == 0;
            int i11 = dVar.f4615b;
            Handler handler = new Handler(Looper.getMainLooper());
            d dVar2 = new d();
            dVar2.f4639a = c0240s;
            ArrayList arrayList2 = dVar.f4614a;
            A.p pVar = new A.p(handler, 0);
            A.c cVar = new A.c(dVar2, pVar, i8);
            if (!z3) {
                String strA = A.k.a(i5, arrayList2);
                Typeface typeface = (Typeface) A.k.f29a.a(strA);
                if (typeface != null) {
                    pVar.execute(new A.a(dVar2, typeface, i8));
                    typefaceI = typeface;
                } else {
                    A.i iVar = new A.i(cVar, i8);
                    synchronized (A.k.f31c) {
                        try {
                            p042o.j jVar = A.k.f32d;
                            ArrayList arrayList3 = (ArrayList) jVar.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(iVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(iVar);
                                jVar.put(strA, arrayList4);
                                A.h hVar = new A.h(strA, context, arrayList2, i5, 1);
                                ThreadPoolExecutor threadPoolExecutor = A.k.f30b;
                                A.i iVar2 = new A.i(strA, i7);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                q qVar = new q();
                                qVar.f45l = hVar;
                                qVar.f46m = iVar2;
                                qVar.n = handler2;
                                threadPoolExecutor.execute(qVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                A.g gVar2 = (A.g) arrayList2.get(0);
                p042o.i iVar3 = A.k.f29a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{gVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = A.k.a(i5, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) A.k.f29a.a(strA2);
                if (typeface2 != null) {
                    pVar.execute(new A.a(dVar2, typeface2, i8));
                    typefaceI = typeface2;
                } else if (i11 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{gVar2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    A.j jVarB = A.k.b(strA2, context, Collections.unmodifiableList(arrayList6), i5);
                    cVar.z(jVarB);
                    typefaceI = jVarB.f27a;
                } else {
                    try {
                        try {
                            try {
                                A.j jVar2 = (A.j) A.k.f30b.submit(new A.h(strA2, context, gVar2, i5, 0)).get(i11, TimeUnit.MILLISECONDS);
                                cVar.z(jVar2);
                                typefaceI = jVar2.f27a;
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
            typefaceI = f4640a.i(context, (p060v.b) aVar, resources, i5);
            if (typefaceI != null) {
                new Handler(Looper.getMainLooper()).post(new M.c(c0240s, typefaceI, i6));
            } else {
                c0240s.a();
            }
        }
        if (typefaceI != null) {
            f4641b.b(b(resources, i3, str, i4, i5), typefaceI);
        }
        return typefaceI;
    }

    public static String b(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (f4642c == null) {
            f4642c = new Paint();
        }
        f4642c.setTextSize(10.0f);
        f4642c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) StringUtils.SPACE, 0, 1, 0, 1, 0.0f, 0.0f, false, f4642c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
