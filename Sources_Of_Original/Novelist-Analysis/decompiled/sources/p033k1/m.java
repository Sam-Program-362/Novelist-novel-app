package p033k1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3866b;

    public m(String str, List list) {
        this.f3865a = str;
        this.f3866b = list == null ? new ArrayList() : list;
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            bArr[i3] = (byte) ((Integer) list.get(i3)).intValue();
        }
        return bArr;
    }

    public final Object[] a() {
        ArrayList arrayList = new ArrayList();
        List list = this.f3866b;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(b(it2.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        String str = this.f3865a;
        if (str != null) {
            if (!str.equals(mVar.f3865a)) {
                return false;
            }
        } else if (mVar.f3865a != null) {
            return false;
        }
        List list = this.f3866b;
        int size = list.size();
        List list2 = mVar.f3866b;
        List list3 = mVar.f3866b;
        if (size != list2.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if ((list.get(i3) instanceof byte[]) && (list3.get(i3) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i3), (byte[]) list3.get(i3))) {
                    return false;
                }
            } else if (!list.get(i3).equals(list3.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f3865a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3865a);
        List list = this.f3866b;
        if (list == null || list.isEmpty()) {
            str = StringUtils.EMPTY;
        } else {
            str = StringUtils.SPACE + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
