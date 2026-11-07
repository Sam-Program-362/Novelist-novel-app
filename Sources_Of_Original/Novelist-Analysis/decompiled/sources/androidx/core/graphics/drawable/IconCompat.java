package androidx.core.graphics.drawable;

import D.AbstractC0005f;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1916k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1918b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1926j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1917a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1919c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f1920d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1921e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1922f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1923g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1924h = f1916k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1925i = null;

    public static IconCompat a(int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1919c = null;
        iconCompat.f1920d = null;
        iconCompat.f1922f = 0;
        iconCompat.f1923g = null;
        iconCompat.f1924h = f1916k;
        iconCompat.f1925i = null;
        iconCompat.f1917a = 2;
        iconCompat.f1921e = i3;
        iconCompat.f1918b = StringUtils.EMPTY;
        iconCompat.f1926j = StringUtils.EMPTY;
        return iconCompat;
    }

    public final int b() {
        int i3 = this.f1917a;
        if (i3 != -1) {
            if (i3 == 2) {
                return this.f1921e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Object obj = this.f1918b;
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0005f.e(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        }
    }

    public final Uri c() {
        int i3 = this.f1917a;
        if (i3 != -1) {
            if (i3 == 4 || i3 == 6) {
                return Uri.parse((String) this.f1918b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        Object obj = this.f1918b;
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0005f.n(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f1917a == -1) {
            return String.valueOf(this.f1918b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1917a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1917a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1918b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1918b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1926j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1921e);
                if (this.f1922f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1922f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1918b);
                break;
        }
        if (this.f1923g != null) {
            sb.append(" tint=");
            sb.append(this.f1923g);
        }
        if (this.f1924h != f1916k) {
            sb.append(" mode=");
            sb.append(this.f1924h);
        }
        sb.append(")");
        return sb.toString();
    }
}
