package s;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import p004b1.Q;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f4448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f4449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f4450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f4451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f4452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f4453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f4454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Q f4457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f4459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f4460m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Notification f4461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f4462p;

    public static CharSequence a(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void b(Q q3) {
        if (this.f4457j != q3) {
            this.f4457j = q3;
            if (((e) q3.f2599l) != this) {
                q3.f2599l = this;
                b(q3);
            }
        }
    }
}
