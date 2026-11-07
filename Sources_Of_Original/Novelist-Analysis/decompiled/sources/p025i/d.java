package p025i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p013f.a;
import p028j.j;
import p031k.B;

/* JADX INFO: loaded from: classes.dex */
public final class d extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f2944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f2945f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f2946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f2947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2949d;

    static {
        Class[] clsArr = {Context.class};
        f2944e = clsArr;
        f2945f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f2948c = context;
        Object[] objArr = {context};
        this.f2946a = objArr;
        this.f2947b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x020b  */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        c cVar = new c(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i3 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = cVar.f2922a;
            if (eventType == i3) {
                if (!z4) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f2948c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2801m);
                        cVar.f2923b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        cVar.f2924c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        cVar.f2925d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        cVar.f2926e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        cVar.f2927f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        cVar.f2928g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.n);
                        cVar.f2930i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        cVar.f2931j = (typedArrayObtainStyledAttributes2.getInt(5, cVar.f2924c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, cVar.f2925d) & 65535);
                        cVar.f2932k = typedArrayObtainStyledAttributes2.getText(7);
                        cVar.f2933l = typedArrayObtainStyledAttributes2.getText(8);
                        cVar.f2934m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        cVar.n = string == null ? (char) 0 : string.charAt(0);
                        cVar.f2935o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        cVar.f2936p = string2 == null ? (char) 0 : string2.charAt(0);
                        cVar.f2937q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            cVar.f2938r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            cVar.f2938r = cVar.f2926e;
                        }
                        cVar.f2939s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        cVar.f2940t = typedArrayObtainStyledAttributes2.getBoolean(4, cVar.f2927f);
                        cVar.u = typedArrayObtainStyledAttributes2.getBoolean(1, cVar.f2928g);
                        cVar.f2941v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        cVar.y = typedArrayObtainStyledAttributes2.getString(12);
                        cVar.f2942w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        cVar.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z5 = string3 != null;
                        if (z5 && cVar.f2942w == 0 && cVar.x == null) {
                            if (cVar.a(string3, f2945f, this.f2947b) != null) {
                                throw new ClassCastException();
                            }
                        } else if (z5) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        cVar.f2943z = typedArrayObtainStyledAttributes2.getText(17);
                        cVar.f2918A = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            cVar.f2920C = B.c(typedArrayObtainStyledAttributes2.getInt(19, -1), cVar.f2920C);
                        } else {
                            cVar.f2920C = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            } else {
                                Object obj = p017g.a.f2826a;
                                colorStateList = context.getColorStateList(resourceId);
                                if (colorStateList == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                            }
                            cVar.f2919B = colorStateList;
                        } else {
                            cVar.f2919B = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        cVar.f2929h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        cVar.f2929h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(cVar.f2923b, cVar.f2930i, cVar.f2931j, cVar.f2932k);
                        cVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z4 = true;
                    }
                }
                z3 = z3;
            } else if (eventType != 3) {
                z3 = z3;
            } else {
                String name3 = xmlPullParser.getName();
                if (z4 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z4 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        cVar.f2923b = 0;
                        cVar.f2924c = 0;
                        cVar.f2925d = 0;
                        cVar.f2926e = 0;
                        cVar.f2927f = true;
                        cVar.f2928g = true;
                    } else if (name3.equals("item")) {
                        if (!cVar.f2929h) {
                            cVar.f2929h = true;
                            cVar.b(menu2.add(cVar.f2923b, cVar.f2930i, cVar.f2931j, cVar.f2932k));
                        }
                    } else if (name3.equals("menu")) {
                        z3 = true;
                    }
                    z3 = z3;
                }
            }
            eventType = xmlPullParser.next();
            i3 = 2;
            z3 = z3;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f2948c.getResources().getLayout(i3);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
