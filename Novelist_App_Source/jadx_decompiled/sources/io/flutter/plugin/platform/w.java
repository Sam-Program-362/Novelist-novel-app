package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class w extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final E f3245a;

    /* renamed from: b, reason: collision with root package name */
    public E f3246b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3247c;

    public w(Context context, E e3, Context context2) {
        super(context);
        this.f3245a = e3;
        this.f3247c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i3 = 0; i3 < stackTrace.length && i3 < 11; i3++) {
            if (stackTrace[i3].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i3].getMethodName().equals("<init>")) {
                return this.f3247c.getSystemService(str);
            }
        }
        if (this.f3246b == null) {
            this.f3246b = this.f3245a;
        }
        return this.f3246b;
    }
}
