package K;

import I.f;
import a2.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f632l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f633m = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(J.a aVar, String str) {
        String strConcat = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(aVar.f537a);
        h.e(strConcat, "type");
        super(str, strConcat);
        if (strConcat.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
