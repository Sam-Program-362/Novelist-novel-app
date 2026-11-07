package I;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Exception {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f466k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
        a2.h.e(str, "type");
    }
}
