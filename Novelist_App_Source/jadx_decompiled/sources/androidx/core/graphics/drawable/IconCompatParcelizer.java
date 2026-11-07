package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import org.apache.tika.metadata.TikaCoreProperties;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;
import q0.AbstractC0447a;
import q0.b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0447a abstractC0447a) {
        IconCompat iconCompat = new IconCompat();
        int i3 = iconCompat.f1917a;
        if (abstractC0447a.e(1)) {
            i3 = ((b) abstractC0447a).f4303e.readInt();
        }
        iconCompat.f1917a = i3;
        byte[] bArr = iconCompat.f1919c;
        if (abstractC0447a.e(2)) {
            Parcel parcel = ((b) abstractC0447a).f4303e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1919c = bArr;
        iconCompat.f1920d = abstractC0447a.f(iconCompat.f1920d, 3);
        int i4 = iconCompat.f1921e;
        if (abstractC0447a.e(4)) {
            i4 = ((b) abstractC0447a).f4303e.readInt();
        }
        iconCompat.f1921e = i4;
        int i5 = iconCompat.f1922f;
        if (abstractC0447a.e(5)) {
            i5 = ((b) abstractC0447a).f4303e.readInt();
        }
        iconCompat.f1922f = i5;
        iconCompat.f1923g = (ColorStateList) abstractC0447a.f(iconCompat.f1923g, 6);
        String str = iconCompat.f1925i;
        if (abstractC0447a.e(7)) {
            str = ((b) abstractC0447a).f4303e.readString();
        }
        iconCompat.f1925i = str;
        String str2 = iconCompat.f1926j;
        if (abstractC0447a.e(8)) {
            str2 = ((b) abstractC0447a).f4303e.readString();
        }
        iconCompat.f1926j = str2;
        iconCompat.f1924h = PorterDuff.Mode.valueOf(iconCompat.f1925i);
        switch (iconCompat.f1917a) {
            case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                Parcelable parcelable = iconCompat.f1920d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1918b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1920d;
                if (parcelable2 != null) {
                    iconCompat.f1918b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1919c;
                iconCompat.f1918b = bArr3;
                iconCompat.f1917a = 3;
                iconCompat.f1921e = 0;
                iconCompat.f1922f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1919c, Charset.forName("UTF-16"));
                iconCompat.f1918b = str3;
                if (iconCompat.f1917a == 2 && iconCompat.f1926j == null) {
                    iconCompat.f1926j = str3.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1918b = iconCompat.f1919c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0447a abstractC0447a) {
        abstractC0447a.getClass();
        iconCompat.f1925i = iconCompat.f1924h.name();
        switch (iconCompat.f1917a) {
            case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                iconCompat.f1920d = (Parcelable) iconCompat.f1918b;
                break;
            case 1:
            case 5:
                iconCompat.f1920d = (Parcelable) iconCompat.f1918b;
                break;
            case 2:
                iconCompat.f1919c = ((String) iconCompat.f1918b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1919c = (byte[]) iconCompat.f1918b;
                break;
            case 4:
            case 6:
                iconCompat.f1919c = iconCompat.f1918b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f1917a;
        if (-1 != i3) {
            abstractC0447a.h(1);
            ((b) abstractC0447a).f4303e.writeInt(i3);
        }
        byte[] bArr = iconCompat.f1919c;
        if (bArr != null) {
            abstractC0447a.h(2);
            Parcel parcel = ((b) abstractC0447a).f4303e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1920d;
        if (parcelable != null) {
            abstractC0447a.h(3);
            ((b) abstractC0447a).f4303e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f1921e;
        if (i4 != 0) {
            abstractC0447a.h(4);
            ((b) abstractC0447a).f4303e.writeInt(i4);
        }
        int i5 = iconCompat.f1922f;
        if (i5 != 0) {
            abstractC0447a.h(5);
            ((b) abstractC0447a).f4303e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f1923g;
        if (colorStateList != null) {
            abstractC0447a.h(6);
            ((b) abstractC0447a).f4303e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1925i;
        if (str != null) {
            abstractC0447a.h(7);
            ((b) abstractC0447a).f4303e.writeString(str);
        }
        String str2 = iconCompat.f1926j;
        if (str2 != null) {
            abstractC0447a.h(8);
            ((b) abstractC0447a).f4303e.writeString(str2);
        }
    }
}
