package K0;

import com.google.android.gms.common.api.Status;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class e extends Exception {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Status f635k;

    public e(Status status) {
        int i3 = status.f2726k;
        String str = status.f2727l;
        str = str == null ? StringUtils.EMPTY : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 2 + String.valueOf(str).length());
        sb.append(i3);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f635k = status;
    }
}
