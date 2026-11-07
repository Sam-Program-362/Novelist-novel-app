package p003b0;

import B1.s;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c0.c;
import c0.d;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p001a0.a;

/* JADX INFO: loaded from: classes.dex */
public final class x implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
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
        boolean zIsAssignableFrom;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s;
        O oG;
        boolean zEquals = C0167w.class.getName().equals(str);
        I i3 = this.f2563k;
        if (zEquals) {
            return new C0167w(context, attributeSet, i3);
        }
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s2 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1682a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0163s.class.isAssignableFrom(B.b(attributeValue, context.getClassLoader()));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163sC = resourceId != -1 ? i3.C(resourceId) : null;
                    if (abstractComponentCallbacksC0163sC == null && string != null) {
                        s sVar = i3.f2371c;
                        ArrayList arrayList = (ArrayList) sVar.f144k;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                abstractComponentCallbacksC0163s = abstractComponentCallbacksC0163s2;
                                Iterator it2 = ((HashMap) sVar.f145l).values().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        abstractComponentCallbacksC0163sC = abstractComponentCallbacksC0163s;
                                        break;
                                    }
                                    O o2 = (O) it2.next();
                                    if (o2 != null) {
                                        abstractComponentCallbacksC0163sC = o2.f2419c;
                                        if (string.equals(abstractComponentCallbacksC0163sC.f2522I)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s3 = (AbstractComponentCallbacksC0163s) arrayList.get(size);
                                abstractComponentCallbacksC0163s = abstractComponentCallbacksC0163s2;
                                if (abstractComponentCallbacksC0163s3 != null && string.equals(abstractComponentCallbacksC0163s3.f2522I)) {
                                    abstractComponentCallbacksC0163sC = abstractComponentCallbacksC0163s3;
                                    break;
                                }
                                size--;
                                abstractComponentCallbacksC0163s2 = abstractComponentCallbacksC0163s;
                            }
                        }
                    } else {
                        abstractComponentCallbacksC0163s = null;
                    }
                    if (abstractComponentCallbacksC0163sC == null && id != -1) {
                        abstractComponentCallbacksC0163sC = i3.C(id);
                    }
                    if (abstractComponentCallbacksC0163sC == null) {
                        B bG = i3.G();
                        context.getClassLoader();
                        abstractComponentCallbacksC0163sC = bG.a(attributeValue);
                        abstractComponentCallbacksC0163sC.x = true;
                        abstractComponentCallbacksC0163sC.f2520G = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0163sC.f2521H = id;
                        abstractComponentCallbacksC0163sC.f2522I = string;
                        abstractComponentCallbacksC0163sC.y = true;
                        abstractComponentCallbacksC0163sC.f2516C = i3;
                        C0165u c0165u = i3.f2388v;
                        abstractComponentCallbacksC0163sC.f2517D = c0165u;
                        SignInHubActivity signInHubActivity = c0165u.n;
                        abstractComponentCallbacksC0163sC.f2527N = true;
                        if ((c0165u == null ? abstractComponentCallbacksC0163s : c0165u.f2553m) != null) {
                            abstractComponentCallbacksC0163sC.f2527N = true;
                        }
                        oG = i3.a(abstractComponentCallbacksC0163sC);
                        if (I.J(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0163sC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0163sC.y) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0163sC.y = true;
                        abstractComponentCallbacksC0163sC.f2516C = i3;
                        C0165u c0165u2 = i3.f2388v;
                        abstractComponentCallbacksC0163sC.f2517D = c0165u2;
                        SignInHubActivity signInHubActivity2 = c0165u2.n;
                        abstractComponentCallbacksC0163sC.f2527N = true;
                        if ((c0165u2 == null ? abstractComponentCallbacksC0163s : c0165u2.f2553m) != null) {
                            abstractComponentCallbacksC0163sC.f2527N = true;
                        }
                        oG = i3.g(abstractComponentCallbacksC0163sC);
                        if (I.J(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0163sC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    c cVar = d.f2657a;
                    d.b(new c0.a(abstractComponentCallbacksC0163sC, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0163sC + " to container " + viewGroup));
                    d.a(abstractComponentCallbacksC0163sC).getClass();
                    abstractComponentCallbacksC0163sC.f2528O = viewGroup;
                    oG.j();
                    oG.i();
                    throw new IllegalStateException(p055t.a.b("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
