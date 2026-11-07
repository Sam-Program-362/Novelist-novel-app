package Y;

import Z1.l;
import a2.i;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends i implements l {

    /* renamed from: l, reason: collision with root package name */
    public static final a f1566l = new a(1);

    @Override // Z1.l
    public final Object f(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        a2.h.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            a2.h.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i3 = 0;
            for (byte b3 : bArr) {
                i3++;
                if (i3 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b3));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f1572a + " = " + valueOf;
    }
}
