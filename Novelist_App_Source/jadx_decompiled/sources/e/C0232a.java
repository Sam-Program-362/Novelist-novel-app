package e;

import P1.m;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232a extends E2.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f2771e;

    public C0232a(int i3) {
        this.f2771e = i3;
        if (i3 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // E2.a
    public final Object F(Intent intent, int i3) {
        if (i3 != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null || !linkedHashSet.isEmpty()) {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i4 = 0; i4 < itemCount; i4++) {
                        Uri uri = clipData.getItemAt(i4).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }
        return m.f1219k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0 >= 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent c0(android.app.Activity r6, G1.a r7) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            a2.h.e(r6, r0)
            java.lang.String r0 = "input"
            a2.h.e(r7, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            int r3 = r5.f2771e
            r4 = 1
            if (r0 < r1) goto L15
            goto L20
        L15:
            r1 = 30
            if (r0 < r1) goto L5f
            int r0 = B0.a.D()
            r1 = 2
            if (r0 < r1) goto L5f
        L20:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r0 = "android.provider.action.PICK_IMAGES"
            r6.<init>(r0)
            java.lang.Object r0 = r7.f398b
            e.f r0 = (e.InterfaceC0237f) r0
            java.lang.String r0 = H2.h.r(r0)
            r6.setType(r0)
            int r0 = r7.f397a
            int r0 = java.lang.Math.min(r3, r0)
            if (r0 <= r4) goto L57
            int r1 = E.c.a()
            if (r0 > r1) goto L57
            java.lang.String r1 = "android.provider.extra.PICK_IMAGES_MAX"
            r6.putExtra(r1, r0)
            java.lang.Object r7 = r7.f399c
            e.b r7 = (e.C0233b) r7
            r7.getClass()
            java.lang.String r7 = "android.provider.extra.PICK_IMAGES_LAUNCH_TAB"
            r6.putExtra(r7, r4)
            java.lang.String r7 = "android.provider.extra.PICK_IMAGES_IN_ORDER"
            r6.putExtra(r7, r2)
            return r6
        L57:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()"
            r6.<init>(r7)
            throw r6
        L5f:
            android.content.pm.ResolveInfo r0 = H2.h.q(r6)
            if (r0 == 0) goto Lb7
            android.content.pm.ResolveInfo r6 = H2.h.q(r6)
            if (r6 == 0) goto Laf
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "androidx.activity.result.contract.action.PICK_IMAGES"
            r0.<init>(r1)
            android.content.pm.ApplicationInfo r1 = r6.applicationInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r6 = r6.name
            r0.setClassName(r1, r6)
            java.lang.Object r6 = r7.f398b
            e.f r6 = (e.InterfaceC0237f) r6
            java.lang.String r6 = H2.h.r(r6)
            r0.setType(r6)
            int r6 = r7.f397a
            int r6 = java.lang.Math.min(r3, r6)
            if (r6 <= r4) goto La7
            java.lang.String r1 = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX"
            r0.putExtra(r1, r6)
            java.lang.Object r6 = r7.f399c
            e.b r6 = (e.C0233b) r6
            r6.getClass()
            java.lang.String r6 = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB"
            r0.putExtra(r6, r4)
            java.lang.String r6 = "androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER"
            r0.putExtra(r6, r2)
            return r0
        La7:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Max items must be greater than 1"
            r6.<init>(r7)
            throw r6
        Laf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        Lb7:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r6.<init>(r0)
            java.lang.Object r7 = r7.f398b
            e.f r7 = (e.InterfaceC0237f) r7
            java.lang.String r7 = H2.h.r(r7)
            r6.setType(r7)
            java.lang.String r7 = "android.intent.extra.ALLOW_MULTIPLE"
            r6.putExtra(r7, r4)
            java.lang.String r7 = r6.getType()
            if (r7 != 0) goto Le6
        */
        //  java.lang.String r7 = "*/*"
        /*
            r6.setType(r7)
            java.lang.String r7 = "image/*"
            java.lang.String r0 = "video/*"
            java.lang.String[] r7 = new java.lang.String[]{r7, r0}
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r6.putExtra(r0, r7)
        Le6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.C0232a.c0(android.app.Activity, G1.a):android.content.Intent");
    }
}
