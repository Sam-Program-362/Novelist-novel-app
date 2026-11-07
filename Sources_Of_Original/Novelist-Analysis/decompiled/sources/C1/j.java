package C1;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f175a = new j();

    @Override // C1.l
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objS = p000a.a.S(obj);
        if (objS instanceof String) {
            s sVar = s.f182b;
            String strQuote = JSONObject.quote((String) objS);
            sVar.getClass();
            return s.d(strQuote);
        }
        s sVar2 = s.f182b;
        String string = objS.toString();
        sVar2.getClass();
        return s.d(string);
    }

    @Override // C1.l
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            s.f182b.getClass();
            JSONTokener jSONTokener = new JSONTokener(s.c(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }
}
