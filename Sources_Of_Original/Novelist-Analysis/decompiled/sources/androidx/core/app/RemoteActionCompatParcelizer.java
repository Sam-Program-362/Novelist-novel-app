package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p048q0.a;
import p048q0.b;
import p048q0.c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f1910a;
        boolean z3 = true;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f1910a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f1911b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f4303e);
        }
        remoteActionCompat.f1911b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1912c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f4303e);
        }
        remoteActionCompat.f1912c = charSequence2;
        remoteActionCompat.f1913d = (PendingIntent) aVar.f(remoteActionCompat.f1913d, 4);
        boolean z4 = remoteActionCompat.f1914e;
        if (aVar.e(5)) {
            z4 = ((b) aVar).f4303e.readInt() != 0;
        }
        remoteActionCompat.f1914e = z4;
        boolean z5 = remoteActionCompat.f1915f;
        if (!aVar.e(6)) {
            z3 = z5;
        } else if (((b) aVar).f4303e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f1915f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1910a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1911b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f4303e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1912c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1913d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f1914e;
        aVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f1915f;
        aVar.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
