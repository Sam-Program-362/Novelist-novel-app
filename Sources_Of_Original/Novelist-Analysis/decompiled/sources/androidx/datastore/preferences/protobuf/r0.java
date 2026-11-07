package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public enum r0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(StringUtils.EMPTY),
    BYTE_STRING(C0108g.f2044m),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f2109k;

    r0(Serializable serializable) {
        this.f2109k = serializable;
    }
}
