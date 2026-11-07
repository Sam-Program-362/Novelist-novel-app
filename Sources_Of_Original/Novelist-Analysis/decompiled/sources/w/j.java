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

/* JADX INFO: loaded from: classes.dex */
public class j extends S0.a {
    public static Font L(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iO = O(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int iO2 = O(fontStyle, font2.getStyle());
            if (iO2 < iO) {
                font = font2;
                iO = iO2;
            }
        }
        return font;
    }

    public static int O(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily M(m[] mVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (m mVar : mVarArr) {
            if (Objects.equals(mVar.f35a.getScheme(), "systemfont")) {
                fontBuild = N(mVar);
            } else {
                try {
                    Uri uri = mVar.f35a;
                    String str = mVar.f39e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(mVar.f37c).setSlant(mVar.f38d ? 1 : 0).setTtcIndex(mVar.f36b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e3) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
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
    public final Typeface i(Context context, p060v.b bVar, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (p060v.c cVar : bVar.f4607a) {
                try {
                    Font fontBuild = new Font.Builder(resources, cVar.f4613f).setWeight(cVar.f4609b).setSlant(cVar.f4610c ? 1 : 0).setTtcIndex(cVar.f4612e).setFontVariationSettings(cVar.f4611d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(L(fontFamilyBuild, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // S0.a
    public final Typeface j(Context context, m[] mVarArr, int i3) {
        try {
            FontFamily fontFamilyM = M(mVarArr, context.getContentResolver());
            if (fontFamilyM == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM).setStyle(L(fontFamilyM, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // S0.a
    public final Typeface k(Context context, List list, int i3) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM = M((m[]) list.get(0), contentResolver);
            if (fontFamilyM == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM);
            for (int i4 = 1; i4 < list.size(); i4++) {
                FontFamily fontFamilyM2 = M((m[]) list.get(i4), contentResolver);
                if (fontFamilyM2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM2);
                }
            }
            return customFallbackBuilder.setStyle(L(fontFamilyM, i3).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    @Override // S0.a
    public final Typeface l(Context context, Resources resources, int i3, String str, int i4) {
        try {
            Font fontBuild = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }
}
