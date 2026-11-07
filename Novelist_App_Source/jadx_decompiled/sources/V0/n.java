package V0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import b1.C0185J;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public final class n extends N0.a {
    public static final Parcelable.Creator<n> CREATOR = new l(2);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1531k;

    /* renamed from: l, reason: collision with root package name */
    public final C0185J f1532l;

    public n(boolean z3, C0185J c0185j) {
        this.f1531k = z3;
        this.f1532l = c0185j;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f1531k) {
                jSONObject.put("enabled", true);
            }
            C0185J c0185j = this.f1532l;
            byte[] j3 = c0185j == null ? null : c0185j.j();
            if (j3 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(j3, 32), 11));
                if (j3.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(j3, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e3) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f1531k == nVar.f1531k && r.i(this.f1532l, nVar.f1532l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1531k), this.f1532l});
    }

    public final String toString() {
        return AbstractC0468a.b("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f1531k ? 1 : 0);
        C0185J c0185j = this.f1532l;
        H2.h.H(parcel, 2, c0185j == null ? null : c0185j.j());
        H2.h.R(parcel, Q2);
    }
}
