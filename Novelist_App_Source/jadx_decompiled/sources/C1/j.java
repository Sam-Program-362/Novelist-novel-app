package C1;

import a.AbstractC0102a;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final j f175a = new j();

    @Override // C1.l
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object S = AbstractC0102a.S(obj);
        if (S instanceof String) {
            s sVar = s.f182b;
            String quote = JSONObject.quote((String) S);
            sVar.getClass();
            return s.d(quote);
        }
        s sVar2 = s.f182b;
        String obj2 = S.toString();
        sVar2.getClass();
        return s.d(obj2);
    }

    @Override // C1.l
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            s.f182b.getClass();
            JSONTokener jSONTokener = new JSONTokener(s.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }
}
