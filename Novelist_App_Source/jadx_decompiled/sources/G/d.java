package G;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import k.D;

/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: B, reason: collision with root package name */
    public static final int f363B = ViewConfiguration.getTapTimeout();

    /* renamed from: A, reason: collision with root package name */
    public final D f364A;

    /* renamed from: k, reason: collision with root package name */
    public final a f365k;

    /* renamed from: l, reason: collision with root package name */
    public final AccelerateInterpolator f366l;

    /* renamed from: m, reason: collision with root package name */
    public final D f367m;
    public A.b n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f368o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f369p;

    /* renamed from: q, reason: collision with root package name */
    public final int f370q;

    /* renamed from: r, reason: collision with root package name */
    public final int f371r;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f372s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f373t;
    public final float[] u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f374v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f375w;
    public boolean x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f376z;

    public d(D d3) {
        a aVar = new a();
        aVar.f357e = Long.MIN_VALUE;
        aVar.f359g = -1L;
        aVar.f358f = 0L;
        this.f365k = aVar;
        this.f366l = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f368o = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f369p = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f372s = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f373t = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.u = fArr5;
        this.f367m = d3;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f370q = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f371r = f363B;
        aVar.f353a = 500;
        aVar.f354b = 500;
        this.f364A = d3;
    }

    public static float b(float f3, float f4, float f5) {
        return f3 > f5 ? f5 : f3 < f4 ? f4 : f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f368o
            r0 = r0[r4]
            float[] r1 = r3.f369p
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f366l
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f372s
            r0 = r0[r4]
            float[] r1 = r3.f373t
            r1 = r1[r4]
            float[] r2 = r3.u
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G.d.a(int, float, float, float):float");
    }

    public final float c(float f3, float f4) {
        if (f4 != 0.0f) {
            int i3 = this.f370q;
            if (i3 == 0 || i3 == 1) {
                if (f3 < f4) {
                    if (f3 >= 0.0f) {
                        return 1.0f - (f3 / f4);
                    }
                    if (this.y && i3 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i3 == 2 && f3 < 0.0f) {
                return f3 / (-f4);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f375w) {
            this.y = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f365k;
        int i4 = (int) (currentAnimationTimeMillis - aVar.f357e);
        int i5 = aVar.f354b;
        if (i4 > i5) {
            i3 = i5;
        } else if (i4 >= 0) {
            i3 = i4;
        }
        aVar.f361i = i3;
        aVar.f360h = aVar.a(currentAnimationTimeMillis);
        aVar.f359g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        D d3;
        int count;
        a aVar = this.f365k;
        float f3 = aVar.f356d;
        int abs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.f355c);
        if (abs != 0 && (count = (d3 = this.f364A).getCount()) != 0) {
            int childCount = d3.getChildCount();
            int firstVisiblePosition = d3.getFirstVisiblePosition();
            int i3 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && d3.getChildAt(0).getTop() >= 0)) : !(i3 >= count && d3.getChildAt(childCount - 1).getBottom() <= d3.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f376z
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r1
        L1b:
            r7.x = r2
            r7.f374v = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            k.D r4 = r7.f367m
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            G.a r9 = r7.f365k
            r9.f355c = r0
            r9.f356d = r8
            boolean r8 = r7.y
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            A.b r8 = r7.n
            if (r8 != 0) goto L60
            A.b r8 = new A.b
            r8.<init>(r7, r2)
            r7.n = r8
        L60:
            r7.y = r2
            r7.f375w = r2
            boolean r8 = r7.f374v
            if (r8 != 0) goto L75
            int r8 = r7.f371r
            if (r8 <= 0) goto L75
            A.b r9 = r7.n
            long r5 = (long) r8
            java.lang.reflect.Field r8 = D.G.f187a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            A.b r8 = r7.n
            r8.run()
        L7a:
            r7.f374v = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
