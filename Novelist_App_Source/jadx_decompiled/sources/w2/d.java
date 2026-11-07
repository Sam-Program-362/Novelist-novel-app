package w2;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class d extends c {
    private final Serializable tag;

    public d(InputStream inputStream) {
        super(inputStream);
        this.tag = UUID.randomUUID();
    }

    @Override // w2.c
    public void handleIOException(IOException iOException) {
        throw new s2.e(iOException, this.tag);
    }

    public boolean isCauseOf(Throwable th) {
        Serializable serializable = this.tag;
        int i3 = s2.e.f4537l;
        return serializable != null && (th instanceof s2.e) && serializable.equals(((s2.e) th).f4538k);
    }

    public void throwIfCauseOf(Throwable th) {
        Serializable serializable = this.tag;
        int i3 = s2.e.f4537l;
        if (serializable != null && (th instanceof s2.e) && serializable.equals(((s2.e) th).f4538k)) {
            throw ((s2.e) th).getCause();
        }
    }
}
