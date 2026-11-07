package h2;

import java.nio.charset.Charset;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0270a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2904a;

    static {
        Charset forName = Charset.forName("UTF-8");
        a2.h.d(forName, "forName(...)");
        f2904a = forName;
        a2.h.d(Charset.forName("UTF-16"), "forName(...)");
        a2.h.d(Charset.forName("UTF-16BE"), "forName(...)");
        a2.h.d(Charset.forName("UTF-16LE"), "forName(...)");
        a2.h.d(Charset.forName("US-ASCII"), "forName(...)");
        a2.h.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
