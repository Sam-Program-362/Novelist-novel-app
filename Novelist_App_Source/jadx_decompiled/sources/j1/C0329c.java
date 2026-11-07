package j1;

import C1.o;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import i2.A;
import i2.AbstractC0303u;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329c implements o {

    /* renamed from: t, reason: collision with root package name */
    public static final int f3551t = (C0331e.class.hashCode() + 43) & 65535;
    public static final int u = (C0331e.class.hashCode() + 83) & 65535;

    /* renamed from: k, reason: collision with root package name */
    public final Activity f3552k;

    /* renamed from: l, reason: collision with root package name */
    public B1.o f3553l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3554m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public String f3555o;

    /* renamed from: p, reason: collision with root package name */
    public int f3556p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3557q;

    /* renamed from: r, reason: collision with root package name */
    public C1.g f3558r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f3559s;

    public C0329c(Activity activity) {
        a2.h.e(activity, "activity");
        this.f3552k = activity;
        this.f3553l = null;
    }

    @Override // C1.o
    public final boolean a(int i3, int i4, Intent intent) {
        int i5 = u;
        Activity activity = this.f3552k;
        if (i3 == i5) {
            if (i4 == -1) {
                Uri data = intent != null ? intent.getData() : null;
                if (data != null) {
                    b(true);
                    try {
                        byte[] bArr = this.f3559s;
                        a2.h.e(activity, "context");
                        OutputStream openOutputStream = activity.getContentResolver().openOutputStream(data);
                        if (openOutputStream != null) {
                            if (bArr != null) {
                                try {
                                    openOutputStream.write(bArr);
                                } finally {
                                }
                            }
                            openOutputStream.close();
                        }
                        d(data.getPath());
                        return true;
                    } catch (IOException e3) {
                        Log.e("FilePickerDelegate", "Error while saving file", e3);
                        c("Error while saving file", e3.getMessage());
                    }
                }
                return false;
            }
            if (i4 == 0) {
                d(null);
                return false;
            }
        } else {
            if (i3 != f3551t) {
                c("unknown_activity", "Unknown activity error, please file an issue.");
                return false;
            }
            if (i4 == -1) {
                b(true);
                int i6 = this.f3556p;
                boolean z3 = this.n;
                String str = this.f3555o;
                if (str == null) {
                    str = StringUtils.EMPTY;
                }
                String str2 = str;
                a2.h.e(activity, "activity");
                p2.e eVar = A.f2964a;
                AbstractC0303u.g(AbstractC0303u.a(p2.d.f4262m), new C0333g(intent, this, activity, i6, z3, str2, null));
                return true;
            }
            if (i4 == 0) {
                d(null);
                return true;
            }
        }
        return false;
    }

    public final void b(final boolean z3) {
        if (this.f3558r == null || a2.h.a(this.f3555o, "dir")) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: j1.b
            @Override // java.lang.Runnable
            public final void run() {
                C1.g gVar = C0329c.this.f3558r;
                if (gVar != null) {
                    gVar.a(Boolean.valueOf(z3));
                }
            }
        });
    }

    public final void c(String str, String str2) {
        b(false);
        B1.o oVar = this.f3553l;
        if (oVar != null) {
            oVar.a(str, str2, null);
        }
        this.f3553l = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r3 == 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [B1.o] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.io.Serializable r13) {
        /*
            r12 = this;
            r0 = 0
            r12.b(r0)
            B1.o r1 = r12.f3553l
            if (r1 == 0) goto L8d
            r2 = 0
            if (r13 == 0) goto L14
            boolean r3 = r13 instanceof java.lang.String
            if (r3 == 0) goto L11
            r3 = r13
            goto L12
        L11:
            r3 = r2
        L12:
            if (r3 != 0) goto L88
        L14:
            boolean r3 = r13 instanceof java.util.ArrayList
            if (r3 == 0) goto L1b
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            goto L1c
        L1b:
            r13 = r2
        L1c:
            if (r13 == 0) goto L87
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r13.size()
        L27:
            if (r0 >= r4) goto L88
            java.lang.Object r5 = r13.get(r0)
            int r0 = r0 + 1
            boolean r6 = r5 instanceof j1.C0327a
            if (r6 == 0) goto L36
            j1.a r5 = (j1.C0327a) r5
            goto L37
        L36:
            r5 = r2
        L37:
            if (r5 == 0) goto L80
            O1.b r6 = new O1.b
            java.lang.String r7 = "path"
            java.lang.String r8 = r5.f3544a
            r6.<init>(r7, r8)
            O1.b r7 = new O1.b
            java.lang.String r8 = "name"
            java.lang.String r9 = r5.f3545b
            r7.<init>(r8, r9)
            O1.b r8 = new O1.b
            long r9 = r5.f3547d
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.String r10 = "size"
            r8.<init>(r10, r9)
            O1.b r9 = new O1.b
            java.lang.String r10 = "bytes"
            byte[] r11 = r5.f3548e
            r9.<init>(r10, r11)
            O1.b r10 = new O1.b
            android.net.Uri r5 = r5.f3546c
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r11 = "identifier"
            r10.<init>(r11, r5)
            O1.b[] r5 = new O1.b[]{r6, r7, r8, r9, r10}
            java.util.HashMap r6 = new java.util.HashMap
            r7 = 5
            int r7 = P1.p.S(r7)
            r6.<init>(r7)
            P1.p.T(r6, r5)
            goto L81
        L80:
            r6 = r2
        L81:
            if (r6 == 0) goto L27
            r3.add(r6)
            goto L27
        L87:
            r3 = r2
        L88:
            r1.d(r3)
            r12.f3553l = r2
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C0329c.d(java.io.Serializable):void");
    }
}
