package p052r1;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import android.view.MotionEvent;
import io.flutter.embedding.engine.renderer.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import p004b1.Q;

/* JADX INFO: renamed from: r1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0261a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Matrix f4341f = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f4342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f4343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f4345d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4346e;

    public C0261a(k kVar, boolean z3) {
        this.f4342a = kVar;
        if (Q.n == null) {
            Q.n = new Q(13);
        }
        this.f4343b = Q.n;
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

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        if (r11 == (-1)) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.MotionEvent r29, int r30, int r31, int r32, android.graphics.Matrix r33, java.nio.ByteBuffer r34, android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p052r1.C0261a.a(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
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
        int iB = b(motionEvent.getActionMasked());
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
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i3) * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z3) {
            a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
        } else if (z4) {
            for (int i4 = 0; i4 < pointerCount; i4++) {
                if (i4 != motionEvent.getActionIndex() && motionEvent.getToolType(i4) == 1) {
                    a(motionEvent, i4, 5, 1, matrix, byteBufferAllocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
            if (i3 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBufferAllocateDirect, null);
            }
        } else {
            for (int i5 = 0; i5 < pointerCount; i5++) {
                a(motionEvent, i5, iB, (pointerCount << 8) | 2, matrix, byteBufferAllocateDirect, null);
            }
        }
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f4342a.f3083a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
    }
}
