package b0;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.utils.StringUtils;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154a implements F {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2437a;

    /* renamed from: b, reason: collision with root package name */
    public int f2438b;

    /* renamed from: c, reason: collision with root package name */
    public int f2439c;

    /* renamed from: d, reason: collision with root package name */
    public int f2440d;

    /* renamed from: e, reason: collision with root package name */
    public int f2441e;

    /* renamed from: f, reason: collision with root package name */
    public int f2442f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2443g;

    /* renamed from: h, reason: collision with root package name */
    public String f2444h;

    /* renamed from: i, reason: collision with root package name */
    public int f2445i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2446j;

    /* renamed from: k, reason: collision with root package name */
    public int f2447k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2448l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2449m;
    public ArrayList n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2450o;

    /* renamed from: p, reason: collision with root package name */
    public final I f2451p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2452q;

    /* renamed from: r, reason: collision with root package name */
    public int f2453r;

    public C0154a(I i3) {
        i3.G();
        C0173u c0173u = i3.f2388v;
        if (c0173u != null) {
            c0173u.n.getClassLoader();
        }
        this.f2437a = new ArrayList();
        this.f2450o = false;
        this.f2453r = -1;
        this.f2451p = i3;
    }

    @Override // b0.F
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (I.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2443g) {
            return true;
        }
        this.f2451p.f2372d.add(this);
        return true;
    }

    public final void b(P p3) {
        this.f2437a.add(p3);
        p3.f2425d = this.f2438b;
        p3.f2426e = this.f2439c;
        p3.f2427f = this.f2440d;
        p3.f2428g = this.f2441e;
    }

    public final void c(int i3) {
        if (this.f2443g) {
            if (I.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i3);
            }
            ArrayList arrayList = this.f2437a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                P p3 = (P) arrayList.get(i4);
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = p3.f2423b;
                if (abstractComponentCallbacksC0171s != null) {
                    abstractComponentCallbacksC0171s.f2515B += i3;
                    if (I.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p3.f2423b + " to " + p3.f2423b.f2515B);
                    }
                }
            }
        }
    }

    public final int d(boolean z3) {
        if (this.f2452q) {
            throw new IllegalStateException("commit already called");
        }
        if (I.J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new S());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f2452q = true;
        boolean z4 = this.f2443g;
        I i3 = this.f2451p;
        if (z4) {
            this.f2453r = i3.f2378j.getAndIncrement();
        } else {
            this.f2453r = -1;
        }
        i3.y(this, z3);
        return this.f2453r;
    }

    public final void e(int i3, AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s, String str) {
        String str2 = abstractComponentCallbacksC0171s.f2533U;
        if (str2 != null) {
            c0.d.c(abstractComponentCallbacksC0171s, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0171s.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0171s.f2522I;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0171s + ": was " + abstractComponentCallbacksC0171s.f2522I + " now " + str);
            }
            abstractComponentCallbacksC0171s.f2522I = str;
        }
        if (i3 != 0) {
            if (i3 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0171s + " with tag " + str + " to container view with no id");
            }
            int i4 = abstractComponentCallbacksC0171s.f2520G;
            if (i4 != 0 && i4 != i3) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0171s + ": was " + abstractComponentCallbacksC0171s.f2520G + " now " + i3);
            }
            abstractComponentCallbacksC0171s.f2520G = i3;
            abstractComponentCallbacksC0171s.f2521H = i3;
        }
        b(new P(1, abstractComponentCallbacksC0171s));
        abstractComponentCallbacksC0171s.f2516C = this.f2451p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2444h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2453r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2452q);
            if (this.f2442f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2442f));
            }
            if (this.f2438b != 0 || this.f2439c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2438b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2439c));
            }
            if (this.f2440d != 0 || this.f2441e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2440d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2441e));
            }
            if (this.f2445i != 0 || this.f2446j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2445i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2446j);
            }
            if (this.f2447k != 0 || this.f2448l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2447k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2448l);
            }
        }
        ArrayList arrayList = this.f2437a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            P p3 = (P) arrayList.get(i3);
            switch (p3.f2422a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + p3.f2422a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i3);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(StringUtils.SPACE);
            printWriter.println(p3.f2423b);
            if (z3) {
                if (p3.f2425d != 0 || p3.f2426e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p3.f2425d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p3.f2426e));
                }
                if (p3.f2427f != 0 || p3.f2428g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p3.f2427f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p3.f2428g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2453r >= 0) {
            sb.append(" #");
            sb.append(this.f2453r);
        }
        if (this.f2444h != null) {
            sb.append(StringUtils.SPACE);
            sb.append(this.f2444h);
        }
        sb.append("}");
        return sb.toString();
    }
}
