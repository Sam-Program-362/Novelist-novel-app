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
import b0.AbstractComponentCallbacksC0171s;
import b0.DialogInterfaceOnCancelListenerC0169p;
import b0.I;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k.C0346i;
import k.D;
import l0.AbstractC0409s;
import l0.C0393c;
import l0.C0397g;
import org.apache.tika.fork.ContentHandlerProxy;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4l;

    public b(L0.m mVar, l lVar) {
        this.f3k = 5;
        this.f4l = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C0346i c0346i;
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
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f357e = currentAnimationTimeMillis;
                        aVar.f359g = -1L;
                        aVar.f358f = currentAnimationTimeMillis;
                        aVar.f360h = 0.5f;
                    }
                    if ((aVar.f359g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f359g + aVar.f361i) || !dVar.e()) {
                        dVar.y = false;
                        return;
                    }
                    if (dVar.x) {
                        dVar.x = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        d3.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f358f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a3 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f358f;
                    aVar.f358f = currentAnimationTimeMillis2;
                    dVar.f364A.scrollListBy((int) (j3 * ((a3 * 4.0f) + ((-4.0f) * a3 * a3)) * aVar.f356d));
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
                }
                ((z) this.f4l).h(obj);
                return;
            case 7:
                DialogInterfaceOnCancelListenerC0169p dialogInterfaceOnCancelListenerC0169p = (DialogInterfaceOnCancelListenerC0169p) this.f4l;
                dialogInterfaceOnCancelListenerC0169p.f2489d0.onDismiss(dialogInterfaceOnCancelListenerC0169p.f2497l0);
                return;
            case 8:
                AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = (AbstractComponentCallbacksC0171s) this.f4l;
                if (abstractComponentCallbacksC0171s.f2531R != null) {
                    abstractComponentCallbacksC0171s.e().getClass();
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
                if (actionMenuView == null || (c0346i = actionMenuView.f1778C) == null) {
                    return;
                }
                c0346i.h();
                return;
            case 12:
                C0397g c0397g = (C0397g) this.f4l;
                ValueAnimator valueAnimator = c0397g.u;
                int i3 = c0397g.f3989v;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                    return;
                }
                c0397g.f3989v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 13:
                AbstractC0409s abstractC0409s = ((RecyclerView) this.f4l).f2224N;
                if (abstractC0409s != null) {
                    C0393c c0393c = (C0393c) abstractC0409s;
                    ArrayList arrayList = c0393c.f3957e;
                    ArrayList arrayList2 = c0393c.f3961i;
                    ArrayList arrayList3 = c0393c.f3963k;
                    ArrayList arrayList4 = c0393c.f3962j;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList5 = c0393c.f3959g;
                    boolean isEmpty2 = arrayList5.isEmpty();
                    ArrayList arrayList6 = c0393c.f3960h;
                    boolean isEmpty3 = arrayList6.isEmpty();
                    ArrayList arrayList7 = c0393c.f3958f;
                    boolean isEmpty4 = arrayList7.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        ArrayList arrayList8 = new ArrayList();
                        arrayList8.addAll(arrayList5);
                        arrayList4.add(arrayList8);
                        arrayList5.clear();
                        if (!isEmpty) {
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
                    if (!isEmpty3) {
                        ArrayList arrayList9 = new ArrayList();
                        arrayList9.addAll(arrayList6);
                        arrayList3.add(arrayList9);
                        arrayList6.clear();
                        if (!isEmpty) {
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
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList7);
                    arrayList2.add(arrayList10);
                    arrayList7.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c0393c.f4015c : 0L, isEmpty3 ? 0L : c0393c.f4016d);
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
