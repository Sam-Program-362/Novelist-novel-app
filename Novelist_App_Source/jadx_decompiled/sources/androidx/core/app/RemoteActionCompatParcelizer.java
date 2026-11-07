package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import q0.AbstractC0447a;
import q0.b;
import q0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0447a abstractC0447a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1910a;
        boolean z3 = true;
        if (abstractC0447a.e(1)) {
            cVar = abstractC0447a.g();
        }
        remoteActionCompat.f1910a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1911b;
        if (abstractC0447a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0447a).f4303e);
        }
        remoteActionCompat.f1911b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1912c;
        if (abstractC0447a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0447a).f4303e);
        }
        remoteActionCompat.f1912c = charSequence2;
        remoteActionCompat.f1913d = (PendingIntent) abstractC0447a.f(remoteActionCompat.f1913d, 4);
        boolean z4 = remoteActionCompat.f1914e;
        if (abstractC0447a.e(5)) {
            z4 = ((b) abstractC0447a).f4303e.readInt() != 0;
        }
        remoteActionCompat.f1914e = z4;
        boolean z5 = remoteActionCompat.f1915f;
        if (!abstractC0447a.e(6)) {
            z3 = z5;
        } else if (((b) abstractC0447a).f4303e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f1915f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0447a abstractC0447a) {
        abstractC0447a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1910a;
        abstractC0447a.h(1);
        abstractC0447a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1911b;
        abstractC0447a.h(2);
        Parcel parcel = ((b) abstractC0447a).f4303e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1912c;
        abstractC0447a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1913d;
        abstractC0447a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f1914e;
        abstractC0447a.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f1915f;
        abstractC0447a.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
