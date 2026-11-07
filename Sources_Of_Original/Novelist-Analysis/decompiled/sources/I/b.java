package I;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
        a2.h.e(str, "type");
    }
}
