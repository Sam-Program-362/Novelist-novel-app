package b0;

import a0.AbstractC0103a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {

    /* renamed from: k, reason: collision with root package name */
    public final I f2563k;

    public x(I i3) {
        this.f2563k = i3;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z3;
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s;
        O g3;
        boolean equals = C0175w.class.getName().equals(str);
        I i3 = this.f2563k;
        if (equals) {
            return new C0175w(context, attributeSet, i3);
        }
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s2 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0103a.f1682a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z3 = AbstractComponentCallbacksC0171s.class.isAssignableFrom(C0153B.b(attributeValue, context.getClassLoader()));
                } catch (ClassNotFoundException unused) {
                    z3 = false;
                }
                if (z3) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0171s C2 = resourceId != -1 ? i3.C(resourceId) : null;
                    if (C2 == null && string != null) {
                        B1.s sVar = i3.f2371c;
                        ArrayList arrayList = (ArrayList) sVar.f144k;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                abstractComponentCallbacksC0171s = abstractComponentCallbacksC0171s2;
                                Iterator it2 = ((HashMap) sVar.f145l).values().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        C2 = abstractComponentCallbacksC0171s;
                                        break;
                                    }
                                    O o2 = (O) it2.next();
                                    if (o2 != null) {
                                        C2 = o2.f2419c;
                                        if (string.equals(C2.f2522I)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s3 = (AbstractComponentCallbacksC0171s) arrayList.get(size);
                                abstractComponentCallbacksC0171s = abstractComponentCallbacksC0171s2;
                                if (abstractComponentCallbacksC0171s3 != null && string.equals(abstractComponentCallbacksC0171s3.f2522I)) {
                                    C2 = abstractComponentCallbacksC0171s3;
                                    break;
                                }
                                size--;
                                abstractComponentCallbacksC0171s2 = abstractComponentCallbacksC0171s;
                            }
                        }
                    } else {
                        abstractComponentCallbacksC0171s = null;
                    }
                    if (C2 == null && id != -1) {
                        C2 = i3.C(id);
                    }
                    if (C2 == null) {
                        C0153B G3 = i3.G();
                        context.getClassLoader();
                        C2 = G3.a(attributeValue);
                        C2.x = true;
                        C2.f2520G = resourceId != 0 ? resourceId : id;
                        C2.f2521H = id;
                        C2.f2522I = string;
                        C2.y = true;
                        C2.f2516C = i3;
                        C0173u c0173u = i3.f2388v;
                        C2.f2517D = c0173u;
                        SignInHubActivity signInHubActivity = c0173u.n;
                        C2.f2527N = true;
                        if ((c0173u == null ? abstractComponentCallbacksC0171s : c0173u.f2553m) != null) {
                            C2.f2527N = true;
                        }
                        g3 = i3.a(C2);
                        if (I.J(2)) {
                            Log.v("FragmentManager", "Fragment " + C2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (C2.y) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        C2.y = true;
                        C2.f2516C = i3;
                        C0173u c0173u2 = i3.f2388v;
                        C2.f2517D = c0173u2;
                        SignInHubActivity signInHubActivity2 = c0173u2.n;
                        C2.f2527N = true;
                        if ((c0173u2 == null ? abstractComponentCallbacksC0171s : c0173u2.f2553m) != null) {
                            C2.f2527N = true;
                        }
                        g3 = i3.g(C2);
                        if (I.J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + C2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    c0.c cVar = c0.d.f2657a;
                    c0.d.b(new c0.a(C2, "Attempting to use <fragment> tag to add fragment " + C2 + " to container " + viewGroup));
                    c0.d.a(C2).getClass();
                    C2.f2528O = viewGroup;
                    g3.j();
                    g3.i();
                    throw new IllegalStateException(AbstractC0468a.b("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
