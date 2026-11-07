package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public enum A {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, StringUtils.EMPTY),
    BYTE_STRING(C0108g.class, C0108g.f2044m),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f1968k;

    A(Class cls, Serializable serializable) {
        this.f1968k = serializable;
    }
}
