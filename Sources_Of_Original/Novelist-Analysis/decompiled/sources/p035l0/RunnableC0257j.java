package p035l0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.plugin.platform.C0220c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p004b1.C0179l;
import p068z.c;

/* JADX INFO: renamed from: l0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0257j implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ThreadLocal f3999o = new ThreadLocal();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0179l f4000p = new C0179l(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f4001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4003m;
    public ArrayList n;

    public final void a(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.f2259w && this.f4002l == 0) {
            this.f4002l = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0255h c0255h = recyclerView.f2238g0;
        c0255h.f3991a = i3;
        c0255h.f3992b = i4;
    }

    public final void b(long j3) {
        C0256i c0256i;
        RecyclerView recyclerView;
        ArrayList arrayList = this.n;
        ArrayList arrayList2 = this.f4001k;
        int size = arrayList2.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList2.get(i4);
            int windowVisibility = recyclerView2.getWindowVisibility();
            C0255h c0255h = recyclerView2.f2238g0;
            if (windowVisibility == 0) {
                c0255h.f3993c = 0;
                i3 += c0255h.f3993c;
            }
        }
        arrayList.ensureCapacity(i3);
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i5);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0255h c0255h2 = recyclerView3.f2238g0;
                Math.abs(c0255h2.f3991a);
                Math.abs(c0255h2.f3992b);
                if (c0255h2.f3993c * 2 > 0) {
                    if (arrayList.size() <= 0) {
                        arrayList.add(new C0256i());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList, f4000p);
        if (arrayList.size() <= 0 || (recyclerView = (c0256i = (C0256i) arrayList.get(0)).f3997d) == null) {
            return;
        }
        int i6 = c0256i.f3998e;
        if (recyclerView.n.B() > 0) {
            RecyclerView.j(recyclerView.n.A(0));
            throw null;
        }
        C0220c c0220c = recyclerView.f2242k;
        try {
            recyclerView.f2217G++;
            c0220c.a(i6);
            throw null;
        } catch (Throwable th) {
            int i7 = recyclerView.f2217G - 1;
            recyclerView.f2217G = i7;
            if (i7 < 1) {
                recyclerView.f2217G = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f4001k;
        try {
            int i3 = c.f4734a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f4003m);
                }
            }
            this.f4002l = 0L;
        } finally {
            this.f4002l = 0L;
            int i5 = c.f4734a;
            Trace.endSection();
        }
    }
}
