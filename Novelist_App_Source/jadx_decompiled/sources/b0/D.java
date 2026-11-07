package b0;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import d.C0227b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class D extends E2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2348e;

    public /* synthetic */ D(int i3) {
        this.f2348e = i3;
    }

    @Override // E2.a
    public final Object F(Intent intent, int i3) {
        List arrayList;
        switch (this.f2348e) {
            case 0:
                return new C0227b(intent, i3);
            case 1:
                if (i3 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data != null) {
                    return data;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = P1.m.f1219k;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i4 = 0; i4 < itemCount; i4++) {
                            Uri uri = clipData.getItemAt(i4).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) (arrayList.isEmpty() ? null : arrayList.get(0));
            case 2:
                if (i3 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i5 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i5 == 0));
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList3.add(str);
                            }
                        }
                        Iterator it2 = arrayList3.iterator();
                        Iterator it3 = arrayList2.iterator();
                        ArrayList arrayList4 = new ArrayList(Math.min(P1.g.e0(arrayList3), P1.g.e0(arrayList2)));
                        while (it2.hasNext() && it3.hasNext()) {
                            arrayList4.add(new O1.b(it2.next(), it3.next()));
                        }
                        return P1.p.U(arrayList4);
                    }
                }
                return P1.n.f1220k;
            default:
                return new C0227b(intent, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0 >= 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent c0(android.app.Activity r4, G1.a r5) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            a2.h.e(r4, r0)
            java.lang.String r0 = "input"
            a2.h.e(r5, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 < r1) goto L12
            goto L1d
        L12:
            r1 = 30
            if (r0 < r1) goto L3c
            int r0 = B0.a.D()
            r1 = 2
            if (r0 < r1) goto L3c
        L1d:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r0 = "android.provider.action.PICK_IMAGES"
            r4.<init>(r0)
            java.lang.Object r0 = r5.f398b
            e.f r0 = (e.InterfaceC0237f) r0
            java.lang.String r0 = H2.h.r(r0)
            r4.setType(r0)
            java.lang.Object r5 = r5.f399c
            e.b r5 = (e.C0233b) r5
            r5.getClass()
            java.lang.String r5 = "android.provider.extra.PICK_IMAGES_LAUNCH_TAB"
            r4.putExtra(r5, r2)
            return r4
        L3c:
            android.content.pm.ResolveInfo r0 = H2.h.q(r4)
            if (r0 == 0) goto L7a
            android.content.pm.ResolveInfo r4 = H2.h.q(r4)
            if (r4 == 0) goto L72
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "androidx.activity.result.contract.action.PICK_IMAGES"
            r0.<init>(r1)
            android.content.pm.ApplicationInfo r1 = r4.applicationInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r4 = r4.name
            r0.setClassName(r1, r4)
            java.lang.Object r4 = r5.f398b
            e.f r4 = (e.InterfaceC0237f) r4
            java.lang.String r4 = H2.h.r(r4)
            r0.setType(r4)
            java.lang.Object r4 = r5.f399c
            e.b r4 = (e.C0233b) r4
            r4.getClass()
            java.lang.String r4 = "androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB"
            r0.putExtra(r4, r2)
            return r0
        L72:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Required value was null."
            r4.<init>(r5)
            throw r4
        L7a:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r4.<init>(r0)
            java.lang.Object r5 = r5.f398b
            e.f r5 = (e.InterfaceC0237f) r5
            java.lang.String r5 = H2.h.r(r5)
            r4.setType(r5)
            java.lang.String r5 = r4.getType()
            if (r5 != 0) goto La4
        */
        //  java.lang.String r5 = "*/*"
        /*
            r4.setType(r5)
            java.lang.String r5 = "image/*"
            java.lang.String r0 = "video/*"
            java.lang.String[] r5 = new java.lang.String[]{r5, r0}
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r4.putExtra(r0, r5)
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.D.c0(android.app.Activity, G1.a):android.content.Intent");
    }
}
