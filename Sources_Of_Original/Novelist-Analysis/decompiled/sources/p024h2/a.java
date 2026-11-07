package p024h2;

import a2.h;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2904a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        h.d(charsetForName, "forName(...)");
        f2904a = charsetForName;
        h.d(Charset.forName("UTF-16"), "forName(...)");
        h.d(Charset.forName("UTF-16BE"), "forName(...)");
        h.d(Charset.forName("UTF-16LE"), "forName(...)");
        h.d(Charset.forName("US-ASCII"), "forName(...)");
        h.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
