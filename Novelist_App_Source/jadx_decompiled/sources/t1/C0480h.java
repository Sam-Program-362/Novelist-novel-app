package t1;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: t1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480h implements C1.e {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f4565a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4566b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f4567c = new AtomicBoolean(false);

    public C0480h(FlutterJNI flutterJNI, int i3) {
        this.f4565a = flutterJNI;
        this.f4566b = i3;
    }

    @Override // C1.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f4567c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i3 = this.f4566b;
        FlutterJNI flutterJNI = this.f4565a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i3, byteBuffer, byteBuffer.position());
        }
    }
}
