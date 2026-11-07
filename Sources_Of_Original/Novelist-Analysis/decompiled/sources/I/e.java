package I;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public e(CharSequence charSequence) {
        super(charSequence, "android.credentials.GetCredentialException.TYPE_UNKNOWN");
    }

    public e(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
