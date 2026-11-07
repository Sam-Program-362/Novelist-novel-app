package A;

import D.G;
import L0.y;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.fork.ContentHandlerProxy;
import p003b0.AbstractComponentCallbacksC0163s;
import p003b0.DialogInterfaceOnCancelListenerC0161p;
import p003b0.I;
import p031k.C0231i;
import p031k.D;
import p035l0.C0250c;
import p035l0.C0254g;
import p035l0.s;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f4l;

    public b(L0.m mVar, l lVar) {
        this.f3k = 5;
        this.f4l = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C0231i c0231i;
        switch (this.f3k) {
            case 0:
                Object obj2 = ((w.d) this.f4l).f4639a;
                return;
            case 1:
                G.d dVar = (G.d) this.f4l;
                D d3 = dVar.f367m;
                G.a aVar = dVar.f365k;
                if (dVar.y) {
                    if (dVar.f375w) {
                        dVar.f375w = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f357e = jCurrentAnimationTimeMillis;
                        aVar.f359g = -1L;
                        aVar.f358f = jCurrentAnimationTimeMillis;
                        aVar.f360h = 0.5f;
                    }
                    if ((aVar.f359g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f359g + ((long) aVar.f361i)) || !dVar.e()) {
                        dVar.y = false;
                        return;
                    }
                    if (dVar.x) {
                        dVar.x = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        d3.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f358f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j3 = jCurrentAnimationTimeMillis2 - aVar.f358f;
                    aVar.f358f = jCurrentAnimationTimeMillis2;
                    dVar.f364A.scrollListBy((int) (j3 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f356d));
                    Field field = G.f187a;
                    d3.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((L0.p) this.f4l).g();
                return;
            case 3:
                K0.c cVar = ((L0.p) ((B1.a) this.f4l).f80l).f824b;
                cVar.d(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 4:
                ((y) this.f4l).f865h.b(new J0.a(4, null, null));
                return;
            case 5:
                throw null;
            case 6:
                synchronized (((z) this.f4l).f2175a) {
                    obj = ((z) this.f4l).f2180f;
                    ((z) this.f4l).f2180f = z.f2174k;
                    break;
                }
                ((z) this.f4l).h(obj);
                return;
            case 7:
                DialogInterfaceOnCancelListenerC0161p dialogInterfaceOnCancelListenerC0161p = (DialogInterfaceOnCancelListenerC0161p) this.f4l;
                dialogInterfaceOnCancelListenerC0161p.f2489d0.onDismiss(dialogInterfaceOnCancelListenerC0161p.f2497l0);
                return;
            case 8:
                AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = (AbstractComponentCallbacksC0163s) this.f4l;
                if (abstractComponentCallbacksC0163s.f2531R != null) {
                    abstractComponentCallbacksC0163s.e().getClass();
                    return;
                }
                return;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                ((I) this.f4l).A(true);
                return;
            case 10:
                D d4 = (D) this.f4l;
                d4.f3591w = null;
                d4.drawableStateChanged();
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.f4l).f1890k;
                if (actionMenuView == null || (c0231i = actionMenuView.f1778C) == null) {
                    return;
                }
                c0231i.h();
                return;
            case 12:
                C0254g c0254g = (C0254g) this.f4l;
                ValueAnimator valueAnimator = c0254g.u;
                int i3 = c0254g.f3989v;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                    return;
                }
                c0254g.f3989v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 13:
                s sVar = ((RecyclerView) this.f4l).f2224N;
                if (sVar != null) {
                    C0250c c0250c = (C0250c) sVar;
                    ArrayList arrayList = c0250c.f3957e;
                    ArrayList arrayList2 = c0250c.f3961i;
                    ArrayList arrayList3 = c0250c.f3963k;
                    ArrayList arrayList4 = c0250c.f3962j;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList5 = c0250c.f3959g;
                    boolean zIsEmpty2 = arrayList5.isEmpty();
                    ArrayList arrayList6 = c0250c.f3960h;
                    boolean zIsEmpty3 = arrayList6.isEmpty();
                    ArrayList arrayList7 = c0250c.f3958f;
                    boolean zIsEmpty4 = arrayList7.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!zIsEmpty2) {
                        ArrayList arrayList8 = new ArrayList();
                        arrayList8.addAll(arrayList5);
                        arrayList4.add(arrayList8);
                        arrayList5.clear();
                        if (!zIsEmpty) {
                            B1.e.p(arrayList8.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList8.iterator();
                        if (it3.hasNext()) {
                            B1.e.p(it3.next());
                            throw null;
                        }
                        arrayList8.clear();
                        arrayList4.remove(arrayList8);
                    }
                    if (!zIsEmpty3) {
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.addAll(arrayList6);
                        arrayList3.add(arrayList9);
                        arrayList6.clear();
                        if (!zIsEmpty) {
                            B1.e.p(arrayList9.get(0));
                            throw null;
                        }
                        if (arrayList9.size() > 0) {
                            B1.e.p(arrayList9.get(0));
                            throw null;
                        }
                        arrayList9.clear();
                        arrayList3.remove(arrayList9);
                    }
                    if (zIsEmpty4) {
                        return;
                    }
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList7);
                    arrayList2.add(arrayList10);
                    arrayList7.clear();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
                        Math.max(!zIsEmpty2 ? c0250c.f4015c : 0L, zIsEmpty3 ? 0L : c0250c.f4016d);
                        arrayList10.get(0).getClass();
                        throw new ClassCastException();
                    }
                    Iterator it4 = arrayList10.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList10.clear();
                    arrayList2.remove(arrayList10);
                    return;
                }
                return;
            default:
                ((StaggeredGridLayoutManager) this.f4l).J();
                return;
        }
    }

    public /* synthetic */ b(Object obj, int i3) {
        this.f3k = i3;
        this.f4l = obj;
    }

    public b(w.d dVar, int i3) {
        this.f3k = 0;
        this.f4l = dVar;
    }
}
