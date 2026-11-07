package X;

import androidx.datastore.preferences.protobuf.AbstractC0122t;
import androidx.datastore.preferences.protobuf.AbstractC0124v;
import androidx.datastore.preferences.protobuf.C0110g;
import androidx.datastore.preferences.protobuf.C0123u;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.U;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class k extends AbstractC0124v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Q PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        AbstractC0124v.j(k.class, kVar);
    }

    public static i D() {
        return (i) ((AbstractC0122t) DEFAULT_INSTANCE.c(5));
    }

    public static void l(k kVar, long j3) {
        kVar.valueCase_ = 4;
        kVar.value_ = Long.valueOf(j3);
    }

    public static void m(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void n(k kVar, h hVar) {
        kVar.getClass();
        kVar.value_ = hVar;
        kVar.valueCase_ = 6;
    }

    public static void o(k kVar, double d3) {
        kVar.valueCase_ = 7;
        kVar.value_ = Double.valueOf(d3);
    }

    public static void p(k kVar, C0110g c0110g) {
        kVar.getClass();
        kVar.valueCase_ = 8;
        kVar.value_ = c0110g;
    }

    public static void q(k kVar, boolean z3) {
        kVar.valueCase_ = 1;
        kVar.value_ = Boolean.valueOf(z3);
    }

    public static void r(k kVar, float f3) {
        kVar.valueCase_ = 2;
        kVar.value_ = Float.valueOf(f3);
    }

    public static void s(k kVar, int i3) {
        kVar.valueCase_ = 3;
        kVar.value_ = Integer.valueOf(i3);
    }

    public static k v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : StringUtils.EMPTY;
    }

    public final h B() {
        return this.valueCase_ == 6 ? (h) this.value_ : h.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0124v
    public final Object c(int i3) {
        Q q3;
        switch (j.a(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new U(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", h.class});
            case 3:
                return new k();
            case 4:
                return new i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q4 = PARSER;
                if (q4 != null) {
                    return q4;
                }
                synchronized (k.class) {
                    try {
                        q3 = PARSER;
                        if (q3 == null) {
                            q3 = new C0123u();
                            PARSER = q3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return q3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0110g u() {
        return this.valueCase_ == 8 ? (C0110g) this.value_ : C0110g.f2044m;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
