package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import org.apache.tika.metadata.TikaCoreProperties;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;
import p048q0.a;
import p048q0.b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i3 = iconCompat.f1917a;
        if (aVar.e(1)) {
            i3 = ((b) aVar).f4303e.readInt();
        }
        iconCompat.f1917a = i3;
        byte[] bArr = iconCompat.f1919c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f4303e;
            int i4 = parcel.readInt();
            if (i4 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i4];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1919c = bArr;
        iconCompat.f1920d = aVar.f(iconCompat.f1920d, 3);
        int i5 = iconCompat.f1921e;
        if (aVar.e(4)) {
            i5 = ((b) aVar).f4303e.readInt();
        }
        iconCompat.f1921e = i5;
        int i6 = iconCompat.f1922f;
        if (aVar.e(5)) {
            i6 = ((b) aVar).f4303e.readInt();
        }
        iconCompat.f1922f = i6;
        iconCompat.f1923g = (ColorStateList) aVar.f(iconCompat.f1923g, 6);
        String string = iconCompat.f1925i;
        if (aVar.e(7)) {
            string = ((b) aVar).f4303e.readString();
        }
        iconCompat.f1925i = string;
        String string2 = iconCompat.f1926j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f4303e.readString();
        }
        iconCompat.f1926j = string2;
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
                String str = new String(iconCompat.f1919c, Charset.forName("UTF-16"));
                iconCompat.f1918b = str;
                if (iconCompat.f1917a == 2 && iconCompat.f1926j == null) {
                    iconCompat.f1926j = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1918b = iconCompat.f1919c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
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
            aVar.h(1);
            ((b) aVar).f4303e.writeInt(i3);
        }
        byte[] bArr = iconCompat.f1919c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f4303e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1920d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f4303e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f1921e;
        if (i4 != 0) {
            aVar.h(4);
            ((b) aVar).f4303e.writeInt(i4);
        }
        int i5 = iconCompat.f1922f;
        if (i5 != 0) {
            aVar.h(5);
            ((b) aVar).f4303e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f1923g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f4303e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1925i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f4303e.writeString(str);
        }
        String str2 = iconCompat.f1926j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f4303e.writeString(str2);
        }
    }
}
