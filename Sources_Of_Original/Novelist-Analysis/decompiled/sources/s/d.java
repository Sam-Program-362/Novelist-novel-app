package s;

import D.AbstractC0005f;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f4441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f4442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f4446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f4447g;

    public d(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatA = IconCompat.a(2131230817);
        Bundle bundle = new Bundle();
        this.f4444d = true;
        this.f4442b = iconCompatA;
        int iIntValue = iconCompatA.f1917a;
        if (iIntValue == -1) {
            Object obj = iconCompatA.f1918b;
            if (Build.VERSION.SDK_INT >= 28) {
                iIntValue = AbstractC0005f.m(obj);
            } else {
                try {
                    iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (IllegalAccessException e3) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                    iIntValue = -1;
                } catch (NoSuchMethodException e4) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                    iIntValue = -1;
                } catch (InvocationTargetException e5) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                    iIntValue = -1;
                }
            }
        }
        if (iIntValue == 2) {
            this.f4445e = iconCompatA.b();
        }
        this.f4446f = e.a(str);
        this.f4447g = pendingIntent;
        this.f4441a = bundle;
        this.f4443c = true;
        this.f4444d = true;
    }
}
