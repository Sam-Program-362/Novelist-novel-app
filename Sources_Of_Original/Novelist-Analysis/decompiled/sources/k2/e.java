package k2;

import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f3883a = new k(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f3884b = n2.a.j(32, "kotlinx.coroutines.bufferedChannel.segmentSize", 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f3885c = n2.a.j(PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B1.g f3886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B1.g f3887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B1.g f3888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final B1.g f3889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final B1.g f3890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final B1.g f3891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final B1.g f3892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final B1.g f3893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final B1.g f3894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final B1.g f3895m;
    public static final B1.g n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final B1.g f3896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final B1.g f3897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final B1.g f3898q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final B1.g f3899r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final B1.g f3900s;

    static {
        int i3 = 18;
        f3886d = new B1.g("BUFFERED", i3);
        f3887e = new B1.g("SHOULD_BUFFER", i3);
        f3888f = new B1.g("S_RESUMING_BY_RCV", i3);
        f3889g = new B1.g("RESUMING_BY_EB", i3);
        f3890h = new B1.g("POISONED", i3);
        f3891i = new B1.g("DONE_RCV", i3);
        f3892j = new B1.g("INTERRUPTED_SEND", i3);
        f3893k = new B1.g("INTERRUPTED_RCV", i3);
        f3894l = new B1.g("CHANNEL_CLOSED", i3);
        f3895m = new B1.g("SUSPEND", i3);
        n = new B1.g("SUSPEND_NO_WAITER", i3);
        f3896o = new B1.g("FAILED", i3);
        f3897p = new B1.g("NO_RECEIVE_RESULT", i3);
        f3898q = new B1.g("CLOSE_HANDLER_CLOSED", i3);
        f3899r = new B1.g("CLOSE_HANDLER_INVOKED", i3);
        f3900s = new B1.g("NO_CLOSE_CAUSE", i3);
    }
}
