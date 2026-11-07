package p002b;

import B1.p;
import a2.h;
import a2.r;
import android.os.Bundle;
import b2.a;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p003b0.C0165u;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f2295b;

    public /* synthetic */ g(SignInHubActivity signInHubActivity, int i3) {
        this.f2294a = i3;
        this.f2295b = signInHubActivity;
    }

    public final void a(k kVar) {
        switch (this.f2294a) {
            case 0:
                h.e(kVar, "it");
                SignInHubActivity signInHubActivity = this.f2295b;
                Bundle bundleA = ((p) signInHubActivity.n.f2843c).a("android:support:activity-result");
                if (bundleA != null) {
                    j jVar = signInHubActivity.f2314r;
                    LinkedHashMap linkedHashMap = jVar.f2301b;
                    LinkedHashMap linkedHashMap2 = jVar.f2300a;
                    Bundle bundle = jVar.f2306g;
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        jVar.f2303d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str = stringArrayList.get(i3);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof a) {
                                    r.e(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i3);
                        h.d(num2, "get(...)");
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i3);
                        h.d(str2, "get(...)");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        jVar.f2301b.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
            default:
                C0165u c0165u = (C0165u) this.f2295b.f2707C.f443l;
                c0165u.f2555p.b(c0165u, c0165u, null);
                return;
        }
    }
}
