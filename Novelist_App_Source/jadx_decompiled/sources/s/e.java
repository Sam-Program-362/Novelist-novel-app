package s;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import b1.C0192Q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Context f4448a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4449b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f4450c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4451d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4452e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4453f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f4454g;

    /* renamed from: h, reason: collision with root package name */
    public int f4455h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4456i;

    /* renamed from: j, reason: collision with root package name */
    public C0192Q f4457j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4458k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f4459l;

    /* renamed from: m, reason: collision with root package name */
    public String f4460m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public Notification f4461o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f4462p;

    public static CharSequence a(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void b(C0192Q c0192q) {
        if (this.f4457j != c0192q) {
            this.f4457j = c0192q;
            if (((e) c0192q.f2599l) != this) {
                c0192q.f2599l = this;
                b(c0192q);
            }
        }
    }
}
