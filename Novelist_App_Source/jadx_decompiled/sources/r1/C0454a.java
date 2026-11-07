package r1;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import android.view.MotionEvent;
import b1.C0192Q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454a {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f4341f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.k f4342a;

    /* renamed from: b, reason: collision with root package name */
    public final C0192Q f4343b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4344c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4345d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f4346e;

    public C0454a(io.flutter.embedding.engine.renderer.k kVar, boolean z3) {
        this.f4342a = kVar;
        if (C0192Q.n == null) {
            C0192Q.n = new C0192Q(13);
        }
        this.f4343b = C0192Q.n;
        this.f4344c = z3;
    }

    public static int b(int i3) {
        if (i3 == 0) {
            return 4;
        }
        if (i3 != 1) {
            if (i3 == 5) {
                return 4;
            }
            if (i3 != 6) {
                if (i3 == 2) {
                    return 5;
                }
                if (i3 != 7) {
                    if (i3 == 3) {
                        return 0;
                    }
                    if (i3 != 8) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 6;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v7 int, still in use, count: 2, list:
          (r11v7 int) from 0x00a6: IF  (r11v7 int) == (-1 int)  -> B:3:0x000d A[HIDDEN] (LINE:167)
          (r11v7 int) from 0x00ac: PHI (r11v2 int) = (r11v1 int), (r11v7 int) binds: [B:90:0x00aa, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        */
    public final void a(android.view.MotionEvent r29, int r30, int r31, int r32, android.graphics.Matrix r33, java.nio.ByteBuffer r34, android.content.Context r35) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.C0454a.a(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final int c(Context context) {
        if (this.f4346e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f4346e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4346e;
    }

    public final void d(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int b3 = b(motionEvent.getActionMasked());
        char c3 = 5;
        boolean z3 = actionMasked == 0 || actionMasked == 5;
        boolean z4 = !z3 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c3 = 0;
        } else if (toolType == 2) {
            c3 = 2;
        } else if (toolType == 3) {
            c3 = 1;
        } else if (toolType == 4) {
            c3 = 3;
        }
        int i3 = (z4 && c3 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i3) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z3) {
            a(motionEvent, motionEvent.getActionIndex(), b3, 0, matrix, allocateDirect, null);
        } else if (z4) {
            for (int i4 = 0; i4 < pointerCount; i4++) {
                if (i4 != motionEvent.getActionIndex() && motionEvent.getToolType(i4) == 1) {
                    a(motionEvent, i4, 5, 1, matrix, allocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), b3, 0, matrix, allocateDirect, null);
            if (i3 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect, null);
            }
        } else {
            for (int i5 = 0; i5 < pointerCount; i5++) {
                a(motionEvent, i5, b3, (pointerCount << 8) | 2, matrix, allocateDirect, null);
            }
        }
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f4342a.f3083a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
    }
}
