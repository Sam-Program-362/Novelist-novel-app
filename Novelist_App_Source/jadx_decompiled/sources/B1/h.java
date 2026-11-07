package B1;

import org.apache.tika.mime.MimeTypes;
import t.AbstractC0468a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: k, reason: collision with root package name */
    public static final h f91k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ h[] f92l;

    static {
        h hVar = new h("PLAIN_TEXT", 0);
        f91k = hVar;
        f92l = new h[]{hVar};
    }

    public static h a(String str) {
        for (h hVar : values()) {
            hVar.getClass();
            if (MimeTypes.PLAIN_TEXT.equals(str)) {
                return hVar;
            }
        }
        throw new NoSuchFieldException(AbstractC0468a.a("No such ClipboardContentFormat: ", str));
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f92l.clone();
    }
}
