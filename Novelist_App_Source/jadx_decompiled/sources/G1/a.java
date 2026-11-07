package G1;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.View;
import k1.C0369f;
import k1.InterfaceC0371h;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class a implements InterfaceC0371h {

    /* renamed from: a, reason: collision with root package name */
    public int f397a;

    /* renamed from: b, reason: collision with root package name */
    public Object f398b;

    /* renamed from: c, reason: collision with root package name */
    public Object f399c;

    public a(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = StringUtils.EMPTY;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f399c = sb;
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

    @Override // k1.InterfaceC0371h
    public void a() {
        HandlerThread handlerThread = (HandlerThread) this.f398b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f398b = null;
            this.f399c = null;
        }
    }

    @Override // k1.InterfaceC0371h
    public void b(C0369f c0369f) {
        ((Handler) this.f399c).post(c0369f.f3835b);
    }

    public int d() {
        int contentSensitivity;
        int i3 = this.f397a;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        View findViewById = ((Activity) this.f398b).findViewById(i3);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
    }

    public void e(int i3) {
        int contentSensitivity;
        int i4 = this.f397a;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        View findViewById = ((Activity) this.f398b).findViewById(i4);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i4 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i3) {
            return;
        }
        findViewById.setContentSensitivity(i3);
        findViewById.invalidate();
    }

    @Override // k1.InterfaceC0371h
    public void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f397a);
        this.f398b = handlerThread;
        handlerThread.start();
        this.f399c = new Handler(((HandlerThread) this.f398b).getLooper());
    }
}
