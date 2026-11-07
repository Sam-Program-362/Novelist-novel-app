package t2;

import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.util.function.IntUnaryOperator;

/* loaded from: classes.dex */
public abstract class d extends b {
    static {
        OpenOption[] openOptionArr = u2.a.f4606a;
    }

    public d() {
        super(23);
        Charset.defaultCharset();
        Charset.defaultCharset();
        new IntUnaryOperator() { // from class: t2.c
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                d.this.getClass();
                if (i3 <= Integer.MAX_VALUE) {
                    return i3;
                }
                throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i3), Integer.MAX_VALUE));
            }
        };
    }
}
