package w;

import A.m;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import v.C0484b;
import v.C0485c;

/* loaded from: classes.dex */
public class j extends S0.a {
    public static Font L(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int O2 = O(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int O3 = O(fontStyle, font2.getStyle());
            if (O3 < O2) {
                font = font2;
                O2 = O3;
            }
        }
        return font;
    }

    public static int O(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily M(m[] mVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (m mVar : mVarArr) {
            if (Objects.equals(mVar.f35a.getScheme(), "systemfont")) {
                font = N(mVar);
            } else {
                try {
                    Uri uri = mVar.f35a;
                    str = mVar.f39e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e3) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(mVar.f37c).setSlant(mVar.f38d ? 1 : 0).setTtcIndex(mVar.f36b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font N(m mVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // S0.a
    public final Typeface i(Context context, C0484b c0484b, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (C0485c c0485c : c0484b.f4607a) {
                try {
                    Font build = new Font.Builder(resources, c0485c.f4613f).setWeight(c0485c.f4609b).setSlant(c0485c.f4610c ? 1 : 0).setTtcIndex(c0485c.f4612e).setFontVariationSettings(c0485c.f4611d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(L(build2, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // S0.a
    public final Typeface j(Context context, m[] mVarArr, int i3) {
        try {
            FontFamily M2 = M(mVarArr, context.getContentResolver());
            if (M2 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(M2).setStyle(L(M2, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // S0.a
    public final Typeface k(Context context, List list, int i3) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily M2 = M((m[]) list.get(0), contentResolver);
            if (M2 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(M2);
            for (int i4 = 1; i4 < list.size(); i4++) {
                FontFamily M3 = M((m[]) list.get(i4), contentResolver);
                if (M3 != null) {
                    customFallbackBuilder.addCustomFallback(M3);
                }
            }
            return customFallbackBuilder.setStyle(L(M2, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // S0.a
    public final Typeface l(Context context, Resources resources, int i3, String str, int i4) {
        try {
            Font build = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }
}
