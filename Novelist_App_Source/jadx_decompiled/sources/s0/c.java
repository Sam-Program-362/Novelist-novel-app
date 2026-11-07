package s0;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class c implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f4467c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f4468a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4469b;

    public c(String str, String str2) {
        this.f4468a = str;
        this.f4469b = str2;
        f4467c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = AbstractC0463a.f4465a;
        String str = this.f4469b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
