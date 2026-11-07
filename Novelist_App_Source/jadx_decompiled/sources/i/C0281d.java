package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import j.j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f2944e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f2945f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2946a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2947b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2948c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2949d;

    static {
        Class[] clsArr = {Context.class};
        f2944e = clsArr;
        f2945f = clsArr;
    }

    public C0281d(Context context) {
        super(context);
        this.f2948c = context;
        Object[] objArr = {context};
        this.f2946a = objArr;
        this.f2947b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        if (r8 != null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0281d.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f2948c.getResources().getLayout(i3);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
