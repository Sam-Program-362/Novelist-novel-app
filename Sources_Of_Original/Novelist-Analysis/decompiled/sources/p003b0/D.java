package p003b0;

import E2.a;
import P1.g;
import P1.m;
import P1.n;
import P1.p;
import a2.h;
import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p007d.b;
import p009e.f;

/* JADX INFO: loaded from: classes.dex */
public final class D extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2348e;

    public /* synthetic */ D(int i3) {
        this.f2348e = i3;
    }

    @Override // E2.a
    public final Object F(Intent intent, int i3) {
        List arrayList;
        switch (this.f2348e) {
            case 0:
                return new b(intent, i3);
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
                    arrayList = m.f1219k;
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
                        ArrayList arrayList4 = new ArrayList(Math.min(g.e0(arrayList3), g.e0(arrayList2)));
                        while (it2.hasNext() && it3.hasNext()) {
                            arrayList4.add(new O1.b(it2.next(), it3.next()));
                        }
                        return p.U(arrayList4);
                    }
                }
                return n.f1220k;
            default:
                return new b(intent, i3);
        }
    }

    public Intent c0(Activity activity, G1.a aVar) {
        h.e(activity, "context");
        h.e(aVar, "input");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33 || (i3 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(H2.h.r((f) aVar.f398b));
            ((p009e.b) aVar.f399c).getClass();
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        if (H2.h.q(activity) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(H2.h.r((f) aVar.f398b));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoQ = H2.h.q(activity);
        if (resolveInfoQ == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoQ.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(H2.h.r((f) aVar.f398b));
        ((p009e.b) aVar.f399c).getClass();
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }
}
