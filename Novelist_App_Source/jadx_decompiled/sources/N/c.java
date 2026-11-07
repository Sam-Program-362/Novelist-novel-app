package N;

import a2.h;
import android.content.Intent;
import android.os.Parcel;
import android.os.ResultReceiver;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f1182a = S0.a.C(7, 20);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1183b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1184c = 0;

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        h.e(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f1183b);
        Parcel obtain = Parcel.obtain();
        h.d(obtain, "obtain(...)");
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(65536);
    }
}
