package V0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public final class a extends N0.a {
    public static final Parcelable.Creator<a> CREATOR = new F0.l(29);

    /* renamed from: k, reason: collision with root package name */
    public final j f1491k;

    /* renamed from: l, reason: collision with root package name */
    public final m f1492l;

    /* renamed from: m, reason: collision with root package name */
    public final b f1493m;
    public final n n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1494o;

    public a(j jVar, m mVar, b bVar, n nVar, String str) {
        this.f1491k = jVar;
        this.f1492l = mVar;
        this.f1493m = bVar;
        this.n = nVar;
        this.f1494o = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            b bVar = this.f1493m;
            if (bVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", bVar.f1495k);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e3) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e3);
                }
            }
            j jVar = this.f1491k;
            if (jVar != null) {
                jSONObject.put("uvm", jVar.b());
            }
            n nVar = this.n;
            if (nVar != null) {
                jSONObject.put("prf", nVar.b());
            }
            String str = this.f1494o;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e4) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e4);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.i(this.f1491k, aVar.f1491k) && r.i(this.f1492l, aVar.f1492l) && r.i(this.f1493m, aVar.f1493m) && r.i(this.n, aVar.n) && r.i(this.f1494o, aVar.f1494o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1491k, this.f1492l, this.f1493m, this.n, this.f1494o});
    }

    public final String toString() {
        return AbstractC0468a.b("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.J(parcel, 1, this.f1491k, i3);
        H2.h.J(parcel, 2, this.f1492l, i3);
        H2.h.J(parcel, 3, this.f1493m, i3);
        H2.h.J(parcel, 4, this.n, i3);
        H2.h.K(parcel, 5, this.f1494o);
        H2.h.R(parcel, Q2);
    }
}
