package V0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends N0.a {
    public static final Parcelable.Creator<j> CREATOR = new F0.l(27);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f1524k;

    public j(ArrayList arrayList) {
        this.f1524k = arrayList;
    }

    public final JSONArray b() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f1524k;
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    k kVar = (k) list.get(i3);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) kVar.f1527m);
                    jSONArray2.put((int) kVar.f1526l);
                    jSONArray2.put((int) kVar.f1527m);
                    jSONArray.put(i3, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e3) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e3);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        List list2 = this.f1524k;
        if (list2 == null && jVar.f1524k == null) {
            return true;
        }
        return list2 != null && (list = jVar.f1524k) != null && list2.containsAll(list) && jVar.f1524k.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.f1524k;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.N(parcel, 1, this.f1524k);
        H2.h.R(parcel, iQ);
    }
}
