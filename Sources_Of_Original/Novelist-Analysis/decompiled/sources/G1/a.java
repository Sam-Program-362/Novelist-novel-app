package G1;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.View;
import org.apache.tika.utils.StringUtils;
import p033k1.f;
import p033k1.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f399c;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = StringUtils.EMPTY;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f399c = string;
        this.f398b = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i3 = 2;
        while (i3 <= 7 && !Log.isLoggable((String) this.f398b, i3)) {
            i3++;
        }
        this.f397a = i3;
    }

    @Override // p033k1.h
    public void a() {
        HandlerThread handlerThread = (HandlerThread) this.f398b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f398b = null;
            this.f399c = null;
        }
    }

    @Override // p033k1.h
    public void b(f fVar) {
        ((Handler) this.f399c).post(fVar.f3835b);
    }

    public int d() {
        int i3 = this.f397a;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        View viewFindViewById = ((Activity) this.f398b).findViewById(i3);
        if (viewFindViewById != null) {
            return viewFindViewById.getContentSensitivity();
        }
        throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
    }

    public void e(int i3) {
        int i4 = this.f397a;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        View viewFindViewById = ((Activity) this.f398b).findViewById(i4);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i4 + "not found");
        }
        if (viewFindViewById.getContentSensitivity() == i3) {
            return;
        }
        viewFindViewById.setContentSensitivity(i3);
        viewFindViewById.invalidate();
    }

    @Override // p033k1.h
    public void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f397a);
        this.f398b = handlerThread;
        handlerThread.start();
        this.f399c = new Handler(((HandlerThread) this.f398b).getLooper());
    }
}
