package C1;

import a.AbstractC0102a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final k f176a = new k();

    @Override // C1.n
    public ByteBuffer a(Object obj) {
        JSONArray put = new JSONArray().put(AbstractC0102a.S(obj));
        if (put == null) {
            return null;
        }
        Object S = AbstractC0102a.S(put);
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

    @Override // C1.n
    public ByteBuffer b(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(AbstractC0102a.S(str)).put(JSONObject.NULL).put(AbstractC0102a.S(str2));
        if (put == null) {
            return null;
        }
        Object S = AbstractC0102a.S(put);
        if (S instanceof String) {
            s sVar = s.f182b;
            String quote = JSONObject.quote((String) S);
            sVar.getClass();
            return s.d(quote);
        }
        s sVar2 = s.f182b;
        String obj = S.toString();
        sVar2.getClass();
        return s.d(obj);
    }

    @Override // C1.n
    public ByteBuffer c(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(AbstractC0102a.S(str2)).put(AbstractC0102a.S(obj));
        if (put == null) {
            return null;
        }
        Object S = AbstractC0102a.S(put);
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

    @Override // C1.n
    public A.c d(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    s.f182b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(s.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e3) {
                    throw new IllegalArgumentException("Invalid JSON", e3);
                }
            } catch (JSONException e4) {
                throw new IllegalArgumentException("Invalid JSON", e4);
            }
        }
        if (nextValue instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) nextValue;
            Object obj2 = jSONObject.get("method");
            Object opt = jSONObject.opt("args");
            if (opt != JSONObject.NULL) {
                obj = opt;
            }
            if (obj2 instanceof String) {
                return new A.c((String) obj2, obj, 11);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // C1.n
    public Object e(ByteBuffer byteBuffer) {
        try {
            try {
                s.f182b.getClass();
                JSONTokener jSONTokener = new JSONTokener(s.c(byteBuffer));
                Object nextValue = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
                if (nextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) nextValue;
                    Object obj = null;
                    if (jSONArray.length() == 1) {
                        Object opt = jSONArray.opt(0);
                        if (opt == JSONObject.NULL) {
                            return null;
                        }
                        return opt;
                    }
                    if (jSONArray.length() == 3) {
                        Object obj2 = jSONArray.get(0);
                        Object opt2 = jSONArray.opt(1);
                        Object obj3 = JSONObject.NULL;
                        if (opt2 == obj3) {
                            opt2 = null;
                        }
                        Object opt3 = jSONArray.opt(2);
                        if (opt3 != obj3) {
                            obj = opt3;
                        }
                        if ((obj2 instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                            throw new i((String) obj2, (String) opt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + nextValue);
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // C1.n
    public ByteBuffer f(A.c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) cVar.f6l);
            jSONObject.put("args", AbstractC0102a.S(cVar.f7m));
            Object S = AbstractC0102a.S(jSONObject);
            if (S instanceof String) {
                s sVar = s.f182b;
                String quote = JSONObject.quote((String) S);
                sVar.getClass();
                return s.d(quote);
            }
            s sVar2 = s.f182b;
            String obj = S.toString();
            sVar2.getClass();
            return s.d(obj);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }
}
