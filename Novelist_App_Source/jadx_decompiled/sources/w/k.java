package w;

import A.m;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k extends j {
    @Override // w.j
    public final Font N(m mVar) {
        Font d3;
        Uri uri = mVar.f35a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = mVar.f39e;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d3 = e.d(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return d3;
                }
                try {
                    return new Font.Builder(d3).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
