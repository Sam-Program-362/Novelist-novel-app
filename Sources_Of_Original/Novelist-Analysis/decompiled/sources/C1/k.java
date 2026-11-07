package C1;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f176a = new k();

    @Override // C1.n
    public ByteBuffer a(Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(p000a.a.S(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objS = p000a.a.S(jSONArrayPut);
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

    @Override // C1.n
    public ByteBuffer b(String str, String str2) {
        JSONArray jSONArrayPut = new JSONArray().put("error").put(p000a.a.S(str)).put(JSONObject.NULL).put(p000a.a.S(str2));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objS = p000a.a.S(jSONArrayPut);
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

    @Override // C1.n
    public ByteBuffer c(String str, String str2, Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(str).put(p000a.a.S(str2)).put(p000a.a.S(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objS = p000a.a.S(jSONArrayPut);
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

    @Override // C1.n
    public A.c d(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        if (byteBuffer == null) {
            objNextValue = null;
        } else {
            try {
                try {
                    s.f182b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(s.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
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
        if (objNextValue instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) objNextValue;
            Object obj2 = jSONObject.get("method");
            Object objOpt = jSONObject.opt("args");
            if (objOpt != JSONObject.NULL) {
                obj = objOpt;
            }
            if (obj2 instanceof String) {
                return new A.c((String) obj2, obj, 11);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + objNextValue);
    }

    @Override // C1.n
    public Object e(ByteBuffer byteBuffer) {
        try {
            try {
                s.f182b.getClass();
                JSONTokener jSONTokener = new JSONTokener(s.c(byteBuffer));
                Object objNextValue = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
                if (objNextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objNextValue;
                    Object obj = null;
                    if (jSONArray.length() == 1) {
                        Object objOpt = jSONArray.opt(0);
                        if (objOpt == JSONObject.NULL) {
                            return null;
                        }
                        return objOpt;
                    }
                    if (jSONArray.length() == 3) {
                        Object obj2 = jSONArray.get(0);
                        Object objOpt2 = jSONArray.opt(1);
                        Object obj3 = JSONObject.NULL;
                        if (objOpt2 == obj3) {
                            objOpt2 = null;
                        }
                        Object objOpt3 = jSONArray.opt(2);
                        if (objOpt3 != obj3) {
                            obj = objOpt3;
                        }
                        if ((obj2 instanceof String) && (objOpt2 == null || (objOpt2 instanceof String))) {
                            throw new i((String) obj2, (String) objOpt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + objNextValue);
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
            jSONObject.put("args", p000a.a.S(cVar.f7m));
            Object objS = p000a.a.S(jSONObject);
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
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }
}
